package q5;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
public final class e0 extends com.google.android.gms.common.api.j implements f0 {
    public static final u5.b G = new u5.b("CastClient", null);
    public static final com.google.android.gms.common.api.e H = new com.google.android.gms.common.api.e("Cast.API_CXLESS", new a8.j(14), u5.j.f45106a);
    public final CastDevice A;
    public final HashMap B;
    public final HashMap C;
    public final r5.e0 D;
    public final List E;
    public int F;
    public final d0 f42789k;
    public a7.e f42790l;
    public boolean f42791m;
    public boolean f42792n;
    public TaskCompletionSource f42793o;
    public TaskCompletionSource f42794p;
    public final AtomicLong f42795q;
    public final Object f42796r;
    public final Object f42797s;
    public d f42798t;
    public String f42799u;
    public double v;
    public boolean f42800w;
    public int f42801x;
    public int f42802y;
    public x f42803z;

    public e0(Context context, e eVar) {
        super(context, H, eVar, com.google.android.gms.common.api.i.f2730c);
        this.f42789k = new d0(this);
        this.f42796r = new Object();
        this.f42797s = new Object();
        this.E = DesugarCollections.synchronizedList(new ArrayList());
        this.D = eVar.f42787b;
        this.A = eVar.f42786a;
        this.B = new HashMap();
        this.C = new HashMap();
        this.f42795q = new AtomicLong(0L);
        this.F = 1;
        j();
    }

    public static void f(e0 e0Var, long j10, int i10) {
        TaskCompletionSource taskCompletionSource;
        synchronized (e0Var.B) {
            HashMap hashMap = e0Var.B;
            Long valueOf = Long.valueOf(j10);
            taskCompletionSource = (TaskCompletionSource) hashMap.get(valueOf);
            e0Var.B.remove(valueOf);
        }
        if (taskCompletionSource != null) {
            if (i10 == 0) {
                taskCompletionSource.setResult(null);
            } else {
                taskCompletionSource.setException(b6.m.m(new Status(i10, null, null, null)));
            }
        }
    }

    public static void g(e0 e0Var, int i10) {
        synchronized (e0Var.f42797s) {
            try {
                TaskCompletionSource taskCompletionSource = e0Var.f42794p;
                if (taskCompletionSource == null) {
                    return;
                }
                if (i10 == 0) {
                    taskCompletionSource.setResult(new Status(0, null, null, null));
                } else {
                    taskCompletionSource.setException(b6.m.m(new Status(i10, null, null, null)));
                }
                e0Var.f42794p = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Handler k(e0 e0Var) {
        if (e0Var.f42790l == null) {
            e0Var.f42790l = new a7.e(e0Var.f2914f, 2);
        }
        return e0Var.f42790l;
    }

    public final void h() {
        G.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.C) {
            this.C.clear();
        }
    }

    public final void i(int i10) {
        synchronized (this.f42796r) {
            try {
                TaskCompletionSource taskCompletionSource = this.f42793o;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setException(b6.m.m(new Status(i10, null, null, null)));
                }
                this.f42793o = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        CastDevice castDevice = this.A;
        if (!castDevice.f(2048) && castDevice.f(4) && !castDevice.f(1)) {
            "Chromecast Audio".equals(castDevice.e);
        }
    }
}
