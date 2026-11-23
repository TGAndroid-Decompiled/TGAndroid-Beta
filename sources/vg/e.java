package vg;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.a8;
public final class e implements GLSurfaceView.Renderer {
    public long f59418a;
    public boolean f59419b;
    public int f59420c;
    public final f d;

    public e(f fVar) {
        this.d = fVar;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float min;
        if (this.d.f59427r) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        } else if (!this.d.f59431y) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            if (!this.d.E) {
                this.d.E = true;
                final int i7 = this.d.F;
                this.d.post(new Runnable(this) {
                    public final e f59414b;

                    {
                        this.f59414b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                e eVar = this.f59414b;
                                f.a(eVar.d, i7);
                                return;
                            default:
                                e eVar2 = this.f59414b;
                                int i10 = i7;
                                f fVar = eVar2.d;
                                if (fVar.f59424e && !fVar.f59427r && i10 == eVar2.d.H) {
                                    f fVar2 = eVar2.d;
                                    fVar2.f59428s = true;
                                    Runnable runnable = fVar2.f59429w;
                                    fVar2.f59429w = null;
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
                g gVar = this.d.f59421a;
                long j3 = this.f59418a;
                if (j3 == 0) {
                    min = 0.016666668f;
                } else {
                    min = Math.min(0.1f, ((float) (nanoTime - j3)) / 1.0E9f);
                }
                gVar.G = min;
                this.f59418a = nanoTime;
                f fVar = this.d;
                fVar.f59421a.f59434c.A = fVar.f59430x;
                this.d.f59421a.onDrawFrame(gl10);
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    if (!this.f59419b) {
                        this.f59419b = true;
                        final int i10 = this.f59420c;
                        this.d.post(new Runnable(this) {
                            public final e f59414b;

                            {
                                this.f59414b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        e eVar = this.f59414b;
                                        f.a(eVar.d, i10);
                                        return;
                                    default:
                                        e eVar2 = this.f59414b;
                                        int i102 = i10;
                                        f fVar2 = eVar2.d;
                                        if (fVar2.f59424e && !fVar2.f59427r && i102 == eVar2.d.H) {
                                            f fVar22 = eVar2.d;
                                            fVar22.f59428s = true;
                                            Runnable runnable = fVar22.f59429w;
                                            fVar22.f59429w = null;
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
                this.d.f59427r = true;
                this.d.post(new d(this, 0));
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        this.f59419b = false;
        this.f59420c = this.d.H;
        if (!this.d.f59427r) {
            this.d.f59421a.onSurfaceChanged(gl10, i7, i10);
        }
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        f fVar = this.d;
        int i7 = fVar.H + 1;
        fVar.H = i7;
        this.f59420c = i7;
        this.f59419b = false;
        this.f59418a = 0L;
        this.d.f59427r = false;
        g gVar = this.d.f59421a;
        gVar.f59434c = null;
        try {
            gVar.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e10) {
            a8.g(e10, true);
            this.d.f59427r = true;
            this.d.post(new d(this, 0));
        }
    }
}
