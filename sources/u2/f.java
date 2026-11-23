package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import l2.j0;
import org.telegram.ui.Components.nd0;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f58441b;
    public Handler f58442c;
    public MediaFormat h;
    public MediaFormat f58446i;
    public MediaCodec.CodecException f58447j;
    public MediaCodec.CryptoException f58448k;
    public long f58449l;
    public boolean f58450m;
    public IllegalStateException f58451n;
    public nd0 f58452o;
    public final Object f58440a = new Object();
    public final h2.f d = new h2.f(0);
    public final h2.f f58443e = new h2.f(0);
    public final ArrayDeque f58444f = new ArrayDeque();
    public final ArrayDeque f58445g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f58441b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f58445g;
        if (!arrayDeque.isEmpty()) {
            this.f58446i = (MediaFormat) arrayDeque.getLast();
        }
        h2.f fVar = this.d;
        fVar.f13748b = fVar.f13747a;
        h2.f fVar2 = this.f58443e;
        fVar2.f13748b = fVar2.f13747a;
        this.f58444f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f58451n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f58447j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f58448k;
                if (cryptoException == null) {
                    return;
                }
                this.f58448k = null;
                throw cryptoException;
            }
            this.f58447j = null;
            throw codecException;
        }
        this.f58451n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f58440a) {
            this.f58451n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f58440a) {
            this.f58448k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f58440a) {
            this.f58447j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        j0 j0Var;
        synchronized (this.f58440a) {
            this.d.a(i7);
            nd0 nd0Var = this.f58452o;
            if (nd0Var != null && (j0Var = ((r) nd0Var.f37766b).Z) != null) {
                j0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        j0 j0Var;
        synchronized (this.f58440a) {
            try {
                MediaFormat mediaFormat = this.f58446i;
                if (mediaFormat != null) {
                    this.f58443e.a(-2);
                    this.f58445g.add(mediaFormat);
                    this.f58446i = null;
                }
                this.f58443e.a(i7);
                this.f58444f.add(bufferInfo);
                nd0 nd0Var = this.f58452o;
                if (nd0Var != null && (j0Var = ((r) nd0Var.f37766b).Z) != null) {
                    j0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f58440a) {
            this.f58443e.a(-2);
            this.f58445g.add(mediaFormat);
            this.f58446i = null;
        }
    }
}
