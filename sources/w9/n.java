package w9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
public final class n implements Callable {
    public final int f50381a;
    public final o f50382b;

    public n(o oVar, int i10) {
        this.f50381a = i10;
        this.f50382b = oVar;
    }

    @Override
    public final Object call() {
        switch (this.f50381a) {
            case 0:
                try {
                    n6.k kVar = this.f50382b.d;
                    ba.c cVar = (ba.c) kVar.f16766c;
                    cVar.getClass();
                    boolean delete = new File(cVar.f3800b, (String) kVar.f16765b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e7) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e7);
                    return Boolean.FALSE;
                }
            default:
                m mVar = this.f50382b.f50387f;
                n6.k kVar2 = mVar.f50368c;
                ba.c cVar2 = (ba.c) kVar2.f16766c;
                String str = (String) kVar2.f16765b;
                cVar2.getClass();
                boolean z10 = true;
                if (!new File(cVar2.f3800b, str).exists()) {
                    String e10 = mVar.e();
                    if (e10 == null || !mVar.f50373j.c(e10)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ba.c cVar3 = (ba.c) kVar2.f16766c;
                    cVar3.getClass();
                    new File(cVar3.f3800b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
