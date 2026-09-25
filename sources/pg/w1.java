package pg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
public final class w1 {
    public v1 f41302a;
    public final HashMap f41303b = new HashMap();
    public final ArrayList f41304c = new ArrayList();

    public final boolean a() {
        return !this.f41304c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f41303b.put(uuid, runnable);
        this.f41304c.add(uuid);
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(this, 13));
    }

    public final void c() {
        ArrayList arrayList = this.f41304c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f41303b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(this, 13));
    }
}
