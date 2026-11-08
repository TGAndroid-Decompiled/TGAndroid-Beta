package vg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class q {
    public final r f57479a;
    public final Surface f57480b;
    public volatile boolean d;
    public volatile p f57482e;
    public int f57483f;
    public int f57484g;
    public boolean f57485i;
    public boolean f57486j;
    public volatile boolean f57481c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f57487k = -1;
    public float f57488l = -1.0f;

    public q(r rVar, Surface surface, int i7) {
        this.f57479a = rVar;
        this.f57480b = surface;
        this.f57484g = i7;
        this.f57483f = i7;
    }
}
