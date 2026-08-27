package ya;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import j8.x0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class c {

    public final HashMap f49815a = new HashMap();

    public c() {
    }

    public void a(IBinder iBinder) {
        synchronized (this.f49815a) {
            if (iBinder != null) {
                try {
                    iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                } catch (Throwable th) {
                    throw th;
                }
            }
            new x0();
            for (Map.Entry entry : this.f49815a.entrySet()) {
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                try {
                    throw null;
                } catch (RemoteException unused) {
                    Log.w("WearableClient", "onPostInitHandler: Didn't add: " + String.valueOf(entry.getKey()) + "/null");
                }
            }
        }
    }

    public c(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            HashMap map = this.f49815a;
            bVar.getClass();
            map.put(a.class, bVar.f49814a);
        }
    }
}
