package u2;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import h2.l0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
public final class e implements m {
    public static final ArrayDeque h = new ArrayDeque();
    public static final Object f58434n = new Object();
    public final MediaCodec f58435a;
    public final HandlerThread f58436b;
    public android.support.v4.media.session.q f58437c;
    public final AtomicReference d;
    public final h2.i f58438e;
    public boolean f58439f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        h2.i iVar = new h2.i();
        this.f58435a = mediaCodec;
        this.f58436b = handlerThread;
        this.f58438e = iVar;
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
    public final void flush() {
        if (this.f58439f) {
            try {
                android.support.v4.media.session.q qVar = this.f58437c;
                qVar.getClass();
                qVar.removeCallbacksAndMessages(null);
                h2.i iVar = this.f58438e;
                synchronized (iVar) {
                    iVar.f13761b = false;
                }
                android.support.v4.media.session.q qVar2 = this.f58437c;
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
    public final void g(int i7, int i10, int i11, long j3) {
        w1();
        d a10 = a();
        a10.f58430a = i7;
        a10.f58431b = i10;
        a10.d = j3;
        a10.f58433e = i11;
        android.support.v4.media.session.q qVar = this.f58437c;
        String str = l0.f13778a;
        qVar.obtainMessage(1, a10).sendToTarget();
    }

    @Override
    public final void h(int i7, k2.d dVar, long j3, int i10) {
        w1();
        d a10 = a();
        a10.f58430a = i7;
        a10.f58431b = 0;
        a10.d = j3;
        a10.f58433e = i10;
        MediaCodec.CryptoInfo cryptoInfo = a10.f58432c;
        cryptoInfo.numSubSamples = dVar.f18217f;
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
        int[] iArr3 = dVar.f18216e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= iArr3.length) {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = dVar.f18214b;
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
        byte[] bArr3 = dVar.f18213a;
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
        cryptoInfo.mode = dVar.f18215c;
        if (Build.VERSION.SDK_INT >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(dVar.f18218g, dVar.h));
        }
        android.support.v4.media.session.q qVar = this.f58437c;
        String str = l0.f13778a;
        qVar.obtainMessage(2, a10).sendToTarget();
    }

    @Override
    public final void setParameters(Bundle bundle) {
        w1();
        android.support.v4.media.session.q qVar = this.f58437c;
        String str = l0.f13778a;
        qVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override
    public final void shutdown() {
        if (this.f58439f) {
            flush();
            this.f58436b.quit();
        }
        this.f58439f = false;
    }

    @Override
    public final void start() {
        if (!this.f58439f) {
            HandlerThread handlerThread = this.f58436b;
            handlerThread.start();
            this.f58437c = new android.support.v4.media.session.q(this, handlerThread.getLooper(), 13);
            this.f58439f = true;
        }
    }

    @Override
    public final void w1() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }
}
