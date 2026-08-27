package yf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;

public final class s1 {

    public r1 f50076a;

    public final HashMap f50077b = new HashMap();

    public final ArrayList f50078c = new ArrayList();

    public final boolean a() {
        return !this.f50078c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f50077b.put(uuid, runnable);
        this.f50078c.add(uuid);
        AndroidUtilities.runOnUIThread(new qf.b(this, 22));
    }

    public final void c() {
        ArrayList arrayList = this.f50078c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap map = this.f50077b;
        Runnable runnable = (Runnable) map.get(uuid);
        map.remove(uuid);
        arrayList.remove(size);
        runnable.run();
        AndroidUtilities.runOnUIThread(new qf.b(this, 22));
    }
}
