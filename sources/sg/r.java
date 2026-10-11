package sg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class r {
    public final s f48265a;
    public final Surface f48266b;
    public volatile boolean d;
    public volatile q f48268e;
    public int f48269f;
    public int f48270g;
    public boolean f48271i;
    public boolean f48272j;
    public volatile boolean f48267c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f48273k = -1;
    public float f48274l = -1.0f;

    public r(s sVar, Surface surface, int i10) {
        this.f48265a = sVar;
        this.f48266b = surface;
        this.f48270g = i10;
        this.f48269f = i10;
    }
}
