package r1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.ld0;
public final class g {
    public static final b f55731o = new b(1);
    public static final b f55732p = new b(2);
    public static final b f55733q = new b(3);
    public static final b f55734r = new b(4);
    public static final b f55735s = new b(5);
    public static final b f55736t = new b(6);
    public static final b f55737u = new b(7);
    public static final b v = new b(0);
    public float f55738a;
    public float f55739b;
    public boolean f55740c;
    public final Object d;
    public final e f55741e;
    public boolean f55742f;
    public float f55743g;
    public float h;
    public long f55744i;
    public float f55745j;
    public final ArrayList f55746k;
    public final ArrayList f55747l;
    public h f55748m;
    public float f55749n;

    public g(Object obj, e eVar) {
        this(obj, eVar, 0);
        this.f55748m = null;
        this.f55749n = Float.MAX_VALUE;
    }

    public final void a(c cVar) {
        ArrayList arrayList = this.f55746k;
        if (!arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
    }

    public final void b(d dVar) {
        if (!this.f55742f) {
            ArrayList arrayList = this.f55747l;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public final void c(float f10) {
        if (this.f55742f) {
            this.f55749n = f10;
            return;
        }
        if (this.f55748m == null) {
            this.f55748m = new h(f10);
        }
        this.f55748m.f55756i = f10;
        h();
    }

    public final void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f55742f) {
                e(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    public final void e(boolean z10) {
        ArrayList arrayList;
        int i7 = 0;
        this.f55742f = false;
        ThreadLocal threadLocal = a.f55724f;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        a aVar = (a) threadLocal.get();
        aVar.f55725a.remove(this);
        ArrayList arrayList2 = aVar.f55726b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            aVar.f55728e = true;
        }
        this.f55744i = 0L;
        this.f55740c = false;
        while (true) {
            arrayList = this.f55746k;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((c) arrayList.get(i7)).a(this, z10, this.f55739b, this.f55738a);
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
            this.f55745j = f10;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void g(float f10) {
        ArrayList arrayList;
        this.f55741e.b(this.d, f10);
        int i7 = 0;
        while (true) {
            arrayList = this.f55747l;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((d) arrayList.get(i7)).a(this, this.f55739b, this.f55738a);
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
        h hVar = this.f55748m;
        if (hVar != null) {
            double d = (float) hVar.f55756i;
            if (d <= this.f55743g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f55745j * 0.75f);
                    hVar.d = abs;
                    hVar.f55753e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f55742f;
                        if (!z10 && !z10) {
                            this.f55742f = true;
                            if (!this.f55740c) {
                                this.f55739b = this.f55741e.a(this.d);
                            }
                            float f10 = this.f55739b;
                            if (f10 <= this.f55743g && f10 >= this.h) {
                                ThreadLocal threadLocal = a.f55724f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new a());
                                }
                                a aVar = (a) threadLocal.get();
                                ArrayList arrayList = aVar.f55726b;
                                if (arrayList.size() == 0) {
                                    if (aVar.d == null) {
                                        aVar.d = new ld0(aVar.f55727c);
                                    }
                                    ld0 ld0Var = aVar.d;
                                    ((Choreographer) ld0Var.f48973c).postFrameCallback((zy0) ld0Var.d);
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
        this.f55748m = null;
        this.f55749n = Float.MAX_VALUE;
        this.f55748m = new h(f10);
    }

    public g(f fVar) {
        this.f55738a = 0.0f;
        this.f55739b = Float.MAX_VALUE;
        this.f55740c = false;
        this.f55742f = false;
        this.f55743g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f55744i = 0L;
        this.f55746k = new ArrayList();
        this.f55747l = new ArrayList();
        this.d = null;
        this.f55741e = new a6(fVar, 1);
        this.f55745j = 1.0f;
        this.f55748m = null;
        this.f55749n = Float.MAX_VALUE;
    }

    public g(Object obj, e eVar, int i7) {
        this.f55738a = 0.0f;
        this.f55739b = Float.MAX_VALUE;
        this.f55740c = false;
        this.f55742f = false;
        this.f55743g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f55744i = 0L;
        this.f55746k = new ArrayList();
        this.f55747l = new ArrayList();
        this.d = obj;
        this.f55741e = eVar;
        if (eVar != f55735s && eVar != f55736t && eVar != f55737u) {
            if (eVar == v) {
                this.f55745j = 0.00390625f;
                return;
            } else if (eVar != f55733q && eVar != f55734r) {
                this.f55745j = 1.0f;
                return;
            } else {
                this.f55745j = 0.00390625f;
                return;
            }
        }
        this.f55745j = 0.1f;
    }
}
