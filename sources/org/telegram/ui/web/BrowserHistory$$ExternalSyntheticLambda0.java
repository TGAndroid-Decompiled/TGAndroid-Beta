package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;

public final class BrowserHistory$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;

    public BrowserHistory$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Utilities.globalQueue.postRunnable(new BrowserHistory$$ExternalSyntheticLambda0(2));
                break;
            case 1:
                ArrayList arrayList = new ArrayList();
                LongSparseArray longSparseArray = new LongSparseArray();
                try {
                    File file = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (file.exists()) {
                        SerializedData serializedData = new SerializedData(file);
                        long int64 = serializedData.readInt64(true);
                        for (long j = 0; j < int64; j++) {
                            BrowserHistory.Entry entry = new BrowserHistory.Entry();
                            entry.readParams(serializedData, true);
                            arrayList.add(entry);
                            longSparseArray.put(entry.id, entry);
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new WebActionBar$$ExternalSyntheticLambda0(2, arrayList, longSparseArray));
                break;
            default:
                try {
                    File file2 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    long size = BrowserHistory.history.size();
                    SerializedData serializedData2 = new SerializedData(true);
                    serializedData2.writeInt64(size);
                    ArrayList arrayList2 = BrowserHistory.history;
                    int size2 = arrayList2.size();
                    int i = 0;
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        ((BrowserHistory.Entry) obj).serializeToStream(serializedData2);
                    }
                    SerializedData serializedData3 = new SerializedData(serializedData2.length());
                    serializedData3.writeInt64(size);
                    ArrayList arrayList3 = BrowserHistory.history;
                    int size3 = arrayList3.size();
                    while (i < size3) {
                        Object obj2 = arrayList3.get(i);
                        i++;
                        ((BrowserHistory.Entry) obj2).serializeToStream(serializedData3);
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        fileOutputStream.write(serializedData3.toByteArray());
                        fileOutputStream.close();
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        return;
                    }
                } catch (Exception e3) {
                    FileLog.e(e3);
                    return;
                }
                break;
        }
    }
}
