package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.m0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f46220b;
    public Handler f46221c;
    public MediaFormat h;
    public MediaFormat f46224i;
    public MediaCodec.CodecException f46225j;
    public MediaCodec.CryptoException f46226k;
    public long f46227l;
    public boolean f46228m;
    public IllegalStateException f46229n;
    public n2.u f46230o;
    public final Object f46219a = new Object();
    public final e2.f d = new e2.f();
    public final e2.f e = new e2.f();
    public final ArrayDeque f46222f = new ArrayDeque();
    public final ArrayDeque f46223g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f46220b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f46223g;
        if (!arrayDeque.isEmpty()) {
            this.f46224i = (MediaFormat) arrayDeque.getLast();
        }
        e2.f fVar = this.d;
        fVar.f6136b = fVar.f6135a;
        e2.f fVar2 = this.e;
        fVar2.f6136b = fVar2.f6135a;
        this.f46222f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f46229n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f46225j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f46226k;
                if (cryptoException == null) {
                    return;
                }
                this.f46226k = null;
                throw cryptoException;
            }
            this.f46225j = null;
            throw codecException;
        }
        this.f46229n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f46219a) {
            this.f46229n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f46219a) {
            this.f46226k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f46219a) {
            this.f46225j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        m0 m0Var;
        synchronized (this.f46219a) {
            this.d.a(i10);
            n2.u uVar = this.f46230o;
            if (uVar != null && (m0Var = ((r) uVar.f13480b).Y) != null) {
                m0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        m0 m0Var;
        synchronized (this.f46219a) {
            try {
                MediaFormat mediaFormat = this.f46224i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f46223g.add(mediaFormat);
                    this.f46224i = null;
                }
                this.e.a(i10);
                this.f46222f.add(bufferInfo);
                n2.u uVar = this.f46230o;
                if (uVar != null && (m0Var = ((r) uVar.f13480b).Y) != null) {
                    m0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f46219a) {
            this.e.a(-2);
            this.f46223g.add(mediaFormat);
            this.f46224i = null;
        }
    }
}
