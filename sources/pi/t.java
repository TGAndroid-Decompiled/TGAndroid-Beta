package pi;

import ai.r8;
import android.content.Context;
import android.media.AudioRecord;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import b2.k0;
import e2.c0;
import e9.i0;
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
import pi.m;
import pi.n;
import pi.t;
public final class t {
    public static final na.d G = new na.d(19);
    public static final AtomicLong H = new AtomicLong(1);
    public f0 A;
    public byte[] B;
    public q C;
    public final h D;
    public final h E;
    public final Context f45820a;
    public final File f45821b;
    public final long f45822c;
    public final m d;
    public final k f45823e;
    public final p f45824f;
    public final b f45825g;
    public org.telegram.utils.recorder.audio.b f45831n;
    public long f45832o;
    public long f45833p;
    public long f45834q;
    public long f45835r;
    public long f45836s;
    public boolean f45838u;
    public boolean v;
    public boolean f45839w;
    public boolean f45840x;
    public boolean f45841y;
    public volatile n f45842z;
    public final Handler h = new Handler(Looper.getMainLooper());
    public final ExecutorService f45826i = Executors.newSingleThreadExecutor(new c0(6));
    public final ExecutorService f45827j = Executors.newSingleThreadExecutor(new c0(7));
    public final Object f45828k = new Object();
    public final ArrayList f45829l = new ArrayList();
    public r f45830m = r.f45811a;
    public long f45837t = 1;
    public final i81 F = new i81(this, 1);

    public t(com.google.firebase.messaging.n nVar) {
        r();
        Context context = (Context) nVar.f7950a;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.f45820a = context;
        File file = (File) nVar.f7951b;
        this.f45821b = file == null ? context.getCacheDir() : file;
        this.f45822c = 700L;
        m mVar = (m) nVar.f7952c;
        this.d = mVar;
        this.f45823e = (k) nVar.d;
        this.f45824f = (p) nVar.f7953e;
        b bVar = new b((l) nVar.f7954f);
        this.f45825g = bVar;
        this.D = new Runnable(this) {
            public final t f45791b;

            {
                this.f45791b = this;
            }

            @Override
            public final void run() {
                f0 f0Var;
                switch (r2) {
                    case 0:
                        t tVar = this.f45791b;
                        if (tVar.f45830m == r.f45813c && !tVar.f45839w) {
                            tVar.f45839w = true;
                            b bVar2 = tVar.f45825g;
                            bVar2.b("maximum duration reached: durationMs=" + tVar.l());
                            tVar.f45823e.onMaximumDurationReached();
                            tVar.o();
                            return;
                        }
                        return;
                    default:
                        t tVar2 = this.f45791b;
                        if (tVar2.f45830m == r.f45814e && (f0Var = tVar2.A) != null && tVar2.f45838u) {
                            long J0 = f0Var.J0();
                            long j3 = tVar2.f45835r;
                            if (J0 < j3 || J0 >= tVar2.f45836s) {
                                tVar2.A.W0(5, j3);
                                J0 = tVar2.f45835r;
                            }
                            tVar2.f45823e.onPreviewProgress(J0, tVar2.l());
                            tVar2.h.postDelayed(tVar2.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        this.E = new Runnable(this) {
            public final t f45791b;

            {
                this.f45791b = this;
            }

            @Override
            public final void run() {
                f0 f0Var;
                switch (r2) {
                    case 0:
                        t tVar = this.f45791b;
                        if (tVar.f45830m == r.f45813c && !tVar.f45839w) {
                            tVar.f45839w = true;
                            b bVar2 = tVar.f45825g;
                            bVar2.b("maximum duration reached: durationMs=" + tVar.l());
                            tVar.f45823e.onMaximumDurationReached();
                            tVar.o();
                            return;
                        }
                        return;
                    default:
                        t tVar2 = this.f45791b;
                        if (tVar2.f45830m == r.f45814e && (f0Var = tVar2.A) != null && tVar2.f45838u) {
                            long J0 = f0Var.J0();
                            long j3 = tVar2.f45835r;
                            if (J0 < j3 || J0 >= tVar2.f45836s) {
                                tVar2.A.W0(5, j3);
                                J0 = tVar2.f45835r;
                            }
                            tVar2.f45823e.onPreviewProgress(J0, tVar2.l());
                            tVar2.h.postDelayed(tVar2.E, 32L);
                            return;
                        }
                        return;
                }
            }
        };
        bVar.b("session created: device=" + Build.MANUFACTURER + " " + Build.MODEL + ", sdk=" + Build.VERSION.SDK_INT + ", sampleRate=48000, noiseSuppression=" + mVar + ", minimumDurationMs=700, maximumDurationMs=0");
    }

    public static void r() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("AudioRecordingSession must be used on the main thread");
    }

    public static long s(long j3) {
        return (j3 * 1000) / 48000;
    }

    public final void a(n nVar, long j3) {
        if (j3 <= 0) {
            return;
        }
        synchronized (this.f45828k) {
            try {
                if (nVar.d && !nVar.f45804e) {
                    long j10 = nVar.f45803c;
                    if (j3 > j10) {
                        nVar.f45803c = j3;
                        this.f45827j.execute(new g(this, nVar, j10, j3 - j10, 0));
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        r();
        r rVar = this.f45830m;
        r rVar2 = r.f45818s;
        if (rVar != rVar2 && rVar != r.f45816n) {
            this.f45825g.b("cancel requested: state=" + this.f45830m);
            this.h.removeCallbacksAndMessages(null);
            q();
            m(o.f45806b);
            u(rVar2);
            org.telegram.utils.recorder.audio.b bVar = this.f45831n;
            if (bVar != null) {
                bVar.f();
            } else {
                t();
            }
        }
    }

    public final n c() {
        File e7 = e("voice");
        long j3 = this.f45837t;
        this.f45837t = 1 + j3;
        n nVar = new n(j3, e7);
        synchronized (this.f45828k) {
            this.f45842z = nVar;
            this.f45827j.execute(new mh0(this, nVar, e7, 28));
        }
        b bVar = this.f45825g;
        StringBuilder u10 = a1.g.u(j3, "output generation started: id=", ", file=");
        u10.append(e7.getName());
        bVar.b(u10.toString());
        return nVar;
    }

    public final s d() {
        return new s(this.f45830m);
    }

    public final File e(String str) {
        File file = this.f45821b;
        StringBuilder w10 = a1.g.w("audio_recording_", str, "_");
        w10.append(System.currentTimeMillis());
        w10.append("_");
        w10.append(H.getAndIncrement());
        w10.append(".ogg");
        File file2 = new File(file, w10.toString());
        synchronized (this.f45829l) {
            this.f45829l.add(file2);
        }
        return file2;
    }

    public final boolean f() {
        File file = this.f45821b;
        if ((file.isDirectory() || file.mkdirs()) && file.canWrite()) {
            return true;
        }
        i(new IllegalStateException("Output directory is not writable: " + file));
        return false;
    }

    public final void g(File file, byte[] bArr) {
        Exception runtimeException;
        byte[] bArr2;
        if (this.f45830m != r.d) {
            return;
        }
        this.B = bArr;
        try {
            q();
            f0 a2 = new i2.p(this.f45820a).a();
            this.A = a2;
            a2.o0(this.F);
            f0 f0Var = this.A;
            k0 b10 = k0.b(Uri.fromFile(file));
            f0Var.getClass();
            f0Var.I0(i0.z(b10));
            this.A.b();
            u(r.f45814e);
            k kVar = this.f45823e;
            long l4 = l();
            long j3 = this.f45835r;
            long j10 = this.f45836s;
            byte[] bArr3 = this.B;
            if (bArr3 == null) {
                bArr2 = null;
            } else {
                bArr2 = (byte[]) bArr3.clone();
            }
            kVar.onPreviewReady(l4, j3, j10, bArr2);
        } catch (Throwable th2) {
            if (th2 instanceof Exception) {
                runtimeException = th2;
            } else {
                runtimeException = new RuntimeException(th2);
            }
            i(runtimeException);
        }
    }

    public final void h(File file) {
        b bVar = this.f45825g;
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

    public final void i(Exception exc) {
        r rVar = this.f45830m;
        r rVar2 = r.f45817r;
        if (rVar != rVar2 && rVar != r.f45818s && rVar != r.f45816n) {
            b bVar = this.f45825g;
            bVar.a("fatal error in state=" + this.f45830m, exc);
            this.h.removeCallbacksAndMessages(null);
            q();
            m(o.f45807c);
            u(rVar2);
            n nVar = this.f45842z;
            if (nVar != null) {
                this.f45827j.execute(new mh0(this, nVar, exc, 29));
            }
            org.telegram.utils.recorder.audio.b bVar2 = this.f45831n;
            if (bVar2 != null) {
                bVar2.f();
            } else {
                t();
            }
            n("error");
            this.f45823e.onError(exc);
        }
    }

    public final void j() {
        r rVar = r.h;
        r();
        r rVar2 = this.f45830m;
        r rVar3 = r.f45813c;
        if (rVar2 != rVar3 && rVar2 != r.f45814e) {
            return;
        }
        b bVar = this.f45825g;
        bVar.b("finish requested: state=" + this.f45830m + ", durationMs=" + l() + ", trim=" + this.f45835r + ".." + this.f45836s);
        if (this.f45830m == rVar3) {
            this.v = true;
            this.h.removeCallbacks(this.D);
            u(rVar);
            this.f45831n.f();
            return;
        }
        q();
        u(rVar);
        final n nVar = this.f45842z;
        if (nVar == null) {
            i(new IllegalStateException("Output generation is missing"));
            return;
        }
        long s10 = s(this.f45833p);
        final long j3 = this.f45835r;
        if (j3 == 0 && this.f45836s == s10) {
            k();
            return;
        }
        final long j10 = this.f45836s;
        m(o.f45805a);
        final n c10 = c();
        this.f45826i.execute(new Runnable() {
            @Override
            public final void run() {
                t tVar;
                n nVar2 = nVar;
                n nVar3 = c10;
                long j11 = j3;
                long j12 = j10;
                t tVar2 = t.this;
                Handler handler = tVar2.h;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String absolutePath = nVar2.f45802b.getAbsolutePath();
                    File file = nVar3.f45802b;
                    String absolutePath2 = file.getAbsolutePath();
                    try {
                        if (AudioRecorderNative.b(absolutePath, absolutePath2, j11, j12)) {
                            pi.b bVar2 = tVar2.f45825g;
                            bVar2.b("final trim completed: source=" + nVar2.f45802b.getName() + ", output=" + file.getName() + ", trim=" + j11 + ".." + j12 + ", bytes=" + file.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            tVar2.a(nVar3, file.length());
                            handler.post(new to(tVar2, j12, j11, 2));
                            return;
                        }
                        throw new IllegalStateException("Unable to trim final Opus output");
                    } catch (Throwable th2) {
                        th = th2;
                        tVar = absolutePath2;
                        handler.post(new pi.e(tVar, th, 1));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    tVar = tVar2;
                }
            }
        });
    }

    public final void k() {
        if (this.f45830m != r.h) {
            return;
        }
        final n nVar = this.f45842z;
        if (nVar == null) {
            i(new IllegalStateException("Output generation is missing"));
            return;
        }
        final long l4 = l();
        if (l4 < this.f45822c) {
            b bVar = this.f45825g;
            bVar.b("recording rejected as too short: durationMs=" + l4);
            m(o.f45806b);
            u(r.f45818s);
            t();
            n("too_short");
            this.f45823e.onRecordingTooShort(l4);
            return;
        }
        this.f45826i.execute(new Runnable() {
            @Override
            public final void run() {
                byte[] bArr;
                t tVar = t.this;
                n nVar2 = nVar;
                try {
                    bArr = AudioRecorderNative.e(nVar2.f45802b.getAbsolutePath());
                } catch (Throwable th2) {
                    tVar.f45825g.a("final waveform extraction failed", th2);
                    bArr = null;
                }
                tVar.h.post(new r8(tVar, nVar2, l4, bArr, 19));
            }
        });
    }

    public final long l() {
        r();
        return s(this.f45833p + this.f45834q);
    }

    public final void m(o oVar) {
        synchronized (this.f45828k) {
            n nVar = this.f45842z;
            if (nVar != null && nVar.d && !nVar.f45804e) {
                nVar.d = false;
                this.f45827j.execute(new i(this, nVar, oVar, 0));
                b bVar = this.f45825g;
                bVar.b("output generation invalidated: id=" + nVar.f45801a + ", reason=" + oVar);
            }
        }
    }

    public final void n(String str) {
        if (this.f45841y) {
            return;
        }
        this.f45841y = true;
        StringBuilder w10 = a1.g.w("session summary: terminal=", str, ", durationMs=");
        w10.append(s(this.f45833p + this.f45834q));
        w10.append(", generations=");
        w10.append(this.f45837t - 1);
        this.f45825g.b(w10.toString());
    }

    public final boolean o() {
        r();
        if (this.f45830m == r.f45813c && this.f45831n != null) {
            this.f45825g.b("pause requested: durationMs=" + l());
            this.h.removeCallbacks(this.D);
            u(r.d);
            this.f45831n.f();
            return true;
        }
        return false;
    }

    public final void p() {
        r();
        r rVar = this.f45830m;
        r rVar2 = r.f45818s;
        if (rVar == rVar2) {
            return;
        }
        if (rVar != r.f45816n) {
            b();
            return;
        }
        q();
        t();
        u(rVar2);
        n("released");
    }

    public final void q() {
        this.h.removeCallbacks(this.E);
        this.f45838u = false;
        f0 f0Var = this.A;
        if (f0Var != null) {
            f0Var.D(this.F);
            this.A.U0();
            this.A = null;
        }
    }

    public final void t() {
        File file;
        if (this.f45840x) {
            return;
        }
        this.f45840x = true;
        q qVar = this.C;
        if (qVar == null) {
            file = null;
        } else {
            file = qVar.f45808a;
        }
        this.f45826i.execute(new c(this, file, 0));
    }

    public final void u(r rVar) {
        r rVar2 = this.f45830m;
        if (rVar2 == rVar) {
            return;
        }
        this.f45830m = rVar;
        this.f45825g.b("state: " + rVar2 + " -> " + rVar + ", durationMs=" + s(this.f45833p + this.f45834q));
        this.f45823e.onStateChanged(d());
    }

    public final boolean v(long j3, long j10) {
        r();
        if (this.f45830m == r.f45814e) {
            long l4 = l();
            long max = Math.max(0L, Math.min(l4, j3));
            long max2 = Math.max(max, Math.min(l4, j10));
            if (max2 - max < Math.min(this.f45822c, l4)) {
                return false;
            }
            this.f45835r = max;
            this.f45836s = max2;
            f0 f0Var = this.A;
            if (f0Var != null) {
                f0Var.W0(5, max);
            }
            long j11 = this.f45835r;
            k kVar = this.f45823e;
            kVar.onPreviewProgress(j11, l4);
            kVar.onStateChanged(d());
            return true;
        }
        return false;
    }

    public final void w(File file) {
        long j3 = this.f45832o + 1;
        this.f45832o = j3;
        n nVar = this.f45842z;
        if (nVar == null) {
            i(new IllegalStateException("Output generation is missing"));
            return;
        }
        final org.telegram.utils.recorder.audio.b bVar = new org.telegram.utils.recorder.audio.b(nVar.f45802b, file, this.d, this.f45825g, new bc.e(this, nVar, j3));
        this.f45831n = bVar;
        this.f45834q = 0L;
        bVar.f44961g.post(new Runnable() {
            @Override
            public final void run() {
                String name;
                b bVar2 = b.this;
                try {
                    if (bVar2.f44963j) {
                        bVar2.e();
                        return;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AudioRecorderNative a2 = AudioRecorderNative.a(bVar2.f44956a, bVar2.f44957b);
                    bVar2.f44965l = a2;
                    if (a2 != null) {
                        if (bVar2.f44958c == m.f45799b) {
                            AudioNoiseSuppressor a10 = AudioNoiseSuppressor.a();
                            bVar2.f44966m = a10;
                            if (a10 == null) {
                                bVar2.d.b("RNNoise unavailable; recording unprocessed PCM");
                            } else {
                                bVar2.d.b("RNNoise started: sampleRate=48000, captureFrameSamples=960");
                            }
                        }
                        long d = bVar2.f44965l.d();
                        pi.b bVar3 = bVar2.d;
                        StringBuilder sb2 = new StringBuilder("Opus encoder started: prefix=");
                        File file2 = bVar2.f44957b;
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
                        if (bVar2.f44963j) {
                            bVar2.e();
                            return;
                        }
                        int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                        if (minBufferSize <= 0) {
                            minBufferSize = 7680;
                        }
                        int max = Math.max(minBufferSize * 2, 7680);
                        AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                        bVar2.f44964k = audioRecord;
                        if (audioRecord.getState() == 1) {
                            bVar2.f44964k.startRecording();
                            if (bVar2.f44964k.getRecordingState() == 3) {
                                bVar2.d.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + bVar2.f44964k.getAudioSessionId());
                                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                bVar2.f44971r = elapsedRealtime2;
                                bVar2.f44970q = elapsedRealtime2;
                                bc.e eVar = bVar2.f44959e;
                                long max2 = Math.max(0L, d);
                                t tVar = (t) eVar.f3855c;
                                tVar.a((n) eVar.f3854b, max2);
                                tVar.h.post(new d0(eVar, eVar.f3853a, 1));
                                bVar2.f44961g.post(new pi.a(bVar2, 1));
                                return;
                            }
                            throw new IllegalStateException("Unable to start AudioRecord");
                        }
                        throw new IllegalStateException("Unable to initialize AudioRecord");
                    }
                    throw new IllegalStateException("Unable to initialize native Opus recorder");
                } catch (Throwable th2) {
                    bVar2.d.a("capture failed", th2);
                    bVar2.f44963j = true;
                    bVar2.f44968o = b.b(th2);
                    try {
                        bVar2.e();
                    } catch (Throwable th3) {
                        bVar2.f44968o.addSuppressed(th3);
                    }
                }
            }
        });
    }
}
