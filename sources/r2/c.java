package r2;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import e2.m0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import ji.w4;
import org.telegram.ui.Components.voip.m2;
import org.telegram.ui.Wallet.t8;
import v7.u6;
public final class c implements l {
    public final MediaCodec f43811a;
    public final f f43812b;
    public final m f43813c;
    public final j d;
    public boolean e;
    public int f43814f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f43811a = mediaCodec;
        this.f43812b = new f(handlerThread);
        this.f43813c = mVar;
        this.d = jVar;
    }

    public static void a(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        boolean z10;
        j jVar;
        f fVar = cVar.f43812b;
        MediaCodec mediaCodec = cVar.f43811a;
        HandlerThread handlerThread = fVar.f43824b;
        if (fVar.f43825c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f43825c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        Trace.endSection();
        cVar.f43813c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f43814f = 1;
    }

    public static String c(int i10, String str) {
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
    public final void b(long j10, int i10, int i11, int i12) {
        this.f43813c.b(j10, i10, i11, i12);
    }

    @Override
    public final void e(int i10, h2.d dVar, long j10, int i11) {
        this.f43813c.e(i10, dVar, j10, i11);
    }

    @Override
    public final void f(int i10) {
        this.f43811a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void flush() {
        this.f43813c.flush();
        this.f43811a.flush();
        f fVar = this.f43812b;
        synchronized (fVar.f43823a) {
            fVar.f43831l++;
            Handler handler = fVar.f43825c;
            String str = m0.f8372a;
            handler.post(new m2(fVar, 21));
        }
        this.f43811a.start();
    }

    @Override
    public final void g(t8 t8Var) {
        f fVar = this.f43812b;
        t8 t8Var2 = new t8(21, this, t8Var);
        synchronized (fVar.f43823a) {
            fVar.b();
            t8Var2.run();
        }
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f43811a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f43811a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f43812b;
        synchronized (fVar.f43823a) {
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
    public final void h(a3.m mVar, Handler handler) {
        this.f43811a.setOnFrameRenderedListener(new a(this, mVar, 0), handler);
    }

    @Override
    public final void i() {
        this.f43811a.detachOutputSurface();
    }

    @Override
    public final void j(int i10, long j10) {
        this.f43811a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public final int k() {
        throw new UnsupportedOperationException("Method not decompiled: r2.c.k():int");
    }

    @Override
    public final int l(android.media.MediaCodec.BufferInfo r11) {
        throw new UnsupportedOperationException("Method not decompiled: r2.c.l(android.media.MediaCodec$BufferInfo):int");
    }

    @Override
    public final void m(int i10) {
        this.f43811a.setVideoScalingMode(i10);
    }

    @Override
    public final void n(Surface surface) {
        this.f43811a.setOutputSurface(surface);
    }

    @Override
    public final boolean o(w4 w4Var) {
        f fVar = this.f43812b;
        synchronized (fVar.f43823a) {
            fVar.f43834o = w4Var;
        }
        return true;
    }

    @Override
    public final void p(ArrayList arrayList) {
        this.f43811a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void q(ArrayList arrayList) {
        this.f43811a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f43814f == 1) {
                this.f43813c.shutdown();
                f fVar = this.f43812b;
                synchronized (fVar.f43823a) {
                    fVar.f43832m = true;
                    fVar.f43824b.quit();
                    fVar.a();
                }
            }
            this.f43814f = 2;
            if (!this.e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f43811a.stop();
                    }
                    if (i10 >= 35 && (jVar2 = this.d) != null) {
                        jVar2.c(this.f43811a);
                    }
                    this.f43811a.release();
                    this.e = true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (!this.e) {
                try {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.f43811a.stop();
                    }
                    if (i11 >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.f43811a);
                    }
                    this.f43811a.release();
                    this.e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f43813c.setParameters(bundle);
    }
}
