import java.util.List;

public class FinalExam extends Test{
    private String projectTitle;
    private String projectInfo;
    public FinalExam(String title, List<Question> questions, String projectTitle, String projectInfo, String projectDescription) {
        super(title, 1, questions);
        this.projectTitle = projectTitle;
        this.projectInfo = projectInfo;
    }

    public void setProjectInfo(String projectInfo) {
        this.projectInfo = projectInfo;
    }

    public String getProjectInfo() {
        return projectInfo;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Project Title: " + projectTitle);
        System.out.println("Project Info: " + projectInfo);
    }
}
