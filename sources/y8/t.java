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
    public static final SparseArray f59239e = new SparseArray(2);
    public static final AtomicInteger f59240f = new AtomicInteger();
    public int f59241a;
    public u f59242b;
    public Task f59243c;

    public final void a() {
        if (this.f59243c != null && this.f59242b != null) {
            f59239e.delete(this.f59241a);
            d.removeCallbacks(this);
            u uVar = this.f59242b;
            if (uVar != null) {
                Task task = this.f59243c;
                int i7 = u.d;
                uVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f59243c = task;
        a();
    }

    @Override
    public final void run() {
        f59239e.delete(this.f59241a);
    }
}
