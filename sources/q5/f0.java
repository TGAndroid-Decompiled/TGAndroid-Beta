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
    public static final com.google.android.gms.common.api.e H = new com.google.android.gms.common.api.e("Cast.API_CXLESS", new a8.j(14), u5.j.f45168a);
    public final CastDevice A;
    public final HashMap B;
    public final HashMap C;
    public final r5.e0 D;
    public final List E;
    public int F;
    public final e0 f42822k;
    public a7.e f42823l;
    public boolean f42824m;
    public boolean f42825n;
    public TaskCompletionSource f42826o;
    public TaskCompletionSource f42827p;
    public final AtomicLong f42828q;
    public final Object f42829r;
    public final Object f42830s;
    public d f42831t;
    public String f42832u;
    public double v;
    public boolean f42833w;
    public int f42834x;
    public int f42835y;
    public x f42836z;

    public f0(Context context, e eVar) {
        super(context, H, eVar, com.google.android.gms.common.api.i.f2713c);
        this.f42822k = new e0(this);
        this.f42829r = new Object();
        this.f42830s = new Object();
        this.E = DesugarCollections.synchronizedList(new ArrayList());
        this.D = eVar.f42819b;
        this.A = eVar.f42818a;
        this.B = new HashMap();
        this.C = new HashMap();
        this.f42828q = new AtomicLong(0L);
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
        synchronized (f0Var.f42830s) {
            try {
                TaskCompletionSource taskCompletionSource = f0Var.f42827p;
                if (taskCompletionSource == null) {
                    return;
                }
                if (i10 == 0) {
                    taskCompletionSource.setResult(new Status(0, null, null, null));
                } else {
                    taskCompletionSource.setException(b6.m.m(new Status(i10, null, null, null)));
                }
                f0Var.f42827p = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Handler k(f0 f0Var) {
        if (f0Var.f42823l == null) {
            f0Var.f42823l = new a7.e(f0Var.f2897f, 2);
        }
        return f0Var.f42823l;
    }

    public final void h() {
        G.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.C) {
            this.C.clear();
        }
    }

    public final void i(int i10) {
        synchronized (this.f42829r) {
            try {
                TaskCompletionSource taskCompletionSource = this.f42826o;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setException(b6.m.m(new Status(i10, null, null, null)));
                }
                this.f42826o = null;
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
