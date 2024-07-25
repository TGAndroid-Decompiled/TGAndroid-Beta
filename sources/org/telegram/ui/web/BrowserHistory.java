package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.web.WebMetadataCache;
public class BrowserHistory {
    private static ArrayList<Entry> history;
    private static LongSparseArray<Entry> historyById;

    public static class Entry extends TLObject {
        public long id;
        public WebMetadataCache.WebMetadata meta;
        public long time;
        public String url;

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt64(this.id);
            abstractSerializedData.writeInt64(this.time);
            String str = this.url;
            if (str == null) {
                str = "";
            }
            abstractSerializedData.writeString(str);
            this.meta.serializeToStream(abstractSerializedData);
        }

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            this.id = abstractSerializedData.readInt64(z);
            this.time = abstractSerializedData.readInt64(z);
            this.url = abstractSerializedData.readString(z);
            WebMetadataCache.WebMetadata webMetadata = new WebMetadataCache.WebMetadata();
            this.meta = webMetadata;
            webMetadata.readParams(abstractSerializedData, z);
        }
    }

    public static File getHistoryFile() {
        return new File(FileLoader.getDirectory(4), "webhistory.dat");
    }

    public static ArrayList<Entry> getHistory() {
        File historyFile;
        ArrayList<Entry> arrayList = history;
        if (arrayList != null) {
            return arrayList;
        }
        try {
            history = new ArrayList<>();
            historyById = new LongSparseArray<>();
            historyFile = getHistoryFile();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (!historyFile.exists()) {
            return history;
        }
        SerializedData serializedData = new SerializedData(historyFile);
        long readInt64 = serializedData.readInt64(true);
        for (long j = 0; j < readInt64; j++) {
            Entry entry = new Entry();
            entry.readParams(serializedData, true);
            history.add(entry);
            historyById.put(entry.id, entry);
        }
        return history;
    }

    public static void pushHistory(Entry entry) {
        if (entry == null || entry.meta == null) {
            return;
        }
        getHistory();
        Entry entry2 = historyById.get(entry.id);
        if (entry2 != null) {
            entry2.meta = entry.meta;
        } else {
            history.add(entry);
            historyById.put(entry.id, entry);
        }
        scheduleHistorySave();
    }

    private static void scheduleHistorySave() {
        AndroidUtilities.cancelRunOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BrowserHistory.saveHistory();
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BrowserHistory.saveHistory();
            }
        }, 1000L);
    }

    public static void saveHistory() {
        try {
            File historyFile = getHistoryFile();
            if (!historyFile.exists()) {
                historyFile.createNewFile();
            }
            long size = history.size();
            SerializedData serializedData = new SerializedData(true);
            serializedData.writeInt64(size);
            Iterator<Entry> it = history.iterator();
            while (it.hasNext()) {
                it.next().serializeToStream(serializedData);
            }
            SerializedData serializedData2 = new SerializedData(serializedData.length());
            serializedData2.writeInt64(size);
            Iterator<Entry> it2 = history.iterator();
            while (it2.hasNext()) {
                it2.next().serializeToStream(serializedData2);
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(historyFile);
                fileOutputStream.write(serializedData2.toByteArray());
                fileOutputStream.close();
            } catch (Exception e) {
                FileLog.e(e);
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public static void clearHistory() {
        try {
            history.clear();
            historyById.clear();
            File historyFile = getHistoryFile();
            if (historyFile.exists()) {
                historyFile.delete();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
