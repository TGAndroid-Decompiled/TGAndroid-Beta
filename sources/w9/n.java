package w9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
import n7.a1;
public final class n implements Callable {
    public final int f43909a;
    public final o f43910b;

    public n(o oVar, int i10) {
        this.f43909a = i10;
        this.f43910b = oVar;
    }

    @Override
    public final Object call() {
        switch (this.f43909a) {
            case 0:
                try {
                    a1 a1Var = this.f43910b.d;
                    ba.c cVar = (ba.c) a1Var.f13939c;
                    cVar.getClass();
                    boolean delete = new File(cVar.f2145b, (String) a1Var.f13938b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                m mVar = this.f43910b.f43914f;
                a1 a1Var2 = mVar.f43897c;
                ba.c cVar2 = (ba.c) a1Var2.f13939c;
                String str = (String) a1Var2.f13938b;
                cVar2.getClass();
                boolean z10 = true;
                if (!new File(cVar2.f2145b, str).exists()) {
                    String e7 = mVar.e();
                    if (e7 == null || !mVar.f43901j.c(e7)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ba.c cVar3 = (ba.c) a1Var2.f13939c;
                    cVar3.getClass();
                    new File(cVar3.f2145b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
