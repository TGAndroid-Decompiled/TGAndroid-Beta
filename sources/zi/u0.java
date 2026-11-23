package zi;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView;
import c8.pe;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.ks;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.y40;
import org.telegram.ui.Wallet.o5;
import org.telegram.ui.uc1;
import y7.h7;
public final class u0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public volatile boolean H;
    public long I;
    public long J;
    public long K;
    public long L;
    public long N;
    public long O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public volatile q0 T;
    public volatile x U;
    public volatile File V;
    public l2.g0 W;
    public final h2.z Z;
    public final Context f62439a;
    public final TextureView f62441b;
    public final File f62443c;
    public final aa d;
    public final r0 f62444e;
    public final hy f62445f;
    public final k f62450l;
    public final o f62451m;
    public final s0 f62452n;
    public final int f62453o;
    public final p0 f62454p;
    public final long f62455q;
    public n0 f62456r;
    public n0 f62457s;
    public o0 f62458t;
    public p0 f62459u;
    public boolean f62460w;
    public boolean f62461x;
    public boolean f62462y;
    public boolean f62463z;
    public final Object f62446g = new Object();
    public final Matrix h = new Matrix();
    public final Handler f62447i = new Handler(Looper.getMainLooper());
    public final ExecutorService f62448j = Executors.newSingleThreadExecutor(new ai.v0(11));
    public final ExecutorService f62449k = Executors.newSingleThreadExecutor(new ai.v0(12));
    public int f62440a0 = 1;
    public int f62442b0 = 1;
    public float v = 1.0f;
    public long M = 1;
    public final i0 X = new i0(this, 0);
    public final o5 Y = new o5(this, 14);

    public u0(l0 l0Var) {
        Context context;
        h7 h7Var = new h7(this);
        this.Z = new h2.z(this, 3);
        v();
        Context context2 = l0Var.f62316a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f62439a = context;
        TextureView textureView = l0Var.f62317b;
        this.f62441b = textureView;
        File file = l0Var.f62318c;
        this.f62443c = file == null ? context.getCacheDir() : file;
        this.f62456r = l0Var.d;
        s0 s0Var = l0Var.f62319e;
        this.f62452n = s0Var;
        int i7 = l0Var.h;
        this.f62453o = i7;
        o0 o0Var = l0Var.f62320f;
        p0 p0Var = l0Var.f62321g;
        this.f62454p = p0Var;
        this.f62455q = 60000L;
        boolean z10 = l0Var.f62322i;
        this.d = l0Var.f62323j;
        this.f62444e = l0Var.f62324k;
        this.f62445f = l0Var.f62325l;
        o oVar = new o();
        this.f62451m = oVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(s0Var.f62385a);
        sb2.append("x");
        i5.c.z(sb2, s0Var.f62385a, ", bitrate=", i7, ", cameraMode=");
        sb2.append(o0Var);
        sb2.append(", fps=");
        sb2.append(p0Var.f62371a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.f62456r);
        sb2.append(", maxDurationMs=60000");
        oVar.b(sb2.toString());
        this.f62450l = new k(context, textureView, s0Var, i7, o0Var, p0Var, z10, oVar, h7Var);
    }

    public static long f(long j3) {
        return (System.nanoTime() - j3) / 1000000;
    }

    public static void v() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("RoundVideoSession must be used from the main thread");
    }

    public final boolean a() {
        v();
        int i7 = this.f62440a0;
        if (i7 != 10 && i7 != 8) {
            this.f62451m.b("cancel requested: state=".concat(yi.i.e(i7)));
            b(3, true);
            e();
            t();
            x(10);
            if (!this.E && !this.f62450l.W()) {
                i();
                return true;
            }
            this.E = true;
            this.C = true;
            return true;
        }
        return false;
    }

    public final boolean b(int i7, boolean z10) {
        synchronized (this.f62446g) {
            try {
                q0 q0Var = this.T;
                if (q0Var != null && q0Var.f62377e && !z10) {
                    return false;
                }
                this.H = true;
                if (q0Var != null && !q0Var.d) {
                    q0Var.d = true;
                    o oVar = this.f62451m;
                    oVar.b("output generation invalidated: id=" + q0Var.f62374a + ", reason=" + yi.i.d(i7) + ", availableSize=" + q0Var.f62376c);
                    this.f62449k.execute(new h0(this, q0Var, i7, 2));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z10) {
        synchronized (this.f62446g) {
            g();
            File d = d("round_video_");
            long j3 = this.M;
            this.M = 1 + j3;
            q0 q0Var = new q0(j3, d);
            this.T = q0Var;
            this.U = new x(d, this.f62452n.f62385a, z10, this.f62451m, new uc1(29, this, q0Var));
            o oVar = this.f62451m;
            oVar.b("output generation started: id=" + j3 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.f62449k.execute(new wg.p(this, q0Var, d, 10));
        }
    }

    public final File d(String str) {
        File file = this.f62443c;
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
        this.f62460w = false;
        k kVar = this.f62450l;
        kVar.T(0.0f);
        kVar.S(false);
        w(false);
    }

    public final void g() {
        if (!this.H) {
            return;
        }
        throw new IOException("Round-video operation was cancelled");
    }

    public final void h(Exception exc) {
        int i7 = this.f62440a0;
        if (i7 != 9 && i7 != 10) {
            this.f62451m.a("fatal error in state=".concat(yi.i.e(i7)), exc);
            if (b(4, false)) {
                e();
                t();
                this.f62447i.removeCallbacks(this.X);
                q0 q0Var = this.T;
                if (q0Var != null) {
                    this.f62449k.execute(new h0(this, q0Var, exc));
                }
                x(9);
                m("error");
                y40 y40Var = (y40) this.d.f30491b;
                y40Var.C();
                a8.g(exc, true);
                ry0 ry0Var = y40Var.T;
                if (ry0Var != null) {
                    ry0Var.d(true);
                }
                y40Var.T = null;
                if (y40Var.f42322a0) {
                    y40Var.f42322a0 = false;
                    y40Var.P = null;
                } else {
                    MediaController.B().Y(false);
                    if (y40Var.f42331h0) {
                        y40Var.z(6);
                    } else {
                        ks.f(y40Var.f42328f).k(ks.f25250m2, Integer.valueOf(y40Var.h));
                    }
                    y40Var.B(false, false);
                }
                if (!this.E && !this.f62450l.W()) {
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
        ExecutorService executorService = this.f62448j;
        executorService.execute(i0Var);
        this.f62450l.K();
        this.f62447i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.f62449k.shutdown();
    }

    public final long j() {
        v();
        if (this.f62440a0 != 3) {
            return this.I;
        }
        return Math.min(this.f62455q, (SystemClock.elapsedRealtime() + this.I) - this.J);
    }

    public final void k(q0 q0Var, int i7) {
        synchronized (this.f62446g) {
            try {
                if (!q0Var.d && !q0Var.f62377e) {
                    q0Var.d = true;
                    o oVar = this.f62451m;
                    oVar.b("output generation invalidated: id=" + q0Var.f62374a + ", reason=" + yi.i.d(i7) + ", availableSize=" + q0Var.f62376c);
                    this.f62449k.execute(new h0(this, q0Var, i7, 0));
                }
            } finally {
            }
        }
    }

    public final boolean l() {
        long j3 = this.O;
        if (j3 <= 0) {
            j3 = this.I;
        }
        if (j3 <= this.f62455q && this.K <= 0 && this.L + 10 >= j3) {
            return false;
        }
        return true;
    }

    public final void m(String str) {
        long j3;
        if (this.S) {
            return;
        }
        this.S = true;
        q0 q0Var = this.T;
        o oVar = this.f62451m;
        StringBuilder u10 = a8.p0.u("session summary: terminal=", str, ", state=");
        u10.append(yi.i.e(this.f62440a0));
        u10.append(", durationMs=");
        u10.append(j());
        u10.append(", pauses=");
        u10.append(this.P);
        u10.append(", resumes=");
        u10.append(this.Q);
        u10.append(", cameraSwitches=");
        u10.append(this.R);
        u10.append(", facing=");
        u10.append(this.f62457s);
        u10.append(", cameraMode=");
        u10.append(this.f62458t);
        u10.append(", generation=");
        long j10 = 0;
        if (q0Var == null) {
            j3 = 0;
        } else {
            j3 = q0Var.f62374a;
        }
        u10.append(j3);
        u10.append(", availableSize=");
        if (q0Var != null) {
            j10 = q0Var.f62376c;
        }
        u10.append(j10);
        oVar.b(u10.toString());
    }

    public final void n() {
        n0 n0Var = this.f62456r;
        n0 n0Var2 = this.f62457s;
        m0 m0Var = new m0(n0Var, n0Var2, this.f62442b0, this.v);
        y40 y40Var = (y40) this.d.f30491b;
        y40Var.S = m0Var;
        if (n0Var2 != null) {
            aj.e.f1627j.b(n0Var2);
        }
        y40Var.D();
    }

    public final void o() {
        int i7;
        int i10 = this.f62440a0;
        long j3 = this.I;
        long j10 = this.J;
        boolean z10 = this.f62463z;
        boolean z11 = this.f62462y;
        boolean z12 = this.f62460w;
        long j11 = this.f62455q;
        t0 t0Var = new t0(i10, j3, j10, j11, z10, z11, z12);
        y40 y40Var = (y40) this.d.f30491b;
        t0 t0Var2 = y40Var.R;
        int i11 = y40Var.f42328f;
        if (t0Var2 == null) {
            i7 = 0;
        } else {
            i7 = t0Var2.f62433a;
        }
        y40Var.R = t0Var;
        if (i7 == 3 && i10 != 3) {
            y40Var.A(true);
        }
        y40Var.f42349w0 = Math.max(y40Var.f42349w0, j3);
        if (i10 != 3) {
            y40Var.setRecordingUiFrameClockActive(false);
            y40Var.f42348w.setProgress(((float) j3) / ((float) j11));
        } else {
            if (!y40Var.E0) {
                y40Var.E0 = true;
                ks.e().k(ks.f25234j1, 512);
            }
            y40.o(y40Var);
            y40Var.setRecordingUiFrameClockActive(true);
            y40Var.F();
            if (!y40Var.f42331h0) {
                y40Var.f42331h0 = true;
                ks.f(i11).k(ks.f25245l2, Integer.valueOf(y40Var.h), Boolean.FALSE);
            } else if (y40Var.f42332i0) {
                y40Var.f42332i0 = false;
                ks.f(i11).k(ks.f25266p2, new Object[0]);
            }
        }
        if (i10 == 8 || i10 == 9 || i10 == 10) {
            y40Var.s();
            y40Var.C();
        }
        if (i7 == 3 && i10 == 4) {
            y40Var.z(2);
        }
        y40Var.D();
        if (y40Var.V != null && !y40Var.W) {
            org.telegram.messenger.g0.g3(new t40(y40Var, 1));
        }
        if (z10 && y40Var.getWindowVisibility() != 0) {
            org.telegram.messenger.g0.g3(new t40(y40Var, 2));
        }
    }

    public final void p() {
        l2.g0 g0Var;
        v();
        if (this.f62440a0 == 5 && (g0Var = this.W) != null) {
            g0Var.b();
            z(false);
            this.W.n();
            this.d.getClass();
        }
    }

    public final void q() {
        v();
        if (this.f62440a0 != 3) {
            return;
        }
        this.I = j();
        this.P++;
        this.f62451m.b("pause requested: durationMs=" + this.I);
        e();
        this.f62447i.removeCallbacks(this.X);
        x(4);
        boolean W = this.f62450l.W();
        this.E = W;
        if (!W) {
            h(new IllegalStateException("Unable to stop the camera segment"));
        }
    }

    public final void r() {
        l2.g0 g0Var;
        v();
        if (this.f62440a0 == 5 && (g0Var = this.W) != null) {
            long n10 = g0Var.n();
            long j3 = this.K;
            if (n10 < j3 || n10 >= this.L) {
                this.W.Z0(5, j3);
            }
            this.W.f();
            z(true);
        }
    }

    public final void s() {
        v();
        int i7 = this.f62440a0;
        if (i7 == 10) {
            if (!this.F) {
                i();
            }
        } else if (i7 == 7) {
            if (this.G) {
                return;
            }
            this.G = true;
            this.f62451m.b("release deferred: output is still finishing");
            e();
            t();
        } else if (i7 != 8) {
            a();
        } else {
            e();
            t();
            this.f62450l.K();
            this.F = true;
            x(10);
            m("released");
            this.f62447i.removeCallbacksAndMessages(null);
            this.f62448j.shutdown();
            this.f62449k.shutdown();
        }
    }

    public final void t() {
        this.f62447i.removeCallbacks(this.Y);
        this.f62463z = false;
        l2.g0 g0Var = this.W;
        if (g0Var == null) {
            return;
        }
        g0Var.i0(this.Z);
        l2.g0 g0Var2 = this.W;
        g0Var2.F1();
        TextureView textureView = this.f62441b;
        if (textureView != null && textureView == g0Var2.X) {
            g0Var2.F1();
            g0Var2.s1();
            g0Var2.x1(null);
            g0Var2.q1(0, 0);
        }
        this.W.X0();
        this.W = null;
    }

    public final void u(File file, int i7, long j3, long j10, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        o oVar = this.f62451m;
        StringBuilder t6 = a8.p0.t(j3, "final range remux started: range=", "..");
        t6.append(j10);
        t6.append(", includeAudio=");
        t6.append(z10);
        t6.append(", reason=");
        t6.append(yi.i.d(i10));
        oVar.b(t6.toString());
        g();
        k(this.T, i10);
        c(z10);
        g();
        x xVar = this.U;
        int i11 = i7;
        int i12 = this.f62452n.f62385a;
        int i13 = this.f62453o;
        if (i11 <= 0) {
            i11 = this.f62454p.f62371a;
        }
        n2.r0 a10 = pe.a(file, xVar, j3, j10, z10, new b7.d(i12, i13, i11));
        this.U.g();
        long h = this.U.h();
        o oVar2 = this.f62451m;
        StringBuilder t10 = a8.p0.t(h, "final range remux completed: durationMs=", ", requestedDurationMs=");
        t10.append(j10 - j3);
        t10.append(", actualStartMs=");
        t10.append(a10.f21304a);
        t10.append(", mode=");
        t10.append((String) a10.f21306c);
        t10.append(", size=");
        t10.append(this.U.f62486a.length());
        t10.append(", elapsedMs=");
        t10.append(f(nanoTime));
        oVar2.b(t10.toString());
        g();
        this.f62449k.execute(new g0(this, this.T, this.U.f62486a, h, z10));
    }

    public final void w(boolean z10) {
        if (this.f62461x != z10) {
            this.f62461x = z10;
            hy hyVar = this.f62445f;
            if (hyVar != null) {
                ((y40) hyVar.f35848b).setScreenFlashEnabled(z10);
            }
        }
    }

    public final void x(int i7) {
        int i10 = this.f62440a0;
        this.f62440a0 = i7;
        this.f62451m.b("state: " + yi.i.e(i10) + " -> " + yi.i.e(i7) + ", durationMs=" + j());
        o();
    }

    public final void y(float f10) {
        v();
        if (this.f62440a0 == 3 && !this.f62462y) {
            this.f62450l.T(Math.max(0.0f, Math.min(1.0f, f10)));
        }
    }

    public final void z(boolean z10) {
        if (this.f62463z == z10) {
            return;
        }
        this.f62463z = z10;
        Handler handler = this.f62447i;
        o5 o5Var = this.Y;
        handler.removeCallbacks(o5Var);
        if (z10) {
            handler.post(o5Var);
        }
        this.d.getClass();
        o();
    }
}
