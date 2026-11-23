package r1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.md0;
public final class g {
    public static final b f56316o = new b(1);
    public static final b f56317p = new b(2);
    public static final b f56318q = new b(3);
    public static final b f56319r = new b(4);
    public static final b f56320s = new b(5);
    public static final b f56321t = new b(6);
    public static final b f56322u = new b(7);
    public static final b v = new b(0);
    public float f56323a;
    public float f56324b;
    public boolean f56325c;
    public final Object d;
    public final e f56326e;
    public boolean f56327f;
    public float f56328g;
    public float h;
    public long f56329i;
    public float f56330j;
    public final ArrayList f56331k;
    public final ArrayList f56332l;
    public h f56333m;
    public float f56334n;

    public g(Object obj, e eVar) {
        this(obj, eVar, 0);
        this.f56333m = null;
        this.f56334n = Float.MAX_VALUE;
    }

    public final void a(c cVar) {
        ArrayList arrayList = this.f56331k;
        if (!arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
    }

    public final void b(d dVar) {
        if (!this.f56327f) {
            ArrayList arrayList = this.f56332l;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public final void c(float f10) {
        if (this.f56327f) {
            this.f56334n = f10;
            return;
        }
        if (this.f56333m == null) {
            this.f56333m = new h(f10);
        }
        this.f56333m.f56341i = f10;
        h();
    }

    public final void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f56327f) {
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
        this.f56327f = false;
        ThreadLocal threadLocal = a.f56309f;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        a aVar = (a) threadLocal.get();
        aVar.f56310a.remove(this);
        ArrayList arrayList2 = aVar.f56311b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            aVar.f56313e = true;
        }
        this.f56329i = 0L;
        this.f56325c = false;
        while (true) {
            arrayList = this.f56331k;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((c) arrayList.get(i7)).a(this, z10, this.f56324b, this.f56323a);
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
            this.f56330j = f10;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void g(float f10) {
        ArrayList arrayList;
        this.f56326e.b(this.d, f10);
        int i7 = 0;
        while (true) {
            arrayList = this.f56332l;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((d) arrayList.get(i7)).a(this, this.f56324b, this.f56323a);
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
        h hVar = this.f56333m;
        if (hVar != null) {
            double d = (float) hVar.f56341i;
            if (d <= this.f56328g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f56330j * 0.75f);
                    hVar.d = abs;
                    hVar.f56338e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f56327f;
                        if (!z10 && !z10) {
                            this.f56327f = true;
                            if (!this.f56325c) {
                                this.f56324b = this.f56326e.a(this.d);
                            }
                            float f10 = this.f56324b;
                            if (f10 <= this.f56328g && f10 >= this.h) {
                                ThreadLocal threadLocal = a.f56309f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new a());
                                }
                                a aVar = (a) threadLocal.get();
                                ArrayList arrayList = aVar.f56311b;
                                if (arrayList.size() == 0) {
                                    if (aVar.d == null) {
                                        aVar.d = new md0(aVar.f56312c);
                                    }
                                    md0 md0Var = aVar.d;
                                    ((Choreographer) md0Var.f49831c).postFrameCallback((iz0) md0Var.d);
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
        this.f56333m = null;
        this.f56334n = Float.MAX_VALUE;
        this.f56333m = new h(f10);
    }

    public g(f fVar) {
        this.f56323a = 0.0f;
        this.f56324b = Float.MAX_VALUE;
        this.f56325c = false;
        this.f56327f = false;
        this.f56328g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f56329i = 0L;
        this.f56331k = new ArrayList();
        this.f56332l = new ArrayList();
        this.d = null;
        this.f56326e = new i6(fVar, 1);
        this.f56330j = 1.0f;
        this.f56333m = null;
        this.f56334n = Float.MAX_VALUE;
    }

    public g(Object obj, e eVar, int i7) {
        this.f56323a = 0.0f;
        this.f56324b = Float.MAX_VALUE;
        this.f56325c = false;
        this.f56327f = false;
        this.f56328g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f56329i = 0L;
        this.f56331k = new ArrayList();
        this.f56332l = new ArrayList();
        this.d = obj;
        this.f56326e = eVar;
        if (eVar != f56320s && eVar != f56321t && eVar != f56322u) {
            if (eVar == v) {
                this.f56330j = 0.00390625f;
                return;
            } else if (eVar != f56318q && eVar != f56319r) {
                this.f56330j = 1.0f;
                return;
            } else {
                this.f56330j = 0.00390625f;
                return;
            }
        }
        this.f56330j = 0.1f;
    }
}
