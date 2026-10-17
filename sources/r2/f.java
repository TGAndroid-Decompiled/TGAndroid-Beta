package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.j0;
import java.util.ArrayDeque;
import ki.t1;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f44939b;
    public Handler f44940c;
    public MediaFormat h;
    public MediaFormat f44943i;
    public MediaCodec.CodecException f44944j;
    public MediaCodec.CryptoException f44945k;
    public long f44946l;
    public boolean f44947m;
    public IllegalStateException f44948n;
    public t1 f44949o;
    public final Object f44938a = new Object();
    public final e2.f d = new e2.f();
    public final e2.f e = new e2.f();
    public final ArrayDeque f44941f = new ArrayDeque();
    public final ArrayDeque f44942g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f44939b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f44942g;
        if (!arrayDeque.isEmpty()) {
            this.f44943i = (MediaFormat) arrayDeque.getLast();
        }
        e2.f fVar = this.d;
        fVar.f8224b = fVar.f8223a;
        e2.f fVar2 = this.e;
        fVar2.f8224b = fVar2.f8223a;
        this.f44941f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f44948n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f44944j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f44945k;
                if (cryptoException == null) {
                    return;
                }
                this.f44945k = null;
                throw cryptoException;
            }
            this.f44944j = null;
            throw codecException;
        }
        this.f44948n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f44938a) {
            this.f44948n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f44938a) {
            this.f44945k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f44938a) {
            this.f44944j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        j0 j0Var;
        synchronized (this.f44938a) {
            this.d.a(i10);
            t1 t1Var = this.f44949o;
            if (t1Var != null && (j0Var = ((r) t1Var.f15519b).Y) != null) {
                j0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        j0 j0Var;
        synchronized (this.f44938a) {
            try {
                MediaFormat mediaFormat = this.f44943i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f44942g.add(mediaFormat);
                    this.f44943i = null;
                }
                this.e.a(i10);
                this.f44941f.add(bufferInfo);
                t1 t1Var = this.f44949o;
                if (t1Var != null && (j0Var = ((r) t1Var.f15519b).Y) != null) {
                    j0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f44938a) {
            this.e.a(-2);
            this.f44942g.add(mediaFormat);
            this.f44943i = null;
        }
    }
}
