package wi;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.y00;
import org.telegram.ui.Components.zw;
import org.telegram.ui.na1;
import x7.u5;
public final class t0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public volatile boolean G;
    public long H;
    public long I;
    public long J;
    public long K;
    public long M;
    public long N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public volatile p0 S;
    public volatile w T;
    public volatile File U;
    public k2.i0 V;
    public final g2.a0 Y;
    public final Context f58053a;
    public final TextureView f58055b;
    public final File f58056c;
    public final y00 d;
    public final q0 f58057e;
    public final zw f58058f;
    public final j f58063l;
    public final n f58064m;
    public final r0 f58065n;
    public final int f58066o;
    public final o0 f58067p;
    public final long f58068q;
    public m0 f58069r;
    public m0 f58070s;
    public n0 f58071t;
    public o0 f58072u;
    public boolean f58073w;
    public boolean f58074x;
    public boolean f58075y;
    public boolean f58076z;
    public final Object f58059g = new Object();
    public final Matrix h = new Matrix();
    public final Handler f58060i = new Handler(Looper.getMainLooper());
    public final ExecutorService f58061j = Executors.newSingleThreadExecutor(new g2.m0(9));
    public final ExecutorService f58062k = Executors.newSingleThreadExecutor(new g2.m0(10));
    public int Z = 1;
    public int f58054a0 = 1;
    public float v = 1.0f;
    public long L = 1;
    public final h0 W = new h0(this, 0);
    public final i0 X = new i0(this, 0);

    public t0(k0 k0Var) {
        Context context;
        nh nhVar = new nh(this, 28);
        this.Y = new g2.a0(this, 3);
        u();
        Context context2 = k0Var.f57931a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f58053a = context;
        TextureView textureView = k0Var.f57932b;
        this.f58055b = textureView;
        File file = k0Var.f57933c;
        this.f58056c = file == null ? context.getCacheDir() : file;
        this.f58069r = k0Var.d;
        r0 r0Var = k0Var.f57934e;
        this.f58065n = r0Var;
        int i3 = k0Var.h;
        this.f58066o = i3;
        n0 n0Var = k0Var.f57935f;
        o0 o0Var = k0Var.f57936g;
        this.f58067p = o0Var;
        this.f58068q = 60000L;
        boolean z10 = k0Var.f57937i;
        this.d = k0Var.f57938j;
        this.f58057e = k0Var.f57939k;
        this.f58058f = k0Var.f57940l;
        n nVar = new n();
        this.f58064m = nVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(r0Var.f58000a);
        sb2.append("x");
        com.google.android.recaptcha.internal.a.r(sb2, r0Var.f58000a, ", bitrate=", i3, ", cameraMode=");
        sb2.append(n0Var);
        sb2.append(", fps=");
        sb2.append(o0Var.f57986a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.f58069r);
        sb2.append(", maxDurationMs=60000");
        nVar.b(sb2.toString());
        this.f58063l = new j(context, textureView, r0Var, i3, n0Var, o0Var, z10, nVar, nhVar);
    }

    public static long f(long j10) {
        return (System.nanoTime() - j10) / 1000000;
    }

    public static void u() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("RoundVideoSession must be used from the main thread");
    }

    public final boolean a() {
        u();
        int i3 = this.Z;
        if (i3 != 10 && i3 != 8) {
            this.f58064m.b("cancel requested: state=".concat(t4.c.t(i3)));
            b(3, true);
            e();
            s();
            w(10);
            if (!this.E && !this.f58063l.Y()) {
                i();
                return true;
            }
            this.E = true;
            this.C = true;
            return true;
        }
        return false;
    }

    public final boolean b(int i3, boolean z10) {
        synchronized (this.f58059g) {
            try {
                p0 p0Var = this.S;
                if (p0Var != null && p0Var.f57995e && !z10) {
                    return false;
                }
                this.G = true;
                if (p0Var != null && !p0Var.d) {
                    p0Var.d = true;
                    n nVar = this.f58064m;
                    nVar.b("output generation invalidated: id=" + p0Var.f57992a + ", reason=" + t4.c.s(i3) + ", availableSize=" + p0Var.f57994c);
                    this.f58062k.execute(new g0(this, p0Var, i3, 2));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z10) {
        synchronized (this.f58059g) {
            g();
            File d = d("round_video_");
            long j10 = this.L;
            this.L = 1 + j10;
            p0 p0Var = new p0(j10, d);
            this.S = p0Var;
            this.T = new w(d, this.f58065n.f58000a, z10, this.f58064m, new na1(21, this, p0Var));
            n nVar = this.f58064m;
            nVar.b("output generation started: id=" + j10 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.f58062k.execute(new iv0(this, p0Var, d, 24));
        }
    }

    public final File d(String str) {
        File file = this.f58056c;
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException("Round-video output path is not a directory: " + file);
            }
        } else if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException("Cannot create round-video output directory: " + file);
        }
        return File.createTempFile(str, ".mp4", file);
    }

    public final void e() {
        this.f58073w = false;
        j jVar = this.f58063l;
        jVar.U(0.0f);
        jVar.T(false);
        v(false);
    }

    public final void g() {
        if (!this.G) {
            return;
        }
        throw new IOException("Round-video operation was cancelled");
    }

    public final void h(Exception exc) {
        int i3 = this.Z;
        if (i3 != 9 && i3 != 10) {
            this.f58064m.a("fatal error in state=".concat(t4.c.t(i3)), exc);
            if (b(4, false)) {
                e();
                s();
                this.f58060i.removeCallbacks(this.W);
                p0 p0Var = this.S;
                if (p0Var != null) {
                    this.f58062k.execute(new g0(this, p0Var, exc));
                }
                w(9);
                m("error");
                j40 j40Var = (j40) this.d.f40562a;
                j40Var.A();
                a8.g(exc, true);
                gy0 gy0Var = j40Var.T;
                if (gy0Var != null) {
                    gy0Var.d(true);
                }
                j40Var.T = null;
                MediaController.B().Y(false);
                if (j40Var.f34936g0) {
                    j40Var.x(6);
                } else {
                    hs.f(j40Var.f34934f).k(hs.f23265m2, Integer.valueOf(j40Var.h));
                }
                j40Var.z(false, false);
                if (!this.E && !this.f58063l.Y()) {
                    i();
                    return;
                }
                this.E = true;
                this.C = true;
            }
        }
    }

    public final void i() {
        if (this.F) {
            return;
        }
        this.F = true;
        m("cancelled");
        h0 h0Var = new h0(this, 1);
        ExecutorService executorService = this.f58061j;
        executorService.execute(h0Var);
        this.f58063l.M();
        this.f58060i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.f58062k.shutdown();
    }

    public final long j() {
        u();
        if (this.Z != 3) {
            return this.H;
        }
        return Math.min(this.f58068q, (SystemClock.elapsedRealtime() + this.H) - this.I);
    }

    public final void k(p0 p0Var, int i3) {
        synchronized (this.f58059g) {
            try {
                if (!p0Var.d && !p0Var.f57995e) {
                    p0Var.d = true;
                    n nVar = this.f58064m;
                    nVar.b("output generation invalidated: id=" + p0Var.f57992a + ", reason=" + t4.c.s(i3) + ", availableSize=" + p0Var.f57994c);
                    this.f58062k.execute(new g0(this, p0Var, i3, 0));
                }
            } finally {
            }
        }
    }

    public final boolean l() {
        long j10 = this.N;
        if (j10 <= 0) {
            j10 = this.H;
        }
        if (j10 <= this.f58068q && this.J <= 0 && this.K + 10 >= j10) {
            return false;
        }
        return true;
    }

    public final void m(String str) {
        long j10;
        if (this.R) {
            return;
        }
        this.R = true;
        p0 p0Var = this.S;
        n nVar = this.f58064m;
        StringBuilder u10 = a1.g.u("session summary: terminal=", str, ", state=");
        u10.append(t4.c.t(this.Z));
        u10.append(", durationMs=");
        u10.append(j());
        u10.append(", pauses=");
        u10.append(this.O);
        u10.append(", resumes=");
        u10.append(this.P);
        u10.append(", cameraSwitches=");
        u10.append(this.Q);
        u10.append(", facing=");
        u10.append(this.f58070s);
        u10.append(", cameraMode=");
        u10.append(this.f58071t);
        u10.append(", generation=");
        long j11 = 0;
        if (p0Var == null) {
            j10 = 0;
        } else {
            j10 = p0Var.f57992a;
        }
        u10.append(j10);
        u10.append(", availableSize=");
        if (p0Var != null) {
            j11 = p0Var.f57994c;
        }
        u10.append(j11);
        nVar.b(u10.toString());
    }

    public final void n() {
        m0 m0Var = this.f58069r;
        m0 m0Var2 = this.f58070s;
        l0 l0Var = new l0(m0Var, m0Var2, this.f58054a0, this.v);
        j40 j40Var = (j40) this.d.f40562a;
        j40Var.S = l0Var;
        if (m0Var2 != null) {
            xi.e.f58884j.b(m0Var2);
        }
        j40Var.B();
    }

    public final void o() {
        int i3;
        int i10 = this.Z;
        long j10 = this.H;
        long j11 = this.I;
        boolean z10 = this.f58076z;
        boolean z11 = this.f58075y;
        boolean z12 = this.f58073w;
        long j12 = this.f58068q;
        s0 s0Var = new s0(i10, j10, j11, j12, z10, z11, z12);
        j40 j40Var = (j40) this.d.f40562a;
        s0 s0Var2 = j40Var.R;
        int i11 = j40Var.f34934f;
        if (s0Var2 == null) {
            i3 = 0;
        } else {
            i3 = s0Var2.f58047a;
        }
        j40Var.R = s0Var;
        if (i3 == 3 && i10 != 3) {
            j40Var.y(true);
        }
        j40Var.f34953v0 = Math.max(j40Var.f34953v0, j10);
        if (i10 != 3) {
            j40Var.setRecordingUiFrameClockActive(false);
            j40Var.f34954w.setProgress(((float) j10) / ((float) j12));
        } else {
            if (!j40Var.D0) {
                j40Var.D0 = true;
                hs.e().k(hs.f23249j1, 512);
            }
            j40.n(j40Var);
            j40Var.setRecordingUiFrameClockActive(true);
            j40Var.D();
            if (!j40Var.f34936g0) {
                j40Var.f34936g0 = true;
                hs.f(i11).k(hs.f23261l2, Integer.valueOf(j40Var.h), Boolean.FALSE);
            } else if (j40Var.f34937h0) {
                j40Var.f34937h0 = false;
                hs.f(i11).k(hs.f23282p2, new Object[0]);
            }
        }
        if (i10 == 8 || i10 == 9 || i10 == 10) {
            j40Var.r();
            j40Var.A();
        }
        if (i3 == 3 && i10 == 4) {
            j40Var.x(2);
        }
        j40Var.B();
        if (j40Var.V != null && !j40Var.W) {
            org.telegram.messenger.g0.h3(new e40(j40Var, 1));
        }
        if (z10 && j40Var.getWindowVisibility() != 0) {
            org.telegram.messenger.g0.h3(new e40(j40Var, 2));
        }
    }

    public final void p() {
        k2.i0 i0Var;
        u();
        if (this.Z == 5 && (i0Var = this.V) != null) {
            i0Var.e();
            y(false);
            this.V.N0();
            this.d.getClass();
        }
    }

    public final void q() {
        u();
        if (this.Z != 3) {
            return;
        }
        this.H = j();
        this.O++;
        this.f58064m.b("pause requested: durationMs=" + this.H);
        e();
        this.f58060i.removeCallbacks(this.W);
        w(4);
        boolean Y = this.f58063l.Y();
        this.E = Y;
        if (!Y) {
            h(new IllegalStateException("Unable to stop the camera segment"));
        }
    }

    public final void r() {
        k2.i0 i0Var;
        u();
        if (this.Z == 5 && (i0Var = this.V) != null) {
            long N0 = i0Var.N0();
            long j10 = this.J;
            if (N0 < j10 || N0 >= this.K) {
                this.V.Z0(5, j10);
            }
            this.V.j();
            y(true);
        }
    }

    public final void s() {
        this.f58060i.removeCallbacks(this.X);
        this.f58076z = false;
        k2.i0 i0Var = this.V;
        if (i0Var == null) {
            return;
        }
        i0Var.s(this.Y);
        k2.i0 i0Var2 = this.V;
        i0Var2.F1();
        TextureView textureView = this.f58055b;
        if (textureView != null && textureView == i0Var2.X) {
            i0Var2.F1();
            i0Var2.s1();
            i0Var2.x1(null);
            i0Var2.q1(0, 0);
        }
        this.V.X0();
        this.V = null;
    }

    public final void t(File file, int i3, long j10, long j11, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        n nVar = this.f58064m;
        StringBuilder t10 = a1.g.t(j10, "final range remux started: range=", "..");
        t10.append(j11);
        t10.append(", includeAudio=");
        t10.append(z10);
        t10.append(", reason=");
        t10.append(t4.c.s(i10));
        nVar.b(t10.toString());
        g();
        k(this.S, i10);
        c(z10);
        g();
        w wVar = this.T;
        int i11 = i3;
        int i12 = this.f58065n.f58000a;
        int i13 = this.f58066o;
        if (i11 <= 0) {
            i11 = this.f58067p.f57986a;
        }
        m2.r0 a10 = u5.a(file, wVar, j10, j11, z10, new a7.d(i12, i13, i11));
        this.T.g();
        long h = this.T.h();
        n nVar2 = this.f58064m;
        StringBuilder t11 = a1.g.t(h, "final range remux completed: durationMs=", ", requestedDurationMs=");
        t11.append(j11 - j10);
        t11.append(", actualStartMs=");
        t11.append(a10.f18973a);
        t11.append(", mode=");
        t11.append((String) a10.f18975c);
        t11.append(", size=");
        t11.append(this.T.f58099a.length());
        t11.append(", elapsedMs=");
        t11.append(f(nanoTime));
        nVar2.b(t11.toString());
        g();
        this.f58062k.execute(new f0(this, this.S, this.T.f58099a, h, z10));
    }

    public final void v(boolean z10) {
        if (this.f58074x != z10) {
            this.f58074x = z10;
            zw zwVar = this.f58058f;
            if (zwVar != null) {
                ((j40) zwVar.f41140b).setScreenFlashEnabled(z10);
            }
        }
    }

    public final void w(int i3) {
        int i10 = this.Z;
        this.Z = i3;
        this.f58064m.b("state: " + t4.c.t(i10) + " -> " + t4.c.t(i3) + ", durationMs=" + j());
        o();
    }

    public final void x(float f10) {
        u();
        if (this.Z == 3 && !this.f58075y) {
            this.f58063l.U(Math.max(0.0f, Math.min(1.0f, f10)));
        }
    }

    public final void y(boolean z10) {
        if (this.f58076z == z10) {
            return;
        }
        this.f58076z = z10;
        Handler handler = this.f58060i;
        i0 i0Var = this.X;
        handler.removeCallbacks(i0Var);
        if (z10) {
            handler.post(i0Var);
        }
        this.d.getClass();
        o();
    }
}
