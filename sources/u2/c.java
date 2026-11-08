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
import org.telegram.ui.Components.rt;
import sg.t0;
public final class c implements l {
    public final MediaCodec f56222a;
    public final f f56223b;
    public final m f56224c;
    public final j d;
    public boolean f56225e;
    public int f56226f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f56222a = mediaCodec;
        this.f56223b = new f(handlerThread);
        this.f56224c = mVar;
        this.d = jVar;
    }

    public static void o(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i7) {
        boolean z9;
        j jVar;
        f fVar = cVar.f56223b;
        MediaCodec mediaCodec = cVar.f56222a;
        HandlerThread handlerThread = fVar.f56238b;
        if (fVar.f56239c == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f56239c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i7);
        Trace.endSection();
        cVar.f56224c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f56226f = 1;
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
        this.f56224c.a(i7, i10, i11, j3);
    }

    @Override
    public final void b(int i7, k2.d dVar, long j3, int i10) {
        this.f56224c.b(i7, dVar, j3, i10);
    }

    @Override
    public final void c(int i7) {
        this.f56222a.releaseOutputBuffer(i7, false);
    }

    @Override
    public final void d(org.telegram.ui.web.w wVar) {
        f fVar = this.f56223b;
        org.telegram.ui.web.w wVar2 = new org.telegram.ui.web.w(26, this, wVar);
        synchronized (fVar.f56237a) {
            fVar.b();
            wVar2.run();
        }
    }

    @Override
    public final void e() {
        this.f56222a.detachOutputSurface();
    }

    @Override
    public final void f(int i7, long j3) {
        this.f56222a.releaseOutputBuffer(i7, j3);
    }

    @Override
    public final void flush() {
        this.f56224c.flush();
        this.f56222a.flush();
        f fVar = this.f56223b;
        synchronized (fVar.f56237a) {
            fVar.f56246l++;
            Handler handler = fVar.f56239c;
            String str = m0.f14112a;
            handler.post(new t0(fVar, 14));
        }
        this.f56222a.start();
    }

    @Override
    public final int g() {
        throw new UnsupportedOperationException("Method not decompiled: u2.c.g():int");
    }

    @Override
    public final ByteBuffer getInputBuffer(int i7) {
        return this.f56222a.getInputBuffer(i7);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i7) {
        return this.f56222a.getOutputBuffer(i7);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f56223b;
        synchronized (fVar.f56237a) {
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
    public final int h(android.media.MediaCodec.BufferInfo r11) {
        throw new UnsupportedOperationException("Method not decompiled: u2.c.h(android.media.MediaCodec$BufferInfo):int");
    }

    @Override
    public final void i(d3.k kVar, Handler handler) {
        this.f56222a.setOnFrameRenderedListener(new a(this, kVar, 0), handler);
    }

    @Override
    public final void j(int i7) {
        this.f56222a.setVideoScalingMode(i7);
    }

    @Override
    public final void k(Surface surface) {
        this.f56222a.setOutputSurface(surface);
    }

    @Override
    public final boolean l(rt rtVar) {
        f fVar = this.f56223b;
        synchronized (fVar.f56237a) {
            fVar.f56249o = rtVar;
        }
        return true;
    }

    @Override
    public final void m(ArrayList arrayList) {
        this.f56222a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.f56222a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f56226f == 1) {
                this.f56224c.shutdown();
                f fVar = this.f56223b;
                synchronized (fVar.f56237a) {
                    fVar.f56247m = true;
                    fVar.f56238b.quit();
                    fVar.a();
                }
            }
            this.f56226f = 2;
            if (!this.f56225e) {
                try {
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 30 && i7 < 33) {
                        this.f56222a.stop();
                    }
                    if (i7 >= 35 && (jVar2 = this.d) != null) {
                        jVar2.c(this.f56222a);
                    }
                    this.f56222a.release();
                    this.f56225e = true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (!this.f56225e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f56222a.stop();
                    }
                    if (i10 >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.f56222a);
                    }
                    this.f56222a.release();
                    this.f56225e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f56224c.setParameters(bundle);
    }
}
