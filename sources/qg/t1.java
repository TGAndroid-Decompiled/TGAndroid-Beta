package qg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.voip.m2;
public final class t1 {
    public s1 f43585a;
    public final HashMap f43586b = new HashMap();
    public final ArrayList f43587c = new ArrayList();

    public final boolean a() {
        return !this.f43587c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f43586b.put(uuid, runnable);
        this.f43587c.add(uuid);
        AndroidUtilities.runOnUIThread(new m2(this, 18));
    }

    public final void c() {
        ArrayList arrayList = this.f43587c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f43586b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        AndroidUtilities.runOnUIThread(new m2(this, 18));
    }
}
