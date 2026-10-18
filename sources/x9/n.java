package x9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
public final class n implements Callable {
    public final int f49703a;
    public final o f49704b;

    public n(o oVar, int i10) {
        this.f49703a = i10;
        this.f49704b = oVar;
    }

    @Override
    public final Object call() {
        switch (this.f49703a) {
            case 0:
                try {
                    mi.q qVar = this.f49704b.d;
                    ca.c cVar = (ca.c) qVar.f16973c;
                    cVar.getClass();
                    boolean delete = new File(cVar.f5049b, (String) qVar.f16972b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                m mVar = this.f49704b.f49708f;
                mi.q qVar2 = mVar.f49691c;
                ca.c cVar2 = (ca.c) qVar2.f16973c;
                String str = (String) qVar2.f16972b;
                cVar2.getClass();
                boolean z10 = true;
                if (!new File(cVar2.f5049b, str).exists()) {
                    String e7 = mVar.e();
                    if (e7 == null || !mVar.f49695j.c(e7)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ca.c cVar3 = (ca.c) qVar2.f16973c;
                    cVar3.getClass();
                    new File(cVar3.f5049b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
