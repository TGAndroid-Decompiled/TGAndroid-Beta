package tf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.Components.m71;
import org.telegram.ui.eu;
public final class g1 implements Runnable {
    public final int f44791a;
    public final j1 f44792b;

    public g1(j1 j1Var, int i10) {
        this.f44791a = i10;
        this.f44792b = j1Var;
    }

    @Override
    public final void run() {
        switch (this.f44791a) {
            case 0:
                j1 j1Var = this.f44792b;
                j1Var.getClass();
                try {
                    MessagesStorage.getInstance(j1Var.f44828m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                j1 j1Var2 = this.f44792b;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(j1Var2.f44828m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f44805a = queryFinalized.stringValue(0);
                        obj.f44806b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f44805a, obj);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new eu(21));
                    AndroidUtilities.runOnUIThread(new m71(j1Var2, arrayList, hashMap, 29));
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }
}
