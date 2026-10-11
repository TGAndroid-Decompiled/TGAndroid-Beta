package w9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
public final class n implements Callable {
    public final int f50347a;
    public final o f50348b;

    public n(o oVar, int i10) {
        this.f50347a = i10;
        this.f50348b = oVar;
    }

    @Override
    public final Object call() {
        switch (this.f50347a) {
            case 0:
                try {
                    n6.k kVar = this.f50348b.d;
                    ba.c cVar = (ba.c) kVar.f16730c;
                    cVar.getClass();
                    boolean delete = new File(cVar.f3800b, (String) kVar.f16729b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e7) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e7);
                    return Boolean.FALSE;
                }
            default:
                m mVar = this.f50348b.f50353f;
                n6.k kVar2 = mVar.f50334c;
                ba.c cVar2 = (ba.c) kVar2.f16730c;
                String str = (String) kVar2.f16729b;
                cVar2.getClass();
                boolean z10 = true;
                if (!new File(cVar2.f3800b, str).exists()) {
                    String e10 = mVar.e();
                    if (e10 == null || !mVar.f50339j.c(e10)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ba.c cVar3 = (ba.c) kVar2.f16730c;
                    cVar3.getClass();
                    new File(cVar3.f3800b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
