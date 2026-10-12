package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.j0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f47097b;
    public Handler f47098c;
    public MediaFormat h;
    public MediaFormat f47102i;
    public MediaCodec.CodecException f47103j;
    public MediaCodec.CryptoException f47104k;
    public long f47105l;
    public boolean f47106m;
    public IllegalStateException f47107n;
    public l2.g f47108o;
    public final Object f47096a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h f47099e = new a0.h();
    public final ArrayDeque f47100f = new ArrayDeque();
    public final ArrayDeque f47101g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f47097b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f47101g;
        if (!arrayDeque.isEmpty()) {
            this.f47102i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f17b = hVar.f16a;
        a0.h hVar2 = this.f47099e;
        hVar2.f17b = hVar2.f16a;
        this.f47100f.clear();
        arrayDeque.clear();
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f47096a) {
            this.f47107n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f47096a) {
            this.f47104k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f47096a) {
            this.f47103j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        j0 j0Var;
        synchronized (this.f47096a) {
            this.d.a(i10);
            l2.g gVar = this.f47108o;
            if (gVar != null && (j0Var = ((r) gVar.f15081b).W) != null) {
                j0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        j0 j0Var;
        synchronized (this.f47096a) {
            try {
                MediaFormat mediaFormat = this.f47102i;
                if (mediaFormat != null) {
                    this.f47099e.a(-2);
                    this.f47101g.add(mediaFormat);
                    this.f47102i = null;
                }
                this.f47099e.a(i10);
                this.f47100f.add(bufferInfo);
                l2.g gVar = this.f47108o;
                if (gVar != null && (j0Var = ((r) gVar.f15081b).W) != null) {
                    j0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f47096a) {
            this.f47099e.a(-2);
            this.f47101g.add(mediaFormat);
            this.f47102i = null;
        }
    }
}
