package sg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class r {
    public final s f48380a;
    public final Surface f48381b;
    public volatile boolean d;
    public volatile q f48383e;
    public int f48384f;
    public int f48385g;
    public boolean f48386i;
    public boolean f48387j;
    public volatile boolean f48382c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f48388k = -1;
    public float f48389l = -1.0f;

    public r(s sVar, Surface surface, int i10) {
        this.f48380a = sVar;
        this.f48381b = surface;
        this.f48385g = i10;
        this.f48384f = i10;
    }
}
