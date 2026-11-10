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
    public static final SparseArray f59336e = new SparseArray(2);
    public static final AtomicInteger f59337f = new AtomicInteger();
    public int f59338a;
    public u f59339b;
    public Task f59340c;

    public final void a() {
        if (this.f59340c != null && this.f59339b != null) {
            f59336e.delete(this.f59338a);
            d.removeCallbacks(this);
            u uVar = this.f59339b;
            if (uVar != null) {
                Task task = this.f59340c;
                int i7 = u.d;
                uVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f59340c = task;
        a();
    }

    @Override
    public final void run() {
        f59336e.delete(this.f59338a);
    }
}
