package r1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.ky0;
public final class g {
    public static final b f54263o = new b(1);
    public static final b f54264p = new b(2);
    public static final b f54265q = new b(3);
    public static final b f54266r = new b(4);
    public static final b f54267s = new b(5);
    public static final b f54268t = new b(6);
    public static final b f54269u = new b(7);
    public static final b v = new b(0);
    public float f54270a;
    public float f54271b;
    public boolean f54272c;
    public final Object d;
    public final e f54273e;
    public boolean f54274f;
    public float f54275g;
    public float h;
    public long f54276i;
    public float f54277j;
    public final ArrayList f54278k;
    public final ArrayList f54279l;
    public h f54280m;
    public float f54281n;

    public g(Object obj, e eVar) {
        this(obj, eVar, 0);
        this.f54280m = null;
        this.f54281n = Float.MAX_VALUE;
    }

    public final void a(c cVar) {
        ArrayList arrayList = this.f54278k;
        if (!arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
    }

    public final void b(d dVar) {
        if (!this.f54274f) {
            ArrayList arrayList = this.f54279l;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public final void c(float f10) {
        if (this.f54274f) {
            this.f54281n = f10;
            return;
        }
        if (this.f54280m == null) {
            this.f54280m = new h(f10);
        }
        this.f54280m.f54288i = f10;
        h();
    }

    public final void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f54274f) {
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
        this.f54274f = false;
        ThreadLocal threadLocal = a.f54256f;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        a aVar = (a) threadLocal.get();
        aVar.f54257a.remove(this);
        ArrayList arrayList2 = aVar.f54258b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            aVar.f54260e = true;
        }
        this.f54276i = 0L;
        this.f54272c = false;
        while (true) {
            arrayList = this.f54278k;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((c) arrayList.get(i7)).a(this, z9, this.f54271b, this.f54270a);
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
            this.f54277j = f10;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void g(float f10) {
        ArrayList arrayList;
        this.f54273e.b(this.d, f10);
        int i7 = 0;
        while (true) {
            arrayList = this.f54279l;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((d) arrayList.get(i7)).a(this, this.f54271b, this.f54270a);
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
        h hVar = this.f54280m;
        if (hVar != null) {
            double d = (float) hVar.f54288i;
            if (d <= this.f54275g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f54277j * 0.75f);
                    hVar.d = abs;
                    hVar.f54285e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z9 = this.f54274f;
                        if (!z9 && !z9) {
                            this.f54274f = true;
                            if (!this.f54272c) {
                                this.f54271b = this.f54273e.a(this.d);
                            }
                            float f10 = this.f54271b;
                            if (f10 <= this.f54275g && f10 >= this.h) {
                                ThreadLocal threadLocal = a.f54256f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new a());
                                }
                                a aVar = (a) threadLocal.get();
                                ArrayList arrayList = aVar.f54258b;
                                if (arrayList.size() == 0) {
                                    if (aVar.d == null) {
                                        aVar.d = new ky0(aVar.f54259c);
                                    }
                                    ky0 ky0Var = aVar.d;
                                    ((Choreographer) ky0Var.f47423c).postFrameCallback((yy0) ky0Var.d);
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
        this.f54280m = null;
        this.f54281n = Float.MAX_VALUE;
        this.f54280m = new h(f10);
    }

    public g(f fVar) {
        this.f54270a = 0.0f;
        this.f54271b = Float.MAX_VALUE;
        this.f54272c = false;
        this.f54274f = false;
        this.f54275g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f54276i = 0L;
        this.f54278k = new ArrayList();
        this.f54279l = new ArrayList();
        this.d = null;
        this.f54273e = new c6(fVar, 1);
        this.f54277j = 1.0f;
        this.f54280m = null;
        this.f54281n = Float.MAX_VALUE;
    }

    public g(Object obj, e eVar, int i7) {
        this.f54270a = 0.0f;
        this.f54271b = Float.MAX_VALUE;
        this.f54272c = false;
        this.f54274f = false;
        this.f54275g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f54276i = 0L;
        this.f54278k = new ArrayList();
        this.f54279l = new ArrayList();
        this.d = obj;
        this.f54273e = eVar;
        if (eVar != f54267s && eVar != f54268t && eVar != f54269u) {
            if (eVar == v) {
                this.f54277j = 0.00390625f;
                return;
            } else if (eVar != f54265q && eVar != f54266r) {
                this.f54277j = 1.0f;
                return;
            } else {
                this.f54277j = 0.00390625f;
                return;
            }
        }
        this.f54277j = 0.1f;
    }
}
