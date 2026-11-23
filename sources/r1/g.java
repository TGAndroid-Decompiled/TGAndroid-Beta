package r1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.i61;
public final class g {
    public static final b f56429o = new b(1);
    public static final b f56430p = new b(2);
    public static final b f56431q = new b(3);
    public static final b f56432r = new b(4);
    public static final b f56433s = new b(5);
    public static final b f56434t = new b(6);
    public static final b f56435u = new b(7);
    public static final b v = new b(0);
    public float f56436a;
    public float f56437b;
    public boolean f56438c;
    public final Object d;
    public final e f56439e;
    public boolean f56440f;
    public float f56441g;
    public float h;
    public long f56442i;
    public float f56443j;
    public final ArrayList f56444k;
    public final ArrayList f56445l;
    public h f56446m;
    public float f56447n;

    public g(Object obj, e eVar) {
        this(obj, eVar, 0);
        this.f56446m = null;
        this.f56447n = Float.MAX_VALUE;
    }

    public final void a(c cVar) {
        ArrayList arrayList = this.f56444k;
        if (!arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
    }

    public final void b(d dVar) {
        if (!this.f56440f) {
            ArrayList arrayList = this.f56445l;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public final void c(float f10) {
        if (this.f56440f) {
            this.f56447n = f10;
            return;
        }
        if (this.f56446m == null) {
            this.f56446m = new h(f10);
        }
        this.f56446m.f56454i = f10;
        h();
    }

    public final void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f56440f) {
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
        this.f56440f = false;
        ThreadLocal threadLocal = a.f56422f;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        a aVar = (a) threadLocal.get();
        aVar.f56423a.remove(this);
        ArrayList arrayList2 = aVar.f56424b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            aVar.f56426e = true;
        }
        this.f56442i = 0L;
        this.f56438c = false;
        while (true) {
            arrayList = this.f56444k;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((c) arrayList.get(i7)).a(this, z10, this.f56437b, this.f56436a);
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
            this.f56443j = f10;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void g(float f10) {
        ArrayList arrayList;
        this.f56439e.b(this.d, f10);
        int i7 = 0;
        while (true) {
            arrayList = this.f56445l;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((d) arrayList.get(i7)).a(this, this.f56437b, this.f56436a);
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
        h hVar = this.f56446m;
        if (hVar != null) {
            double d = (float) hVar.f56454i;
            if (d <= this.f56441g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f56443j * 0.75f);
                    hVar.d = abs;
                    hVar.f56451e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f56440f;
                        if (!z10 && !z10) {
                            this.f56440f = true;
                            if (!this.f56438c) {
                                this.f56437b = this.f56439e.a(this.d);
                            }
                            float f10 = this.f56437b;
                            if (f10 <= this.f56441g && f10 >= this.h) {
                                ThreadLocal threadLocal = a.f56422f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new a());
                                }
                                a aVar = (a) threadLocal.get();
                                ArrayList arrayList = aVar.f56424b;
                                if (arrayList.size() == 0) {
                                    if (aVar.d == null) {
                                        aVar.d = new i61(aVar.f56425c);
                                    }
                                    i61 i61Var = aVar.d;
                                    ((Choreographer) i61Var.f35959c).postFrameCallback((hz0) i61Var.d);
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
        this.f56446m = null;
        this.f56447n = Float.MAX_VALUE;
        this.f56446m = new h(f10);
    }

    public g(f fVar) {
        this.f56436a = 0.0f;
        this.f56437b = Float.MAX_VALUE;
        this.f56438c = false;
        this.f56440f = false;
        this.f56441g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f56442i = 0L;
        this.f56444k = new ArrayList();
        this.f56445l = new ArrayList();
        this.d = null;
        this.f56439e = new h6(fVar, 1);
        this.f56443j = 1.0f;
        this.f56446m = null;
        this.f56447n = Float.MAX_VALUE;
    }

    public g(Object obj, e eVar, int i7) {
        this.f56436a = 0.0f;
        this.f56437b = Float.MAX_VALUE;
        this.f56438c = false;
        this.f56440f = false;
        this.f56441g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f56442i = 0L;
        this.f56444k = new ArrayList();
        this.f56445l = new ArrayList();
        this.d = obj;
        this.f56439e = eVar;
        if (eVar != f56433s && eVar != f56434t && eVar != f56435u) {
            if (eVar == v) {
                this.f56443j = 0.00390625f;
                return;
            } else if (eVar != f56431q && eVar != f56432r) {
                this.f56443j = 1.0f;
                return;
            } else {
                this.f56443j = 0.00390625f;
                return;
            }
        }
        this.f56443j = 0.1f;
    }
}
