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
import org.telegram.ui.web.q0;
public final class c implements m {
    public final MediaCodec f46902a;
    public final f f46903b;
    public final n f46904c;
    public final k d;
    public boolean f46905e;
    public int f46906f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, n nVar, k kVar) {
        this.f46902a = mediaCodec;
        this.f46903b = new f(handlerThread);
        this.f46904c = nVar;
        this.d = kVar;
    }

    public static void l(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        boolean z10;
        k kVar;
        f fVar = cVar.f46903b;
        MediaCodec mediaCodec = cVar.f46902a;
        HandlerThread handlerThread = fVar.f46918b;
        if (fVar.f46919c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f46919c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        Trace.endSection();
        cVar.f46904c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (kVar = cVar.d) != null) {
            kVar.a(mediaCodec);
        }
        cVar.f46906f = 1;
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
        this.f46904c.a(j3, i10, i11, i12);
    }

    @Override
    public final void b(int i10, h2.d dVar, long j3, int i11) {
        this.f46904c.b(i10, dVar, j3, i11);
    }

    @Override
    public final void c(int i10) {
        this.f46902a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void d(a3.m mVar, Handler handler) {
        this.f46902a.setOnFrameRenderedListener(new a(this, mVar, 0), handler);
    }

    @Override
    public final void e() {
        this.f46902a.detachOutputSurface();
    }

    @Override
    public final void f(int i10, long j3) {
        this.f46902a.releaseOutputBuffer(i10, j3);
    }

    @Override
    public final void flush() {
        this.f46904c.flush();
        this.f46902a.flush();
        f fVar = this.f46903b;
        synchronized (fVar.f46917a) {
            fVar.f46926l++;
            Handler handler = fVar.f46919c;
            String str = d0.f8532a;
            handler.post(new q0(fVar, 23));
        }
        this.f46902a.start();
    }

    @Override
    public final int g() {
        throw new UnsupportedOperationException("Method not decompiled: r2.c.g():int");
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f46902a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f46902a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f46903b;
        synchronized (fVar.f46917a) {
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
        this.f46902a.setVideoScalingMode(i10);
    }

    @Override
    public final void j(Surface surface) {
        this.f46902a.setOutputSurface(surface);
    }

    @Override
    public final boolean k(l2.f fVar) {
        f fVar2 = this.f46903b;
        synchronized (fVar2.f46917a) {
            fVar2.f46929o = fVar;
        }
        return true;
    }

    @Override
    public final void release() {
        k kVar;
        k kVar2;
        try {
            if (this.f46906f == 1) {
                this.f46904c.shutdown();
                f fVar = this.f46903b;
                synchronized (fVar.f46917a) {
                    fVar.f46927m = true;
                    fVar.f46918b.quit();
                    fVar.a();
                }
            }
            this.f46906f = 2;
            if (!this.f46905e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f46902a.stop();
                    }
                    if (i10 >= 35 && (kVar2 = this.d) != null) {
                        kVar2.c(this.f46902a);
                    }
                    this.f46902a.release();
                    this.f46905e = true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (!this.f46905e) {
                try {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.f46902a.stop();
                    }
                    if (i11 >= 35 && (kVar = this.d) != null) {
                        kVar.c(this.f46902a);
                    }
                    this.f46902a.release();
                    this.f46905e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f46904c.setParameters(bundle);
    }
}
