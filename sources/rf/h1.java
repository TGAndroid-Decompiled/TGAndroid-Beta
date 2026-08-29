package rf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.yw0;
public final class h1 implements Runnable {
    public final int f47248a;
    public final k1 f47249b;

    public h1(k1 k1Var, int i10) {
        this.f47248a = i10;
        this.f47249b = k1Var;
    }

    @Override
    public final void run() {
        switch (this.f47248a) {
            case 0:
                k1 k1Var = this.f47249b;
                k1Var.getClass();
                try {
                    MessagesStorage.getInstance(k1Var.f47287m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                k1 k1Var2 = this.f47249b;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(k1Var2.f47287m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f47262a = queryFinalized.stringValue(0);
                        obj.f47263b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f47262a, obj);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new wp0(21));
                    AndroidUtilities.runOnUIThread(new yw0(k1Var2, arrayList, hashMap, 28));
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
