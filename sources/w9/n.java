package w9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
import n7.z0;
public final class n implements Callable {
    public final int f45339a;
    public final o f45340b;

    public n(o oVar, int i10) {
        this.f45339a = i10;
        this.f45340b = oVar;
    }

    @Override
    public final Object call() {
        switch (this.f45339a) {
            case 0:
                try {
                    z0 z0Var = this.f45340b.d;
                    ba.c cVar = (ba.c) z0Var.f15427c;
                    cVar.getClass();
                    boolean delete = new File(cVar.f3451b, (String) z0Var.f15426b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                m mVar = this.f45340b.f45344f;
                z0 z0Var2 = mVar.f45327c;
                ba.c cVar2 = (ba.c) z0Var2.f15427c;
                String str = (String) z0Var2.f15426b;
                cVar2.getClass();
                boolean z10 = true;
                if (!new File(cVar2.f3451b, str).exists()) {
                    String e7 = mVar.e();
                    if (e7 == null || !mVar.f45331j.c(e7)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ba.c cVar3 = (ba.c) z0Var2.f15427c;
                    cVar3.getClass();
                    new File(cVar3.f3451b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
