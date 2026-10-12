package pi;

import ai.r8;
import android.content.Context;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import e2.c0;
import i2.f0;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.to;
import org.telegram.ui.web.d0;
import pi.l;
import pi.m;
import pi.s;
public final class s {
    public static final na.d G = new na.d(19);
    public static final AtomicLong H = new AtomicLong(1);
    public f0 A;
    public byte[] B;
    public p C;
    public final g D;
    public final g E;
    public final Context f45812a;
    public final File f45813b;
    public final long f45814c;
    public final l d;
    public final j f45815e;
    public final o f45816f;
    public final b f45817g;
    public org.telegram.utils.recorder.audio.b f45823n;
    public long f45824o;
    public long f45825p;
    public long f45826q;
    public long f45827r;
    public long f45828s;
    public boolean f45830u;
    public boolean v;
    public boolean f45831w;
    public boolean f45832x;
    public boolean f45833y;
    public volatile m f45834z;
    public final Handler h = new Handler(Looper.getMainLooper());
    public final ExecutorService f45818i = Executors.newSingleThreadExecutor(new c0(6));
    public final ExecutorService f45819j = Executors.newSingleThreadExecutor(new c0(7));
    public final Object f45820k = new Object();
    public final ArrayList f45821l = new ArrayList();
    public q f45822m = q.f45803a;
    public long f45829t = 1;
    public final i81 F = new i81(this, 1);

    public s(com.google.firebase.messaging.n nVar) {
        p();
        Context context = (Context) nVar.f7950a;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.f45812a = context;
        File file = (File) nVar.f7951b;
        this.f45813b = file == null ? context.getCacheDir() : file;
        this.f45814c = 700L;
        l lVar = (l) nVar.f7952c;
        this.d = lVar;
        this.f45815e = (j) nVar.d;
        this.f45816f = (o) nVar.f7953e;
        b bVar = new b((k) nVar.f7954f);
        this.f45817g = bVar;
        this.D = new Runnable(this) {
            public final s f45783b;

            {
                this.f45783b = this;
            }

            @Override
            public final void run() {
                f0 f0Var;
                switch (r2) {
                    case 0:
                        s sVar = this.f45783b;
                        if (sVar.f45822m == q.f45805c && !sVar.f45831w) {
                            sVar.f45831w = true;
                            b bVar2 = sVar.f45817g;
                            bVar2.b("maximum duration reached: durationMs=" + sVar.j());
                            sVar.f45815e.onMaximumDurationReached();
                            sVar.m();
                            return;
                        }
                        return;
                    default:
                        s sVar2 = this.f45783b;
                        if (sVar2.f45822m == q.f45806e && (f0Var = sVar2.A) != null && sVar2.f45830u) {
                            long J0 = f0Var.J0();
                            long j3 = sVar2.f45827r;
                            if (J0 < j3 || J0 >= sVar2.f45828s) {
                                sVar2.A.W0(5, j3);
                                J0 = sVar2.f45827r;
                            }
                            sVar2.f45815e.onPreviewProgress(J0, sVar2.j());
                            sVar2.h.postDelayed(sVar2.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        this.E = new Runnable(this) {
            public final s f45783b;

            {
                this.f45783b = this;
            }

            @Override
            public final void run() {
                f0 f0Var;
                switch (r2) {
                    case 0:
                        s sVar = this.f45783b;
                        if (sVar.f45822m == q.f45805c && !sVar.f45831w) {
                            sVar.f45831w = true;
                            b bVar2 = sVar.f45817g;
                            bVar2.b("maximum duration reached: durationMs=" + sVar.j());
                            sVar.f45815e.onMaximumDurationReached();
                            sVar.m();
                            return;
                        }
                        return;
                    default:
                        s sVar2 = this.f45783b;
                        if (sVar2.f45822m == q.f45806e && (f0Var = sVar2.A) != null && sVar2.f45830u) {
                            long J0 = f0Var.J0();
                            long j3 = sVar2.f45827r;
                            if (J0 < j3 || J0 >= sVar2.f45828s) {
                                sVar2.A.W0(5, j3);
                                J0 = sVar2.f45827r;
                            }
                            sVar2.f45815e.onPreviewProgress(J0, sVar2.j());
                            sVar2.h.postDelayed(sVar2.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        bVar.b("session created: device=" + Build.MANUFACTURER + " " + Build.MODEL + ", sdk=" + Build.VERSION.SDK_INT + ", sampleRate=48000, noiseSuppression=" + lVar + ", minimumDurationMs=700, maximumDurationMs=0");
    }

    public static void p() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("AudioRecordingSession must be used on the main thread");
    }

    public static long q(long j3) {
        return (j3 * 1000) / 48000;
    }

    public final void a(m mVar, long j3) {
        if (j3 <= 0) {
            return;
        }
        synchronized (this.f45820k) {
            try {
                if (mVar.d && !mVar.f45796e) {
                    long j10 = mVar.f45795c;
                    if (j3 > j10) {
                        mVar.f45795c = j3;
                        this.f45819j.execute(new e(this, mVar, j10, j3 - j10, 0));
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        p();
        q qVar = this.f45822m;
        q qVar2 = q.f45810s;
        if (qVar != qVar2 && qVar != q.f45808n) {
            this.f45817g.b("cancel requested: state=" + this.f45822m);
            this.h.removeCallbacksAndMessages(null);
            o();
            k(n.f45798b);
            s(qVar2);
            org.telegram.utils.recorder.audio.b bVar = this.f45823n;
            if (bVar != null) {
                bVar.f();
            } else {
                r();
            }
        }
    }

    public final m c() {
        File e7 = e("voice");
        long j3 = this.f45829t;
        this.f45829t = 1 + j3;
        m mVar = new m(j3, e7);
        synchronized (this.f45820k) {
            this.f45834z = mVar;
            this.f45819j.execute(new mh0(this, mVar, e7, 29));
        }
        b bVar = this.f45817g;
        StringBuilder u10 = a1.g.u(j3, "output generation started: id=", ", file=");
        u10.append(e7.getName());
        bVar.b(u10.toString());
        return mVar;
    }

    public final r d() {
        return new r(this.f45822m);
    }

    public final File e(String str) {
        File file = this.f45813b;
        StringBuilder w10 = a1.g.w("audio_recording_", str, "_");
        w10.append(System.currentTimeMillis());
        w10.append("_");
        w10.append(H.getAndIncrement());
        w10.append(".ogg");
        File file2 = new File(file, w10.toString());
        synchronized (this.f45821l) {
            this.f45821l.add(file2);
        }
        return file2;
    }

    public final void f(File file) {
        b bVar = this.f45817g;
        if (file.exists()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.setLength(0L);
                randomAccessFile.close();
            } catch (IOException e7) {
                bVar.a("temporary file truncation failed: " + file.getName(), e7);
            }
            if (file.exists() && !file.delete()) {
                bVar.b("temporary file deletion failed: " + file.getName());
            }
        }
    }

    public final void g(Exception exc) {
        q qVar = this.f45822m;
        q qVar2 = q.f45809r;
        if (qVar != qVar2 && qVar != q.f45810s && qVar != q.f45808n) {
            b bVar = this.f45817g;
            bVar.a("fatal error in state=" + this.f45822m, exc);
            this.h.removeCallbacksAndMessages(null);
            o();
            k(n.f45799c);
            s(qVar2);
            m mVar = this.f45834z;
            if (mVar != null) {
                this.f45819j.execute(new h(this, mVar, exc, 0));
            }
            org.telegram.utils.recorder.audio.b bVar2 = this.f45823n;
            if (bVar2 != null) {
                bVar2.f();
            } else {
                r();
            }
            l("error");
            this.f45815e.onError(exc);
        }
    }

    public final void h() {
        q qVar = q.h;
        p();
        q qVar2 = this.f45822m;
        q qVar3 = q.f45805c;
        if (qVar2 != qVar3 && qVar2 != q.f45806e) {
            return;
        }
        b bVar = this.f45817g;
        bVar.b("finish requested: state=" + this.f45822m + ", durationMs=" + j() + ", trim=" + this.f45827r + ".." + this.f45828s);
        if (this.f45822m == qVar3) {
            this.v = true;
            this.h.removeCallbacks(this.D);
            s(qVar);
            this.f45823n.f();
            return;
        }
        o();
        s(qVar);
        final m mVar = this.f45834z;
        if (mVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long q6 = q(this.f45825p);
        final long j3 = this.f45827r;
        if (j3 == 0 && this.f45828s == q6) {
            i();
            return;
        }
        final long j10 = this.f45828s;
        k(n.f45797a);
        final m c10 = c();
        this.f45818i.execute(new Runnable() {
            @Override
            public final void run() {
                s sVar;
                m mVar2 = mVar;
                m mVar3 = c10;
                long j11 = j3;
                long j12 = j10;
                s sVar2 = s.this;
                Handler handler = sVar2.h;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String absolutePath = mVar2.f45794b.getAbsolutePath();
                    File file = mVar3.f45794b;
                    String absolutePath2 = file.getAbsolutePath();
                    try {
                        if (AudioRecorderNative.b(absolutePath, absolutePath2, j11, j12)) {
                            pi.b bVar2 = sVar2.f45817g;
                            bVar2.b("final trim completed: source=" + mVar2.f45794b.getName() + ", output=" + file.getName() + ", trim=" + j11 + ".." + j12 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            sVar2.a(mVar3, file.length());
                            handler.post(new to(sVar2, j12, j11, 2));
                            return;
                        }
                        throw new IllegalStateException("Unable to trim final Opus output");
                    } catch (Throwable th2) {
                        th = th2;
                        sVar = absolutePath2;
                        handler.post(new pi.d(sVar, th, 0));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sVar = sVar2;
                }
            }
        });
    }

    public final void i() {
        if (this.f45822m != q.h) {
            return;
        }
        final m mVar = this.f45834z;
        if (mVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final long j3 = j();
        if (j3 < this.f45814c) {
            b bVar = this.f45817g;
            bVar.b("recording rejected as too short: durationMs=" + j3);
            k(n.f45798b);
            s(q.f45810s);
            r();
            l("too_short");
            this.f45815e.onRecordingTooShort(j3);
            return;
        }
        this.f45818i.execute(new Runnable() {
            @Override
            public final void run() {
                byte[] bArr;
                s sVar = s.this;
                m mVar2 = mVar;
                try {
                    bArr = AudioRecorderNative.e(mVar2.f45794b.getAbsolutePath());
                } catch (Throwable th2) {
                    sVar.f45817g.a("final waveform extraction failed", th2);
                    bArr = null;
                }
                sVar.h.post(new r8(sVar, mVar2, j3, bArr, 19));
            }
        });
    }

    public final long j() {
        p();
        return q(this.f45825p + this.f45826q);
    }

    public final void k(n nVar) {
        synchronized (this.f45820k) {
            m mVar = this.f45834z;
            if (mVar != null && mVar.d && !mVar.f45796e) {
                mVar.d = false;
                this.f45819j.execute(new h(this, mVar, nVar, 1));
                b bVar = this.f45817g;
                bVar.b("output generation invalidated: id=" + mVar.f45793a + ", reason=" + nVar);
            }
        }
    }

    public final void l(String str) {
        if (this.f45833y) {
            return;
        }
        this.f45833y = true;
        StringBuilder w10 = a1.g.w("session summary: terminal=", str, ", durationMs=");
        w10.append(q(this.f45825p + this.f45826q));
        w10.append(", generations=");
        w10.append(this.f45829t - 1);
        this.f45817g.b(w10.toString());
    }

    public final boolean m() {
        p();
        if (this.f45822m == q.f45805c && this.f45823n != null) {
            this.f45817g.b("pause requested: durationMs=" + j());
            this.h.removeCallbacks(this.D);
            s(q.d);
            this.f45823n.f();
            return true;
        }
        return false;
    }

    public final void n() {
        p();
        q qVar = this.f45822m;
        q qVar2 = q.f45810s;
        if (qVar == qVar2) {
            return;
        }
        if (qVar != q.f45808n) {
            b();
            return;
        }
        o();
        r();
        s(qVar2);
        l("released");
    }

    public final void o() {
        this.h.removeCallbacks(this.E);
        this.f45830u = false;
        f0 f0Var = this.A;
        if (f0Var != null) {
            f0Var.D(this.F);
            this.A.U0();
            this.A = null;
        }
    }

    public final void r() {
        File file;
        if (this.f45832x) {
            return;
        }
        this.f45832x = true;
        p pVar = this.C;
        if (pVar == null) {
            file = null;
        } else {
            file = pVar.f45800a;
        }
        this.f45818i.execute(new c(this, file, 0));
    }

    public final void s(q qVar) {
        q qVar2 = this.f45822m;
        if (qVar2 == qVar) {
            return;
        }
        this.f45822m = qVar;
        this.f45817g.b("state: " + qVar2 + " -> " + qVar + ", durationMs=" + q(this.f45825p + this.f45826q));
        this.f45815e.onStateChanged(d());
    }

    public final void t(File file) {
        long j3 = this.f45824o + 1;
        this.f45824o = j3;
        m mVar = this.f45834z;
        if (mVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.b bVar = new org.telegram.utils.recorder.audio.b(mVar.f45794b, file, this.d, this.f45817g, new bc.e(this, mVar, j3));
        this.f45823n = bVar;
        this.f45826q = 0L;
        bVar.f44956g.post(new Runnable() {
            @Override
            public final void run() {
                String name;
                b bVar2 = b.this;
                try {
                    if (bVar2.f44958j) {
                        bVar2.e();
                        return;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a2 = AudioRecorderNative.a(bVar2.f44951a, bVar2.f44952b);
                    bVar2.f44960l = a2;
                    if (a2 != null) {
                        if (bVar2.f44953c == l.f45791b) {
                            AudioNoiseSuppressor a10 = AudioNoiseSuppressor.a();
                            bVar2.f44961m = a10;
                            if (a10 == null) {
                                bVar2.d.b("RNNoise unavailable; recording unprocessed PCM");
                            } else {
                                bVar2.d.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
                            }
                        }
                        long d = bVar2.f44960l.d();
                        pi.b bVar3 = bVar2.d;
                        StringBuilder sb2 = new StringBuilder("Opus encoder started: prefix=");
                        File file2 = bVar2.f44952b;
                        if (file2 == null) {
                            name = "none";
                        } else {
                            name = file2.getName();
                        }
                        sb2.append(name);
                        sb2.append(", initialBytes=");
                        sb2.append(d);
                        sb2.append(", elapsedMs=");
                        sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                        bVar3.b(sb2.toString());
                        if (bVar2.f44958j) {
                            bVar2.e();
                            return;
                        }
                        int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                        if (minBufferSize <= 0) {
                            minBufferSize = 7680;
                        }
                        int max = Math.max(minBufferSize * 2, 7680);
                        AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                        bVar2.f44959k = audioRecord;
                        if (audioRecord.getState() == 1) {
                            bVar2.f44959k.startRecording();
                            if (bVar2.f44959k.getRecordingState() == 3) {
                                bVar2.d.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + bVar2.f44959k.getAudioSessionId());
                                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                bVar2.f44966r = elapsedRealtime2;
                                bVar2.f44965q = elapsedRealtime2;
                                bc.e eVar = bVar2.f44954e;
                                long max2 = Math.max(0L, d);
                                s sVar = (s) eVar.f3855c;
                                sVar.a((m) eVar.f3854b, max2);
                                sVar.h.post(new d0(eVar, eVar.f3853a, 1));
                                bVar2.f44956g.post(new pi.a(bVar2, 1));
                                return;
                            }
                            throw new IllegalStateException("Unable to start AudioRecord");
                        }
                        throw new IllegalStateException("Unable to initialize AudioRecord");
                    }
                    throw new IllegalStateException("Unable to initialize native Opus recorder");
                } catch (Throwable th2) {
                    bVar2.d.a("capture failed", th2);
                    bVar2.f44958j = true;
                    bVar2.f44963o = b.b(th2);
                    try {
                        bVar2.e();
                    } catch (Throwable th3) {
                        bVar2.f44963o.addSuppressed(th3);
                    }
                }
            }
        });
    }
}
