package pg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
public final class w1 {
    public v1 f44670a;
    public final HashMap f44671b = new HashMap();
    public final ArrayList f44672c = new ArrayList();

    public final boolean a() {
        return !this.f44672c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f44671b.put(uuid, runnable);
        this.f44672c.add(uuid);
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(this, 12));
    }

    public final void c() {
        ArrayList arrayList = this.f44672c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f44671b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.u0(this, 12));
    }
}
