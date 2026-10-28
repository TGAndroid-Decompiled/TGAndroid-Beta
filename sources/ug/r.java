package ug;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class r {
    public final s f49915a;
    public final Surface f49916b;
    public volatile boolean d;
    public volatile q e;
    public int f49918f;
    public int f49919g;
    public boolean f49920i;
    public boolean f49921j;
    public volatile boolean f49917c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f49922k = -1;
    public float f49923l = -1.0f;

    public r(s sVar, Surface surface, int i10) {
        this.f49915a = sVar;
        this.f49916b = surface;
        this.f49919g = i10;
        this.f49918f = i10;
    }
}
