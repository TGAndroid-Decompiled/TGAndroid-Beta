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
    public static final SparseArray f59234e = new SparseArray(2);
    public static final AtomicInteger f59235f = new AtomicInteger();
    public int f59236a;
    public u f59237b;
    public Task f59238c;

    public final void a() {
        if (this.f59238c != null && this.f59237b != null) {
            f59234e.delete(this.f59236a);
            d.removeCallbacks(this);
            u uVar = this.f59237b;
            if (uVar != null) {
                Task task = this.f59238c;
                int i7 = u.d;
                uVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f59238c = task;
        a();
    }

    @Override
    public final void run() {
        f59234e.delete(this.f59236a);
    }
}
