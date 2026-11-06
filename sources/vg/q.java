package vg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class q {
    public final r f57387a;
    public final Surface f57388b;
    public volatile boolean d;
    public volatile p f57390e;
    public int f57391f;
    public int f57392g;
    public boolean f57393i;
    public boolean f57394j;
    public volatile boolean f57389c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f57395k = -1;
    public float f57396l = -1.0f;

    public q(r rVar, Surface surface, int i7) {
        this.f57387a = rVar;
        this.f57388b = surface;
        this.f57392g = i7;
        this.f57391f = i7;
    }
}
