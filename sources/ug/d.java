package ug;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.FileLog;
public final class d implements GLSurfaceView.Renderer {
    public long f49799a;
    public boolean f49800b;
    public int f49801c;
    public final f d;

    public d(f fVar) {
        this.d = fVar;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float min;
        if (this.d.f49809r) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        } else if (!this.d.f49812x) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            if (!this.d.f49813y) {
                this.d.f49813y = true;
                final int i10 = this.d.E;
                this.d.post(new Runnable(this) {
                    public final d f49797b;

                    {
                        this.f49797b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                d dVar = this.f49797b;
                                f.a(dVar.d, i10);
                                return;
                            default:
                                d dVar2 = this.f49797b;
                                int i11 = i10;
                                f fVar = dVar2.d;
                                if (fVar.e && !fVar.f49809r && i11 == dVar2.d.G) {
                                    f fVar2 = dVar2.d;
                                    fVar2.f49810s = true;
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
                g gVar = this.d.f49804a;
                long j10 = this.f49799a;
                if (j10 == 0) {
                    min = 0.016666668f;
                } else {
                    min = Math.min(0.1f, ((float) (nanoTime - j10)) / 1.0E9f);
                }
                gVar.G = min;
                this.f49799a = nanoTime;
                f fVar = this.d;
                fVar.f49804a.f49816c.A = fVar.f49811w;
                this.d.f49804a.onDrawFrame(gl10);
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    if (!this.f49800b) {
                        this.f49800b = true;
                        final int i11 = this.f49801c;
                        this.d.post(new Runnable(this) {
                            public final d f49797b;

                            {
                                this.f49797b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        d dVar = this.f49797b;
                                        f.a(dVar.d, i11);
                                        return;
                                    default:
                                        d dVar2 = this.f49797b;
                                        int i112 = i11;
                                        f fVar2 = dVar2.d;
                                        if (fVar2.e && !fVar2.f49809r && i112 == dVar2.d.G) {
                                            f fVar22 = dVar2.d;
                                            fVar22.f49810s = true;
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
            } catch (RuntimeException e) {
                FileLog.e(e);
                this.d.f49809r = true;
                this.d.post(new ti.g(this, 2));
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        this.f49800b = false;
        this.f49801c = this.d.G;
        if (!this.d.f49809r) {
            this.d.f49804a.onSurfaceChanged(gl10, i10, i11);
        }
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        f fVar = this.d;
        int i10 = fVar.G + 1;
        fVar.G = i10;
        this.f49801c = i10;
        this.f49800b = false;
        this.f49799a = 0L;
        this.d.f49809r = false;
        g gVar = this.d.f49804a;
        gVar.f49816c = null;
        try {
            gVar.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e) {
            FileLog.e(e);
            this.d.f49809r = true;
            this.d.post(new ti.g(this, 2));
        }
    }
}
