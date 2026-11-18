package vg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class q {
    public final r f59530a;
    public final Surface f59531b;
    public volatile boolean d;
    public volatile p f59533e;
    public int f59534f;
    public int f59535g;
    public boolean f59536i;
    public boolean f59537j;
    public volatile boolean f59532c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f59538k = -1;
    public float f59539l = -1.0f;

    public q(r rVar, Surface surface, int i7) {
        this.f59530a = rVar;
        this.f59531b = surface;
        this.f59535g = i7;
        this.f59534f = i7;
    }
}
