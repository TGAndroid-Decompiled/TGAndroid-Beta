package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.i0;
import java.util.ArrayDeque;
import k2.g0;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f44810b;
    public Handler f44811c;
    public MediaFormat h;
    public MediaFormat f44815i;
    public MediaCodec.CodecException f44816j;
    public MediaCodec.CryptoException f44817k;
    public long f44818l;
    public boolean f44819m;
    public IllegalStateException f44820n;
    public g0 f44821o;
    public final Object f44809a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h f44812e = new a0.h();
    public final ArrayDeque f44813f = new ArrayDeque();
    public final ArrayDeque f44814g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f44810b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f44814g;
        if (!arrayDeque.isEmpty()) {
            this.f44815i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f17b = hVar.f16a;
        a0.h hVar2 = this.f44812e;
        hVar2.f17b = hVar2.f16a;
        this.f44813f.clear();
        arrayDeque.clear();
    }

    public final void b(MediaCodec mediaCodec) {
        boolean z10;
        if (this.f44811c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        HandlerThread handlerThread = this.f44810b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f44811c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f44809a) {
            this.f44820n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f44809a) {
            this.f44817k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f44809a) {
            this.f44816j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        i0 i0Var;
        synchronized (this.f44809a) {
            this.d.a(i10);
            g0 g0Var = this.f44821o;
            if (g0Var != null && (i0Var = ((r) g0Var.f14578b).W) != null) {
                i0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        i0 i0Var;
        synchronized (this.f44809a) {
            try {
                MediaFormat mediaFormat = this.f44815i;
                if (mediaFormat != null) {
                    this.f44812e.a(-2);
                    this.f44814g.add(mediaFormat);
                    this.f44815i = null;
                }
                this.f44812e.a(i10);
                this.f44813f.add(bufferInfo);
                g0 g0Var = this.f44821o;
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
        synchronized (this.f44809a) {
            this.f44812e.a(-2);
            this.f44814g.add(mediaFormat);
            this.f44815i = null;
        }
    }
}
