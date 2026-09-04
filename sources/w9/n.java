package w9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
public final class n implements Callable {
    public final int f48417a;
    public final o f48418b;

    public n(o oVar, int i10) {
        this.f48417a = i10;
        this.f48418b = oVar;
    }

    @Override
    public final Object call() {
        switch (this.f48417a) {
            case 0:
                try {
                    o0.a aVar = this.f48418b.d;
                    ba.c cVar = (ba.c) aVar.f16770c;
                    cVar.getClass();
                    boolean delete = new File(cVar.f2527b, (String) aVar.f16769b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e7) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e7);
                    return Boolean.FALSE;
                }
            default:
                m mVar = this.f48418b.f48423f;
                o0.a aVar2 = mVar.f48404c;
                ba.c cVar2 = (ba.c) aVar2.f16770c;
                String str = (String) aVar2.f16769b;
                cVar2.getClass();
                boolean z10 = true;
                if (!new File(cVar2.f2527b, str).exists()) {
                    String e10 = mVar.e();
                    if (e10 == null || !mVar.f48409j.c(e10)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ba.c cVar3 = (ba.c) aVar2.f16770c;
                    cVar3.getClass();
                    new File(cVar3.f2527b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
