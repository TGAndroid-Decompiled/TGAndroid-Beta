package x9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
public final class n implements Callable {
    public final int f49725a;
    public final o f49726b;

    public n(o oVar, int i10) {
        this.f49725a = i10;
        this.f49726b = oVar;
    }

    @Override
    public final Object call() {
        switch (this.f49725a) {
            case 0:
                try {
                    mi.q qVar = this.f49726b.d;
                    ca.c cVar = (ca.c) qVar.f16968c;
                    cVar.getClass();
                    boolean delete = new File(cVar.f5048b, (String) qVar.f16967b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                m mVar = this.f49726b.f49730f;
                mi.q qVar2 = mVar.f49713c;
                ca.c cVar2 = (ca.c) qVar2.f16968c;
                String str = (String) qVar2.f16967b;
                cVar2.getClass();
                boolean z10 = true;
                if (!new File(cVar2.f5048b, str).exists()) {
                    String e7 = mVar.e();
                    if (e7 == null || !mVar.f49717j.c(e7)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ca.c cVar3 = (ca.c) qVar2.f16968c;
                    cVar3.getClass();
                    new File(cVar3.f5048b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
