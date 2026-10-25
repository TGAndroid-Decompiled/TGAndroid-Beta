package pa;

import android.content.Context;
import android.os.Build;
import androidx.emoji2.text.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
public final class c implements e, f {
    public final m9.d f46828a;
    public final Context f46829b;
    public final ra.b f46830c;
    public final Set d;
    public final Executor e;

    public c(Context context, String str, Set set, ra.b bVar, Executor executor) {
        this.f46828a = new m9.d(context, str);
        this.d = set;
        this.e = executor;
        this.f46830c = bVar;
        this.f46829b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        g gVar = (g) this.f46828a.get();
        if (gVar.i(currentTimeMillis)) {
            gVar.g();
            return 3;
        }
        return 1;
    }

    public final Task b() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = w.g(this.f46829b);
        } else {
            z10 = true;
        }
        if (!z10) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.e, new b(this, 0));
    }

    public final void c() {
        boolean z10;
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = w.g(this.f46829b);
        } else {
            z10 = true;
        }
        if (!z10) {
            Tasks.forResult(null);
            return;
        }
        Tasks.call(this.e, new b(this, 1));
    }
}
