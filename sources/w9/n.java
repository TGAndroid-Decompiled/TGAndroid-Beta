package w9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.f3;
public final class n implements Callable {
    public final int f45248a;
    public final o f45249b;

    public n(o oVar, int i10) {
        this.f45248a = i10;
        this.f45249b = oVar;
    }

    @Override
    public final Object call() {
        switch (this.f45248a) {
            case 0:
                try {
                    f3 f3Var = this.f45249b.d;
                    ba.c cVar = (ba.c) f3Var.f20270c;
                    cVar.getClass();
                    boolean delete = new File(cVar.f3452b, (String) f3Var.f20269b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                m mVar = this.f45249b.f45253f;
                f3 f3Var2 = mVar.f45236c;
                ba.c cVar2 = (ba.c) f3Var2.f20270c;
                String str = (String) f3Var2.f20269b;
                cVar2.getClass();
                boolean z10 = true;
                if (!new File(cVar2.f3452b, str).exists()) {
                    String e7 = mVar.e();
                    if (e7 == null || !mVar.f45240j.c(e7)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ba.c cVar3 = (ba.c) f3Var2.f20270c;
                    cVar3.getClass();
                    new File(cVar3.f3452b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
