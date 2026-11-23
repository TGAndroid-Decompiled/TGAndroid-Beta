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
    public static final SparseArray f61158e = new SparseArray(2);
    public static final AtomicInteger f61159f = new AtomicInteger();
    public int f61160a;
    public u f61161b;
    public Task f61162c;

    public final void a() {
        if (this.f61162c != null && this.f61161b != null) {
            f61158e.delete(this.f61160a);
            d.removeCallbacks(this);
            u uVar = this.f61161b;
            if (uVar != null) {
                Task task = this.f61162c;
                int i7 = u.d;
                uVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f61162c = task;
        a();
    }

    @Override
    public final void run() {
        f61158e.delete(this.f61160a);
    }
}
