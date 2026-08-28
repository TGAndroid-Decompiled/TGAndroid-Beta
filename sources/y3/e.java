package y3;

import android.media.MediaCodec;
import android.os.HandlerThread;
import d5.f0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
public final class e {
    public static final ArrayDeque f49477g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec f49478a;
    public final HandlerThread f49479b;
    public androidx.mediarouter.app.d f49480c;
    public final AtomicReference d;
    public final d5.c f49481e;
    public boolean f49482f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ?? obj = new Object();
        this.f49478a = mediaCodec;
        this.f49479b = handlerThread;
        this.f49481e = obj;
        this.d = new AtomicReference();
    }

    public static d b() {
        ArrayDeque arrayDeque = f49477g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new d();
                }
                return (d) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void d(d dVar) {
        ArrayDeque arrayDeque = f49477g;
        synchronized (arrayDeque) {
            arrayDeque.add(dVar);
        }
    }

    public final void a() {
        if (this.f49482f) {
            try {
                androidx.mediarouter.app.d dVar = this.f49480c;
                dVar.getClass();
                dVar.removeCallbacksAndMessages(null);
                d5.c cVar = this.f49481e;
                cVar.b();
                androidx.mediarouter.app.d dVar2 = this.f49480c;
                dVar2.getClass();
                dVar2.obtainMessage(2).sendToTarget();
                synchronized (cVar) {
                    while (!cVar.f4335a) {
                        cVar.wait();
                    }
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public final void c(int i9, k3.d dVar, long j10) {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException == null) {
            d b10 = b();
            b10.f49473a = i9;
            b10.f49474b = 0;
            b10.d = j10;
            b10.f49476e = 0;
            MediaCodec.CryptoInfo cryptoInfo = b10.f49475c;
            cryptoInfo.numSubSamples = dVar.f14593f;
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
            int[] iArr3 = dVar.f14592e;
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 != null) {
                if (iArr4 != null && iArr4.length >= iArr3.length) {
                    System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                } else {
                    iArr4 = Arrays.copyOf(iArr3, iArr3.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArr4;
            byte[] bArr = dVar.f14590b;
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
            byte[] bArr3 = dVar.f14589a;
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
            cryptoInfo.mode = dVar.f14591c;
            if (f0.f4349a >= 24) {
                cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(dVar.f14594g, dVar.h));
            }
            this.f49480c.obtainMessage(1, b10).sendToTarget();
            return;
        }
        throw runtimeException;
    }
}
