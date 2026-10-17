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
import org.telegram.ui.web.z1;
import v7.u6;
public final class c implements l {
    public final MediaCodec f44926a;
    public final f f44927b;
    public final m f44928c;
    public final j d;
    public boolean e;
    public int f44929f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f44926a = mediaCodec;
        this.f44927b = new f(handlerThread);
        this.f44928c = mVar;
        this.d = jVar;
    }

    public static void o(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        boolean z10;
        j jVar;
        f fVar = cVar.f44927b;
        MediaCodec mediaCodec = cVar.f44926a;
        HandlerThread handlerThread = fVar.f44939b;
        if (fVar.f44940c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f44940c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        Trace.endSection();
        cVar.f44928c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f44929f = 1;
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
        this.f44928c.a(j10, i10, i11, i12);
    }

    @Override
    public final void b(int i10, h2.d dVar, long j10, int i11) {
        this.f44928c.b(i10, dVar, j10, i11);
    }

    @Override
    public final boolean c(t1 t1Var) {
        f fVar = this.f44927b;
        synchronized (fVar.f44938a) {
            fVar.f44949o = t1Var;
        }
        return true;
    }

    @Override
    public final void d(int i10) {
        this.f44926a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void e(a3.m mVar, Handler handler) {
        this.f44926a.setOnFrameRenderedListener(new a(this, mVar, 0), handler);
    }

    @Override
    public final void f(p2.b bVar) {
        f fVar = this.f44927b;
        p2.b bVar2 = new p2.b(7, this, bVar);
        synchronized (fVar.f44938a) {
            fVar.b();
            bVar2.run();
        }
    }

    @Override
    public final void flush() {
        this.f44928c.flush();
        this.f44926a.flush();
        f fVar = this.f44927b;
        synchronized (fVar.f44938a) {
            fVar.f44946l++;
            Handler handler = fVar.f44940c;
            String str = m0.f8254a;
            handler.post(new z1(fVar, 10));
        }
        this.f44926a.start();
    }

    @Override
    public final void g() {
        this.f44926a.detachOutputSurface();
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f44926a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f44926a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f44927b;
        synchronized (fVar.f44938a) {
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
        this.f44926a.releaseOutputBuffer(i10, j10);
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
        this.f44926a.setVideoScalingMode(i10);
    }

    @Override
    public final void l(Surface surface) {
        this.f44926a.setOutputSurface(surface);
    }

    @Override
    public final void m(ArrayList arrayList) {
        this.f44926a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.f44926a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f44929f == 1) {
                this.f44928c.shutdown();
                f fVar = this.f44927b;
                synchronized (fVar.f44938a) {
                    fVar.f44947m = true;
                    fVar.f44939b.quit();
                    fVar.a();
                }
            }
            this.f44929f = 2;
            if (!this.e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f44926a.stop();
                    }
                    if (i10 >= 35 && (jVar2 = this.d) != null) {
                        jVar2.c(this.f44926a);
                    }
                    this.f44926a.release();
                    this.e = true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (!this.e) {
                try {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.f44926a.stop();
                    }
                    if (i11 >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.f44926a);
                    }
                    this.f44926a.release();
                    this.e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f44928c.setParameters(bundle);
    }
}
