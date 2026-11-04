package x8;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.cast.z;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;
public final class t implements OnCompleteListener, Runnable {
    public static final z d = new Handler(Looper.getMainLooper());
    public static final SparseArray f58585e = new SparseArray(2);
    public static final AtomicInteger f58586f = new AtomicInteger();
    public int f58587a;
    public u f58588b;
    public Task f58589c;

    public final void a() {
        if (this.f58589c != null && this.f58588b != null) {
            f58585e.delete(this.f58587a);
            d.removeCallbacks(this);
            u uVar = this.f58588b;
            if (uVar != null) {
                Task task = this.f58589c;
                int i3 = u.d;
                uVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f58589c = task;
        a();
    }

    @Override
    public final void run() {
        f58585e.delete(this.f58587a);
    }
}
