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
import org.telegram.ui.web.r0;
public final class c implements l {
    public final MediaCodec f42229a;
    public final f f42230b;
    public final m f42231c;
    public final j d;
    public boolean e;
    public int f42232f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f42229a = mediaCodec;
        this.f42230b = new f(handlerThread);
        this.f42231c = mVar;
        this.d = jVar;
    }

    public static void l(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        j jVar;
        f fVar = cVar.f42230b;
        MediaCodec mediaCodec = cVar.f42229a;
        fVar.b(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        Trace.endSection();
        cVar.f42231c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f42232f = 1;
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
        this.f42231c.a(j3, i10, i11, i12);
    }

    @Override
    public final void b(int i10, h2.d dVar, long j3, int i11) {
        this.f42231c.b(i10, dVar, j3, i11);
    }

    @Override
    public final void c(int i10) {
        this.f42229a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void d(a3.m mVar, Handler handler) {
        this.f42229a.setOnFrameRenderedListener(new a(this, mVar, 0), handler);
    }

    @Override
    public final void e() {
        this.f42229a.detachOutputSurface();
    }

    @Override
    public final void f(int i10, long j3) {
        this.f42229a.releaseOutputBuffer(i10, j3);
    }

    @Override
    public final void flush() {
        this.f42231c.flush();
        this.f42229a.flush();
        f fVar = this.f42230b;
        synchronized (fVar.f42241a) {
            fVar.f42249l++;
            Handler handler = fVar.f42243c;
            String str = d0.f7888a;
            handler.post(new r0(fVar, 23));
        }
        this.f42229a.start();
    }

    @Override
    public final int g() {
        throw new UnsupportedOperationException("Method not decompiled: r2.c.g():int");
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f42229a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f42229a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f42230b;
        synchronized (fVar.f42241a) {
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
        this.f42229a.setVideoScalingMode(i10);
    }

    @Override
    public final void j(Surface surface) {
        this.f42229a.setOutputSurface(surface);
    }

    @Override
    public final boolean k(k2.u uVar) {
        f fVar = this.f42230b;
        synchronized (fVar.f42241a) {
            fVar.f42252o = uVar;
        }
        return true;
    }

    @Override
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f42232f == 1) {
                this.f42231c.shutdown();
                f fVar = this.f42230b;
                synchronized (fVar.f42241a) {
                    fVar.f42250m = true;
                    fVar.f42242b.quit();
                    fVar.a();
                }
            }
            this.f42232f = 2;
            if (!this.e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f42229a.stop();
                    }
                    if (i10 >= 35 && (jVar2 = this.d) != null) {
                        jVar2.c(this.f42229a);
                    }
                    this.f42229a.release();
                    this.e = true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (!this.e) {
                try {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.f42229a.stop();
                    }
                    if (i11 >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.f42229a);
                    }
                    this.f42229a.release();
                    this.e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f42231c.setParameters(bundle);
    }
}
