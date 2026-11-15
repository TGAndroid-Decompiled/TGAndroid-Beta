package vg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class r {
    public final s f58963a;
    public final Surface f58964b;
    public volatile boolean d;
    public volatile q f58966e;
    public int f58967f;
    public int f58968g;
    public boolean f58969i;
    public boolean f58970j;
    public volatile boolean f58965c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f58971k = -1;
    public float f58972l = -1.0f;

    public r(s sVar, Surface surface, int i7) {
        this.f58963a = sVar;
        this.f58964b = surface;
        this.f58968g = i7;
        this.f58967f = i7;
    }
}
