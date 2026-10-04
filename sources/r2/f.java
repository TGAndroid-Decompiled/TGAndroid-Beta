package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.j0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f45708b;
    public Handler f45709c;
    public MediaFormat h;
    public MediaFormat f45713i;
    public MediaCodec.CodecException f45714j;
    public MediaCodec.CryptoException f45715k;
    public long f45716l;
    public boolean f45717m;
    public IllegalStateException f45718n;
    public n2.c f45719o;
    public final Object f45707a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h f45710e = new a0.h();
    public final ArrayDeque f45711f = new ArrayDeque();
    public final ArrayDeque f45712g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f45708b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f45712g;
        if (!arrayDeque.isEmpty()) {
            this.f45713i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f17b = hVar.f16a;
        a0.h hVar2 = this.f45710e;
        hVar2.f17b = hVar2.f16a;
        this.f45711f.clear();
        arrayDeque.clear();
    }

    public final void b(MediaCodec mediaCodec) {
        boolean z10;
        if (this.f45709c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        HandlerThread handlerThread = this.f45708b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f45709c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f45707a) {
            this.f45718n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f45707a) {
            this.f45715k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f45707a) {
            this.f45714j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        j0 j0Var;
        synchronized (this.f45707a) {
            this.d.a(i10);
            n2.c cVar = this.f45719o;
            if (cVar != null && (j0Var = ((r) cVar.f16522b).W) != null) {
                j0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        j0 j0Var;
        synchronized (this.f45707a) {
            try {
                MediaFormat mediaFormat = this.f45713i;
                if (mediaFormat != null) {
                    this.f45710e.a(-2);
                    this.f45712g.add(mediaFormat);
                    this.f45713i = null;
                }
                this.f45710e.a(i10);
                this.f45711f.add(bufferInfo);
                n2.c cVar = this.f45719o;
                if (cVar != null && (j0Var = ((r) cVar.f16522b).W) != null) {
                    j0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f45707a) {
            this.f45710e.a(-2);
            this.f45712g.add(mediaFormat);
            this.f45713i = null;
        }
    }
}
