package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import l2.i0;
import org.telegram.ui.Cells.c5;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f58326b;
    public Handler f58327c;
    public MediaFormat h;
    public MediaFormat f58331i;
    public MediaCodec.CodecException f58332j;
    public MediaCodec.CryptoException f58333k;
    public long f58334l;
    public boolean f58335m;
    public IllegalStateException f58336n;
    public c5 f58337o;
    public final Object f58325a = new Object();
    public final h2.f d = new h2.f(0);
    public final h2.f f58328e = new h2.f(0);
    public final ArrayDeque f58329f = new ArrayDeque();
    public final ArrayDeque f58330g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f58326b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f58330g;
        if (!arrayDeque.isEmpty()) {
            this.f58331i = (MediaFormat) arrayDeque.getLast();
        }
        h2.f fVar = this.d;
        fVar.f13748b = fVar.f13747a;
        h2.f fVar2 = this.f58328e;
        fVar2.f13748b = fVar2.f13747a;
        this.f58329f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f58336n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f58332j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f58333k;
                if (cryptoException == null) {
                    return;
                }
                this.f58333k = null;
                throw cryptoException;
            }
            this.f58332j = null;
            throw codecException;
        }
        this.f58336n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f58325a) {
            this.f58336n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f58325a) {
            this.f58333k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f58325a) {
            this.f58332j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        i0 i0Var;
        synchronized (this.f58325a) {
            this.d.a(i7);
            c5 c5Var = this.f58337o;
            if (c5Var != null && (i0Var = ((r) c5Var.f30474a).Z) != null) {
                i0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        i0 i0Var;
        synchronized (this.f58325a) {
            try {
                MediaFormat mediaFormat = this.f58331i;
                if (mediaFormat != null) {
                    this.f58328e.a(-2);
                    this.f58330g.add(mediaFormat);
                    this.f58331i = null;
                }
                this.f58328e.a(i7);
                this.f58329f.add(bufferInfo);
                c5 c5Var = this.f58337o;
                if (c5Var != null && (i0Var = ((r) c5Var.f30474a).Z) != null) {
                    i0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f58325a) {
            this.f58328e.a(-2);
            this.f58330g.add(mediaFormat);
            this.f58331i = null;
        }
    }
}
