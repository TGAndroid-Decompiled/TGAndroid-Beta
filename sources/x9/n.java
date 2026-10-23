package x9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
public final class n implements Callable {
    public final int f50155a;
    public final o f50156b;

    public n(o oVar, int i10) {
        this.f50155a = i10;
        this.f50156b = oVar;
    }

    @Override
    public final Object call() {
        switch (this.f50155a) {
            case 0:
                try {
                    mi.q qVar = this.f50156b.d;
                    ca.c cVar = (ca.c) qVar.f17037c;
                    cVar.getClass();
                    boolean delete = new File(cVar.f5051b, (String) qVar.f17036b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                m mVar = this.f50156b.f50160f;
                mi.q qVar2 = mVar.f50143c;
                ca.c cVar2 = (ca.c) qVar2.f17037c;
                String str = (String) qVar2.f17036b;
                cVar2.getClass();
                boolean z10 = true;
                if (!new File(cVar2.f5051b, str).exists()) {
                    String e7 = mVar.e();
                    if (e7 == null || !mVar.f50147j.c(e7)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ca.c cVar3 = (ca.c) qVar2.f17037c;
                    cVar3.getClass();
                    new File(cVar3.f5051b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
