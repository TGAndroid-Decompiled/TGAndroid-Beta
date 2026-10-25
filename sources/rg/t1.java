package rg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
public final class t1 {
    public s1 f47559a;
    public final HashMap f47560b = new HashMap();
    public final ArrayList f47561c = new ArrayList();

    public final boolean a() {
        return !this.f47561c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f47560b.put(uuid, runnable);
        this.f47561c.add(uuid);
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(this, 12));
    }

    public final void c() {
        ArrayList arrayList = this.f47561c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f47560b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(this, 12));
    }
}
