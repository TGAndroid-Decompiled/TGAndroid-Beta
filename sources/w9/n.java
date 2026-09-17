package w9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
import n7.a1;
public final class n implements Callable {
    public final int f44973a;
    public final o f44974b;

    public n(o oVar, int i10) {
        this.f44973a = i10;
        this.f44974b = oVar;
    }

    @Override
    public final Object call() {
        switch (this.f44973a) {
            case 0:
                try {
                    a1 a1Var = this.f44974b.d;
                    ba.c cVar = (ba.c) a1Var.f15119c;
                    cVar.getClass();
                    boolean delete = new File(cVar.f3452b, (String) a1Var.f15118b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                m mVar = this.f44974b.f44978f;
                a1 a1Var2 = mVar.f44961c;
                ba.c cVar2 = (ba.c) a1Var2.f15119c;
                String str = (String) a1Var2.f15118b;
                cVar2.getClass();
                boolean z10 = true;
                if (!new File(cVar2.f3452b, str).exists()) {
                    String e7 = mVar.e();
                    if (e7 == null || !mVar.f44965j.c(e7)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ba.c cVar3 = (ba.c) a1Var2.f15119c;
                    cVar3.getClass();
                    new File(cVar3.f3452b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
