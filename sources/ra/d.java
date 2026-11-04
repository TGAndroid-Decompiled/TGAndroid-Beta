package ra;

import android.content.Context;
import android.os.Build;
import androidx.emoji2.text.x;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
import t9.n;
public final class d implements f, g {
    public final n f54457a;
    public final Context f54458b;
    public final ta.b f54459c;
    public final Set d;
    public final Executor f54460e;

    public d(Context context, String str, Set set, ta.b bVar, Executor executor) {
        this.f54457a = new n(new n9.d(context, str));
        this.d = set;
        this.f54460e = executor;
        this.f54459c = bVar;
        this.f54458b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        i iVar = (i) this.f54457a.get();
        if (iVar.g(currentTimeMillis)) {
            iVar.e();
            return 3;
        }
        return 1;
    }

    public final Task b() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = x.g(this.f54458b);
        } else {
            z10 = true;
        }
        if (!z10) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f54460e, new c(this, 0));
    }

    public final void c() {
        boolean z10;
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = x.g(this.f54458b);
        } else {
            z10 = true;
        }
        if (!z10) {
            Tasks.forResult(null);
            return;
        }
        Tasks.call(this.f54460e, new c(this, 1));
    }
}
