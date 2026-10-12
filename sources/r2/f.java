package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.j0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f47089b;
    public Handler f47090c;
    public MediaFormat h;
    public MediaFormat f47094i;
    public MediaCodec.CodecException f47095j;
    public MediaCodec.CryptoException f47096k;
    public long f47097l;
    public boolean f47098m;
    public IllegalStateException f47099n;
    public l2.g f47100o;
    public final Object f47088a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h f47091e = new a0.h();
    public final ArrayDeque f47092f = new ArrayDeque();
    public final ArrayDeque f47093g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f47089b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f47093g;
        if (!arrayDeque.isEmpty()) {
            this.f47094i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f17b = hVar.f16a;
        a0.h hVar2 = this.f47091e;
        hVar2.f17b = hVar2.f16a;
        this.f47092f.clear();
        arrayDeque.clear();
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f47088a) {
            this.f47099n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f47088a) {
            this.f47096k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f47088a) {
            this.f47095j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        j0 j0Var;
        synchronized (this.f47088a) {
            this.d.a(i10);
            l2.g gVar = this.f47100o;
            if (gVar != null && (j0Var = ((r) gVar.f15080b).W) != null) {
                j0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        j0 j0Var;
        synchronized (this.f47088a) {
            try {
                MediaFormat mediaFormat = this.f47094i;
                if (mediaFormat != null) {
                    this.f47091e.a(-2);
                    this.f47093g.add(mediaFormat);
                    this.f47094i = null;
                }
                this.f47091e.a(i10);
                this.f47092f.add(bufferInfo);
                l2.g gVar = this.f47100o;
                if (gVar != null && (j0Var = ((r) gVar.f15080b).W) != null) {
                    j0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f47088a) {
            this.f47091e.a(-2);
            this.f47093g.add(mediaFormat);
            this.f47094i = null;
        }
    }
}
