package sg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class r {
    public final s f48231a;
    public final Surface f48232b;
    public volatile boolean d;
    public volatile q f48234e;
    public int f48235f;
    public int f48236g;
    public boolean f48237i;
    public boolean f48238j;
    public volatile boolean f48233c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f48239k = -1;
    public float f48240l = -1.0f;

    public r(s sVar, Surface surface, int i10) {
        this.f48231a = sVar;
        this.f48232b = surface;
        this.f48236g = i10;
        this.f48235f = i10;
    }
}
