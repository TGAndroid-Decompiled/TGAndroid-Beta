package uf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.du;
public final class g1 implements Runnable {
    public final int f48575a;
    public final k1 f48576b;

    public g1(k1 k1Var, int i10) {
        this.f48575a = i10;
        this.f48576b = k1Var;
    }

    @Override
    public final void run() {
        switch (this.f48575a) {
            case 0:
                k1 k1Var = this.f48576b;
                k1Var.getClass();
                try {
                    MessagesStorage.getInstance(k1Var.f48628m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                k1 k1Var2 = this.f48576b;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(k1Var2.f48628m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f48603a = queryFinalized.stringValue(0);
                        obj.f48604b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f48603a, obj);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new du(21));
                    AndroidUtilities.runOnUIThread(new h1(k1Var2, arrayList, hashMap, 0));
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
