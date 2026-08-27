package y3;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import c2.a1;
import java.util.ArrayDeque;

public final class f extends MediaCodec.Callback {

    public final HandlerThread f49474b;

    public Handler f49475c;
    public MediaFormat h;

    public MediaFormat f49479i;

    public MediaCodec.CodecException f49480j;

    public long f49481k;

    public boolean f49482l;

    public IllegalStateException f49483m;

    public final Object f49473a = new Object();
    public final a1 d = new a1();

    public final a1 f49476e = new a1();

    public final ArrayDeque f49477f = new ArrayDeque();

    public final ArrayDeque f49478g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f49474b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f49478g;
        if (!arrayDeque.isEmpty()) {
            this.f49479i = (MediaFormat) arrayDeque.getLast();
        }
        a1 a1Var = this.d;
        a1Var.f2229a = 0;
        a1Var.f2230b = -1;
        a1Var.f2231c = 0;
        a1 a1Var2 = this.f49476e;
        a1Var2.f2229a = 0;
        a1Var2.f2230b = -1;
        a1Var2.f2231c = 0;
        this.f49477f.clear();
        arrayDeque.clear();
        this.f49480j = null;
    }

    public final void b(MediaCodec mediaCodec) {
        d5.a.i(this.f49475c == null);
        HandlerThread handlerThread = this.f49474b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f49475c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f49473a) {
            this.f49483m = illegalStateException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f49473a) {
            this.f49480j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f49473a) {
            this.d.d(i10);
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f49473a) {
            try {
                MediaFormat mediaFormat = this.f49479i;
                if (mediaFormat != null) {
                    this.f49476e.d(-2);
                    this.f49478g.add(mediaFormat);
                    this.f49479i = null;
                }
                this.f49476e.d(i10);
                this.f49477f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f49473a) {
            this.f49476e.d(-2);
            this.f49478g.add(mediaFormat);
            this.f49479i = null;
        }
    }
}
