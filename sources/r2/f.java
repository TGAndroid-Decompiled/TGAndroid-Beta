package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.i0;
import java.util.ArrayDeque;
import k2.g0;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f44811b;
    public Handler f44812c;
    public MediaFormat h;
    public MediaFormat f44816i;
    public MediaCodec.CodecException f44817j;
    public MediaCodec.CryptoException f44818k;
    public long f44819l;
    public boolean f44820m;
    public IllegalStateException f44821n;
    public g0 f44822o;
    public final Object f44810a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h f44813e = new a0.h();
    public final ArrayDeque f44814f = new ArrayDeque();
    public final ArrayDeque f44815g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f44811b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f44815g;
        if (!arrayDeque.isEmpty()) {
            this.f44816i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f17b = hVar.f16a;
        a0.h hVar2 = this.f44813e;
        hVar2.f17b = hVar2.f16a;
        this.f44814f.clear();
        arrayDeque.clear();
    }

    public final void b(MediaCodec mediaCodec) {
        boolean z10;
        if (this.f44812c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        HandlerThread handlerThread = this.f44811b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f44812c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f44810a) {
            this.f44821n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f44810a) {
            this.f44818k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f44810a) {
            this.f44817j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        i0 i0Var;
        synchronized (this.f44810a) {
            this.d.a(i10);
            g0 g0Var = this.f44822o;
            if (g0Var != null && (i0Var = ((r) g0Var.f14578b).W) != null) {
                i0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        i0 i0Var;
        synchronized (this.f44810a) {
            try {
                MediaFormat mediaFormat = this.f44816i;
                if (mediaFormat != null) {
                    this.f44813e.a(-2);
                    this.f44815g.add(mediaFormat);
                    this.f44816i = null;
                }
                this.f44813e.a(i10);
                this.f44814f.add(bufferInfo);
                g0 g0Var = this.f44822o;
                if (g0Var != null && (i0Var = ((r) g0Var.f14578b).W) != null) {
                    i0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f44810a) {
            this.f44813e.a(-2);
            this.f44815g.add(mediaFormat);
            this.f44816i = null;
        }
    }
}
