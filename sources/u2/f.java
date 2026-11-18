package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import l2.i0;
import org.telegram.ui.Cells.c5;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f58316b;
    public Handler f58317c;
    public MediaFormat h;
    public MediaFormat f58321i;
    public MediaCodec.CodecException f58322j;
    public MediaCodec.CryptoException f58323k;
    public long f58324l;
    public boolean f58325m;
    public IllegalStateException f58326n;
    public c5 f58327o;
    public final Object f58315a = new Object();
    public final h2.f d = new h2.f(0);
    public final h2.f f58318e = new h2.f(0);
    public final ArrayDeque f58319f = new ArrayDeque();
    public final ArrayDeque f58320g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f58316b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f58320g;
        if (!arrayDeque.isEmpty()) {
            this.f58321i = (MediaFormat) arrayDeque.getLast();
        }
        h2.f fVar = this.d;
        fVar.f13753b = fVar.f13752a;
        h2.f fVar2 = this.f58318e;
        fVar2.f13753b = fVar2.f13752a;
        this.f58319f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f58326n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f58322j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f58323k;
                if (cryptoException == null) {
                    return;
                }
                this.f58323k = null;
                throw cryptoException;
            }
            this.f58322j = null;
            throw codecException;
        }
        this.f58326n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f58315a) {
            this.f58326n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f58315a) {
            this.f58323k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f58315a) {
            this.f58322j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        i0 i0Var;
        synchronized (this.f58315a) {
            this.d.a(i7);
            c5 c5Var = this.f58327o;
            if (c5Var != null && (i0Var = ((r) c5Var.f30477a).Z) != null) {
                i0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        i0 i0Var;
        synchronized (this.f58315a) {
            try {
                MediaFormat mediaFormat = this.f58321i;
                if (mediaFormat != null) {
                    this.f58318e.a(-2);
                    this.f58320g.add(mediaFormat);
                    this.f58321i = null;
                }
                this.f58318e.a(i7);
                this.f58319f.add(bufferInfo);
                c5 c5Var = this.f58327o;
                if (c5Var != null && (i0Var = ((r) c5Var.f30477a).Z) != null) {
                    i0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f58315a) {
            this.f58318e.a(-2);
            this.f58320g.add(mediaFormat);
            this.f58321i = null;
        }
    }
}
