package qi;

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
import qi.j;
import qi.k;
import qi.q;
public final class q {
    public static final pb.a G = new pb.a(20);
    public static final AtomicLong H = new AtomicLong(1);
    public h0 A;
    public byte[] B;
    public n C;
    public final f D;
    public final f E;
    public final Context f43429a;
    public final File f43430b;
    public final long f43431c;
    public final j d;
    public final h e;
    public final m f43432f;
    public final b f43433g;
    public org.telegram.utils.recorder.audio.b f43439n;
    public long f43440o;
    public long f43441p;
    public long f43442q;
    public long f43443r;
    public long f43444s;
    public boolean f43446u;
    public boolean v;
    public boolean f43447w;
    public boolean f43448x;
    public boolean f43449y;
    public volatile k f43450z;
    public final Handler h = new Handler(Looper.getMainLooper());
    public final ExecutorService f43434i = Executors.newSingleThreadExecutor(new l0(6));
    public final ExecutorService f43435j = Executors.newSingleThreadExecutor(new l0(7));
    public final Object f43436k = new Object();
    public final ArrayList f43437l = new ArrayList();
    public o f43438m = o.f43421a;
    public long f43445t = 1;
    public final z F = new z(this, 2);

    public q(com.google.firebase.messaging.m mVar) {
        p();
        Context context = (Context) mVar.f6194a;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.f43429a = context;
        File file = (File) mVar.f6195b;
        this.f43430b = file == null ? context.getCacheDir() : file;
        this.f43431c = 700L;
        j jVar = (j) mVar.f6196c;
        this.d = jVar;
        this.e = (h) mVar.d;
        this.f43432f = (m) mVar.e;
        b bVar = new b((i) mVar.f6197f);
        this.f43433g = bVar;
        this.D = new Runnable(this) {
            public final q f43405b;

            {
                this.f43405b = this;
            }

            @Override
            public final void run() {
                h0 h0Var;
                switch (r2) {
                    case 0:
                        q qVar = this.f43405b;
                        if (qVar.f43438m == o.f43423c && !qVar.f43447w) {
                            qVar.f43447w = true;
                            b bVar2 = qVar.f43433g;
                            bVar2.b("maximum duration reached: durationMs=" + qVar.j());
                            qVar.e.onMaximumDurationReached();
                            qVar.m();
                            return;
                        }
                        return;
                    default:
                        q qVar2 = this.f43405b;
                        if (qVar2.f43438m == o.e && (h0Var = qVar2.A) != null && qVar2.f43446u) {
                            long M0 = h0Var.M0();
                            long j10 = qVar2.f43443r;
                            if (M0 < j10 || M0 >= qVar2.f43444s) {
                                qVar2.A.Z0(5, j10);
                                M0 = qVar2.f43443r;
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
            public final q f43405b;

            {
                this.f43405b = this;
            }

            @Override
            public final void run() {
                h0 h0Var;
                switch (r2) {
                    case 0:
                        q qVar = this.f43405b;
                        if (qVar.f43438m == o.f43423c && !qVar.f43447w) {
                            qVar.f43447w = true;
                            b bVar2 = qVar.f43433g;
                            bVar2.b("maximum duration reached: durationMs=" + qVar.j());
                            qVar.e.onMaximumDurationReached();
                            qVar.m();
                            return;
                        }
                        return;
                    default:
                        q qVar2 = this.f43405b;
                        if (qVar2.f43438m == o.e && (h0Var = qVar2.A) != null && qVar2.f43446u) {
                            long M0 = h0Var.M0();
                            long j10 = qVar2.f43443r;
                            if (M0 < j10 || M0 >= qVar2.f43444s) {
                                qVar2.A.Z0(5, j10);
                                M0 = qVar2.f43443r;
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
        synchronized (this.f43436k) {
            try {
                if (kVar.d && !kVar.e) {
                    long j11 = kVar.f43414c;
                    if (j10 > j11) {
                        kVar.f43414c = j10;
                        this.f43435j.execute(new c(this, kVar, j11, j10 - j11, 1));
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        p();
        o oVar = this.f43438m;
        o oVar2 = o.f43427s;
        if (oVar != oVar2 && oVar != o.f43425n) {
            this.f43433g.b("cancel requested: state=" + this.f43438m);
            this.h.removeCallbacksAndMessages(null);
            o();
            k(l.f43416b);
            r(oVar2);
            org.telegram.utils.recorder.audio.b bVar = this.f43439n;
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
        if (this.f43448x) {
            return;
        }
        this.f43448x = true;
        n nVar = this.C;
        if (nVar == null) {
            file = null;
        } else {
            file = nVar.f43418a;
        }
        synchronized (this.f43437l) {
            for (int i10 = 0; i10 < this.f43437l.size(); i10++) {
                try {
                    File file2 = (File) this.f43437l.get(i10);
                    if (file != null && file.equals(file2)) {
                    }
                    if (file2.exists() && !file2.delete()) {
                        b bVar = this.f43433g;
                        bVar.b("temporary file deletion failed: " + file2.getName());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f43437l.clear();
        }
    }

    public final k d() {
        File f7 = f("voice");
        long j10 = this.f43445t;
        this.f43445t = 1 + j10;
        k kVar = new k(j10, f7);
        synchronized (this.f43436k) {
            this.f43450z = kVar;
            this.f43435j.execute(new pi.g(this, kVar, f7, 2));
        }
        b bVar = this.f43433g;
        StringBuilder t10 = a1.g.t(j10, "output generation started: id=", ", file=");
        t10.append(f7.getName());
        bVar.b(t10.toString());
        return kVar;
    }

    public final p e() {
        return new p(this.f43438m);
    }

    public final File f(String str) {
        File file = this.f43430b;
        StringBuilder v = a1.g.v("audio_recording_", str, "_");
        v.append(System.currentTimeMillis());
        v.append("_");
        v.append(H.getAndIncrement());
        v.append(".ogg");
        File file2 = new File(file, v.toString());
        synchronized (this.f43437l) {
            this.f43437l.add(file2);
        }
        return file2;
    }

    public final void g(Exception exc) {
        o oVar = this.f43438m;
        o oVar2 = o.f43426r;
        if (oVar != oVar2 && oVar != o.f43427s && oVar != o.f43425n) {
            b bVar = this.f43433g;
            bVar.a("fatal error in state=" + this.f43438m, exc);
            this.h.removeCallbacksAndMessages(null);
            o();
            k(l.f43417c);
            r(oVar2);
            k kVar = this.f43450z;
            if (kVar != null) {
                this.f43435j.execute(new pi.g(this, kVar, exc, 3));
            }
            this.e.onError(exc);
            org.telegram.utils.recorder.audio.b bVar2 = this.f43439n;
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
        o oVar2 = this.f43438m;
        o oVar3 = o.f43423c;
        if (oVar2 != oVar3 && oVar2 != o.e) {
            return;
        }
        b bVar = this.f43433g;
        bVar.b("finish requested: state=" + this.f43438m + ", durationMs=" + j() + ", trim=" + this.f43443r + ".." + this.f43444s);
        if (this.f43438m == oVar3) {
            this.v = true;
            this.h.removeCallbacks(this.D);
            r(oVar);
            this.f43439n.f();
            return;
        }
        o();
        r(oVar);
        final k kVar = this.f43450z;
        if (kVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long q6 = q(this.f43441p);
        final long j10 = this.f43443r;
        if (j10 == 0 && this.f43444s == q6) {
            i();
            return;
        }
        final long j11 = this.f43444s;
        k(l.f43415a);
        final k d = d();
        this.f43434i.execute(new Runnable() {
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
                    String absolutePath = kVar2.f43413b.getAbsolutePath();
                    File file = kVar3.f43413b;
                    String absolutePath2 = file.getAbsolutePath();
                    try {
                        if (AudioRecorderNative.b(absolutePath, absolutePath2, j12, j13)) {
                            qi.b bVar2 = qVar2.f43433g;
                            bVar2.b("final trim completed: source=" + kVar2.f43413b.getName() + ", output=" + file.getName() + ", trim=" + j12 + ".." + j13 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            qVar2.a(kVar3, file.length());
                            handler.post(new uo(qVar2, j13, j12, 2));
                            return;
                        }
                        throw new IllegalStateException("Unable to trim final Opus output");
                    } catch (Throwable th2) {
                        th = th2;
                        qVar = absolutePath2;
                        handler.post(new qi.d(qVar, th, 0));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    qVar = qVar2;
                }
            }
        });
    }

    public final void i() {
        if (this.f43438m != o.h) {
            return;
        }
        final k kVar = this.f43450z;
        if (kVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final long j10 = j();
        if (j10 < this.f43431c) {
            b bVar = this.f43433g;
            bVar.b("recording rejected as too short: durationMs=" + j10);
            this.e.onRecordingTooShort(j10);
            k(l.f43416b);
            r(o.f43427s);
            c();
            s();
            l("too_short");
            return;
        }
        this.f43434i.execute(new Runnable() {
            @Override
            public final void run() {
                byte[] bArr;
                q qVar = q.this;
                k kVar2 = kVar;
                try {
                    bArr = AudioRecorderNative.e(kVar2.f43413b.getAbsolutePath());
                } catch (Throwable th2) {
                    qVar.f43433g.a("final waveform extraction failed", th2);
                    bArr = null;
                }
                qVar.h.post(new b8(qVar, kVar2, j10, bArr, 19));
            }
        });
    }

    public final long j() {
        p();
        return q(this.f43441p + this.f43442q);
    }

    public final void k(l lVar) {
        synchronized (this.f43436k) {
            k kVar = this.f43450z;
            if (kVar != null && kVar.d && !kVar.e) {
                kVar.d = false;
                this.f43435j.execute(new pi.g(this, kVar, lVar, 4));
                b bVar = this.f43433g;
                bVar.b("output generation invalidated: id=" + kVar.f43412a + ", reason=" + lVar);
            }
        }
    }

    public final void l(String str) {
        if (this.f43449y) {
            return;
        }
        this.f43449y = true;
        StringBuilder v = a1.g.v("session summary: terminal=", str, ", durationMs=");
        v.append(q(this.f43441p + this.f43442q));
        v.append(", generations=");
        v.append(this.f43445t - 1);
        this.f43433g.b(v.toString());
    }

    public final boolean m() {
        p();
        if (this.f43438m == o.f43423c && this.f43439n != null) {
            this.f43433g.b("pause requested: durationMs=" + j());
            this.h.removeCallbacks(this.D);
            r(o.d);
            this.f43439n.f();
            return true;
        }
        return false;
    }

    public final void n() {
        p();
        o oVar = this.f43438m;
        o oVar2 = o.f43427s;
        if (oVar == oVar2) {
            return;
        }
        if (oVar != o.f43425n) {
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
        this.f43446u = false;
        h0 h0Var = this.A;
        if (h0Var != null) {
            h0Var.C(this.F);
            this.A.X0();
            this.A = null;
        }
    }

    public final void r(o oVar) {
        o oVar2 = this.f43438m;
        if (oVar2 == oVar) {
            return;
        }
        this.f43438m = oVar;
        this.f43433g.b("state: " + oVar2 + " -> " + oVar + ", durationMs=" + q(this.f43441p + this.f43442q));
        this.e.onStateChanged(e());
    }

    public final void s() {
        this.f43434i.shutdown();
        this.f43435j.shutdown();
    }

    public final void t(File file) {
        long j10 = this.f43440o + 1;
        this.f43440o = j10;
        k kVar = this.f43450z;
        if (kVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.b bVar = new org.telegram.utils.recorder.audio.b(kVar.f43413b, file, this.d, this.f43433g, new cc.e(this, kVar, j10));
        this.f43439n = bVar;
        this.f43442q = 0L;
        bVar.f42454g.post(new Runnable() {
            @Override
            public final void run() {
                String name;
                b bVar2 = b.this;
                try {
                    if (bVar2.f42456j) {
                        bVar2.e();
                        return;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a2 = AudioRecorderNative.a(bVar2.f42450a, bVar2.f42451b);
                    bVar2.f42458l = a2;
                    if (a2 != null) {
                        if (bVar2.f42452c == j.f43410b) {
                            AudioNoiseSuppressor a10 = AudioNoiseSuppressor.a();
                            bVar2.f42459m = a10;
                            if (a10 == null) {
                                bVar2.d.b("RNNoise unavailable; recording unprocessed PCM");
                            } else {
                                bVar2.d.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
                            }
                        }
                        long d = bVar2.f42458l.d();
                        qi.b bVar3 = bVar2.d;
                        StringBuilder sb2 = new StringBuilder("Opus encoder started: prefix=");
                        File file2 = bVar2.f42451b;
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
                        if (bVar2.f42456j) {
                            bVar2.e();
                            return;
                        }
                        int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                        if (minBufferSize <= 0) {
                            minBufferSize = 7680;
                        }
                        int max = Math.max(minBufferSize * 2, 7680);
                        AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                        bVar2.f42457k = audioRecord;
                        if (audioRecord.getState() == 1) {
                            bVar2.f42457k.startRecording();
                            if (bVar2.f42457k.getRecordingState() == 3) {
                                bVar2.d.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + bVar2.f42457k.getAudioSessionId());
                                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                bVar2.f42464r = elapsedRealtime2;
                                bVar2.f42463q = elapsedRealtime2;
                                cc.e eVar = bVar2.e;
                                long max2 = Math.max(0L, d);
                                q qVar = (q) eVar.f4725c;
                                qVar.a((k) eVar.f4724b, max2);
                                qVar.h.post(new e0(eVar, eVar.f4723a, 1));
                                bVar2.f42454g.post(new qi.a(bVar2, 1));
                                return;
                            }
                            throw new IllegalStateException("Unable to start AudioRecord");
                        }
                        throw new IllegalStateException("Unable to initialize AudioRecord");
                    }
                    throw new IllegalStateException("Unable to initialize native Opus recorder");
                } catch (Throwable th2) {
                    bVar2.d.a("capture failed", th2);
                    bVar2.f42456j = true;
                    bVar2.f42461o = b.b(th2);
                    try {
                        bVar2.e();
                    } catch (Throwable th3) {
                        bVar2.f42461o.addSuppressed(th3);
                    }
                }
            }
        });
    }
}
