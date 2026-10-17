package tg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class s {
    public final t f47190a;
    public final Surface f47191b;
    public volatile boolean d;
    public volatile r e;
    public int f47193f;
    public int f47194g;
    public boolean f47195i;
    public boolean f47196j;
    public volatile boolean f47192c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f47197k = -1;
    public float f47198l = -1.0f;

    public s(t tVar, Surface surface, int i10) {
        this.f47190a = tVar;
        this.f47191b = surface;
        this.f47194g = i10;
        this.f47193f = i10;
    }
}
