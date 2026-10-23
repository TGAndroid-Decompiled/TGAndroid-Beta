package si;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView;
import com.google.android.gms.internal.play_billing.k3;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k2.w0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Wallet.e8;
import org.telegram.ui.Wallet.m4;
import w7.m7;
public final class u0 {
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
    public volatile q0 P;
    public volatile w Q;
    public volatile File R;
    public i2.h0 S;
    public final e2.z V;
    public final Context f47249a;
    public final TextureView f47250b;
    public final File f47251c;
    public final l2.f d;
    public final r0 e;
    public final tv f47252f;
    public final j f47257l;
    public final n f47258m;
    public final s0 f47259n;
    public final long f47260o;
    public m0 f47261p;
    public m0 f47262q;
    public n0 f47263r;
    public p0 f47264s;
    public boolean f47266u;
    public boolean v;
    public boolean f47267w;
    public boolean f47268x;
    public boolean f47269y;
    public boolean f47270z;
    public final Object f47253g = new Object();
    public final Matrix h = new Matrix();
    public final Handler f47254i = new Handler(Looper.getMainLooper());
    public final ExecutorService f47255j = Executors.newSingleThreadExecutor(new e2.l0(8));
    public final ExecutorService f47256k = Executors.newSingleThreadExecutor(new e2.l0(9));
    public int W = 1;
    public int X = 1;
    public float f47265t = 1.0f;
    public long I = 1;
    public final j0 T = new j0(this, 0);
    public final m4 U = new m4(this, 9);

    public u0(k0 k0Var) {
        Context context;
        w0 w0Var = new w0(this, 23);
        this.V = new e2.z(this, 3);
        t();
        Context context2 = k0Var.f47132a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f47249a = context;
        TextureView textureView = k0Var.f47133b;
        this.f47250b = textureView;
        File file = k0Var.f47134c;
        this.f47251c = file == null ? context.getCacheDir() : file;
        this.f47261p = k0Var.d;
        s0 s0Var = k0Var.e;
        this.f47259n = s0Var;
        int i10 = k0Var.h;
        n0 n0Var = k0Var.f47135f;
        p0 p0Var = k0Var.f47136g;
        this.f47260o = 60000L;
        boolean z10 = k0Var.f47137i;
        this.d = k0Var.f47138j;
        this.e = k0Var.f47139k;
        this.f47252f = k0Var.f47140l;
        n nVar = new n();
        this.f47258m = nVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(s0Var.f47196a);
        sb2.append("x");
        k3.r(sb2, s0Var.f47196a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(n0Var);
        sb2.append(", fps=");
        sb2.append(p0Var.f47184a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.f47261p);
        sb2.append(", maxDurationMs=60000");
        nVar.b(sb2.toString());
        this.f47257l = new j(context, textureView, s0Var, i10, n0Var, p0Var, z10, nVar, w0Var);
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
            this.f47258m.b("cancel requested: state=".concat(o0.w(i10)));
            if (b(3)) {
                e();
                r();
                v(10);
                if (!this.B && !this.f47257l.Y()) {
                    i();
                    return;
                }
                this.B = true;
                this.A = true;
            }
        }
    }

    public final boolean b(int i10) {
        synchronized (this.f47253g) {
            try {
                q0 q0Var = this.P;
                if (q0Var != null && q0Var.e) {
                    return false;
                }
                this.D = true;
                if (q0Var != null && !q0Var.d) {
                    q0Var.d = true;
                    n nVar = this.f47258m;
                    nVar.b("output generation invalidated: id=" + q0Var.f47189a + ", reason=" + o0.v(i10) + ", availableSize=" + q0Var.f47191c);
                    this.f47256k.execute(new h0(this, q0Var, i10, 2));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z10) {
        synchronized (this.f47253g) {
            g();
            File d = d("round_video_");
            long j10 = this.I;
            this.I = 1 + j10;
            q0 q0Var = new q0(j10, d);
            this.P = q0Var;
            this.Q = new w(d, this.f47259n.f47196a, z10, this.f47258m, new e8(12, this, q0Var));
            n nVar = this.f47258m;
            nVar.b("output generation started: id=" + j10 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.f47256k.execute(new fy0(this, q0Var, d, 22));
        }
    }

    public final File d(String str) {
        File file = this.f47251c;
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
        this.f47266u = false;
        j jVar = this.f47257l;
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
            this.f47258m.a("fatal error in state=".concat(o0.w(i10)), exc);
            if (b(4)) {
                e();
                r();
                this.f47254i.removeCallbacks(this.T);
                q0 q0Var = this.P;
                if (q0Var != null) {
                    this.f47256k.execute(new h0(this, q0Var, exc));
                }
                v(9);
                m("error");
                m60 m60Var = (m60) this.d.f15906b;
                m60Var.x();
                FileLog.e(exc);
                d11 d11Var = m60Var.T;
                if (d11Var != null) {
                    d11Var.d(true);
                }
                m60Var.T = null;
                MediaController.getInstance().requestRecordAudioFocus(false);
                if (m60Var.f28527f0) {
                    m60Var.u(6);
                } else {
                    NotificationCenter.getInstance(m60Var.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(m60Var.f28534n));
                }
                m60Var.w(false, false);
                if (!this.B && !this.f47257l.Y()) {
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
        j0 j0Var = new j0(this, 1);
        ExecutorService executorService = this.f47255j;
        executorService.execute(j0Var);
        this.f47257l.M();
        this.f47254i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.f47256k.shutdown();
    }

    public final long j() {
        t();
        if (this.W != 3) {
            return this.E;
        }
        return Math.min(this.f47260o, (SystemClock.elapsedRealtime() + this.E) - this.F);
    }

    public final void k(q0 q0Var, int i10) {
        synchronized (this.f47253g) {
            try {
                if (!q0Var.d && !q0Var.e) {
                    q0Var.d = true;
                    n nVar = this.f47258m;
                    nVar.b("output generation invalidated: id=" + q0Var.f47189a + ", reason=" + o0.v(i10) + ", availableSize=" + q0Var.f47191c);
                    this.f47256k.execute(new h0(this, q0Var, i10, 0));
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
        if (j10 <= this.f47260o && this.G <= 0 && this.H + 10 >= j10) {
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
        q0 q0Var = this.P;
        n nVar = this.f47258m;
        StringBuilder v = a1.g.v("session summary: terminal=", str, ", state=");
        v.append(o0.w(this.W));
        v.append(", durationMs=");
        v.append(j());
        v.append(", pauses=");
        v.append(this.L);
        v.append(", resumes=");
        v.append(this.M);
        v.append(", cameraSwitches=");
        v.append(this.N);
        v.append(", facing=");
        v.append(this.f47262q);
        v.append(", cameraMode=");
        v.append(this.f47263r);
        v.append(", generation=");
        long j11 = 0;
        if (q0Var == null) {
            j10 = 0;
        } else {
            j10 = q0Var.f47189a;
        }
        v.append(j10);
        v.append(", availableSize=");
        if (q0Var != null) {
            j11 = q0Var.f47191c;
        }
        v.append(j11);
        nVar.b(v.toString());
    }

    public final void n() {
        m0 m0Var = this.f47261p;
        m0 m0Var2 = this.f47262q;
        l0 l0Var = new l0(m0Var, m0Var2, this.X, this.f47265t);
        m60 m60Var = (m60) this.d.f15906b;
        m60Var.S = l0Var;
        if (m0Var2 != null) {
            ti.e.f47664j.b(m0Var2);
        }
        m60Var.y();
    }

    public final void o() {
        int i10;
        int i11 = this.W;
        long j10 = this.E;
        long j11 = this.F;
        boolean z10 = this.f47267w;
        boolean z11 = this.f47266u;
        long j12 = this.f47260o;
        t0 t0Var = new t0(i11, j10, j11, j12, z10, z11);
        m60 m60Var = (m60) this.d.f15906b;
        t0 t0Var2 = m60Var.R;
        int i12 = m60Var.h;
        if (t0Var2 == null) {
            i10 = 0;
        } else {
            i10 = t0Var2.f47242a;
        }
        m60Var.R = t0Var;
        if (i10 == 3 && i11 != 3) {
            m60Var.v(true);
        }
        m60Var.f28544u0 = Math.max(m60Var.f28544u0, j10);
        if (i11 == 3) {
            if (!m60Var.C0) {
                m60Var.C0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            m60.m(m60Var);
            m60.n(m60Var, true);
            m60Var.A();
            if (!m60Var.f28527f0) {
                m60Var.f28527f0 = true;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(m60Var.f28534n), Boolean.FALSE);
            } else if (m60Var.f28528g0) {
                m60Var.f28528g0 = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            m60.n(m60Var, false);
            m60Var.f28546w.setProgress(((float) j10) / ((float) j12));
        }
        if (i11 == 8 || i11 == 9 || i11 == 10) {
            m60Var.q();
            m60Var.x();
        }
        if (i10 == 3 && i11 == 4) {
            m60Var.u(2);
        }
        m60Var.y();
    }

    public final void p() {
        t();
        if (this.W != 3) {
            return;
        }
        this.E = j();
        this.L++;
        this.f47258m.b("pause requested: durationMs=" + this.E);
        e();
        this.f47254i.removeCallbacks(this.T);
        v(4);
        boolean Y = this.f47257l.Y();
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
        this.f47254i.removeCallbacks(this.U);
        this.f47268x = false;
        i2.h0 h0Var = this.S;
        if (h0Var == null) {
            return;
        }
        h0Var.C(this.V);
        i2.h0 h0Var2 = this.S;
        h0Var2.F1();
        TextureView textureView = this.f47250b;
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
        n nVar = this.f47258m;
        StringBuilder t10 = a1.g.t(j10, "final range remux started: range=", "..");
        t10.append(j11);
        t10.append(", includeAudio=");
        t10.append(z10);
        t10.append(", reason=");
        t10.append(o0.v(i10));
        nVar.b(t10.toString());
        g();
        k(this.P, i10);
        c(z10);
        g();
        a3.z a2 = m7.a(file, this.Q, j10, j11, z10);
        this.Q.g();
        long e = m7.e(this.Q.f47277a) / 1000;
        n nVar2 = this.f47258m;
        StringBuilder t11 = a1.g.t(e, "final range remux completed: durationMs=", ", requestedDurationMs=");
        t11.append(a2.f207b);
        t11.append(", actualStartMs=");
        t11.append(a2.f206a);
        t11.append(", size=");
        t11.append(this.Q.f47277a.length());
        t11.append(", elapsedMs=");
        t11.append(f(nanoTime));
        nVar2.b(t11.toString());
        g();
        this.f47256k.execute(new g0(this, this.P, this.Q.f47277a, e, z10));
    }

    public final void u(boolean z10) {
        if (this.v != z10) {
            this.v = z10;
            tv tvVar = this.f47252f;
            if (tvVar != null) {
                m60.j((m60) tvVar.f30915b, z10);
            }
        }
    }

    public final void v(int i10) {
        int i11 = this.W;
        this.W = i10;
        this.f47258m.b("state: " + o0.w(i11) + " -> " + o0.w(i10) + ", durationMs=" + j());
        o();
    }

    public final void w(float f7) {
        t();
        if (this.W == 3 && !this.f47267w) {
            this.f47257l.U(Math.max(0.0f, Math.min(1.0f, f7)));
        }
    }

    public final void x(boolean z10) {
        if (this.f47268x == z10) {
            return;
        }
        this.f47268x = z10;
        Handler handler = this.f47254i;
        m4 m4Var = this.U;
        handler.removeCallbacks(m4Var);
        if (z10) {
            handler.post(m4Var);
        }
        this.d.getClass();
        o();
    }
}
