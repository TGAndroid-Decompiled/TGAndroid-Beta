package q5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s1;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.az;
public final class e0 extends u5.g {
    public final f0 f42821b;

    public e0(f0 f0Var) {
        this.f42821b = f0Var;
    }

    @Override
    public final void I(int i10) {
        f0.k(this.f42821b).post(new d0(this, i10, 0));
    }

    @Override
    public final void L(u5.d dVar) {
        f0.k(this.f42821b).post(new az(this, dVar, false, 5));
    }

    @Override
    public final void M(String str, String str2) {
        f0.G.b("Receive (type=text, ns=%s) %s", str, str2);
        f0.k(this.f42821b).post(new s1(this, str, str2, false, 12));
    }

    @Override
    public final void U(int i10) {
        this.f42821b.i(i10);
    }

    @Override
    public final void W(long j10) {
        f0.f(this.f42821b, j10, 0);
    }

    @Override
    public final void a(int i10) {
        f0.g(this.f42821b, i10);
    }

    @Override
    public final void d(int i10) {
        f0.k(this.f42821b).post(new d0(this, i10, 1));
    }

    @Override
    public final void n0(u5.c cVar) {
        f0.k(this.f42821b).post(new az(this, cVar, false, 6));
    }

    @Override
    public final void t0(d dVar, String str, String str2, boolean z4) {
        f0 f0Var = this.f42821b;
        f0Var.f42831t = dVar;
        f0Var.f42832u = str;
        u5.u uVar = new u5.u(new Status(0, null, null, null), dVar, str, str2, z4);
        synchronized (f0Var.f42829r) {
            try {
                TaskCompletionSource taskCompletionSource = f0Var.f42826o;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(uVar);
                }
                f0Var.f42826o = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void u0(int i10) {
        f0.k(this.f42821b).post(new d0(this, i10, 3));
    }

    @Override
    public final void z0(String str, byte[] bArr) {
        f0.G.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void zzd(int i10) {
        f0 f0Var = this.f42821b;
        f0.g(f0Var, i10);
        if (f0Var.D != null) {
            f0.k(f0Var).post(new d0(this, i10, 2));
        }
    }

    @Override
    public final void zzg(int i10) {
        f0.g(this.f42821b, i10);
    }

    @Override
    public final void zzm(int i10, long j10) {
        f0.f(this.f42821b, j10, i10);
    }

    @Override
    public final void zzn() {
        f0.G.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }
}
