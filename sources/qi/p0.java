package qi;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.v60;
import p4.t0;
import qg.x1;
import w7.w6;
public final class p0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public volatile boolean E;
    public long F;
    public long G;
    public long H;
    public long I;
    public long K;
    public long L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public volatile l0 Q;
    public volatile s R;
    public volatile File S;
    public i2.f0 T;
    public final i81 W;
    public final Context f46860a;
    public final TextureView f46861b;
    public final File f46862c;
    public final n4.l d;
    public final m0 f46863e;
    public final ew f46864f;
    public final h f46870m;
    public final l f46871n;
    public final n0 f46872o;
    public final long f46873p;
    public i0 f46874q;
    public i0 f46875r;
    public j0 f46876s;
    public k0 f46877t;
    public boolean v;
    public boolean f46879w;
    public boolean f46880x;
    public boolean f46881y;
    public boolean f46882z;
    public final Object f46865g = new Object();
    public final ArrayList h = new ArrayList();
    public final Matrix f46866i = new Matrix();
    public final Handler f46867j = new Handler(Looper.getMainLooper());
    public final ExecutorService f46868k = Executors.newSingleThreadExecutor(new e2.c0(8));
    public final ExecutorService f46869l = Executors.newSingleThreadExecutor(new e2.c0(9));
    public int X = 1;
    public int Y = 1;
    public float f46878u = 1.0f;
    public long J = 1;
    public final f0 U = new f0(this, 0);
    public final t0 V = new t0(this, 4);

    public p0(g0 g0Var) {
        Context context;
        k2.g0 g0Var2 = new k2.g0(this, 19);
        this.W = new i81(this, 2);
        v();
        Context context2 = g0Var.f46707a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f46860a = context;
        TextureView textureView = g0Var.f46708b;
        this.f46861b = textureView;
        File file = g0Var.f46709c;
        this.f46862c = file == null ? context.getCacheDir() : file;
        this.f46874q = g0Var.d;
        n0 n0Var = g0Var.f46710e;
        this.f46872o = n0Var;
        int i10 = g0Var.h;
        j0 j0Var = g0Var.f46711f;
        k0 k0Var = g0Var.f46712g;
        this.f46873p = 60000L;
        boolean z10 = g0Var.f46713i;
        this.d = g0Var.f46714j;
        this.f46863e = g0Var.f46715k;
        this.f46864f = g0Var.f46716l;
        l lVar = new l();
        this.f46871n = lVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(n0Var.f46816a);
        sb2.append("x");
        hg.c.w(sb2, n0Var.f46816a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(j0Var);
        sb2.append(", fps=");
        sb2.append(k0Var.f46803a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.f46874q);
        sb2.append(", maxDurationMs=60000");
        lVar.b(sb2.toString());
        this.f46870m = new h(context, textureView, n0Var, i10, j0Var, k0Var, z10, lVar, g0Var2);
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

    public final void A(boolean z10) {
        if (this.f46881y == z10) {
            return;
        }
        this.f46881y = z10;
        Handler handler = this.f46867j;
        t0 t0Var = this.V;
        handler.removeCallbacks(t0Var);
        if (z10) {
            handler.post(t0Var);
        }
        this.d.getClass();
        q();
    }

    public final void a() {
        v();
        int i10 = this.X;
        if (i10 != 10 && i10 != 8) {
            this.f46871n.b("cancel requested: state=".concat(c1.w(i10)));
            if (b(3)) {
                e();
                t();
                y(10);
                if (!this.C && !this.f46870m.D()) {
                    k();
                    return;
                }
                this.C = true;
                this.B = true;
            }
        }
    }

    public final boolean b(int i10) {
        synchronized (this.f46865g) {
            try {
                l0 l0Var = this.Q;
                if (l0Var != null && l0Var.f46810e) {
                    return false;
                }
                this.E = true;
                if (l0Var != null && !l0Var.d) {
                    l0Var.d = true;
                    l lVar = this.f46871n;
                    lVar.b("output generation invalidated: id=" + l0Var.f46807a + ", reason=" + c1.v(i10) + ", availableSize=" + l0Var.f46809c);
                    this.f46869l.execute(new d0(this, l0Var, i10, 2));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z10) {
        synchronized (this.f46865g) {
            g();
            File d = d("round_video_");
            long j3 = this.J;
            this.J = 1 + j3;
            l0 l0Var = new l0(j3, d);
            this.Q = l0Var;
            this.R = new s(d, this.f46872o.f46816a, z10, this.f46871n, new x1(1, this, l0Var));
            l lVar = this.f46871n;
            lVar.b("output generation started: id=" + j3 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.f46869l.execute(new pi.i(this, l0Var, d, 3));
        }
    }

    public final File d(String str) {
        if (this.f46862c.exists()) {
            if (!this.f46862c.isDirectory()) {
                throw new IOException("Round-video output path is not a directory: " + this.f46862c);
            }
        } else if (!this.f46862c.mkdirs() && !this.f46862c.isDirectory()) {
            throw new IOException("Cannot create round-video output directory: " + this.f46862c);
        }
        File createTempFile = File.createTempFile(str, ".mp4", this.f46862c);
        synchronized (this.h) {
            this.h.add(createTempFile);
        }
        return createTempFile;
    }

    public final void e() {
        this.v = false;
        h hVar = this.f46870m;
        hVar.z(0.0f);
        hVar.y(false);
        x(false);
    }

    public final void g() {
        if (!this.E) {
            return;
        }
        throw new IOException("Round-video operation was cancelled");
    }

    public final void h(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.setLength(0L);
            randomAccessFile.close();
        } catch (IOException unused) {
        }
        if (file.exists()) {
            file.delete();
        }
        if (file.exists()) {
            this.f46871n.b("temporary file deletion failed: " + file.getName());
        }
    }

    public final void i(File file) {
        if (file == null) {
            return;
        }
        synchronized (this.h) {
            this.h.remove(file);
        }
        h(file);
    }

    public final void j(Exception exc) {
        int i10 = this.X;
        if (i10 != 9 && i10 != 10) {
            this.f46871n.a("fatal error in state=".concat(c1.w(i10)), exc);
            if (b(4)) {
                e();
                t();
                this.f46867j.removeCallbacks(this.U);
                l0 l0Var = this.Q;
                if (l0Var != null) {
                    this.f46869l.execute(new d0(this, l0Var, exc));
                }
                y(9);
                o("error");
                if (!this.C && !this.f46870m.D()) {
                    k();
                } else {
                    this.C = true;
                    this.B = true;
                }
                v60 v60Var = (v60) this.d.f16326a;
                v60Var.x();
                FileLog.e(exc);
                m11 m11Var = v60Var.T;
                if (m11Var != null) {
                    m11Var.d(true);
                }
                v60Var.T = null;
                MediaController.getInstance().requestRecordAudioFocus(false);
                if (v60Var.f31418f0) {
                    v60Var.u(6);
                } else {
                    NotificationCenter.getInstance(v60Var.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(v60Var.f31425n));
                }
                v60Var.w(false, false);
            }
        }
    }

    public final void k() {
        if (this.D) {
            return;
        }
        o("cancelled");
        this.f46870m.s();
        w(null);
    }

    public final long l() {
        v();
        if (this.X != 3) {
            return this.F;
        }
        return Math.min(this.f46873p, (SystemClock.elapsedRealtime() + this.F) - this.G);
    }

    public final void m(l0 l0Var, int i10) {
        synchronized (this.f46865g) {
            try {
                if (!l0Var.d && !l0Var.f46810e) {
                    l0Var.d = true;
                    l lVar = this.f46871n;
                    lVar.b("output generation invalidated: id=" + l0Var.f46807a + ", reason=" + c1.v(i10) + ", availableSize=" + l0Var.f46809c);
                    this.f46869l.execute(new d0(this, l0Var, i10, 0));
                }
            } finally {
            }
        }
    }

    public final boolean n() {
        long j3 = this.L;
        if (j3 <= 0) {
            j3 = this.F;
        }
        if (j3 <= this.f46873p && this.H <= 0 && this.I + 10 >= j3) {
            return false;
        }
        return true;
    }

    public final void o(String str) {
        long j3;
        if (this.P) {
            return;
        }
        this.P = true;
        l0 l0Var = this.Q;
        l lVar = this.f46871n;
        StringBuilder w10 = a1.g.w("session summary: terminal=", str, ", state=");
        w10.append(c1.w(this.X));
        w10.append(", durationMs=");
        w10.append(l());
        w10.append(", pauses=");
        w10.append(this.M);
        w10.append(", resumes=");
        w10.append(this.N);
        w10.append(", cameraSwitches=");
        w10.append(this.O);
        w10.append(", facing=");
        w10.append(this.f46875r);
        w10.append(", cameraMode=");
        w10.append(this.f46876s);
        w10.append(", generation=");
        long j10 = 0;
        if (l0Var == null) {
            j3 = 0;
        } else {
            j3 = l0Var.f46807a;
        }
        w10.append(j3);
        w10.append(", availableSize=");
        if (l0Var != null) {
            j10 = l0Var.f46809c;
        }
        w10.append(j10);
        lVar.b(w10.toString());
    }

    public final void p() {
        i0 i0Var = this.f46874q;
        i0 i0Var2 = this.f46875r;
        h0 h0Var = new h0(i0Var, i0Var2, this.Y, this.f46878u);
        v60 v60Var = (v60) this.d.f16326a;
        v60Var.S = h0Var;
        if (i0Var2 != null) {
            ri.e.f47803j.b(i0Var2);
        }
        v60Var.y();
    }

    public final void q() {
        int i10;
        int i11 = this.X;
        long j3 = this.F;
        long j10 = this.G;
        boolean z10 = this.f46880x;
        boolean z11 = this.v;
        long j11 = this.f46873p;
        o0 o0Var = new o0(i11, j3, j10, j11, z10, z11);
        v60 v60Var = (v60) this.d.f16326a;
        o0 o0Var2 = v60Var.R;
        int i12 = v60Var.h;
        if (o0Var2 == null) {
            i10 = 0;
        } else {
            i10 = o0Var2.f46817a;
        }
        v60Var.R = o0Var;
        if (i10 == 3 && i11 != 3) {
            v60Var.v(true);
        }
        v60Var.f31435u0 = Math.max(v60Var.f31435u0, j3);
        if (i11 == 3) {
            if (!v60Var.C0) {
                v60Var.C0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            v60.m(v60Var);
            v60.n(v60Var, true);
            v60Var.A();
            if (!v60Var.f31418f0) {
                v60Var.f31418f0 = true;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(v60Var.f31425n), Boolean.FALSE);
            } else if (v60Var.f31419g0) {
                v60Var.f31419g0 = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            v60.n(v60Var, false);
            v60Var.f31437w.setProgress(((float) j3) / ((float) j11));
        }
        if (i11 == 8 || i11 == 9 || i11 == 10) {
            v60Var.q();
            v60Var.x();
        }
        if (i10 == 3 && i11 == 4) {
            v60Var.u(2);
        }
        v60Var.y();
    }

    public final void r() {
        v();
        if (this.X != 3) {
            return;
        }
        this.F = l();
        this.M++;
        this.f46871n.b("pause requested: durationMs=" + this.F);
        e();
        this.f46867j.removeCallbacks(this.U);
        y(4);
        boolean D = this.f46870m.D();
        this.C = D;
        if (!D) {
            j(new IllegalStateException("Unable to stop the camera segment"));
        }
    }

    public final void s() {
        i2.f0 f0Var;
        v();
        if (this.X == 5 && (f0Var = this.T) != null) {
            long J0 = f0Var.J0();
            long j3 = this.H;
            if (J0 < j3 || J0 >= this.I) {
                this.T.W0(5, j3);
            }
            this.T.i();
            A(true);
        }
    }

    public final void t() {
        this.f46867j.removeCallbacks(this.V);
        this.f46881y = false;
        i2.f0 f0Var = this.T;
        if (f0Var == null) {
            return;
        }
        f0Var.D(this.W);
        i2.f0 f0Var2 = this.T;
        f0Var2.D1();
        TextureView textureView = this.f46861b;
        if (textureView != null && textureView == f0Var2.V) {
            f0Var2.D1();
            f0Var2.q1();
            f0Var2.v1(null);
            f0Var2.o1(0, 0);
        }
        this.T.U0();
        this.T = null;
    }

    public final void u(File file, long j3, long j10, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        l lVar = this.f46871n;
        StringBuilder u10 = a1.g.u(j3, "final range remux started: range=", "..");
        u10.append(j10);
        u10.append(", includeAudio=");
        u10.append(z10);
        u10.append(", reason=");
        u10.append(c1.v(i10));
        lVar.b(u10.toString());
        g();
        m(this.Q, i10);
        c(z10);
        g();
        a3.z a2 = w6.a(file, this.R, j3, j10, z10);
        this.R.g();
        long d = w6.d(this.R.f46893a) / 1000;
        l lVar2 = this.f46871n;
        StringBuilder u11 = a1.g.u(d, "final range remux completed: durationMs=", ", requestedDurationMs=");
        u11.append(a2.f221b);
        u11.append(", actualStartMs=");
        u11.append(a2.f220a);
        u11.append(", size=");
        u11.append(this.R.f46893a.length());
        u11.append(", elapsedMs=");
        u11.append(f(nanoTime));
        lVar2.b(u11.toString());
        g();
        this.f46869l.execute(new c0(this, this.Q, this.R.f46893a, d, z10));
    }

    public final void w(File file) {
        if (this.D) {
            return;
        }
        this.D = true;
        this.f46867j.removeCallbacksAndMessages(null);
        this.f46868k.execute(new a0(this, file, 2));
    }

    public final void x(boolean z10) {
        if (this.f46879w != z10) {
            this.f46879w = z10;
            ew ewVar = this.f46864f;
            if (ewVar != null) {
                v60.j((v60) ewVar.f25794b, z10);
            }
        }
    }

    public final void y(int i10) {
        int i11 = this.X;
        this.X = i10;
        this.f46871n.b("state: " + c1.w(i11) + " -> " + c1.w(i10) + ", durationMs=" + l());
        q();
    }

    public final void z(float f7) {
        v();
        if (this.X == 3 && !this.f46880x) {
            this.f46870m.z(Math.max(0.0f, Math.min(1.0f, f7)));
        }
    }
}
