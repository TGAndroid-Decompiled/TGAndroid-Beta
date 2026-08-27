package y3;

import android.media.MediaCodec;
import android.os.HandlerThread;
import d5.g0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public final class e {

    public static final ArrayDeque f49467g = new ArrayDeque();
    public static final Object h = new Object();

    public final MediaCodec f49468a;

    public final HandlerThread f49469b;

    public androidx.mediarouter.app.c f49470c;
    public final AtomicReference d;

    public final d5.c f49471e;

    public boolean f49472f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        d5.c cVar = new d5.c();
        this.f49468a = mediaCodec;
        this.f49469b = handlerThread;
        this.f49471e = cVar;
        this.d = new AtomicReference();
    }

    public static d b() {
        ArrayDeque arrayDeque = f49467g;
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
        ArrayDeque arrayDeque = f49467g;
        synchronized (arrayDeque) {
            arrayDeque.add(dVar);
        }
    }

    public final void a() {
        if (this.f49472f) {
            try {
                androidx.mediarouter.app.c cVar = this.f49470c;
                cVar.getClass();
                cVar.removeCallbacksAndMessages(null);
                d5.c cVar2 = this.f49471e;
                cVar2.b();
                androidx.mediarouter.app.c cVar3 = this.f49470c;
                cVar3.getClass();
                cVar3.obtainMessage(2).sendToTarget();
                synchronized (cVar2) {
                    while (!cVar2.f4779a) {
                        cVar2.wait();
                    }
                }
            } catch (InterruptedException e9) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e9);
            }
        }
    }

    public final void c(int i10, k3.d dVar, long j10) {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        d dVarB = b();
        dVarB.f49463a = i10;
        dVarB.f49464b = 0;
        dVarB.d = j10;
        dVarB.f49466e = 0;
        MediaCodec.CryptoInfo cryptoInfo = dVarB.f49465c;
        cryptoInfo.numSubSamples = dVar.f14414f;
        int[] iArr = dVar.d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = dVar.f14413e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = dVar.f14411b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = dVar.f14410a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = dVar.f14412c;
        if (g0.f4795a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(dVar.f14415g, dVar.h));
        }
        this.f49470c.obtainMessage(1, dVarB).sendToTarget();
    }
}
