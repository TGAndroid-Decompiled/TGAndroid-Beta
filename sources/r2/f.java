package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.l0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f44925b;
    public Handler f44926c;
    public MediaFormat h;
    public MediaFormat f44929i;
    public MediaCodec.CodecException f44930j;
    public MediaCodec.CryptoException f44931k;
    public long f44932l;
    public boolean f44933m;
    public IllegalStateException f44934n;
    public l2.f f44935o;
    public final Object f44924a = new Object();
    public final e2.f d = new e2.f();
    public final e2.f e = new e2.f();
    public final ArrayDeque f44927f = new ArrayDeque();
    public final ArrayDeque f44928g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f44925b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f44928g;
        if (!arrayDeque.isEmpty()) {
            this.f44929i = (MediaFormat) arrayDeque.getLast();
        }
        e2.f fVar = this.d;
        fVar.f8222b = fVar.f8221a;
        e2.f fVar2 = this.e;
        fVar2.f8222b = fVar2.f8221a;
        this.f44927f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f44934n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f44930j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f44931k;
                if (cryptoException == null) {
                    return;
                }
                this.f44931k = null;
                throw cryptoException;
            }
            this.f44930j = null;
            throw codecException;
        }
        this.f44934n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f44924a) {
            this.f44934n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f44924a) {
            this.f44931k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f44924a) {
            this.f44930j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        l0 l0Var;
        synchronized (this.f44924a) {
            this.d.a(i10);
            l2.f fVar = this.f44935o;
            if (fVar != null && (l0Var = ((r) fVar.f15843b).Y) != null) {
                l0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        l0 l0Var;
        synchronized (this.f44924a) {
            try {
                MediaFormat mediaFormat = this.f44929i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f44928g.add(mediaFormat);
                    this.f44929i = null;
                }
                this.e.a(i10);
                this.f44927f.add(bufferInfo);
                l2.f fVar = this.f44935o;
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
        synchronized (this.f44924a) {
            this.e.a(-2);
            this.f44928g.add(mediaFormat);
            this.f44929i = null;
        }
    }
}
