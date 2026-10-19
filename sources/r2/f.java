package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.l0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f44913b;
    public Handler f44914c;
    public MediaFormat h;
    public MediaFormat f44917i;
    public MediaCodec.CodecException f44918j;
    public MediaCodec.CryptoException f44919k;
    public long f44920l;
    public boolean f44921m;
    public IllegalStateException f44922n;
    public l2.f f44923o;
    public final Object f44912a = new Object();
    public final e2.f d = new e2.f();
    public final e2.f e = new e2.f();
    public final ArrayDeque f44915f = new ArrayDeque();
    public final ArrayDeque f44916g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f44913b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f44916g;
        if (!arrayDeque.isEmpty()) {
            this.f44917i = (MediaFormat) arrayDeque.getLast();
        }
        e2.f fVar = this.d;
        fVar.f8222b = fVar.f8221a;
        e2.f fVar2 = this.e;
        fVar2.f8222b = fVar2.f8221a;
        this.f44915f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f44922n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f44918j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f44919k;
                if (cryptoException == null) {
                    return;
                }
                this.f44919k = null;
                throw cryptoException;
            }
            this.f44918j = null;
            throw codecException;
        }
        this.f44922n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f44912a) {
            this.f44922n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f44912a) {
            this.f44919k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f44912a) {
            this.f44918j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        l0 l0Var;
        synchronized (this.f44912a) {
            this.d.a(i10);
            l2.f fVar = this.f44923o;
            if (fVar != null && (l0Var = ((r) fVar.f15843b).Y) != null) {
                l0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        l0 l0Var;
        synchronized (this.f44912a) {
            try {
                MediaFormat mediaFormat = this.f44917i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f44916g.add(mediaFormat);
                    this.f44917i = null;
                }
                this.e.a(i10);
                this.f44915f.add(bufferInfo);
                l2.f fVar = this.f44923o;
                if (fVar != null && (l0Var = ((r) fVar.f15843b).Y) != null) {
                    l0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f44912a) {
            this.e.a(-2);
            this.f44916g.add(mediaFormat);
            this.f44917i = null;
        }
    }
}
