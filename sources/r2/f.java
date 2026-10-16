package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.l0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f43583b;
    public Handler f43584c;
    public MediaFormat h;
    public MediaFormat f43587i;
    public MediaCodec.CodecException f43588j;
    public MediaCodec.CryptoException f43589k;
    public long f43590l;
    public boolean f43591m;
    public IllegalStateException f43592n;
    public m.l f43593o;
    public final Object f43582a = new Object();
    public final e2.f d = new e2.f();
    public final e2.f e = new e2.f();
    public final ArrayDeque f43585f = new ArrayDeque();
    public final ArrayDeque f43586g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f43583b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f43586g;
        if (!arrayDeque.isEmpty()) {
            this.f43587i = (MediaFormat) arrayDeque.getLast();
        }
        e2.f fVar = this.d;
        fVar.f8345b = fVar.f8344a;
        e2.f fVar2 = this.e;
        fVar2.f8345b = fVar2.f8344a;
        this.f43585f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f43592n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f43588j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f43589k;
                if (cryptoException == null) {
                    return;
                }
                this.f43589k = null;
                throw cryptoException;
            }
            this.f43588j = null;
            throw codecException;
        }
        this.f43592n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f43582a) {
            this.f43592n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f43582a) {
            this.f43589k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f43582a) {
            this.f43588j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        l0 l0Var;
        synchronized (this.f43582a) {
            this.d.a(i10);
            m.l lVar = this.f43593o;
            if (lVar != null && (l0Var = ((r) lVar.f14889a).Y) != null) {
                l0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        l0 l0Var;
        synchronized (this.f43582a) {
            try {
                MediaFormat mediaFormat = this.f43587i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f43586g.add(mediaFormat);
                    this.f43587i = null;
                }
                this.e.a(i10);
                this.f43585f.add(bufferInfo);
                m.l lVar = this.f43593o;
                if (lVar != null && (l0Var = ((r) lVar.f14889a).Y) != null) {
                    l0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f43582a) {
            this.e.a(-2);
            this.f43586g.add(mediaFormat);
            this.f43587i = null;
        }
    }
}
