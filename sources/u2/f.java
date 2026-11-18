package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import l2.i0;
import org.telegram.ui.Cells.b5;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f58315b;
    public Handler f58316c;
    public MediaFormat h;
    public MediaFormat f58320i;
    public MediaCodec.CodecException f58321j;
    public MediaCodec.CryptoException f58322k;
    public long f58323l;
    public boolean f58324m;
    public IllegalStateException f58325n;
    public b5 f58326o;
    public final Object f58314a = new Object();
    public final h2.f d = new h2.f(0);
    public final h2.f f58317e = new h2.f(0);
    public final ArrayDeque f58318f = new ArrayDeque();
    public final ArrayDeque f58319g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f58315b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f58319g;
        if (!arrayDeque.isEmpty()) {
            this.f58320i = (MediaFormat) arrayDeque.getLast();
        }
        h2.f fVar = this.d;
        fVar.f13756b = fVar.f13755a;
        h2.f fVar2 = this.f58317e;
        fVar2.f13756b = fVar2.f13755a;
        this.f58318f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f58325n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f58321j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f58322k;
                if (cryptoException == null) {
                    return;
                }
                this.f58322k = null;
                throw cryptoException;
            }
            this.f58321j = null;
            throw codecException;
        }
        this.f58325n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f58314a) {
            this.f58325n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f58314a) {
            this.f58322k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f58314a) {
            this.f58321j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        i0 i0Var;
        synchronized (this.f58314a) {
            this.d.a(i7);
            b5 b5Var = this.f58326o;
            if (b5Var != null && (i0Var = ((r) b5Var.f30431a).Z) != null) {
                i0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        i0 i0Var;
        synchronized (this.f58314a) {
            try {
                MediaFormat mediaFormat = this.f58320i;
                if (mediaFormat != null) {
                    this.f58317e.a(-2);
                    this.f58319g.add(mediaFormat);
                    this.f58320i = null;
                }
                this.f58317e.a(i7);
                this.f58318f.add(bufferInfo);
                b5 b5Var = this.f58326o;
                if (b5Var != null && (i0Var = ((r) b5Var.f30431a).Z) != null) {
                    i0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f58314a) {
            this.f58317e.a(-2);
            this.f58319g.add(mediaFormat);
            this.f58320i = null;
        }
    }
}
