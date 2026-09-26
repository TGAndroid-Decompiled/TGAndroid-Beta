package pg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
public final class w1 {
    public v1 f41300a;
    public final HashMap f41301b = new HashMap();
    public final ArrayList f41302c = new ArrayList();

    public final boolean a() {
        return !this.f41302c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f41301b.put(uuid, runnable);
        this.f41302c.add(uuid);
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(this, 13));
    }

    public final void c() {
        ArrayList arrayList = this.f41302c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f41301b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(this, 13));
    }
}
