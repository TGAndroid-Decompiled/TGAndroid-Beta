package ug;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class r {
    public final s f49877a;
    public final Surface f49878b;
    public volatile boolean d;
    public volatile q e;
    public int f49880f;
    public int f49881g;
    public boolean f49882i;
    public boolean f49883j;
    public volatile boolean f49879c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f49884k = -1;
    public float f49885l = -1.0f;

    public r(s sVar, Surface surface, int i10) {
        this.f49877a = sVar;
        this.f49878b = surface;
        this.f49881g = i10;
        this.f49880f = i10;
    }
}
