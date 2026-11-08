package vg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class q {
    public final r f57478a;
    public final Surface f57479b;
    public volatile boolean d;
    public volatile p f57481e;
    public int f57482f;
    public int f57483g;
    public boolean f57484i;
    public boolean f57485j;
    public volatile boolean f57480c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f57486k = -1;
    public float f57487l = -1.0f;

    public q(r rVar, Surface surface, int i7) {
        this.f57478a = rVar;
        this.f57479b = surface;
        this.f57483g = i7;
        this.f57482f = i7;
    }
}
