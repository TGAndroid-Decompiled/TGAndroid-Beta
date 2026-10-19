package tg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class s {
    public final t f47167a;
    public final Surface f47168b;
    public volatile boolean d;
    public volatile r e;
    public int f47170f;
    public int f47171g;
    public boolean f47172i;
    public boolean f47173j;
    public volatile boolean f47169c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f47174k = -1;
    public float f47175l = -1.0f;

    public s(t tVar, Surface surface, int i10) {
        this.f47167a = tVar;
        this.f47168b = surface;
        this.f47171g = i10;
        this.f47170f = i10;
    }
}
