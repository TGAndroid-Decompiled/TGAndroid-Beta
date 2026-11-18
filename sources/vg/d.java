package vg;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.a8;
public final class d implements GLSurfaceView.Renderer {
    public long f59411a;
    public boolean f59412b;
    public int f59413c;
    public final e d;

    public d(e eVar) {
        this.d = eVar;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float min;
        if (this.d.f59420r) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        } else if (!this.d.f59424y) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            if (!this.d.E) {
                this.d.E = true;
                final int i7 = this.d.F;
                this.d.post(new Runnable(this) {
                    public final d f59409b;

                    {
                        this.f59409b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                d dVar = this.f59409b;
                                e.a(dVar.d, i7);
                                return;
                            default:
                                d dVar2 = this.f59409b;
                                int i10 = i7;
                                e eVar = dVar2.d;
                                if (eVar.f59417e && !eVar.f59420r && i10 == dVar2.d.H) {
                                    e eVar2 = dVar2.d;
                                    eVar2.f59421s = true;
                                    Runnable runnable = eVar2.f59422w;
                                    eVar2.f59422w = null;
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
                f fVar = this.d.f59414a;
                long j3 = this.f59411a;
                if (j3 == 0) {
                    min = 0.016666668f;
                } else {
                    min = Math.min(0.1f, ((float) (nanoTime - j3)) / 1.0E9f);
                }
                fVar.G = min;
                this.f59411a = nanoTime;
                e eVar = this.d;
                eVar.f59414a.f59427c.A = eVar.f59423x;
                this.d.f59414a.onDrawFrame(gl10);
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    if (!this.f59412b) {
                        this.f59412b = true;
                        final int i10 = this.f59413c;
                        this.d.post(new Runnable(this) {
                            public final d f59409b;

                            {
                                this.f59409b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        d dVar = this.f59409b;
                                        e.a(dVar.d, i10);
                                        return;
                                    default:
                                        d dVar2 = this.f59409b;
                                        int i102 = i10;
                                        e eVar2 = dVar2.d;
                                        if (eVar2.f59417e && !eVar2.f59420r && i102 == dVar2.d.H) {
                                            e eVar22 = dVar2.d;
                                            eVar22.f59421s = true;
                                            Runnable runnable = eVar22.f59422w;
                                            eVar22.f59422w = null;
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
            } catch (RuntimeException e10) {
                a8.g(e10, true);
                this.d.f59420r = true;
                this.d.post(new v4.p(this, 1));
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        this.f59412b = false;
        this.f59413c = this.d.H;
        if (!this.d.f59420r) {
            this.d.f59414a.onSurfaceChanged(gl10, i7, i10);
        }
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        e eVar = this.d;
        int i7 = eVar.H + 1;
        eVar.H = i7;
        this.f59413c = i7;
        this.f59412b = false;
        this.f59411a = 0L;
        this.d.f59420r = false;
        f fVar = this.d.f59414a;
        fVar.f59427c = null;
        try {
            fVar.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e10) {
            a8.g(e10, true);
            this.d.f59420r = true;
            this.d.post(new v4.p(this, 1));
        }
    }
}
