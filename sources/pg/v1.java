package pg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
public final class v1 {
    public u1 f41280a;
    public final HashMap f41281b = new HashMap();
    public final ArrayList f41282c = new ArrayList();

    public final boolean a() {
        return !this.f41282c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f41281b.put(uuid, runnable);
        this.f41282c.add(uuid);
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(this, 12));
    }

    public final void c() {
        ArrayList arrayList = this.f41282c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f41281b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(this, 12));
    }
}
