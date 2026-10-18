package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.k0;
import java.util.ArrayDeque;
import ki.t1;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f44959b;
    public Handler f44960c;
    public MediaFormat h;
    public MediaFormat f44963i;
    public MediaCodec.CodecException f44964j;
    public MediaCodec.CryptoException f44965k;
    public long f44966l;
    public boolean f44967m;
    public IllegalStateException f44968n;
    public t1 f44969o;
    public final Object f44958a = new Object();
    public final e2.f d = new e2.f();
    public final e2.f e = new e2.f();
    public final ArrayDeque f44961f = new ArrayDeque();
    public final ArrayDeque f44962g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f44959b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f44962g;
        if (!arrayDeque.isEmpty()) {
            this.f44963i = (MediaFormat) arrayDeque.getLast();
        }
        e2.f fVar = this.d;
        fVar.f8225b = fVar.f8224a;
        e2.f fVar2 = this.e;
        fVar2.f8225b = fVar2.f8224a;
        this.f44961f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f44968n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f44964j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f44965k;
                if (cryptoException == null) {
                    return;
                }
                this.f44965k = null;
                throw cryptoException;
            }
            this.f44964j = null;
            throw codecException;
        }
        this.f44968n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f44958a) {
            this.f44968n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f44958a) {
            this.f44965k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f44958a) {
            this.f44964j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        k0 k0Var;
        synchronized (this.f44958a) {
            this.d.a(i10);
            t1 t1Var = this.f44969o;
            if (t1Var != null && (k0Var = ((r) t1Var.f15526b).Y) != null) {
                k0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        k0 k0Var;
        synchronized (this.f44958a) {
            try {
                MediaFormat mediaFormat = this.f44963i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f44962g.add(mediaFormat);
                    this.f44963i = null;
                }
                this.e.a(i10);
                this.f44961f.add(bufferInfo);
                t1 t1Var = this.f44969o;
                if (t1Var != null && (k0Var = ((r) t1Var.f15526b).Y) != null) {
                    k0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f44958a) {
            this.e.a(-2);
            this.f44962g.add(mediaFormat);
            this.f44963i = null;
        }
    }
}
