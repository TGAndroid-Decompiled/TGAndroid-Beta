package vg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class q {
    public final r f59658a;
    public final Surface f59659b;
    public volatile boolean d;
    public volatile p f59661e;
    public int f59662f;
    public int f59663g;
    public boolean f59664i;
    public boolean f59665j;
    public volatile boolean f59660c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f59666k = -1;
    public float f59667l = -1.0f;

    public q(r rVar, Surface surface, int i7) {
        this.f59658a = rVar;
        this.f59659b = surface;
        this.f59663g = i7;
        this.f59662f = i7;
    }
}
