package tg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
public final class k1 {
    public j1 f55239a;
    public final HashMap f55240b = new HashMap();
    public final ArrayList f55241c = new ArrayList();

    public final boolean a() {
        return !this.f55241c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f55240b.put(uuid, runnable);
        this.f55241c.add(uuid);
        org.telegram.messenger.g0.h3(new r4.u(this, 8));
    }

    public final void c() {
        ArrayList arrayList = this.f55241c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f55240b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        org.telegram.messenger.g0.h3(new r4.u(this, 8));
    }
}
