package q5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s1;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.zy;
public final class d0 extends u5.g {
    public final e0 f44536b;

    public d0(e0 e0Var) {
        this.f44536b = e0Var;
    }

    @Override
    public final void I(int i10) {
        e0.k(this.f44536b).post(new c0(this, i10, 0));
    }

    @Override
    public final void L(u5.d dVar) {
        e0.k(this.f44536b).post(new zy(this, dVar, false, 5));
    }

    @Override
    public final void M(String str, String str2) {
        e0.G.b("Receive (type=text, ns=%s) %s", str, str2);
        e0.k(this.f44536b).post(new s1(this, str, str2, false, 12));
    }

    @Override
    public final void U(int i10) {
        this.f44536b.i(i10);
    }

    @Override
    public final void W(long j10) {
        e0.f(this.f44536b, j10, 0);
    }

    @Override
    public final void c(int i10) {
        e0.g(this.f44536b, i10);
    }

    @Override
    public final void d(int i10) {
        e0.k(this.f44536b).post(new c0(this, i10, 1));
    }

    @Override
    public final void n0(u5.c cVar) {
        e0.k(this.f44536b).post(new zy(this, cVar, false, 6));
    }

    @Override
    public final void t0(d dVar, String str, String str2, boolean z4) {
        e0 e0Var = this.f44536b;
        e0Var.f44549t = dVar;
        e0Var.f44550u = str;
        u5.u uVar = new u5.u(new Status(0, null, null, null), dVar, str, str2, z4);
        synchronized (e0Var.f44547r) {
            try {
                TaskCompletionSource taskCompletionSource = e0Var.f44544o;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(uVar);
                }
                e0Var.f44544o = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void u0(int i10) {
        e0.k(this.f44536b).post(new c0(this, i10, 3));
    }

    @Override
    public final void z0(String str, byte[] bArr) {
        e0.G.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void zzd(int i10) {
        e0 e0Var = this.f44536b;
        e0.g(e0Var, i10);
        if (e0Var.D != null) {
            e0.k(e0Var).post(new c0(this, i10, 2));
        }
    }

    @Override
    public final void zzg(int i10) {
        e0.g(this.f44536b, i10);
    }

    @Override
    public final void zzm(int i10, long j10) {
        e0.f(this.f44536b, j10, i10);
    }

    @Override
    public final void zzn() {
        e0.G.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }
}
