package vg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class q {
    public final r f59573a;
    public final Surface f59574b;
    public volatile boolean d;
    public volatile p f59576e;
    public int f59577f;
    public int f59578g;
    public boolean f59579i;
    public boolean f59580j;
    public volatile boolean f59575c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f59581k = -1;
    public float f59582l = -1.0f;

    public q(r rVar, Surface surface, int i7) {
        this.f59573a = rVar;
        this.f59574b = surface;
        this.f59578g = i7;
        this.f59577f = i7;
    }
}
