package pb;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
public final class c {
    public final HashMap f41015a;

    public c(Set set) {
        this.f41015a = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            HashMap hashMap = this.f41015a;
            bVar.getClass();
            hashMap.put(a.class, bVar.f41014a);
        }
    }

    public void a(Runnable runnable) {
        Runnable runnable2 = (Runnable) this.f41015a.remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    public void b() {
        HashMap hashMap = this.f41015a;
        for (Map.Entry entry : hashMap.entrySet()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) entry.getValue());
        }
        hashMap.clear();
    }

    public void c(IBinder iBinder) {
        synchronized (this.f41015a) {
            if (iBinder != null) {
                try {
                    iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            new y8.a();
            for (Map.Entry entry : this.f41015a.entrySet()) {
                if (entry.getValue() == null) {
                    try {
                        throw null;
                        break;
                    } catch (RemoteException unused) {
                        String valueOf = String.valueOf(entry.getKey());
                        Log.w("WearableClient", "onPostInitHandler: Didn't add: " + valueOf + "/null");
                    }
                } else {
                    throw new ClassCastException();
                }
            }
        }
    }

    public c(int i10) {
        switch (i10) {
            case 2:
                this.f41015a = new HashMap();
                return;
            default:
                this.f41015a = new HashMap();
                return;
        }
    }
}
