package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.m0;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f46231b;
    public Handler f46232c;
    public MediaFormat h;
    public MediaFormat f46235i;
    public MediaCodec.CodecException f46236j;
    public MediaCodec.CryptoException f46237k;
    public long f46238l;
    public boolean f46239m;
    public IllegalStateException f46240n;
    public n2.u f46241o;
    public final Object f46230a = new Object();
    public final e2.f d = new e2.f(0);
    public final e2.f e = new e2.f(0);
    public final ArrayDeque f46233f = new ArrayDeque();
    public final ArrayDeque f46234g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f46231b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f46234g;
        if (!arrayDeque.isEmpty()) {
            this.f46235i = (MediaFormat) arrayDeque.getLast();
        }
        e2.f fVar = this.d;
        fVar.f6136b = fVar.f6135a;
        e2.f fVar2 = this.e;
        fVar2.f6136b = fVar2.f6135a;
        this.f46233f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f46240n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f46236j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f46237k;
                if (cryptoException == null) {
                    return;
                }
                this.f46237k = null;
                throw cryptoException;
            }
            this.f46236j = null;
            throw codecException;
        }
        this.f46240n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f46230a) {
            this.f46240n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f46230a) {
            this.f46237k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f46230a) {
            this.f46236j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        m0 m0Var;
        synchronized (this.f46230a) {
            this.d.a(i10);
            n2.u uVar = this.f46241o;
            if (uVar != null && (m0Var = ((r) uVar.f13481b).Y) != null) {
                m0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        m0 m0Var;
        synchronized (this.f46230a) {
            try {
                MediaFormat mediaFormat = this.f46235i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f46234g.add(mediaFormat);
                    this.f46235i = null;
                }
                this.e.a(i10);
                this.f46233f.add(bufferInfo);
                n2.u uVar = this.f46241o;
                if (uVar != null && (m0Var = ((r) uVar.f13481b).Y) != null) {
                    m0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f46230a) {
            this.e.a(-2);
            this.f46234g.add(mediaFormat);
            this.f46235i = null;
        }
    }
}
