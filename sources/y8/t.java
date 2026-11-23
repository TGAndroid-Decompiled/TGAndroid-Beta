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
    public static final SparseArray f61123e = new SparseArray(2);
    public static final AtomicInteger f61124f = new AtomicInteger();
    public int f61125a;
    public u f61126b;
    public Task f61127c;

    public final void a() {
        if (this.f61127c != null && this.f61126b != null) {
            f61123e.delete(this.f61125a);
            d.removeCallbacks(this);
            u uVar = this.f61126b;
            if (uVar != null) {
                Task task = this.f61127c;
                int i7 = u.d;
                uVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f61127c = task;
        a();
    }

    @Override
    public final void run() {
        f61123e.delete(this.f61125a);
    }
}
