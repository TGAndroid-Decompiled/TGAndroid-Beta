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
    public static final Object f58308n = new Object();
    public final MediaCodec f58309a;
    public final HandlerThread f58310b;
    public android.support.v4.media.session.q f58311c;
    public final AtomicReference d;
    public final h2.i f58312e;
    public boolean f58313f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        h2.i iVar = new h2.i();
        this.f58309a = mediaCodec;
        this.f58310b = handlerThread;
        this.f58312e = iVar;
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

    public static void d(d dVar) {
        ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            arrayDeque.add(dVar);
        }
    }

    @Override
    public final void b(int i7, int i10, int i11, long j3) {
        j();
        d a10 = a();
        a10.f58304a = i7;
        a10.f58305b = i10;
        a10.d = j3;
        a10.f58307e = i11;
        android.support.v4.media.session.q qVar = this.f58311c;
        String str = l0.f13786a;
        qVar.obtainMessage(1, a10).sendToTarget();
    }

    @Override
    public final void c(int i7, k2.d dVar, long j3, int i10) {
        j();
        d a10 = a();
        a10.f58304a = i7;
        a10.f58305b = 0;
        a10.d = j3;
        a10.f58307e = i10;
        MediaCodec.CryptoInfo cryptoInfo = a10.f58306c;
        cryptoInfo.numSubSamples = dVar.f18121f;
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
        int[] iArr3 = dVar.f18120e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= iArr3.length) {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = dVar.f18118b;
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
        byte[] bArr3 = dVar.f18117a;
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
        cryptoInfo.mode = dVar.f18119c;
        if (Build.VERSION.SDK_INT >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(dVar.f18122g, dVar.h));
        }
        android.support.v4.media.session.q qVar = this.f58311c;
        String str = l0.f13786a;
        qVar.obtainMessage(2, a10).sendToTarget();
    }

    @Override
    public final void flush() {
        if (this.f58313f) {
            try {
                android.support.v4.media.session.q qVar = this.f58311c;
                qVar.getClass();
                qVar.removeCallbacksAndMessages(null);
                h2.i iVar = this.f58312e;
                synchronized (iVar) {
                    iVar.f13769b = false;
                }
                android.support.v4.media.session.q qVar2 = this.f58311c;
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
    public final void j() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    @Override
    public final void setParameters(Bundle bundle) {
        j();
        android.support.v4.media.session.q qVar = this.f58311c;
        String str = l0.f13786a;
        qVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override
    public final void shutdown() {
        if (this.f58313f) {
            flush();
            this.f58310b.quit();
        }
        this.f58313f = false;
    }

    @Override
    public final void start() {
        if (!this.f58313f) {
            HandlerThread handlerThread = this.f58310b;
            handlerThread.start();
            this.f58311c = new android.support.v4.media.session.q(this, handlerThread.getLooper(), 13);
            this.f58313f = true;
        }
    }
}
