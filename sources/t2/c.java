package t2;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import b8.zb;
import g2.n0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Components.i9;
import org.telegram.ui.hc1;
public final class c implements l {
    public final MediaCodec f54814a;
    public final f f54815b;
    public final m f54816c;
    public final j d;
    public boolean f54817e;
    public int f54818f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f54814a = mediaCodec;
        this.f54815b = new f(handlerThread);
        this.f54816c = mVar;
        this.d = jVar;
    }

    public static void o(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i3) {
        boolean z10;
        j jVar;
        f fVar = cVar.f54815b;
        MediaCodec mediaCodec = cVar.f54814a;
        HandlerThread handlerThread = fVar.f54830b;
        if (fVar.f54831c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f54831c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i3);
        Trace.endSection();
        cVar.f54816c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f54818f = 1;
    }

    public static String p(int i3, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i3 == 1) {
            sb2.append("Audio");
        } else if (i3 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i3);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override
    public final void a(int i3, j2.d dVar, long j10, int i10) {
        this.f54816c.a(i3, dVar, j10, i10);
    }

    @Override
    public final void b(int i3, int i10, int i11, long j10) {
        this.f54816c.b(i3, i10, i11, j10);
    }

    @Override
    public final void c(int i3) {
        this.f54814a.releaseOutputBuffer(i3, false);
    }

    @Override
    public final void d() {
        this.f54814a.detachOutputSurface();
    }

    @Override
    public final void e(int i3, long j10) {
        this.f54814a.releaseOutputBuffer(i3, j10);
    }

    @Override
    public final int f() {
        throw new UnsupportedOperationException("Method not decompiled: t2.c.f():int");
    }

    @Override
    public final void flush() {
        this.f54816c.flush();
        this.f54814a.flush();
        f fVar = this.f54815b;
        synchronized (fVar.f54829a) {
            fVar.f54838l++;
            Handler handler = fVar.f54831c;
            String str = n0.f11873a;
            handler.post(new r4.u(fVar, 3));
        }
        this.f54814a.start();
    }

    @Override
    public final void g(hc1 hc1Var) {
        f fVar = this.f54815b;
        hc1 hc1Var2 = new hc1(23, this, hc1Var);
        synchronized (fVar.f54829a) {
            fVar.b();
            hc1Var2.run();
        }
    }

    @Override
    public final ByteBuffer getInputBuffer(int i3) {
        return this.f54814a.getInputBuffer(i3);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i3) {
        return this.f54814a.getOutputBuffer(i3);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f54815b;
        synchronized (fVar.f54829a) {
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
    public final void h(c3.k kVar, Handler handler) {
        this.f54814a.setOnFrameRenderedListener(new a(this, kVar, 0), handler);
    }

    @Override
    public final int i(android.media.MediaCodec.BufferInfo r11) {
        throw new UnsupportedOperationException("Method not decompiled: t2.c.i(android.media.MediaCodec$BufferInfo):int");
    }

    @Override
    public final void j(int i3) {
        this.f54814a.setVideoScalingMode(i3);
    }

    @Override
    public final boolean k(i9 i9Var) {
        f fVar = this.f54815b;
        synchronized (fVar.f54829a) {
            fVar.f54841o = i9Var;
        }
        return true;
    }

    @Override
    public final void l(Surface surface) {
        this.f54814a.setOutputSurface(surface);
    }

    @Override
    public final void m(ArrayList arrayList) {
        this.f54814a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.f54814a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f54818f == 1) {
                this.f54816c.shutdown();
                f fVar = this.f54815b;
                synchronized (fVar.f54829a) {
                    fVar.f54839m = true;
                    fVar.f54830b.quit();
                    fVar.a();
                }
            }
            this.f54818f = 2;
            if (!this.f54817e) {
                try {
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 30 && i3 < 33) {
                        this.f54814a.stop();
                    }
                    if (i3 >= 35 && (jVar2 = this.d) != null) {
                        jVar2.c(this.f54814a);
                    }
                    this.f54814a.release();
                    this.f54817e = true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (!this.f54817e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f54814a.stop();
                    }
                    if (i10 >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.f54814a);
                    }
                    this.f54814a.release();
                    this.f54817e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f54816c.setParameters(bundle);
    }
}
