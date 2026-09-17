package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.i0;
import java.util.ArrayDeque;
import org.telegram.ui.Cells.ia;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f41965b;
    public Handler f41966c;
    public MediaFormat h;
    public MediaFormat f41969i;
    public MediaCodec.CodecException f41970j;
    public MediaCodec.CryptoException f41971k;
    public long f41972l;
    public boolean f41973m;
    public IllegalStateException f41974n;
    public ia f41975o;
    public final Object f41964a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h e = new a0.h();
    public final ArrayDeque f41967f = new ArrayDeque();
    public final ArrayDeque f41968g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f41965b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f41968g;
        if (!arrayDeque.isEmpty()) {
            this.f41969i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f15b = hVar.f14a;
        a0.h hVar2 = this.e;
        hVar2.f15b = hVar2.f14a;
        this.f41967f.clear();
        arrayDeque.clear();
    }

    public final void b(MediaCodec mediaCodec) {
        boolean z10;
        if (this.f41966c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        HandlerThread handlerThread = this.f41965b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f41966c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f41964a) {
            this.f41974n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f41964a) {
            this.f41971k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f41964a) {
            this.f41970j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        i0 i0Var;
        synchronized (this.f41964a) {
            this.d.a(i10);
            ia iaVar = this.f41975o;
            if (iaVar != null && (i0Var = ((r) iaVar.f20290b).W) != null) {
                i0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        i0 i0Var;
        synchronized (this.f41964a) {
            try {
                MediaFormat mediaFormat = this.f41969i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f41968g.add(mediaFormat);
                    this.f41969i = null;
                }
                this.e.a(i10);
                this.f41967f.add(bufferInfo);
                ia iaVar = this.f41975o;
                if (iaVar != null && (i0Var = ((r) iaVar.f20290b).W) != null) {
                    i0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f41964a) {
            this.e.a(-2);
            this.f41968g.add(mediaFormat);
            this.f41969i = null;
        }
    }
}
