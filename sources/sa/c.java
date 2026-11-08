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
    public final n f54988a;
    public final Context f54989b;
    public final ua.b f54990c;
    public final Set d;
    public final Executor f54991e;

    public c(Context context, String str, Set set, ua.b bVar, Executor executor) {
        this.f54988a = new n(new o9.c(context, str));
        this.d = set;
        this.f54991e = executor;
        this.f54990c = bVar;
        this.f54989b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        h hVar = (h) this.f54988a.get();
        if (hVar.g(currentTimeMillis)) {
            hVar.e();
            return 3;
        }
        return 1;
    }

    public final Task b() {
        boolean z9;
        if (Build.VERSION.SDK_INT >= 24) {
            z9 = w.g(this.f54989b);
        } else {
            z9 = true;
        }
        if (!z9) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f54991e, new b(this, 0));
    }

    public final void c() {
        boolean z9;
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z9 = w.g(this.f54989b);
        } else {
            z9 = true;
        }
        if (!z9) {
            Tasks.forResult(null);
            return;
        }
        Tasks.call(this.f54991e, new b(this, 1));
    }
}
