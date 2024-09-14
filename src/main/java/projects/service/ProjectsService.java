package projects.service;

import java.util.List;
import java.util.NoSuchElementException;
import projects.dao.ProjectsDao;
import projects.entity.Project;

public class ProjectsService {
	private ProjectsDao projectDao = new ProjectsDao();
	
public Project addProjects(Project project) {
	return projectDao.insertProject(project);
}

public List<Project> fetchAllProjects() {
	return projectDao.fetchAllProjects();
}
public Project fetchProjectById(Integer projectId) {
	
	return projectDao.fetchProjectById(projectId)
			.orElseThrow(() -> new NoSuchElementException(
			"Project with project ID-" + projectId + " does not exist."));
}

}




 


