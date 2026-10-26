package r2;

import a8.yb;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import e2.n0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import li.h5;
import org.telegram.ui.Wallet.q6;
import org.telegram.ui.web.h1;
public final class c implements l {
    public final MediaCodec f47191a;
    public final f f47192b;
    public final m f47193c;
    public final j d;
    public boolean e;
    public int f47194f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f47191a = mediaCodec;
        this.f47192b = new f(handlerThread);
        this.f47193c = mVar;
        this.d = jVar;
    }

    public static void a(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        boolean z10;
        j jVar;
        f fVar = cVar.f47192b;
        MediaCodec mediaCodec = cVar.f47191a;
        HandlerThread handlerThread = fVar.f47204b;
        if (fVar.f47205c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.p(z10);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f47205c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        Trace.endSection();
        cVar.f47193c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f47194f = 1;
    }

    public static String b(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override
    public final void d(long j10, int i10, int i11, int i12) {
        this.f47193c.d(j10, i10, i11, i12);
    }

    @Override
    public final void e(int i10, h2.d dVar, long j10, int i11) {
        this.f47193c.e(i10, dVar, j10, i11);
    }

    @Override
    public final void f(int i10) {
        this.f47191a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void flush() {
        this.f47193c.flush();
        this.f47191a.flush();
        f fVar = this.f47192b;
        synchronized (fVar.f47203a) {
            fVar.f47211l++;
            Handler handler = fVar.f47205c;
            String str = n0.f9692a;
            handler.post(new h1(fVar, 8));
        }
        this.f47191a.start();
    }

    @Override
    public final void g(a3.m mVar, Handler handler) {
        this.f47191a.setOnFrameRenderedListener(new a(this, mVar, 0), handler);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f47191a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f47191a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f47192b;
        synchronized (fVar.f47203a) {
            try {
                mediaFormat = fVar.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    @Override
    public final void h() {
        this.f47191a.detachOutputSurface();
    }

    @Override
    public final void i(int i10, long j10) {
        this.f47191a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public final int j() {
        throw new UnsupportedOperationException("Method not decompiled: r2.c.j():int");
    }

    @Override
    public final int k(android.media.MediaCodec.BufferInfo r11) {
        throw new UnsupportedOperationException("Method not decompiled: r2.c.k(android.media.MediaCodec$BufferInfo):int");
    }

    @Override
    public final boolean l(h5 h5Var) {
        f fVar = this.f47192b;
        synchronized (fVar.f47203a) {
            fVar.f47214o = h5Var;
        }
        return true;
    }

    @Override
    public final void m(int i10) {
        this.f47191a.setVideoScalingMode(i10);
    }

    @Override
    public final void n(Surface surface) {
        this.f47191a.setOutputSurface(surface);
    }

    @Override
    public final void o(ArrayList arrayList) {
        this.f47191a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void p(q6 q6Var) {
        f fVar = this.f47192b;
        q6 q6Var2 = new q6(23, this, q6Var);
        synchronized (fVar.f47203a) {
            fVar.b();
            q6Var2.run();
        }
    }

    @Override
    public final void q(ArrayList arrayList) {
        this.f47191a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f47194f == 1) {
                this.f47193c.shutdown();
                f fVar = this.f47192b;
                synchronized (fVar.f47203a) {
                    fVar.f47212m = true;
                    fVar.f47204b.quit();
                    fVar.a();
                }
            }
            this.f47194f = 2;
            if (!this.e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f47191a.stop();
                    }
                    if (i10 >= 35 && (jVar2 = this.d) != null) {
                        jVar2.c(this.f47191a);
                    }
                    this.f47191a.release();
                    this.e = true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (!this.e) {
                try {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.f47191a.stop();
                    }
                    if (i11 >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.f47191a);
                    }
                    this.f47191a.release();
                    this.e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f47193c.setParameters(bundle);
    }
}
