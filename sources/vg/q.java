package vg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class q {
    public final r f59569a;
    public final Surface f59570b;
    public volatile boolean d;
    public volatile p f59572e;
    public int f59573f;
    public int f59574g;
    public boolean f59575i;
    public boolean f59576j;
    public volatile boolean f59571c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f59577k = -1;
    public float f59578l = -1.0f;

    public q(r rVar, Surface surface, int i7) {
        this.f59569a = rVar;
        this.f59570b = surface;
        this.f59574g = i7;
        this.f59573f = i7;
    }
}
