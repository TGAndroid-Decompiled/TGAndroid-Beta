package x9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
public final class o implements Callable {
    public final int f48318a;
    public final p f48319b;

    public o(p pVar, int i10) {
        this.f48318a = i10;
        this.f48319b = pVar;
    }

    @Override
    public final Object call() {
        switch (this.f48318a) {
            case 0:
                try {
                    l lVar = this.f48319b.d;
                    ca.c cVar = (ca.c) lVar.f48300b;
                    cVar.getClass();
                    boolean delete = new File(cVar.f4678b, (String) lVar.f48299a).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                n nVar = this.f48319b.f48323f;
                l lVar2 = nVar.f48306c;
                ca.c cVar2 = (ca.c) lVar2.f48300b;
                String str = (String) lVar2.f48299a;
                cVar2.getClass();
                boolean z10 = true;
                if (!new File(cVar2.f4678b, str).exists()) {
                    String e7 = nVar.e();
                    if (e7 == null || !nVar.f48310j.c(e7)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ca.c cVar3 = (ca.c) lVar2.f48300b;
                    cVar3.getClass();
                    new File(cVar3.f4678b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
