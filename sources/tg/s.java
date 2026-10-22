package tg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class s {
    public final t f47177a;
    public final Surface f47178b;
    public volatile boolean d;
    public volatile r e;
    public int f47180f;
    public int f47181g;
    public boolean f47182i;
    public boolean f47183j;
    public volatile boolean f47179c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f47184k = -1;
    public float f47185l = -1.0f;

    public s(t tVar, Surface surface, int i10) {
        this.f47177a = tVar;
        this.f47178b = surface;
        this.f47181g = i10;
        this.f47180f = i10;
    }
}
