package q5;

import c2.u0;
import com.google.android.gms.common.api.internal.q1;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.fm;
import x5.a0;
public final class v extends g {
    public final AtomicReference f46055b;
    public final u0 f46056c;

    public v(w wVar) {
        this.f46055b = new AtomicReference(wVar);
        this.f46056c = new u0(wVar.f48919r, 1);
    }

    @Override
    public final void A0(String str, byte[] bArr) {
        if (((w) this.f46055b.get()) == null) {
            return;
        }
        w.f46057j0.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void L(m5.d dVar, String str, String str2, boolean z10) {
        w wVar = (w) this.f46055b.get();
        if (wVar == null) {
            return;
        }
        wVar.Q = dVar;
        wVar.f46065f0 = dVar.f17379a;
        wVar.f46066g0 = str2;
        wVar.X = str;
        synchronized (w.f46058k0) {
        }
    }

    @Override
    public final void M(int i9) {
        w wVar = null;
        w wVar2 = (w) this.f46055b.getAndSet(null);
        if (wVar2 != null) {
            wVar2.f46063d0 = -1;
            wVar2.f46064e0 = -1;
            wVar2.Q = null;
            wVar2.X = null;
            wVar2.f46061b0 = 0.0d;
            wVar2.I();
            wVar2.Y = false;
            wVar2.f46062c0 = null;
            wVar = wVar2;
        }
        if (wVar != null) {
            w.f46057j0.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i9));
            if (i9 != 0) {
                int i10 = wVar.N.get();
                a0 a0Var = wVar.v;
                a0Var.sendMessage(a0Var.obtainMessage(6, i10, 2));
            }
        }
    }

    @Override
    public final void P(String str, String str2) {
        w wVar = (w) this.f46055b.get();
        if (wVar == null) {
            return;
        }
        w.f46057j0.b("Receive (type=text, ns=%s) %s", str, str2);
        this.f46056c.post(new q1(wVar, str, str2, false, 13));
    }

    @Override
    public final void T(int i9) {
        if (((w) this.f46055b.get()) == null) {
            return;
        }
        synchronized (w.f46058k0) {
        }
    }

    @Override
    public final void V(long j10) {
        w wVar = (w) this.f46055b.get();
        if (wVar == null) {
            return;
        }
        w.G(wVar, j10, 0);
    }

    @Override
    public final void c(int i9) {
        if (((w) this.f46055b.get()) == null) {
            return;
        }
        synchronized (w.f46059l0) {
        }
    }

    @Override
    public final void v(d dVar) {
        w wVar = (w) this.f46055b.get();
        if (wVar == null) {
            return;
        }
        w.f46057j0.b("onDeviceStatusChanged", new Object[0]);
        this.f46056c.post(new fm(wVar, dVar, false, 3));
    }

    @Override
    public final void v0(c cVar) {
        w wVar = (w) this.f46055b.get();
        if (wVar == null) {
            return;
        }
        w.f46057j0.b("onApplicationStatusChanged", new Object[0]);
        this.f46056c.post(new fm(wVar, cVar, false, 4));
    }

    @Override
    public final void zzd(int i9) {
        w wVar = (w) this.f46055b.get();
        if (wVar != null) {
            wVar.f46065f0 = null;
            wVar.f46066g0 = null;
            synchronized (w.f46059l0) {
            }
            if (wVar.S != null) {
                this.f46056c.post(new androidx.emoji2.text.i(wVar, i9, 4));
            }
        }
    }

    @Override
    public final void zzg(int i9) {
        if (((w) this.f46055b.get()) == null) {
            return;
        }
        synchronized (w.f46059l0) {
        }
    }

    @Override
    public final void zzm(int i9, long j10) {
        w wVar = (w) this.f46055b.get();
        if (wVar == null) {
            return;
        }
        w.G(wVar, j10, i9);
    }

    @Override
    public final void zzn() {
        w.f46057j0.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override
    public final void d(int i9) {
    }

    @Override
    public final void u0(int i9) {
    }
}
