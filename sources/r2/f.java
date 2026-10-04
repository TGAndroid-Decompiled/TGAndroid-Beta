package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.j0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f45716b;
    public Handler f45717c;
    public MediaFormat h;
    public MediaFormat f45721i;
    public MediaCodec.CodecException f45722j;
    public MediaCodec.CryptoException f45723k;
    public long f45724l;
    public boolean f45725m;
    public IllegalStateException f45726n;
    public n2.c f45727o;
    public final Object f45715a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h f45718e = new a0.h();
    public final ArrayDeque f45719f = new ArrayDeque();
    public final ArrayDeque f45720g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f45716b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f45720g;
        if (!arrayDeque.isEmpty()) {
            this.f45721i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f17b = hVar.f16a;
        a0.h hVar2 = this.f45718e;
        hVar2.f17b = hVar2.f16a;
        this.f45719f.clear();
        arrayDeque.clear();
    }

    public final void b(MediaCodec mediaCodec) {
        boolean z10;
        if (this.f45717c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        HandlerThread handlerThread = this.f45716b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f45717c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f45715a) {
            this.f45726n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f45715a) {
            this.f45723k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f45715a) {
            this.f45722j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        j0 j0Var;
        synchronized (this.f45715a) {
            this.d.a(i10);
            n2.c cVar = this.f45727o;
            if (cVar != null && (j0Var = ((r) cVar.f16527b).W) != null) {
                j0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        j0 j0Var;
        synchronized (this.f45715a) {
            try {
                MediaFormat mediaFormat = this.f45721i;
                if (mediaFormat != null) {
                    this.f45718e.a(-2);
                    this.f45720g.add(mediaFormat);
                    this.f45721i = null;
                }
                this.f45718e.a(i10);
                this.f45719f.add(bufferInfo);
                n2.c cVar = this.f45727o;
                if (cVar != null && (j0Var = ((r) cVar.f16527b).W) != null) {
                    j0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f45715a) {
            this.f45718e.a(-2);
            this.f45720g.add(mediaFormat);
            this.f45721i = null;
        }
    }
}
