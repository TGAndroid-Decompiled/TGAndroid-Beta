package ri;

import android.content.Context;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import bi.b8;
import e2.l0;
import e2.z;
import i2.h0;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.uo;
import org.telegram.ui.web.e0;
import ri.j;
import ri.k;
import ri.q;
public final class q {
    public static final pb.a G = new pb.a(22);
    public static final AtomicLong H = new AtomicLong(1);
    public h0 A;
    public byte[] B;
    public n C;
    public final f D;
    public final f E;
    public final Context f44753a;
    public final File f44754b;
    public final long f44755c;
    public final j d;
    public final h e;
    public final m f44756f;
    public final b f44757g;
    public org.telegram.utils.recorder.audio.b f44763n;
    public long f44764o;
    public long f44765p;
    public long f44766q;
    public long f44767r;
    public long f44768s;
    public boolean f44770u;
    public boolean v;
    public boolean f44771w;
    public boolean f44772x;
    public boolean f44773y;
    public volatile k f44774z;
    public final Handler h = new Handler(Looper.getMainLooper());
    public final ExecutorService f44758i = Executors.newSingleThreadExecutor(new l0(8));
    public final ExecutorService f44759j = Executors.newSingleThreadExecutor(new l0(9));
    public final Object f44760k = new Object();
    public final ArrayList f44761l = new ArrayList();
    public o f44762m = o.f44745a;
    public long f44769t = 1;
    public final z F = new z(this, 3);

    public q(com.google.firebase.messaging.m mVar) {
        p();
        Context context = (Context) mVar.f6191a;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.f44753a = context;
        File file = (File) mVar.f6192b;
        this.f44754b = file == null ? context.getCacheDir() : file;
        this.f44755c = 700L;
        j jVar = (j) mVar.f6193c;
        this.d = jVar;
        this.e = (h) mVar.d;
        this.f44756f = (m) mVar.e;
        b bVar = new b((i) mVar.f6194f);
        this.f44757g = bVar;
        this.D = new Runnable(this) {
            public final q f44729b;

            {
                this.f44729b = this;
            }

            @Override
            public final void run() {
                h0 h0Var;
                switch (r2) {
                    case 0:
                        q qVar = this.f44729b;
                        if (qVar.f44762m == o.f44747c && !qVar.f44771w) {
                            qVar.f44771w = true;
                            b bVar2 = qVar.f44757g;
                            bVar2.b("maximum duration reached: durationMs=" + qVar.j());
                            qVar.e.onMaximumDurationReached();
                            qVar.m();
                            return;
                        }
                        return;
                    default:
                        q qVar2 = this.f44729b;
                        if (qVar2.f44762m == o.e && (h0Var = qVar2.A) != null && qVar2.f44770u) {
                            long M0 = h0Var.M0();
                            long j10 = qVar2.f44767r;
                            if (M0 < j10 || M0 >= qVar2.f44768s) {
                                qVar2.A.Z0(5, j10);
                                M0 = qVar2.f44767r;
                            }
                            qVar2.e.onPreviewProgress(M0, qVar2.j());
                            qVar2.h.postDelayed(qVar2.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        this.E = new Runnable(this) {
            public final q f44729b;

            {
                this.f44729b = this;
            }

            @Override
            public final void run() {
                h0 h0Var;
                switch (r2) {
                    case 0:
                        q qVar = this.f44729b;
                        if (qVar.f44762m == o.f44747c && !qVar.f44771w) {
                            qVar.f44771w = true;
                            b bVar2 = qVar.f44757g;
                            bVar2.b("maximum duration reached: durationMs=" + qVar.j());
                            qVar.e.onMaximumDurationReached();
                            qVar.m();
                            return;
                        }
                        return;
                    default:
                        q qVar2 = this.f44729b;
                        if (qVar2.f44762m == o.e && (h0Var = qVar2.A) != null && qVar2.f44770u) {
                            long M0 = h0Var.M0();
                            long j10 = qVar2.f44767r;
                            if (M0 < j10 || M0 >= qVar2.f44768s) {
                                qVar2.A.Z0(5, j10);
                                M0 = qVar2.f44767r;
                            }
                            qVar2.e.onPreviewProgress(M0, qVar2.j());
                            qVar2.h.postDelayed(qVar2.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        bVar.b("session created: device=" + Build.MANUFACTURER + " " + Build.MODEL + ", sdk=" + Build.VERSION.SDK_INT + ", sampleRate=48000, noiseSuppression=" + jVar + ", minimumDurationMs=700, maximumDurationMs=0");
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

    public final void a(k kVar, long j10) {
        if (j10 <= 0) {
            return;
        }
        synchronized (this.f44760k) {
            try {
                if (kVar.d && !kVar.e) {
                    long j11 = kVar.f44738c;
                    if (j10 > j11) {
                        kVar.f44738c = j10;
                        this.f44759j.execute(new c(this, kVar, j11, j10 - j11, 1));
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        p();
        o oVar = this.f44762m;
        o oVar2 = o.f44751s;
        if (oVar != oVar2 && oVar != o.f44749n) {
            this.f44757g.b("cancel requested: state=" + this.f44762m);
            this.h.removeCallbacksAndMessages(null);
            o();
            k(l.f44740b);
            r(oVar2);
            org.telegram.utils.recorder.audio.b bVar = this.f44763n;
            if (bVar != null) {
                bVar.f();
                return;
            }
            c();
            s();
        }
    }

    public final void c() {
        File file;
        if (this.f44772x) {
            return;
        }
        this.f44772x = true;
        n nVar = this.C;
        if (nVar == null) {
            file = null;
        } else {
            file = nVar.f44742a;
        }
        synchronized (this.f44761l) {
            for (int i10 = 0; i10 < this.f44761l.size(); i10++) {
                try {
                    File file2 = (File) this.f44761l.get(i10);
                    if (file != null && file.equals(file2)) {
                    }
                    if (file2.exists() && !file2.delete()) {
                        b bVar = this.f44757g;
                        bVar.b("temporary file deletion failed: " + file2.getName());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f44761l.clear();
        }
    }

    public final k d() {
        File f7 = f("voice");
        long j10 = this.f44769t;
        this.f44769t = 1 + j10;
        k kVar = new k(j10, f7);
        synchronized (this.f44760k) {
            this.f44774z = kVar;
            this.f44759j.execute(new org.webrtc.i(this, kVar, f7, 5));
        }
        b bVar = this.f44757g;
        StringBuilder t10 = a1.g.t(j10, "output generation started: id=", ", file=");
        t10.append(f7.getName());
        bVar.b(t10.toString());
        return kVar;
    }

    public final p e() {
        return new p(this.f44762m);
    }

    public final File f(String str) {
        File file = this.f44754b;
        StringBuilder v = a1.g.v("audio_recording_", str, "_");
        v.append(System.currentTimeMillis());
        v.append("_");
        v.append(H.getAndIncrement());
        v.append(".ogg");
        File file2 = new File(file, v.toString());
        synchronized (this.f44761l) {
            this.f44761l.add(file2);
        }
        return file2;
    }

    public final void g(Exception exc) {
        o oVar = this.f44762m;
        o oVar2 = o.f44750r;
        if (oVar != oVar2 && oVar != o.f44751s && oVar != o.f44749n) {
            b bVar = this.f44757g;
            bVar.a("fatal error in state=" + this.f44762m, exc);
            this.h.removeCallbacksAndMessages(null);
            o();
            k(l.f44741c);
            r(oVar2);
            k kVar = this.f44774z;
            if (kVar != null) {
                this.f44759j.execute(new org.webrtc.i(this, kVar, exc, 6));
            }
            this.e.onError(exc);
            org.telegram.utils.recorder.audio.b bVar2 = this.f44763n;
            if (bVar2 != null) {
                bVar2.f();
            } else {
                c();
                s();
            }
            l("error");
        }
    }

    public final void h() {
        o oVar = o.h;
        p();
        o oVar2 = this.f44762m;
        o oVar3 = o.f44747c;
        if (oVar2 != oVar3 && oVar2 != o.e) {
            return;
        }
        b bVar = this.f44757g;
        bVar.b("finish requested: state=" + this.f44762m + ", durationMs=" + j() + ", trim=" + this.f44767r + ".." + this.f44768s);
        if (this.f44762m == oVar3) {
            this.v = true;
            this.h.removeCallbacks(this.D);
            r(oVar);
            this.f44763n.f();
            return;
        }
        o();
        r(oVar);
        final k kVar = this.f44774z;
        if (kVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long q6 = q(this.f44765p);
        final long j10 = this.f44767r;
        if (j10 == 0 && this.f44768s == q6) {
            i();
            return;
        }
        final long j11 = this.f44768s;
        k(l.f44739a);
        final k d = d();
        this.f44758i.execute(new Runnable() {
            @Override
            public final void run() {
                q qVar;
                k kVar2 = kVar;
                k kVar3 = d;
                long j12 = j10;
                long j13 = j11;
                q qVar2 = q.this;
                Handler handler = qVar2.h;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String absolutePath = kVar2.f44737b.getAbsolutePath();
                    File file = kVar3.f44737b;
                    String absolutePath2 = file.getAbsolutePath();
                    try {
                        if (AudioRecorderNative.b(absolutePath, absolutePath2, j12, j13)) {
                            ri.b bVar2 = qVar2.f44757g;
                            bVar2.b("final trim completed: source=" + kVar2.f44737b.getName() + ", output=" + file.getName() + ", trim=" + j12 + ".." + j13 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            qVar2.a(kVar3, file.length());
                            handler.post(new uo(qVar2, j13, j12, 2));
                            return;
                        }
                        throw new IllegalStateException("Unable to trim final Opus output");
                    } catch (Throwable th2) {
                        th = th2;
                        qVar = absolutePath2;
                        handler.post(new ri.d(qVar, th, 0));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    qVar = qVar2;
                }
            }
        });
    }

    public final void i() {
        if (this.f44762m != o.h) {
            return;
        }
        final k kVar = this.f44774z;
        if (kVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final long j10 = j();
        if (j10 < this.f44755c) {
            b bVar = this.f44757g;
            bVar.b("recording rejected as too short: durationMs=" + j10);
            this.e.onRecordingTooShort(j10);
            k(l.f44740b);
            r(o.f44751s);
            c();
            s();
            l("too_short");
            return;
        }
        this.f44758i.execute(new Runnable() {
            @Override
            public final void run() {
                byte[] bArr;
                q qVar = q.this;
                k kVar2 = kVar;
                try {
                    bArr = AudioRecorderNative.e(kVar2.f44737b.getAbsolutePath());
                } catch (Throwable th2) {
                    qVar.f44757g.a("final waveform extraction failed", th2);
                    bArr = null;
                }
                qVar.h.post(new b8(qVar, kVar2, j10, bArr, 19));
            }
        });
    }

    public final long j() {
        p();
        return q(this.f44765p + this.f44766q);
    }

    public final void k(l lVar) {
        synchronized (this.f44760k) {
            k kVar = this.f44774z;
            if (kVar != null && kVar.d && !kVar.e) {
                kVar.d = false;
                this.f44759j.execute(new org.webrtc.i(this, kVar, lVar, 7));
                b bVar = this.f44757g;
                bVar.b("output generation invalidated: id=" + kVar.f44736a + ", reason=" + lVar);
            }
        }
    }

    public final void l(String str) {
        if (this.f44773y) {
            return;
        }
        this.f44773y = true;
        StringBuilder v = a1.g.v("session summary: terminal=", str, ", durationMs=");
        v.append(q(this.f44765p + this.f44766q));
        v.append(", generations=");
        v.append(this.f44769t - 1);
        this.f44757g.b(v.toString());
    }

    public final boolean m() {
        p();
        if (this.f44762m == o.f44747c && this.f44763n != null) {
            this.f44757g.b("pause requested: durationMs=" + j());
            this.h.removeCallbacks(this.D);
            r(o.d);
            this.f44763n.f();
            return true;
        }
        return false;
    }

    public final void n() {
        p();
        o oVar = this.f44762m;
        o oVar2 = o.f44751s;
        if (oVar == oVar2) {
            return;
        }
        if (oVar != o.f44749n) {
            b();
            return;
        }
        o();
        c();
        r(oVar2);
        l("released");
    }

    public final void o() {
        this.h.removeCallbacks(this.E);
        this.f44770u = false;
        h0 h0Var = this.A;
        if (h0Var != null) {
            h0Var.C(this.F);
            this.A.X0();
            this.A = null;
        }
    }

    public final void r(o oVar) {
        o oVar2 = this.f44762m;
        if (oVar2 == oVar) {
            return;
        }
        this.f44762m = oVar;
        this.f44757g.b("state: " + oVar2 + " -> " + oVar + ", durationMs=" + q(this.f44765p + this.f44766q));
        this.e.onStateChanged(e());
    }

    public final void s() {
        this.f44758i.shutdown();
        this.f44759j.shutdown();
    }

    public final void t(File file) {
        long j10 = this.f44764o + 1;
        this.f44764o = j10;
        k kVar = this.f44774z;
        if (kVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.b bVar = new org.telegram.utils.recorder.audio.b(kVar.f44737b, file, this.d, this.f44757g, new cc.e(this, kVar, j10));
        this.f44763n = bVar;
        this.f44766q = 0L;
        bVar.f42751g.post(new Runnable() {
            @Override
            public final void run() {
                String name;
                b bVar2 = b.this;
                try {
                    if (bVar2.f42753j) {
                        bVar2.e();
                        return;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a2 = AudioRecorderNative.a(bVar2.f42747a, bVar2.f42748b);
                    bVar2.f42755l = a2;
                    if (a2 != null) {
                        if (bVar2.f42749c == j.f44734b) {
                            AudioNoiseSuppressor a10 = AudioNoiseSuppressor.a();
                            bVar2.f42756m = a10;
                            if (a10 == null) {
                                bVar2.d.b("RNNoise unavailable; recording unprocessed PCM");
                            } else {
                                bVar2.d.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
                            }
                        }
                        long d = bVar2.f42755l.d();
                        ri.b bVar3 = bVar2.d;
                        StringBuilder sb2 = new StringBuilder("Opus encoder started: prefix=");
                        File file2 = bVar2.f42748b;
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
                        if (bVar2.f42753j) {
                            bVar2.e();
                            return;
                        }
                        int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                        if (minBufferSize <= 0) {
                            minBufferSize = 7680;
                        }
                        int max = Math.max(minBufferSize * 2, 7680);
                        AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                        bVar2.f42754k = audioRecord;
                        if (audioRecord.getState() == 1) {
                            bVar2.f42754k.startRecording();
                            if (bVar2.f42754k.getRecordingState() == 3) {
                                bVar2.d.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + bVar2.f42754k.getAudioSessionId());
                                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                bVar2.f42761r = elapsedRealtime2;
                                bVar2.f42760q = elapsedRealtime2;
                                cc.e eVar = bVar2.e;
                                long max2 = Math.max(0L, d);
                                q qVar = (q) eVar.f4722c;
                                qVar.a((k) eVar.f4721b, max2);
                                qVar.h.post(new e0(eVar, eVar.f4720a, 1));
                                bVar2.f42751g.post(new ri.a(bVar2, 1));
                                return;
                            }
                            throw new IllegalStateException("Unable to start AudioRecord");
                        }
                        throw new IllegalStateException("Unable to initialize AudioRecord");
                    }
                    throw new IllegalStateException("Unable to initialize native Opus recorder");
                } catch (Throwable th2) {
                    bVar2.d.a("capture failed", th2);
                    bVar2.f42753j = true;
                    bVar2.f42758o = b.b(th2);
                    try {
                        bVar2.e();
                    } catch (Throwable th3) {
                        bVar2.f42758o.addSuppressed(th3);
                    }
                }
            }
        });
    }
}
