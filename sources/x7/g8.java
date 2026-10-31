package x7;

import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.ui.un;
public final class g8 implements SuccessContinuation, yh.d0 {
    public final int f53163a;
    public Object f53164b;
    public Object f53165c;

    @Override
    public void a(long j10) {
        ((org.telegram.ui.ActionBar.k2) this.f53164b).presentFragment(un.ha(j10));
        ((yh.a0) this.f53165c).dismiss();
    }

    @Override
    public void b() {
        yh.a0 a0Var = (yh.a0) this.f53165c;
        a0Var.f54450s1.d.f30819f3.O(true);
        a0Var.f54449r1.d.f30819f3.O(true);
    }

    @Override
    public void close() {
        ((yh.a0) this.f53165c).f54443k1.E(0);
    }

    @Override
    public Task then(Object obj) {
        switch (this.f53163a) {
            case 1:
                ea.c cVar = (ea.c) obj;
                x9.n nVar = ((x9.k) this.f53165c).e;
                if (cVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(x9.n.b(nVar), nVar.f53477m.w((Executor) this.f53164b, null));
            default:
                return ((x9.n) this.f53165c).e.Z(new pb.d(2, this, (Boolean) obj));
        }
    }

    public g8(int i10, Object obj, Object obj2) {
        this.f53163a = i10;
        this.f53165c = obj;
        this.f53164b = obj2;
    }

    public g8() {
        this.f53163a = 3;
        this.f53164b = new AtomicInteger();
        this.f53165c = new AtomicInteger();
    }

    public g8(x9.k kVar, Executor executor, String str) {
        this.f53163a = 1;
        this.f53165c = kVar;
        this.f53164b = executor;
    }
}
