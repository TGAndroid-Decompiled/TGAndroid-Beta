package w9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
public final class n implements Callable {
    public final int f50260a;
    public final o f50261b;

    public n(o oVar, int i10) {
        this.f50260a = i10;
        this.f50261b = oVar;
    }

    @Override
    public final Object call() {
        switch (this.f50260a) {
            case 0:
                try {
                    n6.t tVar = this.f50261b.d;
                    ba.c cVar = (ba.c) tVar.f16718c;
                    cVar.getClass();
                    boolean delete = new File(cVar.f3800b, (String) tVar.f16717b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e7) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e7);
                    return Boolean.FALSE;
                }
            default:
                m mVar = this.f50261b.f50266f;
                n6.t tVar2 = mVar.f50247c;
                ba.c cVar2 = (ba.c) tVar2.f16718c;
                String str = (String) tVar2.f16717b;
                cVar2.getClass();
                boolean z10 = true;
                if (!new File(cVar2.f3800b, str).exists()) {
                    String e10 = mVar.e();
                    if (e10 == null || !mVar.f50252j.c(e10)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ba.c cVar3 = (ba.c) tVar2.f16718c;
                    cVar3.getClass();
                    new File(cVar3.f3800b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
