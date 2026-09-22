package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.i0;
import java.util.ArrayDeque;
import org.telegram.ui.Cells.ia;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f41939b;
    public Handler f41940c;
    public MediaFormat h;
    public MediaFormat f41943i;
    public MediaCodec.CodecException f41944j;
    public MediaCodec.CryptoException f41945k;
    public long f41946l;
    public boolean f41947m;
    public IllegalStateException f41948n;
    public ia f41949o;
    public final Object f41938a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h e = new a0.h();
    public final ArrayDeque f41941f = new ArrayDeque();
    public final ArrayDeque f41942g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f41939b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f41942g;
        if (!arrayDeque.isEmpty()) {
            this.f41943i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f15b = hVar.f14a;
        a0.h hVar2 = this.e;
        hVar2.f15b = hVar2.f14a;
        this.f41941f.clear();
        arrayDeque.clear();
    }

    public final void b(MediaCodec mediaCodec) {
        boolean z10;
        if (this.f41940c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        HandlerThread handlerThread = this.f41939b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f41940c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f41938a) {
            this.f41948n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f41938a) {
            this.f41945k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f41938a) {
            this.f41944j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        i0 i0Var;
        synchronized (this.f41938a) {
            this.d.a(i10);
            ia iaVar = this.f41949o;
            if (iaVar != null && (i0Var = ((r) iaVar.f20260b).W) != null) {
                i0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        i0 i0Var;
        synchronized (this.f41938a) {
            try {
                MediaFormat mediaFormat = this.f41943i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f41942g.add(mediaFormat);
                    this.f41943i = null;
                }
                this.e.a(i10);
                this.f41941f.add(bufferInfo);
                ia iaVar = this.f41949o;
                if (iaVar != null && (i0Var = ((r) iaVar.f20260b).W) != null) {
                    i0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f41938a) {
            this.e.a(-2);
            this.f41942g.add(mediaFormat);
            this.f41943i = null;
        }
    }
}
