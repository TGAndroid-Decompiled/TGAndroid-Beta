package r1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.hy0;
public final class g {
    public static final b f54251o = new b(1);
    public static final b f54252p = new b(2);
    public static final b f54253q = new b(3);
    public static final b f54254r = new b(4);
    public static final b f54255s = new b(5);
    public static final b f54256t = new b(6);
    public static final b f54257u = new b(7);
    public static final b v = new b(0);
    public float f54258a;
    public float f54259b;
    public boolean f54260c;
    public final Object d;
    public final e f54261e;
    public boolean f54262f;
    public float f54263g;
    public float h;
    public long f54264i;
    public float f54265j;
    public final ArrayList f54266k;
    public final ArrayList f54267l;
    public h f54268m;
    public float f54269n;

    public g(Object obj, e eVar) {
        this(obj, eVar, 0);
        this.f54268m = null;
        this.f54269n = Float.MAX_VALUE;
    }

    public final void a(c cVar) {
        ArrayList arrayList = this.f54266k;
        if (!arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
    }

    public final void b(d dVar) {
        if (!this.f54262f) {
            ArrayList arrayList = this.f54267l;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public final void c(float f10) {
        if (this.f54262f) {
            this.f54269n = f10;
            return;
        }
        if (this.f54268m == null) {
            this.f54268m = new h(f10);
        }
        this.f54268m.f54276i = f10;
        h();
    }

    public final void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f54262f) {
                e(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    public final void e(boolean z9) {
        ArrayList arrayList;
        int i7 = 0;
        this.f54262f = false;
        ThreadLocal threadLocal = a.f54244f;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        a aVar = (a) threadLocal.get();
        aVar.f54245a.remove(this);
        ArrayList arrayList2 = aVar.f54246b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            aVar.f54248e = true;
        }
        this.f54264i = 0L;
        this.f54260c = false;
        while (true) {
            arrayList = this.f54266k;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((c) arrayList.get(i7)).a(this, z9, this.f54259b, this.f54258a);
            }
            i7++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void f(float f10) {
        if (f10 > 0.0f) {
            this.f54265j = f10;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void g(float f10) {
        ArrayList arrayList;
        this.f54261e.b(this.d, f10);
        int i7 = 0;
        while (true) {
            arrayList = this.f54267l;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((d) arrayList.get(i7)).a(this, this.f54259b, this.f54258a);
            }
            i7++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void h() {
        h hVar = this.f54268m;
        if (hVar != null) {
            double d = (float) hVar.f54276i;
            if (d <= this.f54263g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f54265j * 0.75f);
                    hVar.d = abs;
                    hVar.f54273e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z9 = this.f54262f;
                        if (!z9 && !z9) {
                            this.f54262f = true;
                            if (!this.f54260c) {
                                this.f54259b = this.f54261e.a(this.d);
                            }
                            float f10 = this.f54259b;
                            if (f10 <= this.f54263g && f10 >= this.h) {
                                ThreadLocal threadLocal = a.f54244f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new a());
                                }
                                a aVar = (a) threadLocal.get();
                                ArrayList arrayList = aVar.f54246b;
                                if (arrayList.size() == 0) {
                                    if (aVar.d == null) {
                                        aVar.d = new hy0(aVar.f54247c);
                                    }
                                    hy0 hy0Var = aVar.d;
                                    ((Choreographer) hy0Var.f46527c).postFrameCallback((xy0) hy0Var.d);
                                }
                                if (!arrayList.contains(this)) {
                                    arrayList.add(this);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                        }
                        return;
                    }
                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                }
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    public g(Object obj, e eVar, float f10) {
        this(obj, eVar, 0);
        this.f54268m = null;
        this.f54269n = Float.MAX_VALUE;
        this.f54268m = new h(f10);
    }

    public g(f fVar) {
        this.f54258a = 0.0f;
        this.f54259b = Float.MAX_VALUE;
        this.f54260c = false;
        this.f54262f = false;
        this.f54263g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f54264i = 0L;
        this.f54266k = new ArrayList();
        this.f54267l = new ArrayList();
        this.d = null;
        this.f54261e = new c6(fVar, 1);
        this.f54265j = 1.0f;
        this.f54268m = null;
        this.f54269n = Float.MAX_VALUE;
    }

    public g(Object obj, e eVar, int i7) {
        this.f54258a = 0.0f;
        this.f54259b = Float.MAX_VALUE;
        this.f54260c = false;
        this.f54262f = false;
        this.f54263g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f54264i = 0L;
        this.f54266k = new ArrayList();
        this.f54267l = new ArrayList();
        this.d = obj;
        this.f54261e = eVar;
        if (eVar != f54255s && eVar != f54256t && eVar != f54257u) {
            if (eVar == v) {
                this.f54265j = 0.00390625f;
                return;
            } else if (eVar != f54253q && eVar != f54254r) {
                this.f54265j = 1.0f;
                return;
            } else {
                this.f54265j = 0.00390625f;
                return;
            }
        }
        this.f54265j = 0.1f;
    }
}
