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
    public static final SparseArray f59338e = new SparseArray(2);
    public static final AtomicInteger f59339f = new AtomicInteger();
    public int f59340a;
    public u f59341b;
    public Task f59342c;

    public final void a() {
        if (this.f59342c != null && this.f59341b != null) {
            f59338e.delete(this.f59340a);
            d.removeCallbacks(this);
            u uVar = this.f59341b;
            if (uVar != null) {
                Task task = this.f59342c;
                int i7 = u.d;
                uVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f59342c = task;
        a();
    }

    @Override
    public final void run() {
        f59338e.delete(this.f59340a);
    }
}
