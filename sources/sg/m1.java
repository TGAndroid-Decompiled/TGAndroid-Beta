package sg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
public final class m1 {
    public l1 f55030a;
    public final HashMap f55031b = new HashMap();
    public final ArrayList f55032c = new ArrayList();

    public final boolean a() {
        return !this.f55032c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f55031b.put(uuid, runnable);
        this.f55032c.add(uuid);
        org.telegram.messenger.g0.h3(new t0(this, 1));
    }

    public final void c() {
        ArrayList arrayList = this.f55032c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f55031b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        org.telegram.messenger.g0.h3(new t0(this, 1));
    }
}
