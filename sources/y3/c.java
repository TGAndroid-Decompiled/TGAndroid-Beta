package y3;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import d5.f0;
import java.nio.ByteBuffer;
import pf.o1;
public final class c implements k {
    public final MediaCodec f49469a;
    public final f f49470b;
    public final e f49471c;
    public boolean d;
    public int f49472e = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.f49469a = mediaCodec;
        this.f49470b = new f(handlerThread);
        this.f49471c = new e(mediaCodec, handlerThread2);
    }

    public static void i(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        f fVar = cVar.f49470b;
        MediaCodec mediaCodec = cVar.f49469a;
        fVar.b(mediaCodec);
        d5.a.c("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        d5.a.q();
        e eVar = cVar.f49471c;
        HandlerThread handlerThread = eVar.f49479b;
        if (!eVar.f49482f) {
            handlerThread.start();
            eVar.f49480c = new androidx.mediarouter.app.d(eVar, handlerThread.getLooper());
            eVar.f49482f = true;
        }
        d5.a.c("startCodec");
        mediaCodec.start();
        d5.a.q();
        cVar.f49472e = 1;
    }

    public static String j(int i9, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i9 == 1) {
            sb2.append("Audio");
        } else if (i9 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i9);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override
    public final void a(long j10, int i9, int i10, int i11) {
        e eVar = this.f49471c;
        RuntimeException runtimeException = (RuntimeException) eVar.d.getAndSet(null);
        if (runtimeException == null) {
            d b10 = e.b();
            b10.f49473a = i9;
            b10.f49474b = i10;
            b10.d = j10;
            b10.f49476e = i11;
            androidx.mediarouter.app.d dVar = eVar.f49480c;
            int i12 = f0.f4349a;
            dVar.obtainMessage(0, b10).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    @Override
    public final void b(int i9, long j10) {
        this.f49469a.releaseOutputBuffer(i9, j10);
    }

    @Override
    public final int c() {
        throw new UnsupportedOperationException("Method not decompiled: y3.c.c():int");
    }

    @Override
    public final int d(android.media.MediaCodec.BufferInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: y3.c.d(android.media.MediaCodec$BufferInfo):int");
    }

    @Override
    public final void e(int i9, k3.d dVar, long j10) {
        this.f49471c.c(i9, dVar, j10);
    }

    @Override
    public final void f(int i9) {
        this.f49469a.setVideoScalingMode(i9);
    }

    @Override
    public final void flush() {
        this.f49471c.a();
        this.f49469a.flush();
        f fVar = this.f49470b;
        synchronized (fVar.f49483a) {
            fVar.f49491k++;
            Handler handler = fVar.f49485c;
            int i9 = f0.f4349a;
            handler.post(new o1(fVar, 16));
        }
        this.f49469a.start();
    }

    @Override
    public final void g(Surface surface) {
        this.f49469a.setOutputSurface(surface);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i9) {
        return this.f49469a.getInputBuffer(i9);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i9) {
        return this.f49469a.getOutputBuffer(i9);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f49470b;
        synchronized (fVar.f49483a) {
            try {
                mediaFormat = fVar.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override
    public final void h(e5.i iVar, Handler handler) {
        this.f49469a.setOnFrameRenderedListener(new a(this, iVar, 0), handler);
    }

    @Override
    public final void release() {
        try {
            if (this.f49472e == 1) {
                e eVar = this.f49471c;
                if (eVar.f49482f) {
                    eVar.a();
                    eVar.f49479b.quit();
                }
                eVar.f49482f = false;
                f fVar = this.f49470b;
                synchronized (fVar.f49483a) {
                    fVar.f49492l = true;
                    fVar.f49484b.quit();
                    fVar.a();
                }
            }
            this.f49472e = 2;
            if (!this.d) {
                this.f49469a.release();
                this.d = true;
            }
        } catch (Throwable th) {
            if (!this.d) {
                this.f49469a.release();
                this.d = true;
            }
            throw th;
        }
    }

    @Override
    public final void releaseOutputBuffer(int i9, boolean z10) {
        this.f49469a.releaseOutputBuffer(i9, z10);
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f49469a.setParameters(bundle);
    }
}
