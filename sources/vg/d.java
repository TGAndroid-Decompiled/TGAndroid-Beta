package vg;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.a8;
public final class d implements GLSurfaceView.Renderer {
    public long f59449a;
    public boolean f59450b;
    public int f59451c;
    public final e d;

    public d(e eVar) {
        this.d = eVar;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float min;
        if (this.d.f59458r) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        } else if (!this.d.f59462y) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            if (!this.d.E) {
                this.d.E = true;
                final int i7 = this.d.F;
                this.d.post(new Runnable(this) {
                    public final d f59447b;

                    {
                        this.f59447b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                d dVar = this.f59447b;
                                e.a(dVar.d, i7);
                                return;
                            default:
                                d dVar2 = this.f59447b;
                                int i10 = i7;
                                e eVar = dVar2.d;
                                if (eVar.f59455e && !eVar.f59458r && i10 == dVar2.d.H) {
                                    e eVar2 = dVar2.d;
                                    eVar2.f59459s = true;
                                    Runnable runnable = eVar2.f59460w;
                                    eVar2.f59460w = null;
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
                f fVar = this.d.f59452a;
                long j3 = this.f59449a;
                if (j3 == 0) {
                    min = 0.016666668f;
                } else {
                    min = Math.min(0.1f, ((float) (nanoTime - j3)) / 1.0E9f);
                }
                fVar.G = min;
                this.f59449a = nanoTime;
                e eVar = this.d;
                eVar.f59452a.f59465c.A = eVar.f59461x;
                this.d.f59452a.onDrawFrame(gl10);
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    if (!this.f59450b) {
                        this.f59450b = true;
                        final int i10 = this.f59451c;
                        this.d.post(new Runnable(this) {
                            public final d f59447b;

                            {
                                this.f59447b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        d dVar = this.f59447b;
                                        e.a(dVar.d, i10);
                                        return;
                                    default:
                                        d dVar2 = this.f59447b;
                                        int i102 = i10;
                                        e eVar2 = dVar2.d;
                                        if (eVar2.f59455e && !eVar2.f59458r && i102 == dVar2.d.H) {
                                            e eVar22 = dVar2.d;
                                            eVar22.f59459s = true;
                                            Runnable runnable = eVar22.f59460w;
                                            eVar22.f59460w = null;
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
                this.d.f59458r = true;
                this.d.post(new v4.p(this, 1));
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        this.f59450b = false;
        this.f59451c = this.d.H;
        if (!this.d.f59458r) {
            this.d.f59452a.onSurfaceChanged(gl10, i7, i10);
        }
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        e eVar = this.d;
        int i7 = eVar.H + 1;
        eVar.H = i7;
        this.f59451c = i7;
        this.f59450b = false;
        this.f59449a = 0L;
        this.d.f59458r = false;
        f fVar = this.d.f59452a;
        fVar.f59465c = null;
        try {
            fVar.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e10) {
            a8.g(e10, true);
            this.d.f59458r = true;
            this.d.post(new v4.p(this, 1));
        }
    }
}
