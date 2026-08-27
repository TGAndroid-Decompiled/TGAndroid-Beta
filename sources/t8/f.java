package t8;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class f implements com.google.android.gms.common.api.internal.c {

    public static final AtomicReference f48114a = new AtomicReference();

    @Override
    public final void a(boolean z10) {
        synchronized (h.f48117k) {
            try {
                ArrayList arrayList = new ArrayList(h.f48118l.values());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    h hVar = (h) obj;
                    if (hVar.f48122e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = hVar.f48125i.iterator();
                        while (it.hasNext()) {
                            h hVar2 = ((e) it.next()).f48113a;
                            if (!z10) {
                                ((w9.c) hVar2.h.get()).c();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
