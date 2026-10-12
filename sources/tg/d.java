package tg;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.FileLog;
public final class d implements GLSurfaceView.Renderer {
    public long f45688a;
    public boolean f45689b;
    public int f45690c;
    public final f d;

    public d(f fVar) {
        this.d = fVar;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float min;
        if (this.d.f45698r) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        } else if (!this.d.f45701x) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            if (!this.d.f45702y) {
                this.d.f45702y = true;
                final int i10 = this.d.E;
                this.d.post(new Runnable(this) {
                    public final d f45686b;

                    {
                        this.f45686b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                d dVar = this.f45686b;
                                f.a(dVar.d, i10);
                                return;
                            default:
                                d dVar2 = this.f45686b;
                                int i11 = i10;
                                f fVar = dVar2.d;
                                if (fVar.e && !fVar.f45698r && i11 == dVar2.d.G) {
                                    f fVar2 = dVar2.d;
                                    fVar2.f45699s = true;
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
                g gVar = this.d.f45693a;
                long j10 = this.f45688a;
                if (j10 == 0) {
                    min = 0.016666668f;
                } else {
                    min = Math.min(0.1f, ((float) (nanoTime - j10)) / 1.0E9f);
                }
                gVar.G = min;
                this.f45688a = nanoTime;
                f fVar = this.d;
                fVar.f45693a.f45705c.A = fVar.f45700w;
                this.d.f45693a.onDrawFrame(gl10);
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    if (!this.f45689b) {
                        this.f45689b = true;
                        final int i11 = this.f45690c;
                        this.d.post(new Runnable(this) {
                            public final d f45686b;

                            {
                                this.f45686b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        d dVar = this.f45686b;
                                        f.a(dVar.d, i11);
                                        return;
                                    default:
                                        d dVar2 = this.f45686b;
                                        int i112 = i11;
                                        f fVar2 = dVar2.d;
                                        if (fVar2.e && !fVar2.f45698r && i112 == dVar2.d.G) {
                                            f fVar22 = dVar2.d;
                                            fVar22.f45699s = true;
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
                this.d.f45698r = true;
                this.d.post(new rh.j(this, 9));
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        this.f45689b = false;
        this.f45690c = this.d.G;
        if (!this.d.f45698r) {
            this.d.f45693a.onSurfaceChanged(gl10, i10, i11);
        }
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        f fVar = this.d;
        int i10 = fVar.G + 1;
        fVar.G = i10;
        this.f45690c = i10;
        this.f45689b = false;
        this.f45688a = 0L;
        this.d.f45698r = false;
        g gVar = this.d.f45693a;
        gVar.f45705c = null;
        try {
            gVar.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e) {
            FileLog.e(e);
            this.d.f45698r = true;
            this.d.post(new rh.j(this, 9));
        }
    }
}
