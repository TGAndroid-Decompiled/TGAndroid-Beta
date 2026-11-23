package sg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
public final class k1 {
    public j1 f57316a;
    public final HashMap f57317b = new HashMap();
    public final ArrayList f57318c = new ArrayList();

    public final boolean a() {
        return !this.f57318c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f57317b.put(uuid, runnable);
        this.f57318c.add(uuid);
        org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(this, 14));
    }

    public final void c() {
        ArrayList arrayList = this.f57318c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f57317b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(this, 14));
    }
}
