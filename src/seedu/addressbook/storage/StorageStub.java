package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

/**
 * Storage stub class that does nothing for save
 * @author Abel
 *
 */
public class StorageStub extends Storage {
    private String filePath;
    
    public StorageStub(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {        
    }

    @Override
    public AddressBook load() throws StorageOperationException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getPath() {
        return filePath;
    }

}
