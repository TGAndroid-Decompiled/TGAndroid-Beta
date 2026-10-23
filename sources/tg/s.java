package tg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class s {
    public final t f47178a;
    public final Surface f47179b;
    public volatile boolean d;
    public volatile r e;
    public int f47181f;
    public int f47182g;
    public boolean f47183i;
    public boolean f47184j;
    public volatile boolean f47180c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f47185k = -1;
    public float f47186l = -1.0f;

    public s(t tVar, Surface surface, int i10) {
        this.f47178a = tVar;
        this.f47179b = surface;
        this.f47182g = i10;
        this.f47181f = i10;
    }
}
