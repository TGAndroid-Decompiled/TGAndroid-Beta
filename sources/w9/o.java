package w9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
import n7.z0;
public final class o implements Callable {
    public final int f48972a;
    public final p f48973b;

    public o(p pVar, int i10) {
        this.f48972a = i10;
        this.f48973b = pVar;
    }

    @Override
    public final Object call() {
        switch (this.f48972a) {
            case 0:
                try {
                    z0 z0Var = this.f48973b.d;
                    ba.c cVar = (ba.c) z0Var.f16852c;
                    cVar.getClass();
                    boolean delete = new File(cVar.f3721b, (String) z0Var.f16851b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e7) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e7);
                    return Boolean.FALSE;
                }
            default:
                n nVar = this.f48973b.f48978f;
                z0 z0Var2 = nVar.f48959c;
                ba.c cVar2 = (ba.c) z0Var2.f16852c;
                String str = (String) z0Var2.f16851b;
                cVar2.getClass();
                boolean z10 = true;
                if (!new File(cVar2.f3721b, str).exists()) {
                    String e10 = nVar.e();
                    if (e10 == null || !nVar.f48964j.c(e10)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ba.c cVar3 = (ba.c) z0Var2.f16852c;
                    cVar3.getClass();
                    new File(cVar3.f3721b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
