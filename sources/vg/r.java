package vg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class r {
    public final s f59538a;
    public final Surface f59539b;
    public volatile boolean d;
    public volatile q f59541e;
    public int f59542f;
    public int f59543g;
    public boolean f59544i;
    public boolean f59545j;
    public volatile boolean f59540c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f59546k = -1;
    public float f59547l = -1.0f;

    public r(s sVar, Surface surface, int i7) {
        this.f59538a = sVar;
        this.f59539b = surface;
        this.f59543g = i7;
        this.f59542f = i7;
    }
}
