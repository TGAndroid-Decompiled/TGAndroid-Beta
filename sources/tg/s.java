package tg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class s {
    public final t f47613a;
    public final Surface f47614b;
    public volatile boolean d;
    public volatile r e;
    public int f47616f;
    public int f47617g;
    public boolean f47618i;
    public boolean f47619j;
    public volatile boolean f47615c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f47620k = -1;
    public float f47621l = -1.0f;

    public s(t tVar, Surface surface, int i10) {
        this.f47613a = tVar;
        this.f47614b = surface;
        this.f47617g = i10;
        this.f47616f = i10;
    }
}
