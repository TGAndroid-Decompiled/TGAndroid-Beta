package vg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class q {
    public final r f59531a;
    public final Surface f59532b;
    public volatile boolean d;
    public volatile p f59534e;
    public int f59535f;
    public int f59536g;
    public boolean f59537i;
    public boolean f59538j;
    public volatile boolean f59533c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f59539k = -1;
    public float f59540l = -1.0f;

    public q(r rVar, Surface surface, int i7) {
        this.f59531a = rVar;
        this.f59532b = surface;
        this.f59536g = i7;
        this.f59535f = i7;
    }
}
