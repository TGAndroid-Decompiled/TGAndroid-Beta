package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

public abstract class BrowserHistory {
    public static ArrayList callbacks;
    public static ArrayList history;
    public static LongSparseArray historyById;
    public static boolean historyLoaded;
    public static boolean historyLoading;

    public final class Entry extends TLObject {
        public long id;
        public WebMetadataCache.WebMetadata meta;
        public long time;
        public String url;

        @Override
        public final void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.id = inputSerializedData.readInt64(z);
            this.time = inputSerializedData.readInt64(z);
            this.url = inputSerializedData.readString(z);
            WebMetadataCache.WebMetadata webMetadata = new WebMetadataCache.WebMetadata();
            this.meta = webMetadata;
            webMetadata.readParams(inputSerializedData, z);
        }

        @Override
        public final void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt64(this.id);
            outputSerializedData.writeInt64(this.time);
            String str = this.url;
            if (str == null) {
                str = "";
            }
            outputSerializedData.writeString(str);
            this.meta.serializeToStream(outputSerializedData);
        }
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

    public static void preloadHistory() {
        if (historyLoading || historyLoaded) {
            return;
        }
        historyLoading = true;
        history = new ArrayList();
        historyById = new LongSparseArray();
        Utilities.globalQueue.postRunnable(new BrowserHistory$$ExternalSyntheticLambda0(1));
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
        AndroidUtilities.cancelRunOnUIThread(new BrowserHistory$$ExternalSyntheticLambda0(0));
        AndroidUtilities.runOnUIThread(new BrowserHistory$$ExternalSyntheticLambda0(0), 1000L);
    }
}
