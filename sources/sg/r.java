package sg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class r {
    public final s f48372a;
    public final Surface f48373b;
    public volatile boolean d;
    public volatile q f48375e;
    public int f48376f;
    public int f48377g;
    public boolean f48378i;
    public boolean f48379j;
    public volatile boolean f48374c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f48380k = -1;
    public float f48381l = -1.0f;

    public r(s sVar, Surface surface, int i10) {
        this.f48372a = sVar;
        this.f48373b = surface;
        this.f48377g = i10;
        this.f48376f = i10;
    }
}
