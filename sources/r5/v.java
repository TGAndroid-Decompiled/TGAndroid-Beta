package r5;

import c2.t0;
import com.google.android.gms.common.api.internal.q1;
import java.util.concurrent.atomic.AtomicReference;
import y5.a0;

public final class v extends g {

    public final AtomicReference f46814b;

    public final t0 f46815c;

    public v(w wVar) {
        this.f46814b = new AtomicReference(wVar);
        this.f46815c = new t0(wVar.f49636r, 1);
    }

    @Override
    public final void A0(String str, byte[] bArr) {
        if (((w) this.f46814b.get()) == null) {
            return;
        }
        w.f46816j0.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void D(d dVar) {
        w wVar = (w) this.f46814b.get();
        if (wVar == null) {
            return;
        }
        w.f46816j0.b("onDeviceStatusChanged", new Object[0]);
        this.f46815c.post(new o0.m(4, wVar, dVar));
    }

    @Override
    public final void L(m5.d dVar, String str, String str2, boolean z10) {
        w wVar = (w) this.f46814b.get();
        if (wVar == null) {
            return;
        }
        wVar.Q = dVar;
        wVar.f46824f0 = dVar.f17756a;
        wVar.f46825g0 = str2;
        wVar.X = str;
        synchronized (w.f46817k0) {
        }
    }

    @Override
    public final void M(int i10) {
        w wVar = null;
        w wVar2 = (w) this.f46814b.getAndSet(null);
        if (wVar2 != null) {
            wVar2.f46822d0 = -1;
            wVar2.f46823e0 = -1;
            wVar2.Q = null;
            wVar2.X = null;
            wVar2.f46820b0 = 0.0d;
            wVar2.I();
            wVar2.Y = false;
            wVar2.f46821c0 = null;
            wVar = wVar2;
        }
        if (wVar == null) {
            return;
        }
        w.f46816j0.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i10));
        if (i10 != 0) {
            int i11 = wVar.N.get();
            a0 a0Var = wVar.v;
            a0Var.sendMessage(a0Var.obtainMessage(6, i11, 2));
        }
    }

    @Override
    public final void P(String str, String str2) {
        w wVar = (w) this.f46814b.get();
        if (wVar == null) {
            return;
        }
        w.f46816j0.b("Receive (type=text, ns=%s) %s", str, str2);
        this.f46815c.post(new q1(wVar, str, str2, false, 13));
    }

    @Override
    public final void T(int i10) {
        if (((w) this.f46814b.get()) == null) {
            return;
        }
        synchronized (w.f46817k0) {
        }
    }

    @Override
    public final void V(long j10) {
        w wVar = (w) this.f46814b.get();
        if (wVar == null) {
            return;
        }
        w.G(wVar, j10, 0);
    }

    @Override
    public final void c(int i10) {
        if (((w) this.f46814b.get()) == null) {
            return;
        }
        synchronized (w.f46818l0) {
        }
    }

    @Override
    public final void y(c cVar) {
        w wVar = (w) this.f46814b.get();
        if (wVar == null) {
            return;
        }
        w.f46816j0.b("onApplicationStatusChanged", new Object[0]);
        this.f46815c.post(new o0.m(5, wVar, cVar));
    }

    @Override
    public final void zzd(int i10) {
        w wVar = (w) this.f46814b.get();
        if (wVar == null) {
            return;
        }
        wVar.f46824f0 = null;
        wVar.f46825g0 = null;
        synchronized (w.f46818l0) {
        }
        if (wVar.S != null) {
            this.f46815c.post(new androidx.emoji2.text.j(wVar, i10, 4));
        }
    }

    @Override
    public final void zzg(int i10) {
        if (((w) this.f46814b.get()) == null) {
            return;
        }
        synchronized (w.f46818l0) {
        }
    }

    @Override
    public final void zzm(int i10, long j10) {
        w wVar = (w) this.f46814b.get();
        if (wVar == null) {
            return;
        }
        w.G(wVar, j10, i10);
    }

    @Override
    public final void zzn() {
        w.f46816j0.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override
    public final void d(int i10) {
    }

    @Override
    public final void w0(int i10) {
    }
}
