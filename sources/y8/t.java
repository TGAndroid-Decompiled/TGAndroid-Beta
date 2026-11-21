package y8;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;
public final class t implements OnCompleteListener, Runnable {
    public static final y d = new Handler(Looper.getMainLooper());
    public static final SparseArray f61154e = new SparseArray(2);
    public static final AtomicInteger f61155f = new AtomicInteger();
    public int f61156a;
    public u f61157b;
    public Task f61158c;

    public final void a() {
        if (this.f61158c != null && this.f61157b != null) {
            f61154e.delete(this.f61156a);
            d.removeCallbacks(this);
            u uVar = this.f61157b;
            if (uVar != null) {
                Task task = this.f61158c;
                int i7 = u.d;
                uVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f61158c = task;
        a();
    }

    @Override
    public final void run() {
        f61154e.delete(this.f61156a);
    }
}
