package tg;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.FileLog;
import org.telegram.ui.web.a2;
public final class d implements GLSurfaceView.Renderer {
    public long f47047a;
    public boolean f47048b;
    public int f47049c;
    public final f d;

    public d(f fVar) {
        this.d = fVar;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float min;
        if (this.d.f47057r) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        } else if (!this.d.f47060x) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            if (!this.d.f47061y) {
                this.d.f47061y = true;
                final int i10 = this.d.E;
                this.d.post(new Runnable(this) {
                    public final d f47045b;

                    {
                        this.f47045b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                d dVar = this.f47045b;
                                f.a(dVar.d, i10);
                                return;
                            default:
                                d dVar2 = this.f47045b;
                                int i11 = i10;
                                f fVar = dVar2.d;
                                if (fVar.e && !fVar.f47057r && i11 == dVar2.d.G) {
                                    f fVar2 = dVar2.d;
                                    fVar2.f47058s = true;
                                    Runnable runnable = fVar2.v;
                                    fVar2.v = null;
                                    if (runnable != null) {
                                        runnable.run();
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        } else {
            try {
                long nanoTime = System.nanoTime();
                g gVar = this.d.f47052a;
                long j10 = this.f47047a;
                if (j10 == 0) {
                    min = 0.016666668f;
                } else {
                    min = Math.min(0.1f, ((float) (nanoTime - j10)) / 1.0E9f);
                }
                gVar.G = min;
                this.f47047a = nanoTime;
                f fVar = this.d;
                fVar.f47052a.f47064c.A = fVar.f47059w;
                this.d.f47052a.onDrawFrame(gl10);
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    if (!this.f47048b) {
                        this.f47048b = true;
                        final int i11 = this.f47049c;
                        this.d.post(new Runnable(this) {
                            public final d f47045b;

                            {
                                this.f47045b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        d dVar = this.f47045b;
                                        f.a(dVar.d, i11);
                                        return;
                                    default:
                                        d dVar2 = this.f47045b;
                                        int i112 = i11;
                                        f fVar2 = dVar2.d;
                                        if (fVar2.e && !fVar2.f47057r && i112 == dVar2.d.G) {
                                            f fVar22 = dVar2.d;
                                            fVar22.f47058s = true;
                                            Runnable runnable = fVar22.v;
                                            fVar22.v = null;
                                            if (runnable != null) {
                                                runnable.run();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Diamond GL error: " + glGetError);
            } catch (RuntimeException e) {
                FileLog.e(e);
                this.d.f47057r = true;
                this.d.post(new a2(this, 29));
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        this.f47048b = false;
        this.f47049c = this.d.G;
        if (!this.d.f47057r) {
            this.d.f47052a.onSurfaceChanged(gl10, i10, i11);
        }
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        f fVar = this.d;
        int i10 = fVar.G + 1;
        fVar.G = i10;
        this.f47049c = i10;
        this.f47048b = false;
        this.f47047a = 0L;
        this.d.f47057r = false;
        g gVar = this.d.f47052a;
        gVar.f47064c = null;
        try {
            gVar.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e) {
            FileLog.e(e);
            this.d.f47057r = true;
            this.d.post(new a2(this, 29));
        }
    }
}
