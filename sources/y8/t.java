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
    public static final SparseArray f60547e = new SparseArray(2);
    public static final AtomicInteger f60548f = new AtomicInteger();
    public int f60549a;
    public u f60550b;
    public Task f60551c;

    public final void a() {
        if (this.f60551c != null && this.f60550b != null) {
            f60547e.delete(this.f60549a);
            d.removeCallbacks(this);
            u uVar = this.f60550b;
            if (uVar != null) {
                Task task = this.f60551c;
                int i7 = u.d;
                uVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f60551c = task;
        a();
    }

    @Override
    public final void run() {
        f60547e.delete(this.f60549a);
    }
}
