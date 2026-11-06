package wi;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView;
import c8.id;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.ax;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.qt;
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
    public volatile x T;
    public volatile File U;
    public l2.i0 V;
    public final h2.z Y;
    public final Context f58098a;
    public final TextureView f58100b;
    public final File f58101c;
    public final qt d;
    public final q0 f58102e;
    public final ax f58103f;
    public final j f58108l;
    public final n f58109m;
    public final r0 f58110n;
    public final int f58111o;
    public final o0 f58112p;
    public final long f58113q;
    public m0 f58114r;
    public m0 f58115s;
    public n0 f58116t;
    public o0 f58117u;
    public boolean f58118w;
    public boolean f58119x;
    public boolean f58120y;
    public boolean f58121z;
    public final Object f58104g = new Object();
    public final Matrix h = new Matrix();
    public final Handler f58105i = new Handler(Looper.getMainLooper());
    public final ExecutorService f58106j = Executors.newSingleThreadExecutor(new h2.l0(9));
    public final ExecutorService f58107k = Executors.newSingleThreadExecutor(new h2.l0(10));
    public int Z = 1;
    public int f58099a0 = 1;
    public float v = 1.0f;
    public long L = 1;
    public final i0 W = new i0(this, 0);
    public final tg.y X = new tg.y(this, 7);

    public t0(k0 k0Var) {
        Context context;
        qt qtVar = new qt(this, 25);
        this.Y = new h2.z(this, 3);
        u();
        Context context2 = k0Var.f57973a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f58098a = context;
        TextureView textureView = k0Var.f57974b;
        this.f58100b = textureView;
        File file = k0Var.f57975c;
        this.f58101c = file == null ? context.getCacheDir() : file;
        this.f58114r = k0Var.d;
        r0 r0Var = k0Var.f57976e;
        this.f58110n = r0Var;
        int i7 = k0Var.h;
        this.f58111o = i7;
        n0 n0Var = k0Var.f57977f;
        o0 o0Var = k0Var.f57978g;
        this.f58112p = o0Var;
        this.f58113q = 60000L;
        boolean z9 = k0Var.f57979i;
        this.d = k0Var.f57980j;
        this.f58102e = k0Var.f57981k;
        this.f58103f = k0Var.f57982l;
        n nVar = new n();
        this.f58109m = nVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(r0Var.f58045a);
        sb2.append("x");
        jg.g.x(sb2, r0Var.f58045a, ", bitrate=", i7, ", cameraMode=");
        sb2.append(n0Var);
        sb2.append(", fps=");
        sb2.append(o0Var.f58028a);
        sb2.append(", composition=");
        sb2.append(z9);
        sb2.append(", facing=");
        sb2.append(this.f58114r);
        sb2.append(", maxDurationMs=60000");
        nVar.b(sb2.toString());
        this.f58108l = new j(context, textureView, r0Var, i7, n0Var, o0Var, z9, nVar, qtVar);
    }

    public static long f(long j3) {
        return (System.nanoTime() - j3) / 1000000;
    }

    public static void u() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("RoundVideoSession must be used from the main thread");
    }

    public final boolean a() {
        u();
        int i7 = this.Z;
        if (i7 != 10 && i7 != 8) {
            this.f58109m.b("cancel requested: state=".concat(rf.b.t(i7)));
            b(3, true);
            e();
            s();
            w(10);
            if (!this.E && !this.f58108l.Y()) {
                i();
                return true;
            }
            this.E = true;
            this.C = true;
            return true;
        }
        return false;
    }

    public final boolean b(int i7, boolean z9) {
        synchronized (this.f58104g) {
            try {
                p0 p0Var = this.S;
                if (p0Var != null && p0Var.f58037e && !z9) {
                    return false;
                }
                this.G = true;
                if (p0Var != null && !p0Var.d) {
                    p0Var.d = true;
                    n nVar = this.f58109m;
                    nVar.b("output generation invalidated: id=" + p0Var.f58034a + ", reason=" + rf.b.s(i7) + ", availableSize=" + p0Var.f58036c);
                    this.f58107k.execute(new h0(this, p0Var, i7, 2));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z9) {
        synchronized (this.f58104g) {
            g();
            File d = d("round_video_");
            long j3 = this.L;
            this.L = 1 + j3;
            p0 p0Var = new p0(j3, d);
            this.S = p0Var;
            this.T = new x(d, this.f58110n.f58045a, z9, this.f58109m, new org.telegram.ui.web.a0(23, this, p0Var));
            n nVar = this.f58109m;
            nVar.b("output generation started: id=" + j3 + ", includeAudio=" + z9 + ", file=" + d.getName());
            this.f58107k.execute(new q31(this, p0Var, d, 26));
        }
    }

    public final File d(String str) {
        File file = this.f58101c;
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
        this.f58118w = false;
        j jVar = this.f58108l;
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
        int i7 = this.Z;
        if (i7 != 9 && i7 != 10) {
            this.f58109m.a("fatal error in state=".concat(rf.b.t(i7)), exc);
            if (b(4, false)) {
                e();
                s();
                this.f58105i.removeCallbacks(this.W);
                p0 p0Var = this.S;
                if (p0Var != null) {
                    this.f58107k.execute(new h0(this, p0Var, exc));
                }
                w(9);
                m("error");
                n40 n40Var = (n40) this.d.f37394b;
                n40Var.A();
                a8.g(exc, true);
                gy0 gy0Var = n40Var.S;
                if (gy0Var != null) {
                    gy0Var.d(true);
                }
                n40Var.S = null;
                MediaController.B().Y(false);
                if (n40Var.f36166f0) {
                    n40Var.x(6);
                } else {
                    qs.f(n40Var.f36165f).k(qs.f25020m2, Integer.valueOf(n40Var.h));
                }
                n40Var.z(false, false);
                if (!this.E && !this.f58108l.Y()) {
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
        i0 i0Var = new i0(this, 1);
        ExecutorService executorService = this.f58106j;
        executorService.execute(i0Var);
        this.f58108l.M();
        this.f58105i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.f58107k.shutdown();
    }

    public final long j() {
        u();
        if (this.Z != 3) {
            return this.H;
        }
        return Math.min(this.f58113q, (SystemClock.elapsedRealtime() + this.H) - this.I);
    }

    public final void k(p0 p0Var, int i7) {
        synchronized (this.f58104g) {
            try {
                if (!p0Var.d && !p0Var.f58037e) {
                    p0Var.d = true;
                    n nVar = this.f58109m;
                    nVar.b("output generation invalidated: id=" + p0Var.f58034a + ", reason=" + rf.b.s(i7) + ", availableSize=" + p0Var.f58036c);
                    this.f58107k.execute(new h0(this, p0Var, i7, 0));
                }
            } finally {
            }
        }
    }

    public final boolean l() {
        long j3 = this.N;
        if (j3 <= 0) {
            j3 = this.H;
        }
        if (j3 <= this.f58113q && this.J <= 0 && this.K + 10 >= j3) {
            return false;
        }
        return true;
    }

    public final void m(String str) {
        long j3;
        if (this.R) {
            return;
        }
        this.R = true;
        p0 p0Var = this.S;
        n nVar = this.f58109m;
        StringBuilder u10 = a8.p0.u("session summary: terminal=", str, ", state=");
        u10.append(rf.b.t(this.Z));
        u10.append(", durationMs=");
        u10.append(j());
        u10.append(", pauses=");
        u10.append(this.O);
        u10.append(", resumes=");
        u10.append(this.P);
        u10.append(", cameraSwitches=");
        u10.append(this.Q);
        u10.append(", facing=");
        u10.append(this.f58115s);
        u10.append(", cameraMode=");
        u10.append(this.f58116t);
        u10.append(", generation=");
        long j10 = 0;
        if (p0Var == null) {
            j3 = 0;
        } else {
            j3 = p0Var.f58034a;
        }
        u10.append(j3);
        u10.append(", availableSize=");
        if (p0Var != null) {
            j10 = p0Var.f58036c;
        }
        u10.append(j10);
        nVar.b(u10.toString());
    }

    public final void n() {
        m0 m0Var = this.f58114r;
        m0 m0Var2 = this.f58115s;
        l0 l0Var = new l0(m0Var, m0Var2, this.f58099a0, this.v);
        n40 n40Var = (n40) this.d.f37394b;
        n40Var.R = l0Var;
        if (m0Var2 != null) {
            xi.e.f58769j.b(m0Var2);
        }
        n40Var.B();
    }

    public final void o() {
        int i7;
        int i10 = this.Z;
        long j3 = this.H;
        long j10 = this.I;
        boolean z9 = this.f58121z;
        boolean z10 = this.f58120y;
        boolean z11 = this.f58118w;
        long j11 = this.f58113q;
        s0 s0Var = new s0(i10, j3, j10, j11, z9, z10, z11);
        n40 n40Var = (n40) this.d.f37394b;
        s0 s0Var2 = n40Var.Q;
        int i11 = n40Var.f36165f;
        if (s0Var2 == null) {
            i7 = 0;
        } else {
            i7 = s0Var2.f58046a;
        }
        n40Var.Q = s0Var;
        if (i7 == 3 && i10 != 3) {
            n40Var.y(true);
        }
        n40Var.f36183u0 = Math.max(n40Var.f36183u0, j3);
        if (i10 != 3) {
            n40Var.setRecordingUiFrameClockActive(false);
            n40Var.f36185w.setProgress(((float) j3) / ((float) j11));
        } else {
            if (!n40Var.C0) {
                n40Var.C0 = true;
                qs.e().k(qs.f25004j1, 512);
            }
            n40.n(n40Var);
            n40Var.setRecordingUiFrameClockActive(true);
            n40Var.D();
            if (!n40Var.f36166f0) {
                n40Var.f36166f0 = true;
                qs.f(i11).k(qs.f25015l2, Integer.valueOf(n40Var.h), Boolean.FALSE);
            } else if (n40Var.f36167g0) {
                n40Var.f36167g0 = false;
                qs.f(i11).k(qs.f25036p2, new Object[0]);
            }
        }
        if (i10 == 8 || i10 == 9 || i10 == 10) {
            n40Var.r();
            n40Var.A();
        }
        if (i7 == 3 && i10 == 4) {
            n40Var.x(2);
        }
        n40Var.B();
        if (n40Var.U != null && !n40Var.V) {
            org.telegram.messenger.g0.h3(new i40(n40Var, 1));
        }
        if (z9 && n40Var.getWindowVisibility() != 0) {
            org.telegram.messenger.g0.h3(new i40(n40Var, 2));
        }
    }

    public final void p() {
        l2.i0 i0Var;
        u();
        if (this.Z == 5 && (i0Var = this.V) != null) {
            i0Var.b();
            y(false);
            this.V.l();
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
        this.f58109m.b("pause requested: durationMs=" + this.H);
        e();
        this.f58105i.removeCallbacks(this.W);
        w(4);
        boolean Y = this.f58108l.Y();
        this.E = Y;
        if (!Y) {
            h(new IllegalStateException("Unable to stop the camera segment"));
        }
    }

    public final void r() {
        l2.i0 i0Var;
        u();
        if (this.Z == 5 && (i0Var = this.V) != null) {
            long l10 = i0Var.l();
            long j3 = this.J;
            if (l10 < j3 || l10 >= this.K) {
                this.V.Z0(5, j3);
            }
            this.V.f();
            y(true);
        }
    }

    public final void s() {
        this.f58105i.removeCallbacks(this.X);
        this.f58121z = false;
        l2.i0 i0Var = this.V;
        if (i0Var == null) {
            return;
        }
        i0Var.h0(this.Y);
        l2.i0 i0Var2 = this.V;
        i0Var2.F1();
        TextureView textureView = this.f58100b;
        if (textureView != null && textureView == i0Var2.X) {
            i0Var2.F1();
            i0Var2.s1();
            i0Var2.x1(null);
            i0Var2.q1(0, 0);
        }
        this.V.X0();
        this.V = null;
    }

    public final void t(File file, int i7, long j3, long j10, boolean z9, int i10) {
        long nanoTime = System.nanoTime();
        n nVar = this.f58109m;
        StringBuilder t6 = a8.p0.t(j3, "final range remux started: range=", "..");
        t6.append(j10);
        t6.append(", includeAudio=");
        t6.append(z9);
        t6.append(", reason=");
        t6.append(rf.b.s(i10));
        nVar.b(t6.toString());
        g();
        k(this.S, i10);
        c(z9);
        g();
        x xVar = this.T;
        int i11 = i7;
        int i12 = this.f58110n.f58045a;
        int i13 = this.f58111o;
        if (i11 <= 0) {
            i11 = this.f58112p.f58028a;
        }
        n2.p0 a10 = id.a(file, xVar, j3, j10, z9, new b7.d(i12, i13, i11));
        this.T.g();
        long h = this.T.h();
        n nVar2 = this.f58109m;
        StringBuilder t10 = a8.p0.t(h, "final range remux completed: durationMs=", ", requestedDurationMs=");
        t10.append(j10 - j3);
        t10.append(", actualStartMs=");
        t10.append(a10.f20262a);
        t10.append(", mode=");
        t10.append((String) a10.f20264c);
        t10.append(", size=");
        t10.append(this.T.f58144a.length());
        t10.append(", elapsedMs=");
        t10.append(f(nanoTime));
        nVar2.b(t10.toString());
        g();
        this.f58107k.execute(new g0(this, this.S, this.T.f58144a, h, z9));
    }

    public final void v(boolean z9) {
        if (this.f58119x != z9) {
            this.f58119x = z9;
            ax axVar = this.f58103f;
            if (axVar != null) {
                ((n40) axVar.f31941b).setScreenFlashEnabled(z9);
            }
        }
    }

    public final void w(int i7) {
        int i10 = this.Z;
        this.Z = i7;
        this.f58109m.b("state: " + rf.b.t(i10) + " -> " + rf.b.t(i7) + ", durationMs=" + j());
        o();
    }

    public final void x(float f10) {
        u();
        if (this.Z == 3 && !this.f58120y) {
            this.f58108l.U(Math.max(0.0f, Math.min(1.0f, f10)));
        }
    }

    public final void y(boolean z9) {
        if (this.f58121z == z9) {
            return;
        }
        this.f58121z = z9;
        Handler handler = this.f58105i;
        tg.y yVar = this.X;
        handler.removeCallbacks(yVar);
        if (z9) {
            handler.post(yVar);
        }
        this.d.getClass();
        o();
    }
}
