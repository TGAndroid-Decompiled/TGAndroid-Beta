package wi;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView;
import c8.jd;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.ax;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.r31;
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
    public volatile y U;
    public volatile File V;
    public l2.i0 W;
    public final h2.z Z;
    public final Context f58102a;
    public final TextureView f58104b;
    public final File f58106c;
    public final qt d;
    public final r0 f58107e;
    public final ax f58108f;
    public final k f58113l;
    public final o f58114m;
    public final s0 f58115n;
    public final int f58116o;
    public final p0 f58117p;
    public final long f58118q;
    public n0 f58119r;
    public n0 f58120s;
    public o0 f58121t;
    public p0 f58122u;
    public boolean f58123w;
    public boolean f58124x;
    public boolean f58125y;
    public boolean f58126z;
    public final Object f58109g = new Object();
    public final Matrix h = new Matrix();
    public final Handler f58110i = new Handler(Looper.getMainLooper());
    public final ExecutorService f58111j = Executors.newSingleThreadExecutor(new h2.l0(9));
    public final ExecutorService f58112k = Executors.newSingleThreadExecutor(new h2.l0(10));
    public int f58103a0 = 1;
    public int f58105b0 = 1;
    public float v = 1.0f;
    public long M = 1;
    public final j0 X = new j0(this, 0);
    public final tg.y Y = new tg.y(this, 7);

    public u0(l0 l0Var) {
        Context context;
        qt qtVar = new qt(this, 25);
        this.Z = new h2.z(this, 3);
        v();
        Context context2 = l0Var.f57976a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f58102a = context;
        TextureView textureView = l0Var.f57977b;
        this.f58104b = textureView;
        File file = l0Var.f57978c;
        this.f58106c = file == null ? context.getCacheDir() : file;
        this.f58119r = l0Var.d;
        s0 s0Var = l0Var.f57979e;
        this.f58115n = s0Var;
        int i7 = l0Var.h;
        this.f58116o = i7;
        o0 o0Var = l0Var.f57980f;
        p0 p0Var = l0Var.f57981g;
        this.f58117p = p0Var;
        this.f58118q = 60000L;
        boolean z9 = l0Var.f57982i;
        this.d = l0Var.f57983j;
        this.f58107e = l0Var.f57984k;
        this.f58108f = l0Var.f57985l;
        o oVar = new o();
        this.f58114m = oVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(s0Var.f58048a);
        sb2.append("x");
        jg.g.x(sb2, s0Var.f58048a, ", bitrate=", i7, ", cameraMode=");
        sb2.append(o0Var);
        sb2.append(", fps=");
        sb2.append(p0Var.f58031a);
        sb2.append(", composition=");
        sb2.append(z9);
        sb2.append(", facing=");
        sb2.append(this.f58119r);
        sb2.append(", maxDurationMs=60000");
        oVar.b(sb2.toString());
        this.f58113l = new k(context, textureView, s0Var, i7, o0Var, p0Var, z9, oVar, qtVar);
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
        int i7 = this.f58103a0;
        if (i7 != 10 && i7 != 8) {
            this.f58114m.b("cancel requested: state=".concat(rf.b.t(i7)));
            b(3, true);
            e();
            t();
            x(10);
            if (!this.E && !this.f58113l.X()) {
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
        synchronized (this.f58109g) {
            try {
                q0 q0Var = this.T;
                if (q0Var != null && q0Var.f58037e && !z9) {
                    return false;
                }
                this.H = true;
                if (q0Var != null && !q0Var.d) {
                    q0Var.d = true;
                    o oVar = this.f58114m;
                    oVar.b("output generation invalidated: id=" + q0Var.f58034a + ", reason=" + rf.b.s(i7) + ", availableSize=" + q0Var.f58036c);
                    this.f58112k.execute(new i0(this, q0Var, i7, 2));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z9) {
        synchronized (this.f58109g) {
            g();
            File d = d("round_video_");
            long j3 = this.M;
            this.M = 1 + j3;
            q0 q0Var = new q0(j3, d);
            this.T = q0Var;
            this.U = new y(d, this.f58115n.f58048a, z9, this.f58114m, new org.telegram.ui.web.a0(23, this, q0Var));
            o oVar = this.f58114m;
            oVar.b("output generation started: id=" + j3 + ", includeAudio=" + z9 + ", file=" + d.getName());
            this.f58112k.execute(new r31(this, q0Var, d, 26));
        }
    }

    public final File d(String str) {
        File file = this.f58106c;
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
        this.f58123w = false;
        k kVar = this.f58113l;
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
        int i7 = this.f58103a0;
        if (i7 != 9 && i7 != 10) {
            this.f58114m.a("fatal error in state=".concat(rf.b.t(i7)), exc);
            if (b(4, false)) {
                e();
                t();
                this.f58110i.removeCallbacks(this.X);
                q0 q0Var = this.T;
                if (q0Var != null) {
                    this.f58112k.execute(new i0(this, q0Var, exc));
                }
                x(9);
                m("error");
                n40 n40Var = (n40) this.d.f37389b;
                n40Var.C();
                a8.g(exc, true);
                hy0 hy0Var = n40Var.S;
                if (hy0Var != null) {
                    hy0Var.d(true);
                }
                n40Var.S = null;
                if (n40Var.W) {
                    n40Var.W = false;
                    n40Var.O = null;
                } else {
                    MediaController.B().Y(false);
                    if (n40Var.f36202g0) {
                        n40Var.z(6);
                    } else {
                        qs.f(n40Var.f36200f).k(qs.f25028m2, Integer.valueOf(n40Var.h));
                    }
                    n40Var.B(false, false);
                }
                if (!this.E && !this.f58113l.X()) {
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
        j0 j0Var = new j0(this, 1);
        ExecutorService executorService = this.f58111j;
        executorService.execute(j0Var);
        this.f58113l.L();
        this.f58110i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.f58112k.shutdown();
    }

    public final long j() {
        v();
        if (this.f58103a0 != 3) {
            return this.I;
        }
        return Math.min(this.f58118q, (SystemClock.elapsedRealtime() + this.I) - this.J);
    }

    public final void k(q0 q0Var, int i7) {
        synchronized (this.f58109g) {
            try {
                if (!q0Var.d && !q0Var.f58037e) {
                    q0Var.d = true;
                    o oVar = this.f58114m;
                    oVar.b("output generation invalidated: id=" + q0Var.f58034a + ", reason=" + rf.b.s(i7) + ", availableSize=" + q0Var.f58036c);
                    this.f58112k.execute(new i0(this, q0Var, i7, 0));
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
        if (j3 <= this.f58118q && this.K <= 0 && this.L + 10 >= j3) {
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
        o oVar = this.f58114m;
        StringBuilder u10 = a8.p0.u("session summary: terminal=", str, ", state=");
        u10.append(rf.b.t(this.f58103a0));
        u10.append(", durationMs=");
        u10.append(j());
        u10.append(", pauses=");
        u10.append(this.P);
        u10.append(", resumes=");
        u10.append(this.Q);
        u10.append(", cameraSwitches=");
        u10.append(this.R);
        u10.append(", facing=");
        u10.append(this.f58120s);
        u10.append(", cameraMode=");
        u10.append(this.f58121t);
        u10.append(", generation=");
        long j10 = 0;
        if (q0Var == null) {
            j3 = 0;
        } else {
            j3 = q0Var.f58034a;
        }
        u10.append(j3);
        u10.append(", availableSize=");
        if (q0Var != null) {
            j10 = q0Var.f58036c;
        }
        u10.append(j10);
        oVar.b(u10.toString());
    }

    public final void n() {
        n0 n0Var = this.f58119r;
        n0 n0Var2 = this.f58120s;
        m0 m0Var = new m0(n0Var, n0Var2, this.f58105b0, this.v);
        n40 n40Var = (n40) this.d.f37389b;
        n40Var.R = m0Var;
        if (n0Var2 != null) {
            xi.e.f58774j.b(n0Var2);
        }
        n40Var.D();
    }

    public final void o() {
        int i7;
        int i10 = this.f58103a0;
        long j3 = this.I;
        long j10 = this.J;
        boolean z9 = this.f58126z;
        boolean z10 = this.f58125y;
        boolean z11 = this.f58123w;
        long j11 = this.f58118q;
        t0 t0Var = new t0(i10, j3, j10, j11, z9, z10, z11);
        n40 n40Var = (n40) this.d.f37389b;
        t0 t0Var2 = n40Var.Q;
        int i11 = n40Var.f36200f;
        if (t0Var2 == null) {
            i7 = 0;
        } else {
            i7 = t0Var2.f58049a;
        }
        n40Var.Q = t0Var;
        if (i7 == 3 && i10 != 3) {
            n40Var.A(true);
        }
        n40Var.f36219v0 = Math.max(n40Var.f36219v0, j3);
        if (i10 != 3) {
            n40Var.setRecordingUiFrameClockActive(false);
            n40Var.f36220w.setProgress(((float) j3) / ((float) j11));
        } else {
            if (!n40Var.D0) {
                n40Var.D0 = true;
                qs.e().k(qs.f25012j1, 512);
            }
            n40.o(n40Var);
            n40Var.setRecordingUiFrameClockActive(true);
            n40Var.F();
            if (!n40Var.f36202g0) {
                n40Var.f36202g0 = true;
                qs.f(i11).k(qs.f25023l2, Integer.valueOf(n40Var.h), Boolean.FALSE);
            } else if (n40Var.f36203h0) {
                n40Var.f36203h0 = false;
                qs.f(i11).k(qs.f25044p2, new Object[0]);
            }
        }
        if (i10 == 8 || i10 == 9 || i10 == 10) {
            n40Var.s();
            n40Var.C();
        }
        if (i7 == 3 && i10 == 4) {
            n40Var.z(2);
        }
        n40Var.D();
        if (n40Var.U != null && !n40Var.V) {
            org.telegram.messenger.g0.h3(new i40(n40Var, 1));
        }
        if (z9 && n40Var.getWindowVisibility() != 0) {
            org.telegram.messenger.g0.h3(new i40(n40Var, 2));
        }
    }

    public final void p() {
        l2.i0 i0Var;
        v();
        if (this.f58103a0 == 5 && (i0Var = this.W) != null) {
            i0Var.b();
            z(false);
            this.W.l();
            this.d.getClass();
        }
    }

    public final void q() {
        v();
        if (this.f58103a0 != 3) {
            return;
        }
        this.I = j();
        this.P++;
        this.f58114m.b("pause requested: durationMs=" + this.I);
        e();
        this.f58110i.removeCallbacks(this.X);
        x(4);
        boolean X = this.f58113l.X();
        this.E = X;
        if (!X) {
            h(new IllegalStateException("Unable to stop the camera segment"));
        }
    }

    public final void r() {
        l2.i0 i0Var;
        v();
        if (this.f58103a0 == 5 && (i0Var = this.W) != null) {
            long l10 = i0Var.l();
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
        int i7 = this.f58103a0;
        if (i7 == 10) {
            if (!this.F) {
                i();
            }
        } else if (i7 == 7) {
            if (this.G) {
                return;
            }
            this.G = true;
            this.f58114m.b("release deferred: output is still finishing");
            e();
            t();
        } else if (i7 != 8) {
            a();
        } else {
            e();
            t();
            this.f58113l.L();
            this.F = true;
            x(10);
            m("released");
            this.f58110i.removeCallbacksAndMessages(null);
            this.f58111j.shutdown();
            this.f58112k.shutdown();
        }
    }

    public final void t() {
        this.f58110i.removeCallbacks(this.Y);
        this.f58126z = false;
        l2.i0 i0Var = this.W;
        if (i0Var == null) {
            return;
        }
        i0Var.h0(this.Z);
        l2.i0 i0Var2 = this.W;
        i0Var2.F1();
        TextureView textureView = this.f58104b;
        if (textureView != null && textureView == i0Var2.X) {
            i0Var2.F1();
            i0Var2.s1();
            i0Var2.x1(null);
            i0Var2.q1(0, 0);
        }
        this.W.X0();
        this.W = null;
    }

    public final void u(File file, int i7, long j3, long j10, boolean z9, int i10) {
        long nanoTime = System.nanoTime();
        o oVar = this.f58114m;
        StringBuilder t6 = a8.p0.t(j3, "final range remux started: range=", "..");
        t6.append(j10);
        t6.append(", includeAudio=");
        t6.append(z9);
        t6.append(", reason=");
        t6.append(rf.b.s(i10));
        oVar.b(t6.toString());
        g();
        k(this.T, i10);
        c(z9);
        g();
        y yVar = this.U;
        int i11 = i7;
        int i12 = this.f58115n.f58048a;
        int i13 = this.f58116o;
        if (i11 <= 0) {
            i11 = this.f58117p.f58031a;
        }
        n2.p0 a10 = jd.a(file, yVar, j3, j10, z9, new b7.d(i12, i13, i11));
        this.U.g();
        long h = this.U.h();
        o oVar2 = this.f58114m;
        StringBuilder t10 = a8.p0.t(h, "final range remux completed: durationMs=", ", requestedDurationMs=");
        t10.append(j10 - j3);
        t10.append(", actualStartMs=");
        t10.append(a10.f20262a);
        t10.append(", mode=");
        t10.append((String) a10.f20264c);
        t10.append(", size=");
        t10.append(this.U.f58149a.length());
        t10.append(", elapsedMs=");
        t10.append(f(nanoTime));
        oVar2.b(t10.toString());
        g();
        this.f58112k.execute(new h0(this, this.T, this.U.f58149a, h, z9));
    }

    public final void w(boolean z9) {
        if (this.f58124x != z9) {
            this.f58124x = z9;
            ax axVar = this.f58108f;
            if (axVar != null) {
                ((n40) axVar.f31937b).setScreenFlashEnabled(z9);
            }
        }
    }

    public final void x(int i7) {
        int i10 = this.f58103a0;
        this.f58103a0 = i7;
        this.f58114m.b("state: " + rf.b.t(i10) + " -> " + rf.b.t(i7) + ", durationMs=" + j());
        o();
    }

    public final void y(float f10) {
        v();
        if (this.f58103a0 == 3 && !this.f58125y) {
            this.f58113l.T(Math.max(0.0f, Math.min(1.0f, f10)));
        }
    }

    public final void z(boolean z9) {
        if (this.f58126z == z9) {
            return;
        }
        this.f58126z = z9;
        Handler handler = this.f58110i;
        tg.y yVar = this.Y;
        handler.removeCallbacks(yVar);
        if (z9) {
            handler.post(yVar);
        }
        this.d.getClass();
        o();
    }
}
