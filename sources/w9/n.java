package w9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
import n7.a1;
public final class n implements Callable {
    public final int f44946a;
    public final o f44947b;

    public n(o oVar, int i10) {
        this.f44946a = i10;
        this.f44947b = oVar;
    }

    @Override
    public final Object call() {
        switch (this.f44946a) {
            case 0:
                try {
                    a1 a1Var = this.f44947b.d;
                    ba.c cVar = (ba.c) a1Var.f15107c;
                    cVar.getClass();
                    boolean delete = new File(cVar.f3449b, (String) a1Var.f15106b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                m mVar = this.f44947b.f44951f;
                a1 a1Var2 = mVar.f44934c;
                ba.c cVar2 = (ba.c) a1Var2.f15107c;
                String str = (String) a1Var2.f15106b;
                cVar2.getClass();
                boolean z10 = true;
                if (!new File(cVar2.f3449b, str).exists()) {
                    String e7 = mVar.e();
                    if (e7 == null || !mVar.f44938j.c(e7)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ba.c cVar3 = (ba.c) a1Var2.f15107c;
                    cVar3.getClass();
                    new File(cVar3.f3449b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
