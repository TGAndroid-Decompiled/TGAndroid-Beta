package pg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
public final class u1 {
    public t1 f45695a;
    public final HashMap f45696b = new HashMap();
    public final ArrayList f45697c = new ArrayList();

    public final boolean a() {
        return !this.f45697c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f45696b.put(uuid, runnable);
        this.f45697c.add(uuid);
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t0(this, 12));
    }

    public final void c() {
        ArrayList arrayList = this.f45697c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f45696b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t0(this, 12));
    }
}
