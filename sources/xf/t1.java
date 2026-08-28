package xf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
public final class t1 {
    public s1 f49381a;
    public final HashMap f49382b = new HashMap();
    public final ArrayList f49383c = new ArrayList();

    public final boolean a() {
        return !this.f49383c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f49382b.put(uuid, runnable);
        this.f49383c.add(uuid);
        AndroidUtilities.runOnUIThread(new pf.o1(this, 14));
    }

    public final void c() {
        ArrayList arrayList = this.f49383c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f49382b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        AndroidUtilities.runOnUIThread(new pf.o1(this, 14));
    }
}
