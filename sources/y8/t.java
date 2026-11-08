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
    public static final SparseArray f59328e = new SparseArray(2);
    public static final AtomicInteger f59329f = new AtomicInteger();
    public int f59330a;
    public u f59331b;
    public Task f59332c;

    public final void a() {
        if (this.f59332c != null && this.f59331b != null) {
            f59328e.delete(this.f59330a);
            d.removeCallbacks(this);
            u uVar = this.f59331b;
            if (uVar != null) {
                Task task = this.f59332c;
                int i7 = u.d;
                uVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f59332c = task;
        a();
    }

    @Override
    public final void run() {
        f59328e.delete(this.f59330a);
    }
}
