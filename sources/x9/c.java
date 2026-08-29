package x9;

import a9.i;
import android.content.Context;
import android.os.Build;
import androidx.emoji2.text.v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
public final class c implements e, f {
    public final i f50108a;
    public final Context f50109b;
    public final z9.b f50110c;
    public final Set d;
    public final Executor f50111e;

    public c(Context context, String str, Set set, z9.b bVar, Executor executor) {
        this.f50108a = new i(2, context, str);
        this.d = set;
        this.f50111e = executor;
        this.f50110c = bVar;
        this.f50109b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        g gVar = (g) this.f50108a.get();
        if (gVar.i(currentTimeMillis)) {
            gVar.g();
            return 3;
        }
        return 1;
    }

    public final Task b() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = v.g(this.f50109b);
        } else {
            z10 = true;
        }
        if (!z10) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f50111e, new b(this, 0));
    }

    public final void c() {
        boolean z10;
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = v.g(this.f50109b);
        } else {
            z10 = true;
        }
        if (!z10) {
            Tasks.forResult(null);
            return;
        }
        Tasks.call(this.f50111e, new b(this, 1));
    }
}
