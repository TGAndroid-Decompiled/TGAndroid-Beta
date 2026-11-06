package u2;

import a8.ia;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import h2.m0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Components.qt;
import sg.t0;
public final class c implements l {
    public final MediaCodec f56132a;
    public final f f56133b;
    public final m f56134c;
    public final j d;
    public boolean f56135e;
    public int f56136f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f56132a = mediaCodec;
        this.f56133b = new f(handlerThread);
        this.f56134c = mVar;
        this.d = jVar;
    }

    public static void o(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i7) {
        boolean z9;
        j jVar;
        f fVar = cVar.f56133b;
        MediaCodec mediaCodec = cVar.f56132a;
        HandlerThread handlerThread = fVar.f56148b;
        if (fVar.f56149c == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f56149c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i7);
        Trace.endSection();
        cVar.f56134c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f56136f = 1;
    }

    public static String p(int i7, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i7 == 1) {
            sb2.append("Audio");
        } else if (i7 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i7);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override
    public final void a(int i7, int i10, int i11, long j3) {
        this.f56134c.a(i7, i10, i11, j3);
    }

    @Override
    public final void b(int i7, k2.d dVar, long j3, int i10) {
        this.f56134c.b(i7, dVar, j3, i10);
    }

    @Override
    public final void c(int i7) {
        this.f56132a.releaseOutputBuffer(i7, false);
    }

    @Override
    public final void d() {
        this.f56132a.detachOutputSurface();
    }

    @Override
    public final void e(int i7, long j3) {
        this.f56132a.releaseOutputBuffer(i7, j3);
    }

    @Override
    public final int f() {
        throw new UnsupportedOperationException("Method not decompiled: u2.c.f():int");
    }

    @Override
    public final void flush() {
        this.f56134c.flush();
        this.f56132a.flush();
        f fVar = this.f56133b;
        synchronized (fVar.f56147a) {
            fVar.f56156l++;
            Handler handler = fVar.f56149c;
            String str = m0.f14112a;
            handler.post(new t0(fVar, 14));
        }
        this.f56132a.start();
    }

    @Override
    public final int g(android.media.MediaCodec.BufferInfo r11) {
        throw new UnsupportedOperationException("Method not decompiled: u2.c.g(android.media.MediaCodec$BufferInfo):int");
    }

    @Override
    public final ByteBuffer getInputBuffer(int i7) {
        return this.f56132a.getInputBuffer(i7);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i7) {
        return this.f56132a.getOutputBuffer(i7);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f56133b;
        synchronized (fVar.f56147a) {
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
    public final void h(d3.k kVar, Handler handler) {
        this.f56132a.setOnFrameRenderedListener(new a(this, kVar, 0), handler);
    }

    @Override
    public final void i(int i7) {
        this.f56132a.setVideoScalingMode(i7);
    }

    @Override
    public final void j(Surface surface) {
        this.f56132a.setOutputSurface(surface);
    }

    @Override
    public final boolean k(qt qtVar) {
        f fVar = this.f56133b;
        synchronized (fVar.f56147a) {
            fVar.f56159o = qtVar;
        }
        return true;
    }

    @Override
    public final void l(ti.p pVar) {
        f fVar = this.f56133b;
        ti.p pVar2 = new ti.p(1, this, pVar);
        synchronized (fVar.f56147a) {
            fVar.b();
            pVar2.run();
        }
    }

    @Override
    public final void m(ArrayList arrayList) {
        this.f56132a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.f56132a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f56136f == 1) {
                this.f56134c.shutdown();
                f fVar = this.f56133b;
                synchronized (fVar.f56147a) {
                    fVar.f56157m = true;
                    fVar.f56148b.quit();
                    fVar.a();
                }
            }
            this.f56136f = 2;
            if (!this.f56135e) {
                try {
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 30 && i7 < 33) {
                        this.f56132a.stop();
                    }
                    if (i7 >= 35 && (jVar2 = this.d) != null) {
                        jVar2.c(this.f56132a);
                    }
                    this.f56132a.release();
                    this.f56135e = true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (!this.f56135e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f56132a.stop();
                    }
                    if (i10 >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.f56132a);
                    }
                    this.f56132a.release();
                    this.f56135e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f56134c.setParameters(bundle);
    }
}
