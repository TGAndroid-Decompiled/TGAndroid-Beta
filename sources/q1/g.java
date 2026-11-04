package q1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.wy0;
public final class g {
    public static final b f53636o = new b(1);
    public static final b f53637p = new b(2);
    public static final b f53638q = new b(3);
    public static final b f53639r = new b(4);
    public static final b f53640s = new b(5);
    public static final b f53641t = new b(6);
    public static final b f53642u = new b(7);
    public static final b v = new b(0);
    public float f53643a;
    public float f53644b;
    public boolean f53645c;
    public final Object d;
    public final e f53646e;
    public boolean f53647f;
    public float f53648g;
    public float h;
    public long f53649i;
    public float f53650j;
    public final ArrayList f53651k;
    public final ArrayList f53652l;
    public h f53653m;
    public float f53654n;

    public g(Object obj, e eVar) {
        this(obj, eVar, 0);
        this.f53653m = null;
        this.f53654n = Float.MAX_VALUE;
    }

    public final void a(c cVar) {
        ArrayList arrayList = this.f53651k;
        if (!arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
    }

    public final void b(d dVar) {
        if (!this.f53647f) {
            ArrayList arrayList = this.f53652l;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public final void c(float f10) {
        if (this.f53647f) {
            this.f53654n = f10;
            return;
        }
        if (this.f53653m == null) {
            this.f53653m = new h(f10);
        }
        this.f53653m.f53661i = f10;
        h();
    }

    public final void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f53647f) {
                e(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    public final void e(boolean z10) {
        ArrayList arrayList;
        int i3 = 0;
        this.f53647f = false;
        ThreadLocal threadLocal = a.f53629f;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        a aVar = (a) threadLocal.get();
        aVar.f53630a.remove(this);
        ArrayList arrayList2 = aVar.f53631b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            aVar.f53633e = true;
        }
        this.f53649i = 0L;
        this.f53645c = false;
        while (true) {
            arrayList = this.f53651k;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i3) != null) {
                ((c) arrayList.get(i3)).a(this, z10, this.f53644b, this.f53643a);
            }
            i3++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void f(float f10) {
        if (f10 > 0.0f) {
            this.f53650j = f10;
            return;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void g(float f10) {
        ArrayList arrayList;
        this.f53646e.b(this.d, f10);
        int i3 = 0;
        while (true) {
            arrayList = this.f53652l;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i3) != null) {
                ((d) arrayList.get(i3)).a(this, this.f53644b, this.f53643a);
            }
            i3++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void h() {
        h hVar = this.f53653m;
        if (hVar != null) {
            double d = (float) hVar.f53661i;
            if (d <= this.f53648g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f53650j * 0.75f);
                    hVar.d = abs;
                    hVar.f53658e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f53647f;
                        if (!z10 && !z10) {
                            this.f53647f = true;
                            if (!this.f53645c) {
                                this.f53644b = this.f53646e.a(this.d);
                            }
                            float f10 = this.f53644b;
                            if (f10 <= this.f53648g && f10 >= this.h) {
                                ThreadLocal threadLocal = a.f53629f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new a());
                                }
                                a aVar = (a) threadLocal.get();
                                ArrayList arrayList = aVar.f53631b;
                                if (arrayList.size() == 0) {
                                    if (aVar.d == null) {
                                        aVar.d = new p7.d(aVar.f53632c);
                                    }
                                    p7.d dVar = aVar.d;
                                    ((Choreographer) dVar.d).postFrameCallback((wy0) dVar.f53346c);
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
        this.f53653m = null;
        this.f53654n = Float.MAX_VALUE;
        this.f53653m = new h(f10);
    }

    public g(f fVar) {
        this.f53643a = 0.0f;
        this.f53644b = Float.MAX_VALUE;
        this.f53645c = false;
        this.f53647f = false;
        this.f53648g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f53649i = 0L;
        this.f53651k = new ArrayList();
        this.f53652l = new ArrayList();
        this.d = null;
        this.f53646e = new a6(fVar, 1);
        this.f53650j = 1.0f;
        this.f53653m = null;
        this.f53654n = Float.MAX_VALUE;
    }

    public g(Object obj, e eVar, int i3) {
        this.f53643a = 0.0f;
        this.f53644b = Float.MAX_VALUE;
        this.f53645c = false;
        this.f53647f = false;
        this.f53648g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.f53649i = 0L;
        this.f53651k = new ArrayList();
        this.f53652l = new ArrayList();
        this.d = obj;
        this.f53646e = eVar;
        if (eVar != f53640s && eVar != f53641t && eVar != f53642u) {
            if (eVar == v) {
                this.f53650j = 0.00390625f;
                return;
            } else if (eVar != f53638q && eVar != f53639r) {
                this.f53650j = 1.0f;
                return;
            } else {
                this.f53650j = 0.00390625f;
                return;
            }
        }
        this.f53650j = 0.1f;
    }
}
