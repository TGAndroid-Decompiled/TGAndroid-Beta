package r1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.hy0;
public final class g {
    public static final b f54157o = new b(1);
    public static final b f54158p = new b(2);
    public static final b f54159q = new b(3);
    public static final b f54160r = new b(4);
    public static final b f54161s = new b(5);
    public static final b f54162t = new b(6);
    public static final b f54163u = new b(7);
    public static final b v = new b(0);
    public float f54164a;
    public float f54165b;
    public boolean f54166c;
    public final Object d;
    public final e f54167e;
    public boolean f54168f;
    public float f54169g;
    public float h;
    public long f54170i;
    public float f54171j;
    public final ArrayList f54172k;
    public final ArrayList f54173l;
    public h f54174m;
    public float f54175n;

    public g(Object obj, e eVar) {
        this(obj, eVar, 0);
        this.f54174m = null;
        this.f54175n = Float.MAX_VALUE;
    }

    public final void a(c cVar) {
        ArrayList arrayList = this.f54172k;
        if (!arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
    }

    public final void b(d dVar) {
        if (!this.f54168f) {
            ArrayList arrayList = this.f54173l;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public final void c(float f10) {
        if (this.f54168f) {
            this.f54175n = f10;
            return;
        }
        if (this.f54174m == null) {
            this.f54174m = new h(f10);
        }
        this.f54174m.f54182i = f10;
        h();
    }

    public final void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f54168f) {
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
        this.f54168f = false;
        ThreadLocal threadLocal = a.f54150f;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        a aVar = (a) threadLocal.get();
        aVar.f54151a.remove(this);
        ArrayList arrayList2 = aVar.f54152b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            aVar.f54154e = true;
        }
        this.f54170i = 0L;
        this.f54166c = false;
        while (true) {
            arrayList = this.f54172k;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((c) arrayList.get(i7)).a(this, z9, this.f54165b, this.f54164a);
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
            this.f54171j = f10;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void g(float f10) {
        ArrayList arrayList;
        this.f54167e.b(this.d, f10);
        int i7 = 0;
        while (true) {
            arrayList = this.f54173l;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((d) arrayList.get(i7)).a(this, this.f54165b, this.f54164a);
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
        h hVar = this.f54174m;
        if (hVar != null) {
            double d = (float) hVar.f54182i;
            if (d <= this.f54169g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f54171j * 0.75f);
                    hVar.d = abs;
                    hVar.f54179e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z9 = this.f54168f;
                        if (!z9 && !z9) {
                            this.f54168f = true;
                            if (!this.f54166c) {
                                this.f54165b = this.f54167e.a(this.d);
                            }
                            float f10 = this.f54165b;
                            if (f10 <= this.f54169g && f10 >= this.h) {
                                ThreadLocal threadLocal = a.f54150f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new a());
                                }
                                a aVar = (a) threadLocal.get();
                                ArrayList arrayList = aVar.f54152b;
                                if (arrayList.size() == 0) {
                                    if (aVar.d == null) {
                                        aVar.d = new hy0(aVar.f54153c);
                                    }
                                    hy0 hy0Var = aVar.d;
                                    ((Choreographer) hy0Var.f46528c).postFrameCallback((xy0) hy0Var.d);
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
        this.f54174m = null;
        this.f54175n = Float.MAX_VALUE;
        this.f54174m = new h(f10);
    }

    public g(f fVar) {
        this.f54164a = 0.0f;
        this.f54165b = Float.MAX_VALUE;
        this.f54166c = false;
        this.f54168f = false;
        this.f54169g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f54170i = 0L;
        this.f54172k = new ArrayList();
        this.f54173l = new ArrayList();
        this.d = null;
        this.f54167e = new c6(fVar, 1);
        this.f54171j = 1.0f;
        this.f54174m = null;
        this.f54175n = Float.MAX_VALUE;
    }

    public g(Object obj, e eVar, int i7) {
        this.f54164a = 0.0f;
        this.f54165b = Float.MAX_VALUE;
        this.f54166c = false;
        this.f54168f = false;
        this.f54169g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f54170i = 0L;
        this.f54172k = new ArrayList();
        this.f54173l = new ArrayList();
        this.d = obj;
        this.f54167e = eVar;
        if (eVar != f54161s && eVar != f54162t && eVar != f54163u) {
            if (eVar == v) {
                this.f54171j = 0.00390625f;
                return;
            } else if (eVar != f54159q && eVar != f54160r) {
                this.f54171j = 1.0f;
                return;
            } else {
                this.f54171j = 0.00390625f;
                return;
            }
        }
        this.f54171j = 0.1f;
    }
}
