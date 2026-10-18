package tg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class s {
    public final t f47215a;
    public final Surface f47216b;
    public volatile boolean d;
    public volatile r e;
    public int f47218f;
    public int f47219g;
    public boolean f47220i;
    public boolean f47221j;
    public volatile boolean f47217c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f47222k = -1;
    public float f47223l = -1.0f;

    public s(t tVar, Surface surface, int i10) {
        this.f47215a = tVar;
        this.f47216b = surface;
        this.f47219g = i10;
        this.f47218f = i10;
    }
}
