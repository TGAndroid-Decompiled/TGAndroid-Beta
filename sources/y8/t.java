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
    public static final SparseArray f59329e = new SparseArray(2);
    public static final AtomicInteger f59330f = new AtomicInteger();
    public int f59331a;
    public u f59332b;
    public Task f59333c;

    public final void a() {
        if (this.f59333c != null && this.f59332b != null) {
            f59329e.delete(this.f59331a);
            d.removeCallbacks(this);
            u uVar = this.f59332b;
            if (uVar != null) {
                Task task = this.f59333c;
                int i7 = u.d;
                uVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f59333c = task;
        a();
    }

    @Override
    public final void run() {
        f59329e.delete(this.f59331a);
    }
}
