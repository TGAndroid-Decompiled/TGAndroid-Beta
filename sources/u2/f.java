package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import l2.l0;
import org.telegram.ui.Components.qt;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f56149b;
    public Handler f56150c;
    public MediaFormat h;
    public MediaFormat f56154i;
    public MediaCodec.CodecException f56155j;
    public MediaCodec.CryptoException f56156k;
    public long f56157l;
    public boolean f56158m;
    public IllegalStateException f56159n;
    public qt f56160o;
    public final Object f56148a = new Object();
    public final h2.f d = new h2.f(0);
    public final h2.f f56151e = new h2.f(0);
    public final ArrayDeque f56152f = new ArrayDeque();
    public final ArrayDeque f56153g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f56149b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f56153g;
        if (!arrayDeque.isEmpty()) {
            this.f56154i = (MediaFormat) arrayDeque.getLast();
        }
        h2.f fVar = this.d;
        fVar.f14081b = fVar.f14080a;
        h2.f fVar2 = this.f56151e;
        fVar2.f14081b = fVar2.f14080a;
        this.f56152f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f56159n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f56155j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f56156k;
                if (cryptoException == null) {
                    return;
                }
                this.f56156k = null;
                throw cryptoException;
            }
            this.f56155j = null;
            throw codecException;
        }
        this.f56159n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f56148a) {
            this.f56159n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f56148a) {
            this.f56156k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f56148a) {
            this.f56155j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        l0 l0Var;
        synchronized (this.f56148a) {
            this.d.a(i7);
            qt qtVar = this.f56160o;
            if (qtVar != null && (l0Var = ((r) qtVar.f37394b).Y) != null) {
                l0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        l0 l0Var;
        synchronized (this.f56148a) {
            try {
                MediaFormat mediaFormat = this.f56154i;
                if (mediaFormat != null) {
                    this.f56151e.a(-2);
                    this.f56153g.add(mediaFormat);
                    this.f56154i = null;
                }
                this.f56151e.a(i7);
                this.f56152f.add(bufferInfo);
                qt qtVar = this.f56160o;
                if (qtVar != null && (l0Var = ((r) qtVar.f37394b).Y) != null) {
                    l0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f56148a) {
            this.f56151e.a(-2);
            this.f56153g.add(mediaFormat);
            this.f56154i = null;
        }
    }
}
