package s8;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class f implements com.google.android.gms.common.api.internal.c {
    public static final AtomicReference f47465a = new AtomicReference();

    @Override
    public final void a(boolean z10) {
        synchronized (h.f47468k) {
            try {
                ArrayList arrayList = new ArrayList(h.f47469l.values());
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    h hVar = (h) obj;
                    if (hVar.f47473e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = hVar.f47476i.iterator();
                        while (it.hasNext()) {
                            h hVar2 = ((e) it.next()).f47464a;
                            if (!z10) {
                                ((v9.c) hVar2.h.get()).c();
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
