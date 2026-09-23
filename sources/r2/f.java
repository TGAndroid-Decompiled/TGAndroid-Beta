package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.j0;
import java.util.ArrayDeque;
import org.telegram.ui.Cells.ja;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f41895b;
    public Handler f41896c;
    public MediaFormat h;
    public MediaFormat f41899i;
    public MediaCodec.CodecException f41900j;
    public MediaCodec.CryptoException f41901k;
    public long f41902l;
    public boolean f41903m;
    public IllegalStateException f41904n;
    public ja f41905o;
    public final Object f41894a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h e = new a0.h();
    public final ArrayDeque f41897f = new ArrayDeque();
    public final ArrayDeque f41898g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f41895b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f41898g;
        if (!arrayDeque.isEmpty()) {
            this.f41899i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f15b = hVar.f14a;
        a0.h hVar2 = this.e;
        hVar2.f15b = hVar2.f14a;
        this.f41897f.clear();
        arrayDeque.clear();
    }

    public final void b(MediaCodec mediaCodec) {
        boolean z10;
        if (this.f41896c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        HandlerThread handlerThread = this.f41895b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f41896c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f41894a) {
            this.f41904n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f41894a) {
            this.f41901k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f41894a) {
            this.f41900j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        j0 j0Var;
        synchronized (this.f41894a) {
            this.d.a(i10);
            ja jaVar = this.f41905o;
            if (jaVar != null && (j0Var = ((r) jaVar.f20300b).W) != null) {
                j0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        j0 j0Var;
        synchronized (this.f41894a) {
            try {
                MediaFormat mediaFormat = this.f41899i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f41898g.add(mediaFormat);
                    this.f41899i = null;
                }
                this.e.a(i10);
                this.f41897f.add(bufferInfo);
                ja jaVar = this.f41905o;
                if (jaVar != null && (j0Var = ((r) jaVar.f20300b).W) != null) {
                    j0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f41894a) {
            this.e.a(-2);
            this.f41898g.add(mediaFormat);
            this.f41899i = null;
        }
    }
}
