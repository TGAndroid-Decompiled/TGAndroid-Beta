package qg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
public final class t1 {
    public s1 f44618a;
    public final HashMap f44619b = new HashMap();
    public final ArrayList f44620c = new ArrayList();

    public final boolean a() {
        return !this.f44620c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f44619b.put(uuid, runnable);
        this.f44620c.add(uuid);
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b(this, 15));
    }

    public final void c() {
        ArrayList arrayList = this.f44620c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f44619b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b(this, 15));
    }
}
