package w9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
public final class o implements Callable {
    public final int f50496a;
    public final p f50497b;

    public o(p pVar, int i10) {
        this.f50496a = i10;
        this.f50497b = pVar;
    }

    @Override
    public final Object call() {
        switch (this.f50496a) {
            case 0:
                try {
                    n6.k kVar = this.f50497b.d;
                    ba.c cVar = (ba.c) kVar.f16434c;
                    cVar.getClass();
                    boolean delete = new File(cVar.f3798b, (String) kVar.f16433b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e7) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e7);
                    return Boolean.FALSE;
                }
            default:
                n nVar = this.f50497b.f50502f;
                n6.k kVar2 = nVar.f50483c;
                ba.c cVar2 = (ba.c) kVar2.f16434c;
                String str = (String) kVar2.f16433b;
                cVar2.getClass();
                boolean z10 = true;
                if (!new File(cVar2.f3798b, str).exists()) {
                    String e10 = nVar.e();
                    if (e10 == null || !nVar.f50488j.c(e10)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ba.c cVar3 = (ba.c) kVar2.f16434c;
                    cVar3.getClass();
                    new File(cVar3.f3798b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
