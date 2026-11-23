package u2;

import a8.ma;
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
import org.telegram.ui.Components.nd0;
import org.telegram.ui.web.t1;
import org.telegram.ui.web.z0;
public final class c implements l {
    public final MediaCodec f58425a;
    public final f f58426b;
    public final m f58427c;
    public final j d;
    public boolean f58428e;
    public int f58429f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f58425a = mediaCodec;
        this.f58426b = new f(handlerThread);
        this.f58427c = mVar;
        this.d = jVar;
    }

    public static void a(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i7) {
        boolean z10;
        j jVar;
        f fVar = cVar.f58426b;
        MediaCodec mediaCodec = cVar.f58425a;
        HandlerThread handlerThread = fVar.f58441b;
        if (fVar.f58442c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.p(z10);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f58442c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i7);
        Trace.endSection();
        cVar.f58427c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f58429f = 1;
    }

    public static String b(int i7, String str) {
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
    public final void flush() {
        this.f58427c.flush();
        this.f58425a.flush();
        f fVar = this.f58426b;
        synchronized (fVar.f58440a) {
            fVar.f58449l++;
            Handler handler = fVar.f58442c;
            String str = l0.f13778a;
            handler.post(new z0(fVar, 23));
        }
        this.f58425a.start();
    }

    @Override
    public final void g(int i7, int i10, int i11, long j3) {
        this.f58427c.g(i7, i10, i11, j3);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i7) {
        return this.f58425a.getInputBuffer(i7);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i7) {
        return this.f58425a.getOutputBuffer(i7);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f58426b;
        synchronized (fVar.f58440a) {
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
    public final void h(int i7, k2.d dVar, long j3, int i10) {
        this.f58427c.h(i7, dVar, j3, i10);
    }

    @Override
    public final void i(int i7) {
        this.f58425a.releaseOutputBuffer(i7, false);
    }

    @Override
    public final void j() {
        this.f58425a.detachOutputSurface();
    }

    @Override
    public final void k(int i7, long j3) {
        this.f58425a.releaseOutputBuffer(i7, j3);
    }

    @Override
    public final int l() {
        throw new UnsupportedOperationException("Method not decompiled: u2.c.l():int");
    }

    @Override
    public final void m(t1 t1Var) {
        f fVar = this.f58426b;
        t1 t1Var2 = new t1(19, this, t1Var);
        synchronized (fVar.f58440a) {
            fVar.b();
            t1Var2.run();
        }
    }

    @Override
    public final int n(android.media.MediaCodec.BufferInfo r11) {
        throw new UnsupportedOperationException("Method not decompiled: u2.c.n(android.media.MediaCodec$BufferInfo):int");
    }

    @Override
    public final void o(d3.k kVar, Handler handler) {
        this.f58425a.setOnFrameRenderedListener(new a(this, kVar, 0), handler);
    }

    @Override
    public final boolean p(nd0 nd0Var) {
        f fVar = this.f58426b;
        synchronized (fVar.f58440a) {
            fVar.f58452o = nd0Var;
        }
        return true;
    }

    @Override
    public final void q(int i7) {
        this.f58425a.setVideoScalingMode(i7);
    }

    @Override
    public final void r(Surface surface) {
        this.f58425a.setOutputSurface(surface);
    }

    @Override
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f58429f == 1) {
                this.f58427c.shutdown();
                f fVar = this.f58426b;
                synchronized (fVar.f58440a) {
                    fVar.f58450m = true;
                    fVar.f58441b.quit();
                    fVar.a();
                }
            }
            this.f58429f = 2;
            if (!this.f58428e) {
                try {
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 30 && i7 < 33) {
                        this.f58425a.stop();
                    }
                    if (i7 >= 35 && (jVar2 = this.d) != null) {
                        jVar2.c(this.f58425a);
                    }
                    this.f58425a.release();
                    this.f58428e = true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (!this.f58428e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f58425a.stop();
                    }
                    if (i10 >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.f58425a);
                    }
                    this.f58425a.release();
                    this.f58428e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override
    public final void s(ArrayList arrayList) {
        this.f58425a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f58427c.setParameters(bundle);
    }

    @Override
    public final void t(ArrayList arrayList) {
        this.f58425a.unsubscribeFromVendorParameters(arrayList);
    }
}
