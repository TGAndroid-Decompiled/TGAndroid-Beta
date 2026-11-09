package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import l2.l0;
import org.telegram.ui.Components.rt;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f56250b;
    public Handler f56251c;
    public MediaFormat h;
    public MediaFormat f56255i;
    public MediaCodec.CodecException f56256j;
    public MediaCodec.CryptoException f56257k;
    public long f56258l;
    public boolean f56259m;
    public IllegalStateException f56260n;
    public rt f56261o;
    public final Object f56249a = new Object();
    public final h2.f d = new h2.f(0);
    public final h2.f f56252e = new h2.f(0);
    public final ArrayDeque f56253f = new ArrayDeque();
    public final ArrayDeque f56254g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f56250b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f56254g;
        if (!arrayDeque.isEmpty()) {
            this.f56255i = (MediaFormat) arrayDeque.getLast();
        }
        h2.f fVar = this.d;
        fVar.f14081b = fVar.f14080a;
        h2.f fVar2 = this.f56252e;
        fVar2.f14081b = fVar2.f14080a;
        this.f56253f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f56260n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f56256j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f56257k;
                if (cryptoException == null) {
                    return;
                }
                this.f56257k = null;
                throw cryptoException;
            }
            this.f56256j = null;
            throw codecException;
        }
        this.f56260n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f56249a) {
            this.f56260n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f56249a) {
            this.f56257k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f56249a) {
            this.f56256j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        l0 l0Var;
        synchronized (this.f56249a) {
            this.d.a(i7);
            rt rtVar = this.f56261o;
            if (rtVar != null && (l0Var = ((r) rtVar.f37805b).Y) != null) {
                l0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        l0 l0Var;
        synchronized (this.f56249a) {
            try {
                MediaFormat mediaFormat = this.f56255i;
                if (mediaFormat != null) {
                    this.f56252e.a(-2);
                    this.f56254g.add(mediaFormat);
                    this.f56255i = null;
                }
                this.f56252e.a(i7);
                this.f56253f.add(bufferInfo);
                rt rtVar = this.f56261o;
                if (rtVar != null && (l0Var = ((r) rtVar.f37805b).Y) != null) {
                    l0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f56249a) {
            this.f56252e.a(-2);
            this.f56254g.add(mediaFormat);
            this.f56255i = null;
        }
    }
}
