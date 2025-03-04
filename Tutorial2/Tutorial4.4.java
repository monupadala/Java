public class University {

    public static class Library {
        private String libraryName;

        public Library(String libraryName) {
            this.libraryName = libraryName;
        }

        public void displayLibraryName() {
            System.out.println("Library Name: " + libraryName);
        }
    }

    public class Department {
        private String departmentName;

        public Department(String departmentName) {
            this.departmentName = departmentName;
        }

        public void displayDepartmentName() {
            System.out.println("Department Name: " + departmentName);
        }
    }

    public static void main(String[] args) {
        University university = new University();

        University.Library library = new University.Library("Central Library");
        library.displayLibraryName();

        University.Department department = university.new Department("Computer Science");
        department.displayDepartmentName();
    }
}
