package io.laurakirby.todoandroid;

/**
 * Created by laurakirby on 6/29/16.
 */
public class ListItem {
    String taskTitle;
    String taskDescription;

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public ListItem(String taskTitle, String taskDescription) {
        super();
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
    }
}
