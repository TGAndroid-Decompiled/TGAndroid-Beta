package zf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.f8;
import org.telegram.messenger.is;
public final class j1 implements Runnable {
    public final int f55560a;
    public final m1 f55561b;

    public j1(m1 m1Var, int i10) {
        this.f55560a = i10;
        this.f55561b = m1Var;
    }

    @Override
    public final void run() {
        switch (this.f55560a) {
            case 0:
                try {
                    is.a0(this.f55561b.f55602m).f16333b.executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            default:
                m1 m1Var = this.f55561b;
                try {
                    SQLiteCursor queryFinalized = is.a0(m1Var.f55602m).f16333b.queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f55574a = queryFinalized.stringValue(0);
                        obj.f55575b = queryFinalized.intValue(1);
                        arrayList.add(obj);
                        hashMap.put(obj.f55574a, obj);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new x2.e(11));
                    org.telegram.messenger.i0.g3(new k0(m1Var, arrayList, hashMap, 1));
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
        }
    }
}
