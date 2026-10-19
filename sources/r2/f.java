package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.l0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f44911b;
    public Handler f44912c;
    public MediaFormat h;
    public MediaFormat f44915i;
    public MediaCodec.CodecException f44916j;
    public MediaCodec.CryptoException f44917k;
    public long f44918l;
    public boolean f44919m;
    public IllegalStateException f44920n;
    public l2.f f44921o;
    public final Object f44910a = new Object();
    public final e2.f d = new e2.f();
    public final e2.f e = new e2.f();
    public final ArrayDeque f44913f = new ArrayDeque();
    public final ArrayDeque f44914g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f44911b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f44914g;
        if (!arrayDeque.isEmpty()) {
            this.f44915i = (MediaFormat) arrayDeque.getLast();
        }
        e2.f fVar = this.d;
        fVar.f8224b = fVar.f8223a;
        e2.f fVar2 = this.e;
        fVar2.f8224b = fVar2.f8223a;
        this.f44913f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f44920n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f44916j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f44917k;
                if (cryptoException == null) {
                    return;
                }
                this.f44917k = null;
                throw cryptoException;
            }
            this.f44916j = null;
            throw codecException;
        }
        this.f44920n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f44910a) {
            this.f44920n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f44910a) {
            this.f44917k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f44910a) {
            this.f44916j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        l0 l0Var;
        synchronized (this.f44910a) {
            this.d.a(i10);
            l2.f fVar = this.f44921o;
            if (fVar != null && (l0Var = ((r) fVar.f15845b).Y) != null) {
                l0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        l0 l0Var;
        synchronized (this.f44910a) {
            try {
                MediaFormat mediaFormat = this.f44915i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f44914g.add(mediaFormat);
                    this.f44915i = null;
                }
                this.e.a(i10);
                this.f44913f.add(bufferInfo);
                l2.f fVar = this.f44921o;
                if (fVar != null && (l0Var = ((r) fVar.f15845b).Y) != null) {
                    l0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f44910a) {
            this.e.a(-2);
            this.f44914g.add(mediaFormat);
            this.f44915i = null;
        }
    }
}
