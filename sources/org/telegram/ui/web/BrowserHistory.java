package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;

public abstract class BrowserHistory {
    private static ArrayList callbacks;
    private static ArrayList history;
    private static LongSparseArray historyById;
    public static boolean historyLoaded;
    public static boolean historyLoading;

    public static class Entry extends TLObject {
        public long id;
        public WebMetadataCache.WebMetadata meta;
        public long time;
        public String url;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt64(this.id);
            outputSerializedData.writeInt64(this.time);
            String str = this.url;
            if (str == null) {
                str = "";
            }
            outputSerializedData.writeString(str);
            this.meta.serializeToStream(outputSerializedData);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.id = inputSerializedData.readInt64(z);
            this.time = inputSerializedData.readInt64(z);
            this.url = inputSerializedData.readString(z);
            WebMetadataCache.WebMetadata webMetadata = new WebMetadataCache.WebMetadata();
            this.meta = webMetadata;
            webMetadata.readParams(inputSerializedData, z);
        }
    }

    public static File getHistoryFile() {
        return new File(FileLoader.getDirectory(4), "webhistory.dat");
    }

    public static void preloadHistory() {
        if (historyLoading || historyLoaded) {
            return;
        }
        historyLoading = true;
        history = new ArrayList();
        historyById = new LongSparseArray();
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                BrowserHistory.m5070$r8$lambda$XLggRB9xRVBOZxQbci8KT9Gp2I();
            }
        });
    }

    public static void m5070$r8$lambda$XLggRB9xRVBOZxQbci8KT9Gp2I() {
        final ArrayList arrayList = new ArrayList();
        final LongSparseArray longSparseArray = new LongSparseArray();
        try {
            File historyFile = getHistoryFile();
            if (historyFile.exists()) {
                SerializedData serializedData = new SerializedData(historyFile);
                long int64 = serializedData.readInt64(true);
                for (long j = 0; j < int64; j++) {
                    Entry entry = new Entry();
                    entry.readParams(serializedData, true);
                    arrayList.add(entry);
                    longSparseArray.put(entry.id, entry);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BrowserHistory.$r8$lambda$t5XNsDGR4uk9GQQTvfDDerHU1uc(arrayList, longSparseArray);
            }
        });
    }

    public static void $r8$lambda$t5XNsDGR4uk9GQQTvfDDerHU1uc(ArrayList arrayList, LongSparseArray longSparseArray) {
        int i = 0;
        history.addAll(0, arrayList);
        for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
            historyById.put(longSparseArray.keyAt(i2), (Entry) longSparseArray.valueAt(i2));
        }
        historyLoaded = true;
        historyLoading = false;
        ArrayList arrayList2 = callbacks;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((Utilities.Callback) obj).run(arrayList);
            }
            callbacks = null;
        }
    }

    public static ArrayList getHistory() {
        return getHistory(null);
    }

    public static ArrayList getHistory(Utilities.Callback callback) {
        boolean z;
        if (callback == null || historyLoaded) {
            z = false;
        } else {
            if (callbacks == null) {
                callbacks = new ArrayList();
            }
            callbacks.add(callback);
            z = true;
        }
        preloadHistory();
        if (z) {
            return null;
        }
        return history;
    }

    public static void pushHistory(Entry entry) {
        if (entry == null || entry.meta == null) {
            return;
        }
        preloadHistory();
        Entry entry2 = (Entry) historyById.get(entry.id);
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
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                BrowserHistory.$r8$lambda$dRU362fkhJ4Ahr_Zn4AAc3sHuCE();
            }
        });
    }

    public static void $r8$lambda$dRU362fkhJ4Ahr_Zn4AAc3sHuCE() {
        try {
            File historyFile = getHistoryFile();
            if (!historyFile.exists()) {
                historyFile.createNewFile();
            }
            long size = history.size();
            SerializedData serializedData = new SerializedData(true);
            serializedData.writeInt64(size);
            ArrayList arrayList = history;
            int size2 = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size2) {
                Object obj = arrayList.get(i2);
                i2++;
                ((Entry) obj).serializeToStream(serializedData);
            }
            SerializedData serializedData2 = new SerializedData(serializedData.length());
            serializedData2.writeInt64(size);
            ArrayList arrayList2 = history;
            int size3 = arrayList2.size();
            while (i < size3) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((Entry) obj2).serializeToStream(serializedData2);
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
