package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.j0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f45709b;
    public Handler f45710c;
    public MediaFormat h;
    public MediaFormat f45714i;
    public MediaCodec.CodecException f45715j;
    public MediaCodec.CryptoException f45716k;
    public long f45717l;
    public boolean f45718m;
    public IllegalStateException f45719n;
    public n2.c f45720o;
    public final Object f45708a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h f45711e = new a0.h();
    public final ArrayDeque f45712f = new ArrayDeque();
    public final ArrayDeque f45713g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f45709b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f45713g;
        if (!arrayDeque.isEmpty()) {
            this.f45714i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f17b = hVar.f16a;
        a0.h hVar2 = this.f45711e;
        hVar2.f17b = hVar2.f16a;
        this.f45712f.clear();
        arrayDeque.clear();
    }

    public final void b(MediaCodec mediaCodec) {
        boolean z10;
        if (this.f45710c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        HandlerThread handlerThread = this.f45709b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f45710c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f45708a) {
            this.f45719n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f45708a) {
            this.f45716k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f45708a) {
            this.f45715j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        j0 j0Var;
        synchronized (this.f45708a) {
            this.d.a(i10);
            n2.c cVar = this.f45720o;
            if (cVar != null && (j0Var = ((r) cVar.f16523b).W) != null) {
                j0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        j0 j0Var;
        synchronized (this.f45708a) {
            try {
                MediaFormat mediaFormat = this.f45714i;
                if (mediaFormat != null) {
                    this.f45711e.a(-2);
                    this.f45713g.add(mediaFormat);
                    this.f45714i = null;
                }
                this.f45711e.a(i10);
                this.f45712f.add(bufferInfo);
                n2.c cVar = this.f45720o;
                if (cVar != null && (j0Var = ((r) cVar.f16523b).W) != null) {
                    j0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f45708a) {
            this.f45711e.a(-2);
            this.f45713g.add(mediaFormat);
            this.f45714i = null;
        }
    }
}
