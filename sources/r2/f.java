package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.k0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f45337b;
    public Handler f45338c;
    public MediaFormat h;
    public MediaFormat f45341i;
    public MediaCodec.CodecException f45342j;
    public MediaCodec.CryptoException f45343k;
    public long f45344l;
    public boolean f45345m;
    public IllegalStateException f45346n;
    public l2.f f45347o;
    public final Object f45336a = new Object();
    public final e2.f d = new e2.f();
    public final e2.f e = new e2.f();
    public final ArrayDeque f45339f = new ArrayDeque();
    public final ArrayDeque f45340g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f45337b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f45340g;
        if (!arrayDeque.isEmpty()) {
            this.f45341i = (MediaFormat) arrayDeque.getLast();
        }
        e2.f fVar = this.d;
        fVar.f8229b = fVar.f8228a;
        e2.f fVar2 = this.e;
        fVar2.f8229b = fVar2.f8228a;
        this.f45339f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f45346n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f45342j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f45343k;
                if (cryptoException == null) {
                    return;
                }
                this.f45343k = null;
                throw cryptoException;
            }
            this.f45342j = null;
            throw codecException;
        }
        this.f45346n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f45336a) {
            this.f45346n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f45336a) {
            this.f45343k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f45336a) {
            this.f45342j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        k0 k0Var;
        synchronized (this.f45336a) {
            this.d.a(i10);
            l2.f fVar = this.f45347o;
            if (fVar != null && (k0Var = ((r) fVar.f15906b).Y) != null) {
                k0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        k0 k0Var;
        synchronized (this.f45336a) {
            try {
                MediaFormat mediaFormat = this.f45341i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f45340g.add(mediaFormat);
                    this.f45341i = null;
                }
                this.e.a(i10);
                this.f45339f.add(bufferInfo);
                l2.f fVar = this.f45347o;
                if (fVar != null && (k0Var = ((r) fVar.f15906b).Y) != null) {
                    k0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f45336a) {
            this.e.a(-2);
            this.f45340g.add(mediaFormat);
            this.f45341i = null;
        }
    }
}
