package yi;

import a8.p0;
import ai.g0;
import ai.z0;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import fi.y3;
import h2.z;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import ji.l;
import l2.f0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.le;
import org.telegram.messenger.ls;
import wg.p;
import wg.q;
import yi.g;
import yi.h;
import yi.j;
public final class j {
    public static final sa.d H = new sa.d(29);
    public static final AtomicLong I = new AtomicLong(1);
    public f0 A;
    public byte[] B;
    public ac.e C;
    public final d D;
    public final d E;
    public final Context f61362a;
    public final File f61363b;
    public final long f61364c;
    public final g d;
    public final boolean f61365e;
    public final l f61366f;
    public final k8.a f61367g;
    public final b h;
    public org.telegram.utils.recorder.audio.d f61373n;
    public long f61374o;
    public long f61375p;
    public long f61376q;
    public long f61377r;
    public long f61378s;
    public boolean f61380u;
    public boolean v;
    public boolean f61381w;
    public boolean f61382x;
    public boolean f61383y;
    public volatile h f61384z;
    public final Handler f61368i = new Handler(Looper.getMainLooper());
    public final ExecutorService f61369j = Executors.newSingleThreadExecutor(new z0(9));
    public final ExecutorService f61370k = Executors.newSingleThreadExecutor(new z0(10));
    public final Object f61371l = new Object();
    public final ArrayList f61372m = new ArrayList();
    public int G = 1;
    public long f61379t = 1;
    public final z F = new z(this, 2);

    public j(y3 y3Var) {
        q();
        Context context = (Context) y3Var.f12814b;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.f61362a = context;
        File file = (File) y3Var.f12815c;
        this.f61363b = file == null ? context.getCacheDir() : file;
        this.f61364c = 700L;
        g gVar = (g) y3Var.d;
        this.d = gVar;
        this.f61365e = y3Var.f12813a;
        this.f61366f = (l) y3Var.f12816e;
        this.f61367g = (k8.a) y3Var.f12817f;
        b bVar = new b((f) y3Var.f12818g);
        this.h = bVar;
        this.D = new Runnable(this) {
            public final j f61351b;

            {
                this.f61351b = this;
            }

            @Override
            public final void run() {
                f0 f0Var;
                switch (r2) {
                    case 0:
                        j jVar = this.f61351b;
                        if (jVar.G == 3 && !jVar.f61381w) {
                            jVar.f61381w = true;
                            b bVar2 = jVar.h;
                            bVar2.b("maximum duration reached: durationMs=" + jVar.j());
                            jVar.f61366f.getClass();
                            jVar.n();
                            return;
                        }
                        return;
                    default:
                        j jVar2 = this.f61351b;
                        if (jVar2.G == 5 && (f0Var = jVar2.A) != null && jVar2.f61380u) {
                            long l10 = f0Var.l();
                            long j3 = jVar2.f61377r;
                            if (l10 < j3 || l10 >= jVar2.f61378s) {
                                jVar2.A.Z0(5, j3);
                            }
                            l lVar = jVar2.f61366f;
                            jVar2.j();
                            lVar.getClass();
                            jVar2.f61368i.postDelayed(jVar2.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        this.E = new Runnable(this) {
            public final j f61351b;

            {
                this.f61351b = this;
            }

            @Override
            public final void run() {
                f0 f0Var;
                switch (r2) {
                    case 0:
                        j jVar = this.f61351b;
                        if (jVar.G == 3 && !jVar.f61381w) {
                            jVar.f61381w = true;
                            b bVar2 = jVar.h;
                            bVar2.b("maximum duration reached: durationMs=" + jVar.j());
                            jVar.f61366f.getClass();
                            jVar.n();
                            return;
                        }
                        return;
                    default:
                        j jVar2 = this.f61351b;
                        if (jVar2.G == 5 && (f0Var = jVar2.A) != null && jVar2.f61380u) {
                            long l10 = f0Var.l();
                            long j3 = jVar2.f61377r;
                            if (l10 < j3 || l10 >= jVar2.f61378s) {
                                jVar2.A.Z0(5, j3);
                            }
                            l lVar = jVar2.f61366f;
                            jVar2.j();
                            lVar.getClass();
                            jVar2.f61368i.postDelayed(jVar2.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        bVar.b("session created: device=" + Build.MANUFACTURER + " " + Build.MODEL + ", sdk=" + Build.VERSION.SDK_INT + ", sampleRate=48000, noiseSuppression=" + gVar + ", minimumDurationMs=700, maximumDurationMs=0");
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

    public final void a(h hVar, long j3) {
        if (j3 <= 0) {
            return;
        }
        synchronized (this.f61371l) {
            try {
                if (hVar.d && !hVar.f61361e) {
                    long j10 = hVar.f61360c;
                    if (j3 > j10) {
                        hVar.f61360c = j3;
                        this.f61370k.execute(new c(this, hVar, j10, j3 - j10, 1));
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
            this.h.b("cancel requested: state=".concat(i.c(i7)));
            d dVar = this.D;
            Handler handler = this.f61368i;
            handler.removeCallbacks(dVar);
            handler.removeCallbacks(this.E);
            p();
            k(2);
            s(10);
            org.telegram.utils.recorder.audio.d dVar2 = this.f61373n;
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
        if (this.f61382x) {
            return;
        }
        this.f61382x = true;
        ac.e eVar = this.C;
        if (eVar == null) {
            file = null;
        } else {
            file = (File) eVar.f1021b;
        }
        q qVar = new q(21, this, file);
        try {
            this.f61369j.execute(qVar);
        } catch (RejectedExecutionException unused) {
            qVar.run();
        }
    }

    public final h d() {
        File f10 = f();
        long j3 = this.f61379t;
        this.f61379t = 1 + j3;
        h hVar = new h(j3, f10);
        synchronized (this.f61371l) {
            this.f61384z = hVar;
            this.f61370k.execute(new p(this, hVar, f10, 6));
        }
        b bVar = this.h;
        StringBuilder t6 = p0.t(j3, "output generation started: id=", ", file=");
        t6.append(f10.getName());
        bVar.b(t6.toString());
        return hVar;
    }

    public final b7.l e() {
        return new b7.l(this.G);
    }

    public final File f() {
        File file = this.f61363b;
        File file2 = new File(file, "audio_recording_voice_" + System.currentTimeMillis() + "_" + I.getAndIncrement() + ".ogg");
        synchronized (this.f61372m) {
            this.f61372m.add(file2);
        }
        return file2;
    }

    public final void g(Exception exc) {
        int i7 = this.G;
        if (i7 != 9 && i7 != 10 && i7 != 8) {
            this.h.a("fatal error in state=".concat(i.c(i7)), exc);
            Handler handler = this.f61368i;
            handler.removeCallbacks(this.D);
            handler.removeCallbacks(this.E);
            p();
            k(3);
            s(9);
            h hVar = this.f61384z;
            if (hVar != null) {
                this.f61370k.execute(new c(this, hVar, exc));
            }
            MediaController mediaController = ((le) this.f61366f.f17979b).f25217a;
            String[] strArr = MediaController.W1;
            a8.e("AudioRecorderV2 failed", exc);
            ls.f(mediaController.f22746i1).k(ls.f25345m2, Integer.valueOf(mediaController.f22744h1));
            mediaController.x(false);
            org.telegram.utils.recorder.audio.d dVar = this.f61373n;
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
        bVar.b("finish requested: state=" + i.c(this.G) + ", durationMs=" + j() + ", trim=" + this.f61377r + ".." + this.f61378s);
        if (this.G == 3) {
            this.v = true;
            this.f61368i.removeCallbacks(this.D);
            s(7);
            this.f61373n.d();
            return;
        }
        p();
        s(7);
        final h hVar = this.f61384z;
        if (hVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long r10 = r(this.f61375p);
        final long j3 = this.f61377r;
        if (j3 == 0 && this.f61378s == r10) {
            i();
            return;
        }
        final long j10 = this.f61378s;
        k(1);
        final h d = d();
        this.f61369j.execute(new Runnable() {
            @Override
            public final void run() {
                String str;
                h hVar2 = hVar;
                h hVar3 = d;
                long j11 = j3;
                long j12 = j10;
                j jVar = j.this;
                Handler handler = jVar.f61368i;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String absolutePath = hVar2.f61359b.getAbsolutePath();
                    File file = hVar3.f61359b;
                    String absolutePath2 = file.getAbsolutePath();
                    try {
                        if (AudioRecorderNative.b(absolutePath, absolutePath2, j11, j12)) {
                            yi.b bVar2 = jVar.h;
                            bVar2.b("final trim completed: source=" + hVar2.f61359b.getName() + ", output=" + file.getName() + ", trim=" + j11 + ".." + j12 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            jVar.a(hVar3, file.length());
                            handler.post(new g0(jVar, j12, j11, 4));
                            return;
                        }
                        throw new IllegalStateException("Unable to trim final Opus output");
                    } catch (Throwable th2) {
                        th = th2;
                        str = absolutePath2;
                        handler.post(new q(20, str, th));
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
        h hVar = this.f61384z;
        if (hVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long j3 = j();
        if (j3 < this.f61364c) {
            b bVar = this.h;
            bVar.b("recording rejected as too short: durationMs=" + j3);
            MediaController mediaController = ((le) this.f61366f.f17979b).f25217a;
            ls.f(mediaController.f22746i1).k(ls.f25387t2, Integer.valueOf(mediaController.f22744h1), Boolean.FALSE, Integer.valueOf((int) j3));
            mediaController.x(false);
            k(2);
            s(10);
            c();
            t();
            l("too_short");
            return;
        }
        this.f61369j.execute(new org.telegram.utils.recorder.audio.b(j3, hVar, this));
    }

    public final long j() {
        q();
        return r(this.f61375p + this.f61376q);
    }

    public final void k(int i7) {
        String str;
        synchronized (this.f61371l) {
            h hVar = this.f61384z;
            if (hVar != null && hVar.d && !hVar.f61361e) {
                hVar.d = false;
                this.f61370k.execute(new c(this, hVar, i7));
                b bVar = this.h;
                StringBuilder sb2 = new StringBuilder("output generation invalidated: id=");
                sb2.append(hVar.f61358a);
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
        if (this.f61383y) {
            return;
        }
        this.f61383y = true;
        StringBuilder u10 = p0.u("session summary: terminal=", str, ", durationMs=");
        u10.append(r(this.f61375p + this.f61376q));
        u10.append(", generations=");
        u10.append(this.f61379t - 1);
        this.h.b(u10.toString());
    }

    public final void m() {
        b7.l e10 = e();
        l lVar = this.f61366f;
        MediaController mediaController = ((le) lVar.f17979b).f25217a;
        int i7 = e10.f2980a;
        e0.g gVar = (e0.g) lVar.f17980c;
        int i10 = gVar.f10234a;
        gVar.f10234a = i7;
        if (i7 == 3) {
            boolean z10 = gVar.f10235b;
            if (!z10 && i10 == 2) {
                System.currentTimeMillis();
                String[] strArr = MediaController.W1;
                if (!mediaController.J1) {
                    ls.f(mediaController.f22746i1).k(ls.f25340l2, Integer.valueOf(mediaController.f22744h1), Boolean.TRUE);
                }
            } else if (!z10 && i10 == 6) {
                mediaController.Y(true);
                ls.f(mediaController.f22746i1).k(ls.f25361p2, new Object[0]);
            }
            if (gVar.f10235b) {
                if (i7 == 3 || i7 == 5) {
                    gVar.f10235b = false;
                    ((j) gVar.f10237e).h();
                }
            }
        }
    }

    public final boolean n() {
        q();
        if (this.G == 3 && this.f61373n != null) {
            this.h.b("pause requested: durationMs=" + j());
            this.f61368i.removeCallbacks(this.D);
            s(4);
            this.f61373n.d();
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
        this.f61368i.removeCallbacks(this.E);
        this.f61380u = false;
        f0 f0Var = this.A;
        if (f0Var != null) {
            f0Var.h0(this.F);
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
        this.h.b("state: " + i.c(i10) + " -> " + i.c(i7) + ", durationMs=" + r(this.f61375p + this.f61376q));
        m();
    }

    public final void t() {
        this.f61369j.shutdown();
        this.f61370k.shutdown();
    }

    public final void u(long j3, long j10, File file) {
        long j11 = this.f61374o + 1;
        this.f61374o = j11;
        h hVar = this.f61384z;
        if (hVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.d dVar = new org.telegram.utils.recorder.audio.d(hVar.f61359b, file, j3, j10, this.d, this.h, new ac.e(j11, hVar, this));
        this.f61373n = dVar;
        this.f61376q = 0L;
        dVar.f54697k.post(new Runnable() {
            @Override
            public final void run() {
                String str;
                d dVar2 = d.this;
                File file2 = dVar2.f54690b;
                yi.b bVar = dVar2.f54693f;
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a10 = AudioRecorderNative.a(dVar2.f54691c, dVar2.d, dVar2.f54689a, dVar2.f54690b);
                    dVar2.f54706t = a10;
                    if (a10 != null) {
                        if (dVar2.f54692e == g.f61356b) {
                            AudioNoiseSuppressor a11 = AudioNoiseSuppressor.a();
                            dVar2.f54707u = a11;
                            if (a11 == null) {
                                bVar.b("RNNoise unavailable; recording unprocessed PCM");
                            } else {
                                bVar.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
                            }
                        }
                        long d = dVar2.f54706t.d();
                        StringBuilder sb2 = new StringBuilder("Opus encoder started: prefix=");
                        if (file2 == null) {
                            str = "none";
                        } else {
                            str = file2.getName() + " " + dVar2.f54691c + ".." + dVar2.d;
                        }
                        sb2.append(str);
                        sb2.append(", initialBytes=");
                        sb2.append(d);
                        sb2.append(", queuedChunks=");
                        sb2.append(dVar2.f54699m.get());
                        sb2.append(", elapsedMs=");
                        sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                        bVar.b(sb2.toString());
                        dVar2.f54709x = SystemClock.elapsedRealtime();
                        if (d > 0) {
                            ac.e eVar = dVar2.f54694g;
                            ((j) eVar.f1022c).a((h) eVar.f1021b, d);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Unable to initialize native Opus recorder");
                } catch (Throwable th2) {
                    if (dVar2.v == null) {
                        dVar2.f54693f.a("encoding failed", th2);
                        dVar2.v = d.a(th2);
                        dVar2.f54700n = true;
                    }
                }
            }
        });
        dVar.f54695i.post(new a(dVar, 0));
    }
}
