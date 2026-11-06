package vg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class q {
    public final r f57362a;
    public final Surface f57363b;
    public volatile boolean d;
    public volatile p f57365e;
    public int f57366f;
    public int f57367g;
    public boolean f57368i;
    public boolean f57369j;
    public volatile boolean f57364c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f57370k = -1;
    public float f57371l = -1.0f;

    public q(r rVar, Surface surface, int i7) {
        this.f57362a = rVar;
        this.f57363b = surface;
        this.f57367g = i7;
        this.f57366f = i7;
    }
}
