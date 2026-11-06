package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import l2.l0;
import org.telegram.ui.Components.qt;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f56124b;
    public Handler f56125c;
    public MediaFormat h;
    public MediaFormat f56129i;
    public MediaCodec.CodecException f56130j;
    public MediaCodec.CryptoException f56131k;
    public long f56132l;
    public boolean f56133m;
    public IllegalStateException f56134n;
    public qt f56135o;
    public final Object f56123a = new Object();
    public final h2.f d = new h2.f(0);
    public final h2.f f56126e = new h2.f(0);
    public final ArrayDeque f56127f = new ArrayDeque();
    public final ArrayDeque f56128g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f56124b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f56128g;
        if (!arrayDeque.isEmpty()) {
            this.f56129i = (MediaFormat) arrayDeque.getLast();
        }
        h2.f fVar = this.d;
        fVar.f14081b = fVar.f14080a;
        h2.f fVar2 = this.f56126e;
        fVar2.f14081b = fVar2.f14080a;
        this.f56127f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f56134n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f56130j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f56131k;
                if (cryptoException == null) {
                    return;
                }
                this.f56131k = null;
                throw cryptoException;
            }
            this.f56130j = null;
            throw codecException;
        }
        this.f56134n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f56123a) {
            this.f56134n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f56123a) {
            this.f56131k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f56123a) {
            this.f56130j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        l0 l0Var;
        synchronized (this.f56123a) {
            this.d.a(i7);
            qt qtVar = this.f56135o;
            if (qtVar != null && (l0Var = ((r) qtVar.f37504b).Y) != null) {
                l0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        l0 l0Var;
        synchronized (this.f56123a) {
            try {
                MediaFormat mediaFormat = this.f56129i;
                if (mediaFormat != null) {
                    this.f56126e.a(-2);
                    this.f56128g.add(mediaFormat);
                    this.f56129i = null;
                }
                this.f56126e.a(i7);
                this.f56127f.add(bufferInfo);
                qt qtVar = this.f56135o;
                if (qtVar != null && (l0Var = ((r) qtVar.f37504b).Y) != null) {
                    l0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f56123a) {
            this.f56126e.a(-2);
            this.f56128g.add(mediaFormat);
            this.f56129i = null;
        }
    }
}
