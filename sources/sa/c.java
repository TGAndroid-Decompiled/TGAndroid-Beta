package sa;

import android.content.Context;
import android.os.Build;
import androidx.emoji2.text.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
import u9.n;
public final class c implements e, f {
    public final n f54987a;
    public final Context f54988b;
    public final ua.b f54989c;
    public final Set d;
    public final Executor f54990e;

    public c(Context context, String str, Set set, ua.b bVar, Executor executor) {
        this.f54987a = new n(new o9.c(context, str));
        this.d = set;
        this.f54990e = executor;
        this.f54989c = bVar;
        this.f54988b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        h hVar = (h) this.f54987a.get();
        if (hVar.g(currentTimeMillis)) {
            hVar.e();
            return 3;
        }
        return 1;
    }

    public final Task b() {
        boolean z9;
        if (Build.VERSION.SDK_INT >= 24) {
            z9 = w.g(this.f54988b);
        } else {
            z9 = true;
        }
        if (!z9) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f54990e, new b(this, 0));
    }

    public final void c() {
        boolean z9;
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z9 = w.g(this.f54988b);
        } else {
            z9 = true;
        }
        if (!z9) {
            Tasks.forResult(null);
            return;
        }
        Tasks.call(this.f54990e, new b(this, 1));
    }
}
