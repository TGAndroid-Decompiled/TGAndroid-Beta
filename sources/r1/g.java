package r1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.md0;
public final class g {
    public static final b f56347o = new b(1);
    public static final b f56348p = new b(2);
    public static final b f56349q = new b(3);
    public static final b f56350r = new b(4);
    public static final b f56351s = new b(5);
    public static final b f56352t = new b(6);
    public static final b f56353u = new b(7);
    public static final b v = new b(0);
    public float f56354a;
    public float f56355b;
    public boolean f56356c;
    public final Object d;
    public final e f56357e;
    public boolean f56358f;
    public float f56359g;
    public float h;
    public long f56360i;
    public float f56361j;
    public final ArrayList f56362k;
    public final ArrayList f56363l;
    public h f56364m;
    public float f56365n;

    public g(Object obj, e eVar) {
        this(obj, eVar, 0);
        this.f56364m = null;
        this.f56365n = Float.MAX_VALUE;
    }

    public final void a(c cVar) {
        ArrayList arrayList = this.f56362k;
        if (!arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
    }

    public final void b(d dVar) {
        if (!this.f56358f) {
            ArrayList arrayList = this.f56363l;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public final void c(float f10) {
        if (this.f56358f) {
            this.f56365n = f10;
            return;
        }
        if (this.f56364m == null) {
            this.f56364m = new h(f10);
        }
        this.f56364m.f56372i = f10;
        h();
    }

    public final void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f56358f) {
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
        this.f56358f = false;
        ThreadLocal threadLocal = a.f56340f;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        a aVar = (a) threadLocal.get();
        aVar.f56341a.remove(this);
        ArrayList arrayList2 = aVar.f56342b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            aVar.f56344e = true;
        }
        this.f56360i = 0L;
        this.f56356c = false;
        while (true) {
            arrayList = this.f56362k;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((c) arrayList.get(i7)).a(this, z10, this.f56355b, this.f56354a);
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
            this.f56361j = f10;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void g(float f10) {
        ArrayList arrayList;
        this.f56357e.b(this.d, f10);
        int i7 = 0;
        while (true) {
            arrayList = this.f56363l;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((d) arrayList.get(i7)).a(this, this.f56355b, this.f56354a);
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
        h hVar = this.f56364m;
        if (hVar != null) {
            double d = (float) hVar.f56372i;
            if (d <= this.f56359g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f56361j * 0.75f);
                    hVar.d = abs;
                    hVar.f56369e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f56358f;
                        if (!z10 && !z10) {
                            this.f56358f = true;
                            if (!this.f56356c) {
                                this.f56355b = this.f56357e.a(this.d);
                            }
                            float f10 = this.f56355b;
                            if (f10 <= this.f56359g && f10 >= this.h) {
                                ThreadLocal threadLocal = a.f56340f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new a());
                                }
                                a aVar = (a) threadLocal.get();
                                ArrayList arrayList = aVar.f56342b;
                                if (arrayList.size() == 0) {
                                    if (aVar.d == null) {
                                        aVar.d = new md0(aVar.f56343c);
                                    }
                                    md0 md0Var = aVar.d;
                                    ((Choreographer) md0Var.f49854c).postFrameCallback((iz0) md0Var.d);
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
        this.f56364m = null;
        this.f56365n = Float.MAX_VALUE;
        this.f56364m = new h(f10);
    }

    public g(f fVar) {
        this.f56354a = 0.0f;
        this.f56355b = Float.MAX_VALUE;
        this.f56356c = false;
        this.f56358f = false;
        this.f56359g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f56360i = 0L;
        this.f56362k = new ArrayList();
        this.f56363l = new ArrayList();
        this.d = null;
        this.f56357e = new i6(fVar, 1);
        this.f56361j = 1.0f;
        this.f56364m = null;
        this.f56365n = Float.MAX_VALUE;
    }

    public g(Object obj, e eVar, int i7) {
        this.f56354a = 0.0f;
        this.f56355b = Float.MAX_VALUE;
        this.f56356c = false;
        this.f56358f = false;
        this.f56359g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f56360i = 0L;
        this.f56362k = new ArrayList();
        this.f56363l = new ArrayList();
        this.d = obj;
        this.f56357e = eVar;
        if (eVar != f56351s && eVar != f56352t && eVar != f56353u) {
            if (eVar == v) {
                this.f56361j = 0.00390625f;
                return;
            } else if (eVar != f56349q && eVar != f56350r) {
                this.f56361j = 1.0f;
                return;
            } else {
                this.f56361j = 0.00390625f;
                return;
            }
        }
        this.f56361j = 0.1f;
    }
}
