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
    public static final SparseArray f59233e = new SparseArray(2);
    public static final AtomicInteger f59234f = new AtomicInteger();
    public int f59235a;
    public u f59236b;
    public Task f59237c;

    public final void a() {
        if (this.f59237c != null && this.f59236b != null) {
            f59233e.delete(this.f59235a);
            d.removeCallbacks(this);
            u uVar = this.f59236b;
            if (uVar != null) {
                Task task = this.f59237c;
                int i7 = u.d;
                uVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f59237c = task;
        a();
    }

    @Override
    public final void run() {
        f59233e.delete(this.f59235a);
    }
}
