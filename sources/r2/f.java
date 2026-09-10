package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.h0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f41162b;
    public Handler f41163c;
    public MediaFormat h;
    public MediaFormat f41166i;
    public MediaCodec.CodecException f41167j;
    public MediaCodec.CryptoException f41168k;
    public long f41169l;
    public boolean f41170m;
    public IllegalStateException f41171n;
    public o0.b f41172o;
    public final Object f41161a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h e = new a0.h();
    public final ArrayDeque f41164f = new ArrayDeque();
    public final ArrayDeque f41165g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f41162b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f41165g;
        if (!arrayDeque.isEmpty()) {
            this.f41166i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f15b = hVar.f14a;
        a0.h hVar2 = this.e;
        hVar2.f15b = hVar2.f14a;
        this.f41164f.clear();
        arrayDeque.clear();
    }

    public final void b(MediaCodec mediaCodec) {
        boolean z10;
        if (this.f41163c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        HandlerThread handlerThread = this.f41162b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f41163c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f41161a) {
            this.f41171n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f41161a) {
            this.f41168k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f41161a) {
            this.f41167j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        h0 h0Var;
        synchronized (this.f41161a) {
            this.d.a(i10);
            o0.b bVar = this.f41172o;
            if (bVar != null && (h0Var = ((r) bVar.f14084a).W) != null) {
                h0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        h0 h0Var;
        synchronized (this.f41161a) {
            try {
                MediaFormat mediaFormat = this.f41166i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f41165g.add(mediaFormat);
                    this.f41166i = null;
                }
                this.e.a(i10);
                this.f41164f.add(bufferInfo);
                o0.b bVar = this.f41172o;
                if (bVar != null && (h0Var = ((r) bVar.f14084a).W) != null) {
                    h0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f41161a) {
            this.e.a(-2);
            this.f41165g.add(mediaFormat);
            this.f41166i = null;
        }
    }
}
