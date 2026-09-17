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
import e2.d0;
import java.nio.ByteBuffer;
import k2.g0;
public final class c implements l {
    public final MediaCodec f44795a;
    public final f f44796b;
    public final m f44797c;
    public final j d;
    public boolean f44798e;
    public int f44799f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f44795a = mediaCodec;
        this.f44796b = new f(handlerThread);
        this.f44797c = mVar;
        this.d = jVar;
    }

    public static void l(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        j jVar;
        f fVar = cVar.f44796b;
        MediaCodec mediaCodec = cVar.f44795a;
        fVar.b(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        Trace.endSection();
        cVar.f44797c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f44799f = 1;
    }

    public static String m(int i10, String str) {
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
    public final void a(long j3, int i10, int i11, int i12) {
        this.f44797c.a(j3, i10, i11, i12);
    }

    @Override
    public final void b(int i10, h2.c cVar, long j3, int i11) {
        this.f44797c.b(i10, cVar, j3, i11);
    }

    @Override
    public final void c(int i10) {
        this.f44795a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void d(a3.l lVar, Handler handler) {
        this.f44795a.setOnFrameRenderedListener(new a(this, lVar, 0), handler);
    }

    @Override
    public final void e() {
        this.f44795a.detachOutputSurface();
    }

    @Override
    public final void f(int i10, long j3) {
        this.f44795a.releaseOutputBuffer(i10, j3);
    }

    @Override
    public final void flush() {
        this.f44797c.flush();
        this.f44795a.flush();
        f fVar = this.f44796b;
        synchronized (fVar.f44810a) {
            fVar.f44819l++;
            Handler handler = fVar.f44812c;
            String str = d0.f8737a;
            handler.post(new org.telegram.ui.web.b(fVar, 17));
        }
        this.f44795a.start();
    }

    @Override
    public final int g() {
        throw new UnsupportedOperationException("Method not decompiled: r2.c.g():int");
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f44795a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f44795a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f44796b;
        synchronized (fVar.f44810a) {
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
        throw new UnsupportedOperationException("Method not decompiled: r2.c.h(android.media.MediaCodec$BufferInfo):int");
    }

    @Override
    public final void i(int i10) {
        this.f44795a.setVideoScalingMode(i10);
    }

    @Override
    public final boolean j(g0 g0Var) {
        f fVar = this.f44796b;
        synchronized (fVar.f44810a) {
            fVar.f44822o = g0Var;
        }
        return true;
    }

    @Override
    public final void k(Surface surface) {
        this.f44795a.setOutputSurface(surface);
    }

    @Override
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f44799f == 1) {
                this.f44797c.shutdown();
                f fVar = this.f44796b;
                synchronized (fVar.f44810a) {
                    fVar.f44820m = true;
                    fVar.f44811b.quit();
                    fVar.a();
                }
            }
            this.f44799f = 2;
            if (!this.f44798e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f44795a.stop();
                    }
                    if (i10 >= 35 && (jVar2 = this.d) != null) {
                        jVar2.c(this.f44795a);
                    }
                    this.f44795a.release();
                    this.f44798e = true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (!this.f44798e) {
                try {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.f44795a.stop();
                    }
                    if (i11 >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.f44795a);
                    }
                    this.f44795a.release();
                    this.f44798e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f44797c.setParameters(bundle);
    }
}
