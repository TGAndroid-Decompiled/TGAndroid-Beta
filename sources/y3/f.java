package y3;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import c2.b1;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f49484b;
    public Handler f49485c;
    public MediaFormat h;
    public MediaFormat f49489i;
    public MediaCodec.CodecException f49490j;
    public long f49491k;
    public boolean f49492l;
    public IllegalStateException f49493m;
    public final Object f49483a = new Object();
    public final b1 d = new b1();
    public final b1 f49486e = new b1();
    public final ArrayDeque f49487f = new ArrayDeque();
    public final ArrayDeque f49488g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f49484b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f49488g;
        if (!arrayDeque.isEmpty()) {
            this.f49489i = (MediaFormat) arrayDeque.getLast();
        }
        b1 b1Var = this.d;
        b1Var.f2119a = 0;
        b1Var.f2120b = -1;
        b1Var.f2121c = 0;
        b1 b1Var2 = this.f49486e;
        b1Var2.f2119a = 0;
        b1Var2.f2120b = -1;
        b1Var2.f2121c = 0;
        this.f49487f.clear();
        arrayDeque.clear();
        this.f49490j = null;
    }

    public final void b(MediaCodec mediaCodec) {
        boolean z10;
        if (this.f49485c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.i(z10);
        HandlerThread handlerThread = this.f49484b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f49485c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f49483a) {
            this.f49493m = illegalStateException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f49483a) {
            this.f49490j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i9) {
        synchronized (this.f49483a) {
            this.d.d(i9);
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i9, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f49483a) {
            try {
                MediaFormat mediaFormat = this.f49489i;
                if (mediaFormat != null) {
                    this.f49486e.d(-2);
                    this.f49488g.add(mediaFormat);
                    this.f49489i = null;
                }
                this.f49486e.d(i9);
                this.f49487f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f49483a) {
            this.f49486e.d(-2);
            this.f49488g.add(mediaFormat);
            this.f49489i = null;
        }
    }
}
