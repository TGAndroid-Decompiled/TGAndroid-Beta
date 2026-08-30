package tf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.cu;
public final class g1 implements Runnable {
    public final int f44729a;
    public final k1 f44730b;

    public g1(k1 k1Var, int i10) {
        this.f44729a = i10;
        this.f44730b = k1Var;
    }

    @Override
    public final void run() {
        switch (this.f44729a) {
            case 0:
                k1 k1Var = this.f44730b;
                k1Var.getClass();
                try {
                    MessagesStorage.getInstance(k1Var.f44778m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                k1 k1Var2 = this.f44730b;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(k1Var2.f44778m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f44755a = queryFinalized.stringValue(0);
                        obj.f44756b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f44755a, obj);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new cu(21));
                    AndroidUtilities.runOnUIThread(new h1(k1Var2, arrayList, hashMap, 0));
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }
}
