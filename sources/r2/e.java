package r2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import e2.d0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
public final class e implements m {
    public static final ArrayDeque f44803g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec f44804a;
    public final HandlerThread f44805b;
    public androidx.mediarouter.app.c f44806c;
    public final AtomicReference d;
    public final e2.g f44807e;
    public boolean f44808f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        e2.g gVar = new e2.g();
        this.f44804a = mediaCodec;
        this.f44805b = handlerThread;
        this.f44807e = gVar;
        this.d = new AtomicReference();
    }

    public static d d() {
        ArrayDeque arrayDeque = f44803g;
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
        ArrayDeque arrayDeque = f44803g;
        synchronized (arrayDeque) {
            arrayDeque.add(dVar);
        }
    }

    @Override
    public final void a(long j3, int i10, int i11, int i12) {
        c();
        d d = d();
        d.f44799a = i10;
        d.f44800b = i11;
        d.d = j3;
        d.f44802e = i12;
        androidx.mediarouter.app.c cVar = this.f44806c;
        String str = d0.f8737a;
        cVar.obtainMessage(1, d).sendToTarget();
    }

    @Override
    public final void b(int i10, h2.c cVar, long j3, int i11) {
        c();
        d d = d();
        d.f44799a = i10;
        d.f44800b = 0;
        d.d = j3;
        d.f44802e = i11;
        MediaCodec.CryptoInfo cryptoInfo = d.f44801c;
        cryptoInfo.numSubSamples = cVar.f10842f;
        int[] iArr = cVar.d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 != null && iArr2.length >= iArr.length) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = cVar.f10841e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= iArr3.length) {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = cVar.f10839b;
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
        byte[] bArr3 = cVar.f10838a;
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
        cryptoInfo.mode = cVar.f10840c;
        if (Build.VERSION.SDK_INT >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f10843g, cVar.h));
        }
        androidx.mediarouter.app.c cVar2 = this.f44806c;
        String str = d0.f8737a;
        cVar2.obtainMessage(2, d).sendToTarget();
    }

    @Override
    public final void c() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    @Override
    public final void flush() {
        if (this.f44808f) {
            try {
                androidx.mediarouter.app.c cVar = this.f44806c;
                cVar.getClass();
                cVar.removeCallbacksAndMessages(null);
                e2.g gVar = this.f44807e;
                synchronized (gVar) {
                    gVar.f8754b = false;
                }
                androidx.mediarouter.app.c cVar2 = this.f44806c;
                cVar2.getClass();
                cVar2.obtainMessage(3).sendToTarget();
                gVar.a();
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e7);
            }
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        c();
        androidx.mediarouter.app.c cVar = this.f44806c;
        String str = d0.f8737a;
        cVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override
    public final void shutdown() {
        if (this.f44808f) {
            flush();
            this.f44805b.quit();
        }
        this.f44808f = false;
    }

    @Override
    public final void start() {
        if (!this.f44808f) {
            HandlerThread handlerThread = this.f44805b;
            handlerThread.start();
            this.f44806c = new androidx.mediarouter.app.c(this, handlerThread.getLooper(), 11);
            this.f44808f = true;
        }
    }
}
