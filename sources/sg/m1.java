package sg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
public final class m1 {
    public l1 f55055a;
    public final HashMap f55056b = new HashMap();
    public final ArrayList f55057c = new ArrayList();

    public final boolean a() {
        return !this.f55057c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f55056b.put(uuid, runnable);
        this.f55057c.add(uuid);
        org.telegram.messenger.g0.h3(new t0(this, 1));
    }

    public final void c() {
        ArrayList arrayList = this.f55057c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f55056b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        org.telegram.messenger.g0.h3(new t0(this, 1));
    }
}
