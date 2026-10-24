package qg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.a2;
public final class v1 {
    public u1 f45104a;
    public final HashMap f45105b = new HashMap();
    public final ArrayList f45106c = new ArrayList();

    public final boolean a() {
        return !this.f45106c.isEmpty();
    }

    public final void b(UUID uuid, Runnable runnable) {
        this.f45105b.put(uuid, runnable);
        this.f45106c.add(uuid);
        AndroidUtilities.runOnUIThread(new a2(this, 7));
    }

    public final void c() {
        ArrayList arrayList = this.f45106c;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap hashMap = this.f45105b;
        hashMap.remove(uuid);
        arrayList.remove(size);
        ((Runnable) hashMap.get(uuid)).run();
        AndroidUtilities.runOnUIThread(new a2(this, 7));
    }
}
