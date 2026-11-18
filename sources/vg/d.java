package vg;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.a8;
public final class d implements GLSurfaceView.Renderer {
    public long f59410a;
    public boolean f59411b;
    public int f59412c;
    public final e d;

    public d(e eVar) {
        this.d = eVar;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float min;
        if (this.d.f59419r) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        } else if (!this.d.f59423y) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            if (!this.d.E) {
                this.d.E = true;
                final int i7 = this.d.F;
                this.d.post(new Runnable(this) {
                    public final d f59408b;

                    {
                        this.f59408b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                d dVar = this.f59408b;
                                e.a(dVar.d, i7);
                                return;
                            default:
                                d dVar2 = this.f59408b;
                                int i10 = i7;
                                e eVar = dVar2.d;
                                if (eVar.f59416e && !eVar.f59419r && i10 == dVar2.d.H) {
                                    e eVar2 = dVar2.d;
                                    eVar2.f59420s = true;
                                    Runnable runnable = eVar2.f59421w;
                                    eVar2.f59421w = null;
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
                f fVar = this.d.f59413a;
                long j3 = this.f59410a;
                if (j3 == 0) {
                    min = 0.016666668f;
                } else {
                    min = Math.min(0.1f, ((float) (nanoTime - j3)) / 1.0E9f);
                }
                fVar.G = min;
                this.f59410a = nanoTime;
                e eVar = this.d;
                eVar.f59413a.f59426c.A = eVar.f59422x;
                this.d.f59413a.onDrawFrame(gl10);
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    if (!this.f59411b) {
                        this.f59411b = true;
                        final int i10 = this.f59412c;
                        this.d.post(new Runnable(this) {
                            public final d f59408b;

                            {
                                this.f59408b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        d dVar = this.f59408b;
                                        e.a(dVar.d, i10);
                                        return;
                                    default:
                                        d dVar2 = this.f59408b;
                                        int i102 = i10;
                                        e eVar2 = dVar2.d;
                                        if (eVar2.f59416e && !eVar2.f59419r && i102 == dVar2.d.H) {
                                            e eVar22 = dVar2.d;
                                            eVar22.f59420s = true;
                                            Runnable runnable = eVar22.f59421w;
                                            eVar22.f59421w = null;
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
                this.d.f59419r = true;
                this.d.post(new v4.p(this, 1));
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        this.f59411b = false;
        this.f59412c = this.d.H;
        if (!this.d.f59419r) {
            this.d.f59413a.onSurfaceChanged(gl10, i7, i10);
        }
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        e eVar = this.d;
        int i7 = eVar.H + 1;
        eVar.H = i7;
        this.f59412c = i7;
        this.f59411b = false;
        this.f59410a = 0L;
        this.d.f59419r = false;
        f fVar = this.d.f59413a;
        fVar.f59426c = null;
        try {
            fVar.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e10) {
            a8.g(e10, true);
            this.d.f59419r = true;
            this.d.post(new v4.p(this, 1));
        }
    }
}
