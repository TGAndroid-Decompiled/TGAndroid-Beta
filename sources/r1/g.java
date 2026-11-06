package r1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.hy0;
public final class g {
    public static final b f54133o = new b(1);
    public static final b f54134p = new b(2);
    public static final b f54135q = new b(3);
    public static final b f54136r = new b(4);
    public static final b f54137s = new b(5);
    public static final b f54138t = new b(6);
    public static final b f54139u = new b(7);
    public static final b v = new b(0);
    public float f54140a;
    public float f54141b;
    public boolean f54142c;
    public final Object d;
    public final e f54143e;
    public boolean f54144f;
    public float f54145g;
    public float h;
    public long f54146i;
    public float f54147j;
    public final ArrayList f54148k;
    public final ArrayList f54149l;
    public h f54150m;
    public float f54151n;

    public g(Object obj, e eVar) {
        this(obj, eVar, 0);
        this.f54150m = null;
        this.f54151n = Float.MAX_VALUE;
    }

    public final void a(c cVar) {
        ArrayList arrayList = this.f54148k;
        if (!arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
    }

    public final void b(d dVar) {
        if (!this.f54144f) {
            ArrayList arrayList = this.f54149l;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public final void c(float f10) {
        if (this.f54144f) {
            this.f54151n = f10;
            return;
        }
        if (this.f54150m == null) {
            this.f54150m = new h(f10);
        }
        this.f54150m.f54158i = f10;
        h();
    }

    public final void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f54144f) {
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
        this.f54144f = false;
        ThreadLocal threadLocal = a.f54126f;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        a aVar = (a) threadLocal.get();
        aVar.f54127a.remove(this);
        ArrayList arrayList2 = aVar.f54128b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            aVar.f54130e = true;
        }
        this.f54146i = 0L;
        this.f54142c = false;
        while (true) {
            arrayList = this.f54148k;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((c) arrayList.get(i7)).a(this, z9, this.f54141b, this.f54140a);
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
            this.f54147j = f10;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void g(float f10) {
        ArrayList arrayList;
        this.f54143e.b(this.d, f10);
        int i7 = 0;
        while (true) {
            arrayList = this.f54149l;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((d) arrayList.get(i7)).a(this, this.f54141b, this.f54140a);
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
        h hVar = this.f54150m;
        if (hVar != null) {
            double d = (float) hVar.f54158i;
            if (d <= this.f54145g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f54147j * 0.75f);
                    hVar.d = abs;
                    hVar.f54155e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z9 = this.f54144f;
                        if (!z9 && !z9) {
                            this.f54144f = true;
                            if (!this.f54142c) {
                                this.f54141b = this.f54143e.a(this.d);
                            }
                            float f10 = this.f54141b;
                            if (f10 <= this.f54145g && f10 >= this.h) {
                                ThreadLocal threadLocal = a.f54126f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new a());
                                }
                                a aVar = (a) threadLocal.get();
                                ArrayList arrayList = aVar.f54128b;
                                if (arrayList.size() == 0) {
                                    if (aVar.d == null) {
                                        aVar.d = new hy0(aVar.f54129c);
                                    }
                                    hy0 hy0Var = aVar.d;
                                    ((Choreographer) hy0Var.f46520c).postFrameCallback((wy0) hy0Var.d);
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
        this.f54150m = null;
        this.f54151n = Float.MAX_VALUE;
        this.f54150m = new h(f10);
    }

    public g(f fVar) {
        this.f54140a = 0.0f;
        this.f54141b = Float.MAX_VALUE;
        this.f54142c = false;
        this.f54144f = false;
        this.f54145g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f54146i = 0L;
        this.f54148k = new ArrayList();
        this.f54149l = new ArrayList();
        this.d = null;
        this.f54143e = new c6(fVar, 1);
        this.f54147j = 1.0f;
        this.f54150m = null;
        this.f54151n = Float.MAX_VALUE;
    }

    public g(Object obj, e eVar, int i7) {
        this.f54140a = 0.0f;
        this.f54141b = Float.MAX_VALUE;
        this.f54142c = false;
        this.f54144f = false;
        this.f54145g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f54146i = 0L;
        this.f54148k = new ArrayList();
        this.f54149l = new ArrayList();
        this.d = obj;
        this.f54143e = eVar;
        if (eVar != f54137s && eVar != f54138t && eVar != f54139u) {
            if (eVar == v) {
                this.f54147j = 0.00390625f;
                return;
            } else if (eVar != f54135q && eVar != f54136r) {
                this.f54147j = 1.0f;
                return;
            } else {
                this.f54147j = 0.00390625f;
                return;
            }
        }
        this.f54147j = 0.1f;
    }
}
