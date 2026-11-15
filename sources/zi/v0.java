package zi;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView;
import c8.le;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.gx;
import org.telegram.ui.Components.jy0;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.q40;
public final class v0 {
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
    public volatile r0 T;
    public volatile y U;
    public volatile File V;
    public l2.f0 W;
    public final h2.z Z;
    public final Context f61744a;
    public final TextureView f61746b;
    public final File f61748c;
    public final ff d;
    public final s0 f61749e;
    public final gx f61750f;
    public final l f61755l;
    public final p f61756m;
    public final t0 f61757n;
    public final int f61758o;
    public final q0 f61759p;
    public final long f61760q;
    public n0 f61761r;
    public n0 f61762s;
    public o0 f61763t;
    public q0 f61764u;
    public boolean f61765w;
    public boolean f61766x;
    public boolean f61767y;
    public boolean f61768z;
    public final Object f61751g = new Object();
    public final Matrix h = new Matrix();
    public final Handler f61752i = new Handler(Looper.getMainLooper());
    public final ExecutorService f61753j = Executors.newSingleThreadExecutor(new ai.x0(11));
    public final ExecutorService f61754k = Executors.newSingleThreadExecutor(new ai.x0(12));
    public int f61745a0 = 1;
    public int f61747b0 = 1;
    public float v = 1.0f;
    public long M = 1;
    public final j0 X = new j0(this, 0);
    public final s4.s0 Y = new s4.s0(this, 10);

    public v0(l0 l0Var) {
        Context context;
        u7.i iVar = new u7.i(this);
        this.Z = new h2.z(this, 3);
        v();
        Context context2 = l0Var.f61619a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f61744a = context;
        TextureView textureView = l0Var.f61620b;
        this.f61746b = textureView;
        File file = l0Var.f61621c;
        this.f61748c = file == null ? context.getCacheDir() : file;
        this.f61761r = l0Var.d;
        t0 t0Var = l0Var.f61622e;
        this.f61757n = t0Var;
        int i7 = l0Var.h;
        this.f61758o = i7;
        o0 o0Var = l0Var.f61623f;
        q0 q0Var = l0Var.f61624g;
        this.f61759p = q0Var;
        this.f61760q = 60000L;
        boolean z10 = l0Var.f61625i;
        this.d = l0Var.f61626j;
        this.f61749e = l0Var.f61627k;
        this.f61750f = l0Var.f61628l;
        p pVar = new p();
        this.f61756m = pVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(t0Var.f61690a);
        sb2.append("x");
        i5.c.y(sb2, t0Var.f61690a, ", bitrate=", i7, ", cameraMode=");
        sb2.append(o0Var);
        sb2.append(", fps=");
        sb2.append(q0Var.f61676a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.f61761r);
        sb2.append(", maxDurationMs=60000");
        pVar.b(sb2.toString());
        this.f61755l = new l(context, textureView, t0Var, i7, o0Var, q0Var, z10, pVar, iVar);
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
        int i7 = this.f61745a0;
        if (i7 != 10 && i7 != 8) {
            this.f61756m.b("cancel requested: state=".concat(p0.b(i7)));
            b(3, true);
            e();
            t();
            x(10);
            if (!this.E && !this.f61755l.W()) {
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
        synchronized (this.f61751g) {
            try {
                r0 r0Var = this.T;
                if (r0Var != null && r0Var.f61682e && !z10) {
                    return false;
                }
                this.H = true;
                if (r0Var != null && !r0Var.d) {
                    r0Var.d = true;
                    p pVar = this.f61756m;
                    pVar.b("output generation invalidated: id=" + r0Var.f61679a + ", reason=" + p0.a(i7) + ", availableSize=" + r0Var.f61681c);
                    this.f61754k.execute(new i0(this, r0Var, i7, 2));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z10) {
        synchronized (this.f61751g) {
            g();
            File d = d("round_video_");
            long j3 = this.M;
            this.M = 1 + j3;
            r0 r0Var = new r0(j3, d);
            this.T = r0Var;
            this.U = new y(d, this.f61757n.f61690a, z10, this.f61756m, new xg.d(this, r0Var));
            p pVar = this.f61756m;
            pVar.b("output generation started: id=" + j3 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.f61754k.execute(new yi.d(this, r0Var, d, 4));
        }
    }

    public final File d(String str) {
        File file = this.f61748c;
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
        this.f61765w = false;
        l lVar = this.f61755l;
        lVar.T(0.0f);
        lVar.S(false);
        w(false);
    }

    public final void g() {
        if (!this.H) {
            return;
        }
        throw new IOException("Round-video operation was cancelled");
    }

    public final void h(Exception exc) {
        int i7 = this.f61745a0;
        if (i7 != 9 && i7 != 10) {
            this.f61756m.a("fatal error in state=".concat(p0.b(i7)), exc);
            if (b(4, false)) {
                e();
                t();
                this.f61752i.removeCallbacks(this.X);
                r0 r0Var = this.T;
                if (r0Var != null) {
                    this.f61754k.execute(new i0(this, r0Var, exc));
                }
                x(9);
                m("error");
                q40 q40Var = (q40) this.d.f34586b;
                q40Var.C();
                a8.g(exc, true);
                jy0 jy0Var = q40Var.T;
                if (jy0Var != null) {
                    jy0Var.d(true);
                }
                q40Var.T = null;
                if (q40Var.f38486a0) {
                    q40Var.f38486a0 = false;
                    q40Var.P = null;
                } else {
                    MediaController.B().Y(false);
                    if (q40Var.f38495h0) {
                        q40Var.z(6);
                    } else {
                        ns.f(q40Var.f38492f).k(ns.f25533m2, Integer.valueOf(q40Var.h));
                    }
                    q40Var.B(false, false);
                }
                if (!this.E && !this.f61755l.W()) {
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
        ExecutorService executorService = this.f61753j;
        executorService.execute(j0Var);
        this.f61755l.K();
        this.f61752i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.f61754k.shutdown();
    }

    public final long j() {
        v();
        if (this.f61745a0 != 3) {
            return this.I;
        }
        return Math.min(this.f61760q, (SystemClock.elapsedRealtime() + this.I) - this.J);
    }

    public final void k(r0 r0Var, int i7) {
        synchronized (this.f61751g) {
            try {
                if (!r0Var.d && !r0Var.f61682e) {
                    r0Var.d = true;
                    p pVar = this.f61756m;
                    pVar.b("output generation invalidated: id=" + r0Var.f61679a + ", reason=" + p0.a(i7) + ", availableSize=" + r0Var.f61681c);
                    this.f61754k.execute(new i0(this, r0Var, i7, 0));
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
        if (j3 <= this.f61760q && this.K <= 0 && this.L + 10 >= j3) {
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
        r0 r0Var = this.T;
        p pVar = this.f61756m;
        StringBuilder u10 = a8.p0.u("session summary: terminal=", str, ", state=");
        u10.append(p0.b(this.f61745a0));
        u10.append(", durationMs=");
        u10.append(j());
        u10.append(", pauses=");
        u10.append(this.P);
        u10.append(", resumes=");
        u10.append(this.Q);
        u10.append(", cameraSwitches=");
        u10.append(this.R);
        u10.append(", facing=");
        u10.append(this.f61762s);
        u10.append(", cameraMode=");
        u10.append(this.f61763t);
        u10.append(", generation=");
        long j10 = 0;
        if (r0Var == null) {
            j3 = 0;
        } else {
            j3 = r0Var.f61679a;
        }
        u10.append(j3);
        u10.append(", availableSize=");
        if (r0Var != null) {
            j10 = r0Var.f61681c;
        }
        u10.append(j10);
        pVar.b(u10.toString());
    }

    public final void n() {
        n0 n0Var = this.f61761r;
        n0 n0Var2 = this.f61762s;
        m0 m0Var = new m0(n0Var, n0Var2, this.f61747b0, this.v);
        q40 q40Var = (q40) this.d.f34586b;
        q40Var.S = m0Var;
        if (n0Var2 != null) {
            aj.e.f1657j.b(n0Var2);
        }
        q40Var.D();
    }

    public final void o() {
        int i7;
        int i10 = this.f61745a0;
        long j3 = this.I;
        long j10 = this.J;
        boolean z10 = this.f61768z;
        boolean z11 = this.f61767y;
        boolean z12 = this.f61765w;
        long j11 = this.f61760q;
        u0 u0Var = new u0(i10, j3, j10, j11, z10, z11, z12);
        q40 q40Var = (q40) this.d.f34586b;
        u0 u0Var2 = q40Var.R;
        int i11 = q40Var.f38492f;
        if (u0Var2 == null) {
            i7 = 0;
        } else {
            i7 = u0Var2.f61738a;
        }
        q40Var.R = u0Var;
        if (i7 == 3 && i10 != 3) {
            q40Var.A(true);
        }
        q40Var.f38513w0 = Math.max(q40Var.f38513w0, j3);
        if (i10 != 3) {
            q40Var.setRecordingUiFrameClockActive(false);
            q40Var.f38512w.setProgress(((float) j3) / ((float) j11));
        } else {
            if (!q40Var.E0) {
                q40Var.E0 = true;
                ns.e().k(ns.f25517j1, 512);
            }
            q40.o(q40Var);
            q40Var.setRecordingUiFrameClockActive(true);
            q40Var.F();
            if (!q40Var.f38495h0) {
                q40Var.f38495h0 = true;
                ns.f(i11).k(ns.f25528l2, Integer.valueOf(q40Var.h), Boolean.FALSE);
            } else if (q40Var.f38496i0) {
                q40Var.f38496i0 = false;
                ns.f(i11).k(ns.f25549p2, new Object[0]);
            }
        }
        if (i10 == 8 || i10 == 9 || i10 == 10) {
            q40Var.s();
            q40Var.C();
        }
        if (i7 == 3 && i10 == 4) {
            q40Var.z(2);
        }
        q40Var.D();
        if (q40Var.V != null && !q40Var.W) {
            org.telegram.messenger.g0.h3(new l40(q40Var, 1));
        }
        if (z10 && q40Var.getWindowVisibility() != 0) {
            org.telegram.messenger.g0.h3(new l40(q40Var, 2));
        }
    }

    public final void p() {
        l2.f0 f0Var;
        v();
        if (this.f61745a0 == 5 && (f0Var = this.W) != null) {
            f0Var.b();
            z(false);
            this.W.l();
            this.d.getClass();
        }
    }

    public final void q() {
        v();
        if (this.f61745a0 != 3) {
            return;
        }
        this.I = j();
        this.P++;
        this.f61756m.b("pause requested: durationMs=" + this.I);
        e();
        this.f61752i.removeCallbacks(this.X);
        x(4);
        boolean W = this.f61755l.W();
        this.E = W;
        if (!W) {
            h(new IllegalStateException("Unable to stop the camera segment"));
        }
    }

    public final void r() {
        l2.f0 f0Var;
        v();
        if (this.f61745a0 == 5 && (f0Var = this.W) != null) {
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
        int i7 = this.f61745a0;
        if (i7 == 10) {
            if (!this.F) {
                i();
            }
        } else if (i7 == 7) {
            if (this.G) {
                return;
            }
            this.G = true;
            this.f61756m.b("release deferred: output is still finishing");
            e();
            t();
        } else if (i7 != 8) {
            a();
        } else {
            e();
            t();
            this.f61755l.K();
            this.F = true;
            x(10);
            m("released");
            this.f61752i.removeCallbacksAndMessages(null);
            this.f61753j.shutdown();
            this.f61754k.shutdown();
        }
    }

    public final void t() {
        this.f61752i.removeCallbacks(this.Y);
        this.f61768z = false;
        l2.f0 f0Var = this.W;
        if (f0Var == null) {
            return;
        }
        f0Var.h0(this.Z);
        l2.f0 f0Var2 = this.W;
        f0Var2.F1();
        TextureView textureView = this.f61746b;
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
        p pVar = this.f61756m;
        StringBuilder t6 = a8.p0.t(j3, "final range remux started: range=", "..");
        t6.append(j10);
        t6.append(", includeAudio=");
        t6.append(z10);
        t6.append(", reason=");
        t6.append(p0.a(i10));
        pVar.b(t6.toString());
        g();
        k(this.T, i10);
        c(z10);
        g();
        y yVar = this.U;
        int i11 = i7;
        int i12 = this.f61757n.f61690a;
        int i13 = this.f61758o;
        if (i11 <= 0) {
            i11 = this.f61759p.f61676a;
        }
        n2.q0 a10 = le.a(file, yVar, j3, j10, z10, new b7.d(i12, i13, i11));
        this.U.g();
        long h = this.U.h();
        p pVar2 = this.f61756m;
        StringBuilder t10 = a8.p0.t(h, "final range remux completed: durationMs=", ", requestedDurationMs=");
        t10.append(j10 - j3);
        t10.append(", actualStartMs=");
        t10.append(a10.f20843a);
        t10.append(", mode=");
        t10.append((String) a10.f20845c);
        t10.append(", size=");
        t10.append(this.U.f61791a.length());
        t10.append(", elapsedMs=");
        t10.append(f(nanoTime));
        pVar2.b(t10.toString());
        g();
        this.f61754k.execute(new h0(this, this.T, this.U.f61791a, h, z10));
    }

    public final void w(boolean z10) {
        if (this.f61766x != z10) {
            this.f61766x = z10;
            gx gxVar = this.f61750f;
            if (gxVar != null) {
                ((q40) gxVar.f35079b).setScreenFlashEnabled(z10);
            }
        }
    }

    public final void x(int i7) {
        int i10 = this.f61745a0;
        this.f61745a0 = i7;
        this.f61756m.b("state: " + p0.b(i10) + " -> " + p0.b(i7) + ", durationMs=" + j());
        o();
    }

    public final void y(float f10) {
        v();
        if (this.f61745a0 == 3 && !this.f61767y) {
            this.f61755l.T(Math.max(0.0f, Math.min(1.0f, f10)));
        }
    }

    public final void z(boolean z10) {
        if (this.f61768z == z10) {
            return;
        }
        this.f61768z = z10;
        Handler handler = this.f61752i;
        s4.s0 s0Var = this.Y;
        handler.removeCallbacks(s0Var);
        if (z10) {
            handler.post(s0Var);
        }
        this.d.getClass();
        o();
    }
}
