package sg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class r {
    public final s f48185a;
    public final Surface f48186b;
    public volatile boolean d;
    public volatile q f48188e;
    public int f48189f;
    public int f48190g;
    public boolean f48191i;
    public boolean f48192j;
    public volatile boolean f48187c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f48193k = -1;
    public float f48194l = -1.0f;

    public r(s sVar, Surface surface, int i10) {
        this.f48185a = sVar;
        this.f48186b = surface;
        this.f48190g = i10;
        this.f48189f = i10;
    }
}
