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
import ki.t1;
import org.telegram.ui.web.a2;
import org.telegram.ui.web.g2;
import v7.u6;
public final class c implements l {
    public final MediaCodec f44900a;
    public final f f44901b;
    public final m f44902c;
    public final j d;
    public boolean e;
    public int f44903f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f44900a = mediaCodec;
        this.f44901b = new f(handlerThread);
        this.f44902c = mVar;
        this.d = jVar;
    }

    public static void o(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        boolean z10;
        j jVar;
        f fVar = cVar.f44901b;
        MediaCodec mediaCodec = cVar.f44900a;
        HandlerThread handlerThread = fVar.f44913b;
        if (fVar.f44914c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f44914c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        Trace.endSection();
        cVar.f44902c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f44903f = 1;
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
        this.f44902c.a(j10, i10, i11, i12);
    }

    @Override
    public final void b(int i10, h2.d dVar, long j10, int i11) {
        this.f44902c.b(i10, dVar, j10, i11);
    }

    @Override
    public final boolean c(t1 t1Var) {
        f fVar = this.f44901b;
        synchronized (fVar.f44912a) {
            fVar.f44923o = t1Var;
        }
        return true;
    }

    @Override
    public final void d(int i10) {
        this.f44900a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void e(a3.m mVar, Handler handler) {
        this.f44900a.setOnFrameRenderedListener(new a(this, mVar, 0), handler);
    }

    @Override
    public final void f() {
        this.f44900a.detachOutputSurface();
    }

    @Override
    public final void flush() {
        this.f44902c.flush();
        this.f44900a.flush();
        f fVar = this.f44901b;
        synchronized (fVar.f44912a) {
            fVar.f44920l++;
            Handler handler = fVar.f44914c;
            String str = m0.f8253a;
            handler.post(new a2(fVar, 10));
        }
        this.f44900a.start();
    }

    @Override
    public final void g(g2 g2Var) {
        f fVar = this.f44901b;
        g2 g2Var2 = new g2(8, this, g2Var);
        synchronized (fVar.f44912a) {
            fVar.b();
            g2Var2.run();
        }
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f44900a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f44900a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f44901b;
        synchronized (fVar.f44912a) {
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
        this.f44900a.releaseOutputBuffer(i10, j10);
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
        this.f44900a.setVideoScalingMode(i10);
    }

    @Override
    public final void l(Surface surface) {
        this.f44900a.setOutputSurface(surface);
    }

    @Override
    public final void m(ArrayList arrayList) {
        this.f44900a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.f44900a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f44903f == 1) {
                this.f44902c.shutdown();
                f fVar = this.f44901b;
                synchronized (fVar.f44912a) {
                    fVar.f44921m = true;
                    fVar.f44913b.quit();
                    fVar.a();
                }
            }
            this.f44903f = 2;
            if (!this.e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f44900a.stop();
                    }
                    if (i10 >= 35 && (jVar2 = this.d) != null) {
                        jVar2.c(this.f44900a);
                    }
                    this.f44900a.release();
                    this.e = true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (!this.e) {
                try {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.f44900a.stop();
                    }
                    if (i11 >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.f44900a);
                    }
                    this.f44900a.release();
                    this.e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f44902c.setParameters(bundle);
    }
}
