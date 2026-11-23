package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import l2.i0;
import org.telegram.ui.Cells.c5;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f58361b;
    public Handler f58362c;
    public MediaFormat h;
    public MediaFormat f58366i;
    public MediaCodec.CodecException f58367j;
    public MediaCodec.CryptoException f58368k;
    public long f58369l;
    public boolean f58370m;
    public IllegalStateException f58371n;
    public c5 f58372o;
    public final Object f58360a = new Object();
    public final h2.f d = new h2.f(0);
    public final h2.f f58363e = new h2.f(0);
    public final ArrayDeque f58364f = new ArrayDeque();
    public final ArrayDeque f58365g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f58361b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f58365g;
        if (!arrayDeque.isEmpty()) {
            this.f58366i = (MediaFormat) arrayDeque.getLast();
        }
        h2.f fVar = this.d;
        fVar.f13785b = fVar.f13784a;
        h2.f fVar2 = this.f58363e;
        fVar2.f13785b = fVar2.f13784a;
        this.f58364f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f58371n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f58367j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f58368k;
                if (cryptoException == null) {
                    return;
                }
                this.f58368k = null;
                throw cryptoException;
            }
            this.f58367j = null;
            throw codecException;
        }
        this.f58371n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f58360a) {
            this.f58371n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f58360a) {
            this.f58368k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f58360a) {
            this.f58367j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        i0 i0Var;
        synchronized (this.f58360a) {
            this.d.a(i7);
            c5 c5Var = this.f58372o;
            if (c5Var != null && (i0Var = ((r) c5Var.f30508a).Z) != null) {
                i0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        i0 i0Var;
        synchronized (this.f58360a) {
            try {
                MediaFormat mediaFormat = this.f58366i;
                if (mediaFormat != null) {
                    this.f58363e.a(-2);
                    this.f58365g.add(mediaFormat);
                    this.f58366i = null;
                }
                this.f58363e.a(i7);
                this.f58364f.add(bufferInfo);
                c5 c5Var = this.f58372o;
                if (c5Var != null && (i0Var = ((r) c5Var.f30508a).Z) != null) {
                    i0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f58360a) {
            this.f58363e.a(-2);
            this.f58365g.add(mediaFormat);
            this.f58366i = null;
        }
    }
}
