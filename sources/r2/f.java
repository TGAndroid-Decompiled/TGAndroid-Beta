package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.j0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f46964b;
    public Handler f46965c;
    public MediaFormat h;
    public MediaFormat f46969i;
    public MediaCodec.CodecException f46970j;
    public MediaCodec.CryptoException f46971k;
    public long f46972l;
    public boolean f46973m;
    public IllegalStateException f46974n;
    public l2.f f46975o;
    public final Object f46963a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h f46966e = new a0.h();
    public final ArrayDeque f46967f = new ArrayDeque();
    public final ArrayDeque f46968g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f46964b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f46968g;
        if (!arrayDeque.isEmpty()) {
            this.f46969i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f17b = hVar.f16a;
        a0.h hVar2 = this.f46966e;
        hVar2.f17b = hVar2.f16a;
        this.f46967f.clear();
        arrayDeque.clear();
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f46963a) {
            this.f46974n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f46963a) {
            this.f46971k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f46963a) {
            this.f46970j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        j0 j0Var;
        synchronized (this.f46963a) {
            this.d.a(i10);
            l2.f fVar = this.f46975o;
            if (fVar != null && (j0Var = ((s) fVar.f15334b).W) != null) {
                j0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        j0 j0Var;
        synchronized (this.f46963a) {
            try {
                MediaFormat mediaFormat = this.f46969i;
                if (mediaFormat != null) {
                    this.f46966e.a(-2);
                    this.f46968g.add(mediaFormat);
                    this.f46969i = null;
                }
                this.f46966e.a(i10);
                this.f46967f.add(bufferInfo);
                l2.f fVar = this.f46975o;
                if (fVar != null && (j0Var = ((s) fVar.f15334b).W) != null) {
                    j0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f46963a) {
            this.f46966e.a(-2);
            this.f46968g.add(mediaFormat);
            this.f46969i = null;
        }
    }
}
