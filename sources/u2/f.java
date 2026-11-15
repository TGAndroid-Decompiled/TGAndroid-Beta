package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import l2.i0;
import org.telegram.ui.Components.cf;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f57748b;
    public Handler f57749c;
    public MediaFormat h;
    public MediaFormat f57753i;
    public MediaCodec.CodecException f57754j;
    public MediaCodec.CryptoException f57755k;
    public long f57756l;
    public boolean f57757m;
    public IllegalStateException f57758n;
    public cf f57759o;
    public final Object f57747a = new Object();
    public final h2.f d = new h2.f(0);
    public final h2.f f57750e = new h2.f(0);
    public final ArrayDeque f57751f = new ArrayDeque();
    public final ArrayDeque f57752g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f57748b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f57752g;
        if (!arrayDeque.isEmpty()) {
            this.f57753i = (MediaFormat) arrayDeque.getLast();
        }
        h2.f fVar = this.d;
        fVar.f13441b = fVar.f13440a;
        h2.f fVar2 = this.f57750e;
        fVar2.f13441b = fVar2.f13440a;
        this.f57751f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f57758n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.f57754j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.f57755k;
                if (cryptoException == null) {
                    return;
                }
                this.f57755k = null;
                throw cryptoException;
            }
            this.f57754j = null;
            throw codecException;
        }
        this.f57758n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f57747a) {
            this.f57758n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f57747a) {
            this.f57755k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f57747a) {
            this.f57754j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        i0 i0Var;
        synchronized (this.f57747a) {
            this.d.a(i7);
            cf cfVar = this.f57759o;
            if (cfVar != null && (i0Var = ((r) cfVar.f33545a).Z) != null) {
                i0Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        i0 i0Var;
        synchronized (this.f57747a) {
            try {
                MediaFormat mediaFormat = this.f57753i;
                if (mediaFormat != null) {
                    this.f57750e.a(-2);
                    this.f57752g.add(mediaFormat);
                    this.f57753i = null;
                }
                this.f57750e.a(i7);
                this.f57751f.add(bufferInfo);
                cf cfVar = this.f57759o;
                if (cfVar != null && (i0Var = ((r) cfVar.f33545a).Z) != null) {
                    i0Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f57747a) {
            this.f57750e.a(-2);
            this.f57752g.add(mediaFormat);
            this.f57753i = null;
        }
    }
}
