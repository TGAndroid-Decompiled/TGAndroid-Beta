package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.j0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f42229b;
    public Handler f42230c;
    public MediaFormat h;
    public MediaFormat f42233i;
    public MediaCodec.CodecException f42234j;
    public MediaCodec.CryptoException f42235k;
    public long f42236l;
    public boolean f42237m;
    public IllegalStateException f42238n;
    public k2.u f42239o;
    public final Object f42228a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h e = new a0.h();
    public final ArrayDeque f42231f = new ArrayDeque();
    public final ArrayDeque f42232g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f42229b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f42232g;
        if (!arrayDeque.isEmpty()) {
            this.f42233i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f15b = hVar.f14a;
        a0.h hVar2 = this.e;
        hVar2.f15b = hVar2.f14a;
        this.f42231f.clear();
        arrayDeque.clear();
    }

    public final void b(MediaCodec mediaCodec) {
        boolean z10;
        if (this.f42230c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        HandlerThread handlerThread = this.f42229b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f42230c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f42228a) {
            this.f42238n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f42228a) {
            this.f42235k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f42228a) {
            this.f42234j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        j0 j0Var;
        synchronized (this.f42228a) {
            this.d.a(i10);
            k2.u uVar = this.f42239o;
            if (uVar != null && (j0Var = ((r) uVar.f13369b).W) != null) {
                j0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        j0 j0Var;
        synchronized (this.f42228a) {
            try {
                MediaFormat mediaFormat = this.f42233i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f42232g.add(mediaFormat);
                    this.f42233i = null;
                }
                this.e.a(i10);
                this.f42231f.add(bufferInfo);
                k2.u uVar = this.f42239o;
                if (uVar != null && (j0Var = ((r) uVar.f13369b).W) != null) {
                    j0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f42228a) {
            this.e.a(-2);
            this.f42232g.add(mediaFormat);
            this.f42233i = null;
        }
    }
}
