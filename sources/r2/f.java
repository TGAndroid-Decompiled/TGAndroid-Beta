package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.i0;
import java.util.ArrayDeque;
import k2.g0;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f44839b;
    public Handler f44840c;
    public MediaFormat h;
    public MediaFormat f44844i;
    public MediaCodec.CodecException f44845j;
    public MediaCodec.CryptoException f44846k;
    public long f44847l;
    public boolean f44848m;
    public IllegalStateException f44849n;
    public g0 f44850o;
    public final Object f44838a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h f44841e = new a0.h();
    public final ArrayDeque f44842f = new ArrayDeque();
    public final ArrayDeque f44843g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f44839b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f44843g;
        if (!arrayDeque.isEmpty()) {
            this.f44844i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f17b = hVar.f16a;
        a0.h hVar2 = this.f44841e;
        hVar2.f17b = hVar2.f16a;
        this.f44842f.clear();
        arrayDeque.clear();
    }

    public final void b(MediaCodec mediaCodec) {
        boolean z10;
        if (this.f44840c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        HandlerThread handlerThread = this.f44839b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f44840c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f44838a) {
            this.f44849n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f44838a) {
            this.f44846k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f44838a) {
            this.f44845j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        i0 i0Var;
        synchronized (this.f44838a) {
            this.d.a(i10);
            g0 g0Var = this.f44850o;
            if (g0Var != null && (i0Var = ((r) g0Var.f14604b).W) != null) {
                i0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        i0 i0Var;
        synchronized (this.f44838a) {
            try {
                MediaFormat mediaFormat = this.f44844i;
                if (mediaFormat != null) {
                    this.f44841e.a(-2);
                    this.f44843g.add(mediaFormat);
                    this.f44844i = null;
                }
                this.f44841e.a(i10);
                this.f44842f.add(bufferInfo);
                g0 g0Var = this.f44850o;
                if (g0Var != null && (i0Var = ((r) g0Var.f14604b).W) != null) {
                    i0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f44838a) {
            this.f44841e.a(-2);
            this.f44843g.add(mediaFormat);
            this.f44844i = null;
        }
    }
}
