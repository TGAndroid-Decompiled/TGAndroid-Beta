package ug;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class r {
    public final s f49880a;
    public final Surface f49881b;
    public volatile boolean d;
    public volatile q e;
    public int f49883f;
    public int f49884g;
    public boolean f49885i;
    public boolean f49886j;
    public volatile boolean f49882c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f49887k = -1;
    public float f49888l = -1.0f;

    public r(s sVar, Surface surface, int i10) {
        this.f49880a = sVar;
        this.f49881b = surface;
        this.f49884g = i10;
        this.f49883f = i10;
    }
}
