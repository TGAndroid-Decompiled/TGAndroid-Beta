package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import l2.i0;
import org.telegram.ui.Cells.c5;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f58357b;
    public Handler f58358c;
    public MediaFormat h;
    public MediaFormat f58362i;
    public MediaCodec.CodecException f58363j;
    public MediaCodec.CryptoException f58364k;
    public long f58365l;
    public boolean f58366m;
    public IllegalStateException f58367n;
    public c5 f58368o;
    public final Object f58356a = new Object();
    public final h2.f d = new h2.f(0);
    public final h2.f f58359e = new h2.f(0);
    public final ArrayDeque f58360f = new ArrayDeque();
    public final ArrayDeque f58361g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f58357b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f58361g;
        if (!arrayDeque.isEmpty()) {
            this.f58362i = (MediaFormat) arrayDeque.getLast();
        }
        h2.f fVar = this.d;
        fVar.f13782b = fVar.f13781a;
        h2.f fVar2 = this.f58359e;
        fVar2.f13782b = fVar2.f13781a;
        this.f58360f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f58367n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f58363j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f58364k;
                if (cryptoException == null) {
                    return;
                }
                this.f58364k = null;
                throw cryptoException;
            }
            this.f58363j = null;
            throw codecException;
        }
        this.f58367n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f58356a) {
            this.f58367n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f58356a) {
            this.f58364k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f58356a) {
            this.f58363j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        i0 i0Var;
        synchronized (this.f58356a) {
            this.d.a(i7);
            c5 c5Var = this.f58368o;
            if (c5Var != null && (i0Var = ((r) c5Var.f30505a).Z) != null) {
                i0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        i0 i0Var;
        synchronized (this.f58356a) {
            try {
                MediaFormat mediaFormat = this.f58362i;
                if (mediaFormat != null) {
                    this.f58359e.a(-2);
                    this.f58361g.add(mediaFormat);
                    this.f58362i = null;
                }
                this.f58359e.a(i7);
                this.f58360f.add(bufferInfo);
                c5 c5Var = this.f58368o;
                if (c5Var != null && (i0Var = ((r) c5Var.f30505a).Z) != null) {
                    i0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f58356a) {
            this.f58359e.a(-2);
            this.f58361g.add(mediaFormat);
            this.f58362i = null;
        }
    }
}
