package vg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class q {
    public final r f57491a;
    public final Surface f57492b;
    public volatile boolean d;
    public volatile p f57494e;
    public int f57495f;
    public int f57496g;
    public boolean f57497i;
    public boolean f57498j;
    public volatile boolean f57493c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f57499k = -1;
    public float f57500l = -1.0f;

    public q(r rVar, Surface surface, int i7) {
        this.f57491a = rVar;
        this.f57492b = surface;
        this.f57496g = i7;
        this.f57495f = i7;
    }
}
