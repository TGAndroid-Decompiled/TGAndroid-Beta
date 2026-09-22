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
import org.telegram.ui.Cells.ia;
import org.telegram.ui.web.u0;
public final class c implements l {
    public final MediaCodec f41926a;
    public final f f41927b;
    public final m f41928c;
    public final j d;
    public boolean e;
    public int f41929f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f41926a = mediaCodec;
        this.f41927b = new f(handlerThread);
        this.f41928c = mVar;
        this.d = jVar;
    }

    public static void l(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        j jVar;
        f fVar = cVar.f41927b;
        MediaCodec mediaCodec = cVar.f41926a;
        fVar.b(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        Trace.endSection();
        cVar.f41928c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f41929f = 1;
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
        this.f41928c.a(j3, i10, i11, i12);
    }

    @Override
    public final void b(int i10, h2.d dVar, long j3, int i11) {
        this.f41928c.b(i10, dVar, j3, i11);
    }

    @Override
    public final void c(int i10) {
        this.f41926a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final boolean d(ia iaVar) {
        f fVar = this.f41927b;
        synchronized (fVar.f41938a) {
            fVar.f41949o = iaVar;
        }
        return true;
    }

    @Override
    public final void e(a3.m mVar, Handler handler) {
        this.f41926a.setOnFrameRenderedListener(new a(this, mVar, 0), handler);
    }

    @Override
    public final void f() {
        this.f41926a.detachOutputSurface();
    }

    @Override
    public final void flush() {
        this.f41928c.flush();
        this.f41926a.flush();
        f fVar = this.f41927b;
        synchronized (fVar.f41938a) {
            fVar.f41946l++;
            Handler handler = fVar.f41940c;
            String str = d0.f7885a;
            handler.post(new u0(fVar, 22));
        }
        this.f41926a.start();
    }

    @Override
    public final void g(int i10, long j3) {
        this.f41926a.releaseOutputBuffer(i10, j3);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f41926a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f41926a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f41927b;
        synchronized (fVar.f41938a) {
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
        this.f41926a.setVideoScalingMode(i10);
    }

    @Override
    public final void k(Surface surface) {
        this.f41926a.setOutputSurface(surface);
    }

    @Override
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f41929f == 1) {
                this.f41928c.shutdown();
                f fVar = this.f41927b;
                synchronized (fVar.f41938a) {
                    fVar.f41947m = true;
                    fVar.f41939b.quit();
                    fVar.a();
                }
            }
            this.f41929f = 2;
            if (!this.e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f41926a.stop();
                    }
                    if (i10 >= 35 && (jVar2 = this.d) != null) {
                        jVar2.c(this.f41926a);
                    }
                    this.f41926a.release();
                    this.e = true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (!this.e) {
                try {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.f41926a.stop();
                    }
                    if (i11 >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.f41926a);
                    }
                    this.f41926a.release();
                    this.e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f41928c.setParameters(bundle);
    }
}
