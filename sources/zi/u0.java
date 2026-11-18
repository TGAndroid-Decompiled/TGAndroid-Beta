package zi;

import ai.y0;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView;
import c8.oe;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.y40;
import org.telegram.ui.wc1;
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
    public l2.f0 W;
    public final h2.z Z;
    public final Context f62309a;
    public final TextureView f62311b;
    public final File f62313c;
    public final of d;
    public final r0 f62314e;
    public final iy f62315f;
    public final k f62320l;
    public final o f62321m;
    public final s0 f62322n;
    public final int f62323o;
    public final p0 f62324p;
    public final long f62325q;
    public n0 f62326r;
    public n0 f62327s;
    public o0 f62328t;
    public p0 f62329u;
    public boolean f62330w;
    public boolean f62331x;
    public boolean f62332y;
    public boolean f62333z;
    public final Object f62316g = new Object();
    public final Matrix h = new Matrix();
    public final Handler f62317i = new Handler(Looper.getMainLooper());
    public final ExecutorService f62318j = Executors.newSingleThreadExecutor(new y0(11));
    public final ExecutorService f62319k = Executors.newSingleThreadExecutor(new y0(12));
    public int f62310a0 = 1;
    public int f62312b0 = 1;
    public float v = 1.0f;
    public long M = 1;
    public final i0 X = new i0(this, 0);
    public final s4.s0 Y = new s4.s0(this, 10);

    public u0(l0 l0Var) {
        Context context;
        k0 k0Var = new k0(this);
        this.Z = new h2.z(this, 3);
        v();
        Context context2 = l0Var.f62186a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f62309a = context;
        TextureView textureView = l0Var.f62187b;
        this.f62311b = textureView;
        File file = l0Var.f62188c;
        this.f62313c = file == null ? context.getCacheDir() : file;
        this.f62326r = l0Var.d;
        s0 s0Var = l0Var.f62189e;
        this.f62322n = s0Var;
        int i7 = l0Var.h;
        this.f62323o = i7;
        o0 o0Var = l0Var.f62190f;
        p0 p0Var = l0Var.f62191g;
        this.f62324p = p0Var;
        this.f62325q = 60000L;
        boolean z10 = l0Var.f62192i;
        this.d = l0Var.f62193j;
        this.f62314e = l0Var.f62194k;
        this.f62315f = l0Var.f62195l;
        o oVar = new o();
        this.f62321m = oVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(s0Var.f62255a);
        sb2.append("x");
        i5.c.z(sb2, s0Var.f62255a, ", bitrate=", i7, ", cameraMode=");
        sb2.append(o0Var);
        sb2.append(", fps=");
        sb2.append(p0Var.f62241a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.f62326r);
        sb2.append(", maxDurationMs=60000");
        oVar.b(sb2.toString());
        this.f62320l = new k(context, textureView, s0Var, i7, o0Var, p0Var, z10, oVar, k0Var);
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
        int i7 = this.f62310a0;
        if (i7 != 10 && i7 != 8) {
            this.f62321m.b("cancel requested: state=".concat(yi.i.e(i7)));
            b(3, true);
            e();
            t();
            x(10);
            if (!this.E && !this.f62320l.W()) {
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
        synchronized (this.f62316g) {
            try {
                q0 q0Var = this.T;
                if (q0Var != null && q0Var.f62247e && !z10) {
                    return false;
                }
                this.H = true;
                if (q0Var != null && !q0Var.d) {
                    q0Var.d = true;
                    o oVar = this.f62321m;
                    oVar.b("output generation invalidated: id=" + q0Var.f62244a + ", reason=" + yi.i.d(i7) + ", availableSize=" + q0Var.f62246c);
                    this.f62319k.execute(new h0(this, q0Var, i7, 2));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z10) {
        synchronized (this.f62316g) {
            g();
            File d = d("round_video_");
            long j3 = this.M;
            this.M = 1 + j3;
            q0 q0Var = new q0(j3, d);
            this.T = q0Var;
            this.U = new x(d, this.f62322n.f62255a, z10, this.f62321m, new wc1(29, this, q0Var));
            o oVar = this.f62321m;
            oVar.b("output generation started: id=" + j3 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.f62319k.execute(new wg.q(this, q0Var, d, 8));
        }
    }

    public final File d(String str) {
        File file = this.f62313c;
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
        this.f62330w = false;
        k kVar = this.f62320l;
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
        int i7 = this.f62310a0;
        if (i7 != 9 && i7 != 10) {
            this.f62321m.a("fatal error in state=".concat(yi.i.e(i7)), exc);
            if (b(4, false)) {
                e();
                t();
                this.f62317i.removeCallbacks(this.X);
                q0 q0Var = this.T;
                if (q0Var != null) {
                    this.f62319k.execute(new h0(this, q0Var, exc));
                }
                x(9);
                m("error");
                y40 y40Var = (y40) this.d.f38076b;
                y40Var.C();
                a8.g(exc, true);
                qy0 qy0Var = y40Var.T;
                if (qy0Var != null) {
                    qy0Var.d(true);
                }
                y40Var.T = null;
                if (y40Var.f42294a0) {
                    y40Var.f42294a0 = false;
                    y40Var.P = null;
                } else {
                    MediaController.B().Y(false);
                    if (y40Var.f42303h0) {
                        y40Var.z(6);
                    } else {
                        ks.f(y40Var.f42300f).k(ks.f25151m2, Integer.valueOf(y40Var.h));
                    }
                    y40Var.B(false, false);
                }
                if (!this.E && !this.f62320l.W()) {
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
        ExecutorService executorService = this.f62318j;
        executorService.execute(i0Var);
        this.f62320l.K();
        this.f62317i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.f62319k.shutdown();
    }

    public final long j() {
        v();
        if (this.f62310a0 != 3) {
            return this.I;
        }
        return Math.min(this.f62325q, (SystemClock.elapsedRealtime() + this.I) - this.J);
    }

    public final void k(q0 q0Var, int i7) {
        synchronized (this.f62316g) {
            try {
                if (!q0Var.d && !q0Var.f62247e) {
                    q0Var.d = true;
                    o oVar = this.f62321m;
                    oVar.b("output generation invalidated: id=" + q0Var.f62244a + ", reason=" + yi.i.d(i7) + ", availableSize=" + q0Var.f62246c);
                    this.f62319k.execute(new h0(this, q0Var, i7, 0));
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
        if (j3 <= this.f62325q && this.K <= 0 && this.L + 10 >= j3) {
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
        o oVar = this.f62321m;
        StringBuilder u10 = a8.p0.u("session summary: terminal=", str, ", state=");
        u10.append(yi.i.e(this.f62310a0));
        u10.append(", durationMs=");
        u10.append(j());
        u10.append(", pauses=");
        u10.append(this.P);
        u10.append(", resumes=");
        u10.append(this.Q);
        u10.append(", cameraSwitches=");
        u10.append(this.R);
        u10.append(", facing=");
        u10.append(this.f62327s);
        u10.append(", cameraMode=");
        u10.append(this.f62328t);
        u10.append(", generation=");
        long j10 = 0;
        if (q0Var == null) {
            j3 = 0;
        } else {
            j3 = q0Var.f62244a;
        }
        u10.append(j3);
        u10.append(", availableSize=");
        if (q0Var != null) {
            j10 = q0Var.f62246c;
        }
        u10.append(j10);
        oVar.b(u10.toString());
    }

    public final void n() {
        n0 n0Var = this.f62326r;
        n0 n0Var2 = this.f62327s;
        m0 m0Var = new m0(n0Var, n0Var2, this.f62312b0, this.v);
        y40 y40Var = (y40) this.d.f38076b;
        y40Var.S = m0Var;
        if (n0Var2 != null) {
            aj.e.f1656j.b(n0Var2);
        }
        y40Var.D();
    }

    public final void o() {
        int i7;
        int i10 = this.f62310a0;
        long j3 = this.I;
        long j10 = this.J;
        boolean z10 = this.f62333z;
        boolean z11 = this.f62332y;
        boolean z12 = this.f62330w;
        long j11 = this.f62325q;
        t0 t0Var = new t0(i10, j3, j10, j11, z10, z11, z12);
        y40 y40Var = (y40) this.d.f38076b;
        t0 t0Var2 = y40Var.R;
        int i11 = y40Var.f42300f;
        if (t0Var2 == null) {
            i7 = 0;
        } else {
            i7 = t0Var2.f62303a;
        }
        y40Var.R = t0Var;
        if (i7 == 3 && i10 != 3) {
            y40Var.A(true);
        }
        y40Var.f42321w0 = Math.max(y40Var.f42321w0, j3);
        if (i10 != 3) {
            y40Var.setRecordingUiFrameClockActive(false);
            y40Var.f42320w.setProgress(((float) j3) / ((float) j11));
        } else {
            if (!y40Var.E0) {
                y40Var.E0 = true;
                ks.e().k(ks.f25135j1, 512);
            }
            y40.o(y40Var);
            y40Var.setRecordingUiFrameClockActive(true);
            y40Var.F();
            if (!y40Var.f42303h0) {
                y40Var.f42303h0 = true;
                ks.f(i11).k(ks.f25146l2, Integer.valueOf(y40Var.h), Boolean.FALSE);
            } else if (y40Var.f42304i0) {
                y40Var.f42304i0 = false;
                ks.f(i11).k(ks.f25167p2, new Object[0]);
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
        l2.f0 f0Var;
        v();
        if (this.f62310a0 == 5 && (f0Var = this.W) != null) {
            f0Var.b();
            z(false);
            this.W.l();
            this.d.getClass();
        }
    }

    public final void q() {
        v();
        if (this.f62310a0 != 3) {
            return;
        }
        this.I = j();
        this.P++;
        this.f62321m.b("pause requested: durationMs=" + this.I);
        e();
        this.f62317i.removeCallbacks(this.X);
        x(4);
        boolean W = this.f62320l.W();
        this.E = W;
        if (!W) {
            h(new IllegalStateException("Unable to stop the camera segment"));
        }
    }

    public final void r() {
        l2.f0 f0Var;
        v();
        if (this.f62310a0 == 5 && (f0Var = this.W) != null) {
            long l10 = f0Var.l();
            long j3 = this.K;
            if (l10 < j3 || l10 >= this.L) {
                this.W.Z0(5, j3);
            }
            this.W.f();
            z(true);
        }
    }

    public final void s() {
        v();
        int i7 = this.f62310a0;
        if (i7 == 10) {
            if (!this.F) {
                i();
            }
        } else if (i7 == 7) {
            if (this.G) {
                return;
            }
            this.G = true;
            this.f62321m.b("release deferred: output is still finishing");
            e();
            t();
        } else if (i7 != 8) {
            a();
        } else {
            e();
            t();
            this.f62320l.K();
            this.F = true;
            x(10);
            m("released");
            this.f62317i.removeCallbacksAndMessages(null);
            this.f62318j.shutdown();
            this.f62319k.shutdown();
        }
    }

    public final void t() {
        this.f62317i.removeCallbacks(this.Y);
        this.f62333z = false;
        l2.f0 f0Var = this.W;
        if (f0Var == null) {
            return;
        }
        f0Var.h0(this.Z);
        l2.f0 f0Var2 = this.W;
        f0Var2.F1();
        TextureView textureView = this.f62311b;
        if (textureView != null && textureView == f0Var2.X) {
            f0Var2.F1();
            f0Var2.s1();
            f0Var2.x1(null);
            f0Var2.q1(0, 0);
        }
        this.W.X0();
        this.W = null;
    }

    public final void u(File file, int i7, long j3, long j10, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        o oVar = this.f62321m;
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
        int i12 = this.f62322n.f62255a;
        int i13 = this.f62323o;
        if (i11 <= 0) {
            i11 = this.f62324p.f62241a;
        }
        n2.q0 a10 = oe.a(file, xVar, j3, j10, z10, new b7.d(i12, i13, i11));
        this.U.g();
        long h = this.U.h();
        o oVar2 = this.f62321m;
        StringBuilder t10 = a8.p0.t(h, "final range remux completed: durationMs=", ", requestedDurationMs=");
        t10.append(j10 - j3);
        t10.append(", actualStartMs=");
        t10.append(a10.f21204a);
        t10.append(", mode=");
        t10.append((String) a10.f21206c);
        t10.append(", size=");
        t10.append(this.U.f62356a.length());
        t10.append(", elapsedMs=");
        t10.append(f(nanoTime));
        oVar2.b(t10.toString());
        g();
        this.f62319k.execute(new g0(this, this.T, this.U.f62356a, h, z10));
    }

    public final void w(boolean z10) {
        if (this.f62331x != z10) {
            this.f62331x = z10;
            iy iyVar = this.f62315f;
            if (iyVar != null) {
                ((y40) iyVar.f36266b).setScreenFlashEnabled(z10);
            }
        }
    }

    public final void x(int i7) {
        int i10 = this.f62310a0;
        this.f62310a0 = i7;
        this.f62321m.b("state: " + yi.i.e(i10) + " -> " + yi.i.e(i7) + ", durationMs=" + j());
        o();
    }

    public final void y(float f10) {
        v();
        if (this.f62310a0 == 3 && !this.f62332y) {
            this.f62320l.T(Math.max(0.0f, Math.min(1.0f, f10)));
        }
    }

    public final void z(boolean z10) {
        if (this.f62333z == z10) {
            return;
        }
        this.f62333z = z10;
        Handler handler = this.f62317i;
        s4.s0 s0Var = this.Y;
        handler.removeCallbacks(s0Var);
        if (z10) {
            handler.post(s0Var);
        }
        this.d.getClass();
        o();
    }
}
