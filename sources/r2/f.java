package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.i0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f42263b;
    public Handler f42264c;
    public MediaFormat h;
    public MediaFormat f42267i;
    public MediaCodec.CodecException f42268j;
    public MediaCodec.CryptoException f42269k;
    public long f42270l;
    public boolean f42271m;
    public IllegalStateException f42272n;
    public k2.e f42273o;
    public final Object f42262a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h e = new a0.h();
    public final ArrayDeque f42265f = new ArrayDeque();
    public final ArrayDeque f42266g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f42263b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f42266g;
        if (!arrayDeque.isEmpty()) {
            this.f42267i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f15b = hVar.f14a;
        a0.h hVar2 = this.e;
        hVar2.f15b = hVar2.f14a;
        this.f42265f.clear();
        arrayDeque.clear();
    }

    public final void b(MediaCodec mediaCodec) {
        boolean z10;
        if (this.f42264c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        HandlerThread handlerThread = this.f42263b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f42264c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f42262a) {
            this.f42272n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f42262a) {
            this.f42269k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f42262a) {
            this.f42268j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        i0 i0Var;
        synchronized (this.f42262a) {
            this.d.a(i10);
            k2.e eVar = this.f42273o;
            if (eVar != null && (i0Var = ((r) eVar.f13244b).W) != null) {
                i0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        i0 i0Var;
        synchronized (this.f42262a) {
            try {
                MediaFormat mediaFormat = this.f42267i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f42266g.add(mediaFormat);
                    this.f42267i = null;
                }
                this.e.a(i10);
                this.f42265f.add(bufferInfo);
                k2.e eVar = this.f42273o;
                if (eVar != null && (i0Var = ((r) eVar.f13244b).W) != null) {
                    i0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f42262a) {
            this.e.a(-2);
            this.f42266g.add(mediaFormat);
            this.f42267i = null;
        }
    }
}
