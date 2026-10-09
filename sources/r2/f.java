package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.j0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f46872b;
    public Handler f46873c;
    public MediaFormat h;
    public MediaFormat f46877i;
    public MediaCodec.CodecException f46878j;
    public MediaCodec.CryptoException f46879k;
    public long f46880l;
    public boolean f46881m;
    public IllegalStateException f46882n;
    public l2.f f46883o;
    public final Object f46871a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h f46874e = new a0.h();
    public final ArrayDeque f46875f = new ArrayDeque();
    public final ArrayDeque f46876g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f46872b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f46876g;
        if (!arrayDeque.isEmpty()) {
            this.f46877i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f17b = hVar.f16a;
        a0.h hVar2 = this.f46874e;
        hVar2.f17b = hVar2.f16a;
        this.f46875f.clear();
        arrayDeque.clear();
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f46871a) {
            this.f46882n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f46871a) {
            this.f46879k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f46871a) {
            this.f46878j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        j0 j0Var;
        synchronized (this.f46871a) {
            this.d.a(i10);
            l2.f fVar = this.f46883o;
            if (fVar != null && (j0Var = ((s) fVar.f15331b).W) != null) {
                j0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        j0 j0Var;
        synchronized (this.f46871a) {
            try {
                MediaFormat mediaFormat = this.f46877i;
                if (mediaFormat != null) {
                    this.f46874e.a(-2);
                    this.f46876g.add(mediaFormat);
                    this.f46877i = null;
                }
                this.f46874e.a(i10);
                this.f46875f.add(bufferInfo);
                l2.f fVar = this.f46883o;
                if (fVar != null && (j0Var = ((s) fVar.f15331b).W) != null) {
                    j0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f46871a) {
            this.f46874e.a(-2);
            this.f46876g.add(mediaFormat);
            this.f46877i = null;
        }
    }
}
