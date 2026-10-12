package tg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class r {
    public final s f45800a;
    public final Surface f45801b;
    public volatile boolean d;
    public volatile q e;
    public int f45803f;
    public int f45804g;
    public boolean f45805i;
    public boolean f45806j;
    public volatile boolean f45802c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f45807k = -1;
    public float f45808l = -1.0f;

    public r(s sVar, Surface surface, int i10) {
        this.f45800a = sVar;
        this.f45801b = surface;
        this.f45804g = i10;
        this.f45803f = i10;
    }
}
