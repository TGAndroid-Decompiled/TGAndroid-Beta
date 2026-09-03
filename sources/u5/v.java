package u5;

import b6.b0;
import com.google.android.gms.common.api.internal.s1;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.az;
public final class v extends g {
    public final AtomicReference f45202b;
    public final a7.e f45203c;

    public v(w wVar) {
        this.f45202b = new AtomicReference(wVar);
        this.f45203c = new a7.e(wVar.f1600r, 2);
    }

    @Override
    public final void I(int i10) {
        w wVar = null;
        w wVar2 = (w) this.f45202b.getAndSet(null);
        if (wVar2 != null) {
            wVar2.f45210e0 = -1;
            wVar2.f45211f0 = -1;
            wVar2.R = null;
            wVar2.Y = null;
            wVar2.f45208c0 = 0.0d;
            wVar2.I();
            wVar2.Z = false;
            wVar2.f45209d0 = null;
            wVar = wVar2;
        }
        if (wVar != null) {
            w.f45204k0.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i10));
            if (i10 != 0) {
                int i11 = wVar.O.get();
                b0 b0Var = wVar.v;
                b0Var.sendMessage(b0Var.obtainMessage(6, i11, 2));
            }
        }
    }

    @Override
    public final void L(d dVar) {
        w wVar = (w) this.f45202b.get();
        if (wVar == null) {
            return;
        }
        w.f45204k0.b("onDeviceStatusChanged", new Object[0]);
        this.f45203c.post(new az(wVar, dVar, false, 8));
    }

    @Override
    public final void M(String str, String str2) {
        w wVar = (w) this.f45202b.get();
        if (wVar == null) {
            return;
        }
        w.f45204k0.b("Receive (type=text, ns=%s) %s", str, str2);
        this.f45203c.post(new s1(wVar, str, str2, false, 13));
    }

    @Override
    public final void U(int i10) {
        if (((w) this.f45202b.get()) == null) {
            return;
        }
        synchronized (w.f45205l0) {
        }
    }

    @Override
    public final void W(long j10) {
        w wVar = (w) this.f45202b.get();
        if (wVar == null) {
            return;
        }
        w.G(wVar, j10, 0);
    }

    @Override
    public final void a(int i10) {
        if (((w) this.f45202b.get()) == null) {
            return;
        }
        synchronized (w.m0) {
        }
    }

    @Override
    public final void n0(c cVar) {
        w wVar = (w) this.f45202b.get();
        if (wVar == null) {
            return;
        }
        w.f45204k0.b("onApplicationStatusChanged", new Object[0]);
        this.f45203c.post(new az(wVar, cVar, false, 9));
    }

    @Override
    public final void t0(q5.d dVar, String str, String str2, boolean z4) {
        w wVar = (w) this.f45202b.get();
        if (wVar == null) {
            return;
        }
        wVar.R = dVar;
        wVar.f45212g0 = dVar.f42809a;
        wVar.f45213h0 = str2;
        wVar.Y = str;
        synchronized (w.f45205l0) {
        }
    }

    @Override
    public final void z0(String str, byte[] bArr) {
        if (((w) this.f45202b.get()) == null) {
            return;
        }
        w.f45204k0.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void zzd(int i10) {
        w wVar = (w) this.f45202b.get();
        if (wVar != null) {
            wVar.f45212g0 = null;
            wVar.f45213h0 = null;
            synchronized (w.m0) {
            }
            if (wVar.T != null) {
                this.f45203c.post(new androidx.emoji2.text.j(wVar, i10, 4));
            }
        }
    }

    @Override
    public final void zzg(int i10) {
        if (((w) this.f45202b.get()) == null) {
            return;
        }
        synchronized (w.m0) {
        }
    }

    @Override
    public final void zzm(int i10, long j10) {
        w wVar = (w) this.f45202b.get();
        if (wVar == null) {
            return;
        }
        w.G(wVar, j10, i10);
    }

    @Override
    public final void zzn() {
        w.f45204k0.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override
    public final void d(int i10) {
    }

    @Override
    public final void u0(int i10) {
    }
}
