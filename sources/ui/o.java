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
import org.telegram.ui.Components.ny0;
import org.telegram.ui.io;
import sg.u;
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
    public final Context f49949a;
    public final File f49950b;
    public final long f49951c;
    public final h d;
    public final boolean e;
    public final f f49952f;
    public final k f49953g;
    public final b h;
    public org.telegram.utils.recorder.audio.d f49960o;
    public long f49961p;
    public long f49962q;
    public long f49963r;
    public long f49964s;
    public long f49965t;
    public boolean v;
    public boolean f49967w;
    public boolean f49968x;
    public boolean f49969y;
    public boolean f49970z;
    public final Handler f49954i = new Handler(Looper.getMainLooper());
    public final ExecutorService f49955j = Executors.newSingleThreadExecutor(new l0(7));
    public final ExecutorService f49956k = Executors.newSingleThreadExecutor(new l0(8));
    public final Object f49957l = new Object();
    public final ArrayList f49958m = new ArrayList();
    public m f49959n = m.f49941a;
    public long f49966u = 1;
    public final z G = new z(this, 2);

    public o(p4 p4Var) {
        p();
        Context context = (Context) p4Var.f8901b;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.f49949a = context;
        File file = (File) p4Var.f8902c;
        this.f49950b = file == null ? context.getCacheDir() : file;
        this.f49951c = 700L;
        h hVar = (h) p4Var.d;
        this.d = hVar;
        this.e = p4Var.f8900a;
        this.f49952f = (f) p4Var.e;
        this.f49953g = (k) p4Var.f8903f;
        b bVar = new b((g) p4Var.f8904g);
        this.h = bVar;
        this.E = new Runnable(this) {
            public final o f49925b;

            {
                this.f49925b = this;
            }

            @Override
            public final void run() {
                j0 j0Var;
                switch (r2) {
                    case 0:
                        o oVar = this.f49925b;
                        if (oVar.f49959n == m.f49943c && !oVar.f49968x) {
                            oVar.f49968x = true;
                            b bVar2 = oVar.h;
                            bVar2.b("maximum duration reached: durationMs=" + oVar.j());
                            oVar.f49952f.onMaximumDurationReached();
                            oVar.m();
                            return;
                        }
                        return;
                    default:
                        o oVar2 = this.f49925b;
                        if (oVar2.f49959n == m.e && (j0Var = oVar2.B) != null && oVar2.v) {
                            long M0 = j0Var.M0();
                            long j10 = oVar2.f49964s;
                            if (M0 < j10 || M0 >= oVar2.f49965t) {
                                oVar2.B.Z0(5, j10);
                                M0 = oVar2.f49964s;
                            }
                            oVar2.f49952f.onPreviewProgress(M0, oVar2.j());
                            oVar2.f49954i.postDelayed(oVar2.F, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        this.F = new Runnable(this) {
            public final o f49925b;

            {
                this.f49925b = this;
            }

            @Override
            public final void run() {
                j0 j0Var;
                switch (r2) {
                    case 0:
                        o oVar = this.f49925b;
                        if (oVar.f49959n == m.f49943c && !oVar.f49968x) {
                            oVar.f49968x = true;
                            b bVar2 = oVar.h;
                            bVar2.b("maximum duration reached: durationMs=" + oVar.j());
                            oVar.f49952f.onMaximumDurationReached();
                            oVar.m();
                            return;
                        }
                        return;
                    default:
                        o oVar2 = this.f49925b;
                        if (oVar2.f49959n == m.e && (j0Var = oVar2.B) != null && oVar2.v) {
                            long M0 = j0Var.M0();
                            long j10 = oVar2.f49964s;
                            if (M0 < j10 || M0 >= oVar2.f49965t) {
                                oVar2.B.Z0(5, j10);
                                M0 = oVar2.f49964s;
                            }
                            oVar2.f49952f.onPreviewProgress(M0, oVar2.j());
                            oVar2.f49954i.postDelayed(oVar2.F, 32L);
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
        synchronized (this.f49957l) {
            try {
                if (iVar.d && !iVar.e) {
                    long j11 = iVar.f49934c;
                    if (j10 > j11) {
                        iVar.f49934c = j10;
                        this.f49956k.execute(new c(this, iVar, j11, j10 - j11, 1));
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        p();
        m mVar = this.f49959n;
        m mVar2 = m.f49947s;
        if (mVar != mVar2 && mVar != m.f49945n) {
            this.h.b("cancel requested: state=" + this.f49959n);
            d dVar = this.E;
            Handler handler = this.f49954i;
            handler.removeCallbacks(dVar);
            handler.removeCallbacks(this.F);
            o();
            k(j.f49936b);
            r(mVar2);
            org.telegram.utils.recorder.audio.d dVar2 = this.f49960o;
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
        if (this.f49969y) {
            return;
        }
        this.f49969y = true;
        l lVar = this.D;
        if (lVar == null) {
            file = null;
        } else {
            file = lVar.f49938a;
        }
        u uVar = new u(17, this, file);
        try {
            this.f49955j.execute(uVar);
        } catch (RejectedExecutionException unused) {
            uVar.run();
        }
    }

    public final i d() {
        File f7 = f();
        long j10 = this.f49966u;
        this.f49966u = 1 + j10;
        i iVar = new i(j10, f7);
        synchronized (this.f49957l) {
            this.A = iVar;
            this.f49956k.execute(new ny0(this, iVar, f7, 17));
        }
        b bVar = this.h;
        StringBuilder t10 = a1.g.t(j10, "output generation started: id=", ", file=");
        t10.append(f7.getName());
        bVar.b(t10.toString());
        return iVar;
    }

    public final n e() {
        return new n(this.f49959n);
    }

    public final File f() {
        File file = this.f49950b;
        File file2 = new File(file, "audio_recording_voice_" + System.currentTimeMillis() + "_" + I.getAndIncrement() + ".ogg");
        synchronized (this.f49958m) {
            this.f49958m.add(file2);
        }
        return file2;
    }

    public final void g(Exception exc) {
        m mVar = this.f49959n;
        m mVar2 = m.f49946r;
        if (mVar != mVar2 && mVar != m.f49947s && mVar != m.f49945n) {
            b bVar = this.h;
            bVar.a("fatal error in state=" + this.f49959n, exc);
            Handler handler = this.f49954i;
            handler.removeCallbacks(this.E);
            handler.removeCallbacks(this.F);
            o();
            k(j.f49937c);
            r(mVar2);
            i iVar = this.A;
            if (iVar != null) {
                this.f49956k.execute(new ny0(this, iVar, exc, 18));
            }
            this.f49952f.onError(exc);
            org.telegram.utils.recorder.audio.d dVar = this.f49960o;
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
        m mVar2 = this.f49959n;
        m mVar3 = m.f49943c;
        if (mVar2 != mVar3 && mVar2 != m.e) {
            return;
        }
        b bVar = this.h;
        bVar.b("finish requested: state=" + this.f49959n + ", durationMs=" + j() + ", trim=" + this.f49964s + ".." + this.f49965t);
        if (this.f49959n == mVar3) {
            this.f49967w = true;
            this.f49954i.removeCallbacks(this.E);
            r(mVar);
            this.f49960o.d();
            return;
        }
        o();
        r(mVar);
        final i iVar = this.A;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long q5 = q(this.f49962q);
        final long j10 = this.f49964s;
        if (j10 == 0 && this.f49965t == q5) {
            i();
            return;
        }
        final long j11 = this.f49965t;
        k(j.f49935a);
        final i d = d();
        this.f49955j.execute(new Runnable() {
            @Override
            public final void run() {
                String str;
                i iVar2 = iVar;
                i iVar3 = d;
                long j12 = j10;
                long j13 = j11;
                o oVar = o.this;
                Handler handler = oVar.f49954i;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String absolutePath = iVar2.f49933b.getAbsolutePath();
                    File file = iVar3.f49933b;
                    String absolutePath2 = file.getAbsolutePath();
                    try {
                        if (AudioRecorderNative.b(absolutePath, absolutePath2, j12, j13)) {
                            ui.b bVar2 = oVar.h;
                            bVar2.b("final trim completed: source=" + iVar2.f49933b.getName() + ", output=" + file.getName() + ", trim=" + j12 + ".." + j13 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            oVar.a(iVar3, file.length());
                            handler.post(new io(oVar, j13, j12, 2));
                            return;
                        }
                        throw new IllegalStateException("Unable to trim final Opus output");
                    } catch (Throwable th2) {
                        th = th2;
                        str = absolutePath2;
                        handler.post(new u(16, str, th));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = oVar;
                }
            }
        });
    }

    public final void i() {
        if (this.f49959n != m.h) {
            return;
        }
        i iVar = this.A;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long j10 = j();
        if (j10 < this.f49951c) {
            b bVar = this.h;
            bVar.b("recording rejected as too short: durationMs=" + j10);
            this.f49952f.onRecordingTooShort(j10);
            k(j.f49936b);
            r(m.f49947s);
            c();
            s();
            l("too_short");
            return;
        }
        this.f49955j.execute(new org.telegram.utils.recorder.audio.b(j10, iVar, this));
    }

    public final long j() {
        p();
        return q(this.f49962q + this.f49963r);
    }

    public final void k(j jVar) {
        synchronized (this.f49957l) {
            i iVar = this.A;
            if (iVar != null && iVar.d && !iVar.e) {
                iVar.d = false;
                this.f49956k.execute(new ny0(this, iVar, jVar, 19));
                b bVar = this.h;
                bVar.b("output generation invalidated: id=" + iVar.f49932a + ", reason=" + jVar);
            }
        }
    }

    public final void l(String str) {
        if (this.f49970z) {
            return;
        }
        this.f49970z = true;
        StringBuilder v = a1.g.v("session summary: terminal=", str, ", durationMs=");
        v.append(q(this.f49962q + this.f49963r));
        v.append(", generations=");
        v.append(this.f49966u - 1);
        this.h.b(v.toString());
    }

    public final boolean m() {
        p();
        if (this.f49959n == m.f49943c && this.f49960o != null) {
            this.h.b("pause requested: durationMs=" + j());
            this.f49954i.removeCallbacks(this.E);
            r(m.d);
            this.f49960o.d();
            return true;
        }
        return false;
    }

    public final void n() {
        p();
        m mVar = this.f49959n;
        m mVar2 = m.f49947s;
        if (mVar == mVar2) {
            return;
        }
        if (mVar != m.f49945n) {
            b();
            return;
        }
        o();
        c();
        r(mVar2);
        l("released");
    }

    public final void o() {
        this.f49954i.removeCallbacks(this.F);
        this.v = false;
        j0 j0Var = this.B;
        if (j0Var != null) {
            j0Var.C(this.G);
            this.B.X0();
            this.B = null;
        }
    }

    public final void r(m mVar) {
        m mVar2 = this.f49959n;
        if (mVar2 == mVar) {
            return;
        }
        this.f49959n = mVar;
        this.h.b("state: " + mVar2 + " -> " + mVar + ", durationMs=" + q(this.f49962q + this.f49963r));
        this.f49952f.onStateChanged(e());
    }

    public final void s() {
        this.f49955j.shutdown();
        this.f49956k.shutdown();
    }

    public final void t(long j10, long j11, File file) {
        long j12 = this.f49961p + 1;
        this.f49961p = j12;
        i iVar = this.A;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.d dVar = new org.telegram.utils.recorder.audio.d(iVar.f49933b, file, j10, j11, this.d, this.h, new dc.e(j12, iVar, this));
        this.f49960o = dVar;
        this.f49963r = 0L;
        dVar.f46414k.post(new Runnable() {
            @Override
            public final void run() {
                String str;
                d dVar2 = d.this;
                File file2 = dVar2.f46408b;
                ui.b bVar = dVar2.f46410f;
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a2 = AudioRecorderNative.a(dVar2.f46407a, dVar2.f46409c, dVar2.d, dVar2.f46408b);
                    dVar2.f46423t = a2;
                    if (a2 != null) {
                        if (dVar2.e == h.f49930b) {
                            AudioNoiseSuppressor a10 = AudioNoiseSuppressor.a();
                            dVar2.f46424u = a10;
                            if (a10 == null) {
                                bVar.b("RNNoise unavailable; recording unprocessed PCM");
                            } else {
                                bVar.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
                            }
                        }
                        long d = dVar2.f46423t.d();
                        StringBuilder sb2 = new StringBuilder("Opus encoder started: prefix=");
                        if (file2 == null) {
                            str = "none";
                        } else {
                            str = file2.getName() + " " + dVar2.f46409c + ".." + dVar2.d;
                        }
                        sb2.append(str);
                        sb2.append(", initialBytes=");
                        sb2.append(d);
                        sb2.append(", queuedChunks=");
                        sb2.append(dVar2.f46416m.get());
                        sb2.append(", elapsedMs=");
                        sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                        bVar.b(sb2.toString());
                        dVar2.f46426x = SystemClock.elapsedRealtime();
                        if (d > 0) {
                            dc.e eVar = dVar2.f46411g;
                            ((o) eVar.f8321c).a((i) eVar.f8320b, d);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Unable to initialize native Opus recorder");
                } catch (Throwable th2) {
                    if (dVar2.v == null) {
                        dVar2.f46410f.a("encoding failed", th2);
                        dVar2.v = d.a(th2);
                        dVar2.f46417n = true;
                    }
                }
            }
        });
        dVar.f46412i.post(new a(dVar, 0));
    }
}
