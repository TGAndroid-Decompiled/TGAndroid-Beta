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
public final class f0 extends com.google.android.gms.common.api.j implements g0 {
    public static final u5.b G = new u5.b("CastClient", null);
    public static final com.google.android.gms.common.api.e H = new com.google.android.gms.common.api.e("Cast.API_CXLESS", new a8.j(14), u5.j.f48394a);
    public final CastDevice A;
    public final HashMap B;
    public final HashMap C;
    public final r5.e0 D;
    public final List E;
    public int F;
    public final e0 f44574k;
    public a7.e f44575l;
    public boolean f44576m;
    public boolean f44577n;
    public TaskCompletionSource f44578o;
    public TaskCompletionSource f44579p;
    public final AtomicLong f44580q;
    public final Object f44581r;
    public final Object f44582s;
    public d f44583t;
    public String f44584u;
    public double v;
    public boolean f44585w;
    public int f44586x;
    public int f44587y;
    public x f44588z;

    public f0(Context context, e eVar) {
        super(context, H, eVar, com.google.android.gms.common.api.i.f2658c);
        this.f44574k = new e0(this);
        this.f44581r = new Object();
        this.f44582s = new Object();
        this.E = DesugarCollections.synchronizedList(new ArrayList());
        this.D = eVar.f44571b;
        this.A = eVar.f44570a;
        this.B = new HashMap();
        this.C = new HashMap();
        this.f44580q = new AtomicLong(0L);
        this.F = 1;
        j();
    }

    public static void f(f0 f0Var, long j10, int i10) {
        TaskCompletionSource taskCompletionSource;
        synchronized (f0Var.B) {
            HashMap hashMap = f0Var.B;
            Long valueOf = Long.valueOf(j10);
            taskCompletionSource = (TaskCompletionSource) hashMap.get(valueOf);
            f0Var.B.remove(valueOf);
        }
        if (taskCompletionSource != null) {
            if (i10 == 0) {
                taskCompletionSource.setResult(null);
            } else {
                taskCompletionSource.setException(b6.m.m(new Status(i10, null, null, null)));
            }
        }
    }

    public static void g(f0 f0Var, int i10) {
        synchronized (f0Var.f44582s) {
            try {
                TaskCompletionSource taskCompletionSource = f0Var.f44579p;
                if (taskCompletionSource == null) {
                    return;
                }
                if (i10 == 0) {
                    taskCompletionSource.setResult(new Status(0, null, null, null));
                } else {
                    taskCompletionSource.setException(b6.m.m(new Status(i10, null, null, null)));
                }
                f0Var.f44579p = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Handler k(f0 f0Var) {
        if (f0Var.f44575l == null) {
            f0Var.f44575l = new a7.e(f0Var.f2856f, 2);
        }
        return f0Var.f44575l;
    }

    public final void h() {
        G.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.C) {
            this.C.clear();
        }
    }

    public final void i(int i10) {
        synchronized (this.f44581r) {
            try {
                TaskCompletionSource taskCompletionSource = this.f44578o;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setException(b6.m.m(new Status(i10, null, null, null)));
                }
                this.f44578o = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        CastDevice castDevice = this.A;
        if (!castDevice.f(2048) && castDevice.f(4) && !castDevice.f(1)) {
            "Chromecast Audio".equals(castDevice.f2598e);
        }
    }
}
