package ui;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import di.p4;
import e2.l0;
import e2.z;
import i2.j0;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.ko;
import s9.g;
import ui.h;
import ui.i;
import ui.o;
public final class o {
    public static final sb.b H = new sb.b(24);
    public static final AtomicLong I = new AtomicLong(1);
    public volatile i A;
    public j0 B;
    public byte[] C;
    public l D;
    public final d E;
    public final d F;
    public final Context f49984a;
    public final File f49985b;
    public final long f49986c;
    public final h d;
    public final boolean e;
    public final f f49987f;
    public final k f49988g;
    public final b h;
    public org.telegram.utils.recorder.audio.d f49995o;
    public long f49996p;
    public long f49997q;
    public long f49998r;
    public long f49999s;
    public long f50000t;
    public boolean v;
    public boolean f50002w;
    public boolean f50003x;
    public boolean f50004y;
    public boolean f50005z;
    public final Handler f49989i = new Handler(Looper.getMainLooper());
    public final ExecutorService f49990j = Executors.newSingleThreadExecutor(new l0(7));
    public final ExecutorService f49991k = Executors.newSingleThreadExecutor(new l0(8));
    public final Object f49992l = new Object();
    public final ArrayList f49993m = new ArrayList();
    public m f49994n = m.f49976a;
    public long f50001u = 1;
    public final z G = new z(this, 2);

    public o(p4 p4Var) {
        p();
        Context context = (Context) p4Var.f8900b;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.f49984a = context;
        File file = (File) p4Var.f8901c;
        this.f49985b = file == null ? context.getCacheDir() : file;
        this.f49986c = 700L;
        h hVar = (h) p4Var.d;
        this.d = hVar;
        this.e = p4Var.f8899a;
        this.f49987f = (f) p4Var.e;
        this.f49988g = (k) p4Var.f8902f;
        b bVar = new b((g) p4Var.f8903g);
        this.h = bVar;
        this.E = new Runnable(this) {
            public final o f49960b;

            {
                this.f49960b = this;
            }

            @Override
            public final void run() {
                j0 j0Var;
                switch (r2) {
                    case 0:
                        o oVar = this.f49960b;
                        if (oVar.f49994n == m.f49978c && !oVar.f50003x) {
                            oVar.f50003x = true;
                            b bVar2 = oVar.h;
                            bVar2.b("maximum duration reached: durationMs=" + oVar.j());
                            oVar.f49987f.onMaximumDurationReached();
                            oVar.m();
                            return;
                        }
                        return;
                    default:
                        o oVar2 = this.f49960b;
                        if (oVar2.f49994n == m.e && (j0Var = oVar2.B) != null && oVar2.v) {
                            long M0 = j0Var.M0();
                            long j10 = oVar2.f49999s;
                            if (M0 < j10 || M0 >= oVar2.f50000t) {
                                oVar2.B.Z0(5, j10);
                                M0 = oVar2.f49999s;
                            }
                            oVar2.f49987f.onPreviewProgress(M0, oVar2.j());
                            oVar2.f49989i.postDelayed(oVar2.F, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        this.F = new Runnable(this) {
            public final o f49960b;

            {
                this.f49960b = this;
            }

            @Override
            public final void run() {
                j0 j0Var;
                switch (r2) {
                    case 0:
                        o oVar = this.f49960b;
                        if (oVar.f49994n == m.f49978c && !oVar.f50003x) {
                            oVar.f50003x = true;
                            b bVar2 = oVar.h;
                            bVar2.b("maximum duration reached: durationMs=" + oVar.j());
                            oVar.f49987f.onMaximumDurationReached();
                            oVar.m();
                            return;
                        }
                        return;
                    default:
                        o oVar2 = this.f49960b;
                        if (oVar2.f49994n == m.e && (j0Var = oVar2.B) != null && oVar2.v) {
                            long M0 = j0Var.M0();
                            long j10 = oVar2.f49999s;
                            if (M0 < j10 || M0 >= oVar2.f50000t) {
                                oVar2.B.Z0(5, j10);
                                M0 = oVar2.f49999s;
                            }
                            oVar2.f49987f.onPreviewProgress(M0, oVar2.j());
                            oVar2.f49989i.postDelayed(oVar2.F, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        bVar.b("session created: device=" + Build.MANUFACTURER + " " + Build.MODEL + ", sdk=" + Build.VERSION.SDK_INT + ", sampleRate=48000, noiseSuppression=" + hVar + ", minimumDurationMs=700, maximumDurationMs=0");
    }

    public static void p() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("AudioRecordingSession must be used on the main thread");
    }

    public static long q(long j10) {
        return (j10 * 1000) / 48000;
    }

    public final void a(i iVar, long j10) {
        if (j10 <= 0) {
            return;
        }
        synchronized (this.f49992l) {
            try {
                if (iVar.d && !iVar.e) {
                    long j11 = iVar.f49969c;
                    if (j10 > j11) {
                        iVar.f49969c = j10;
                        this.f49991k.execute(new c(this, iVar, j11, j10 - j11, 1));
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        p();
        m mVar = this.f49994n;
        m mVar2 = m.f49982s;
        if (mVar != mVar2 && mVar != m.f49980n) {
            this.h.b("cancel requested: state=" + this.f49994n);
            d dVar = this.E;
            Handler handler = this.f49989i;
            handler.removeCallbacks(dVar);
            handler.removeCallbacks(this.F);
            o();
            k(j.f49971b);
            r(mVar2);
            org.telegram.utils.recorder.audio.d dVar2 = this.f49995o;
            if (dVar2 != null) {
                dVar2.d();
                return;
            }
            c();
            s();
        }
    }

    public final void c() {
        File file;
        if (this.f50004y) {
            return;
        }
        this.f50004y = true;
        l lVar = this.D;
        if (lVar == null) {
            file = null;
        } else {
            file = lVar.f49973a;
        }
        s9.g gVar = new s9.g(18, this, file);
        try {
            this.f49990j.execute(gVar);
        } catch (RejectedExecutionException unused) {
            gVar.run();
        }
    }

    public final i d() {
        File f7 = f();
        long j10 = this.f50001u;
        this.f50001u = 1 + j10;
        i iVar = new i(j10, f7);
        synchronized (this.f49992l) {
            this.A = iVar;
            this.f49991k.execute(new oy0(this, iVar, f7, 17));
        }
        b bVar = this.h;
        StringBuilder t10 = a1.g.t(j10, "output generation started: id=", ", file=");
        t10.append(f7.getName());
        bVar.b(t10.toString());
        return iVar;
    }

    public final n e() {
        return new n(this.f49994n);
    }

    public final File f() {
        File file = this.f49985b;
        File file2 = new File(file, "audio_recording_voice_" + System.currentTimeMillis() + "_" + I.getAndIncrement() + ".ogg");
        synchronized (this.f49993m) {
            this.f49993m.add(file2);
        }
        return file2;
    }

    public final void g(Exception exc) {
        m mVar = this.f49994n;
        m mVar2 = m.f49981r;
        if (mVar != mVar2 && mVar != m.f49982s && mVar != m.f49980n) {
            b bVar = this.h;
            bVar.a("fatal error in state=" + this.f49994n, exc);
            Handler handler = this.f49989i;
            handler.removeCallbacks(this.E);
            handler.removeCallbacks(this.F);
            o();
            k(j.f49972c);
            r(mVar2);
            i iVar = this.A;
            if (iVar != null) {
                this.f49991k.execute(new oy0(this, iVar, exc, 18));
            }
            this.f49987f.onError(exc);
            org.telegram.utils.recorder.audio.d dVar = this.f49995o;
            if (dVar != null) {
                dVar.d();
            } else {
                c();
                s();
            }
            l("error");
        }
    }

    public final void h() {
        m mVar = m.h;
        p();
        m mVar2 = this.f49994n;
        m mVar3 = m.f49978c;
        if (mVar2 != mVar3 && mVar2 != m.e) {
            return;
        }
        b bVar = this.h;
        bVar.b("finish requested: state=" + this.f49994n + ", durationMs=" + j() + ", trim=" + this.f49999s + ".." + this.f50000t);
        if (this.f49994n == mVar3) {
            this.f50002w = true;
            this.f49989i.removeCallbacks(this.E);
            r(mVar);
            this.f49995o.d();
            return;
        }
        o();
        r(mVar);
        final i iVar = this.A;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long q5 = q(this.f49997q);
        final long j10 = this.f49999s;
        if (j10 == 0 && this.f50000t == q5) {
            i();
            return;
        }
        final long j11 = this.f50000t;
        k(j.f49970a);
        final i d = d();
        this.f49990j.execute(new Runnable() {
            @Override
            public final void run() {
                String str;
                i iVar2 = iVar;
                i iVar3 = d;
                long j12 = j10;
                long j13 = j11;
                o oVar = o.this;
                Handler handler = oVar.f49989i;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String absolutePath = iVar2.f49968b.getAbsolutePath();
                    File file = iVar3.f49968b;
                    String absolutePath2 = file.getAbsolutePath();
                    try {
                        if (AudioRecorderNative.b(absolutePath, absolutePath2, j12, j13)) {
                            ui.b bVar2 = oVar.h;
                            bVar2.b("final trim completed: source=" + iVar2.f49968b.getName() + ", output=" + file.getName() + ", trim=" + j12 + ".." + j13 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            oVar.a(iVar3, file.length());
                            handler.post(new ko(oVar, j13, j12, 2));
                            return;
                        }
                        throw new IllegalStateException("Unable to trim final Opus output");
                    } catch (Throwable th2) {
                        th = th2;
                        str = absolutePath2;
                        handler.post(new g(17, str, th));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = oVar;
                }
            }
        });
    }

    public final void i() {
        if (this.f49994n != m.h) {
            return;
        }
        i iVar = this.A;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long j10 = j();
        if (j10 < this.f49986c) {
            b bVar = this.h;
            bVar.b("recording rejected as too short: durationMs=" + j10);
            this.f49987f.onRecordingTooShort(j10);
            k(j.f49971b);
            r(m.f49982s);
            c();
            s();
            l("too_short");
            return;
        }
        this.f49990j.execute(new org.telegram.utils.recorder.audio.b(j10, iVar, this));
    }

    public final long j() {
        p();
        return q(this.f49997q + this.f49998r);
    }

    public final void k(j jVar) {
        synchronized (this.f49992l) {
            i iVar = this.A;
            if (iVar != null && iVar.d && !iVar.e) {
                iVar.d = false;
                this.f49991k.execute(new oy0(this, iVar, jVar, 19));
                b bVar = this.h;
                bVar.b("output generation invalidated: id=" + iVar.f49967a + ", reason=" + jVar);
            }
        }
    }

    public final void l(String str) {
        if (this.f50005z) {
            return;
        }
        this.f50005z = true;
        StringBuilder v = a1.g.v("session summary: terminal=", str, ", durationMs=");
        v.append(q(this.f49997q + this.f49998r));
        v.append(", generations=");
        v.append(this.f50001u - 1);
        this.h.b(v.toString());
    }

    public final boolean m() {
        p();
        if (this.f49994n == m.f49978c && this.f49995o != null) {
            this.h.b("pause requested: durationMs=" + j());
            this.f49989i.removeCallbacks(this.E);
            r(m.d);
            this.f49995o.d();
            return true;
        }
        return false;
    }

    public final void n() {
        p();
        m mVar = this.f49994n;
        m mVar2 = m.f49982s;
        if (mVar == mVar2) {
            return;
        }
        if (mVar != m.f49980n) {
            b();
            return;
        }
        o();
        c();
        r(mVar2);
        l("released");
    }

    public final void o() {
        this.f49989i.removeCallbacks(this.F);
        this.v = false;
        j0 j0Var = this.B;
        if (j0Var != null) {
            j0Var.C(this.G);
            this.B.X0();
            this.B = null;
        }
    }

    public final void r(m mVar) {
        m mVar2 = this.f49994n;
        if (mVar2 == mVar) {
            return;
        }
        this.f49994n = mVar;
        this.h.b("state: " + mVar2 + " -> " + mVar + ", durationMs=" + q(this.f49997q + this.f49998r));
        this.f49987f.onStateChanged(e());
    }

    public final void s() {
        this.f49990j.shutdown();
        this.f49991k.shutdown();
    }

    public final void t(long j10, long j11, File file) {
        long j12 = this.f49996p + 1;
        this.f49996p = j12;
        i iVar = this.A;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.d dVar = new org.telegram.utils.recorder.audio.d(iVar.f49968b, file, j10, j11, this.d, this.h, new dc.e(j12, iVar, this));
        this.f49995o = dVar;
        this.f49998r = 0L;
        dVar.f46449k.post(new Runnable() {
            @Override
            public final void run() {
                String str;
                d dVar2 = d.this;
                File file2 = dVar2.f46443b;
                ui.b bVar = dVar2.f46445f;
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a2 = AudioRecorderNative.a(dVar2.f46442a, dVar2.f46444c, dVar2.d, dVar2.f46443b);
                    dVar2.f46458t = a2;
                    if (a2 != null) {
                        if (dVar2.e == h.f49965b) {
                            AudioNoiseSuppressor a10 = AudioNoiseSuppressor.a();
                            dVar2.f46459u = a10;
                            if (a10 == null) {
                                bVar.b("RNNoise unavailable; recording unprocessed PCM");
                            } else {
                                bVar.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
                            }
                        }
                        long d = dVar2.f46458t.d();
                        StringBuilder sb2 = new StringBuilder("Opus encoder started: prefix=");
                        if (file2 == null) {
                            str = "none";
                        } else {
                            str = file2.getName() + " " + dVar2.f46444c + ".." + dVar2.d;
                        }
                        sb2.append(str);
                        sb2.append(", initialBytes=");
                        sb2.append(d);
                        sb2.append(", queuedChunks=");
                        sb2.append(dVar2.f46451m.get());
                        sb2.append(", elapsedMs=");
                        sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                        bVar.b(sb2.toString());
                        dVar2.f46461x = SystemClock.elapsedRealtime();
                        if (d > 0) {
                            dc.e eVar = dVar2.f46446g;
                            ((o) eVar.f8321c).a((i) eVar.f8320b, d);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Unable to initialize native Opus recorder");
                } catch (Throwable th2) {
                    if (dVar2.v == null) {
                        dVar2.f46445f.a("encoding failed", th2);
                        dVar2.v = d.a(th2);
                        dVar2.f46452n = true;
                    }
                }
            }
        });
        dVar.f46447i.post(new a(dVar, 0));
    }
}
