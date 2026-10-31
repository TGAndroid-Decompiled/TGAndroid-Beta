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
import e2.l0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.web.v1;
import ph.x1;
import v7.t6;
public final class c implements l {
    public final MediaCodec f46207a;
    public final f f46208b;
    public final m f46209c;
    public final j d;
    public boolean e;
    public int f46210f = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.f46207a = mediaCodec;
        this.f46208b = new f(handlerThread);
        this.f46209c = mVar;
        this.d = jVar;
    }

    public static void o(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        boolean z10;
        j jVar;
        f fVar = cVar.f46208b;
        MediaCodec mediaCodec = cVar.f46207a;
        HandlerThread handlerThread = fVar.f46220b;
        if (fVar.f46221c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z10);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f46221c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        Trace.endSection();
        cVar.f46209c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = cVar.d) != null) {
            jVar.a(mediaCodec);
        }
        cVar.f46210f = 1;
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
    public final void a(int i10, int i11, int i12, long j10) {
        this.f46209c.a(i10, i11, i12, j10);
    }

    @Override
    public final void b(int i10, h2.d dVar, long j10, int i11) {
        this.f46209c.b(i10, dVar, j10, i11);
    }

    @Override
    public final void c(int i10) {
        this.f46207a.releaseOutputBuffer(i10, false);
    }

    @Override
    public final void d(a3.m mVar, Handler handler) {
        this.f46207a.setOnFrameRenderedListener(new a(this, mVar, 0), handler);
    }

    @Override
    public final void e() {
        this.f46207a.detachOutputSurface();
    }

    @Override
    public final void f(v1 v1Var) {
        f fVar = this.f46208b;
        v1 v1Var2 = new v1(24, this, v1Var);
        synchronized (fVar.f46219a) {
            fVar.b();
            v1Var2.run();
        }
    }

    @Override
    public final void flush() {
        this.f46209c.flush();
        this.f46207a.flush();
        f fVar = this.f46208b;
        synchronized (fVar.f46219a) {
            fVar.f46227l++;
            Handler handler = fVar.f46221c;
            String str = l0.f6165a;
            handler.post(new x1(fVar, 3));
        }
        this.f46207a.start();
    }

    @Override
    public final void g(int i10, long j10) {
        this.f46207a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f46207a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f46207a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f46208b;
        synchronized (fVar.f46219a) {
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
    public final boolean j(n2.u uVar) {
        f fVar = this.f46208b;
        synchronized (fVar.f46219a) {
            fVar.f46230o = uVar;
        }
        return true;
    }

    @Override
    public final void k(int i10) {
        this.f46207a.setVideoScalingMode(i10);
    }

    @Override
    public final void l(Surface surface) {
        this.f46207a.setOutputSurface(surface);
    }

    @Override
    public final void m(ArrayList arrayList) {
        this.f46207a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.f46207a.unsubscribeFromVendorParameters(arrayList);
    }

    @Override
    public final void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f46210f == 1) {
                this.f46209c.shutdown();
                f fVar = this.f46208b;
                synchronized (fVar.f46219a) {
                    fVar.f46228m = true;
                    fVar.f46220b.quit();
                    fVar.a();
                }
            }
            this.f46210f = 2;
            if (!this.e) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f46207a.stop();
                    }
                    if (i10 >= 35 && (jVar2 = this.d) != null) {
                        jVar2.c(this.f46207a);
                    }
                    this.f46207a.release();
                    this.e = true;
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (!this.e) {
                try {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.f46207a.stop();
                    }
                    if (i11 >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.f46207a);
                    }
                    this.f46207a.release();
                    this.e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f46209c.setParameters(bundle);
    }
}
