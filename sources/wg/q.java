package wg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class q {
    public final r f57734a;
    public final Surface f57735b;
    public volatile boolean d;
    public volatile p f57737e;
    public int f57738f;
    public int f57739g;
    public boolean f57740i;
    public boolean f57741j;
    public volatile boolean f57736c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f57742k = -1;
    public float f57743l = -1.0f;

    public q(r rVar, Surface surface, int i3) {
        this.f57734a = rVar;
        this.f57735b = surface;
        this.f57739g = i3;
        this.f57738f = i3;
    }
}
