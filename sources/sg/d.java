package sg;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.FileLog;
import rg.x1;
public final class d implements GLSurfaceView.Renderer {
    public long f48068a;
    public boolean f48069b;
    public int f48070c;
    public final f d;

    public d(f fVar) {
        this.d = fVar;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float min;
        if (this.d.f48079r) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        } else if (!this.d.f48082x) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            if (!this.d.f48083y) {
                this.d.f48083y = true;
                final int i10 = this.d.E;
                this.d.post(new Runnable(this) {
                    public final d f48066b;

                    {
                        this.f48066b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                d dVar = this.f48066b;
                                f.a(dVar.d, i10);
                                return;
                            default:
                                d dVar2 = this.f48066b;
                                int i11 = i10;
                                f fVar = dVar2.d;
                                if (fVar.f48076e && !fVar.f48079r && i11 == dVar2.d.G) {
                                    f fVar2 = dVar2.d;
                                    fVar2.f48080s = true;
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
                g gVar = this.d.f48073a;
                long j3 = this.f48068a;
                if (j3 == 0) {
                    min = 0.016666668f;
                } else {
                    min = Math.min(0.1f, ((float) (nanoTime - j3)) / 1.0E9f);
                }
                gVar.G = min;
                this.f48068a = nanoTime;
                f fVar = this.d;
                fVar.f48073a.f48086c.A = fVar.f48081w;
                this.d.f48073a.onDrawFrame(gl10);
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    if (!this.f48069b) {
                        this.f48069b = true;
                        final int i11 = this.f48070c;
                        this.d.post(new Runnable(this) {
                            public final d f48066b;

                            {
                                this.f48066b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        d dVar = this.f48066b;
                                        f.a(dVar.d, i11);
                                        return;
                                    default:
                                        d dVar2 = this.f48066b;
                                        int i112 = i11;
                                        f fVar2 = dVar2.d;
                                        if (fVar2.f48076e && !fVar2.f48079r && i112 == dVar2.d.G) {
                                            f fVar22 = dVar2.d;
                                            fVar22.f48080s = true;
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
            } catch (RuntimeException e7) {
                FileLog.e(e7);
                this.d.f48079r = true;
                this.d.post(new x1(this, 3));
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        this.f48069b = false;
        this.f48070c = this.d.G;
        if (!this.d.f48079r) {
            this.d.f48073a.onSurfaceChanged(gl10, i10, i11);
        }
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        f fVar = this.d;
        int i10 = fVar.G + 1;
        fVar.G = i10;
        this.f48070c = i10;
        this.f48069b = false;
        this.f48068a = 0L;
        this.d.f48079r = false;
        g gVar = this.d.f48073a;
        gVar.f48086c = null;
        try {
            gVar.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e7) {
            FileLog.e(e7);
            this.d.f48079r = true;
            this.d.post(new x1(this, 3));
        }
    }
}
