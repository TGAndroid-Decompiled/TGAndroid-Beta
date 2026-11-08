package r1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.hy0;
public final class g {
    public static final b f54250o = new b(1);
    public static final b f54251p = new b(2);
    public static final b f54252q = new b(3);
    public static final b f54253r = new b(4);
    public static final b f54254s = new b(5);
    public static final b f54255t = new b(6);
    public static final b f54256u = new b(7);
    public static final b v = new b(0);
    public float f54257a;
    public float f54258b;
    public boolean f54259c;
    public final Object d;
    public final e f54260e;
    public boolean f54261f;
    public float f54262g;
    public float h;
    public long f54263i;
    public float f54264j;
    public final ArrayList f54265k;
    public final ArrayList f54266l;
    public h f54267m;
    public float f54268n;

    public g(Object obj, e eVar) {
        this(obj, eVar, 0);
        this.f54267m = null;
        this.f54268n = Float.MAX_VALUE;
    }

    public final void a(c cVar) {
        ArrayList arrayList = this.f54265k;
        if (!arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
    }

    public final void b(d dVar) {
        if (!this.f54261f) {
            ArrayList arrayList = this.f54266l;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public final void c(float f10) {
        if (this.f54261f) {
            this.f54268n = f10;
            return;
        }
        if (this.f54267m == null) {
            this.f54267m = new h(f10);
        }
        this.f54267m.f54275i = f10;
        h();
    }

    public final void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f54261f) {
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
        this.f54261f = false;
        ThreadLocal threadLocal = a.f54243f;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        a aVar = (a) threadLocal.get();
        aVar.f54244a.remove(this);
        ArrayList arrayList2 = aVar.f54245b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            aVar.f54247e = true;
        }
        this.f54263i = 0L;
        this.f54259c = false;
        while (true) {
            arrayList = this.f54265k;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((c) arrayList.get(i7)).a(this, z9, this.f54258b, this.f54257a);
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
            this.f54264j = f10;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void g(float f10) {
        ArrayList arrayList;
        this.f54260e.b(this.d, f10);
        int i7 = 0;
        while (true) {
            arrayList = this.f54266l;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((d) arrayList.get(i7)).a(this, this.f54258b, this.f54257a);
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
        h hVar = this.f54267m;
        if (hVar != null) {
            double d = (float) hVar.f54275i;
            if (d <= this.f54262g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f54264j * 0.75f);
                    hVar.d = abs;
                    hVar.f54272e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z9 = this.f54261f;
                        if (!z9 && !z9) {
                            this.f54261f = true;
                            if (!this.f54259c) {
                                this.f54258b = this.f54260e.a(this.d);
                            }
                            float f10 = this.f54258b;
                            if (f10 <= this.f54262g && f10 >= this.h) {
                                ThreadLocal threadLocal = a.f54243f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new a());
                                }
                                a aVar = (a) threadLocal.get();
                                ArrayList arrayList = aVar.f54245b;
                                if (arrayList.size() == 0) {
                                    if (aVar.d == null) {
                                        aVar.d = new hy0(aVar.f54246c);
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
        this.f54267m = null;
        this.f54268n = Float.MAX_VALUE;
        this.f54267m = new h(f10);
    }

    public g(f fVar) {
        this.f54257a = 0.0f;
        this.f54258b = Float.MAX_VALUE;
        this.f54259c = false;
        this.f54261f = false;
        this.f54262g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f54263i = 0L;
        this.f54265k = new ArrayList();
        this.f54266l = new ArrayList();
        this.d = null;
        this.f54260e = new c6(fVar, 1);
        this.f54264j = 1.0f;
        this.f54267m = null;
        this.f54268n = Float.MAX_VALUE;
    }

    public g(Object obj, e eVar, int i7) {
        this.f54257a = 0.0f;
        this.f54258b = Float.MAX_VALUE;
        this.f54259c = false;
        this.f54261f = false;
        this.f54262g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f54263i = 0L;
        this.f54265k = new ArrayList();
        this.f54266l = new ArrayList();
        this.d = obj;
        this.f54260e = eVar;
        if (eVar != f54254s && eVar != f54255t && eVar != f54256u) {
            if (eVar == v) {
                this.f54264j = 0.00390625f;
                return;
            } else if (eVar != f54252q && eVar != f54253r) {
                this.f54264j = 1.0f;
                return;
            } else {
                this.f54264j = 0.00390625f;
                return;
            }
        }
        this.f54264j = 0.1f;
    }
}
