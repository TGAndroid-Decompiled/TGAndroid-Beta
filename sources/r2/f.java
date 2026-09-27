package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.j0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f42273b;
    public Handler f42274c;
    public MediaFormat h;
    public MediaFormat f42277i;
    public MediaCodec.CodecException f42278j;
    public MediaCodec.CryptoException f42279k;
    public long f42280l;
    public boolean f42281m;
    public IllegalStateException f42282n;
    public k2.u f42283o;
    public final Object f42272a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h e = new a0.h();
    public final ArrayDeque f42275f = new ArrayDeque();
    public final ArrayDeque f42276g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f42273b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f42276g;
        if (!arrayDeque.isEmpty()) {
            this.f42277i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f15b = hVar.f14a;
        a0.h hVar2 = this.e;
        hVar2.f15b = hVar2.f14a;
        this.f42275f.clear();
        arrayDeque.clear();
    }

    public final void b(MediaCodec mediaCodec) {
        boolean z10;
        if (this.f42274c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        HandlerThread handlerThread = this.f42273b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f42274c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f42272a) {
            this.f42282n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f42272a) {
            this.f42279k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f42272a) {
            this.f42278j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        j0 j0Var;
        synchronized (this.f42272a) {
            this.d.a(i10);
            k2.u uVar = this.f42283o;
            if (uVar != null && (j0Var = ((r) uVar.f13371a).W) != null) {
                j0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        j0 j0Var;
        synchronized (this.f42272a) {
            try {
                MediaFormat mediaFormat = this.f42277i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f42276g.add(mediaFormat);
                    this.f42277i = null;
                }
                this.e.a(i10);
                this.f42275f.add(bufferInfo);
                k2.u uVar = this.f42283o;
                if (uVar != null && (j0Var = ((r) uVar.f13371a).W) != null) {
                    j0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f42272a) {
            this.e.a(-2);
            this.f42276g.add(mediaFormat);
            this.f42277i = null;
        }
    }
}
