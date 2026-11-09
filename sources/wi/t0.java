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
import org.telegram.ui.Components.bx;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.s31;
public final class t0 {
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
    public volatile p0 T;
    public volatile x U;
    public volatile File V;
    public l2.i0 W;
    public final h2.z Z;
    public final Context f58201a;
    public final TextureView f58203b;
    public final File f58205c;
    public final rt d;
    public final q0 f58206e;
    public final bx f58207f;
    public final k f58212l;
    public final o f58213m;
    public final r0 f58214n;
    public final int f58215o;
    public final o0 f58216p;
    public final long f58217q;
    public m0 f58218r;
    public m0 f58219s;
    public n0 f58220t;
    public o0 f58221u;
    public boolean f58222w;
    public boolean f58223x;
    public boolean f58224y;
    public boolean f58225z;
    public final Object f58208g = new Object();
    public final Matrix h = new Matrix();
    public final Handler f58209i = new Handler(Looper.getMainLooper());
    public final ExecutorService f58210j = Executors.newSingleThreadExecutor(new h2.l0(10));
    public final ExecutorService f58211k = Executors.newSingleThreadExecutor(new h2.l0(11));
    public int f58202a0 = 1;
    public int f58204b0 = 1;
    public float v = 1.0f;
    public long M = 1;
    public final i0 X = new i0(this, 0);
    public final tg.y Y = new tg.y(this, 7);

    public t0(k0 k0Var) {
        Context context;
        rt rtVar = new rt(this, 25);
        this.Z = new h2.z(this, 3);
        v();
        Context context2 = k0Var.f58076a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f58201a = context;
        TextureView textureView = k0Var.f58077b;
        this.f58203b = textureView;
        File file = k0Var.f58078c;
        this.f58205c = file == null ? context.getCacheDir() : file;
        this.f58218r = k0Var.d;
        r0 r0Var = k0Var.f58079e;
        this.f58214n = r0Var;
        int i7 = k0Var.h;
        this.f58215o = i7;
        n0 n0Var = k0Var.f58080f;
        o0 o0Var = k0Var.f58081g;
        this.f58216p = o0Var;
        this.f58217q = 60000L;
        boolean z9 = k0Var.f58082i;
        this.d = k0Var.f58083j;
        this.f58206e = k0Var.f58084k;
        this.f58207f = k0Var.f58085l;
        o oVar = new o();
        this.f58213m = oVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(r0Var.f58147a);
        sb2.append("x");
        jg.g.x(sb2, r0Var.f58147a, ", bitrate=", i7, ", cameraMode=");
        sb2.append(n0Var);
        sb2.append(", fps=");
        sb2.append(o0Var.f58131a);
        sb2.append(", composition=");
        sb2.append(z9);
        sb2.append(", facing=");
        sb2.append(this.f58218r);
        sb2.append(", maxDurationMs=60000");
        oVar.b(sb2.toString());
        this.f58212l = new k(context, textureView, r0Var, i7, n0Var, o0Var, z9, oVar, rtVar);
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
        int i7 = this.f58202a0;
        if (i7 != 10 && i7 != 8) {
            this.f58213m.b("cancel requested: state=".concat(rf.b.u(i7)));
            b(3, true);
            e();
            t();
            x(10);
            if (!this.E && !this.f58212l.W()) {
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
        synchronized (this.f58208g) {
            try {
                p0 p0Var = this.T;
                if (p0Var != null && p0Var.f58137e && !z9) {
                    return false;
                }
                this.H = true;
                if (p0Var != null && !p0Var.d) {
                    p0Var.d = true;
                    o oVar = this.f58213m;
                    oVar.b("output generation invalidated: id=" + p0Var.f58134a + ", reason=" + rf.b.t(i7) + ", availableSize=" + p0Var.f58136c);
                    this.f58211k.execute(new h0(this, p0Var, i7, 2));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z9) {
        synchronized (this.f58208g) {
            g();
            File d = d("round_video_");
            long j3 = this.M;
            this.M = 1 + j3;
            p0 p0Var = new p0(j3, d);
            this.T = p0Var;
            this.U = new x(d, this.f58214n.f58147a, z9, this.f58213m, new org.telegram.ui.web.a0(22, this, p0Var));
            o oVar = this.f58213m;
            oVar.b("output generation started: id=" + j3 + ", includeAudio=" + z9 + ", file=" + d.getName());
            this.f58211k.execute(new s31(this, p0Var, d, 26));
        }
    }

    public final File d(String str) {
        File file = this.f58205c;
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
        this.f58222w = false;
        k kVar = this.f58212l;
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
        int i7 = this.f58202a0;
        if (i7 != 9 && i7 != 10) {
            this.f58213m.a("fatal error in state=".concat(rf.b.u(i7)), exc);
            if (b(4, false)) {
                e();
                t();
                this.f58209i.removeCallbacks(this.X);
                p0 p0Var = this.T;
                if (p0Var != null) {
                    this.f58211k.execute(new h0(this, p0Var, exc));
                }
                x(9);
                m("error");
                o40 o40Var = (o40) this.d.f37805b;
                o40Var.C();
                a8.g(exc, true);
                iy0 iy0Var = o40Var.S;
                if (iy0Var != null) {
                    iy0Var.d(true);
                }
                o40Var.S = null;
                if (o40Var.W) {
                    o40Var.W = false;
                    o40Var.O = null;
                } else {
                    MediaController.B().Y(false);
                    if (o40Var.f36624g0) {
                        o40Var.z(6);
                    } else {
                        qs.f(o40Var.f36622f).k(qs.f25037m2, Integer.valueOf(o40Var.h));
                    }
                    o40Var.B(false, false);
                }
                if (!this.E && !this.f58212l.W()) {
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
        ExecutorService executorService = this.f58210j;
        executorService.execute(i0Var);
        this.f58212l.K();
        this.f58209i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.f58211k.shutdown();
    }

    public final long j() {
        v();
        if (this.f58202a0 != 3) {
            return this.I;
        }
        return Math.min(this.f58217q, (SystemClock.elapsedRealtime() + this.I) - this.J);
    }

    public final void k(p0 p0Var, int i7) {
        synchronized (this.f58208g) {
            try {
                if (!p0Var.d && !p0Var.f58137e) {
                    p0Var.d = true;
                    o oVar = this.f58213m;
                    oVar.b("output generation invalidated: id=" + p0Var.f58134a + ", reason=" + rf.b.t(i7) + ", availableSize=" + p0Var.f58136c);
                    this.f58211k.execute(new h0(this, p0Var, i7, 0));
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
        if (j3 <= this.f58217q && this.K <= 0 && this.L + 10 >= j3) {
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
        p0 p0Var = this.T;
        o oVar = this.f58213m;
        StringBuilder u10 = a8.p0.u("session summary: terminal=", str, ", state=");
        u10.append(rf.b.u(this.f58202a0));
        u10.append(", durationMs=");
        u10.append(j());
        u10.append(", pauses=");
        u10.append(this.P);
        u10.append(", resumes=");
        u10.append(this.Q);
        u10.append(", cameraSwitches=");
        u10.append(this.R);
        u10.append(", facing=");
        u10.append(this.f58219s);
        u10.append(", cameraMode=");
        u10.append(this.f58220t);
        u10.append(", generation=");
        long j10 = 0;
        if (p0Var == null) {
            j3 = 0;
        } else {
            j3 = p0Var.f58134a;
        }
        u10.append(j3);
        u10.append(", availableSize=");
        if (p0Var != null) {
            j10 = p0Var.f58136c;
        }
        u10.append(j10);
        oVar.b(u10.toString());
    }

    public final void n() {
        m0 m0Var = this.f58218r;
        m0 m0Var2 = this.f58219s;
        l0 l0Var = new l0(m0Var, m0Var2, this.f58204b0, this.v);
        o40 o40Var = (o40) this.d.f37805b;
        o40Var.R = l0Var;
        if (m0Var2 != null) {
            xi.e.f58873j.b(m0Var2);
        }
        o40Var.D();
    }

    public final void o() {
        int i7;
        int i10 = this.f58202a0;
        long j3 = this.I;
        long j10 = this.J;
        boolean z9 = this.f58225z;
        boolean z10 = this.f58224y;
        boolean z11 = this.f58222w;
        long j11 = this.f58217q;
        s0 s0Var = new s0(i10, j3, j10, j11, z9, z10, z11);
        o40 o40Var = (o40) this.d.f37805b;
        s0 s0Var2 = o40Var.Q;
        int i11 = o40Var.f36622f;
        if (s0Var2 == null) {
            i7 = 0;
        } else {
            i7 = s0Var2.f58148a;
        }
        o40Var.Q = s0Var;
        if (i7 == 3 && i10 != 3) {
            o40Var.A(true);
        }
        o40Var.f36641v0 = Math.max(o40Var.f36641v0, j3);
        if (i10 != 3) {
            o40Var.setRecordingUiFrameClockActive(false);
            o40Var.f36642w.setProgress(((float) j3) / ((float) j11));
        } else {
            if (!o40Var.D0) {
                o40Var.D0 = true;
                qs.e().k(qs.f25021j1, 512);
            }
            o40.o(o40Var);
            o40Var.setRecordingUiFrameClockActive(true);
            o40Var.F();
            if (!o40Var.f36624g0) {
                o40Var.f36624g0 = true;
                qs.f(i11).k(qs.f25032l2, Integer.valueOf(o40Var.h), Boolean.FALSE);
            } else if (o40Var.f36625h0) {
                o40Var.f36625h0 = false;
                qs.f(i11).k(qs.f25053p2, new Object[0]);
            }
        }
        if (i10 == 8 || i10 == 9 || i10 == 10) {
            o40Var.s();
            o40Var.C();
        }
        if (i7 == 3 && i10 == 4) {
            o40Var.z(2);
        }
        o40Var.D();
        if (o40Var.U != null && !o40Var.V) {
            org.telegram.messenger.g0.h3(new j40(o40Var, 1));
        }
        if (z9 && o40Var.getWindowVisibility() != 0) {
            org.telegram.messenger.g0.h3(new j40(o40Var, 2));
        }
    }

    public final void p() {
        l2.i0 i0Var;
        v();
        if (this.f58202a0 == 5 && (i0Var = this.W) != null) {
            i0Var.b();
            z(false);
            this.W.l();
            this.d.getClass();
        }
    }

    public final void q() {
        v();
        if (this.f58202a0 != 3) {
            return;
        }
        this.I = j();
        this.P++;
        this.f58213m.b("pause requested: durationMs=" + this.I);
        e();
        this.f58209i.removeCallbacks(this.X);
        x(4);
        boolean W = this.f58212l.W();
        this.E = W;
        if (!W) {
            h(new IllegalStateException("Unable to stop the camera segment"));
        }
    }

    public final void r() {
        l2.i0 i0Var;
        v();
        if (this.f58202a0 == 5 && (i0Var = this.W) != null) {
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
        int i7 = this.f58202a0;
        if (i7 == 10) {
            if (!this.F) {
                i();
            }
        } else if (i7 == 7) {
            if (this.G) {
                return;
            }
            this.G = true;
            this.f58213m.b("release deferred: output is still finishing");
            e();
            t();
        } else if (i7 != 8) {
            a();
        } else {
            e();
            t();
            this.f58212l.K();
            this.F = true;
            x(10);
            m("released");
            this.f58209i.removeCallbacksAndMessages(null);
            this.f58210j.shutdown();
            this.f58211k.shutdown();
        }
    }

    public final void t() {
        this.f58209i.removeCallbacks(this.Y);
        this.f58225z = false;
        l2.i0 i0Var = this.W;
        if (i0Var == null) {
            return;
        }
        i0Var.h0(this.Z);
        l2.i0 i0Var2 = this.W;
        i0Var2.F1();
        TextureView textureView = this.f58203b;
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
        o oVar = this.f58213m;
        StringBuilder t6 = a8.p0.t(j3, "final range remux started: range=", "..");
        t6.append(j10);
        t6.append(", includeAudio=");
        t6.append(z9);
        t6.append(", reason=");
        t6.append(rf.b.t(i10));
        oVar.b(t6.toString());
        g();
        k(this.T, i10);
        c(z9);
        g();
        x xVar = this.U;
        int i11 = i7;
        int i12 = this.f58214n.f58147a;
        int i13 = this.f58215o;
        if (i11 <= 0) {
            i11 = this.f58216p.f58131a;
        }
        n2.p0 a10 = jd.a(file, xVar, j3, j10, z9, new b7.d(i12, i13, i11));
        this.U.g();
        long h = this.U.h();
        o oVar2 = this.f58213m;
        StringBuilder t10 = a8.p0.t(h, "final range remux completed: durationMs=", ", requestedDurationMs=");
        t10.append(j10 - j3);
        t10.append(", actualStartMs=");
        t10.append(a10.f20265a);
        t10.append(", mode=");
        t10.append((String) a10.f20267c);
        t10.append(", size=");
        t10.append(this.U.f58248a.length());
        t10.append(", elapsedMs=");
        t10.append(f(nanoTime));
        oVar2.b(t10.toString());
        g();
        this.f58211k.execute(new g0(this, this.T, this.U.f58248a, h, z9));
    }

    public final void w(boolean z9) {
        if (this.f58223x != z9) {
            this.f58223x = z9;
            bx bxVar = this.f58207f;
            if (bxVar != null) {
                ((o40) bxVar.f32442b).setScreenFlashEnabled(z9);
            }
        }
    }

    public final void x(int i7) {
        int i10 = this.f58202a0;
        this.f58202a0 = i7;
        this.f58213m.b("state: " + rf.b.u(i10) + " -> " + rf.b.u(i7) + ", durationMs=" + j());
        o();
    }

    public final void y(float f10) {
        v();
        if (this.f58202a0 == 3 && !this.f58224y) {
            this.f58212l.T(Math.max(0.0f, Math.min(1.0f, f10)));
        }
    }

    public final void z(boolean z9) {
        if (this.f58225z == z9) {
            return;
        }
        this.f58225z = z9;
        Handler handler = this.f58209i;
        tg.y yVar = this.Y;
        handler.removeCallbacks(yVar);
        if (z9) {
            handler.post(yVar);
        }
        this.d.getClass();
        o();
    }
}
