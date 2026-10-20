package qg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.z1;
public final class w1 {
    public v1 f44695a;
    public final HashMap f44696b = new HashMap();
    public final ArrayList f44697c = new ArrayList();

    public final boolean a() {
        return !this.f44697c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f44696b.put(uuid, runnable);
        this.f44697c.add(uuid);
        AndroidUtilities.runOnUIThread(new z1(this, 7));
    }

    public final void c() {
        ArrayList arrayList = this.f44697c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f44696b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        AndroidUtilities.runOnUIThread(new z1(this, 7));
    }
}
