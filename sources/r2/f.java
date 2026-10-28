package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.m0;
import java.util.ArrayDeque;
import li.h5;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f47239b;
    public Handler f47240c;
    public MediaFormat h;
    public MediaFormat f47243i;
    public MediaCodec.CodecException f47244j;
    public MediaCodec.CryptoException f47245k;
    public long f47246l;
    public boolean f47247m;
    public IllegalStateException f47248n;
    public h5 f47249o;
    public final Object f47238a = new Object();
    public final e2.f d = new e2.f();
    public final e2.f e = new e2.f();
    public final ArrayDeque f47241f = new ArrayDeque();
    public final ArrayDeque f47242g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f47239b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f47242g;
        if (!arrayDeque.isEmpty()) {
            this.f47243i = (MediaFormat) arrayDeque.getLast();
        }
        e2.f fVar = this.d;
        fVar.f9656b = fVar.f9655a;
        e2.f fVar2 = this.e;
        fVar2.f9656b = fVar2.f9655a;
        this.f47241f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f47248n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f47244j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f47245k;
                if (cryptoException == null) {
                    return;
                }
                this.f47245k = null;
                throw cryptoException;
            }
            this.f47244j = null;
            throw codecException;
        }
        this.f47248n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f47238a) {
            this.f47248n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f47238a) {
            this.f47245k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f47238a) {
            this.f47244j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        m0 m0Var;
        synchronized (this.f47238a) {
            this.d.a(i10);
            h5 h5Var = this.f47249o;
            if (h5Var != null && (m0Var = ((r) h5Var.f17284a).Y) != null) {
                m0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        m0 m0Var;
        synchronized (this.f47238a) {
            try {
                MediaFormat mediaFormat = this.f47243i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f47242g.add(mediaFormat);
                    this.f47243i = null;
                }
                this.e.a(i10);
                this.f47241f.add(bufferInfo);
                h5 h5Var = this.f47249o;
                if (h5Var != null && (m0Var = ((r) h5Var.f17284a).Y) != null) {
                    m0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f47238a) {
            this.e.a(-2);
            this.f47242g.add(mediaFormat);
            this.f47243i = null;
        }
    }
}
