package t2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import g2.n0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
public final class e implements m {
    public static final ArrayDeque h = new ArrayDeque();
    public static final Object f54823n = new Object();
    public final MediaCodec f54824a;
    public final HandlerThread f54825b;
    public android.support.v4.media.session.q f54826c;
    public final AtomicReference d;
    public final g2.j f54827e;
    public boolean f54828f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        g2.j jVar = new g2.j();
        this.f54824a = mediaCodec;
        this.f54825b = handlerThread;
        this.f54827e = jVar;
        this.d = new AtomicReference();
    }

    public static d c() {
        ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new d();
                }
                return (d) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void e(d dVar) {
        ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            arrayDeque.add(dVar);
        }
    }

    @Override
    public final void a(int i3, j2.d dVar, long j10, int i10) {
        d();
        d c2 = c();
        c2.f54819a = i3;
        c2.f54820b = 0;
        c2.d = j10;
        c2.f54822e = i10;
        MediaCodec.CryptoInfo cryptoInfo = c2.f54821c;
        cryptoInfo.numSubSamples = dVar.f16151f;
        int[] iArr = dVar.d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 != null && iArr2.length >= iArr.length) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = dVar.f16150e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= iArr3.length) {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = dVar.f16148b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 != null && bArr2.length >= bArr.length) {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = dVar.f16147a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 != null && bArr4.length >= bArr3.length) {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            } else {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = dVar.f16149c;
        if (Build.VERSION.SDK_INT >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(dVar.f16152g, dVar.h));
        }
        android.support.v4.media.session.q qVar = this.f54826c;
        String str = n0.f11873a;
        qVar.obtainMessage(2, c2).sendToTarget();
    }

    @Override
    public final void b(int i3, int i10, int i11, long j10) {
        d();
        d c2 = c();
        c2.f54819a = i3;
        c2.f54820b = i10;
        c2.d = j10;
        c2.f54822e = i11;
        android.support.v4.media.session.q qVar = this.f54826c;
        String str = n0.f11873a;
        qVar.obtainMessage(1, c2).sendToTarget();
    }

    @Override
    public final void d() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    @Override
    public final void flush() {
        if (this.f54828f) {
            try {
                android.support.v4.media.session.q qVar = this.f54826c;
                qVar.getClass();
                qVar.removeCallbacksAndMessages(null);
                g2.j jVar = this.f54827e;
                synchronized (jVar) {
                    jVar.f11855b = false;
                }
                android.support.v4.media.session.q qVar2 = this.f54826c;
                qVar2.getClass();
                qVar2.obtainMessage(3).sendToTarget();
                jVar.a();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        d();
        android.support.v4.media.session.q qVar = this.f54826c;
        String str = n0.f11873a;
        qVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override
    public final void shutdown() {
        if (this.f54828f) {
            flush();
            this.f54825b.quit();
        }
        this.f54828f = false;
    }

    @Override
    public final void start() {
        if (!this.f54828f) {
            HandlerThread handlerThread = this.f54825b;
            handlerThread.start();
            this.f54826c = new android.support.v4.media.session.q(this, handlerThread.getLooper(), 13);
            this.f54828f = true;
        }
    }
}
