package qg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.z1;
public final class w1 {
    public v1 f44699a;
    public final HashMap f44700b = new HashMap();
    public final ArrayList f44701c = new ArrayList();

    public final boolean a() {
        return !this.f44701c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f44700b.put(uuid, runnable);
        this.f44701c.add(uuid);
        AndroidUtilities.runOnUIThread(new z1(this, 7));
    }

    public final void c() {
        ArrayList arrayList = this.f44701c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f44700b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        AndroidUtilities.runOnUIThread(new z1(this, 7));
    }
}
