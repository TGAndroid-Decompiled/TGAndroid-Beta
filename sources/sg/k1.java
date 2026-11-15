package sg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
public final class k1 {
    public j1 f56697a;
    public final HashMap f56698b = new HashMap();
    public final ArrayList f56699c = new ArrayList();

    public final boolean a() {
        return !this.f56699c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f56698b.put(uuid, runnable);
        this.f56699c.add(uuid);
        org.telegram.messenger.g0.h3(new q2.d(this, 11));
    }

    public final void c() {
        ArrayList arrayList = this.f56699c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f56698b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        org.telegram.messenger.g0.h3(new q2.d(this, 11));
    }
}
