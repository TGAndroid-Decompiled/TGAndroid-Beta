package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.j0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f46998b;
    public Handler f46999c;
    public MediaFormat h;
    public MediaFormat f47003i;
    public MediaCodec.CodecException f47004j;
    public MediaCodec.CryptoException f47005k;
    public long f47006l;
    public boolean f47007m;
    public IllegalStateException f47008n;
    public l2.f f47009o;
    public final Object f46997a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h f47000e = new a0.h();
    public final ArrayDeque f47001f = new ArrayDeque();
    public final ArrayDeque f47002g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f46998b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f47002g;
        if (!arrayDeque.isEmpty()) {
            this.f47003i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f17b = hVar.f16a;
        a0.h hVar2 = this.f47000e;
        hVar2.f17b = hVar2.f16a;
        this.f47001f.clear();
        arrayDeque.clear();
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f46997a) {
            this.f47008n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f46997a) {
            this.f47005k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f46997a) {
            this.f47004j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        j0 j0Var;
        synchronized (this.f46997a) {
            this.d.a(i10);
            l2.f fVar = this.f47009o;
            if (fVar != null && (j0Var = ((s) fVar.f15370b).W) != null) {
                j0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        j0 j0Var;
        synchronized (this.f46997a) {
            try {
                MediaFormat mediaFormat = this.f47003i;
                if (mediaFormat != null) {
                    this.f47000e.a(-2);
                    this.f47002g.add(mediaFormat);
                    this.f47003i = null;
                }
                this.f47000e.a(i10);
                this.f47001f.add(bufferInfo);
                l2.f fVar = this.f47009o;
                if (fVar != null && (j0Var = ((s) fVar.f15370b).W) != null) {
                    j0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f46997a) {
            this.f47000e.a(-2);
            this.f47002g.add(mediaFormat);
            this.f47003i = null;
        }
    }
}
