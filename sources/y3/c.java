package y3;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import c2.a1;
import d5.g0;
import java.nio.ByteBuffer;

public final class c implements k {

    public final MediaCodec f49459a;

    public final f f49460b;

    public final e f49461c;
    public boolean d;

    public int f49462e = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.f49459a = mediaCodec;
        this.f49460b = new f(handlerThread);
        this.f49461c = new e(mediaCodec, handlerThread2);
    }

    public static void i(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        f fVar = cVar.f49460b;
        MediaCodec mediaCodec = cVar.f49459a;
        fVar.b(mediaCodec);
        d5.a.c("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        d5.a.q();
        e eVar = cVar.f49461c;
        HandlerThread handlerThread = eVar.f49469b;
        if (!eVar.f49472f) {
            handlerThread.start();
            eVar.f49470c = new androidx.mediarouter.app.c(eVar, handlerThread.getLooper());
            eVar.f49472f = true;
        }
        d5.a.c("startCodec");
        mediaCodec.start();
        d5.a.q();
        cVar.f49462e = 1;
    }

    public static String j(int i10, String str) {
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
        e eVar = this.f49461c;
        RuntimeException runtimeException = (RuntimeException) eVar.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        d dVarB = e.b();
        dVarB.f49463a = i10;
        dVarB.f49464b = i11;
        dVarB.d = j10;
        dVarB.f49466e = i12;
        androidx.mediarouter.app.c cVar = eVar.f49470c;
        int i13 = g0.f4795a;
        cVar.obtainMessage(0, dVarB).sendToTarget();
    }

    @Override
    public final void b(int i10, long j10) {
        this.f49459a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public final int c() {
        f fVar = this.f49460b;
        synchronized (fVar.f49473a) {
            try {
                boolean z10 = true;
                int iE = -1;
                if (fVar.f49481k > 0 || fVar.f49482l) {
                    return -1;
                }
                IllegalStateException illegalStateException = fVar.f49483m;
                if (illegalStateException != null) {
                    fVar.f49483m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = fVar.f49480j;
                if (codecException != null) {
                    fVar.f49480j = null;
                    throw codecException;
                }
                a1 a1Var = fVar.d;
                if (a1Var.f2231c != 0) {
                    z10 = false;
                }
                if (!z10) {
                    iE = a1Var.e();
                }
                return iE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final int d(MediaCodec.BufferInfo bufferInfo) {
        f fVar = this.f49460b;
        synchronized (fVar.f49473a) {
            try {
                boolean z10 = true;
                if (fVar.f49481k > 0 || fVar.f49482l) {
                    return -1;
                }
                IllegalStateException illegalStateException = fVar.f49483m;
                if (illegalStateException != null) {
                    fVar.f49483m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = fVar.f49480j;
                if (codecException != null) {
                    fVar.f49480j = null;
                    throw codecException;
                }
                a1 a1Var = fVar.f49476e;
                if (a1Var.f2231c != 0) {
                    z10 = false;
                }
                if (z10) {
                    return -1;
                }
                int iE = a1Var.e();
                if (iE >= 0) {
                    d5.a.j(fVar.h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) fVar.f49477f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iE == -2) {
                    fVar.h = (MediaFormat) fVar.f49478g.remove();
                }
                return iE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final void e(int i10, k3.d dVar, long j10) {
        this.f49461c.c(i10, dVar, j10);
    }

    @Override
    public final void f(int i10) {
        this.f49459a.setVideoScalingMode(i10);
    }

    @Override
    public final void flush() {
        this.f49461c.a();
        this.f49459a.flush();
        f fVar = this.f49460b;
        synchronized (fVar.f49473a) {
            fVar.f49481k++;
            Handler handler = fVar.f49475c;
            int i10 = g0.f4795a;
            handler.post(new qf.b(fVar, 18));
        }
        this.f49459a.start();
    }

    @Override
    public final void g(Surface surface) {
        this.f49459a.setOutputSurface(surface);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f49459a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f49459a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f49460b;
        synchronized (fVar.f49473a) {
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
    public final void h(e5.h hVar, Handler handler) {
        this.f49459a.setOnFrameRenderedListener(new a(this, hVar, 0), handler);
    }

    @Override
    public final void release() {
        try {
            if (this.f49462e == 1) {
                e eVar = this.f49461c;
                if (eVar.f49472f) {
                    eVar.a();
                    eVar.f49469b.quit();
                }
                eVar.f49472f = false;
                f fVar = this.f49460b;
                synchronized (fVar.f49473a) {
                    fVar.f49482l = true;
                    fVar.f49474b.quit();
                    fVar.a();
                }
            }
            this.f49462e = 2;
            if (this.d) {
                return;
            }
            this.f49459a.release();
            this.d = true;
        } catch (Throwable th) {
            if (!this.d) {
                this.f49459a.release();
                this.d = true;
            }
            throw th;
        }
    }

    @Override
    public final void releaseOutputBuffer(int i10, boolean z10) {
        this.f49459a.releaseOutputBuffer(i10, z10);
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f49459a.setParameters(bundle);
    }
}
