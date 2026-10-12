package x9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
public final class o implements Callable {
    public final int f48319a;
    public final p f48320b;

    public o(p pVar, int i10) {
        this.f48319a = i10;
        this.f48320b = pVar;
    }

    @Override
    public final Object call() {
        switch (this.f48319a) {
            case 0:
                try {
                    l lVar = this.f48320b.d;
                    ca.c cVar = (ca.c) lVar.f48301b;
                    cVar.getClass();
                    boolean delete = new File(cVar.f4675b, (String) lVar.f48300a).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                n nVar = this.f48320b.f48324f;
                l lVar2 = nVar.f48307c;
                ca.c cVar2 = (ca.c) lVar2.f48301b;
                String str = (String) lVar2.f48300a;
                cVar2.getClass();
                boolean z10 = true;
                if (!new File(cVar2.f4675b, str).exists()) {
                    String e7 = nVar.e();
                    if (e7 == null || !nVar.f48311j.c(e7)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ca.c cVar3 = (ca.c) lVar2.f48301b;
                    cVar3.getClass();
                    new File(cVar3.f4675b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
