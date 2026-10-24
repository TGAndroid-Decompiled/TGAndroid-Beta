package tg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class s {
    public final t f47612a;
    public final Surface f47613b;
    public volatile boolean d;
    public volatile r e;
    public int f47615f;
    public int f47616g;
    public boolean f47617i;
    public boolean f47618j;
    public volatile boolean f47614c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f47619k = -1;
    public float f47620l = -1.0f;

    public s(t tVar, Surface surface, int i10) {
        this.f47612a = tVar;
        this.f47613b = surface;
        this.f47616g = i10;
        this.f47615f = i10;
    }
}
