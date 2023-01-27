package utilities;

import io.cucumber.datatable.DataTable;

import java.util.ArrayList;

public class DataTableHelper {

    public void enterContactFormDetails(DataTable dataTable) {
        for (int i = 0; i < dataTable.height(); i++) {
            String firstName = dataTable.row(i).get(0);
            String emailAddress = dataTable.row(i).get(1);
            String phoneNumber = dataTable.row(i).get(2);
            String comment = dataTable.row(i).get(3);
            printMyValues(firstName, emailAddress, phoneNumber, comment);
        }
    }

    public ArrayList<Commenter> mapDataTableToArrayOfCommenters(DataTable dataTable) {

        enterContactFormDetails(dataTable);

        ArrayList<Commenter> myCommentersList = new ArrayList<Commenter>();

        for (int i = 0; i < dataTable.height(); i++) {
            String firstName = dataTable.row(i).get(0);
            String emailAddress = dataTable.row(i).get(1);
            String phoneNumber = dataTable.row(i).get(2);
            String comment = dataTable.row(i).get(3);

            Commenter mCommenter = new Commenter(firstName, emailAddress, phoneNumber, comment);
            myCommentersList.add(mCommenter);

        }
        for (Commenter commenter : myCommentersList) {
            printMyValues(commenter.getFirstName(), commenter.getEmailAddress(), commenter.getPhoneNumber(), commenter.getComment());
        }
        return myCommentersList;
    }
    public void printMyValues(String firstName, String emailAddress, String phoneNumber, String comment){
        System.out.println("FirstName:" + firstName + "EmailAddress:" + emailAddress + "PhoneNumber:" + phoneNumber + "Comment:" + comment);
    }
}