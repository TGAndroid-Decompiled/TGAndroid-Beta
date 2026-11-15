package vg;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.a8;
public final class d implements GLSurfaceView.Renderer {
    public long f58841a;
    public boolean f58842b;
    public int f58843c;
    public final e d;

    public d(e eVar) {
        this.d = eVar;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float min;
        if (this.d.f58850r) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        } else if (!this.d.f58854y) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            if (!this.d.E) {
                this.d.E = true;
                final int i7 = this.d.F;
                this.d.post(new Runnable(this) {
                    public final d f58839b;

                    {
                        this.f58839b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                d dVar = this.f58839b;
                                e.a(dVar.d, i7);
                                return;
                            default:
                                d dVar2 = this.f58839b;
                                int i10 = i7;
                                e eVar = dVar2.d;
                                if (eVar.f58847e && !eVar.f58850r && i10 == dVar2.d.H) {
                                    e eVar2 = dVar2.d;
                                    eVar2.f58851s = true;
                                    Runnable runnable = eVar2.f58852w;
                                    eVar2.f58852w = null;
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
                f fVar = this.d.f58844a;
                long j3 = this.f58841a;
                if (j3 == 0) {
                    min = 0.016666668f;
                } else {
                    min = Math.min(0.1f, ((float) (nanoTime - j3)) / 1.0E9f);
                }
                fVar.G = min;
                this.f58841a = nanoTime;
                e eVar = this.d;
                eVar.f58844a.f58857c.A = eVar.f58853x;
                this.d.f58844a.onDrawFrame(gl10);
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    if (!this.f58842b) {
                        this.f58842b = true;
                        final int i10 = this.f58843c;
                        this.d.post(new Runnable(this) {
                            public final d f58839b;

                            {
                                this.f58839b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        d dVar = this.f58839b;
                                        e.a(dVar.d, i10);
                                        return;
                                    default:
                                        d dVar2 = this.f58839b;
                                        int i102 = i10;
                                        e eVar2 = dVar2.d;
                                        if (eVar2.f58847e && !eVar2.f58850r && i102 == dVar2.d.H) {
                                            e eVar22 = dVar2.d;
                                            eVar22.f58851s = true;
                                            Runnable runnable = eVar22.f58852w;
                                            eVar22.f58852w = null;
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
                this.d.f58850r = true;
                this.d.post(new q2.d(this, 28));
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        this.f58842b = false;
        this.f58843c = this.d.H;
        if (!this.d.f58850r) {
            this.d.f58844a.onSurfaceChanged(gl10, i7, i10);
        }
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        e eVar = this.d;
        int i7 = eVar.H + 1;
        eVar.H = i7;
        this.f58843c = i7;
        this.f58842b = false;
        this.f58841a = 0L;
        this.d.f58850r = false;
        f fVar = this.d.f58844a;
        fVar.f58857c = null;
        try {
            fVar.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e10) {
            a8.g(e10, true);
            this.d.f58850r = true;
            this.d.post(new q2.d(this, 28));
        }
    }
}
