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
import i2.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.Components.by0;
import org.telegram.ui.eo;
import org.telegram.ui.kh0;
import ri.i;
import ri.j;
import ri.p;
public final class p {
    public static final pb.a G = new pb.a(22);
    public static final AtomicLong H = new AtomicLong(1);
    public i0 A;
    public byte[] B;
    public m C;
    public final e D;
    public final e E;
    public final Context f45827a;
    public final File f45828b;
    public final long f45829c;
    public final i d;
    public final g e;
    public final l f45830f;
    public final b f45831g;
    public org.telegram.utils.recorder.audio.b f45837n;
    public long f45838o;
    public long f45839p;
    public long f45840q;
    public long f45841r;
    public long f45842s;
    public boolean f45844u;
    public boolean v;
    public boolean f45845w;
    public boolean f45846x;
    public boolean f45847y;
    public volatile j f45848z;
    public final Handler h = new Handler(Looper.getMainLooper());
    public final ExecutorService f45832i = Executors.newSingleThreadExecutor(new l0(6));
    public final ExecutorService f45833j = Executors.newSingleThreadExecutor(new l0(7));
    public final Object f45834k = new Object();
    public final ArrayList f45835l = new ArrayList();
    public n f45836m = n.f45819a;
    public long f45843t = 1;
    public final z F = new z(this, 2);

    public p(com.google.firebase.messaging.l lVar) {
        p();
        Context context = (Context) lVar.f7645a;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.f45827a = context;
        File file = (File) lVar.f7646b;
        this.f45828b = file == null ? context.getCacheDir() : file;
        this.f45829c = 700L;
        i iVar = (i) lVar.f7647c;
        this.d = iVar;
        this.e = (g) lVar.d;
        this.f45830f = (l) lVar.e;
        b bVar = new b((h) lVar.f7648f);
        this.f45831g = bVar;
        this.D = new Runnable(this) {
            public final p f45803b;

            {
                this.f45803b = this;
            }

            @Override
            public final void run() {
                i0 i0Var;
                switch (r2) {
                    case 0:
                        p pVar = this.f45803b;
                        if (pVar.f45836m == n.f45821c && !pVar.f45845w) {
                            pVar.f45845w = true;
                            b bVar2 = pVar.f45831g;
                            bVar2.b("maximum duration reached: durationMs=" + pVar.j());
                            pVar.e.onMaximumDurationReached();
                            pVar.m();
                            return;
                        }
                        return;
                    default:
                        p pVar2 = this.f45803b;
                        if (pVar2.f45836m == n.e && (i0Var = pVar2.A) != null && pVar2.f45844u) {
                            long M0 = i0Var.M0();
                            long j10 = pVar2.f45841r;
                            if (M0 < j10 || M0 >= pVar2.f45842s) {
                                pVar2.A.Z0(5, j10);
                                M0 = pVar2.f45841r;
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
            public final p f45803b;

            {
                this.f45803b = this;
            }

            @Override
            public final void run() {
                i0 i0Var;
                switch (r2) {
                    case 0:
                        p pVar = this.f45803b;
                        if (pVar.f45836m == n.f45821c && !pVar.f45845w) {
                            pVar.f45845w = true;
                            b bVar2 = pVar.f45831g;
                            bVar2.b("maximum duration reached: durationMs=" + pVar.j());
                            pVar.e.onMaximumDurationReached();
                            pVar.m();
                            return;
                        }
                        return;
                    default:
                        p pVar2 = this.f45803b;
                        if (pVar2.f45836m == n.e && (i0Var = pVar2.A) != null && pVar2.f45844u) {
                            long M0 = i0Var.M0();
                            long j10 = pVar2.f45841r;
                            if (M0 < j10 || M0 >= pVar2.f45842s) {
                                pVar2.A.Z0(5, j10);
                                M0 = pVar2.f45841r;
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
        synchronized (this.f45834k) {
            try {
                if (jVar.d && !jVar.e) {
                    long j11 = jVar.f45812c;
                    if (j10 > j11) {
                        jVar.f45812c = j10;
                        this.f45833j.execute(new c(this, jVar, j11, j10 - j11, 1));
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        p();
        n nVar = this.f45836m;
        n nVar2 = n.f45825s;
        if (nVar != nVar2 && nVar != n.f45823n) {
            this.f45831g.b("cancel requested: state=" + this.f45836m);
            this.h.removeCallbacksAndMessages(null);
            o();
            k(k.f45814b);
            r(nVar2);
            org.telegram.utils.recorder.audio.b bVar = this.f45837n;
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
        if (this.f45846x) {
            return;
        }
        this.f45846x = true;
        m mVar = this.C;
        if (mVar == null) {
            file = null;
        } else {
            file = mVar.f45816a;
        }
        synchronized (this.f45835l) {
            for (int i10 = 0; i10 < this.f45835l.size(); i10++) {
                try {
                    File file2 = (File) this.f45835l.get(i10);
                    if (file != null && file.equals(file2)) {
                    }
                    if (file2.exists() && !file2.delete()) {
                        b bVar = this.f45831g;
                        bVar.b("temporary file deletion failed: " + file2.getName());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f45835l.clear();
        }
    }

    public final j d() {
        File f7 = f("voice");
        long j10 = this.f45843t;
        this.f45843t = 1 + j10;
        j jVar = new j(j10, f7);
        synchronized (this.f45834k) {
            this.f45848z = jVar;
            this.f45833j.execute(new by0(this, jVar, f7, 17));
        }
        b bVar = this.f45831g;
        StringBuilder t10 = a1.g.t(j10, "output generation started: id=", ", file=");
        t10.append(f7.getName());
        bVar.b(t10.toString());
        return jVar;
    }

    public final o e() {
        return new o(this.f45836m);
    }

    public final File f(String str) {
        File file = this.f45828b;
        StringBuilder v = a1.g.v("audio_recording_", str, "_");
        v.append(System.currentTimeMillis());
        v.append("_");
        v.append(H.getAndIncrement());
        v.append(".ogg");
        File file2 = new File(file, v.toString());
        synchronized (this.f45835l) {
            this.f45835l.add(file2);
        }
        return file2;
    }

    public final void g(Exception exc) {
        n nVar = this.f45836m;
        n nVar2 = n.f45824r;
        if (nVar != nVar2 && nVar != n.f45825s && nVar != n.f45823n) {
            b bVar = this.f45831g;
            bVar.a("fatal error in state=" + this.f45836m, exc);
            this.h.removeCallbacksAndMessages(null);
            o();
            k(k.f45815c);
            r(nVar2);
            j jVar = this.f45848z;
            if (jVar != null) {
                this.f45833j.execute(new by0(this, jVar, exc, 18));
            }
            this.e.onError(exc);
            org.telegram.utils.recorder.audio.b bVar2 = this.f45837n;
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
        n nVar2 = this.f45836m;
        n nVar3 = n.f45821c;
        if (nVar2 != nVar3 && nVar2 != n.e) {
            return;
        }
        b bVar = this.f45831g;
        bVar.b("finish requested: state=" + this.f45836m + ", durationMs=" + j() + ", trim=" + this.f45841r + ".." + this.f45842s);
        if (this.f45836m == nVar3) {
            this.v = true;
            this.h.removeCallbacks(this.D);
            r(nVar);
            this.f45837n.f();
            return;
        }
        o();
        r(nVar);
        final j jVar = this.f45848z;
        if (jVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        long q6 = q(this.f45839p);
        final long j10 = this.f45841r;
        if (j10 == 0 && this.f45842s == q6) {
            i();
            return;
        }
        final long j11 = this.f45842s;
        k(k.f45813a);
        final j d = d();
        this.f45832i.execute(new Runnable() {
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
                    String absolutePath = jVar2.f45811b.getAbsolutePath();
                    File file = jVar3.f45811b;
                    String absolutePath2 = file.getAbsolutePath();
                    try {
                        if (AudioRecorderNative.b(absolutePath, absolutePath2, j12, j13)) {
                            ri.b bVar2 = pVar2.f45831g;
                            bVar2.b("final trim completed: source=" + jVar2.f45811b.getName() + ", output=" + file.getName() + ", trim=" + j12 + ".." + j13 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            pVar2.a(jVar3, file.length());
                            handler.post(new eo(pVar2, j13, j12, 2));
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
        if (this.f45836m != n.h) {
            return;
        }
        final j jVar = this.f45848z;
        if (jVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final long j10 = j();
        if (j10 < this.f45829c) {
            b bVar = this.f45831g;
            bVar.b("recording rejected as too short: durationMs=" + j10);
            this.e.onRecordingTooShort(j10);
            k(k.f45814b);
            r(n.f45825s);
            c();
            s();
            l("too_short");
            return;
        }
        this.f45832i.execute(new Runnable() {
            @Override
            public final void run() {
                byte[] bArr;
                p pVar = p.this;
                j jVar2 = jVar;
                try {
                    bArr = AudioRecorderNative.e(jVar2.f45811b.getAbsolutePath());
                } catch (Throwable th2) {
                    pVar.f45831g.a("final waveform extraction failed", th2);
                    bArr = null;
                }
                pVar.h.post(new c3(pVar, jVar2, j10, bArr, 27));
            }
        });
    }

    public final long j() {
        p();
        return q(this.f45839p + this.f45840q);
    }

    public final void k(k kVar) {
        synchronized (this.f45834k) {
            j jVar = this.f45848z;
            if (jVar != null && jVar.d && !jVar.e) {
                jVar.d = false;
                this.f45833j.execute(new by0(this, jVar, kVar, 19));
                b bVar = this.f45831g;
                bVar.b("output generation invalidated: id=" + jVar.f45810a + ", reason=" + kVar);
            }
        }
    }

    public final void l(String str) {
        if (this.f45847y) {
            return;
        }
        this.f45847y = true;
        StringBuilder v = a1.g.v("session summary: terminal=", str, ", durationMs=");
        v.append(q(this.f45839p + this.f45840q));
        v.append(", generations=");
        v.append(this.f45843t - 1);
        this.f45831g.b(v.toString());
    }

    public final boolean m() {
        p();
        if (this.f45836m == n.f45821c && this.f45837n != null) {
            this.f45831g.b("pause requested: durationMs=" + j());
            this.h.removeCallbacks(this.D);
            r(n.d);
            this.f45837n.f();
            return true;
        }
        return false;
    }

    public final void n() {
        p();
        n nVar = this.f45836m;
        n nVar2 = n.f45825s;
        if (nVar == nVar2) {
            return;
        }
        if (nVar != n.f45823n) {
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
        this.f45844u = false;
        i0 i0Var = this.A;
        if (i0Var != null) {
            i0Var.C(this.F);
            this.A.X0();
            this.A = null;
        }
    }

    public final void r(n nVar) {
        n nVar2 = this.f45836m;
        if (nVar2 == nVar) {
            return;
        }
        this.f45836m = nVar;
        this.f45831g.b("state: " + nVar2 + " -> " + nVar + ", durationMs=" + q(this.f45839p + this.f45840q));
        this.e.onStateChanged(e());
    }

    public final void s() {
        this.f45832i.shutdown();
        this.f45833j.shutdown();
    }

    public final void t(File file) {
        long j10 = this.f45838o + 1;
        this.f45838o = j10;
        j jVar = this.f45848z;
        if (jVar == null) {
            g(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.b bVar = new org.telegram.utils.recorder.audio.b(jVar.f45811b, file, this.d, this.f45831g, new cc.e(this, jVar, j10));
        this.f45837n = bVar;
        this.f45840q = 0L;
        bVar.f43835g.post(new Runnable() {
            @Override
            public final void run() {
                String name;
                b bVar2 = b.this;
                try {
                    if (bVar2.f43837j) {
                        bVar2.e();
                        return;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a2 = AudioRecorderNative.a(bVar2.f43831a, bVar2.f43832b);
                    bVar2.f43839l = a2;
                    if (a2 != null) {
                        if (bVar2.f43833c == i.f45808b) {
                            AudioNoiseSuppressor a10 = AudioNoiseSuppressor.a();
                            bVar2.f43840m = a10;
                            if (a10 == null) {
                                bVar2.d.b("RNNoise unavailable; recording unprocessed PCM");
                            } else {
                                bVar2.d.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
                            }
                        }
                        long d = bVar2.f43839l.d();
                        ri.b bVar3 = bVar2.d;
                        StringBuilder sb2 = new StringBuilder("Opus encoder started: prefix=");
                        File file2 = bVar2.f43832b;
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
                        if (bVar2.f43837j) {
                            bVar2.e();
                            return;
                        }
                        int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                        if (minBufferSize <= 0) {
                            minBufferSize = 7680;
                        }
                        int max = Math.max(minBufferSize * 2, 7680);
                        AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                        bVar2.f43838k = audioRecord;
                        if (audioRecord.getState() == 1) {
                            bVar2.f43838k.startRecording();
                            if (bVar2.f43838k.getRecordingState() == 3) {
                                bVar2.d.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + bVar2.f43838k.getAudioSessionId());
                                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                bVar2.f43845r = elapsedRealtime2;
                                bVar2.f43844q = elapsedRealtime2;
                                cc.e eVar = bVar2.e;
                                long max2 = Math.max(0L, d);
                                p pVar = (p) eVar.f5093c;
                                pVar.a((j) eVar.f5092b, max2);
                                pVar.h.post(new kh0(eVar, eVar.f5091a, 3));
                                bVar2.f43835g.post(new ri.a(bVar2, 1));
                                return;
                            }
                            throw new IllegalStateException("Unable to start AudioRecord");
                        }
                        throw new IllegalStateException("Unable to initialize AudioRecord");
                    }
                    throw new IllegalStateException("Unable to initialize native Opus recorder");
                } catch (Throwable th2) {
                    bVar2.d.a("capture failed", th2);
                    bVar2.f43837j = true;
                    bVar2.f43842o = b.b(th2);
                    try {
                        bVar2.e();
                    } catch (Throwable th3) {
                        bVar2.f43842o.addSuppressed(th3);
                    }
                }
            }
        });
    }
}
