package r1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.md0;
public final class g {
    public static final b f56351o = new b(1);
    public static final b f56352p = new b(2);
    public static final b f56353q = new b(3);
    public static final b f56354r = new b(4);
    public static final b f56355s = new b(5);
    public static final b f56356t = new b(6);
    public static final b f56357u = new b(7);
    public static final b v = new b(0);
    public float f56358a;
    public float f56359b;
    public boolean f56360c;
    public final Object d;
    public final e f56361e;
    public boolean f56362f;
    public float f56363g;
    public float h;
    public long f56364i;
    public float f56365j;
    public final ArrayList f56366k;
    public final ArrayList f56367l;
    public h f56368m;
    public float f56369n;

    public g(Object obj, e eVar) {
        this(obj, eVar, 0);
        this.f56368m = null;
        this.f56369n = Float.MAX_VALUE;
    }

    public final void a(c cVar) {
        ArrayList arrayList = this.f56366k;
        if (!arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
    }

    public final void b(d dVar) {
        if (!this.f56362f) {
            ArrayList arrayList = this.f56367l;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public final void c(float f10) {
        if (this.f56362f) {
            this.f56369n = f10;
            return;
        }
        if (this.f56368m == null) {
            this.f56368m = new h(f10);
        }
        this.f56368m.f56376i = f10;
        h();
    }

    public final void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f56362f) {
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
        this.f56362f = false;
        ThreadLocal threadLocal = a.f56344f;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        a aVar = (a) threadLocal.get();
        aVar.f56345a.remove(this);
        ArrayList arrayList2 = aVar.f56346b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            aVar.f56348e = true;
        }
        this.f56364i = 0L;
        this.f56360c = false;
        while (true) {
            arrayList = this.f56366k;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((c) arrayList.get(i7)).a(this, z10, this.f56359b, this.f56358a);
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
            this.f56365j = f10;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void g(float f10) {
        ArrayList arrayList;
        this.f56361e.b(this.d, f10);
        int i7 = 0;
        while (true) {
            arrayList = this.f56367l;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((d) arrayList.get(i7)).a(this, this.f56359b, this.f56358a);
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
        h hVar = this.f56368m;
        if (hVar != null) {
            double d = (float) hVar.f56376i;
            if (d <= this.f56363g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f56365j * 0.75f);
                    hVar.d = abs;
                    hVar.f56373e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f56362f;
                        if (!z10 && !z10) {
                            this.f56362f = true;
                            if (!this.f56360c) {
                                this.f56359b = this.f56361e.a(this.d);
                            }
                            float f10 = this.f56359b;
                            if (f10 <= this.f56363g && f10 >= this.h) {
                                ThreadLocal threadLocal = a.f56344f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new a());
                                }
                                a aVar = (a) threadLocal.get();
                                ArrayList arrayList = aVar.f56346b;
                                if (arrayList.size() == 0) {
                                    if (aVar.d == null) {
                                        aVar.d = new md0(aVar.f56347c);
                                    }
                                    md0 md0Var = aVar.d;
                                    ((Choreographer) md0Var.f49858c).postFrameCallback((iz0) md0Var.d);
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
        this.f56368m = null;
        this.f56369n = Float.MAX_VALUE;
        this.f56368m = new h(f10);
    }

    public g(f fVar) {
        this.f56358a = 0.0f;
        this.f56359b = Float.MAX_VALUE;
        this.f56360c = false;
        this.f56362f = false;
        this.f56363g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f56364i = 0L;
        this.f56366k = new ArrayList();
        this.f56367l = new ArrayList();
        this.d = null;
        this.f56361e = new i6(fVar, 1);
        this.f56365j = 1.0f;
        this.f56368m = null;
        this.f56369n = Float.MAX_VALUE;
    }

    public g(Object obj, e eVar, int i7) {
        this.f56358a = 0.0f;
        this.f56359b = Float.MAX_VALUE;
        this.f56360c = false;
        this.f56362f = false;
        this.f56363g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f56364i = 0L;
        this.f56366k = new ArrayList();
        this.f56367l = new ArrayList();
        this.d = obj;
        this.f56361e = eVar;
        if (eVar != f56355s && eVar != f56356t && eVar != f56357u) {
            if (eVar == v) {
                this.f56365j = 0.00390625f;
                return;
            } else if (eVar != f56353q && eVar != f56354r) {
                this.f56365j = 1.0f;
                return;
            } else {
                this.f56365j = 0.00390625f;
                return;
            }
        }
        this.f56365j = 0.1f;
    }
}
