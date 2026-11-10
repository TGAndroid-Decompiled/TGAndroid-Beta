package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import l2.l0;
import org.telegram.ui.Components.qt;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f56249b;
    public Handler f56250c;
    public MediaFormat h;
    public MediaFormat f56254i;
    public MediaCodec.CodecException f56255j;
    public MediaCodec.CryptoException f56256k;
    public long f56257l;
    public boolean f56258m;
    public IllegalStateException f56259n;
    public qt f56260o;
    public final Object f56248a = new Object();
    public final h2.f d = new h2.f(0);
    public final h2.f f56251e = new h2.f(0);
    public final ArrayDeque f56252f = new ArrayDeque();
    public final ArrayDeque f56253g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f56249b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f56253g;
        if (!arrayDeque.isEmpty()) {
            this.f56254i = (MediaFormat) arrayDeque.getLast();
        }
        h2.f fVar = this.d;
        fVar.f14083b = fVar.f14082a;
        h2.f fVar2 = this.f56251e;
        fVar2.f14083b = fVar2.f14082a;
        this.f56252f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f56259n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f56255j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f56256k;
                if (cryptoException == null) {
                    return;
                }
                this.f56256k = null;
                throw cryptoException;
            }
            this.f56255j = null;
            throw codecException;
        }
        this.f56259n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f56248a) {
            this.f56259n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f56248a) {
            this.f56256k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f56248a) {
            this.f56255j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        l0 l0Var;
        synchronized (this.f56248a) {
            this.d.a(i7);
            qt qtVar = this.f56260o;
            if (qtVar != null && (l0Var = ((r) qtVar.f37395b).Y) != null) {
                l0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        l0 l0Var;
        synchronized (this.f56248a) {
            try {
                MediaFormat mediaFormat = this.f56254i;
                if (mediaFormat != null) {
                    this.f56251e.a(-2);
                    this.f56253g.add(mediaFormat);
                    this.f56254i = null;
                }
                this.f56251e.a(i7);
                this.f56252f.add(bufferInfo);
                qt qtVar = this.f56260o;
                if (qtVar != null && (l0Var = ((r) qtVar.f37395b).Y) != null) {
                    l0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f56248a) {
            this.f56251e.a(-2);
            this.f56253g.add(mediaFormat);
            this.f56254i = null;
        }
    }
}
