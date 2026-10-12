package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import i2.l0;
import java.util.ArrayDeque;
import ji.w4;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f43824b;
    public Handler f43825c;
    public MediaFormat h;
    public MediaFormat f43828i;
    public MediaCodec.CodecException f43829j;
    public MediaCodec.CryptoException f43830k;
    public long f43831l;
    public boolean f43832m;
    public IllegalStateException f43833n;
    public w4 f43834o;
    public final Object f43823a = new Object();
    public final e2.f d = new e2.f();
    public final e2.f e = new e2.f();
    public final ArrayDeque f43826f = new ArrayDeque();
    public final ArrayDeque f43827g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f43824b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f43827g;
        if (!arrayDeque.isEmpty()) {
            this.f43828i = (MediaFormat) arrayDeque.getLast();
        }
        e2.f fVar = this.d;
        fVar.f8342b = fVar.f8341a;
        e2.f fVar2 = this.e;
        fVar2.f8342b = fVar2.f8341a;
        this.f43826f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f43833n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f43829j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f43830k;
                if (cryptoException == null) {
                    return;
                }
                this.f43830k = null;
                throw cryptoException;
            }
            this.f43829j = null;
            throw codecException;
        }
        this.f43833n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f43823a) {
            this.f43833n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f43823a) {
            this.f43830k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f43823a) {
            this.f43829j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        l0 l0Var;
        synchronized (this.f43823a) {
            this.d.a(i10);
            w4 w4Var = this.f43834o;
            if (w4Var != null && (l0Var = ((r) w4Var.f13592b).Y) != null) {
                l0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        l0 l0Var;
        synchronized (this.f43823a) {
            try {
                MediaFormat mediaFormat = this.f43828i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.f43827g.add(mediaFormat);
                    this.f43828i = null;
                }
                this.e.a(i10);
                this.f43826f.add(bufferInfo);
                w4 w4Var = this.f43834o;
                if (w4Var != null && (l0Var = ((r) w4Var.f13592b).Y) != null) {
                    l0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f43823a) {
            this.e.a(-2);
            this.f43827g.add(mediaFormat);
            this.f43828i = null;
        }
    }
}
