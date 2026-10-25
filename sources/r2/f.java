package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.m0;
import java.util.ArrayDeque;
import li.h5;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f47201b;
    public Handler f47202c;
    public MediaFormat h;
    public MediaFormat f47205i;
    public MediaCodec.CodecException f47206j;
    public MediaCodec.CryptoException f47207k;
    public long f47208l;
    public boolean f47209m;
    public IllegalStateException f47210n;
    public h5 f47211o;
    public final Object f47200a = new Object();
    public final e2.f d = new e2.f();
    public final e2.f e = new e2.f();
    public final ArrayDeque f47203f = new ArrayDeque();
    public final ArrayDeque f47204g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f47201b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f47204g;
        if (!arrayDeque.isEmpty()) {
            this.f47205i = (MediaFormat) arrayDeque.getLast();
        }
        e2.f fVar = this.d;
        fVar.f9657b = fVar.f9656a;
        e2.f fVar2 = this.e;
        fVar2.f9657b = fVar2.f9656a;
        this.f47203f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f47210n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f47206j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f47207k;
                if (cryptoException == null) {
                    return;
                }
                this.f47207k = null;
                throw cryptoException;
            }
            this.f47206j = null;
            throw codecException;
        }
        this.f47210n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f47200a) {
            this.f47210n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f47200a) {
            this.f47207k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f47200a) {
            this.f47206j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        m0 m0Var;
        synchronized (this.f47200a) {
            this.d.a(i10);
            h5 h5Var = this.f47211o;
            if (h5Var != null && (m0Var = ((r) h5Var.f17285a).Y) != null) {
                m0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        m0 m0Var;
        synchronized (this.f47200a) {
            try {
                MediaFormat mediaFormat = this.f47205i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f47204g.add(mediaFormat);
                    this.f47205i = null;
                }
                this.e.a(i10);
                this.f47203f.add(bufferInfo);
                h5 h5Var = this.f47211o;
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
        synchronized (this.f47200a) {
            this.e.a(-2);
            this.f47204g.add(mediaFormat);
            this.f47205i = null;
        }
    }
}
