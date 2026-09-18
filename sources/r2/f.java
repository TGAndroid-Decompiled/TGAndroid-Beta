package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.i0;
import java.util.ArrayDeque;
import org.telegram.ui.Cells.ia;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f41970b;
    public Handler f41971c;
    public MediaFormat h;
    public MediaFormat f41974i;
    public MediaCodec.CodecException f41975j;
    public MediaCodec.CryptoException f41976k;
    public long f41977l;
    public boolean f41978m;
    public IllegalStateException f41979n;
    public ia f41980o;
    public final Object f41969a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h e = new a0.h();
    public final ArrayDeque f41972f = new ArrayDeque();
    public final ArrayDeque f41973g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f41970b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f41973g;
        if (!arrayDeque.isEmpty()) {
            this.f41974i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f15b = hVar.f14a;
        a0.h hVar2 = this.e;
        hVar2.f15b = hVar2.f14a;
        this.f41972f.clear();
        arrayDeque.clear();
    }

    public final void b(MediaCodec mediaCodec) {
        boolean z10;
        if (this.f41971c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        HandlerThread handlerThread = this.f41970b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f41971c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f41969a) {
            this.f41979n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f41969a) {
            this.f41976k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f41969a) {
            this.f41975j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        i0 i0Var;
        synchronized (this.f41969a) {
            this.d.a(i10);
            ia iaVar = this.f41980o;
            if (iaVar != null && (i0Var = ((r) iaVar.f20291b).W) != null) {
                i0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        i0 i0Var;
        synchronized (this.f41969a) {
            try {
                MediaFormat mediaFormat = this.f41974i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f41973g.add(mediaFormat);
                    this.f41974i = null;
                }
                this.e.a(i10);
                this.f41972f.add(bufferInfo);
                ia iaVar = this.f41980o;
                if (iaVar != null && (i0Var = ((r) iaVar.f20291b).W) != null) {
                    i0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f41969a) {
            this.e.a(-2);
            this.f41973g.add(mediaFormat);
            this.f41974i = null;
        }
    }
}
