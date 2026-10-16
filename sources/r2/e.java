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
    public static final Object f43577n = new Object();
    public final MediaCodec f43578a;
    public final HandlerThread f43579b;
    public o0 f43580c;
    public final AtomicReference d;
    public final e2.i e;
    public boolean f43581f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        e2.i iVar = new e2.i();
        this.f43578a = mediaCodec;
        this.f43579b = handlerThread;
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

    public static void c(d dVar) {
        ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            arrayDeque.add(dVar);
        }
    }

    @Override
    public final void b(long j10, int i10, int i11, int i12) {
        s0();
        d a2 = a();
        a2.f43574a = i10;
        a2.f43575b = i11;
        a2.d = j10;
        a2.e = i12;
        o0 o0Var = this.f43580c;
        String str = m0.f8375a;
        o0Var.obtainMessage(1, a2).sendToTarget();
    }

    @Override
    public final void d(int i10, h2.d dVar, long j10, int i11) {
        s0();
        d a2 = a();
        a2.f43574a = i10;
        a2.f43575b = 0;
        a2.d = j10;
        a2.e = i11;
        MediaCodec.CryptoInfo cryptoInfo = a2.f43576c;
        cryptoInfo.numSubSamples = dVar.f10324f;
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
        byte[] bArr = dVar.f10322b;
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
        byte[] bArr3 = dVar.f10321a;
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
        cryptoInfo.mode = dVar.f10323c;
        if (Build.VERSION.SDK_INT >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(dVar.f10325g, dVar.h));
        }
        o0 o0Var = this.f43580c;
        String str = m0.f8375a;
        o0Var.obtainMessage(2, a2).sendToTarget();
    }

    @Override
    public final void flush() {
        if (this.f43581f) {
            try {
                o0 o0Var = this.f43580c;
                o0Var.getClass();
                o0Var.removeCallbacksAndMessages(null);
                e2.i iVar = this.e;
                synchronized (iVar) {
                    iVar.f8358b = false;
                }
                o0 o0Var2 = this.f43580c;
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
    public final void s0() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    @Override
    public final void setParameters(Bundle bundle) {
        s0();
        o0 o0Var = this.f43580c;
        String str = m0.f8375a;
        o0Var.obtainMessage(4, bundle).sendToTarget();
    }

    @Override
    public final void shutdown() {
        if (this.f43581f) {
            flush();
            this.f43579b.quit();
        }
        this.f43581f = false;
    }

    @Override
    public final void start() {
        if (!this.f43581f) {
            HandlerThread handlerThread = this.f43579b;
            handlerThread.start();
            this.f43580c = new o0(this, handlerThread.getLooper(), 12);
            this.f43581f = true;
        }
    }
}
