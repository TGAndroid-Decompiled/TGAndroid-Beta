package tg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class s {
    public final t f47169a;
    public final Surface f47170b;
    public volatile boolean d;
    public volatile r e;
    public int f47172f;
    public int f47173g;
    public boolean f47174i;
    public boolean f47175j;
    public volatile boolean f47171c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f47176k = -1;
    public float f47177l = -1.0f;

    public s(t tVar, Surface surface, int i10) {
        this.f47169a = tVar;
        this.f47170b = surface;
        this.f47173g = i10;
        this.f47172f = i10;
    }
}
