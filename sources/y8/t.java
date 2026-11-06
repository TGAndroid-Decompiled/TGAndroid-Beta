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
    public static final SparseArray f59209e = new SparseArray(2);
    public static final AtomicInteger f59210f = new AtomicInteger();
    public int f59211a;
    public u f59212b;
    public Task f59213c;

    public final void a() {
        if (this.f59213c != null && this.f59212b != null) {
            f59209e.delete(this.f59211a);
            d.removeCallbacks(this);
            u uVar = this.f59212b;
            if (uVar != null) {
                Task task = this.f59213c;
                int i7 = u.d;
                uVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f59213c = task;
        a();
    }

    @Override
    public final void run() {
        f59209e.delete(this.f59211a);
    }
}
