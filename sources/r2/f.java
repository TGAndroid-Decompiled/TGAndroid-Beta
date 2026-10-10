package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.j0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f46918b;
    public Handler f46919c;
    public MediaFormat h;
    public MediaFormat f46923i;
    public MediaCodec.CodecException f46924j;
    public MediaCodec.CryptoException f46925k;
    public long f46926l;
    public boolean f46927m;
    public IllegalStateException f46928n;
    public l2.f f46929o;
    public final Object f46917a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h f46920e = new a0.h();
    public final ArrayDeque f46921f = new ArrayDeque();
    public final ArrayDeque f46922g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f46918b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f46922g;
        if (!arrayDeque.isEmpty()) {
            this.f46923i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f17b = hVar.f16a;
        a0.h hVar2 = this.f46920e;
        hVar2.f17b = hVar2.f16a;
        this.f46921f.clear();
        arrayDeque.clear();
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f46917a) {
            this.f46928n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f46917a) {
            this.f46925k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f46917a) {
            this.f46924j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        j0 j0Var;
        synchronized (this.f46917a) {
            this.d.a(i10);
            l2.f fVar = this.f46929o;
            if (fVar != null && (j0Var = ((s) fVar.f15335b).W) != null) {
                j0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        j0 j0Var;
        synchronized (this.f46917a) {
            try {
                MediaFormat mediaFormat = this.f46923i;
                if (mediaFormat != null) {
                    this.f46920e.a(-2);
                    this.f46922g.add(mediaFormat);
                    this.f46923i = null;
                }
                this.f46920e.a(i10);
                this.f46921f.add(bufferInfo);
                l2.f fVar = this.f46929o;
                if (fVar != null && (j0Var = ((s) fVar.f15335b).W) != null) {
                    j0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f46917a) {
            this.f46920e.a(-2);
            this.f46922g.add(mediaFormat);
            this.f46923i = null;
        }
    }
}
