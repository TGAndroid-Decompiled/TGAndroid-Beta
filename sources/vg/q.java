package vg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class q {
    public final r f57386a;
    public final Surface f57387b;
    public volatile boolean d;
    public volatile p f57389e;
    public int f57390f;
    public int f57391g;
    public boolean f57392i;
    public boolean f57393j;
    public volatile boolean f57388c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f57394k = -1;
    public float f57395l = -1.0f;

    public q(r rVar, Surface surface, int i7) {
        this.f57386a = rVar;
        this.f57387b = surface;
        this.f57391g = i7;
        this.f57390f = i7;
    }
}
