package t2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import k2.l0;
import org.telegram.ui.Components.i9;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f54830b;
    public Handler f54831c;
    public MediaFormat h;
    public MediaFormat f54835i;
    public MediaCodec.CodecException f54836j;
    public MediaCodec.CryptoException f54837k;
    public long f54838l;
    public boolean f54839m;
    public IllegalStateException f54840n;
    public i9 f54841o;
    public final Object f54829a = new Object();
    public final g2.g d = new g2.g(0);
    public final g2.g f54832e = new g2.g(0);
    public final ArrayDeque f54833f = new ArrayDeque();
    public final ArrayDeque f54834g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f54830b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f54834g;
        if (!arrayDeque.isEmpty()) {
            this.f54835i = (MediaFormat) arrayDeque.getLast();
        }
        g2.g gVar = this.d;
        gVar.f11842b = gVar.f11841a;
        g2.g gVar2 = this.f54832e;
        gVar2.f11842b = gVar2.f11841a;
        this.f54833f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f54840n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f54836j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f54837k;
                if (cryptoException == null) {
                    return;
                }
                this.f54837k = null;
                throw cryptoException;
            }
            this.f54836j = null;
            throw codecException;
        }
        this.f54840n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f54829a) {
            this.f54840n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f54829a) {
            this.f54837k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f54829a) {
            this.f54836j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i3) {
        l0 l0Var;
        synchronized (this.f54829a) {
            this.d.a(i3);
            i9 i9Var = this.f54841o;
            if (i9Var != null && (l0Var = ((r) i9Var.f34636b).Z) != null) {
                l0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i3, MediaCodec.BufferInfo bufferInfo) {
        l0 l0Var;
        synchronized (this.f54829a) {
            try {
                MediaFormat mediaFormat = this.f54835i;
                if (mediaFormat != null) {
                    this.f54832e.a(-2);
                    this.f54834g.add(mediaFormat);
                    this.f54835i = null;
                }
                this.f54832e.a(i3);
                this.f54833f.add(bufferInfo);
                i9 i9Var = this.f54841o;
                if (i9Var != null && (l0Var = ((r) i9Var.f34636b).Z) != null) {
                    l0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f54829a) {
            this.f54832e.a(-2);
            this.f54834g.add(mediaFormat);
            this.f54835i = null;
        }
    }
}
