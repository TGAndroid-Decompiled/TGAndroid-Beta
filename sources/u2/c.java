package u2;

import a8.ja;
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
import org.telegram.ui.Components.cf;
import org.telegram.ui.web.e1;
public final class c implements l {
    public final MediaCodec f57732a;
    public final f f57733b;
    public final m f57734c;
    public final j d;
    public boolean f57735e;
    public int f57736f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f57732a = mediaCodec;
        this.f57733b = new f(handlerThread);
        this.f57734c = mVar;
        this.d = jVar;
    }

    public static void a(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i7) {
        boolean z10;
        j jVar;
        f fVar = cVar.f57733b;
        MediaCodec mediaCodec = cVar.f57732a;
        HandlerThread handlerThread = fVar.f57748b;
        if (fVar.f57749c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.p(z10);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f57749c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i7);
        Trace.endSection();
        cVar.f57734c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f57736f = 1;
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
    public final void d(int i7, int i10, int i11, long j3) {
        this.f57734c.d(i7, i10, i11, j3);
    }

    @Override
    public final void e(int i7, k2.d dVar, long j3, int i10) {
        this.f57734c.e(i7, dVar, j3, i10);
    }

    @Override
    public final void f(int i7) {
        this.f57732a.releaseOutputBuffer(i7, false);
    }

    @Override
    public final void flush() {
        this.f57734c.flush();
        this.f57732a.flush();
        f fVar = this.f57733b;
        synchronized (fVar.f57747a) {
            fVar.f57756l++;
            Handler handler = fVar.f57749c;
            String str = l0.f13471a;
            handler.post(new q2.d(fVar, 19));
        }
        this.f57732a.start();
    }

    @Override
    public final void g() {
        this.f57732a.detachOutputSurface();
    }

    @Override
    public final ByteBuffer getInputBuffer(int i7) {
        return this.f57732a.getInputBuffer(i7);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i7) {
        return this.f57732a.getOutputBuffer(i7);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f57733b;
        synchronized (fVar.f57747a) {
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
    public final void h(int i7, long j3) {
        this.f57732a.releaseOutputBuffer(i7, j3);
    }

    @Override
    public final int i() {
        throw new UnsupportedOperationException("Method not decompiled: u2.c.i():int");
    }

    @Override
    public final int j(android.media.MediaCodec.BufferInfo r11) {
        throw new UnsupportedOperationException("Method not decompiled: u2.c.j(android.media.MediaCodec$BufferInfo):int");
    }

    @Override
    public final void k(d3.k kVar, Handler handler) {
        this.f57732a.setOnFrameRenderedListener(new a(this, kVar, 0), handler);
    }

    @Override
    public final void l(int i7) {
        this.f57732a.setVideoScalingMode(i7);
    }

    @Override
    public final boolean m(cf cfVar) {
        f fVar = this.f57733b;
        synchronized (fVar.f57747a) {
            fVar.f57759o = cfVar;
        }
        return true;
    }

    @Override
    public final void n(Surface surface) {
        this.f57732a.setOutputSurface(surface);
    }

    @Override
    public final void o(e1 e1Var) {
        f fVar = this.f57733b;
        e1 e1Var2 = new e1(21, this, e1Var);
        synchronized (fVar.f57747a) {
            fVar.b();
            e1Var2.run();
        }
    }

    @Override
    public final void p(ArrayList arrayList) {
        this.f57732a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void q(ArrayList arrayList) {
        this.f57732a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f57736f == 1) {
                this.f57734c.shutdown();
                f fVar = this.f57733b;
                synchronized (fVar.f57747a) {
                    fVar.f57757m = true;
                    fVar.f57748b.quit();
                    fVar.a();
                }
            }
            this.f57736f = 2;
            if (!this.f57735e) {
                try {
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 30 && i7 < 33) {
                        this.f57732a.stop();
                    }
                    if (i7 >= 35 && (jVar2 = this.d) != null) {
                        jVar2.c(this.f57732a);
                    }
                    this.f57732a.release();
                    this.f57735e = true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (!this.f57735e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f57732a.stop();
                    }
                    if (i10 >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.f57732a);
                    }
                    this.f57732a.release();
                    this.f57735e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f57734c.setParameters(bundle);
    }
}
