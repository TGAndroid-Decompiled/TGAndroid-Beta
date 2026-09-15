package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.i0;
import java.util.ArrayDeque;
import org.telegram.ui.Cells.ia;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f41943b;
    public Handler f41944c;
    public MediaFormat h;
    public MediaFormat f41947i;
    public MediaCodec.CodecException f41948j;
    public MediaCodec.CryptoException f41949k;
    public long f41950l;
    public boolean f41951m;
    public IllegalStateException f41952n;
    public ia f41953o;
    public final Object f41942a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h e = new a0.h();
    public final ArrayDeque f41945f = new ArrayDeque();
    public final ArrayDeque f41946g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f41943b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f41946g;
        if (!arrayDeque.isEmpty()) {
            this.f41947i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f15b = hVar.f14a;
        a0.h hVar2 = this.e;
        hVar2.f15b = hVar2.f14a;
        this.f41945f.clear();
        arrayDeque.clear();
    }

    public final void b(MediaCodec mediaCodec) {
        boolean z10;
        if (this.f41944c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        HandlerThread handlerThread = this.f41943b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f41944c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f41942a) {
            this.f41952n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f41942a) {
            this.f41949k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f41942a) {
            this.f41948j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        i0 i0Var;
        synchronized (this.f41942a) {
            this.d.a(i10);
            ia iaVar = this.f41953o;
            if (iaVar != null && (i0Var = ((r) iaVar.f20280b).W) != null) {
                i0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        i0 i0Var;
        synchronized (this.f41942a) {
            try {
                MediaFormat mediaFormat = this.f41947i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f41946g.add(mediaFormat);
                    this.f41947i = null;
                }
                this.e.a(i10);
                this.f41945f.add(bufferInfo);
                ia iaVar = this.f41953o;
                if (iaVar != null && (i0Var = ((r) iaVar.f20280b).W) != null) {
                    i0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f41942a) {
            this.e.a(-2);
            this.f41946g.add(mediaFormat);
            this.f41947i = null;
        }
    }
}
