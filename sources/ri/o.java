package ri;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import ci.o4;
import e2.l0;
import e2.z;
import i2.h0;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.go;
import ri.h;
import ri.i;
import ri.o;
public final class o {
    public static final pb.a H = new pb.a(22);
    public static final AtomicLong I = new AtomicLong(1);
    public volatile i A;
    public h0 B;
    public byte[] C;
    public l D;
    public final d E;
    public final d F;
    public final Context f46257a;
    public final File f46258b;
    public final long f46259c;
    public final h d;
    public final boolean e;
    public final f f46260f;
    public final k f46261g;
    public final b h;
    public org.telegram.utils.recorder.audio.d f46268o;
    public long f46269p;
    public long f46270q;
    public long f46271r;
    public long f46272s;
    public long f46273t;
    public boolean v;
    public boolean f46275w;
    public boolean f46276x;
    public boolean f46277y;
    public boolean f46278z;
    public final Handler f46262i = new Handler(Looper.getMainLooper());
    public final ExecutorService f46263j = Executors.newSingleThreadExecutor(new l0(6));
    public final ExecutorService f46264k = Executors.newSingleThreadExecutor(new l0(7));
    public final Object f46265l = new Object();
    public final ArrayList f46266m = new ArrayList();
    public m f46267n = m.f46249a;
    public long f46274u = 1;
    public final z G = new z(this, 2);

    public o(o4 o4Var) {
        p();
        Context context = (Context) o4Var.f5632b;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.f46257a = context;
        File file = (File) o4Var.f5633c;
        this.f46258b = file == null ? context.getCacheDir() : file;
        this.f46259c = 700L;
        h hVar = (h) o4Var.d;
        this.d = hVar;
        this.e = o4Var.f5631a;
        this.f46260f = (f) o4Var.e;
        this.f46261g = (k) o4Var.f5634f;
        b bVar = new b((g) o4Var.f5635g);
        this.h = bVar;
        this.E = new Runnable(this) {
            public final o f46233b;

            {
                this.f46233b = this;
            }

            @Override
            public final void run() {
                h0 h0Var;
                switch (r2) {
                    case 0:
                        o oVar = this.f46233b;
                        if (oVar.f46267n == m.f46251c && !oVar.f46276x) {
                            oVar.f46276x = true;
                            b bVar2 = oVar.h;
                            bVar2.b("maximum duration reached: durationMs=" + oVar.j());
                            oVar.f46260f.onMaximumDurationReached();
                            oVar.m();
                            return;
                        }
                        return;
                    default:
                        o oVar2 = this.f46233b;
                        if (oVar2.f46267n == m.e && (h0Var = oVar2.B) != null && oVar2.v) {
                            long M0 = h0Var.M0();
                            long j10 = oVar2.f46272s;
                            if (M0 < j10 || M0 >= oVar2.f46273t) {
                                oVar2.B.Z0(5, j10);
                                M0 = oVar2.f46272s;
                            }
                            oVar2.f46260f.onPreviewProgress(M0, oVar2.j());
                            oVar2.f46262i.postDelayed(oVar2.F, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        this.F = new Runnable(this) {
            public final o f46233b;

            {
                this.f46233b = this;
            }

            @Override
            public final void run() {
                h0 h0Var;
                switch (r2) {
                    case 0:
                        o oVar = this.f46233b;
                        if (oVar.f46267n == m.f46251c && !oVar.f46276x) {
                            oVar.f46276x = true;
                            b bVar2 = oVar.h;
                            bVar2.b("maximum duration reached: durationMs=" + oVar.j());
                            oVar.f46260f.onMaximumDurationReached();
                            oVar.m();
                            return;
                        }
                        return;
                    default:
                        o oVar2 = this.f46233b;
                        if (oVar2.f46267n == m.e && (h0Var = oVar2.B) != null && oVar2.v) {
                            long M0 = h0Var.M0();
                            long j10 = oVar2.f46272s;
                            if (M0 < j10 || M0 >= oVar2.f46273t) {
                                oVar2.B.Z0(5, j10);
                                M0 = oVar2.f46272s;
                            }
                            oVar2.f46260f.onPreviewProgress(M0, oVar2.j());
                            oVar2.f46262i.postDelayed(oVar2.F, 32L);
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
        synchronized (this.f46265l) {
            try {
                if (iVar.d && !iVar.e) {
                    long j11 = iVar.f46242c;
                    if (j10 > j11) {
                        iVar.f46242c = j10;
                        this.f46264k.execute(new c(this, iVar, j11, j10 - j11, 1));
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        p();
        m mVar = this.f46267n;
        m mVar2 = m.f46255s;
        if (mVar != mVar2 && mVar != m.f46253n) {
            this.h.b("cancel requested: state=" + this.f46267n);
            d dVar = this.E;
            Handler handler = this.f46262i;
            handler.removeCallbacks(dVar);
            handler.removeCallbacks(this.F);
            o();
            k(j.f46244b);
            r(mVar2);
            org.telegram.utils.recorder.audio.d dVar2 = this.f46268o;
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
        if (this.f46277y) {
            return;
        }
        this.f46277y = true;
        l lVar = this.D;
        if (lVar == null) {
            file = null;
        } else {
            file = lVar.f46246a;
        }
        p2.b bVar = new p2.b(16, this, file);
        try {
            this.f46263j.execute(bVar);
        } catch (RejectedExecutionException unused) {
            bVar.run();
        }
    }

    public final i d() {
        File f7 = f();
        long j10 = this.f46274u;
        this.f46274u = 1 + j10;
        i iVar = new i(j10, f7);
        synchronized (this.f46265l) {
            this.A = iVar;
            this.f46264k.execute(new fy0(this, iVar, f7, 17));
        }
        b bVar = this.h;
        StringBuilder t10 = a1.g.t(j10, "output generation started: id=", ", file=");
        t10.append(f7.getName());
        bVar.b(t10.toString());
        return iVar;
    }

    public final n e() {
        return new n(this.f46267n);
    }

    public final File f() {
        File file = this.f46258b;
        File file2 = new File(file, "audio_recording_voice_" + System.currentTimeMillis() + "_" + I.getAndIncrement() + ".ogg");
        synchronized (this.f46266m) {
            this.f46266m.add(file2);
        }
        return file2;
    }

    public final void g(Exception exc) {
        m mVar = this.f46267n;
        m mVar2 = m.f46254r;
        if (mVar != mVar2 && mVar != m.f46255s && mVar != m.f46253n) {
            b bVar = this.h;
            bVar.a("fatal error in state=" + this.f46267n, exc);
            Handler handler = this.f46262i;
            handler.removeCallbacks(this.E);
            handler.removeCallbacks(this.F);
            o();
            k(j.f46245c);
            r(mVar2);
            i iVar = this.A;
            if (iVar != null) {
                this.f46264k.execute(new fy0(this, iVar, exc, 18));
            }
            this.f46260f.onError(exc);
            org.telegram.utils.recorder.audio.d dVar = this.f46268o;
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
        m mVar2 = this.f46267n;
        m mVar3 = m.f46251c;
        if (mVar2 != mVar3 && mVar2 != m.e) {
            return;
        }
        b bVar = this.h;
        bVar.b("finish requested: state=" + this.f46267n + ", durationMs=" + j() + ", trim=" + this.f46272s + ".." + this.f46273t);
        if (this.f46267n == mVar3) {
            this.f46275w = true;
            this.f46262i.removeCallbacks(this.E);
            r(mVar);
            this.f46268o.d();
            return;
        }
        o();
        r(mVar);
        final i iVar = this.A;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long q6 = q(this.f46270q);
        final long j10 = this.f46272s;
        if (j10 == 0 && this.f46273t == q6) {
            i();
            return;
        }
        final long j11 = this.f46273t;
        k(j.f46243a);
        final i d = d();
        this.f46263j.execute(new Runnable() {
            @Override
            public final void run() {
                String str;
                i iVar2 = iVar;
                i iVar3 = d;
                long j12 = j10;
                long j13 = j11;
                o oVar = o.this;
                Handler handler = oVar.f46262i;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String absolutePath = iVar2.f46241b.getAbsolutePath();
                    File file = iVar3.f46241b;
                    String absolutePath2 = file.getAbsolutePath();
                    try {
                        if (AudioRecorderNative.b(absolutePath, absolutePath2, j12, j13)) {
                            ri.b bVar2 = oVar.h;
                            bVar2.b("final trim completed: source=" + iVar2.f46241b.getName() + ", output=" + file.getName() + ", trim=" + j12 + ".." + j13 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            oVar.a(iVar3, file.length());
                            handler.post(new go(oVar, j13, j12, 2));
                            return;
                        }
                        throw new IllegalStateException("Unable to trim final Opus output");
                    } catch (Throwable th2) {
                        th = th2;
                        str = absolutePath2;
                        handler.post(new p2.b(15, str, th));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = oVar;
                }
            }
        });
    }

    public final void i() {
        if (this.f46267n != m.h) {
            return;
        }
        i iVar = this.A;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long j10 = j();
        if (j10 < this.f46259c) {
            b bVar = this.h;
            bVar.b("recording rejected as too short: durationMs=" + j10);
            this.f46260f.onRecordingTooShort(j10);
            k(j.f46244b);
            r(m.f46255s);
            c();
            s();
            l("too_short");
            return;
        }
        this.f46263j.execute(new org.telegram.utils.recorder.audio.b(j10, iVar, this));
    }

    public final long j() {
        p();
        return q(this.f46270q + this.f46271r);
    }

    public final void k(j jVar) {
        synchronized (this.f46265l) {
            i iVar = this.A;
            if (iVar != null && iVar.d && !iVar.e) {
                iVar.d = false;
                this.f46264k.execute(new fy0(this, iVar, jVar, 19));
                b bVar = this.h;
                bVar.b("output generation invalidated: id=" + iVar.f46240a + ", reason=" + jVar);
            }
        }
    }

    public final void l(String str) {
        if (this.f46278z) {
            return;
        }
        this.f46278z = true;
        StringBuilder v = a1.g.v("session summary: terminal=", str, ", durationMs=");
        v.append(q(this.f46270q + this.f46271r));
        v.append(", generations=");
        v.append(this.f46274u - 1);
        this.h.b(v.toString());
    }

    public final boolean m() {
        p();
        if (this.f46267n == m.f46251c && this.f46268o != null) {
            this.h.b("pause requested: durationMs=" + j());
            this.f46262i.removeCallbacks(this.E);
            r(m.d);
            this.f46268o.d();
            return true;
        }
        return false;
    }

    public final void n() {
        p();
        m mVar = this.f46267n;
        m mVar2 = m.f46255s;
        if (mVar == mVar2) {
            return;
        }
        if (mVar != m.f46253n) {
            b();
            return;
        }
        o();
        c();
        r(mVar2);
        l("released");
    }

    public final void o() {
        this.f46262i.removeCallbacks(this.F);
        this.v = false;
        h0 h0Var = this.B;
        if (h0Var != null) {
            h0Var.C(this.G);
            this.B.X0();
            this.B = null;
        }
    }

    public final void r(m mVar) {
        m mVar2 = this.f46267n;
        if (mVar2 == mVar) {
            return;
        }
        this.f46267n = mVar;
        this.h.b("state: " + mVar2 + " -> " + mVar + ", durationMs=" + q(this.f46270q + this.f46271r));
        this.f46260f.onStateChanged(e());
    }

    public final void s() {
        this.f46263j.shutdown();
        this.f46264k.shutdown();
    }

    public final void t(long j10, long j11, File file) {
        long j12 = this.f46269p + 1;
        this.f46269p = j12;
        i iVar = this.A;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.d dVar = new org.telegram.utils.recorder.audio.d(iVar.f46241b, file, j10, j11, this.d, this.h, new cc.e(j12, iVar, this));
        this.f46268o = dVar;
        this.f46271r = 0L;
        dVar.f44269k.post(new Runnable() {
            @Override
            public final void run() {
                String str;
                d dVar2 = d.this;
                File file2 = dVar2.f44263b;
                ri.b bVar = dVar2.f44265f;
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a2 = AudioRecorderNative.a(dVar2.f44262a, dVar2.f44264c, dVar2.d, dVar2.f44263b);
                    dVar2.f44278t = a2;
                    if (a2 != null) {
                        if (dVar2.e == h.f46238b) {
                            AudioNoiseSuppressor a10 = AudioNoiseSuppressor.a();
                            dVar2.f44279u = a10;
                            if (a10 == null) {
                                bVar.b("RNNoise unavailable; recording unprocessed PCM");
                            } else {
                                bVar.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
                            }
                        }
                        long d = dVar2.f44278t.d();
                        StringBuilder sb2 = new StringBuilder("Opus encoder started: prefix=");
                        if (file2 == null) {
                            str = "none";
                        } else {
                            str = file2.getName() + " " + dVar2.f44264c + ".." + dVar2.d;
                        }
                        sb2.append(str);
                        sb2.append(", initialBytes=");
                        sb2.append(d);
                        sb2.append(", queuedChunks=");
                        sb2.append(dVar2.f44271m.get());
                        sb2.append(", elapsedMs=");
                        sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                        bVar.b(sb2.toString());
                        dVar2.f44281x = SystemClock.elapsedRealtime();
                        if (d > 0) {
                            cc.e eVar = dVar2.f44266g;
                            ((o) eVar.f5098c).a((i) eVar.f5097b, d);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Unable to initialize native Opus recorder");
                } catch (Throwable th2) {
                    if (dVar2.v == null) {
                        dVar2.f44265f.a("encoding failed", th2);
                        dVar2.v = d.a(th2);
                        dVar2.f44272n = true;
                    }
                }
            }
        });
        dVar.f44267i.post(new a(dVar, 0));
    }
}
