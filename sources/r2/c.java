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
import org.telegram.ui.web.u0;
public final class c implements l {
    public final MediaCodec f45707a;
    public final f f45708b;
    public final m f45709c;
    public final j d;
    public boolean f45710e;
    public int f45711f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f45707a = mediaCodec;
        this.f45708b = new f(handlerThread);
        this.f45709c = mVar;
        this.d = jVar;
    }

    public static void l(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        j jVar;
        f fVar = cVar.f45708b;
        MediaCodec mediaCodec = cVar.f45707a;
        fVar.b(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        Trace.endSection();
        cVar.f45709c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f45711f = 1;
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
        this.f45709c.a(j3, i10, i11, i12);
    }

    @Override
    public final void b(int i10, h2.d dVar, long j3, int i11) {
        this.f45709c.b(i10, dVar, j3, i11);
    }

    @Override
    public final void c(int i10) {
        this.f45707a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void d(a3.m mVar, Handler handler) {
        this.f45707a.setOnFrameRenderedListener(new a(this, mVar, 0), handler);
    }

    @Override
    public final void e() {
        this.f45707a.detachOutputSurface();
    }

    @Override
    public final boolean f(n2.c cVar) {
        f fVar = this.f45708b;
        synchronized (fVar.f45722a) {
            fVar.f45734o = cVar;
        }
        return true;
    }

    @Override
    public final void flush() {
        this.f45709c.flush();
        this.f45707a.flush();
        f fVar = this.f45708b;
        synchronized (fVar.f45722a) {
            fVar.f45731l++;
            Handler handler = fVar.f45724c;
            String str = d0.f8538a;
            handler.post(new u0(fVar, 23));
        }
        this.f45707a.start();
    }

    @Override
    public final void g(int i10, long j3) {
        this.f45707a.releaseOutputBuffer(i10, j3);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f45707a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f45707a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f45708b;
        synchronized (fVar.f45722a) {
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
        this.f45707a.setVideoScalingMode(i10);
    }

    @Override
    public final void k(Surface surface) {
        this.f45707a.setOutputSurface(surface);
    }

    @Override
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f45711f == 1) {
                this.f45709c.shutdown();
                f fVar = this.f45708b;
                synchronized (fVar.f45722a) {
                    fVar.f45732m = true;
                    fVar.f45723b.quit();
                    fVar.a();
                }
            }
            this.f45711f = 2;
            if (!this.f45710e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f45707a.stop();
                    }
                    if (i10 >= 35 && (jVar2 = this.d) != null) {
                        jVar2.c(this.f45707a);
                    }
                    this.f45707a.release();
                    this.f45710e = true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (!this.f45710e) {
                try {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.f45707a.stop();
                    }
                    if (i11 >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.f45707a);
                    }
                    this.f45707a.release();
                    this.f45710e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f45709c.setParameters(bundle);
    }
}
