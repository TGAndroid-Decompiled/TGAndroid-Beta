package ri;

import ai.c3;
import android.content.Context;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import e2.l0;
import e2.z;
import i2.g0;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.Components.ay0;
import org.telegram.ui.go;
import org.telegram.ui.mh0;
import ri.i;
import ri.j;
import ri.p;
public final class p {
    public static final pb.a G = new pb.a(22);
    public static final AtomicLong H = new AtomicLong(1);
    public g0 A;
    public byte[] B;
    public m C;
    public final e D;
    public final e E;
    public final Context f45853a;
    public final File f45854b;
    public final long f45855c;
    public final i d;
    public final g e;
    public final l f45856f;
    public final b f45857g;
    public org.telegram.utils.recorder.audio.b f45863n;
    public long f45864o;
    public long f45865p;
    public long f45866q;
    public long f45867r;
    public long f45868s;
    public boolean f45870u;
    public boolean v;
    public boolean f45871w;
    public boolean f45872x;
    public boolean f45873y;
    public volatile j f45874z;
    public final Handler h = new Handler(Looper.getMainLooper());
    public final ExecutorService f45858i = Executors.newSingleThreadExecutor(new l0(6));
    public final ExecutorService f45859j = Executors.newSingleThreadExecutor(new l0(7));
    public final Object f45860k = new Object();
    public final ArrayList f45861l = new ArrayList();
    public n f45862m = n.f45845a;
    public long f45869t = 1;
    public final z F = new z(this, 2);

    public p(com.google.firebase.messaging.l lVar) {
        p();
        Context context = (Context) lVar.f7647a;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.f45853a = context;
        File file = (File) lVar.f7648b;
        this.f45854b = file == null ? context.getCacheDir() : file;
        this.f45855c = 700L;
        i iVar = (i) lVar.f7649c;
        this.d = iVar;
        this.e = (g) lVar.d;
        this.f45856f = (l) lVar.e;
        b bVar = new b((h) lVar.f7650f);
        this.f45857g = bVar;
        this.D = new Runnable(this) {
            public final p f45829b;

            {
                this.f45829b = this;
            }

            @Override
            public final void run() {
                g0 g0Var;
                switch (r2) {
                    case 0:
                        p pVar = this.f45829b;
                        if (pVar.f45862m == n.f45847c && !pVar.f45871w) {
                            pVar.f45871w = true;
                            b bVar2 = pVar.f45857g;
                            bVar2.b("maximum duration reached: durationMs=" + pVar.j());
                            pVar.e.onMaximumDurationReached();
                            pVar.m();
                            return;
                        }
                        return;
                    default:
                        p pVar2 = this.f45829b;
                        if (pVar2.f45862m == n.e && (g0Var = pVar2.A) != null && pVar2.f45870u) {
                            long M0 = g0Var.M0();
                            long j10 = pVar2.f45867r;
                            if (M0 < j10 || M0 >= pVar2.f45868s) {
                                pVar2.A.Z0(5, j10);
                                M0 = pVar2.f45867r;
                            }
                            pVar2.e.onPreviewProgress(M0, pVar2.j());
                            pVar2.h.postDelayed(pVar2.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        this.E = new Runnable(this) {
            public final p f45829b;

            {
                this.f45829b = this;
            }

            @Override
            public final void run() {
                g0 g0Var;
                switch (r2) {
                    case 0:
                        p pVar = this.f45829b;
                        if (pVar.f45862m == n.f45847c && !pVar.f45871w) {
                            pVar.f45871w = true;
                            b bVar2 = pVar.f45857g;
                            bVar2.b("maximum duration reached: durationMs=" + pVar.j());
                            pVar.e.onMaximumDurationReached();
                            pVar.m();
                            return;
                        }
                        return;
                    default:
                        p pVar2 = this.f45829b;
                        if (pVar2.f45862m == n.e && (g0Var = pVar2.A) != null && pVar2.f45870u) {
                            long M0 = g0Var.M0();
                            long j10 = pVar2.f45867r;
                            if (M0 < j10 || M0 >= pVar2.f45868s) {
                                pVar2.A.Z0(5, j10);
                                M0 = pVar2.f45867r;
                            }
                            pVar2.e.onPreviewProgress(M0, pVar2.j());
                            pVar2.h.postDelayed(pVar2.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        bVar.b("session created: device=" + Build.MANUFACTURER + " " + Build.MODEL + ", sdk=" + Build.VERSION.SDK_INT + ", sampleRate=48000, noiseSuppression=" + iVar + ", minimumDurationMs=700, maximumDurationMs=0");
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

    public final void a(j jVar, long j10) {
        if (j10 <= 0) {
            return;
        }
        synchronized (this.f45860k) {
            try {
                if (jVar.d && !jVar.e) {
                    long j11 = jVar.f45838c;
                    if (j10 > j11) {
                        jVar.f45838c = j10;
                        this.f45859j.execute(new c(this, jVar, j11, j10 - j11, 1));
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        p();
        n nVar = this.f45862m;
        n nVar2 = n.f45851s;
        if (nVar != nVar2 && nVar != n.f45849n) {
            this.f45857g.b("cancel requested: state=" + this.f45862m);
            this.h.removeCallbacksAndMessages(null);
            o();
            k(k.f45840b);
            r(nVar2);
            org.telegram.utils.recorder.audio.b bVar = this.f45863n;
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
        if (this.f45872x) {
            return;
        }
        this.f45872x = true;
        m mVar = this.C;
        if (mVar == null) {
            file = null;
        } else {
            file = mVar.f45842a;
        }
        synchronized (this.f45861l) {
            for (int i10 = 0; i10 < this.f45861l.size(); i10++) {
                try {
                    File file2 = (File) this.f45861l.get(i10);
                    if (file != null && file.equals(file2)) {
                    }
                    if (file2.exists() && !file2.delete()) {
                        b bVar = this.f45857g;
                        bVar.b("temporary file deletion failed: " + file2.getName());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f45861l.clear();
        }
    }

    public final j d() {
        File f7 = f("voice");
        long j10 = this.f45869t;
        this.f45869t = 1 + j10;
        j jVar = new j(j10, f7);
        synchronized (this.f45860k) {
            this.f45874z = jVar;
            this.f45859j.execute(new ay0(this, jVar, f7, 17));
        }
        b bVar = this.f45857g;
        StringBuilder t10 = a1.g.t(j10, "output generation started: id=", ", file=");
        t10.append(f7.getName());
        bVar.b(t10.toString());
        return jVar;
    }

    public final o e() {
        return new o(this.f45862m);
    }

    public final File f(String str) {
        File file = this.f45854b;
        StringBuilder v = a1.g.v("audio_recording_", str, "_");
        v.append(System.currentTimeMillis());
        v.append("_");
        v.append(H.getAndIncrement());
        v.append(".ogg");
        File file2 = new File(file, v.toString());
        synchronized (this.f45861l) {
            this.f45861l.add(file2);
        }
        return file2;
    }

    public final void g(Exception exc) {
        n nVar = this.f45862m;
        n nVar2 = n.f45850r;
        if (nVar != nVar2 && nVar != n.f45851s && nVar != n.f45849n) {
            b bVar = this.f45857g;
            bVar.a("fatal error in state=" + this.f45862m, exc);
            this.h.removeCallbacksAndMessages(null);
            o();
            k(k.f45841c);
            r(nVar2);
            j jVar = this.f45874z;
            if (jVar != null) {
                this.f45859j.execute(new ay0(this, jVar, exc, 18));
            }
            this.e.onError(exc);
            org.telegram.utils.recorder.audio.b bVar2 = this.f45863n;
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
        n nVar = n.h;
        p();
        n nVar2 = this.f45862m;
        n nVar3 = n.f45847c;
        if (nVar2 != nVar3 && nVar2 != n.e) {
            return;
        }
        b bVar = this.f45857g;
        bVar.b("finish requested: state=" + this.f45862m + ", durationMs=" + j() + ", trim=" + this.f45867r + ".." + this.f45868s);
        if (this.f45862m == nVar3) {
            this.v = true;
            this.h.removeCallbacks(this.D);
            r(nVar);
            this.f45863n.f();
            return;
        }
        o();
        r(nVar);
        final j jVar = this.f45874z;
        if (jVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long q6 = q(this.f45865p);
        final long j10 = this.f45867r;
        if (j10 == 0 && this.f45868s == q6) {
            i();
            return;
        }
        final long j11 = this.f45868s;
        k(k.f45839a);
        final j d = d();
        this.f45858i.execute(new Runnable() {
            @Override
            public final void run() {
                p pVar;
                j jVar2 = jVar;
                j jVar3 = d;
                long j12 = j10;
                long j13 = j11;
                p pVar2 = p.this;
                Handler handler = pVar2.h;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String absolutePath = jVar2.f45837b.getAbsolutePath();
                    File file = jVar3.f45837b;
                    String absolutePath2 = file.getAbsolutePath();
                    try {
                        if (AudioRecorderNative.b(absolutePath, absolutePath2, j12, j13)) {
                            ri.b bVar2 = pVar2.f45857g;
                            bVar2.b("final trim completed: source=" + jVar2.f45837b.getName() + ", output=" + file.getName() + ", trim=" + j12 + ".." + j13 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            pVar2.a(jVar3, file.length());
                            handler.post(new go(pVar2, j13, j12, 2));
                            return;
                        }
                        throw new IllegalStateException("Unable to trim final Opus output");
                    } catch (Throwable th2) {
                        th = th2;
                        pVar = absolutePath2;
                        handler.post(new ri.d(pVar, th, 0));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    pVar = pVar2;
                }
            }
        });
    }

    public final void i() {
        if (this.f45862m != n.h) {
            return;
        }
        final j jVar = this.f45874z;
        if (jVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final long j10 = j();
        if (j10 < this.f45855c) {
            b bVar = this.f45857g;
            bVar.b("recording rejected as too short: durationMs=" + j10);
            this.e.onRecordingTooShort(j10);
            k(k.f45840b);
            r(n.f45851s);
            c();
            s();
            l("too_short");
            return;
        }
        this.f45858i.execute(new Runnable() {
            @Override
            public final void run() {
                byte[] bArr;
                p pVar = p.this;
                j jVar2 = jVar;
                try {
                    bArr = AudioRecorderNative.e(jVar2.f45837b.getAbsolutePath());
                } catch (Throwable th2) {
                    pVar.f45857g.a("final waveform extraction failed", th2);
                    bArr = null;
                }
                pVar.h.post(new c3(pVar, jVar2, j10, bArr, 27));
            }
        });
    }

    public final long j() {
        p();
        return q(this.f45865p + this.f45866q);
    }

    public final void k(k kVar) {
        synchronized (this.f45860k) {
            j jVar = this.f45874z;
            if (jVar != null && jVar.d && !jVar.e) {
                jVar.d = false;
                this.f45859j.execute(new ay0(this, jVar, kVar, 19));
                b bVar = this.f45857g;
                bVar.b("output generation invalidated: id=" + jVar.f45836a + ", reason=" + kVar);
            }
        }
    }

    public final void l(String str) {
        if (this.f45873y) {
            return;
        }
        this.f45873y = true;
        StringBuilder v = a1.g.v("session summary: terminal=", str, ", durationMs=");
        v.append(q(this.f45865p + this.f45866q));
        v.append(", generations=");
        v.append(this.f45869t - 1);
        this.f45857g.b(v.toString());
    }

    public final boolean m() {
        p();
        if (this.f45862m == n.f45847c && this.f45863n != null) {
            this.f45857g.b("pause requested: durationMs=" + j());
            this.h.removeCallbacks(this.D);
            r(n.d);
            this.f45863n.f();
            return true;
        }
        return false;
    }

    public final void n() {
        p();
        n nVar = this.f45862m;
        n nVar2 = n.f45851s;
        if (nVar == nVar2) {
            return;
        }
        if (nVar != n.f45849n) {
            b();
            return;
        }
        o();
        c();
        r(nVar2);
        l("released");
    }

    public final void o() {
        this.h.removeCallbacks(this.E);
        this.f45870u = false;
        g0 g0Var = this.A;
        if (g0Var != null) {
            g0Var.C(this.F);
            this.A.X0();
            this.A = null;
        }
    }

    public final void r(n nVar) {
        n nVar2 = this.f45862m;
        if (nVar2 == nVar) {
            return;
        }
        this.f45862m = nVar;
        this.f45857g.b("state: " + nVar2 + " -> " + nVar + ", durationMs=" + q(this.f45865p + this.f45866q));
        this.e.onStateChanged(e());
    }

    public final void s() {
        this.f45858i.shutdown();
        this.f45859j.shutdown();
    }

    public final void t(File file) {
        long j10 = this.f45864o + 1;
        this.f45864o = j10;
        j jVar = this.f45874z;
        if (jVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.b bVar = new org.telegram.utils.recorder.audio.b(jVar.f45837b, file, this.d, this.f45857g, new cc.e(this, jVar, j10));
        this.f45863n = bVar;
        this.f45866q = 0L;
        bVar.f43861g.post(new Runnable() {
            @Override
            public final void run() {
                String name;
                b bVar2 = b.this;
                try {
                    if (bVar2.f43863j) {
                        bVar2.e();
                        return;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a2 = AudioRecorderNative.a(bVar2.f43857a, bVar2.f43858b);
                    bVar2.f43865l = a2;
                    if (a2 != null) {
                        if (bVar2.f43859c == i.f45834b) {
                            AudioNoiseSuppressor a10 = AudioNoiseSuppressor.a();
                            bVar2.f43866m = a10;
                            if (a10 == null) {
                                bVar2.d.b("RNNoise unavailable; recording unprocessed PCM");
                            } else {
                                bVar2.d.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
                            }
                        }
                        long d = bVar2.f43865l.d();
                        ri.b bVar3 = bVar2.d;
                        StringBuilder sb2 = new StringBuilder("Opus encoder started: prefix=");
                        File file2 = bVar2.f43858b;
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
                        if (bVar2.f43863j) {
                            bVar2.e();
                            return;
                        }
                        int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                        if (minBufferSize <= 0) {
                            minBufferSize = 7680;
                        }
                        int max = Math.max(minBufferSize * 2, 7680);
                        AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                        bVar2.f43864k = audioRecord;
                        if (audioRecord.getState() == 1) {
                            bVar2.f43864k.startRecording();
                            if (bVar2.f43864k.getRecordingState() == 3) {
                                bVar2.d.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + bVar2.f43864k.getAudioSessionId());
                                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                bVar2.f43871r = elapsedRealtime2;
                                bVar2.f43870q = elapsedRealtime2;
                                cc.e eVar = bVar2.e;
                                long max2 = Math.max(0L, d);
                                p pVar = (p) eVar.f5095c;
                                pVar.a((j) eVar.f5094b, max2);
                                pVar.h.post(new mh0(eVar, eVar.f5093a, 3));
                                bVar2.f43861g.post(new ri.a(bVar2, 1));
                                return;
                            }
                            throw new IllegalStateException("Unable to start AudioRecord");
                        }
                        throw new IllegalStateException("Unable to initialize AudioRecord");
                    }
                    throw new IllegalStateException("Unable to initialize native Opus recorder");
                } catch (Throwable th2) {
                    bVar2.d.a("capture failed", th2);
                    bVar2.f43863j = true;
                    bVar2.f43868o = b.b(th2);
                    try {
                        bVar2.e();
                    } catch (Throwable th3) {
                        bVar2.f43868o.addSuppressed(th3);
                    }
                }
            }
        });
    }
}
