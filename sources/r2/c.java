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
import org.telegram.ui.Components.voip.r2;
import v7.u6;
public final class c implements l {
    public final MediaCodec f43570a;
    public final f f43571b;
    public final m f43572c;
    public final j d;
    public boolean e;
    public int f43573f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f43570a = mediaCodec;
        this.f43571b = new f(handlerThread);
        this.f43572c = mVar;
        this.d = jVar;
    }

    public static void a(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        boolean z10;
        j jVar;
        f fVar = cVar.f43571b;
        MediaCodec mediaCodec = cVar.f43570a;
        HandlerThread handlerThread = fVar.f43583b;
        if (fVar.f43584c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f43584c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        Trace.endSection();
        cVar.f43572c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f43573f = 1;
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
        this.f43572c.b(j10, i10, i11, i12);
    }

    @Override
    public final void d(int i10, h2.d dVar, long j10, int i11) {
        this.f43572c.d(i10, dVar, j10, i11);
    }

    @Override
    public final void e(int i10) {
        this.f43570a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void f(a3.m mVar, Handler handler) {
        this.f43570a.setOnFrameRenderedListener(new a(this, mVar, 0), handler);
    }

    @Override
    public final void flush() {
        this.f43572c.flush();
        this.f43570a.flush();
        f fVar = this.f43571b;
        synchronized (fVar.f43582a) {
            fVar.f43590l++;
            Handler handler = fVar.f43584c;
            String str = m0.f8375a;
            handler.post(new r2(fVar, 20));
        }
        this.f43570a.start();
    }

    @Override
    public final void g() {
        this.f43570a.detachOutputSurface();
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f43570a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f43570a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f43571b;
        synchronized (fVar.f43582a) {
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
    public final void h(int i10, long j10) {
        this.f43570a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public final int i() {
        throw new UnsupportedOperationException("Method not decompiled: r2.c.i():int");
    }

    @Override
    public final int j(android.media.MediaCodec.BufferInfo r11) {
        throw new UnsupportedOperationException("Method not decompiled: r2.c.j(android.media.MediaCodec$BufferInfo):int");
    }

    @Override
    public final void k(int i10) {
        this.f43570a.setVideoScalingMode(i10);
    }

    @Override
    public final void l(org.telegram.ui.web.v vVar) {
        f fVar = this.f43571b;
        org.telegram.ui.web.v vVar2 = new org.telegram.ui.web.v(16, this, vVar);
        synchronized (fVar.f43582a) {
            fVar.b();
            vVar2.run();
        }
    }

    @Override
    public final void m(Surface surface) {
        this.f43570a.setOutputSurface(surface);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.f43570a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final boolean o(m.l lVar) {
        f fVar = this.f43571b;
        synchronized (fVar.f43582a) {
            fVar.f43593o = lVar;
        }
        return true;
    }

    @Override
    public final void p(ArrayList arrayList) {
        this.f43570a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f43573f == 1) {
                this.f43572c.shutdown();
                f fVar = this.f43571b;
                synchronized (fVar.f43582a) {
                    fVar.f43591m = true;
                    fVar.f43583b.quit();
                    fVar.a();
                }
            }
            this.f43573f = 2;
            if (!this.e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f43570a.stop();
                    }
                    if (i10 >= 35 && (jVar2 = this.d) != null) {
                        jVar2.c(this.f43570a);
                    }
                    this.f43570a.release();
                    this.e = true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (!this.e) {
                try {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.f43570a.stop();
                    }
                    if (i11 >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.f43570a);
                    }
                    this.f43570a.release();
                    this.e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f43572c.setParameters(bundle);
    }
}
