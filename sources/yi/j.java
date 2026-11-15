package yi;

import a8.p0;
import ai.e0;
import ai.x0;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import b7.l;
import fi.a4;
import h2.z;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import l2.f0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.le;
import org.telegram.messenger.ns;
import ug.t1;
import yi.h;
import yi.i;
import yi.j;
public final class j {
    public static final sa.d H = new sa.d(29);
    public static final AtomicLong I = new AtomicLong(1);
    public f0 A;
    public byte[] B;
    public ac.e C;
    public final e D;
    public final e E;
    public final Context f60752a;
    public final File f60753b;
    public final long f60754c;
    public final h d;
    public final boolean f60755e;
    public final ji.j f60756f;
    public final k8.a f60757g;
    public final b h;
    public org.telegram.utils.recorder.audio.d f60763n;
    public long f60764o;
    public long f60765p;
    public long f60766q;
    public long f60767r;
    public long f60768s;
    public boolean f60770u;
    public boolean v;
    public boolean f60771w;
    public boolean f60772x;
    public boolean f60773y;
    public volatile i f60774z;
    public final Handler f60758i = new Handler(Looper.getMainLooper());
    public final ExecutorService f60759j = Executors.newSingleThreadExecutor(new x0(9));
    public final ExecutorService f60760k = Executors.newSingleThreadExecutor(new x0(10));
    public final Object f60761l = new Object();
    public final ArrayList f60762m = new ArrayList();
    public int G = 1;
    public long f60769t = 1;
    public final z F = new z(this, 2);

    public j(a4 a4Var) {
        q();
        Context context = (Context) a4Var.f11406b;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.f60752a = context;
        File file = (File) a4Var.f11407c;
        this.f60753b = file == null ? context.getCacheDir() : file;
        this.f60754c = 700L;
        h hVar = (h) a4Var.d;
        this.d = hVar;
        this.f60755e = a4Var.f11405a;
        this.f60756f = (ji.j) a4Var.f11408e;
        this.f60757g = (k8.a) a4Var.f11409f;
        b bVar = new b((g) a4Var.f11410g);
        this.h = bVar;
        this.D = new Runnable(this) {
            public final j f60741b;

            {
                this.f60741b = this;
            }

            @Override
            public final void run() {
                f0 f0Var;
                switch (r2) {
                    case 0:
                        j jVar = this.f60741b;
                        if (jVar.G == 3 && !jVar.f60771w) {
                            jVar.f60771w = true;
                            b bVar2 = jVar.h;
                            bVar2.b("maximum duration reached: durationMs=" + jVar.j());
                            jVar.f60756f.getClass();
                            jVar.n();
                            return;
                        }
                        return;
                    default:
                        j jVar2 = this.f60741b;
                        if (jVar2.G == 5 && (f0Var = jVar2.A) != null && jVar2.f60770u) {
                            long l10 = f0Var.l();
                            long j3 = jVar2.f60767r;
                            if (l10 < j3 || l10 >= jVar2.f60768s) {
                                jVar2.A.Z0(5, j3);
                            }
                            ji.j jVar3 = jVar2.f60756f;
                            jVar2.j();
                            jVar3.getClass();
                            jVar2.f60758i.postDelayed(jVar2.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        this.E = new Runnable(this) {
            public final j f60741b;

            {
                this.f60741b = this;
            }

            @Override
            public final void run() {
                f0 f0Var;
                switch (r2) {
                    case 0:
                        j jVar = this.f60741b;
                        if (jVar.G == 3 && !jVar.f60771w) {
                            jVar.f60771w = true;
                            b bVar2 = jVar.h;
                            bVar2.b("maximum duration reached: durationMs=" + jVar.j());
                            jVar.f60756f.getClass();
                            jVar.n();
                            return;
                        }
                        return;
                    default:
                        j jVar2 = this.f60741b;
                        if (jVar2.G == 5 && (f0Var = jVar2.A) != null && jVar2.f60770u) {
                            long l10 = f0Var.l();
                            long j3 = jVar2.f60767r;
                            if (l10 < j3 || l10 >= jVar2.f60768s) {
                                jVar2.A.Z0(5, j3);
                            }
                            ji.j jVar3 = jVar2.f60756f;
                            jVar2.j();
                            jVar3.getClass();
                            jVar2.f60758i.postDelayed(jVar2.E, 32L);
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

    public static long r(long j3) {
        return (j3 * 1000) / 48000;
    }

    public final void a(i iVar, long j3) {
        if (j3 <= 0) {
            return;
        }
        synchronized (this.f60761l) {
            try {
                if (iVar.d && !iVar.f60751e) {
                    long j10 = iVar.f60750c;
                    if (j3 > j10) {
                        iVar.f60750c = j3;
                        this.f60760k.execute(new c(this, iVar, j10, j3 - j10, 1));
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
            this.h.b("cancel requested: state=".concat(r.b.x(i7)));
            e eVar = this.D;
            Handler handler = this.f60758i;
            handler.removeCallbacks(eVar);
            handler.removeCallbacks(this.E);
            p();
            k(2);
            s(10);
            org.telegram.utils.recorder.audio.d dVar = this.f60763n;
            if (dVar != null) {
                dVar.d();
                return;
            }
            c();
            t();
        }
    }

    public final void c() {
        File file;
        if (this.f60772x) {
            return;
        }
        this.f60772x = true;
        ac.e eVar = this.C;
        if (eVar == null) {
            file = null;
        } else {
            file = (File) eVar.f1022b;
        }
        t1 t1Var = new t1(27, this, file);
        try {
            this.f60759j.execute(t1Var);
        } catch (RejectedExecutionException unused) {
            t1Var.run();
        }
    }

    public final i d() {
        File f10 = f();
        long j3 = this.f60769t;
        this.f60769t = 1 + j3;
        i iVar = new i(j3, f10);
        synchronized (this.f60761l) {
            this.f60774z = iVar;
            this.f60760k.execute(new d(this, iVar, f10, 1));
        }
        b bVar = this.h;
        StringBuilder t6 = p0.t(j3, "output generation started: id=", ", file=");
        t6.append(f10.getName());
        bVar.b(t6.toString());
        return iVar;
    }

    public final l e() {
        return new l(this.G);
    }

    public final File f() {
        File file = this.f60753b;
        File file2 = new File(file, "audio_recording_voice_" + System.currentTimeMillis() + "_" + I.getAndIncrement() + ".ogg");
        synchronized (this.f60762m) {
            this.f60762m.add(file2);
        }
        return file2;
    }

    public final void g(Exception exc) {
        int i7 = this.G;
        if (i7 != 9 && i7 != 10 && i7 != 8) {
            this.h.a("fatal error in state=".concat(r.b.x(i7)), exc);
            Handler handler = this.f60758i;
            handler.removeCallbacks(this.D);
            handler.removeCallbacks(this.E);
            p();
            k(3);
            s(9);
            i iVar = this.f60774z;
            if (iVar != null) {
                this.f60760k.execute(new c(this, iVar, exc));
            }
            MediaController mediaController = ((le) this.f60756f.f17555b).f24823a;
            String[] strArr = MediaController.W1;
            a8.e("AudioRecorderV2 failed", exc);
            ns.f(mediaController.f22352i1).k(ns.f25533m2, Integer.valueOf(mediaController.f22350h1));
            mediaController.x(false);
            org.telegram.utils.recorder.audio.d dVar = this.f60763n;
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
        bVar.b("finish requested: state=" + r.b.x(this.G) + ", durationMs=" + j() + ", trim=" + this.f60767r + ".." + this.f60768s);
        if (this.G == 3) {
            this.v = true;
            this.f60758i.removeCallbacks(this.D);
            s(7);
            this.f60763n.d();
            return;
        }
        p();
        s(7);
        final i iVar = this.f60774z;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long r10 = r(this.f60765p);
        final long j3 = this.f60767r;
        if (j3 == 0 && this.f60768s == r10) {
            i();
            return;
        }
        final long j10 = this.f60768s;
        k(1);
        final i d = d();
        this.f60759j.execute(new Runnable() {
            @Override
            public final void run() {
                String str;
                i iVar2 = iVar;
                i iVar3 = d;
                long j11 = j3;
                long j12 = j10;
                j jVar = j.this;
                Handler handler = jVar.f60758i;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String absolutePath = iVar2.f60749b.getAbsolutePath();
                    File file = iVar3.f60749b;
                    String absolutePath2 = file.getAbsolutePath();
                    try {
                        if (AudioRecorderNative.b(absolutePath, absolutePath2, j11, j12)) {
                            yi.b bVar2 = jVar.h;
                            bVar2.b("final trim completed: source=" + iVar2.f60749b.getName() + ", output=" + file.getName() + ", trim=" + j11 + ".." + j12 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            jVar.a(iVar3, file.length());
                            handler.post(new e0(jVar, j12, j11, 4));
                            return;
                        }
                        throw new IllegalStateException("Unable to trim final Opus output");
                    } catch (Throwable th2) {
                        th = th2;
                        str = absolutePath2;
                        handler.post(new t1(26, str, th));
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
        i iVar = this.f60774z;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long j3 = j();
        if (j3 < this.f60754c) {
            b bVar = this.h;
            bVar.b("recording rejected as too short: durationMs=" + j3);
            MediaController mediaController = ((le) this.f60756f.f17555b).f24823a;
            ns.f(mediaController.f22352i1).k(ns.f25575t2, Integer.valueOf(mediaController.f22350h1), Boolean.FALSE, Integer.valueOf((int) j3));
            mediaController.x(false);
            k(2);
            s(10);
            c();
            t();
            l("too_short");
            return;
        }
        this.f60759j.execute(new org.telegram.utils.recorder.audio.b(j3, iVar, this));
    }

    public final long j() {
        q();
        return r(this.f60765p + this.f60766q);
    }

    public final void k(int i7) {
        String str;
        synchronized (this.f60761l) {
            i iVar = this.f60774z;
            if (iVar != null && iVar.d && !iVar.f60751e) {
                iVar.d = false;
                this.f60760k.execute(new c(this, iVar, i7));
                b bVar = this.h;
                StringBuilder sb2 = new StringBuilder("output generation invalidated: id=");
                sb2.append(iVar.f60748a);
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
        if (this.f60773y) {
            return;
        }
        this.f60773y = true;
        StringBuilder u10 = p0.u("session summary: terminal=", str, ", durationMs=");
        u10.append(r(this.f60765p + this.f60766q));
        u10.append(", generations=");
        u10.append(this.f60769t - 1);
        this.h.b(u10.toString());
    }

    public final void m() {
        l e10 = e();
        ji.j jVar = this.f60756f;
        MediaController mediaController = ((le) jVar.f17555b).f24823a;
        int i7 = e10.f2963a;
        e0.g gVar = (e0.g) jVar.f17556c;
        int i10 = gVar.f9887a;
        gVar.f9887a = i7;
        if (i7 == 3) {
            boolean z10 = gVar.f9888b;
            if (!z10 && i10 == 2) {
                System.currentTimeMillis();
                String[] strArr = MediaController.W1;
                if (!mediaController.J1) {
                    ns.f(mediaController.f22352i1).k(ns.f25528l2, Integer.valueOf(mediaController.f22350h1), Boolean.TRUE);
                }
            } else if (!z10 && i10 == 6) {
                mediaController.Y(true);
                ns.f(mediaController.f22352i1).k(ns.f25549p2, new Object[0]);
            }
            if (gVar.f9888b) {
                if (i7 == 3 || i7 == 5) {
                    gVar.f9888b = false;
                    ((j) gVar.f9890e).h();
                }
            }
        }
    }

    public final boolean n() {
        q();
        if (this.G == 3 && this.f60763n != null) {
            this.h.b("pause requested: durationMs=" + j());
            this.f60758i.removeCallbacks(this.D);
            s(4);
            this.f60763n.d();
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
        this.f60758i.removeCallbacks(this.E);
        this.f60770u = false;
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
        this.h.b("state: " + r.b.x(i10) + " -> " + r.b.x(i7) + ", durationMs=" + r(this.f60765p + this.f60766q));
        m();
    }

    public final void t() {
        this.f60759j.shutdown();
        this.f60760k.shutdown();
    }

    public final void u(long j3, long j10, File file) {
        long j11 = this.f60764o + 1;
        this.f60764o = j11;
        i iVar = this.f60774z;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.d dVar = new org.telegram.utils.recorder.audio.d(iVar.f60749b, file, j3, j10, this.d, this.h, new ac.e(j11, iVar, this));
        this.f60763n = dVar;
        this.f60766q = 0L;
        dVar.f54133k.post(new Runnable() {
            @Override
            public final void run() {
                String str;
                d dVar2 = d.this;
                File file2 = dVar2.f54126b;
                yi.b bVar = dVar2.f54129f;
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a10 = AudioRecorderNative.a(dVar2.f54127c, dVar2.d, dVar2.f54125a, dVar2.f54126b);
                    dVar2.f54142t = a10;
                    if (a10 != null) {
                        if (dVar2.f54128e == h.f60746b) {
                            AudioNoiseSuppressor a11 = AudioNoiseSuppressor.a();
                            dVar2.f54143u = a11;
                            if (a11 == null) {
                                bVar.b("RNNoise unavailable; recording unprocessed PCM");
                            } else {
                                bVar.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
                            }
                        }
                        long d = dVar2.f54142t.d();
                        StringBuilder sb2 = new StringBuilder("Opus encoder started: prefix=");
                        if (file2 == null) {
                            str = "none";
                        } else {
                            str = file2.getName() + " " + dVar2.f54127c + ".." + dVar2.d;
                        }
                        sb2.append(str);
                        sb2.append(", initialBytes=");
                        sb2.append(d);
                        sb2.append(", queuedChunks=");
                        sb2.append(dVar2.f54135m.get());
                        sb2.append(", elapsedMs=");
                        sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                        bVar.b(sb2.toString());
                        dVar2.f54145x = SystemClock.elapsedRealtime();
                        if (d > 0) {
                            ac.e eVar = dVar2.f54130g;
                            ((j) eVar.f1023c).a((i) eVar.f1022b, d);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Unable to initialize native Opus recorder");
                } catch (Throwable th2) {
                    if (dVar2.v == null) {
                        dVar2.f54129f.a("encoding failed", th2);
                        dVar2.v = d.a(th2);
                        dVar2.f54136n = true;
                    }
                }
            }
        });
        dVar.f54131i.post(new a(dVar, 0));
    }
}
