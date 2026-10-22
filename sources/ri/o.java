package ri;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import ci.p4;
import e2.l0;
import e2.z;
import i2.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.eo;
import ri.h;
import ri.i;
import ri.o;
public final class o {
    public static final pb.a H = new pb.a(22);
    public static final AtomicLong I = new AtomicLong(1);
    public volatile i A;
    public i0 B;
    public byte[] C;
    public l D;
    public final d E;
    public final d F;
    public final Context f45835a;
    public final File f45836b;
    public final long f45837c;
    public final h d;
    public final boolean e;
    public final f f45838f;
    public final k f45839g;
    public final b h;
    public org.telegram.utils.recorder.audio.d f45846o;
    public long f45847p;
    public long f45848q;
    public long f45849r;
    public long f45850s;
    public long f45851t;
    public boolean v;
    public boolean f45853w;
    public boolean f45854x;
    public boolean f45855y;
    public boolean f45856z;
    public final Handler f45840i = new Handler(Looper.getMainLooper());
    public final ExecutorService f45841j = Executors.newSingleThreadExecutor(new l0(6));
    public final ExecutorService f45842k = Executors.newSingleThreadExecutor(new l0(7));
    public final Object f45843l = new Object();
    public final ArrayList f45844m = new ArrayList();
    public m f45845n = m.f45827a;
    public long f45852u = 1;
    public final z G = new z(this, 2);

    public o(p4 p4Var) {
        p();
        Context context = (Context) p4Var.f5726b;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.f45835a = context;
        File file = (File) p4Var.f5727c;
        this.f45836b = file == null ? context.getCacheDir() : file;
        this.f45837c = 700L;
        h hVar = (h) p4Var.d;
        this.d = hVar;
        this.e = p4Var.f5725a;
        this.f45838f = (f) p4Var.e;
        this.f45839g = (k) p4Var.f5728f;
        b bVar = new b((g) p4Var.f5729g);
        this.h = bVar;
        this.E = new Runnable(this) {
            public final o f45811b;

            {
                this.f45811b = this;
            }

            @Override
            public final void run() {
                i0 i0Var;
                switch (r2) {
                    case 0:
                        o oVar = this.f45811b;
                        if (oVar.f45845n == m.f45829c && !oVar.f45854x) {
                            oVar.f45854x = true;
                            b bVar2 = oVar.h;
                            bVar2.b("maximum duration reached: durationMs=" + oVar.j());
                            oVar.f45838f.onMaximumDurationReached();
                            oVar.m();
                            return;
                        }
                        return;
                    default:
                        o oVar2 = this.f45811b;
                        if (oVar2.f45845n == m.e && (i0Var = oVar2.B) != null && oVar2.v) {
                            long M0 = i0Var.M0();
                            long j10 = oVar2.f45850s;
                            if (M0 < j10 || M0 >= oVar2.f45851t) {
                                oVar2.B.Z0(5, j10);
                                M0 = oVar2.f45850s;
                            }
                            oVar2.f45838f.onPreviewProgress(M0, oVar2.j());
                            oVar2.f45840i.postDelayed(oVar2.F, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        this.F = new Runnable(this) {
            public final o f45811b;

            {
                this.f45811b = this;
            }

            @Override
            public final void run() {
                i0 i0Var;
                switch (r2) {
                    case 0:
                        o oVar = this.f45811b;
                        if (oVar.f45845n == m.f45829c && !oVar.f45854x) {
                            oVar.f45854x = true;
                            b bVar2 = oVar.h;
                            bVar2.b("maximum duration reached: durationMs=" + oVar.j());
                            oVar.f45838f.onMaximumDurationReached();
                            oVar.m();
                            return;
                        }
                        return;
                    default:
                        o oVar2 = this.f45811b;
                        if (oVar2.f45845n == m.e && (i0Var = oVar2.B) != null && oVar2.v) {
                            long M0 = i0Var.M0();
                            long j10 = oVar2.f45850s;
                            if (M0 < j10 || M0 >= oVar2.f45851t) {
                                oVar2.B.Z0(5, j10);
                                M0 = oVar2.f45850s;
                            }
                            oVar2.f45838f.onPreviewProgress(M0, oVar2.j());
                            oVar2.f45840i.postDelayed(oVar2.F, 32L);
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
        synchronized (this.f45843l) {
            try {
                if (iVar.d && !iVar.e) {
                    long j11 = iVar.f45820c;
                    if (j10 > j11) {
                        iVar.f45820c = j10;
                        this.f45842k.execute(new c(this, iVar, j11, j10 - j11, 1));
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        p();
        m mVar = this.f45845n;
        m mVar2 = m.f45833s;
        if (mVar != mVar2 && mVar != m.f45831n) {
            this.h.b("cancel requested: state=" + this.f45845n);
            d dVar = this.E;
            Handler handler = this.f45840i;
            handler.removeCallbacks(dVar);
            handler.removeCallbacks(this.F);
            o();
            k(j.f45822b);
            r(mVar2);
            org.telegram.utils.recorder.audio.d dVar2 = this.f45846o;
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
        if (this.f45855y) {
            return;
        }
        this.f45855y = true;
        l lVar = this.D;
        if (lVar == null) {
            file = null;
        } else {
            file = lVar.f45824a;
        }
        p2.b bVar = new p2.b(16, this, file);
        try {
            this.f45841j.execute(bVar);
        } catch (RejectedExecutionException unused) {
            bVar.run();
        }
    }

    public final i d() {
        File f7 = f();
        long j10 = this.f45852u;
        this.f45852u = 1 + j10;
        i iVar = new i(j10, f7);
        synchronized (this.f45843l) {
            this.A = iVar;
            this.f45842k.execute(new cy0(this, iVar, f7, 17));
        }
        b bVar = this.h;
        StringBuilder t10 = a1.g.t(j10, "output generation started: id=", ", file=");
        t10.append(f7.getName());
        bVar.b(t10.toString());
        return iVar;
    }

    public final n e() {
        return new n(this.f45845n);
    }

    public final File f() {
        File file = this.f45836b;
        File file2 = new File(file, "audio_recording_voice_" + System.currentTimeMillis() + "_" + I.getAndIncrement() + ".ogg");
        synchronized (this.f45844m) {
            this.f45844m.add(file2);
        }
        return file2;
    }

    public final void g(Exception exc) {
        m mVar = this.f45845n;
        m mVar2 = m.f45832r;
        if (mVar != mVar2 && mVar != m.f45833s && mVar != m.f45831n) {
            b bVar = this.h;
            bVar.a("fatal error in state=" + this.f45845n, exc);
            Handler handler = this.f45840i;
            handler.removeCallbacks(this.E);
            handler.removeCallbacks(this.F);
            o();
            k(j.f45823c);
            r(mVar2);
            i iVar = this.A;
            if (iVar != null) {
                this.f45842k.execute(new cy0(this, iVar, exc, 18));
            }
            this.f45838f.onError(exc);
            org.telegram.utils.recorder.audio.d dVar = this.f45846o;
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
        m mVar2 = this.f45845n;
        m mVar3 = m.f45829c;
        if (mVar2 != mVar3 && mVar2 != m.e) {
            return;
        }
        b bVar = this.h;
        bVar.b("finish requested: state=" + this.f45845n + ", durationMs=" + j() + ", trim=" + this.f45850s + ".." + this.f45851t);
        if (this.f45845n == mVar3) {
            this.f45853w = true;
            this.f45840i.removeCallbacks(this.E);
            r(mVar);
            this.f45846o.d();
            return;
        }
        o();
        r(mVar);
        final i iVar = this.A;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long q6 = q(this.f45848q);
        final long j10 = this.f45850s;
        if (j10 == 0 && this.f45851t == q6) {
            i();
            return;
        }
        final long j11 = this.f45851t;
        k(j.f45821a);
        final i d = d();
        this.f45841j.execute(new Runnable() {
            @Override
            public final void run() {
                String str;
                i iVar2 = iVar;
                i iVar3 = d;
                long j12 = j10;
                long j13 = j11;
                o oVar = o.this;
                Handler handler = oVar.f45840i;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String absolutePath = iVar2.f45819b.getAbsolutePath();
                    File file = iVar3.f45819b;
                    String absolutePath2 = file.getAbsolutePath();
                    try {
                        if (AudioRecorderNative.b(absolutePath, absolutePath2, j12, j13)) {
                            ri.b bVar2 = oVar.h;
                            bVar2.b("final trim completed: source=" + iVar2.f45819b.getName() + ", output=" + file.getName() + ", trim=" + j12 + ".." + j13 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            oVar.a(iVar3, file.length());
                            handler.post(new eo(oVar, j13, j12, 2));
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
        if (this.f45845n != m.h) {
            return;
        }
        i iVar = this.A;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long j10 = j();
        if (j10 < this.f45837c) {
            b bVar = this.h;
            bVar.b("recording rejected as too short: durationMs=" + j10);
            this.f45838f.onRecordingTooShort(j10);
            k(j.f45822b);
            r(m.f45833s);
            c();
            s();
            l("too_short");
            return;
        }
        this.f45841j.execute(new org.telegram.utils.recorder.audio.b(j10, iVar, this));
    }

    public final long j() {
        p();
        return q(this.f45848q + this.f45849r);
    }

    public final void k(j jVar) {
        synchronized (this.f45843l) {
            i iVar = this.A;
            if (iVar != null && iVar.d && !iVar.e) {
                iVar.d = false;
                this.f45842k.execute(new cy0(this, iVar, jVar, 19));
                b bVar = this.h;
                bVar.b("output generation invalidated: id=" + iVar.f45818a + ", reason=" + jVar);
            }
        }
    }

    public final void l(String str) {
        if (this.f45856z) {
            return;
        }
        this.f45856z = true;
        StringBuilder v = a1.g.v("session summary: terminal=", str, ", durationMs=");
        v.append(q(this.f45848q + this.f45849r));
        v.append(", generations=");
        v.append(this.f45852u - 1);
        this.h.b(v.toString());
    }

    public final boolean m() {
        p();
        if (this.f45845n == m.f45829c && this.f45846o != null) {
            this.h.b("pause requested: durationMs=" + j());
            this.f45840i.removeCallbacks(this.E);
            r(m.d);
            this.f45846o.d();
            return true;
        }
        return false;
    }

    public final void n() {
        p();
        m mVar = this.f45845n;
        m mVar2 = m.f45833s;
        if (mVar == mVar2) {
            return;
        }
        if (mVar != m.f45831n) {
            b();
            return;
        }
        o();
        c();
        r(mVar2);
        l("released");
    }

    public final void o() {
        this.f45840i.removeCallbacks(this.F);
        this.v = false;
        i0 i0Var = this.B;
        if (i0Var != null) {
            i0Var.C(this.G);
            this.B.X0();
            this.B = null;
        }
    }

    public final void r(m mVar) {
        m mVar2 = this.f45845n;
        if (mVar2 == mVar) {
            return;
        }
        this.f45845n = mVar;
        this.h.b("state: " + mVar2 + " -> " + mVar + ", durationMs=" + q(this.f45848q + this.f45849r));
        this.f45838f.onStateChanged(e());
    }

    public final void s() {
        this.f45841j.shutdown();
        this.f45842k.shutdown();
    }

    public final void t(long j10, long j11, File file) {
        long j12 = this.f45847p + 1;
        this.f45847p = j12;
        i iVar = this.A;
        if (iVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.d dVar = new org.telegram.utils.recorder.audio.d(iVar.f45819b, file, j10, j11, this.d, this.h, new cc.e(j12, iVar, this));
        this.f45846o = dVar;
        this.f45849r = 0L;
        dVar.f43853k.post(new Runnable() {
            @Override
            public final void run() {
                String str;
                d dVar2 = d.this;
                File file2 = dVar2.f43847b;
                ri.b bVar = dVar2.f43849f;
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a2 = AudioRecorderNative.a(dVar2.f43846a, dVar2.f43848c, dVar2.d, dVar2.f43847b);
                    dVar2.f43862t = a2;
                    if (a2 != null) {
                        if (dVar2.e == h.f45816b) {
                            AudioNoiseSuppressor a10 = AudioNoiseSuppressor.a();
                            dVar2.f43863u = a10;
                            if (a10 == null) {
                                bVar.b("RNNoise unavailable; recording unprocessed PCM");
                            } else {
                                bVar.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
                            }
                        }
                        long d = dVar2.f43862t.d();
                        StringBuilder sb2 = new StringBuilder("Opus encoder started: prefix=");
                        if (file2 == null) {
                            str = "none";
                        } else {
                            str = file2.getName() + " " + dVar2.f43848c + ".." + dVar2.d;
                        }
                        sb2.append(str);
                        sb2.append(", initialBytes=");
                        sb2.append(d);
                        sb2.append(", queuedChunks=");
                        sb2.append(dVar2.f43855m.get());
                        sb2.append(", elapsedMs=");
                        sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                        bVar.b(sb2.toString());
                        dVar2.f43865x = SystemClock.elapsedRealtime();
                        if (d > 0) {
                            cc.e eVar = dVar2.f43850g;
                            ((o) eVar.f5093c).a((i) eVar.f5092b, d);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Unable to initialize native Opus recorder");
                } catch (Throwable th2) {
                    if (dVar2.v == null) {
                        dVar2.f43849f.a("encoding failed", th2);
                        dVar2.v = d.a(th2);
                        dVar2.f43856n = true;
                    }
                }
            }
        });
        dVar.f43851i.post(new a(dVar, 0));
    }
}
