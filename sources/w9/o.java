package w9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.f3;
public final class o implements Callable {
    public final int f45269a;
    public final p f45270b;

    public o(p pVar, int i10) {
        this.f45269a = i10;
        this.f45270b = pVar;
    }

    @Override
    public final Object call() {
        switch (this.f45269a) {
            case 0:
                try {
                    f3 f3Var = this.f45270b.d;
                    ba.c cVar = (ba.c) f3Var.f20285c;
                    cVar.getClass();
                    boolean delete = new File(cVar.f3451b, (String) f3Var.f20284b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                n nVar = this.f45270b.f45274f;
                f3 f3Var2 = nVar.f45257c;
                ba.c cVar2 = (ba.c) f3Var2.f20285c;
                String str = (String) f3Var2.f20284b;
                cVar2.getClass();
                boolean z10 = true;
                if (!new File(cVar2.f3451b, str).exists()) {
                    String e7 = nVar.e();
                    if (e7 == null || !nVar.f45261j.c(e7)) {
                        z10 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ba.c cVar3 = (ba.c) f3Var2.f20285c;
                    cVar3.getClass();
                    new File(cVar3.f3451b, str).delete();
                }
                return Boolean.valueOf(z10);
        }
    }
}
