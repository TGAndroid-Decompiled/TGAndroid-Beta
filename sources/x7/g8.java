package x7;

import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.ui.un;
public final class g8 implements SuccessContinuation, yh.c0 {
    public final int f53181a;
    public Object f53182b;
    public Object f53183c;

    @Override
    public void a(long j10) {
        ((org.telegram.ui.ActionBar.k2) this.f53182b).presentFragment(un.ma(j10));
        ((yh.z) this.f53183c).dismiss();
    }

    @Override
    public void b() {
        yh.z zVar = (yh.z) this.f53183c;
        zVar.f54552s1.d.f31183f3.O(true);
        zVar.f54551r1.d.f31183f3.O(true);
    }

    @Override
    public void close() {
        ((yh.z) this.f53183c).f54545k1.E(0);
    }

    @Override
    public Task then(Object obj) {
        switch (this.f53181a) {
            case 1:
                ea.c cVar = (ea.c) obj;
                x9.n nVar = ((x9.k) this.f53183c).e;
                if (cVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(x9.n.b(nVar), nVar.f53495m.w((Executor) this.f53182b, null));
            default:
                return ((x9.n) this.f53183c).e.Z(new pb.d(2, this, (Boolean) obj));
        }
    }

    public g8(int i10, Object obj, Object obj2) {
        this.f53181a = i10;
        this.f53183c = obj;
        this.f53182b = obj2;
    }

    public g8() {
        this.f53181a = 3;
        this.f53182b = new AtomicInteger();
        this.f53183c = new AtomicInteger();
    }

    public g8(x9.k kVar, Executor executor, String str) {
        this.f53181a = 1;
        this.f53183c = kVar;
        this.f53182b = executor;
    }
}
