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
    public final MediaCodec f45692a;
    public final f f45693b;
    public final m f45694c;
    public final j d;
    public boolean f45695e;
    public int f45696f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f45692a = mediaCodec;
        this.f45693b = new f(handlerThread);
        this.f45694c = mVar;
        this.d = jVar;
    }

    public static void l(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        j jVar;
        f fVar = cVar.f45693b;
        MediaCodec mediaCodec = cVar.f45692a;
        fVar.b(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        Trace.endSection();
        cVar.f45694c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f45696f = 1;
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
        this.f45694c.a(j3, i10, i11, i12);
    }

    @Override
    public final void b(int i10, h2.d dVar, long j3, int i11) {
        this.f45694c.b(i10, dVar, j3, i11);
    }

    @Override
    public final void c(int i10) {
        this.f45692a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void d(a3.m mVar, Handler handler) {
        this.f45692a.setOnFrameRenderedListener(new a(this, mVar, 0), handler);
    }

    @Override
    public final void e() {
        this.f45692a.detachOutputSurface();
    }

    @Override
    public final boolean f(n2.c cVar) {
        f fVar = this.f45693b;
        synchronized (fVar.f45707a) {
            fVar.f45719o = cVar;
        }
        return true;
    }

    @Override
    public final void flush() {
        this.f45694c.flush();
        this.f45692a.flush();
        f fVar = this.f45693b;
        synchronized (fVar.f45707a) {
            fVar.f45716l++;
            Handler handler = fVar.f45709c;
            String str = d0.f8537a;
            handler.post(new u0(fVar, 23));
        }
        this.f45692a.start();
    }

    @Override
    public final void g(int i10, long j3) {
        this.f45692a.releaseOutputBuffer(i10, j3);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f45692a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f45692a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f45693b;
        synchronized (fVar.f45707a) {
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
        this.f45692a.setVideoScalingMode(i10);
    }

    @Override
    public final void k(Surface surface) {
        this.f45692a.setOutputSurface(surface);
    }

    @Override
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f45696f == 1) {
                this.f45694c.shutdown();
                f fVar = this.f45693b;
                synchronized (fVar.f45707a) {
                    fVar.f45717m = true;
                    fVar.f45708b.quit();
                    fVar.a();
                }
            }
            this.f45696f = 2;
            if (!this.f45695e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f45692a.stop();
                    }
                    if (i10 >= 35 && (jVar2 = this.d) != null) {
                        jVar2.c(this.f45692a);
                    }
                    this.f45692a.release();
                    this.f45695e = true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (!this.f45695e) {
                try {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.f45692a.stop();
                    }
                    if (i11 >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.f45692a);
                    }
                    this.f45692a.release();
                    this.f45695e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f45694c.setParameters(bundle);
    }
}
