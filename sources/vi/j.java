package vi;

import a7.l;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import ei.i4;
import g2.a0;
import g2.m0;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import k2.i0;
import m2.t;
import mi.h0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.ge;
import org.telegram.messenger.hs;
import org.telegram.messenger.ok;
import org.telegram.ui.Components.iv0;
import vi.f;
import vi.h;
import vi.i;
import vi.j;
public final class j {
    public static final nb.a H = new nb.a(26);
    public static final AtomicLong I = new AtomicLong(1);
    public i0 A;
    public byte[] B;
    public f C;
    public final d D;
    public final d E;
    public final Context f56981a;
    public final File f56982b;
    public final long f56983c;
    public final h d;
    public final boolean f56984e;
    public final h0 f56985f;
    public final t f56986g;
    public final b h;
    public org.telegram.utils.recorder.audio.d f56992n;
    public long f56993o;
    public long f56994p;
    public long f56995q;
    public long f56996r;
    public long f56997s;
    public boolean f56999u;
    public boolean v;
    public boolean f57000w;
    public boolean f57001x;
    public boolean f57002y;
    public volatile i f57003z;
    public final Handler f56987i = new Handler(Looper.getMainLooper());
    public final ExecutorService f56988j = Executors.newSingleThreadExecutor(new m0(7));
    public final ExecutorService f56989k = Executors.newSingleThreadExecutor(new m0(8));
    public final Object f56990l = new Object();
    public final ArrayList f56991m = new ArrayList();
    public int G = 1;
    public long f56998t = 1;
    public final a0 F = new a0(this, 2);

    public j(i4 i4Var) {
        q();
        Context context = (Context) i4Var.f10403b;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.f56981a = context;
        File file = (File) i4Var.f10404c;
        this.f56982b = file == null ? context.getCacheDir() : file;
        this.f56983c = 700L;
        h hVar = (h) i4Var.d;
        this.d = hVar;
        this.f56984e = i4Var.f10402a;
        this.f56985f = (h0) i4Var.f10405e;
        this.f56986g = (t) i4Var.f10406f;
        b bVar = new b((g) i4Var.f10407g);
        this.h = bVar;
        this.D = new Runnable(this) {
            public final j f56967b;

            {
                this.f56967b = this;
            }

            @Override
            public final void run() {
                i0 i0Var;
                switch (r2) {
                    case 0:
                        j jVar = this.f56967b;
                        if (jVar.G == 3 && !jVar.f57000w) {
                            jVar.f57000w = true;
                            b bVar2 = jVar.h;
                            bVar2.b("maximum duration reached: durationMs=" + jVar.j());
                            jVar.f56985f.getClass();
                            jVar.n();
                            return;
                        }
                        return;
                    default:
                        j jVar2 = this.f56967b;
                        if (jVar2.G == 5 && (i0Var = jVar2.A) != null && jVar2.f56999u) {
                            long N0 = i0Var.N0();
                            long j10 = jVar2.f56996r;
                            if (N0 < j10 || N0 >= jVar2.f56997s) {
                                jVar2.A.Z0(5, j10);
                            }
                            h0 h0Var = jVar2.f56985f;
                            jVar2.j();
                            h0Var.getClass();
                            jVar2.f56987i.postDelayed(jVar2.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        this.E = new Runnable(this) {
            public final j f56967b;

            {
                this.f56967b = this;
            }

            @Override
            public final void run() {
                i0 i0Var;
                switch (r2) {
                    case 0:
                        j jVar = this.f56967b;
                        if (jVar.G == 3 && !jVar.f57000w) {
                            jVar.f57000w = true;
                            b bVar2 = jVar.h;
                            bVar2.b("maximum duration reached: durationMs=" + jVar.j());
                            jVar.f56985f.getClass();
                            jVar.n();
                            return;
                        }
                        return;
                    default:
                        j jVar2 = this.f56967b;
                        if (jVar2.G == 5 && (i0Var = jVar2.A) != null && jVar2.f56999u) {
                            long N0 = i0Var.N0();
                            long j10 = jVar2.f56996r;
                            if (N0 < j10 || N0 >= jVar2.f56997s) {
                                jVar2.A.Z0(5, j10);
                            }
                            h0 h0Var = jVar2.f56985f;
                            jVar2.j();
                            h0Var.getClass();
                            jVar2.f56987i.postDelayed(jVar2.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        bVar.b("session created: device=" + Build.MANUFACTURER + " " + Build.MODEL + ", sdk=" + Build.VERSION.SDK_INT + ", sampleRate=48000, noiseSuppression=" + hVar + ", minimumDurationMs=700, maximumDurationMs=0");
    }

    public static void q() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("AudioRecordingSession must be used on the main thread");
    }

    public static long r(long j10) {
        return (j10 * 1000) / 48000;
    }

    public final void a(i iVar, long j10) {
        if (j10 <= 0) {
            return;
        }
        synchronized (this.f56990l) {
            try {
                if (iVar.d && !iVar.f56980e) {
                    long j11 = iVar.f56979c;
                    if (j10 > j11) {
                        iVar.f56979c = j10;
                        this.f56989k.execute(new c(this, iVar, j11, j10 - j11, 1));
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        q();
        int i3 = this.G;
        if (i3 != 10 && i3 != 8) {
            this.h.b("cancel requested: state=".concat(t4.c.r(i3)));
            d dVar = this.D;
            Handler handler = this.f56987i;
            handler.removeCallbacks(dVar);
            handler.removeCallbacks(this.E);
            p();
            k(2);
            s(10);
            org.telegram.utils.recorder.audio.d dVar2 = this.f56992n;
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
        if (this.f57001x) {
            return;
        }
        this.f57001x = true;
        f fVar = this.C;
        if (fVar == null) {
            file = null;
        } else {
            file = (File) fVar.f56972b;
        }
        u9.a aVar = new u9.a(13, this, file);
        try {
            this.f56988j.execute(aVar);
        } catch (RejectedExecutionException unused) {
            aVar.run();
        }
    }

    public final i d() {
        File f10 = f();
        long j10 = this.f56998t;
        this.f56998t = 1 + j10;
        i iVar = new i(j10, f10);
        synchronized (this.f56990l) {
            this.f57003z = iVar;
            this.f56989k.execute(new iv0(this, iVar, f10, 21));
        }
        b bVar = this.h;
        StringBuilder t10 = a1.g.t(j10, "output generation started: id=", ", file=");
        t10.append(f10.getName());
        bVar.b(t10.toString());
        return iVar;
    }

    public final l e() {
        return new l(this.G);
    }

    public final File f() {
        File file = this.f56982b;
        File file2 = new File(file, "audio_recording_voice_" + System.currentTimeMillis() + "_" + I.getAndIncrement() + ".ogg");
        synchronized (this.f56991m) {
            this.f56991m.add(file2);
        }
        return file2;
    }

    public final void g(Exception exc) {
        int i3 = this.G;
        if (i3 != 9 && i3 != 10 && i3 != 8) {
            this.h.a("fatal error in state=".concat(t4.c.r(i3)), exc);
            Handler handler = this.f56987i;
            handler.removeCallbacks(this.D);
            handler.removeCallbacks(this.E);
            p();
            k(3);
            s(9);
            i iVar = this.f57003z;
            if (iVar != null) {
                this.f56989k.execute(new c(this, iVar, exc));
            }
            MediaController mediaController = ((ge) this.f56985f.f19644b).f22707a;
            String[] strArr = MediaController.W1;
            a8.e("AudioRecorderV2 failed", exc);
            hs.f(mediaController.f21323i1).k(hs.f23265m2, Integer.valueOf(mediaController.f21321h1));
            mediaController.x(false);
            org.telegram.utils.recorder.audio.d dVar = this.f56992n;
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
        int i3 = this.G;
        if (i3 != 3 && i3 != 5) {
            return;
        }
        b bVar = this.h;
        bVar.b("finish requested: state=" + t4.c.r(this.G) + ", durationMs=" + j() + ", trim=" + this.f56996r + ".." + this.f56997s);
        if (this.G == 3) {
            this.v = true;
            this.f56987i.removeCallbacks(this.D);
            s(7);
            this.f56992n.d();
            return;
        }
        p();
        s(7);
        final i iVar = this.f57003z;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long r5 = r(this.f56994p);
        final long j10 = this.f56996r;
        if (j10 == 0 && this.f56997s == r5) {
            i();
            return;
        }
        final long j11 = this.f56997s;
        k(1);
        final i d = d();
        this.f56988j.execute(new Runnable() {
            @Override
            public final void run() {
                String str;
                i iVar2 = iVar;
                i iVar3 = d;
                long j12 = j10;
                long j13 = j11;
                j jVar = j.this;
                Handler handler = jVar.f56987i;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String absolutePath = iVar2.f56978b.getAbsolutePath();
                    File file = iVar3.f56978b;
                    String absolutePath2 = file.getAbsolutePath();
                    try {
                        if (AudioRecorderNative.b(absolutePath, absolutePath2, j12, j13)) {
                            vi.b bVar2 = jVar.h;
                            bVar2.b("final trim completed: source=" + iVar2.f56978b.getName() + ", output=" + file.getName() + ", trim=" + j12 + ".." + j13 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            jVar.a(iVar3, file.length());
                            handler.post(new ok(jVar, j13, j12, 3));
                            return;
                        }
                        throw new IllegalStateException("Unable to trim final Opus output");
                    } catch (Throwable th2) {
                        th = th2;
                        str = absolutePath2;
                        handler.post(new u9.a(12, str, th));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = jVar;
                }
            }
        });
    }

    public final void i() {
        if (this.G != 7) {
            return;
        }
        i iVar = this.f57003z;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long j10 = j();
        if (j10 < this.f56983c) {
            b bVar = this.h;
            bVar.b("recording rejected as too short: durationMs=" + j10);
            MediaController mediaController = ((ge) this.f56985f.f19644b).f22707a;
            hs.f(mediaController.f21323i1).k(hs.f23308t2, Integer.valueOf(mediaController.f21321h1), Boolean.FALSE, Integer.valueOf((int) j10));
            mediaController.x(false);
            k(2);
            s(10);
            c();
            t();
            l("too_short");
            return;
        }
        this.f56988j.execute(new org.telegram.utils.recorder.audio.b(j10, iVar, this));
    }

    public final long j() {
        q();
        return r(this.f56994p + this.f56995q);
    }

    public final void k(int i3) {
        String str;
        synchronized (this.f56990l) {
            i iVar = this.f57003z;
            if (iVar != null && iVar.d && !iVar.f56980e) {
                iVar.d = false;
                this.f56989k.execute(new c(this, iVar, i3));
                b bVar = this.h;
                StringBuilder sb2 = new StringBuilder("output generation invalidated: id=");
                sb2.append(iVar.f56977a);
                sb2.append(", reason=");
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
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
        if (this.f57002y) {
            return;
        }
        this.f57002y = true;
        StringBuilder u10 = a1.g.u("session summary: terminal=", str, ", durationMs=");
        u10.append(r(this.f56994p + this.f56995q));
        u10.append(", generations=");
        u10.append(this.f56998t - 1);
        this.h.b(u10.toString());
    }

    public final void m() {
        l e10 = e();
        h0 h0Var = this.f56985f;
        MediaController mediaController = ((ge) h0Var.f19644b).f22707a;
        int i3 = e10.f156a;
        e0.g gVar = (e0.g) h0Var.f19645c;
        int i10 = gVar.f9233a;
        gVar.f9233a = i3;
        if (i3 == 3) {
            boolean z10 = gVar.f9234b;
            if (!z10 && i10 == 2) {
                System.currentTimeMillis();
                String[] strArr = MediaController.W1;
                if (!mediaController.J1) {
                    hs.f(mediaController.f21323i1).k(hs.f23261l2, Integer.valueOf(mediaController.f21321h1), Boolean.TRUE);
                }
            } else if (!z10 && i10 == 6) {
                mediaController.Y(true);
                hs.f(mediaController.f21323i1).k(hs.f23282p2, new Object[0]);
            }
            if (gVar.f9234b) {
                if (i3 == 3 || i3 == 5) {
                    gVar.f9234b = false;
                    ((j) gVar.f9236e).h();
                }
            }
        }
    }

    public final boolean n() {
        q();
        if (this.G == 3 && this.f56992n != null) {
            this.h.b("pause requested: durationMs=" + j());
            this.f56987i.removeCallbacks(this.D);
            s(4);
            this.f56992n.d();
            return true;
        }
        return false;
    }

    public final void o() {
        q();
        int i3 = this.G;
        if (i3 == 10) {
            return;
        }
        if (i3 != 8) {
            b();
            return;
        }
        p();
        c();
        s(10);
        l("released");
    }

    public final void p() {
        this.f56987i.removeCallbacks(this.E);
        this.f56999u = false;
        i0 i0Var = this.A;
        if (i0Var != null) {
            i0Var.s(this.F);
            this.A.X0();
            this.A = null;
        }
    }

    public final void s(int i3) {
        int i10 = this.G;
        if (i10 == i3) {
            return;
        }
        this.G = i3;
        this.h.b("state: " + t4.c.r(i10) + " -> " + t4.c.r(i3) + ", durationMs=" + r(this.f56994p + this.f56995q));
        m();
    }

    public final void t() {
        this.f56988j.shutdown();
        this.f56989k.shutdown();
    }

    public final void u(long j10, long j11, File file) {
        long j12 = this.f56993o + 1;
        this.f56993o = j12;
        i iVar = this.f57003z;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.d dVar = new org.telegram.utils.recorder.audio.d(iVar.f56978b, file, j10, j11, this.d, this.h, new f(j12, iVar, this));
        this.f56992n = dVar;
        this.f56995q = 0L;
        dVar.f52791k.post(new Runnable() {
            @Override
            public final void run() {
                String str;
                d dVar2 = d.this;
                File file2 = dVar2.f52784b;
                vi.b bVar = dVar2.f52787f;
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a10 = AudioRecorderNative.a(dVar2.f52785c, dVar2.d, dVar2.f52783a, dVar2.f52784b);
                    dVar2.f52800t = a10;
                    if (a10 != null) {
                        if (dVar2.f52786e == h.f56975b) {
                            AudioNoiseSuppressor a11 = AudioNoiseSuppressor.a();
                            dVar2.f52801u = a11;
                            if (a11 == null) {
                                bVar.b("RNNoise unavailable; recording unprocessed PCM");
                            } else {
                                bVar.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
                            }
                        }
                        long d = dVar2.f52800t.d();
                        StringBuilder sb2 = new StringBuilder("Opus encoder started: prefix=");
                        if (file2 == null) {
                            str = "none";
                        } else {
                            str = file2.getName() + " " + dVar2.f52785c + ".." + dVar2.d;
                        }
                        sb2.append(str);
                        sb2.append(", initialBytes=");
                        sb2.append(d);
                        sb2.append(", queuedChunks=");
                        sb2.append(dVar2.f52793m.get());
                        sb2.append(", elapsedMs=");
                        sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                        bVar.b(sb2.toString());
                        dVar2.f52803x = SystemClock.elapsedRealtime();
                        if (d > 0) {
                            f fVar = dVar2.f52788g;
                            ((j) fVar.f56973c).a((i) fVar.f56972b, d);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Unable to initialize native Opus recorder");
                } catch (Throwable th2) {
                    if (dVar2.v == null) {
                        dVar2.f52787f.a("encoding failed", th2);
                        dVar2.v = d.a(th2);
                        dVar2.f52794n = true;
                    }
                }
            }
        });
        dVar.f52789i.post(new a(dVar, 0));
    }
}
