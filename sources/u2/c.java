package u2;

import a8.la;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import h2.l0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.web.z0;
import p4.z;
public final class c implements l {
    public final MediaCodec f58345a;
    public final f f58346b;
    public final m f58347c;
    public final j d;
    public boolean f58348e;
    public int f58349f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f58345a = mediaCodec;
        this.f58346b = new f(handlerThread);
        this.f58347c = mVar;
        this.d = jVar;
    }

    public static void a(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i7) {
        boolean z10;
        j jVar;
        f fVar = cVar.f58346b;
        MediaCodec mediaCodec = cVar.f58345a;
        HandlerThread handlerThread = fVar.f58361b;
        if (fVar.f58362c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.p(z10);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f58362c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i7);
        Trace.endSection();
        cVar.f58347c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f58349f = 1;
    }

    public static String p(int i7, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i7 == 1) {
            sb2.append("Audio");
        } else if (i7 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i7);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override
    public final void b(int i7, int i10, int i11, long j3) {
        this.f58347c.b(i7, i10, i11, j3);
    }

    @Override
    public final void c(int i7, k2.d dVar, long j3, int i10) {
        this.f58347c.c(i7, dVar, j3, i10);
    }

    @Override
    public final void d(z zVar) {
        f fVar = this.f58346b;
        z zVar2 = new z(15, this, zVar);
        synchronized (fVar.f58360a) {
            fVar.b();
            zVar2.run();
        }
    }

    @Override
    public final void e(int i7) {
        this.f58345a.releaseOutputBuffer(i7, false);
    }

    @Override
    public final void f() {
        this.f58345a.detachOutputSurface();
    }

    @Override
    public final void flush() {
        this.f58347c.flush();
        this.f58345a.flush();
        f fVar = this.f58346b;
        synchronized (fVar.f58360a) {
            fVar.f58369l++;
            Handler handler = fVar.f58362c;
            String str = l0.f13815a;
            handler.post(new z0(fVar, 22));
        }
        this.f58345a.start();
    }

    @Override
    public final void g(int i7, long j3) {
        this.f58345a.releaseOutputBuffer(i7, j3);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i7) {
        return this.f58345a.getInputBuffer(i7);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i7) {
        return this.f58345a.getOutputBuffer(i7);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f58346b;
        synchronized (fVar.f58360a) {
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
        throw new UnsupportedOperationException("Method not decompiled: u2.c.h():int");
    }

    @Override
    public final boolean i(c5 c5Var) {
        f fVar = this.f58346b;
        synchronized (fVar.f58360a) {
            fVar.f58372o = c5Var;
        }
        return true;
    }

    @Override
    public final int j(android.media.MediaCodec.BufferInfo r11) {
        throw new UnsupportedOperationException("Method not decompiled: u2.c.j(android.media.MediaCodec$BufferInfo):int");
    }

    @Override
    public final void k(d3.k kVar, Handler handler) {
        this.f58345a.setOnFrameRenderedListener(new a(this, kVar, 0), handler);
    }

    @Override
    public final void l(int i7) {
        this.f58345a.setVideoScalingMode(i7);
    }

    @Override
    public final void m(Surface surface) {
        this.f58345a.setOutputSurface(surface);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.f58345a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void o(ArrayList arrayList) {
        this.f58345a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f58349f == 1) {
                this.f58347c.shutdown();
                f fVar = this.f58346b;
                synchronized (fVar.f58360a) {
                    fVar.f58370m = true;
                    fVar.f58361b.quit();
                    fVar.a();
                }
            }
            this.f58349f = 2;
            if (!this.f58348e) {
                try {
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 30 && i7 < 33) {
                        this.f58345a.stop();
                    }
                    if (i7 >= 35 && (jVar2 = this.d) != null) {
                        jVar2.c(this.f58345a);
                    }
                    this.f58345a.release();
                    this.f58348e = true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (!this.f58348e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f58345a.stop();
                    }
                    if (i10 >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.f58345a);
                    }
                    this.f58345a.release();
                    this.f58348e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f58347c.setParameters(bundle);
    }
}
