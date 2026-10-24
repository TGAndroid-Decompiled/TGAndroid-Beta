package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.k0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f45336b;
    public Handler f45337c;
    public MediaFormat h;
    public MediaFormat f45340i;
    public MediaCodec.CodecException f45341j;
    public MediaCodec.CryptoException f45342k;
    public long f45343l;
    public boolean f45344m;
    public IllegalStateException f45345n;
    public l2.f f45346o;
    public final Object f45335a = new Object();
    public final e2.f d = new e2.f();
    public final e2.f e = new e2.f();
    public final ArrayDeque f45338f = new ArrayDeque();
    public final ArrayDeque f45339g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f45336b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f45339g;
        if (!arrayDeque.isEmpty()) {
            this.f45340i = (MediaFormat) arrayDeque.getLast();
        }
        e2.f fVar = this.d;
        fVar.f8229b = fVar.f8228a;
        e2.f fVar2 = this.e;
        fVar2.f8229b = fVar2.f8228a;
        this.f45338f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f45345n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f45341j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f45342k;
                if (cryptoException == null) {
                    return;
                }
                this.f45342k = null;
                throw cryptoException;
            }
            this.f45341j = null;
            throw codecException;
        }
        this.f45345n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f45335a) {
            this.f45345n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f45335a) {
            this.f45342k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f45335a) {
            this.f45341j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        k0 k0Var;
        synchronized (this.f45335a) {
            this.d.a(i10);
            l2.f fVar = this.f45346o;
            if (fVar != null && (k0Var = ((r) fVar.f15906b).Y) != null) {
                k0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        k0 k0Var;
        synchronized (this.f45335a) {
            try {
                MediaFormat mediaFormat = this.f45340i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f45339g.add(mediaFormat);
                    this.f45340i = null;
                }
                this.e.a(i10);
                this.f45338f.add(bufferInfo);
                l2.f fVar = this.f45346o;
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
        synchronized (this.f45335a) {
            this.e.a(-2);
            this.f45339g.add(mediaFormat);
            this.f45340i = null;
        }
    }
}
