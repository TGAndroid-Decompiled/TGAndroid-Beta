package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import l2.l0;
import org.telegram.ui.Components.qt;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f56148b;
    public Handler f56149c;
    public MediaFormat h;
    public MediaFormat f56153i;
    public MediaCodec.CodecException f56154j;
    public MediaCodec.CryptoException f56155k;
    public long f56156l;
    public boolean f56157m;
    public IllegalStateException f56158n;
    public qt f56159o;
    public final Object f56147a = new Object();
    public final h2.f d = new h2.f(0);
    public final h2.f f56150e = new h2.f(0);
    public final ArrayDeque f56151f = new ArrayDeque();
    public final ArrayDeque f56152g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f56148b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f56152g;
        if (!arrayDeque.isEmpty()) {
            this.f56153i = (MediaFormat) arrayDeque.getLast();
        }
        h2.f fVar = this.d;
        fVar.f14081b = fVar.f14080a;
        h2.f fVar2 = this.f56150e;
        fVar2.f14081b = fVar2.f14080a;
        this.f56151f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f56158n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f56154j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f56155k;
                if (cryptoException == null) {
                    return;
                }
                this.f56155k = null;
                throw cryptoException;
            }
            this.f56154j = null;
            throw codecException;
        }
        this.f56158n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f56147a) {
            this.f56158n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f56147a) {
            this.f56155k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f56147a) {
            this.f56154j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        l0 l0Var;
        synchronized (this.f56147a) {
            this.d.a(i7);
            qt qtVar = this.f56159o;
            if (qtVar != null && (l0Var = ((r) qtVar.f37389b).Y) != null) {
                l0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        l0 l0Var;
        synchronized (this.f56147a) {
            try {
                MediaFormat mediaFormat = this.f56153i;
                if (mediaFormat != null) {
                    this.f56150e.a(-2);
                    this.f56152g.add(mediaFormat);
                    this.f56153i = null;
                }
                this.f56150e.a(i7);
                this.f56151f.add(bufferInfo);
                qt qtVar = this.f56159o;
                if (qtVar != null && (l0Var = ((r) qtVar.f37389b).Y) != null) {
                    l0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f56147a) {
            this.f56150e.a(-2);
            this.f56152g.add(mediaFormat);
            this.f56153i = null;
        }
    }
}
