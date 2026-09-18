package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.i0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f42198b;
    public Handler f42199c;
    public MediaFormat h;
    public MediaFormat f42202i;
    public MediaCodec.CodecException f42203j;
    public MediaCodec.CryptoException f42204k;
    public long f42205l;
    public boolean f42206m;
    public IllegalStateException f42207n;
    public k2.u f42208o;
    public final Object f42197a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h e = new a0.h();
    public final ArrayDeque f42200f = new ArrayDeque();
    public final ArrayDeque f42201g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f42198b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f42201g;
        if (!arrayDeque.isEmpty()) {
            this.f42202i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f15b = hVar.f14a;
        a0.h hVar2 = this.e;
        hVar2.f15b = hVar2.f14a;
        this.f42200f.clear();
        arrayDeque.clear();
    }

    public final void b(MediaCodec mediaCodec) {
        boolean z10;
        if (this.f42199c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        HandlerThread handlerThread = this.f42198b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f42199c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f42197a) {
            this.f42207n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f42197a) {
            this.f42204k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f42197a) {
            this.f42203j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        i0 i0Var;
        synchronized (this.f42197a) {
            this.d.a(i10);
            k2.u uVar = this.f42208o;
            if (uVar != null && (i0Var = ((r) uVar.f13383b).W) != null) {
                i0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        i0 i0Var;
        synchronized (this.f42197a) {
            try {
                MediaFormat mediaFormat = this.f42202i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f42201g.add(mediaFormat);
                    this.f42202i = null;
                }
                this.e.a(i10);
                this.f42200f.add(bufferInfo);
                k2.u uVar = this.f42208o;
                if (uVar != null && (i0Var = ((r) uVar.f13383b).W) != null) {
                    i0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f42197a) {
            this.e.a(-2);
            this.f42201g.add(mediaFormat);
            this.f42202i = null;
        }
    }
}
