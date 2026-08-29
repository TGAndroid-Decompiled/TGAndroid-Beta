package s5;

import c2.v0;
import com.google.android.gms.common.api.internal.q1;
import java.util.concurrent.atomic.AtomicReference;
import z5.a0;
public final class v extends g {
    public final AtomicReference f47626b;
    public final v0 f47627c;

    public v(w wVar) {
        this.f47626b = new AtomicReference(wVar);
        this.f47627c = new v0(wVar.f50619r, 1);
    }

    @Override
    public final void K(int i10) {
        w wVar = null;
        w wVar2 = (w) this.f47626b.getAndSet(null);
        if (wVar2 != null) {
            wVar2.f47634d0 = -1;
            wVar2.f47635e0 = -1;
            wVar2.Q = null;
            wVar2.X = null;
            wVar2.f47632b0 = 0.0d;
            wVar2.I();
            wVar2.Y = false;
            wVar2.f47633c0 = null;
            wVar = wVar2;
        }
        if (wVar != null) {
            w.f47628j0.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i10));
            if (i10 != 0) {
                int i11 = wVar.N.get();
                a0 a0Var = wVar.v;
                a0Var.sendMessage(a0Var.obtainMessage(6, i11, 2));
            }
        }
    }

    @Override
    public final void N(String str, String str2) {
        w wVar = (w) this.f47626b.get();
        if (wVar == null) {
            return;
        }
        w.f47628j0.b("Receive (type=text, ns=%s) %s", str, str2);
        this.f47627c.post(new q1(wVar, str, str2, false, 13));
    }

    @Override
    public final void S(int i10) {
        if (((w) this.f47626b.get()) == null) {
            return;
        }
        synchronized (w.f47629k0) {
        }
    }

    @Override
    public final void T(d dVar) {
        w wVar = (w) this.f47626b.get();
        if (wVar == null) {
            return;
        }
        w.f47628j0.b("onDeviceStatusChanged", new Object[0]);
        this.f47627c.post(new od.i(wVar, dVar, false, 8));
    }

    @Override
    public final void U(long j10) {
        w wVar = (w) this.f47626b.get();
        if (wVar == null) {
            return;
        }
        w.G(wVar, j10, 0);
    }

    @Override
    public final void c(int i10) {
        if (((w) this.f47626b.get()) == null) {
            return;
        }
        synchronized (w.f47630l0) {
        }
    }

    @Override
    public final void h(c cVar) {
        w wVar = (w) this.f47626b.get();
        if (wVar == null) {
            return;
        }
        w.f47628j0.b("onApplicationStatusChanged", new Object[0]);
        this.f47627c.post(new od.i(wVar, cVar, false, 9));
    }

    @Override
    public final void z(o5.d dVar, String str, String str2, boolean z10) {
        w wVar = (w) this.f47626b.get();
        if (wVar == null) {
            return;
        }
        wVar.Q = dVar;
        wVar.f47636f0 = dVar.f19241a;
        wVar.f47637g0 = str2;
        wVar.X = str;
        synchronized (w.f47629k0) {
        }
    }

    @Override
    public final void z0(String str, byte[] bArr) {
        if (((w) this.f47626b.get()) == null) {
            return;
        }
        w.f47628j0.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void zzd(int i10) {
        w wVar = (w) this.f47626b.get();
        if (wVar != null) {
            wVar.f47636f0 = null;
            wVar.f47637g0 = null;
            synchronized (w.f47630l0) {
            }
            if (wVar.S != null) {
                this.f47627c.post(new androidx.emoji2.text.j(wVar, i10, 4));
            }
        }
    }

    @Override
    public final void zzg(int i10) {
        if (((w) this.f47626b.get()) == null) {
            return;
        }
        synchronized (w.f47630l0) {
        }
    }

    @Override
    public final void zzm(int i10, long j10) {
        w wVar = (w) this.f47626b.get();
        if (wVar == null) {
            return;
        }
        w.G(wVar, j10, i10);
    }

    @Override
    public final void zzn() {
        w.f47628j0.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override
    public final void d(int i10) {
    }

    @Override
    public final void s0(int i10) {
    }
}
