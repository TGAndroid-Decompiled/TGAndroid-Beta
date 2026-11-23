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
    public static final SparseArray f61242e = new SparseArray(2);
    public static final AtomicInteger f61243f = new AtomicInteger();
    public int f61244a;
    public u f61245b;
    public Task f61246c;

    public final void a() {
        if (this.f61246c != null && this.f61245b != null) {
            f61242e.delete(this.f61244a);
            d.removeCallbacks(this);
            u uVar = this.f61245b;
            if (uVar != null) {
                Task task = this.f61246c;
                int i7 = u.d;
                uVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f61246c = task;
        a();
    }

    @Override
    public final void run() {
        f61242e.delete(this.f61244a);
    }
}
