package u2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import h2.m0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
public final class e implements m {
    public static final ArrayDeque h = new ArrayDeque();
    public static final Object f56242n = new Object();
    public final MediaCodec f56243a;
    public final HandlerThread f56244b;
    public android.support.v4.media.session.q f56245c;
    public final AtomicReference d;
    public final h2.i f56246e;
    public boolean f56247f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        h2.i iVar = new h2.i();
        this.f56243a = mediaCodec;
        this.f56244b = handlerThread;
        this.f56246e = iVar;
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

    public static void d(d dVar) {
        ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            arrayDeque.add(dVar);
        }
    }

    @Override
    public final void a(int i7, int i10, int i11, long j3) {
        i();
        d c10 = c();
        c10.f56238a = i7;
        c10.f56239b = i10;
        c10.d = j3;
        c10.f56241e = i11;
        android.support.v4.media.session.q qVar = this.f56245c;
        String str = m0.f14114a;
        qVar.obtainMessage(1, c10).sendToTarget();
    }

    @Override
    public final void b(int i7, k2.d dVar, long j3, int i10) {
        i();
        d c10 = c();
        c10.f56238a = i7;
        c10.f56239b = 0;
        c10.d = j3;
        c10.f56241e = i10;
        MediaCodec.CryptoInfo cryptoInfo = c10.f56240c;
        cryptoInfo.numSubSamples = dVar.f17169f;
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
        int[] iArr3 = dVar.f17168e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= iArr3.length) {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = dVar.f17166b;
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
        byte[] bArr3 = dVar.f17165a;
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
        cryptoInfo.mode = dVar.f17167c;
        if (Build.VERSION.SDK_INT >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(dVar.f17170g, dVar.h));
        }
        android.support.v4.media.session.q qVar = this.f56245c;
        String str = m0.f14114a;
        qVar.obtainMessage(2, c10).sendToTarget();
    }

    @Override
    public final void flush() {
        if (this.f56247f) {
            try {
                android.support.v4.media.session.q qVar = this.f56245c;
                qVar.getClass();
                qVar.removeCallbacksAndMessages(null);
                h2.i iVar = this.f56246e;
                synchronized (iVar) {
                    iVar.f14096b = false;
                }
                android.support.v4.media.session.q qVar2 = this.f56245c;
                qVar2.getClass();
                qVar2.obtainMessage(3).sendToTarget();
                iVar.a();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override
    public final void i() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    @Override
    public final void setParameters(Bundle bundle) {
        i();
        android.support.v4.media.session.q qVar = this.f56245c;
        String str = m0.f14114a;
        qVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override
    public final void shutdown() {
        if (this.f56247f) {
            flush();
            this.f56244b.quit();
        }
        this.f56247f = false;
    }

    @Override
    public final void start() {
        if (!this.f56247f) {
            HandlerThread handlerThread = this.f56244b;
            handlerThread.start();
            this.f56245c = new android.support.v4.media.session.q(this, handlerThread.getLooper(), 13);
            this.f56247f = true;
        }
    }
}
