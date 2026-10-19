package r2;

import ab.o0;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import e2.m0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
public final class e implements m {
    public static final ArrayDeque h = new ArrayDeque();
    public static final Object f44905n = new Object();
    public final MediaCodec f44906a;
    public final HandlerThread f44907b;
    public o0 f44908c;
    public final AtomicReference d;
    public final e2.i e;
    public boolean f44909f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        e2.i iVar = new e2.i();
        this.f44906a = mediaCodec;
        this.f44907b = handlerThread;
        this.e = iVar;
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
    public final void a(long j10, int i10, int i11, int i12) {
        n();
        d c10 = c();
        c10.f44902a = i10;
        c10.f44903b = i11;
        c10.d = j10;
        c10.e = i12;
        o0 o0Var = this.f44908c;
        String str = m0.f8254a;
        o0Var.obtainMessage(1, c10).sendToTarget();
    }

    @Override
    public final void b(int i10, h2.d dVar, long j10, int i11) {
        n();
        d c10 = c();
        c10.f44902a = i10;
        c10.f44903b = 0;
        c10.d = j10;
        c10.e = i11;
        MediaCodec.CryptoInfo cryptoInfo = c10.f44904c;
        cryptoInfo.numSubSamples = dVar.f11630f;
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
        byte[] bArr = dVar.f11628b;
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
        byte[] bArr3 = dVar.f11627a;
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
        cryptoInfo.mode = dVar.f11629c;
        if (Build.VERSION.SDK_INT >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(dVar.f11631g, dVar.h));
        }
        o0 o0Var = this.f44908c;
        String str = m0.f8254a;
        o0Var.obtainMessage(2, c10).sendToTarget();
    }

    @Override
    public final void flush() {
        if (this.f44909f) {
            try {
                o0 o0Var = this.f44908c;
                o0Var.getClass();
                o0Var.removeCallbacksAndMessages(null);
                e2.i iVar = this.e;
                synchronized (iVar) {
                    iVar.f8237b = false;
                }
                o0 o0Var2 = this.f44908c;
                o0Var2.getClass();
                o0Var2.obtainMessage(3).sendToTarget();
                iVar.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override
    public final void n() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    @Override
    public final void setParameters(Bundle bundle) {
        n();
        o0 o0Var = this.f44908c;
        String str = m0.f8254a;
        o0Var.obtainMessage(4, bundle).sendToTarget();
    }

    @Override
    public final void shutdown() {
        if (this.f44909f) {
            flush();
            this.f44907b.quit();
        }
        this.f44909f = false;
    }

    @Override
    public final void start() {
        if (!this.f44909f) {
            HandlerThread handlerThread = this.f44907b;
            handlerThread.start();
            this.f44908c = new o0(this, handlerThread.getLooper(), 12);
            this.f44909f = true;
        }
    }
}
