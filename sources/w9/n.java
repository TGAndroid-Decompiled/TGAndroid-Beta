package w9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
import n7.z0;
public final class n implements Callable {
    public final int f45217a;
    public final o f45218b;

    public n(o oVar, int i10) {
        this.f45217a = i10;
        this.f45218b = oVar;
    }

    @Override
    public final Object call() {
        switch (this.f45217a) {
            case 0:
                try {
                    z0 z0Var = this.f45218b.d;
                    ba.c cVar = (ba.c) z0Var.f15396c;
                    cVar.getClass();
                    boolean delete = new File(cVar.f3444b, (String) z0Var.f15395b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                m mVar = this.f45218b.f45222f;
                z0 z0Var2 = mVar.f45205c;
                ba.c cVar2 = (ba.c) z0Var2.f15396c;
                String str = (String) z0Var2.f15395b;
                cVar2.getClass();
                boolean z10 = true;
                if (!new File(cVar2.f3444b, str).exists()) {
                    String e7 = mVar.e();
                    if (e7 == null || !mVar.f45209j.c(e7)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ba.c cVar3 = (ba.c) z0Var2.f15396c;
                    cVar3.getClass();
                    new File(cVar3.f3444b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
