package pg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
public final class w1 {
    public v1 f41400a;
    public final HashMap f41401b = new HashMap();
    public final ArrayList f41402c = new ArrayList();

    public final boolean a() {
        return !this.f41402c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f41401b.put(uuid, runnable);
        this.f41402c.add(uuid);
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(this, 13));
    }

    public final void c() {
        ArrayList arrayList = this.f41402c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f41401b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(this, 13));
    }
}
