package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.j0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f46874b;
    public Handler f46875c;
    public MediaFormat h;
    public MediaFormat f46879i;
    public MediaCodec.CodecException f46880j;
    public MediaCodec.CryptoException f46881k;
    public long f46882l;
    public boolean f46883m;
    public IllegalStateException f46884n;
    public l2.f f46885o;
    public final Object f46873a = new Object();
    public final a0.h d = new a0.h();
    public final a0.h f46876e = new a0.h();
    public final ArrayDeque f46877f = new ArrayDeque();
    public final ArrayDeque f46878g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f46874b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f46878g;
        if (!arrayDeque.isEmpty()) {
            this.f46879i = (MediaFormat) arrayDeque.getLast();
        }
        a0.h hVar = this.d;
        hVar.f17b = hVar.f16a;
        a0.h hVar2 = this.f46876e;
        hVar2.f17b = hVar2.f16a;
        this.f46877f.clear();
        arrayDeque.clear();
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f46873a) {
            this.f46884n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f46873a) {
            this.f46881k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f46873a) {
            this.f46880j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        j0 j0Var;
        synchronized (this.f46873a) {
            this.d.a(i10);
            l2.f fVar = this.f46885o;
            if (fVar != null && (j0Var = ((s) fVar.f15331b).W) != null) {
                j0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        j0 j0Var;
        synchronized (this.f46873a) {
            try {
                MediaFormat mediaFormat = this.f46879i;
                if (mediaFormat != null) {
                    this.f46876e.a(-2);
                    this.f46878g.add(mediaFormat);
                    this.f46879i = null;
                }
                this.f46876e.a(i10);
                this.f46877f.add(bufferInfo);
                l2.f fVar = this.f46885o;
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
        synchronized (this.f46873a) {
            this.f46876e.a(-2);
            this.f46878g.add(mediaFormat);
            this.f46879i = null;
        }
    }
}
