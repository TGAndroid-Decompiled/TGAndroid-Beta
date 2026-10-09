package sg;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.FileLog;
import rg.x1;
public final class d implements GLSurfaceView.Renderer {
    public long f48024a;
    public boolean f48025b;
    public int f48026c;
    public final f d;

    public d(f fVar) {
        this.d = fVar;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float min;
        if (this.d.f48035r) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        } else if (!this.d.f48038x) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            if (!this.d.f48039y) {
                this.d.f48039y = true;
                final int i10 = this.d.E;
                this.d.post(new Runnable(this) {
                    public final d f48022b;

                    {
                        this.f48022b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                d dVar = this.f48022b;
                                f.a(dVar.d, i10);
                                return;
                            default:
                                d dVar2 = this.f48022b;
                                int i11 = i10;
                                f fVar = dVar2.d;
                                if (fVar.f48032e && !fVar.f48035r && i11 == dVar2.d.G) {
                                    f fVar2 = dVar2.d;
                                    fVar2.f48036s = true;
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
                g gVar = this.d.f48029a;
                long j3 = this.f48024a;
                if (j3 == 0) {
                    min = 0.016666668f;
                } else {
                    min = Math.min(0.1f, ((float) (nanoTime - j3)) / 1.0E9f);
                }
                gVar.G = min;
                this.f48024a = nanoTime;
                f fVar = this.d;
                fVar.f48029a.f48042c.A = fVar.f48037w;
                this.d.f48029a.onDrawFrame(gl10);
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    if (!this.f48025b) {
                        this.f48025b = true;
                        final int i11 = this.f48026c;
                        this.d.post(new Runnable(this) {
                            public final d f48022b;

                            {
                                this.f48022b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        d dVar = this.f48022b;
                                        f.a(dVar.d, i11);
                                        return;
                                    default:
                                        d dVar2 = this.f48022b;
                                        int i112 = i11;
                                        f fVar2 = dVar2.d;
                                        if (fVar2.f48032e && !fVar2.f48035r && i112 == dVar2.d.G) {
                                            f fVar22 = dVar2.d;
                                            fVar22.f48036s = true;
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
                this.d.f48035r = true;
                this.d.post(new x1(this, 3));
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        this.f48025b = false;
        this.f48026c = this.d.G;
        if (!this.d.f48035r) {
            this.d.f48029a.onSurfaceChanged(gl10, i10, i11);
        }
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        f fVar = this.d;
        int i10 = fVar.G + 1;
        fVar.G = i10;
        this.f48026c = i10;
        this.f48025b = false;
        this.f48024a = 0L;
        this.d.f48035r = false;
        g gVar = this.d.f48029a;
        gVar.f48042c = null;
        try {
            gVar.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e7) {
            FileLog.e(e7);
            this.d.f48035r = true;
            this.d.post(new x1(this, 3));
        }
    }
}
