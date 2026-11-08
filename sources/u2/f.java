package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import l2.l0;
import org.telegram.ui.Components.rt;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f56237b;
    public Handler f56238c;
    public MediaFormat h;
    public MediaFormat f56242i;
    public MediaCodec.CodecException f56243j;
    public MediaCodec.CryptoException f56244k;
    public long f56245l;
    public boolean f56246m;
    public IllegalStateException f56247n;
    public rt f56248o;
    public final Object f56236a = new Object();
    public final h2.f d = new h2.f(0);
    public final h2.f f56239e = new h2.f(0);
    public final ArrayDeque f56240f = new ArrayDeque();
    public final ArrayDeque f56241g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f56237b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f56241g;
        if (!arrayDeque.isEmpty()) {
            this.f56242i = (MediaFormat) arrayDeque.getLast();
        }
        h2.f fVar = this.d;
        fVar.f14081b = fVar.f14080a;
        h2.f fVar2 = this.f56239e;
        fVar2.f14081b = fVar2.f14080a;
        this.f56240f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f56247n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f56243j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f56244k;
                if (cryptoException == null) {
                    return;
                }
                this.f56244k = null;
                throw cryptoException;
            }
            this.f56243j = null;
            throw codecException;
        }
        this.f56247n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f56236a) {
            this.f56247n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f56236a) {
            this.f56244k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f56236a) {
            this.f56243j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        l0 l0Var;
        synchronized (this.f56236a) {
            this.d.a(i7);
            rt rtVar = this.f56248o;
            if (rtVar != null && (l0Var = ((r) rtVar.f37758b).Y) != null) {
                l0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        l0 l0Var;
        synchronized (this.f56236a) {
            try {
                MediaFormat mediaFormat = this.f56242i;
                if (mediaFormat != null) {
                    this.f56239e.a(-2);
                    this.f56241g.add(mediaFormat);
                    this.f56242i = null;
                }
                this.f56239e.a(i7);
                this.f56240f.add(bufferInfo);
                rt rtVar = this.f56248o;
                if (rtVar != null && (l0Var = ((r) rtVar.f37758b).Y) != null) {
                    l0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f56236a) {
            this.f56239e.a(-2);
            this.f56241g.add(mediaFormat);
            this.f56242i = null;
        }
    }
}
