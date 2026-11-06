package vg;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.a8;
import sg.t0;
public final class d implements GLSurfaceView.Renderer {
    public long f57267a;
    public boolean f57268b;
    public int f57269c;
    public final e d;

    public d(e eVar) {
        this.d = eVar;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float min;
        if (this.d.f57276r) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        } else if (!this.d.f57280y) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            if (!this.d.D) {
                this.d.D = true;
                final int i7 = this.d.E;
                this.d.post(new Runnable(this) {
                    public final d f57265b;

                    {
                        this.f57265b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                d dVar = this.f57265b;
                                e.a(dVar.d, i7);
                                return;
                            default:
                                d dVar2 = this.f57265b;
                                int i10 = i7;
                                e eVar = dVar2.d;
                                if (eVar.f57273e && !eVar.f57276r && i10 == dVar2.d.G) {
                                    e eVar2 = dVar2.d;
                                    eVar2.f57277s = true;
                                    Runnable runnable = eVar2.f57278w;
                                    eVar2.f57278w = null;
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
                f fVar = this.d.f57270a;
                long j3 = this.f57267a;
                if (j3 == 0) {
                    min = 0.016666668f;
                } else {
                    min = Math.min(0.1f, ((float) (nanoTime - j3)) / 1.0E9f);
                }
                fVar.G = min;
                this.f57267a = nanoTime;
                e eVar = this.d;
                eVar.f57270a.f57283c.A = eVar.f57279x;
                this.d.f57270a.onDrawFrame(gl10);
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    if (!this.f57268b) {
                        this.f57268b = true;
                        final int i10 = this.f57269c;
                        this.d.post(new Runnable(this) {
                            public final d f57265b;

                            {
                                this.f57265b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        d dVar = this.f57265b;
                                        e.a(dVar.d, i10);
                                        return;
                                    default:
                                        d dVar2 = this.f57265b;
                                        int i102 = i10;
                                        e eVar2 = dVar2.d;
                                        if (eVar2.f57273e && !eVar2.f57276r && i102 == dVar2.d.G) {
                                            e eVar22 = dVar2.d;
                                            eVar22.f57277s = true;
                                            Runnable runnable = eVar22.f57278w;
                                            eVar22.f57278w = null;
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
                this.d.f57276r = true;
                this.d.post(new t0(this, 24));
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        this.f57268b = false;
        this.f57269c = this.d.G;
        if (!this.d.f57276r) {
            this.d.f57270a.onSurfaceChanged(gl10, i7, i10);
        }
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        e eVar = this.d;
        int i7 = eVar.G + 1;
        eVar.G = i7;
        this.f57269c = i7;
        this.f57268b = false;
        this.f57267a = 0L;
        this.d.f57276r = false;
        f fVar = this.d.f57270a;
        fVar.f57283c = null;
        try {
            fVar.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e10) {
            a8.g(e10, true);
            this.d.f57276r = true;
            this.d.post(new t0(this, 24));
        }
    }
}
