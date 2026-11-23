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
import org.telegram.ui.Cells.c5;
import org.telegram.ui.web.i1;
import p4.o0;
public final class c implements l {
    public final MediaCodec f58310a;
    public final f f58311b;
    public final m f58312c;
    public final j d;
    public boolean f58313e;
    public int f58314f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f58310a = mediaCodec;
        this.f58311b = new f(handlerThread);
        this.f58312c = mVar;
        this.d = jVar;
    }

    public static void a(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i7) {
        boolean z10;
        j jVar;
        f fVar = cVar.f58311b;
        MediaCodec mediaCodec = cVar.f58310a;
        HandlerThread handlerThread = fVar.f58326b;
        if (fVar.f58327c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.p(z10);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f58327c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i7);
        Trace.endSection();
        cVar.f58312c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f58314f = 1;
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
        this.f58312c.b(i7, i10, i11, j3);
    }

    @Override
    public final void c(int i7, k2.d dVar, long j3, int i10) {
        this.f58312c.c(i7, dVar, j3, i10);
    }

    @Override
    public final void d(int i7) {
        this.f58310a.releaseOutputBuffer(i7, false);
    }

    @Override
    public final void e() {
        this.f58310a.detachOutputSurface();
    }

    @Override
    public final void f(int i7, long j3) {
        this.f58310a.releaseOutputBuffer(i7, j3);
    }

    @Override
    public final void flush() {
        this.f58312c.flush();
        this.f58310a.flush();
        f fVar = this.f58311b;
        synchronized (fVar.f58325a) {
            fVar.f58334l++;
            Handler handler = fVar.f58327c;
            String str = l0.f13778a;
            handler.post(new i1(fVar, 21));
        }
        this.f58310a.start();
    }

    @Override
    public final int g() {
        throw new UnsupportedOperationException("Method not decompiled: u2.c.g():int");
    }

    @Override
    public final ByteBuffer getInputBuffer(int i7) {
        return this.f58310a.getInputBuffer(i7);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i7) {
        return this.f58310a.getOutputBuffer(i7);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f58311b;
        synchronized (fVar.f58325a) {
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
    public final void h(o0 o0Var) {
        f fVar = this.f58311b;
        o0 o0Var2 = new o0(13, this, o0Var);
        synchronized (fVar.f58325a) {
            fVar.b();
            o0Var2.run();
        }
    }

    @Override
    public final boolean i(c5 c5Var) {
        f fVar = this.f58311b;
        synchronized (fVar.f58325a) {
            fVar.f58337o = c5Var;
        }
        return true;
    }

    @Override
    public final int j(android.media.MediaCodec.BufferInfo r11) {
        throw new UnsupportedOperationException("Method not decompiled: u2.c.j(android.media.MediaCodec$BufferInfo):int");
    }

    @Override
    public final void k(d3.k kVar, Handler handler) {
        this.f58310a.setOnFrameRenderedListener(new a(this, kVar, 0), handler);
    }

    @Override
    public final void l(int i7) {
        this.f58310a.setVideoScalingMode(i7);
    }

    @Override
    public final void m(Surface surface) {
        this.f58310a.setOutputSurface(surface);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.f58310a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void o(ArrayList arrayList) {
        this.f58310a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f58314f == 1) {
                this.f58312c.shutdown();
                f fVar = this.f58311b;
                synchronized (fVar.f58325a) {
                    fVar.f58335m = true;
                    fVar.f58326b.quit();
                    fVar.a();
                }
            }
            this.f58314f = 2;
            if (!this.f58313e) {
                try {
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 30 && i7 < 33) {
                        this.f58310a.stop();
                    }
                    if (i7 >= 35 && (jVar2 = this.d) != null) {
                        jVar2.c(this.f58310a);
                    }
                    this.f58310a.release();
                    this.f58313e = true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (!this.f58313e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f58310a.stop();
                    }
                    if (i10 >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.f58310a);
                    }
                    this.f58310a.release();
                    this.f58313e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f58312c.setParameters(bundle);
    }
}
