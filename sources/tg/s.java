package tg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class s {
    public final t f47174a;
    public final Surface f47175b;
    public volatile boolean d;
    public volatile r e;
    public int f47177f;
    public int f47178g;
    public boolean f47179i;
    public boolean f47180j;
    public volatile boolean f47176c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f47181k = -1;
    public float f47182l = -1.0f;

    public s(t tVar, Surface surface, int i10) {
        this.f47174a = tVar;
        this.f47175b = surface;
        this.f47178g = i10;
        this.f47177f = i10;
    }
}
