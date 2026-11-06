package r1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.hy0;
public final class g {
    public static final b f54158o = new b(1);
    public static final b f54159p = new b(2);
    public static final b f54160q = new b(3);
    public static final b f54161r = new b(4);
    public static final b f54162s = new b(5);
    public static final b f54163t = new b(6);
    public static final b f54164u = new b(7);
    public static final b v = new b(0);
    public float f54165a;
    public float f54166b;
    public boolean f54167c;
    public final Object d;
    public final e f54168e;
    public boolean f54169f;
    public float f54170g;
    public float h;
    public long f54171i;
    public float f54172j;
    public final ArrayList f54173k;
    public final ArrayList f54174l;
    public h f54175m;
    public float f54176n;

    public g(Object obj, e eVar) {
        this(obj, eVar, 0);
        this.f54175m = null;
        this.f54176n = Float.MAX_VALUE;
    }

    public final void a(c cVar) {
        ArrayList arrayList = this.f54173k;
        if (!arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
    }

    public final void b(d dVar) {
        if (!this.f54169f) {
            ArrayList arrayList = this.f54174l;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public final void c(float f10) {
        if (this.f54169f) {
            this.f54176n = f10;
            return;
        }
        if (this.f54175m == null) {
            this.f54175m = new h(f10);
        }
        this.f54175m.f54183i = f10;
        h();
    }

    public final void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f54169f) {
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
        this.f54169f = false;
        ThreadLocal threadLocal = a.f54151f;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        a aVar = (a) threadLocal.get();
        aVar.f54152a.remove(this);
        ArrayList arrayList2 = aVar.f54153b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            aVar.f54155e = true;
        }
        this.f54171i = 0L;
        this.f54167c = false;
        while (true) {
            arrayList = this.f54173k;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((c) arrayList.get(i7)).a(this, z9, this.f54166b, this.f54165a);
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
            this.f54172j = f10;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void g(float f10) {
        ArrayList arrayList;
        this.f54168e.b(this.d, f10);
        int i7 = 0;
        while (true) {
            arrayList = this.f54174l;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((d) arrayList.get(i7)).a(this, this.f54166b, this.f54165a);
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
        h hVar = this.f54175m;
        if (hVar != null) {
            double d = (float) hVar.f54183i;
            if (d <= this.f54170g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f54172j * 0.75f);
                    hVar.d = abs;
                    hVar.f54180e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z9 = this.f54169f;
                        if (!z9 && !z9) {
                            this.f54169f = true;
                            if (!this.f54167c) {
                                this.f54166b = this.f54168e.a(this.d);
                            }
                            float f10 = this.f54166b;
                            if (f10 <= this.f54170g && f10 >= this.h) {
                                ThreadLocal threadLocal = a.f54151f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new a());
                                }
                                a aVar = (a) threadLocal.get();
                                ArrayList arrayList = aVar.f54153b;
                                if (arrayList.size() == 0) {
                                    if (aVar.d == null) {
                                        aVar.d = new hy0(aVar.f54154c);
                                    }
                                    hy0 hy0Var = aVar.d;
                                    ((Choreographer) hy0Var.f46529c).postFrameCallback((wy0) hy0Var.d);
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
        this.f54175m = null;
        this.f54176n = Float.MAX_VALUE;
        this.f54175m = new h(f10);
    }

    public g(f fVar) {
        this.f54165a = 0.0f;
        this.f54166b = Float.MAX_VALUE;
        this.f54167c = false;
        this.f54169f = false;
        this.f54170g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f54171i = 0L;
        this.f54173k = new ArrayList();
        this.f54174l = new ArrayList();
        this.d = null;
        this.f54168e = new c6(fVar, 1);
        this.f54172j = 1.0f;
        this.f54175m = null;
        this.f54176n = Float.MAX_VALUE;
    }

    public g(Object obj, e eVar, int i7) {
        this.f54165a = 0.0f;
        this.f54166b = Float.MAX_VALUE;
        this.f54167c = false;
        this.f54169f = false;
        this.f54170g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f54171i = 0L;
        this.f54173k = new ArrayList();
        this.f54174l = new ArrayList();
        this.d = obj;
        this.f54168e = eVar;
        if (eVar != f54162s && eVar != f54163t && eVar != f54164u) {
            if (eVar == v) {
                this.f54172j = 0.00390625f;
                return;
            } else if (eVar != f54160q && eVar != f54161r) {
                this.f54172j = 1.0f;
                return;
            } else {
                this.f54172j = 0.00390625f;
                return;
            }
        }
        this.f54172j = 0.1f;
    }
}
