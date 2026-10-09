package sg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class r {
    public final s f48139a;
    public final Surface f48140b;
    public volatile boolean d;
    public volatile q f48142e;
    public int f48143f;
    public int f48144g;
    public boolean f48145i;
    public boolean f48146j;
    public volatile boolean f48141c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f48147k = -1;
    public float f48148l = -1.0f;

    public r(s sVar, Surface surface, int i10) {
        this.f48139a = sVar;
        this.f48140b = surface;
        this.f48144g = i10;
        this.f48143f = i10;
    }
}
