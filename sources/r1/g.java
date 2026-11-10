package r1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.ly0;
public final class g {
    public static final b f54262o = new b(1);
    public static final b f54263p = new b(2);
    public static final b f54264q = new b(3);
    public static final b f54265r = new b(4);
    public static final b f54266s = new b(5);
    public static final b f54267t = new b(6);
    public static final b f54268u = new b(7);
    public static final b v = new b(0);
    public float f54269a;
    public float f54270b;
    public boolean f54271c;
    public final Object d;
    public final e f54272e;
    public boolean f54273f;
    public float f54274g;
    public float h;
    public long f54275i;
    public float f54276j;
    public final ArrayList f54277k;
    public final ArrayList f54278l;
    public h f54279m;
    public float f54280n;

    public g(Object obj, e eVar) {
        this(obj, eVar, 0);
        this.f54279m = null;
        this.f54280n = Float.MAX_VALUE;
    }

    public final void a(c cVar) {
        ArrayList arrayList = this.f54277k;
        if (!arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
    }

    public final void b(d dVar) {
        if (!this.f54273f) {
            ArrayList arrayList = this.f54278l;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public final void c(float f10) {
        if (this.f54273f) {
            this.f54280n = f10;
            return;
        }
        if (this.f54279m == null) {
            this.f54279m = new h(f10);
        }
        this.f54279m.f54287i = f10;
        h();
    }

    public final void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f54273f) {
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
        this.f54273f = false;
        ThreadLocal threadLocal = a.f54255f;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        a aVar = (a) threadLocal.get();
        aVar.f54256a.remove(this);
        ArrayList arrayList2 = aVar.f54257b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            aVar.f54259e = true;
        }
        this.f54275i = 0L;
        this.f54271c = false;
        while (true) {
            arrayList = this.f54277k;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((c) arrayList.get(i7)).a(this, z9, this.f54270b, this.f54269a);
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
            this.f54276j = f10;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void g(float f10) {
        ArrayList arrayList;
        this.f54272e.b(this.d, f10);
        int i7 = 0;
        while (true) {
            arrayList = this.f54278l;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((d) arrayList.get(i7)).a(this, this.f54270b, this.f54269a);
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
        h hVar = this.f54279m;
        if (hVar != null) {
            double d = (float) hVar.f54287i;
            if (d <= this.f54274g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f54276j * 0.75f);
                    hVar.d = abs;
                    hVar.f54284e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z9 = this.f54273f;
                        if (!z9 && !z9) {
                            this.f54273f = true;
                            if (!this.f54271c) {
                                this.f54270b = this.f54272e.a(this.d);
                            }
                            float f10 = this.f54270b;
                            if (f10 <= this.f54274g && f10 >= this.h) {
                                ThreadLocal threadLocal = a.f54255f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new a());
                                }
                                a aVar = (a) threadLocal.get();
                                ArrayList arrayList = aVar.f54257b;
                                if (arrayList.size() == 0) {
                                    if (aVar.d == null) {
                                        aVar.d = new ly0(aVar.f54258c);
                                    }
                                    ly0 ly0Var = aVar.d;
                                    ((Choreographer) ly0Var.f47747c).postFrameCallback((xy0) ly0Var.d);
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
        this.f54279m = null;
        this.f54280n = Float.MAX_VALUE;
        this.f54279m = new h(f10);
    }

    public g(f fVar) {
        this.f54269a = 0.0f;
        this.f54270b = Float.MAX_VALUE;
        this.f54271c = false;
        this.f54273f = false;
        this.f54274g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f54275i = 0L;
        this.f54277k = new ArrayList();
        this.f54278l = new ArrayList();
        this.d = null;
        this.f54272e = new b6(fVar, 1);
        this.f54276j = 1.0f;
        this.f54279m = null;
        this.f54280n = Float.MAX_VALUE;
    }

    public g(Object obj, e eVar, int i7) {
        this.f54269a = 0.0f;
        this.f54270b = Float.MAX_VALUE;
        this.f54271c = false;
        this.f54273f = false;
        this.f54274g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f54275i = 0L;
        this.f54277k = new ArrayList();
        this.f54278l = new ArrayList();
        this.d = obj;
        this.f54272e = eVar;
        if (eVar != f54266s && eVar != f54267t && eVar != f54268u) {
            if (eVar == v) {
                this.f54276j = 0.00390625f;
                return;
            } else if (eVar != f54264q && eVar != f54265r) {
                this.f54276j = 1.0f;
                return;
            } else {
                this.f54276j = 0.00390625f;
                return;
            }
        }
        this.f54276j = 0.1f;
    }
}
