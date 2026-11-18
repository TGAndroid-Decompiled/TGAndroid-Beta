package r1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.h6;
import org.telegram.ui.md0;
public final class g {
    public static final b f56306o = new b(1);
    public static final b f56307p = new b(2);
    public static final b f56308q = new b(3);
    public static final b f56309r = new b(4);
    public static final b f56310s = new b(5);
    public static final b f56311t = new b(6);
    public static final b f56312u = new b(7);
    public static final b v = new b(0);
    public float f56313a;
    public float f56314b;
    public boolean f56315c;
    public final Object d;
    public final e f56316e;
    public boolean f56317f;
    public float f56318g;
    public float h;
    public long f56319i;
    public float f56320j;
    public final ArrayList f56321k;
    public final ArrayList f56322l;
    public h f56323m;
    public float f56324n;

    public g(Object obj, e eVar) {
        this(obj, eVar, 0);
        this.f56323m = null;
        this.f56324n = Float.MAX_VALUE;
    }

    public final void a(c cVar) {
        ArrayList arrayList = this.f56321k;
        if (!arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
    }

    public final void b(d dVar) {
        if (!this.f56317f) {
            ArrayList arrayList = this.f56322l;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public final void c(float f10) {
        if (this.f56317f) {
            this.f56324n = f10;
            return;
        }
        if (this.f56323m == null) {
            this.f56323m = new h(f10);
        }
        this.f56323m.f56331i = f10;
        h();
    }

    public final void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f56317f) {
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
        this.f56317f = false;
        ThreadLocal threadLocal = a.f56299f;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        a aVar = (a) threadLocal.get();
        aVar.f56300a.remove(this);
        ArrayList arrayList2 = aVar.f56301b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            aVar.f56303e = true;
        }
        this.f56319i = 0L;
        this.f56315c = false;
        while (true) {
            arrayList = this.f56321k;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((c) arrayList.get(i7)).a(this, z10, this.f56314b, this.f56313a);
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
            this.f56320j = f10;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void g(float f10) {
        ArrayList arrayList;
        this.f56316e.b(this.d, f10);
        int i7 = 0;
        while (true) {
            arrayList = this.f56322l;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((d) arrayList.get(i7)).a(this, this.f56314b, this.f56313a);
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
        h hVar = this.f56323m;
        if (hVar != null) {
            double d = (float) hVar.f56331i;
            if (d <= this.f56318g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f56320j * 0.75f);
                    hVar.d = abs;
                    hVar.f56328e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f56317f;
                        if (!z10 && !z10) {
                            this.f56317f = true;
                            if (!this.f56315c) {
                                this.f56314b = this.f56316e.a(this.d);
                            }
                            float f10 = this.f56314b;
                            if (f10 <= this.f56318g && f10 >= this.h) {
                                ThreadLocal threadLocal = a.f56299f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new a());
                                }
                                a aVar = (a) threadLocal.get();
                                ArrayList arrayList = aVar.f56301b;
                                if (arrayList.size() == 0) {
                                    if (aVar.d == null) {
                                        aVar.d = new md0(aVar.f56302c);
                                    }
                                    md0 md0Var = aVar.d;
                                    ((Choreographer) md0Var.f49839c).postFrameCallback((gz0) md0Var.d);
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
        this.f56323m = null;
        this.f56324n = Float.MAX_VALUE;
        this.f56323m = new h(f10);
    }

    public g(f fVar) {
        this.f56313a = 0.0f;
        this.f56314b = Float.MAX_VALUE;
        this.f56315c = false;
        this.f56317f = false;
        this.f56318g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f56319i = 0L;
        this.f56321k = new ArrayList();
        this.f56322l = new ArrayList();
        this.d = null;
        this.f56316e = new h6(fVar, 1);
        this.f56320j = 1.0f;
        this.f56323m = null;
        this.f56324n = Float.MAX_VALUE;
    }

    public g(Object obj, e eVar, int i7) {
        this.f56313a = 0.0f;
        this.f56314b = Float.MAX_VALUE;
        this.f56315c = false;
        this.f56317f = false;
        this.f56318g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f56319i = 0L;
        this.f56321k = new ArrayList();
        this.f56322l = new ArrayList();
        this.d = obj;
        this.f56316e = eVar;
        if (eVar != f56310s && eVar != f56311t && eVar != f56312u) {
            if (eVar == v) {
                this.f56320j = 0.00390625f;
                return;
            } else if (eVar != f56308q && eVar != f56309r) {
                this.f56320j = 1.0f;
                return;
            } else {
                this.f56320j = 0.00390625f;
                return;
            }
        }
        this.f56320j = 0.1f;
    }
}
