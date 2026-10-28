package vi;

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
import li.e3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.tv;
import org.telegram.ui.bh1;
public final class u0 {
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
    public volatile q0 S;
    public volatile w T;
    public volatile File U;
    public i2.j0 V;
    public final e2.z Y;
    public final Context f50633a;
    public final TextureView f50635b;
    public final File f50636c;
    public final e3 d;
    public final r0 e;
    public final tv f50637f;
    public final j f50642l;
    public final n f50643m;
    public final s0 f50644n;
    public final int f50645o;
    public final p0 f50646p;
    public final long f50647q;
    public n0 f50648r;
    public n0 f50649s;
    public o0 f50650t;
    public p0 f50651u;
    public boolean f50652w;
    public boolean f50653x;
    public boolean f50654y;
    public boolean f50655z;
    public final Object f50638g = new Object();
    public final Matrix h = new Matrix();
    public final Handler f50639i = new Handler(Looper.getMainLooper());
    public final ExecutorService f50640j = Executors.newSingleThreadExecutor(new e2.l0(9));
    public final ExecutorService f50641k = Executors.newSingleThreadExecutor(new e2.l0(10));
    public int Z = 1;
    public int f50634a0 = 1;
    public float v = 1.0f;
    public long L = 1;
    public final i0 W = new i0(this, 0);
    public final dy0 X = new dy0(this, 18);

    public u0(l0 l0Var) {
        Context context;
        e3 e3Var = new e3(this, 22);
        this.Y = new e2.z(this, 3);
        u();
        Context context2 = l0Var.f50516a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f50633a = context;
        TextureView textureView = l0Var.f50517b;
        this.f50635b = textureView;
        File file = l0Var.f50518c;
        this.f50636c = file == null ? context.getCacheDir() : file;
        this.f50648r = l0Var.d;
        s0 s0Var = l0Var.e;
        this.f50644n = s0Var;
        int i10 = l0Var.h;
        this.f50645o = i10;
        o0 o0Var = l0Var.f50519f;
        p0 p0Var = l0Var.f50520g;
        this.f50646p = p0Var;
        this.f50647q = 60000L;
        boolean z10 = l0Var.f50521i;
        this.d = l0Var.f50522j;
        this.e = l0Var.f50523k;
        this.f50637f = l0Var.f50524l;
        n nVar = new n();
        this.f50643m = nVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(s0Var.f50624a);
        sb2.append("x");
        c3.h0.q(sb2, s0Var.f50624a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(o0Var);
        sb2.append(", fps=");
        sb2.append(p0Var.f50571a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.f50648r);
        sb2.append(", maxDurationMs=60000");
        nVar.b(sb2.toString());
        this.f50642l = new j(context, textureView, s0Var, i10, o0Var, p0Var, z10, nVar, e3Var);
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
        int i10 = this.Z;
        if (i10 != 10 && i10 != 8) {
            this.f50643m.b("cancel requested: state=".concat(b10.x(i10)));
            b(3, true);
            e();
            s();
            w(10);
            if (!this.E && !this.f50642l.Y()) {
                i();
                return true;
            }
            this.E = true;
            this.C = true;
            return true;
        }
        return false;
    }

    public final boolean b(int i10, boolean z10) {
        synchronized (this.f50638g) {
            try {
                q0 q0Var = this.S;
                if (q0Var != null && q0Var.e && !z10) {
                    return false;
                }
                this.G = true;
                if (q0Var != null && !q0Var.d) {
                    q0Var.d = true;
                    n nVar = this.f50643m;
                    nVar.b("output generation invalidated: id=" + q0Var.f50574a + ", reason=" + b10.w(i10) + ", availableSize=" + q0Var.f50576c);
                    this.f50641k.execute(new h0(this, q0Var, i10, 2));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z10) {
        synchronized (this.f50638g) {
            g();
            File d = d("round_video_");
            long j10 = this.L;
            this.L = 1 + j10;
            q0 q0Var = new q0(j10, d);
            this.S = q0Var;
            this.T = new w(d, this.f50644n.f50624a, z10, this.f50643m, new bh1(24, this, q0Var));
            n nVar = this.f50643m;
            nVar.b("output generation started: id=" + j10 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.f50641k.execute(new oy0(this, q0Var, d, 26));
        }
    }

    public final File d(String str) {
        File file = this.f50636c;
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
        this.f50652w = false;
        j jVar = this.f50642l;
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
        int i10 = this.Z;
        if (i10 != 9 && i10 != 10) {
            this.f50643m.a("fatal error in state=".concat(b10.x(i10)), exc);
            if (b(4, false)) {
                e();
                s();
                this.f50639i.removeCallbacks(this.W);
                q0 q0Var = this.S;
                if (q0Var != null) {
                    this.f50641k.execute(new h0(this, q0Var, exc));
                }
                w(9);
                m("error");
                o60 o60Var = (o60) this.d.f17209b;
                o60Var.A();
                FileLog.e(exc);
                m11 m11Var = o60Var.S;
                if (m11Var != null) {
                    m11Var.d(true);
                }
                o60Var.S = null;
                MediaController.getInstance().requestRecordAudioFocus(false);
                if (o60Var.f31178f0) {
                    o60Var.x(6);
                } else {
                    NotificationCenter.getInstance(o60Var.f31177f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(o60Var.h));
                }
                o60Var.z(false, false);
                if (!this.E && !this.f50642l.Y()) {
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
        ExecutorService executorService = this.f50640j;
        executorService.execute(i0Var);
        this.f50642l.M();
        this.f50639i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.f50641k.shutdown();
    }

    public final long j() {
        u();
        if (this.Z != 3) {
            return this.H;
        }
        return Math.min(this.f50647q, (SystemClock.elapsedRealtime() + this.H) - this.I);
    }

    public final void k(q0 q0Var, int i10) {
        synchronized (this.f50638g) {
            try {
                if (!q0Var.d && !q0Var.e) {
                    q0Var.d = true;
                    n nVar = this.f50643m;
                    nVar.b("output generation invalidated: id=" + q0Var.f50574a + ", reason=" + b10.w(i10) + ", availableSize=" + q0Var.f50576c);
                    this.f50641k.execute(new h0(this, q0Var, i10, 0));
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
        if (j10 <= this.f50647q && this.J <= 0 && this.K + 10 >= j10) {
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
        q0 q0Var = this.S;
        n nVar = this.f50643m;
        StringBuilder v = a1.g.v("session summary: terminal=", str, ", state=");
        v.append(b10.x(this.Z));
        v.append(", durationMs=");
        v.append(j());
        v.append(", pauses=");
        v.append(this.O);
        v.append(", resumes=");
        v.append(this.P);
        v.append(", cameraSwitches=");
        v.append(this.Q);
        v.append(", facing=");
        v.append(this.f50649s);
        v.append(", cameraMode=");
        v.append(this.f50650t);
        v.append(", generation=");
        long j11 = 0;
        if (q0Var == null) {
            j10 = 0;
        } else {
            j10 = q0Var.f50574a;
        }
        v.append(j10);
        v.append(", availableSize=");
        if (q0Var != null) {
            j11 = q0Var.f50576c;
        }
        v.append(j11);
        nVar.b(v.toString());
    }

    public final void n() {
        n0 n0Var = this.f50648r;
        n0 n0Var2 = this.f50649s;
        m0 m0Var = new m0(n0Var, n0Var2, this.f50634a0, this.v);
        o60 o60Var = (o60) this.d.f17209b;
        o60Var.R = m0Var;
        if (n0Var2 != null) {
            wi.e.f51340j.b(n0Var2);
        }
        o60Var.B();
    }

    public final void o() {
        int i10;
        int i11 = this.Z;
        long j10 = this.H;
        long j11 = this.I;
        boolean z10 = this.f50655z;
        boolean z11 = this.f50654y;
        boolean z12 = this.f50652w;
        long j12 = this.f50647q;
        t0 t0Var = new t0(i11, j10, j11, j12, z10, z11, z12);
        o60 o60Var = (o60) this.d.f17209b;
        t0 t0Var2 = o60Var.Q;
        int i12 = o60Var.f31177f;
        if (t0Var2 == null) {
            i10 = 0;
        } else {
            i10 = t0Var2.f50625a;
        }
        o60Var.Q = t0Var;
        if (i10 == 3 && i11 != 3) {
            o60Var.y(true);
        }
        o60Var.f31195u0 = Math.max(o60Var.f31195u0, j10);
        if (i11 != 3) {
            o60Var.setRecordingUiFrameClockActive(false);
            o60Var.v.setProgress(((float) j10) / ((float) j12));
        } else {
            if (!o60Var.C0) {
                o60Var.C0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            o60.n(o60Var);
            o60Var.setRecordingUiFrameClockActive(true);
            o60Var.D();
            if (!o60Var.f31178f0) {
                o60Var.f31178f0 = true;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(o60Var.h), Boolean.FALSE);
            } else if (o60Var.f31179g0) {
                o60Var.f31179g0 = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        }
        if (i11 == 8 || i11 == 9 || i11 == 10) {
            o60Var.r();
            o60Var.A();
        }
        if (i10 == 3 && i11 == 4) {
            o60Var.x(2);
        }
        o60Var.B();
        if (o60Var.U != null && !o60Var.V) {
            AndroidUtilities.runOnUIThread(new j60(o60Var, 1));
        }
        if (z10 && o60Var.getWindowVisibility() != 0) {
            AndroidUtilities.runOnUIThread(new j60(o60Var, 2));
        }
    }

    public final void p() {
        i2.j0 j0Var;
        u();
        if (this.Z == 5 && (j0Var = this.V) != null) {
            j0Var.e();
            y(false);
            this.V.M0();
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
        this.f50643m.b("pause requested: durationMs=" + this.H);
        e();
        this.f50639i.removeCallbacks(this.W);
        w(4);
        boolean Y = this.f50642l.Y();
        this.E = Y;
        if (!Y) {
            h(new IllegalStateException("Unable to stop the camera segment"));
        }
    }

    public final void r() {
        i2.j0 j0Var;
        u();
        if (this.Z == 5 && (j0Var = this.V) != null) {
            long M0 = j0Var.M0();
            long j10 = this.J;
            if (M0 < j10 || M0 >= this.K) {
                this.V.Z0(5, j10);
            }
            this.V.i();
            y(true);
        }
    }

    public final void s() {
        this.f50639i.removeCallbacks(this.X);
        this.f50655z = false;
        i2.j0 j0Var = this.V;
        if (j0Var == null) {
            return;
        }
        j0Var.C(this.Y);
        i2.j0 j0Var2 = this.V;
        j0Var2.F1();
        TextureView textureView = this.f50635b;
        if (textureView != null && textureView == j0Var2.X) {
            j0Var2.F1();
            j0Var2.s1();
            j0Var2.x1(null);
            j0Var2.q1(0, 0);
        }
        this.V.X0();
        this.V = null;
    }

    public final void t(File file, int i10, long j10, long j11, boolean z10, int i11) {
        long nanoTime = System.nanoTime();
        n nVar = this.f50643m;
        StringBuilder t10 = a1.g.t(j10, "final range remux started: range=", "..");
        t10.append(j11);
        t10.append(", includeAudio=");
        t10.append(z10);
        t10.append(", reason=");
        t10.append(b10.w(i11));
        nVar.b(t10.toString());
        g();
        k(this.S, i11);
        c(z10);
        g();
        w wVar = this.T;
        int i12 = i10;
        int i13 = this.f50644n.f50624a;
        int i14 = this.f50645o;
        if (i12 <= 0) {
            i12 = this.f50646p.f50571a;
        }
        k2.t0 a2 = w7.x.a(file, wVar, j10, j11, z10, new a3.l(i13, i14, i12));
        this.T.g();
        long h = this.T.h();
        n nVar2 = this.f50643m;
        StringBuilder t11 = a1.g.t(h, "final range remux completed: durationMs=", ", requestedDurationMs=");
        t11.append(j11 - j10);
        t11.append(", actualStartMs=");
        t11.append(a2.f16275a);
        t11.append(", mode=");
        t11.append((String) a2.f16277c);
        t11.append(", size=");
        t11.append(this.T.f50662a.length());
        t11.append(", elapsedMs=");
        t11.append(f(nanoTime));
        nVar2.b(t11.toString());
        g();
        this.f50641k.execute(new g0(this, this.S, this.T.f50662a, h, z10));
    }

    public final void v(boolean z10) {
        if (this.f50653x != z10) {
            this.f50653x = z10;
            tv tvVar = this.f50637f;
            if (tvVar != null) {
                ((o60) tvVar.f33156b).setScreenFlashEnabled(z10);
            }
        }
    }

    public final void w(int i10) {
        int i11 = this.Z;
        this.Z = i10;
        this.f50643m.b("state: " + b10.x(i11) + " -> " + b10.x(i10) + ", durationMs=" + j());
        o();
    }

    public final void x(float f7) {
        u();
        if (this.Z == 3 && !this.f50654y) {
            this.f50642l.U(Math.max(0.0f, Math.min(1.0f, f7)));
        }
    }

    public final void y(boolean z10) {
        if (this.f50655z == z10) {
            return;
        }
        this.f50655z = z10;
        Handler handler = this.f50639i;
        dy0 dy0Var = this.X;
        handler.removeCallbacks(dy0Var);
        if (z10) {
            handler.post(dy0Var);
        }
        this.d.getClass();
        o();
    }
}
