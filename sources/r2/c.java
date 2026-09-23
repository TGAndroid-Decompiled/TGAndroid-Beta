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
import org.telegram.ui.Cells.ja;
import org.telegram.ui.web.t0;
public final class c implements l {
    public final MediaCodec f41882a;
    public final f f41883b;
    public final m f41884c;
    public final j d;
    public boolean e;
    public int f41885f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f41882a = mediaCodec;
        this.f41883b = new f(handlerThread);
        this.f41884c = mVar;
        this.d = jVar;
    }

    public static void l(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        j jVar;
        f fVar = cVar.f41883b;
        MediaCodec mediaCodec = cVar.f41882a;
        fVar.b(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        Trace.endSection();
        cVar.f41884c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f41885f = 1;
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
        this.f41884c.a(j3, i10, i11, i12);
    }

    @Override
    public final void b(int i10, h2.d dVar, long j3, int i11) {
        this.f41884c.b(i10, dVar, j3, i11);
    }

    @Override
    public final void c(int i10) {
        this.f41882a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final boolean d(ja jaVar) {
        f fVar = this.f41883b;
        synchronized (fVar.f41894a) {
            fVar.f41905o = jaVar;
        }
        return true;
    }

    @Override
    public final void e(a3.m mVar, Handler handler) {
        this.f41882a.setOnFrameRenderedListener(new a(this, mVar, 0), handler);
    }

    @Override
    public final void f() {
        this.f41882a.detachOutputSurface();
    }

    @Override
    public final void flush() {
        this.f41884c.flush();
        this.f41882a.flush();
        f fVar = this.f41883b;
        synchronized (fVar.f41894a) {
            fVar.f41902l++;
            Handler handler = fVar.f41896c;
            String str = d0.f7871a;
            handler.post(new t0(fVar, 22));
        }
        this.f41882a.start();
    }

    @Override
    public final void g(int i10, long j3) {
        this.f41882a.releaseOutputBuffer(i10, j3);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f41882a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f41882a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f41883b;
        synchronized (fVar.f41894a) {
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
        this.f41882a.setVideoScalingMode(i10);
    }

    @Override
    public final void k(Surface surface) {
        this.f41882a.setOutputSurface(surface);
    }

    @Override
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f41885f == 1) {
                this.f41884c.shutdown();
                f fVar = this.f41883b;
                synchronized (fVar.f41894a) {
                    fVar.f41903m = true;
                    fVar.f41895b.quit();
                    fVar.a();
                }
            }
            this.f41885f = 2;
            if (!this.e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f41882a.stop();
                    }
                    if (i10 >= 35 && (jVar2 = this.d) != null) {
                        jVar2.c(this.f41882a);
                    }
                    this.f41882a.release();
                    this.e = true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (!this.e) {
                try {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.f41882a.stop();
                    }
                    if (i11 >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.f41882a);
                    }
                    this.f41882a.release();
                    this.e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f41884c.setParameters(bundle);
    }
}
