package pg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
public final class t1 {
    public s1 f41034a;
    public final HashMap f41035b = new HashMap();
    public final ArrayList f41036c = new ArrayList();

    public final boolean a() {
        return !this.f41036c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f41035b.put(uuid, runnable);
        this.f41036c.add(uuid);
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(this, 12));
    }

    public final void c() {
        ArrayList arrayList = this.f41036c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f41035b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(this, 12));
    }
}
