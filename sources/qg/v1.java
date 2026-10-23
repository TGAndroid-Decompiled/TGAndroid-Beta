package qg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.a2;
public final class v1 {
    public u1 f45105a;
    public final HashMap f45106b = new HashMap();
    public final ArrayList f45107c = new ArrayList();

    public final boolean a() {
        return !this.f45107c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f45106b.put(uuid, runnable);
        this.f45107c.add(uuid);
        AndroidUtilities.runOnUIThread(new a2(this, 7));
    }

    public final void c() {
        ArrayList arrayList = this.f45107c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f45106b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        AndroidUtilities.runOnUIThread(new a2(this, 7));
    }
}
