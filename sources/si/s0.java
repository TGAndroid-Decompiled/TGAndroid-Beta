package si;

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
import k2.w0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.tv;
import w7.m7;
public final class s0 {
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
    public volatile o0 P;
    public volatile w Q;
    public volatile File R;
    public i2.i0 S;
    public final e2.z V;
    public final Context f46762a;
    public final TextureView f46763b;
    public final File f46764c;
    public final l2.f d;
    public final p0 e;
    public final tv f46765f;
    public final j f46770l;
    public final n f46771m;
    public final q0 f46772n;
    public final long f46773o;
    public l0 f46774p;
    public l0 f46775q;
    public m0 f46776r;
    public n0 f46777s;
    public boolean f46779u;
    public boolean v;
    public boolean f46780w;
    public boolean f46781x;
    public boolean f46782y;
    public boolean f46783z;
    public final Object f46766g = new Object();
    public final Matrix h = new Matrix();
    public final Handler f46767i = new Handler(Looper.getMainLooper());
    public final ExecutorService f46768j = Executors.newSingleThreadExecutor(new e2.l0(8));
    public final ExecutorService f46769k = Executors.newSingleThreadExecutor(new e2.l0(9));
    public int W = 1;
    public int X = 1;
    public float f46778t = 1.0f;
    public long I = 1;
    public final i0 T = new i0(this, 0);
    public final p8.b U = new p8.b(this, 5);

    public s0(j0 j0Var) {
        Context context;
        w0 w0Var = new w0(this, 23);
        this.V = new e2.z(this, 3);
        t();
        Context context2 = j0Var.f46691a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f46762a = context;
        TextureView textureView = j0Var.f46692b;
        this.f46763b = textureView;
        File file = j0Var.f46693c;
        this.f46764c = file == null ? context.getCacheDir() : file;
        this.f46774p = j0Var.d;
        q0 q0Var = j0Var.e;
        this.f46772n = q0Var;
        int i10 = j0Var.h;
        m0 m0Var = j0Var.f46694f;
        n0 n0Var = j0Var.f46695g;
        this.f46773o = 60000L;
        boolean z10 = j0Var.f46696i;
        this.d = j0Var.f46697j;
        this.e = j0Var.f46698k;
        this.f46765f = j0Var.f46699l;
        n nVar = new n();
        this.f46771m = nVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(q0Var.f46755a);
        sb2.append("x");
        i2.e.w(sb2, q0Var.f46755a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(m0Var);
        sb2.append(", fps=");
        sb2.append(n0Var.f46740a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.f46774p);
        sb2.append(", maxDurationMs=60000");
        nVar.b(sb2.toString());
        this.f46770l = new j(context, textureView, q0Var, i10, m0Var, n0Var, z10, nVar, w0Var);
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
            this.f46771m.b("cancel requested: state=".concat(r4.c.w(i10)));
            if (b(3)) {
                e();
                r();
                v(10);
                if (!this.B && !this.f46770l.Y()) {
                    i();
                    return;
                }
                this.B = true;
                this.A = true;
            }
        }
    }

    public final boolean b(int i10) {
        synchronized (this.f46766g) {
            try {
                o0 o0Var = this.P;
                if (o0Var != null && o0Var.e) {
                    return false;
                }
                this.D = true;
                if (o0Var != null && !o0Var.d) {
                    o0Var.d = true;
                    n nVar = this.f46771m;
                    nVar.b("output generation invalidated: id=" + o0Var.f46744a + ", reason=" + r4.c.v(i10) + ", availableSize=" + o0Var.f46746c);
                    this.f46769k.execute(new h0(this, o0Var, i10, 2));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z10) {
        synchronized (this.f46766g) {
            g();
            File d = d("round_video_");
            long j10 = this.I;
            this.I = 1 + j10;
            o0 o0Var = new o0(j10, d);
            this.P = o0Var;
            this.Q = new w(d, this.f46772n.f46755a, z10, this.f46771m, new org.telegram.ui.web.m(10, this, o0Var));
            n nVar = this.f46771m;
            nVar.b("output generation started: id=" + j10 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.f46769k.execute(new cy0(this, o0Var, d, 22));
        }
    }

    public final File d(String str) {
        File file = this.f46764c;
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
        this.f46779u = false;
        j jVar = this.f46770l;
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
            this.f46771m.a("fatal error in state=".concat(r4.c.w(i10)), exc);
            if (b(4)) {
                e();
                r();
                this.f46767i.removeCallbacks(this.T);
                o0 o0Var = this.P;
                if (o0Var != null) {
                    this.f46769k.execute(new h0(this, o0Var, exc));
                }
                v(9);
                m("error");
                l60 l60Var = (l60) this.d.f15843b;
                l60Var.x();
                FileLog.e(exc);
                a11 a11Var = l60Var.T;
                if (a11Var != null) {
                    a11Var.d(true);
                }
                l60Var.T = null;
                MediaController.getInstance().requestRecordAudioFocus(false);
                if (l60Var.f28036f0) {
                    l60Var.u(6);
                } else {
                    NotificationCenter.getInstance(l60Var.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(l60Var.f28043n));
                }
                l60Var.w(false, false);
                if (!this.B && !this.f46770l.Y()) {
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
        i0 i0Var = new i0(this, 1);
        ExecutorService executorService = this.f46768j;
        executorService.execute(i0Var);
        this.f46770l.M();
        this.f46767i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.f46769k.shutdown();
    }

    public final long j() {
        t();
        if (this.W != 3) {
            return this.E;
        }
        return Math.min(this.f46773o, (SystemClock.elapsedRealtime() + this.E) - this.F);
    }

    public final void k(o0 o0Var, int i10) {
        synchronized (this.f46766g) {
            try {
                if (!o0Var.d && !o0Var.e) {
                    o0Var.d = true;
                    n nVar = this.f46771m;
                    nVar.b("output generation invalidated: id=" + o0Var.f46744a + ", reason=" + r4.c.v(i10) + ", availableSize=" + o0Var.f46746c);
                    this.f46769k.execute(new h0(this, o0Var, i10, 0));
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
        if (j10 <= this.f46773o && this.G <= 0 && this.H + 10 >= j10) {
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
        o0 o0Var = this.P;
        n nVar = this.f46771m;
        StringBuilder v = a1.g.v("session summary: terminal=", str, ", state=");
        v.append(r4.c.w(this.W));
        v.append(", durationMs=");
        v.append(j());
        v.append(", pauses=");
        v.append(this.L);
        v.append(", resumes=");
        v.append(this.M);
        v.append(", cameraSwitches=");
        v.append(this.N);
        v.append(", facing=");
        v.append(this.f46775q);
        v.append(", cameraMode=");
        v.append(this.f46776r);
        v.append(", generation=");
        long j11 = 0;
        if (o0Var == null) {
            j10 = 0;
        } else {
            j10 = o0Var.f46744a;
        }
        v.append(j10);
        v.append(", availableSize=");
        if (o0Var != null) {
            j11 = o0Var.f46746c;
        }
        v.append(j11);
        nVar.b(v.toString());
    }

    public final void n() {
        l0 l0Var = this.f46774p;
        l0 l0Var2 = this.f46775q;
        k0 k0Var = new k0(l0Var, l0Var2, this.X, this.f46778t);
        l60 l60Var = (l60) this.d.f15843b;
        l60Var.S = k0Var;
        if (l0Var2 != null) {
            ti.e.f47225j.b(l0Var2);
        }
        l60Var.y();
    }

    public final void o() {
        int i10;
        int i11 = this.W;
        long j10 = this.E;
        long j11 = this.F;
        boolean z10 = this.f46780w;
        boolean z11 = this.f46779u;
        long j12 = this.f46773o;
        r0 r0Var = new r0(i11, j10, j11, j12, z10, z11);
        l60 l60Var = (l60) this.d.f15843b;
        r0 r0Var2 = l60Var.R;
        int i12 = l60Var.h;
        if (r0Var2 == null) {
            i10 = 0;
        } else {
            i10 = r0Var2.f46758a;
        }
        l60Var.R = r0Var;
        if (i10 == 3 && i11 != 3) {
            l60Var.v(true);
        }
        l60Var.f28053u0 = Math.max(l60Var.f28053u0, j10);
        if (i11 == 3) {
            if (!l60Var.C0) {
                l60Var.C0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            l60.m(l60Var);
            l60.n(l60Var, true);
            l60Var.A();
            if (!l60Var.f28036f0) {
                l60Var.f28036f0 = true;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(l60Var.f28043n), Boolean.FALSE);
            } else if (l60Var.f28037g0) {
                l60Var.f28037g0 = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            l60.n(l60Var, false);
            l60Var.f28055w.setProgress(((float) j10) / ((float) j12));
        }
        if (i11 == 8 || i11 == 9 || i11 == 10) {
            l60Var.q();
            l60Var.x();
        }
        if (i10 == 3 && i11 == 4) {
            l60Var.u(2);
        }
        l60Var.y();
    }

    public final void p() {
        t();
        if (this.W != 3) {
            return;
        }
        this.E = j();
        this.L++;
        this.f46771m.b("pause requested: durationMs=" + this.E);
        e();
        this.f46767i.removeCallbacks(this.T);
        v(4);
        boolean Y = this.f46770l.Y();
        this.B = Y;
        if (!Y) {
            h(new IllegalStateException("Unable to stop the camera segment"));
        }
    }

    public final void q() {
        i2.i0 i0Var;
        t();
        if (this.W == 5 && (i0Var = this.S) != null) {
            long M0 = i0Var.M0();
            long j10 = this.G;
            if (M0 < j10 || M0 >= this.H) {
                this.S.Z0(5, j10);
            }
            this.S.i();
            x(true);
        }
    }

    public final void r() {
        this.f46767i.removeCallbacks(this.U);
        this.f46781x = false;
        i2.i0 i0Var = this.S;
        if (i0Var == null) {
            return;
        }
        i0Var.C(this.V);
        i2.i0 i0Var2 = this.S;
        i0Var2.F1();
        TextureView textureView = this.f46763b;
        if (textureView != null && textureView == i0Var2.X) {
            i0Var2.F1();
            i0Var2.s1();
            i0Var2.x1(null);
            i0Var2.q1(0, 0);
        }
        this.S.X0();
        this.S = null;
    }

    public final void s(File file, long j10, long j11, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        n nVar = this.f46771m;
        StringBuilder t10 = a1.g.t(j10, "final range remux started: range=", "..");
        t10.append(j11);
        t10.append(", includeAudio=");
        t10.append(z10);
        t10.append(", reason=");
        t10.append(r4.c.v(i10));
        nVar.b(t10.toString());
        g();
        k(this.P, i10);
        c(z10);
        g();
        a3.z a2 = m7.a(file, this.Q, j10, j11, z10);
        this.Q.g();
        long e = m7.e(this.Q.f46838a) / 1000;
        n nVar2 = this.f46771m;
        StringBuilder t11 = a1.g.t(e, "final range remux completed: durationMs=", ", requestedDurationMs=");
        t11.append(a2.f207b);
        t11.append(", actualStartMs=");
        t11.append(a2.f206a);
        t11.append(", size=");
        t11.append(this.Q.f46838a.length());
        t11.append(", elapsedMs=");
        t11.append(f(nanoTime));
        nVar2.b(t11.toString());
        g();
        this.f46769k.execute(new g0(this, this.P, this.Q.f46838a, e, z10));
    }

    public final void u(boolean z10) {
        if (this.v != z10) {
            this.v = z10;
            tv tvVar = this.f46765f;
            if (tvVar != null) {
                l60.j((l60) tvVar.f30680b, z10);
            }
        }
    }

    public final void v(int i10) {
        int i11 = this.W;
        this.W = i10;
        this.f46771m.b("state: " + r4.c.w(i11) + " -> " + r4.c.w(i10) + ", durationMs=" + j());
        o();
    }

    public final void w(float f7) {
        t();
        if (this.W == 3 && !this.f46780w) {
            this.f46770l.U(Math.max(0.0f, Math.min(1.0f, f7)));
        }
    }

    public final void x(boolean z10) {
        if (this.f46781x == z10) {
            return;
        }
        this.f46781x = z10;
        Handler handler = this.f46767i;
        p8.b bVar = this.U;
        handler.removeCallbacks(bVar);
        if (z10) {
            handler.post(bVar);
        }
        this.d.getClass();
        o();
    }
}
