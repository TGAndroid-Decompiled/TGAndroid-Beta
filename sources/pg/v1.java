package pg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
public final class v1 {
    public u1 f41321a;
    public final HashMap f41322b = new HashMap();
    public final ArrayList f41323c = new ArrayList();

    public final boolean a() {
        return !this.f41323c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f41322b.put(uuid, runnable);
        this.f41323c.add(uuid);
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.r0(this, 13));
    }

    public final void c() {
        ArrayList arrayList = this.f41323c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f41322b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.r0(this, 13));
    }
}
