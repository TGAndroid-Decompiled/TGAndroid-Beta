package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import l2.l0;
import org.telegram.ui.Components.rt;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f56238b;
    public Handler f56239c;
    public MediaFormat h;
    public MediaFormat f56243i;
    public MediaCodec.CodecException f56244j;
    public MediaCodec.CryptoException f56245k;
    public long f56246l;
    public boolean f56247m;
    public IllegalStateException f56248n;
    public rt f56249o;
    public final Object f56237a = new Object();
    public final h2.f d = new h2.f(0);
    public final h2.f f56240e = new h2.f(0);
    public final ArrayDeque f56241f = new ArrayDeque();
    public final ArrayDeque f56242g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f56238b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f56242g;
        if (!arrayDeque.isEmpty()) {
            this.f56243i = (MediaFormat) arrayDeque.getLast();
        }
        h2.f fVar = this.d;
        fVar.f14081b = fVar.f14080a;
        h2.f fVar2 = this.f56240e;
        fVar2.f14081b = fVar2.f14080a;
        this.f56241f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f56248n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f56244j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f56245k;
                if (cryptoException == null) {
                    return;
                }
                this.f56245k = null;
                throw cryptoException;
            }
            this.f56244j = null;
            throw codecException;
        }
        this.f56248n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f56237a) {
            this.f56248n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f56237a) {
            this.f56245k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f56237a) {
            this.f56244j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        l0 l0Var;
        synchronized (this.f56237a) {
            this.d.a(i7);
            rt rtVar = this.f56249o;
            if (rtVar != null && (l0Var = ((r) rtVar.f37758b).Y) != null) {
                l0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        l0 l0Var;
        synchronized (this.f56237a) {
            try {
                MediaFormat mediaFormat = this.f56243i;
                if (mediaFormat != null) {
                    this.f56240e.a(-2);
                    this.f56242g.add(mediaFormat);
                    this.f56243i = null;
                }
                this.f56240e.a(i7);
                this.f56241f.add(bufferInfo);
                rt rtVar = this.f56249o;
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
        synchronized (this.f56237a) {
            this.f56240e.a(-2);
            this.f56242g.add(mediaFormat);
            this.f56243i = null;
        }
    }
}
