package qg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.z1;
public final class v1 {
    public u1 f44726a;
    public final HashMap f44727b = new HashMap();
    public final ArrayList f44728c = new ArrayList();

    public final boolean a() {
        return !this.f44728c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f44727b.put(uuid, runnable);
        this.f44728c.add(uuid);
        AndroidUtilities.runOnUIThread(new z1(this, 7));
    }

    public final void c() {
        ArrayList arrayList = this.f44728c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f44727b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        AndroidUtilities.runOnUIThread(new z1(this, 7));
    }
}
