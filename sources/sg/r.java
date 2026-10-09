package sg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class r {
    public final s f48141a;
    public final Surface f48142b;
    public volatile boolean d;
    public volatile q f48144e;
    public int f48145f;
    public int f48146g;
    public boolean f48147i;
    public boolean f48148j;
    public volatile boolean f48143c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f48149k = -1;
    public float f48150l = -1.0f;

    public r(s sVar, Surface surface, int i10) {
        this.f48141a = sVar;
        this.f48142b = surface;
        this.f48146g = i10;
        this.f48145f = i10;
    }
}
