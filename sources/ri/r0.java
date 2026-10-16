package ri;

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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.xv;
import w7.m7;
public final class r0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public volatile boolean D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long J;
    public long K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public volatile n0 P;
    public volatile v Q;
    public volatile File R;
    public i2.h0 S;
    public final e2.z V;
    public final Context f44675a;
    public final TextureView f44676b;
    public final File f44677c;
    public final m.h d;
    public final o0 e;
    public final xv f44678f;
    public final j f44683l;
    public final n f44684m;
    public final p0 f44685n;
    public final long f44686o;
    public k0 f44687p;
    public k0 f44688q;
    public l0 f44689r;
    public m0 f44690s;
    public boolean f44692u;
    public boolean v;
    public boolean f44693w;
    public boolean f44694x;
    public boolean f44695y;
    public boolean f44696z;
    public final Object f44679g = new Object();
    public final Matrix h = new Matrix();
    public final Handler f44680i = new Handler(Looper.getMainLooper());
    public final ExecutorService f44681j = Executors.newSingleThreadExecutor(new e2.l0(8));
    public final ExecutorService f44682k = Executors.newSingleThreadExecutor(new e2.l0(9));
    public int W = 1;
    public int X = 1;
    public float f44691t = 1.0f;
    public long I = 1;
    public final g0 T = new g0(this, 0);
    public final p4.s0 U = new p4.s0(this, 4);

    public r0(i0 i0Var) {
        Context context;
        m.h hVar = new m.h(this, 15);
        this.V = new e2.z(this, 3);
        t();
        Context context2 = i0Var.f44541a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f44675a = context;
        TextureView textureView = i0Var.f44542b;
        this.f44676b = textureView;
        File file = i0Var.f44543c;
        this.f44677c = file == null ? context.getCacheDir() : file;
        this.f44687p = i0Var.d;
        p0 p0Var = i0Var.e;
        this.f44685n = p0Var;
        int i10 = i0Var.h;
        l0 l0Var = i0Var.f44544f;
        m0 m0Var = i0Var.f44545g;
        this.f44686o = 60000L;
        boolean z10 = i0Var.f44546i;
        this.d = i0Var.f44547j;
        this.e = i0Var.f44548k;
        this.f44678f = i0Var.f44549l;
        n nVar = new n();
        this.f44684m = nVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(p0Var.f44668a);
        sb2.append("x");
        i2.d.w(sb2, p0Var.f44668a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(l0Var);
        sb2.append(", fps=");
        sb2.append(m0Var.f44653a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.f44687p);
        sb2.append(", maxDurationMs=60000");
        nVar.b(sb2.toString());
        this.f44683l = new j(context, textureView, p0Var, i10, l0Var, m0Var, z10, nVar, hVar);
    }

    public static long f(long j10) {
        return (System.nanoTime() - j10) / 1000000;
    }

    public static void t() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("RoundVideoSession must be used from the main thread");
    }

    public final void a() {
        t();
        int i10 = this.W;
        if (i10 != 10 && i10 != 8) {
            this.f44684m.b("cancel requested: state=".concat(c1.y(i10)));
            if (b(3)) {
                e();
                r();
                v(10);
                if (!this.B && !this.f44683l.Y()) {
                    i();
                    return;
                }
                this.B = true;
                this.A = true;
            }
        }
    }

    public final boolean b(int i10) {
        synchronized (this.f44679g) {
            try {
                n0 n0Var = this.P;
                if (n0Var != null && n0Var.e) {
                    return false;
                }
                this.D = true;
                if (n0Var != null && !n0Var.d) {
                    n0Var.d = true;
                    n nVar = this.f44684m;
                    nVar.b("output generation invalidated: id=" + n0Var.f44657a + ", reason=" + c1.x(i10) + ", availableSize=" + n0Var.f44659c);
                    this.f44682k.execute(new f0(this, n0Var, i10, 2));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z10) {
        synchronized (this.f44679g) {
            g();
            File d = d("round_video_");
            long j10 = this.I;
            this.I = 1 + j10;
            n0 n0Var = new n0(j10, d);
            this.P = n0Var;
            this.Q = new v(d, this.f44685n.f44668a, z10, this.f44684m, new org.telegram.ui.web.o0(6, this, n0Var));
            n nVar = this.f44684m;
            nVar.b("output generation started: id=" + j10 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.f44682k.execute(new pi.g(this, n0Var, d, 7));
        }
    }

    public final File d(String str) {
        File file = this.f44677c;
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
        this.f44692u = false;
        j jVar = this.f44683l;
        jVar.U(0.0f);
        jVar.T(false);
        u(false);
    }

    public final void g() {
        if (!this.D) {
            return;
        }
        throw new IOException("Round-video operation was cancelled");
    }

    public final void h(Exception exc) {
        int i10 = this.W;
        if (i10 != 9 && i10 != 10) {
            this.f44684m.a("fatal error in state=".concat(c1.y(i10)), exc);
            if (b(4)) {
                e();
                r();
                this.f44680i.removeCallbacks(this.T);
                n0 n0Var = this.P;
                if (n0Var != null) {
                    this.f44682k.execute(new f0(this, n0Var, exc));
                }
                v(9);
                m("error");
                o60 o60Var = (o60) this.d.f14848b;
                o60Var.x();
                FileLog.e(exc);
                d11 d11Var = o60Var.T;
                if (d11Var != null) {
                    d11Var.d(true);
                }
                o60Var.T = null;
                MediaController.getInstance().requestRecordAudioFocus(false);
                if (o60Var.f27562f0) {
                    o60Var.u(6);
                } else {
                    NotificationCenter.getInstance(o60Var.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(o60Var.f27569n));
                }
                o60Var.w(false, false);
                if (!this.B && !this.f44683l.Y()) {
                    i();
                    return;
                }
                this.B = true;
                this.A = true;
            }
        }
    }

    public final void i() {
        if (this.C) {
            return;
        }
        this.C = true;
        m("cancelled");
        g0 g0Var = new g0(this, 1);
        ExecutorService executorService = this.f44681j;
        executorService.execute(g0Var);
        this.f44683l.M();
        this.f44680i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.f44682k.shutdown();
    }

    public final long j() {
        t();
        if (this.W != 3) {
            return this.E;
        }
        return Math.min(this.f44686o, (SystemClock.elapsedRealtime() + this.E) - this.F);
    }

    public final void k(n0 n0Var, int i10) {
        synchronized (this.f44679g) {
            try {
                if (!n0Var.d && !n0Var.e) {
                    n0Var.d = true;
                    n nVar = this.f44684m;
                    nVar.b("output generation invalidated: id=" + n0Var.f44657a + ", reason=" + c1.x(i10) + ", availableSize=" + n0Var.f44659c);
                    this.f44682k.execute(new f0(this, n0Var, i10, 0));
                }
            } finally {
            }
        }
    }

    public final boolean l() {
        long j10 = this.K;
        if (j10 <= 0) {
            j10 = this.E;
        }
        if (j10 <= this.f44686o && this.G <= 0 && this.H + 10 >= j10) {
            return false;
        }
        return true;
    }

    public final void m(String str) {
        long j10;
        if (this.O) {
            return;
        }
        this.O = true;
        n0 n0Var = this.P;
        n nVar = this.f44684m;
        StringBuilder v = a1.g.v("session summary: terminal=", str, ", state=");
        v.append(c1.y(this.W));
        v.append(", durationMs=");
        v.append(j());
        v.append(", pauses=");
        v.append(this.L);
        v.append(", resumes=");
        v.append(this.M);
        v.append(", cameraSwitches=");
        v.append(this.N);
        v.append(", facing=");
        v.append(this.f44688q);
        v.append(", cameraMode=");
        v.append(this.f44689r);
        v.append(", generation=");
        long j11 = 0;
        if (n0Var == null) {
            j10 = 0;
        } else {
            j10 = n0Var.f44657a;
        }
        v.append(j10);
        v.append(", availableSize=");
        if (n0Var != null) {
            j11 = n0Var.f44659c;
        }
        v.append(j11);
        nVar.b(v.toString());
    }

    public final void n() {
        k0 k0Var = this.f44687p;
        k0 k0Var2 = this.f44688q;
        j0 j0Var = new j0(k0Var, k0Var2, this.X, this.f44691t);
        o60 o60Var = (o60) this.d.f14848b;
        o60Var.S = j0Var;
        if (k0Var2 != null) {
            si.e.f45490j.b(k0Var2);
        }
        o60Var.y();
    }

    public final void o() {
        int i10;
        int i11 = this.W;
        long j10 = this.E;
        long j11 = this.F;
        boolean z10 = this.f44693w;
        boolean z11 = this.f44692u;
        long j12 = this.f44686o;
        q0 q0Var = new q0(i11, j10, j11, j12, z10, z11);
        o60 o60Var = (o60) this.d.f14848b;
        q0 q0Var2 = o60Var.R;
        int i12 = o60Var.h;
        if (q0Var2 == null) {
            i10 = 0;
        } else {
            i10 = q0Var2.f44671a;
        }
        o60Var.R = q0Var;
        if (i10 == 3 && i11 != 3) {
            o60Var.v(true);
        }
        o60Var.f27579u0 = Math.max(o60Var.f27579u0, j10);
        if (i11 == 3) {
            if (!o60Var.C0) {
                o60Var.C0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            o60.m(o60Var);
            o60.n(o60Var, true);
            o60Var.A();
            if (!o60Var.f27562f0) {
                o60Var.f27562f0 = true;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(o60Var.f27569n), Boolean.FALSE);
            } else if (o60Var.f27563g0) {
                o60Var.f27563g0 = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            o60.n(o60Var, false);
            o60Var.f27581w.setProgress(((float) j10) / ((float) j12));
        }
        if (i11 == 8 || i11 == 9 || i11 == 10) {
            o60Var.q();
            o60Var.x();
        }
        if (i10 == 3 && i11 == 4) {
            o60Var.u(2);
        }
        o60Var.y();
    }

    public final void p() {
        t();
        if (this.W != 3) {
            return;
        }
        this.E = j();
        this.L++;
        this.f44684m.b("pause requested: durationMs=" + this.E);
        e();
        this.f44680i.removeCallbacks(this.T);
        v(4);
        boolean Y = this.f44683l.Y();
        this.B = Y;
        if (!Y) {
            h(new IllegalStateException("Unable to stop the camera segment"));
        }
    }

    public final void q() {
        i2.h0 h0Var;
        t();
        if (this.W == 5 && (h0Var = this.S) != null) {
            long M0 = h0Var.M0();
            long j10 = this.G;
            if (M0 < j10 || M0 >= this.H) {
                this.S.Z0(5, j10);
            }
            this.S.i();
            x(true);
        }
    }

    public final void r() {
        this.f44680i.removeCallbacks(this.U);
        this.f44694x = false;
        i2.h0 h0Var = this.S;
        if (h0Var == null) {
            return;
        }
        h0Var.C(this.V);
        i2.h0 h0Var2 = this.S;
        h0Var2.F1();
        TextureView textureView = this.f44676b;
        if (textureView != null && textureView == h0Var2.X) {
            h0Var2.F1();
            h0Var2.s1();
            h0Var2.x1(null);
            h0Var2.q1(0, 0);
        }
        this.S.X0();
        this.S = null;
    }

    public final void s(File file, long j10, long j11, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        n nVar = this.f44684m;
        StringBuilder t10 = a1.g.t(j10, "final range remux started: range=", "..");
        t10.append(j11);
        t10.append(", includeAudio=");
        t10.append(z10);
        t10.append(", reason=");
        t10.append(c1.x(i10));
        nVar.b(t10.toString());
        g();
        k(this.P, i10);
        c(z10);
        g();
        a3.z a2 = m7.a(file, this.Q, j10, j11, z10);
        this.Q.g();
        long e = m7.e(this.Q.f44751a) / 1000;
        n nVar2 = this.f44684m;
        StringBuilder t11 = a1.g.t(e, "final range remux completed: durationMs=", ", requestedDurationMs=");
        t11.append(a2.f207b);
        t11.append(", actualStartMs=");
        t11.append(a2.f206a);
        t11.append(", size=");
        t11.append(this.Q.f44751a.length());
        t11.append(", elapsedMs=");
        t11.append(f(nanoTime));
        nVar2.b(t11.toString());
        g();
        this.f44682k.execute(new e0(this, this.P, this.Q.f44751a, e, z10));
    }

    public final void u(boolean z10) {
        if (this.v != z10) {
            this.v = z10;
            xv xvVar = this.f44678f;
            if (xvVar != null) {
                o60.j((o60) xvVar.f31016b, z10);
            }
        }
    }

    public final void v(int i10) {
        int i11 = this.W;
        this.W = i10;
        this.f44684m.b("state: " + c1.y(i11) + " -> " + c1.y(i10) + ", durationMs=" + j());
        o();
    }

    public final void w(float f7) {
        t();
        if (this.W == 3 && !this.f44693w) {
            this.f44683l.U(Math.max(0.0f, Math.min(1.0f, f7)));
        }
    }

    public final void x(boolean z10) {
        if (this.f44694x == z10) {
            return;
        }
        this.f44694x = z10;
        Handler handler = this.f44680i;
        p4.s0 s0Var = this.U;
        handler.removeCallbacks(s0Var);
        if (z10) {
            handler.post(s0Var);
        }
        this.d.getClass();
        o();
    }
}
