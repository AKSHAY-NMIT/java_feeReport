import java.util.ArrayList;
import java.util.List;

public class FeeReport {
    private List<FeeRecord> feeRecords;

    public FeeReport() {
        feeRecords = new ArrayList<>();
    }

    public void addFeeRecord(FeeRecord feeRecord) {
        feeRecords.add(feeRecord);
    }

    public List<FeeRecord> getFeeRecords() {
        return feeRecords;
    }
}

