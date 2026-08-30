package w8;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class e implements com.google.android.gms.common.api.internal.c {
    public static final AtomicReference f46473a = new AtomicReference();

    @Override
    public final void a(boolean z4) {
        synchronized (g.f46476k) {
            try {
                ArrayList arrayList = new ArrayList(g.f46477l.values());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    g gVar = (g) obj;
                    if (gVar.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = gVar.f46483i.iterator();
                        while (it.hasNext()) {
                            g gVar2 = ((d) it.next()).f46472a;
                            if (!z4) {
                                ((z9.c) gVar2.h.get()).c();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
