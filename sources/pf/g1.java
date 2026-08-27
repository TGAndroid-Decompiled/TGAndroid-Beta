package pf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.lp0;

public final class g1 implements Runnable {

    public final int f45807a;

    public final j1 f45808b;

    public g1(j1 j1Var, int i10) {
        this.f45807a = i10;
        this.f45808b = j1Var;
    }

    @Override
    public final void run() {
        switch (this.f45807a) {
            case 0:
                j1 j1Var = this.f45808b;
                j1Var.getClass();
                try {
                    MessagesStorage.getInstance(j1Var.f45846m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            default:
                j1 j1Var2 = this.f45808b;
                try {
                    SQLiteCursor sQLiteCursorQueryFinalized = MessagesStorage.getInstance(j1Var2.f45846m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap map = new HashMap();
                    while (sQLiteCursorQueryFinalized.next()) {
                        h1 h1Var = new h1();
                        h1Var.f45821a = sQLiteCursorQueryFinalized.stringValue(0);
                        h1Var.f45822b = sQLiteCursorQueryFinalized.intValue(1);
                        arrayList.add(h1Var);
                        map.put(h1Var.f45821a, h1Var);
                    }
                    sQLiteCursorQueryFinalized.dispose();
                    Collections.sort(arrayList, new lp0(21));
                    AndroidUtilities.runOnUIThread(new gs0(j1Var2, arrayList, map, 28));
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                break;
        }
    }
}
