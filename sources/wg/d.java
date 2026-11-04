package wg;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.a8;
import r4.u;
public final class d implements GLSurfaceView.Renderer {
    public long f57614a;
    public boolean f57615b;
    public int f57616c;
    public final e d;

    public d(e eVar) {
        this.d = eVar;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float min;
        if (this.d.f57623r) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        } else if (!this.d.f57627y) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            if (!this.d.E) {
                this.d.E = true;
                final int i3 = this.d.F;
                this.d.post(new Runnable(this) {
                    public final d f57612b;

                    {
                        this.f57612b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                d dVar = this.f57612b;
                                e.a(dVar.d, i3);
                                return;
                            default:
                                d dVar2 = this.f57612b;
                                int i10 = i3;
                                e eVar = dVar2.d;
                                if (eVar.f57620e && !eVar.f57623r && i10 == dVar2.d.H) {
                                    e eVar2 = dVar2.d;
                                    eVar2.f57624s = true;
                                    Runnable runnable = eVar2.f57625w;
                                    eVar2.f57625w = null;
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
                f fVar = this.d.f57617a;
                long j10 = this.f57614a;
                if (j10 == 0) {
                    min = 0.016666668f;
                } else {
                    min = Math.min(0.1f, ((float) (nanoTime - j10)) / 1.0E9f);
                }
                fVar.G = min;
                this.f57614a = nanoTime;
                e eVar = this.d;
                eVar.f57617a.f57630c.A = eVar.f57626x;
                this.d.f57617a.onDrawFrame(gl10);
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    if (!this.f57615b) {
                        this.f57615b = true;
                        final int i10 = this.f57616c;
                        this.d.post(new Runnable(this) {
                            public final d f57612b;

                            {
                                this.f57612b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        d dVar = this.f57612b;
                                        e.a(dVar.d, i10);
                                        return;
                                    default:
                                        d dVar2 = this.f57612b;
                                        int i102 = i10;
                                        e eVar2 = dVar2.d;
                                        if (eVar2.f57620e && !eVar2.f57623r && i102 == dVar2.d.H) {
                                            e eVar22 = dVar2.d;
                                            eVar22.f57624s = true;
                                            Runnable runnable = eVar22.f57625w;
                                            eVar22.f57625w = null;
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
                this.d.f57623r = true;
                this.d.post(new u(this, 25));
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i3, int i10) {
        this.f57615b = false;
        this.f57616c = this.d.H;
        if (!this.d.f57623r) {
            this.d.f57617a.onSurfaceChanged(gl10, i3, i10);
        }
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        e eVar = this.d;
        int i3 = eVar.H + 1;
        eVar.H = i3;
        this.f57616c = i3;
        this.f57615b = false;
        this.f57614a = 0L;
        this.d.f57623r = false;
        f fVar = this.d.f57617a;
        fVar.f57630c = null;
        try {
            fVar.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e10) {
            a8.g(e10, true);
            this.d.f57623r = true;
            this.d.post(new u(this, 25));
        }
    }
}
