package vg;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.a8;
public final class d implements GLSurfaceView.Renderer {
    public long f57372a;
    public boolean f57373b;
    public int f57374c;
    public final e d;

    public d(e eVar) {
        this.d = eVar;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float min;
        if (this.d.f57381r) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        } else if (!this.d.f57385y) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            if (!this.d.D) {
                this.d.D = true;
                final int i7 = this.d.E;
                this.d.post(new Runnable(this) {
                    public final d f57370b;

                    {
                        this.f57370b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                d dVar = this.f57370b;
                                e.a(dVar.d, i7);
                                return;
                            default:
                                d dVar2 = this.f57370b;
                                int i10 = i7;
                                e eVar = dVar2.d;
                                if (eVar.f57378e && !eVar.f57381r && i10 == dVar2.d.G) {
                                    e eVar2 = dVar2.d;
                                    eVar2.f57382s = true;
                                    Runnable runnable = eVar2.f57383w;
                                    eVar2.f57383w = null;
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
                f fVar = this.d.f57375a;
                long j3 = this.f57372a;
                if (j3 == 0) {
                    min = 0.016666668f;
                } else {
                    min = Math.min(0.1f, ((float) (nanoTime - j3)) / 1.0E9f);
                }
                fVar.G = min;
                this.f57372a = nanoTime;
                e eVar = this.d;
                eVar.f57375a.f57388c.A = eVar.f57384x;
                this.d.f57375a.onDrawFrame(gl10);
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    if (!this.f57373b) {
                        this.f57373b = true;
                        final int i10 = this.f57374c;
                        this.d.post(new Runnable(this) {
                            public final d f57370b;

                            {
                                this.f57370b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        d dVar = this.f57370b;
                                        e.a(dVar.d, i10);
                                        return;
                                    default:
                                        d dVar2 = this.f57370b;
                                        int i102 = i10;
                                        e eVar2 = dVar2.d;
                                        if (eVar2.f57378e && !eVar2.f57381r && i102 == dVar2.d.G) {
                                            e eVar22 = dVar2.d;
                                            eVar22.f57382s = true;
                                            Runnable runnable = eVar22.f57383w;
                                            eVar22.f57383w = null;
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
                this.d.f57381r = true;
                this.d.post(new sh.b(this, 22));
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        this.f57373b = false;
        this.f57374c = this.d.G;
        if (!this.d.f57381r) {
            this.d.f57375a.onSurfaceChanged(gl10, i7, i10);
        }
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        e eVar = this.d;
        int i7 = eVar.G + 1;
        eVar.G = i7;
        this.f57374c = i7;
        this.f57373b = false;
        this.f57372a = 0L;
        this.d.f57381r = false;
        f fVar = this.d.f57375a;
        fVar.f57388c = null;
        try {
            fVar.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e10) {
            a8.g(e10, true);
            this.d.f57381r = true;
            this.d.post(new sh.b(this, 22));
        }
    }
}
