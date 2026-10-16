package qb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
public final class c {
    public final HashMap f43085a = new HashMap();

    public c(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            HashMap hashMap = this.f43085a;
            bVar.getClass();
            hashMap.put(a.class, bVar.f43084a);
        }
    }

    public void a(Runnable runnable) {
        Runnable runnable2 = (Runnable) this.f43085a.remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    public void b() {
        HashMap hashMap = this.f43085a;
        for (Map.Entry entry : hashMap.entrySet()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) entry.getValue());
        }
        hashMap.clear();
    }

    public c() {
    }
}
