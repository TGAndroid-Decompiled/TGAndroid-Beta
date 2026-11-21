package sg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
public final class k1 {
    public j1 f57312a;
    public final HashMap f57313b = new HashMap();
    public final ArrayList f57314c = new ArrayList();

    public final boolean a() {
        return !this.f57314c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f57313b.put(uuid, runnable);
        this.f57314c.add(uuid);
        org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(this, 14));
    }

    public final void c() {
        ArrayList arrayList = this.f57314c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f57313b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(this, 14));
    }
}
