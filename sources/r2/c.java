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
import org.telegram.ui.web.a2;
import v7.u6;
public final class c implements l {
    public final MediaCodec f45323a;
    public final f f45324b;
    public final m f45325c;
    public final j d;
    public boolean e;
    public int f45326f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f45323a = mediaCodec;
        this.f45324b = new f(handlerThread);
        this.f45325c = mVar;
        this.d = jVar;
    }

    public static void o(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        boolean z10;
        j jVar;
        f fVar = cVar.f45324b;
        MediaCodec mediaCodec = cVar.f45323a;
        HandlerThread handlerThread = fVar.f45336b;
        if (fVar.f45337c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f45337c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        Trace.endSection();
        cVar.f45325c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f45326f = 1;
    }

    public static String p(int i10, String str) {
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
    public final void a(long j10, int i10, int i11, int i12) {
        this.f45325c.a(j10, i10, i11, i12);
    }

    @Override
    public final void b(int i10, h2.d dVar, long j10, int i11) {
        this.f45325c.b(i10, dVar, j10, i11);
    }

    @Override
    public final void c(int i10) {
        this.f45323a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void d(a3.m mVar, Handler handler) {
        this.f45323a.setOnFrameRenderedListener(new a(this, mVar, 0), handler);
    }

    @Override
    public final void e(p2.b bVar) {
        f fVar = this.f45324b;
        p2.b bVar2 = new p2.b(7, this, bVar);
        synchronized (fVar.f45335a) {
            fVar.b();
            bVar2.run();
        }
    }

    @Override
    public final void f() {
        this.f45323a.detachOutputSurface();
    }

    @Override
    public final void flush() {
        this.f45325c.flush();
        this.f45323a.flush();
        f fVar = this.f45324b;
        synchronized (fVar.f45335a) {
            fVar.f45343l++;
            Handler handler = fVar.f45337c;
            String str = m0.f8259a;
            handler.post(new a2(fVar, 10));
        }
        this.f45323a.start();
    }

    @Override
    public final void g(int i10, long j10) {
        this.f45323a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f45323a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f45323a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f45324b;
        synchronized (fVar.f45335a) {
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
    public final int h() {
        throw new UnsupportedOperationException("Method not decompiled: r2.c.h():int");
    }

    @Override
    public final int i(android.media.MediaCodec.BufferInfo r11) {
        throw new UnsupportedOperationException("Method not decompiled: r2.c.i(android.media.MediaCodec$BufferInfo):int");
    }

    @Override
    public final void j(int i10) {
        this.f45323a.setVideoScalingMode(i10);
    }

    @Override
    public final void k(Surface surface) {
        this.f45323a.setOutputSurface(surface);
    }

    @Override
    public final void l(ArrayList arrayList) {
        this.f45323a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void m(ArrayList arrayList) {
        this.f45323a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final boolean n(l2.f fVar) {
        f fVar2 = this.f45324b;
        synchronized (fVar2.f45335a) {
            fVar2.f45346o = fVar;
        }
        return true;
    }

    @Override
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f45326f == 1) {
                this.f45325c.shutdown();
                f fVar = this.f45324b;
                synchronized (fVar.f45335a) {
                    fVar.f45344m = true;
                    fVar.f45336b.quit();
                    fVar.a();
                }
            }
            this.f45326f = 2;
            if (!this.e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f45323a.stop();
                    }
                    if (i10 >= 35 && (jVar2 = this.d) != null) {
                        jVar2.c(this.f45323a);
                    }
                    this.f45323a.release();
                    this.e = true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (!this.e) {
                try {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.f45323a.stop();
                    }
                    if (i11 >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.f45323a);
                    }
                    this.f45323a.release();
                    this.e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f45325c.setParameters(bundle);
    }
}
