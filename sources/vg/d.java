package vg;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.a8;
public final class d implements GLSurfaceView.Renderer {
    public long f57368a;
    public boolean f57369b;
    public int f57370c;
    public final e d;

    public d(e eVar) {
        this.d = eVar;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float min;
        if (this.d.f57377r) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        } else if (!this.d.f57381y) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            if (!this.d.D) {
                this.d.D = true;
                final int i7 = this.d.E;
                this.d.post(new Runnable(this) {
                    public final d f57366b;

                    {
                        this.f57366b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                d dVar = this.f57366b;
                                e.a(dVar.d, i7);
                                return;
                            default:
                                d dVar2 = this.f57366b;
                                int i10 = i7;
                                e eVar = dVar2.d;
                                if (eVar.f57374e && !eVar.f57377r && i10 == dVar2.d.G) {
                                    e eVar2 = dVar2.d;
                                    eVar2.f57378s = true;
                                    Runnable runnable = eVar2.f57379w;
                                    eVar2.f57379w = null;
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
                f fVar = this.d.f57371a;
                long j3 = this.f57368a;
                if (j3 == 0) {
                    min = 0.016666668f;
                } else {
                    min = Math.min(0.1f, ((float) (nanoTime - j3)) / 1.0E9f);
                }
                fVar.G = min;
                this.f57368a = nanoTime;
                e eVar = this.d;
                eVar.f57371a.f57384c.A = eVar.f57380x;
                this.d.f57371a.onDrawFrame(gl10);
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    if (!this.f57369b) {
                        this.f57369b = true;
                        final int i10 = this.f57370c;
                        this.d.post(new Runnable(this) {
                            public final d f57366b;

                            {
                                this.f57366b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        d dVar = this.f57366b;
                                        e.a(dVar.d, i10);
                                        return;
                                    default:
                                        d dVar2 = this.f57366b;
                                        int i102 = i10;
                                        e eVar2 = dVar2.d;
                                        if (eVar2.f57374e && !eVar2.f57377r && i102 == dVar2.d.G) {
                                            e eVar22 = dVar2.d;
                                            eVar22.f57378s = true;
                                            Runnable runnable = eVar22.f57379w;
                                            eVar22.f57379w = null;
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
                this.d.f57377r = true;
                this.d.post(new sh.b(this, 22));
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        this.f57369b = false;
        this.f57370c = this.d.G;
        if (!this.d.f57377r) {
            this.d.f57371a.onSurfaceChanged(gl10, i7, i10);
        }
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        e eVar = this.d;
        int i7 = eVar.G + 1;
        eVar.G = i7;
        this.f57370c = i7;
        this.f57369b = false;
        this.f57368a = 0L;
        this.d.f57377r = false;
        f fVar = this.d.f57371a;
        fVar.f57384c = null;
        try {
            fVar.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e10) {
            a8.g(e10, true);
            this.d.f57377r = true;
            this.d.post(new sh.b(this, 22));
        }
    }
}
