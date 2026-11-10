package vg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class q {
    public final r f57487a;
    public final Surface f57488b;
    public volatile boolean d;
    public volatile p f57490e;
    public int f57491f;
    public int f57492g;
    public boolean f57493i;
    public boolean f57494j;
    public volatile boolean f57489c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f57495k = -1;
    public float f57496l = -1.0f;

    public q(r rVar, Surface surface, int i7) {
        this.f57487a = rVar;
        this.f57488b = surface;
        this.f57492g = i7;
        this.f57491f = i7;
    }
}
