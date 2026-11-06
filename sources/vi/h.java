package vi;

import a8.p0;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import b7.l;
import di.h4;
import h2.l0;
import h2.z;
import j2.n;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import l2.i0;
import m4.d0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.me;
import org.telegram.messenger.qs;
import org.telegram.messenger.yk;
import org.telegram.ui.Components.l31;
import ti.p;
import vi.f;
import vi.g;
import vi.h;
import w7.s;
public final class h {
    public static final s H = new s(26, false);
    public static final AtomicLong I = new AtomicLong(1);
    public i0 A;
    public byte[] B;
    public ac.e C;
    public final d D;
    public final d E;
    public final Context f57424a;
    public final File f57425b;
    public final long f57426c;
    public final f d;
    public final boolean f57427e;
    public final n f57428f;
    public final d0 f57429g;
    public final b h;
    public org.telegram.utils.recorder.audio.d f57435n;
    public long f57436o;
    public long f57437p;
    public long f57438q;
    public long f57439r;
    public long f57440s;
    public boolean f57442u;
    public boolean v;
    public boolean f57443w;
    public boolean f57444x;
    public boolean f57445y;
    public volatile g f57446z;
    public final Handler f57430i = new Handler(Looper.getMainLooper());
    public final ExecutorService f57431j = Executors.newSingleThreadExecutor(new l0(7));
    public final ExecutorService f57432k = Executors.newSingleThreadExecutor(new l0(8));
    public final Object f57433l = new Object();
    public final ArrayList f57434m = new ArrayList();
    public int G = 1;
    public long f57441t = 1;
    public final z F = new z(this, 2);

    public h(h4 h4Var) {
        q();
        Context context = (Context) h4Var.f9075b;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.f57424a = context;
        File file = (File) h4Var.f9076c;
        this.f57425b = file == null ? context.getCacheDir() : file;
        this.f57426c = 700L;
        f fVar = (f) h4Var.d;
        this.d = fVar;
        this.f57427e = h4Var.f9074a;
        this.f57428f = (n) h4Var.f9077e;
        this.f57429g = (d0) h4Var.f9078f;
        b bVar = new b((s) h4Var.f9079g);
        this.h = bVar;
        this.D = new Runnable(this) {
            public final h f57413b;

            {
                this.f57413b = this;
            }

            @Override
            public final void run() {
                i0 i0Var;
                switch (r2) {
                    case 0:
                        h hVar = this.f57413b;
                        if (hVar.G == 3 && !hVar.f57443w) {
                            hVar.f57443w = true;
                            b bVar2 = hVar.h;
                            bVar2.b("maximum duration reached: durationMs=" + hVar.j());
                            hVar.f57428f.getClass();
                            hVar.n();
                            return;
                        }
                        return;
                    default:
                        h hVar2 = this.f57413b;
                        if (hVar2.G == 5 && (i0Var = hVar2.A) != null && hVar2.f57442u) {
                            long l10 = i0Var.l();
                            long j3 = hVar2.f57439r;
                            if (l10 < j3 || l10 >= hVar2.f57440s) {
                                hVar2.A.Z0(5, j3);
                            }
                            n nVar = hVar2.f57428f;
                            hVar2.j();
                            nVar.getClass();
                            hVar2.f57430i.postDelayed(hVar2.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        this.E = new Runnable(this) {
            public final h f57413b;

            {
                this.f57413b = this;
            }

            @Override
            public final void run() {
                i0 i0Var;
                switch (r2) {
                    case 0:
                        h hVar = this.f57413b;
                        if (hVar.G == 3 && !hVar.f57443w) {
                            hVar.f57443w = true;
                            b bVar2 = hVar.h;
                            bVar2.b("maximum duration reached: durationMs=" + hVar.j());
                            hVar.f57428f.getClass();
                            hVar.n();
                            return;
                        }
                        return;
                    default:
                        h hVar2 = this.f57413b;
                        if (hVar2.G == 5 && (i0Var = hVar2.A) != null && hVar2.f57442u) {
                            long l10 = i0Var.l();
                            long j3 = hVar2.f57439r;
                            if (l10 < j3 || l10 >= hVar2.f57440s) {
                                hVar2.A.Z0(5, j3);
                            }
                            n nVar = hVar2.f57428f;
                            hVar2.j();
                            nVar.getClass();
                            hVar2.f57430i.postDelayed(hVar2.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        bVar.b("session created: device=" + Build.MANUFACTURER + " " + Build.MODEL + ", sdk=" + Build.VERSION.SDK_INT + ", sampleRate=48000, noiseSuppression=" + fVar + ", minimumDurationMs=700, maximumDurationMs=0");
    }

    public static void q() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("AudioRecordingSession must be used on the main thread");
    }

    public static long r(long j3) {
        return (j3 * 1000) / 48000;
    }

    public final void a(g gVar, long j3) {
        if (j3 <= 0) {
            return;
        }
        synchronized (this.f57433l) {
            try {
                if (gVar.d && !gVar.f57423e) {
                    long j10 = gVar.f57422c;
                    if (j3 > j10) {
                        gVar.f57422c = j3;
                        this.f57432k.execute(new c(this, gVar, j10, j3 - j10, 1));
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        q();
        int i7 = this.G;
        if (i7 != 10 && i7 != 8) {
            this.h.b("cancel requested: state=".concat(rf.b.r(i7)));
            d dVar = this.D;
            Handler handler = this.f57430i;
            handler.removeCallbacks(dVar);
            handler.removeCallbacks(this.E);
            p();
            k(2);
            s(10);
            org.telegram.utils.recorder.audio.d dVar2 = this.f57435n;
            if (dVar2 != null) {
                dVar2.d();
                return;
            }
            c();
            t();
        }
    }

    public final void c() {
        File file;
        if (this.f57444x) {
            return;
        }
        this.f57444x = true;
        ac.e eVar = this.C;
        if (eVar == null) {
            file = null;
        } else {
            file = (File) eVar.f1024b;
        }
        p pVar = new p(19, this, file);
        try {
            this.f57431j.execute(pVar);
        } catch (RejectedExecutionException unused) {
            pVar.run();
        }
    }

    public final g d() {
        File f10 = f();
        long j3 = this.f57441t;
        this.f57441t = 1 + j3;
        g gVar = new g(j3, f10);
        synchronized (this.f57433l) {
            this.f57446z = gVar;
            this.f57432k.execute(new l31(this, gVar, f10, 19));
        }
        b bVar = this.h;
        StringBuilder t6 = p0.t(j3, "output generation started: id=", ", file=");
        t6.append(f10.getName());
        bVar.b(t6.toString());
        return gVar;
    }

    public final l e() {
        return new l(this.G);
    }

    public final File f() {
        File file = this.f57425b;
        File file2 = new File(file, "audio_recording_voice_" + System.currentTimeMillis() + "_" + I.getAndIncrement() + ".ogg");
        synchronized (this.f57434m) {
            this.f57434m.add(file2);
        }
        return file2;
    }

    public final void g(Exception exc) {
        int i7 = this.G;
        if (i7 != 9 && i7 != 10 && i7 != 8) {
            this.h.a("fatal error in state=".concat(rf.b.r(i7)), exc);
            Handler handler = this.f57430i;
            handler.removeCallbacks(this.D);
            handler.removeCallbacks(this.E);
            p();
            k(3);
            s(9);
            g gVar = this.f57446z;
            if (gVar != null) {
                this.f57432k.execute(new c(this, gVar, exc));
            }
            MediaController mediaController = ((me) this.f57428f.f16453b).f23999a;
            String[] strArr = MediaController.V1;
            a8.e("AudioRecorderV2 failed", exc);
            qs.f(mediaController.f21267h1).k(qs.f25020m2, Integer.valueOf(mediaController.f21265g1));
            mediaController.x(false);
            org.telegram.utils.recorder.audio.d dVar = this.f57435n;
            if (dVar != null) {
                dVar.d();
            } else {
                c();
                t();
            }
            l("error");
        }
    }

    public final void h() {
        q();
        int i7 = this.G;
        if (i7 != 3 && i7 != 5) {
            return;
        }
        b bVar = this.h;
        bVar.b("finish requested: state=" + rf.b.r(this.G) + ", durationMs=" + j() + ", trim=" + this.f57439r + ".." + this.f57440s);
        if (this.G == 3) {
            this.v = true;
            this.f57430i.removeCallbacks(this.D);
            s(7);
            this.f57435n.d();
            return;
        }
        p();
        s(7);
        final g gVar = this.f57446z;
        if (gVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long r10 = r(this.f57437p);
        final long j3 = this.f57439r;
        if (j3 == 0 && this.f57440s == r10) {
            i();
            return;
        }
        final long j10 = this.f57440s;
        k(1);
        final g d = d();
        this.f57431j.execute(new Runnable() {
            @Override
            public final void run() {
                String str;
                g gVar2 = gVar;
                g gVar3 = d;
                long j11 = j3;
                long j12 = j10;
                h hVar = h.this;
                Handler handler = hVar.f57430i;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String absolutePath = gVar2.f57421b.getAbsolutePath();
                    File file = gVar3.f57421b;
                    String absolutePath2 = file.getAbsolutePath();
                    try {
                        if (AudioRecorderNative.b(absolutePath, absolutePath2, j11, j12)) {
                            vi.b bVar2 = hVar.h;
                            bVar2.b("final trim completed: source=" + gVar2.f57421b.getName() + ", output=" + file.getName() + ", trim=" + j11 + ".." + j12 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            hVar.a(gVar3, file.length());
                            handler.post(new yk(hVar, j12, j11, 3));
                            return;
                        }
                        throw new IllegalStateException("Unable to trim final Opus output");
                    } catch (Throwable th2) {
                        th = th2;
                        str = absolutePath2;
                        handler.post(new p(18, str, th));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = hVar;
                }
            }
        });
    }

    public final void i() {
        if (this.G != 7) {
            return;
        }
        g gVar = this.f57446z;
        if (gVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long j3 = j();
        if (j3 < this.f57426c) {
            b bVar = this.h;
            bVar.b("recording rejected as too short: durationMs=" + j3);
            MediaController mediaController = ((me) this.f57428f.f16453b).f23999a;
            qs.f(mediaController.f21267h1).k(qs.f25062t2, Integer.valueOf(mediaController.f21265g1), Boolean.FALSE, Integer.valueOf((int) j3));
            mediaController.x(false);
            k(2);
            s(10);
            c();
            t();
            l("too_short");
            return;
        }
        this.f57431j.execute(new org.telegram.utils.recorder.audio.b(j3, gVar, this));
    }

    public final long j() {
        q();
        return r(this.f57437p + this.f57438q);
    }

    public final void k(int i7) {
        String str;
        synchronized (this.f57433l) {
            g gVar = this.f57446z;
            if (gVar != null && gVar.d && !gVar.f57423e) {
                gVar.d = false;
                this.f57432k.execute(new c(this, gVar, i7));
                b bVar = this.h;
                StringBuilder sb2 = new StringBuilder("output generation invalidated: id=");
                sb2.append(gVar.f57420a);
                sb2.append(", reason=");
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            str = "null";
                        } else {
                            str = "ERROR";
                        }
                    } else {
                        str = "CANCELLED";
                    }
                } else {
                    str = "REBUILT";
                }
                sb2.append(str);
                bVar.b(sb2.toString());
            }
        }
    }

    public final void l(String str) {
        if (this.f57445y) {
            return;
        }
        this.f57445y = true;
        StringBuilder u10 = p0.u("session summary: terminal=", str, ", durationMs=");
        u10.append(r(this.f57437p + this.f57438q));
        u10.append(", generations=");
        u10.append(this.f57441t - 1);
        this.h.b(u10.toString());
    }

    public final void m() {
        l e10 = e();
        n nVar = this.f57428f;
        MediaController mediaController = ((me) nVar.f16453b).f23999a;
        int i7 = e10.f3009a;
        e0.g gVar = (e0.g) nVar.f16454c;
        int i10 = gVar.f10051a;
        gVar.f10051a = i7;
        if (i7 == 3) {
            boolean z9 = gVar.f10052b;
            if (!z9 && i10 == 2) {
                System.currentTimeMillis();
                String[] strArr = MediaController.V1;
                if (!mediaController.I1) {
                    qs.f(mediaController.f21267h1).k(qs.f25015l2, Integer.valueOf(mediaController.f21265g1), Boolean.TRUE);
                }
            } else if (!z9 && i10 == 6) {
                mediaController.Y(true);
                qs.f(mediaController.f21267h1).k(qs.f25036p2, new Object[0]);
            }
            if (gVar.f10052b) {
                if (i7 == 3 || i7 == 5) {
                    gVar.f10052b = false;
                    ((h) gVar.f10054e).h();
                }
            }
        }
    }

    public final boolean n() {
        q();
        if (this.G == 3 && this.f57435n != null) {
            this.h.b("pause requested: durationMs=" + j());
            this.f57430i.removeCallbacks(this.D);
            s(4);
            this.f57435n.d();
            return true;
        }
        return false;
    }

    public final void o() {
        q();
        int i7 = this.G;
        if (i7 == 10) {
            return;
        }
        if (i7 != 8) {
            b();
            return;
        }
        p();
        c();
        s(10);
        l("released");
    }

    public final void p() {
        this.f57430i.removeCallbacks(this.E);
        this.f57442u = false;
        i0 i0Var = this.A;
        if (i0Var != null) {
            i0Var.h0(this.F);
            this.A.X0();
            this.A = null;
        }
    }

    public final void s(int i7) {
        int i10 = this.G;
        if (i10 == i7) {
            return;
        }
        this.G = i7;
        this.h.b("state: " + rf.b.r(i10) + " -> " + rf.b.r(i7) + ", durationMs=" + r(this.f57437p + this.f57438q));
        m();
    }

    public final void t() {
        this.f57431j.shutdown();
        this.f57432k.shutdown();
    }

    public final void u(long j3, long j10, File file) {
        long j11 = this.f57436o + 1;
        this.f57436o = j11;
        g gVar = this.f57446z;
        if (gVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.d dVar = new org.telegram.utils.recorder.audio.d(gVar.f57421b, file, j3, j10, this.d, this.h, new ac.e(j11, gVar, this));
        this.f57435n = dVar;
        this.f57438q = 0L;
        dVar.f52699k.post(new Runnable() {
            @Override
            public final void run() {
                String str;
                d dVar2 = d.this;
                File file2 = dVar2.f52692b;
                vi.b bVar = dVar2.f52695f;
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a10 = AudioRecorderNative.a(dVar2.f52693c, dVar2.d, dVar2.f52691a, dVar2.f52692b);
                    dVar2.f52708t = a10;
                    if (a10 != null) {
                        if (dVar2.f52694e == f.f57418b) {
                            AudioNoiseSuppressor a11 = AudioNoiseSuppressor.a();
                            dVar2.f52709u = a11;
                            if (a11 == null) {
                                bVar.b("RNNoise unavailable; recording unprocessed PCM");
                            } else {
                                bVar.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
                            }
                        }
                        long d = dVar2.f52708t.d();
                        StringBuilder sb2 = new StringBuilder("Opus encoder started: prefix=");
                        if (file2 == null) {
                            str = "none";
                        } else {
                            str = file2.getName() + " " + dVar2.f52693c + ".." + dVar2.d;
                        }
                        sb2.append(str);
                        sb2.append(", initialBytes=");
                        sb2.append(d);
                        sb2.append(", queuedChunks=");
                        sb2.append(dVar2.f52701m.get());
                        sb2.append(", elapsedMs=");
                        sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                        bVar.b(sb2.toString());
                        dVar2.f52711x = SystemClock.elapsedRealtime();
                        if (d > 0) {
                            ac.e eVar = dVar2.f52696g;
                            ((h) eVar.f1025c).a((g) eVar.f1024b, d);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Unable to initialize native Opus recorder");
                } catch (Throwable th2) {
                    if (dVar2.v == null) {
                        dVar2.f52695f.a("encoding failed", th2);
                        dVar2.v = d.a(th2);
                        dVar2.f52702n = true;
                    }
                }
            }
        });
        dVar.f52697i.post(new a(dVar, 0));
    }
}
