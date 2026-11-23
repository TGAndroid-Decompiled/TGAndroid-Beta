package sa;

import android.content.Context;
import android.os.Build;
import androidx.emoji2.text.x;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
import u9.m;
public final class c implements e, f {
    public final m f57139a;
    public final Context f57140b;
    public final ua.b f57141c;
    public final Set d;
    public final Executor f57142e;

    public c(Context context, String str, Set set, ua.b bVar, Executor executor) {
        this.f57139a = new m(new o9.c(context, str));
        this.d = set;
        this.f57142e = executor;
        this.f57141c = bVar;
        this.f57140b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        h hVar = (h) this.f57139a.get();
        if (hVar.g(currentTimeMillis)) {
            hVar.e();
            return 3;
        }
        return 1;
    }

    public final Task b() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = x.g(this.f57140b);
        } else {
            z10 = true;
        }
        if (!z10) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f57142e, new b(this, 0));
    }

    public final void c() {
        boolean z10;
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = x.g(this.f57140b);
        } else {
            z10 = true;
        }
        if (!z10) {
            Tasks.forResult(null);
            return;
        }
        Tasks.call(this.f57142e, new b(this, 1));
    }
}
