package r2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import e2.n0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
public final class e implements m {
    public static final ArrayDeque h = new ArrayDeque();
    public static final Object f47233n = new Object();
    public final MediaCodec f47234a;
    public final HandlerThread f47235b;
    public androidx.mediarouter.app.c f47236c;
    public final AtomicReference d;
    public final e2.i e;
    public boolean f47237f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        e2.i iVar = new e2.i();
        this.f47234a = mediaCodec;
        this.f47235b = handlerThread;
        this.e = iVar;
        this.d = new AtomicReference();
    }

    public static d a() {
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

    public static void b(d dVar) {
        ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            arrayDeque.add(dVar);
        }
    }

    @Override
    public final void N() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    @Override
    public final void d(long j10, int i10, int i11, int i12) {
        N();
        d a2 = a();
        a2.f47230a = i10;
        a2.f47231b = i11;
        a2.d = j10;
        a2.e = i12;
        androidx.mediarouter.app.c cVar = this.f47236c;
        String str = n0.f9691a;
        cVar.obtainMessage(1, a2).sendToTarget();
    }

    @Override
    public final void e(int i10, h2.d dVar, long j10, int i11) {
        N();
        d a2 = a();
        a2.f47230a = i10;
        a2.f47231b = 0;
        a2.d = j10;
        a2.e = i11;
        MediaCodec.CryptoInfo cryptoInfo = a2.f47232c;
        cryptoInfo.numSubSamples = dVar.f12563f;
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
        int[] iArr3 = dVar.e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= iArr3.length) {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = dVar.f12561b;
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
        byte[] bArr3 = dVar.f12560a;
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
        cryptoInfo.mode = dVar.f12562c;
        if (Build.VERSION.SDK_INT >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(dVar.f12564g, dVar.h));
        }
        androidx.mediarouter.app.c cVar = this.f47236c;
        String str = n0.f9691a;
        cVar.obtainMessage(2, a2).sendToTarget();
    }

    @Override
    public final void flush() {
        if (this.f47237f) {
            try {
                androidx.mediarouter.app.c cVar = this.f47236c;
                cVar.getClass();
                cVar.removeCallbacksAndMessages(null);
                e2.i iVar = this.e;
                synchronized (iVar) {
                    iVar.f9669b = false;
                }
                androidx.mediarouter.app.c cVar2 = this.f47236c;
                cVar2.getClass();
                cVar2.obtainMessage(3).sendToTarget();
                iVar.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        N();
        androidx.mediarouter.app.c cVar = this.f47236c;
        String str = n0.f9691a;
        cVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override
    public final void shutdown() {
        if (this.f47237f) {
            flush();
            this.f47235b.quit();
        }
        this.f47237f = false;
    }

    @Override
    public final void start() {
        if (!this.f47237f) {
            HandlerThread handlerThread = this.f47235b;
            handlerThread.start();
            this.f47236c = new androidx.mediarouter.app.c(this, handlerThread.getLooper(), 12);
            this.f47237f = true;
        }
    }
}
