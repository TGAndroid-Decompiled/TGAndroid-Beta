package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.m0;
import java.util.ArrayDeque;
import li.h5;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f47204b;
    public Handler f47205c;
    public MediaFormat h;
    public MediaFormat f47208i;
    public MediaCodec.CodecException f47209j;
    public MediaCodec.CryptoException f47210k;
    public long f47211l;
    public boolean f47212m;
    public IllegalStateException f47213n;
    public h5 f47214o;
    public final Object f47203a = new Object();
    public final e2.f d = new e2.f();
    public final e2.f e = new e2.f();
    public final ArrayDeque f47206f = new ArrayDeque();
    public final ArrayDeque f47207g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f47204b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f47207g;
        if (!arrayDeque.isEmpty()) {
            this.f47208i = (MediaFormat) arrayDeque.getLast();
        }
        e2.f fVar = this.d;
        fVar.f9657b = fVar.f9656a;
        e2.f fVar2 = this.e;
        fVar2.f9657b = fVar2.f9656a;
        this.f47206f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f47213n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f47209j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f47210k;
                if (cryptoException == null) {
                    return;
                }
                this.f47210k = null;
                throw cryptoException;
            }
            this.f47209j = null;
            throw codecException;
        }
        this.f47213n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f47203a) {
            this.f47213n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f47203a) {
            this.f47210k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f47203a) {
            this.f47209j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        m0 m0Var;
        synchronized (this.f47203a) {
            this.d.a(i10);
            h5 h5Var = this.f47214o;
            if (h5Var != null && (m0Var = ((r) h5Var.f17285a).Y) != null) {
                m0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        m0 m0Var;
        synchronized (this.f47203a) {
            try {
                MediaFormat mediaFormat = this.f47208i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f47207g.add(mediaFormat);
                    this.f47208i = null;
                }
                this.e.a(i10);
                this.f47206f.add(bufferInfo);
                h5 h5Var = this.f47214o;
                if (h5Var != null && (m0Var = ((r) h5Var.f17285a).Y) != null) {
                    m0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f47203a) {
            this.e.a(-2);
            this.f47207g.add(mediaFormat);
            this.f47208i = null;
        }
    }
}
