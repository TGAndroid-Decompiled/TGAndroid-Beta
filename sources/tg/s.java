package tg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class s {
    public final t f47165a;
    public final Surface f47166b;
    public volatile boolean d;
    public volatile r e;
    public int f47168f;
    public int f47169g;
    public boolean f47170i;
    public boolean f47171j;
    public volatile boolean f47167c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f47172k = -1;
    public float f47173l = -1.0f;

    public s(t tVar, Surface surface, int i10) {
        this.f47165a = tVar;
        this.f47166b = surface;
        this.f47169g = i10;
        this.f47168f = i10;
    }
}
