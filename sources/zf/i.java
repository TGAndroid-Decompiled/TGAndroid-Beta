package zf;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;
public final class i implements Choreographer.FrameCallback {
    public static final long[] f50183s;
    public static i v;
    public final Choreographer f50184a;
    public final LinkedHashSet f50185b;
    public final SparseArray f50186c;
    public final re.b d;
    public final re.b e;
    public final re.b f50187f;
    public long h;
    public long f50188n;
    public int f50189r;

    static {
        int i10;
        boolean z10;
        int i11;
        long j10;
        int i12 = 60;
        long[] jArr = new long[60];
        int i13 = 0;
        while (i13 < i12) {
            int i14 = i13 + 1;
            int i15 = 2;
            int i16 = 1;
            for (int i17 = 2; i17 <= i12; i17++) {
                if (i12 % i17 == 0 && Math.abs(i17 - i14) < Math.abs(i16 - i14)) {
                    i16 = i17;
                }
            }
            int i18 = i12 / i16;
            long j11 = 0;
            for (int i19 = 0; i19 < i12; i19 += i18) {
                j11 |= 1 << i19;
            }
            int i20 = i14 - i16;
            int abs = Math.abs(i20);
            int i21 = 0;
            while (i21 < abs) {
                int i22 = (((i21 * 2) + 1) * 60) / (abs * 2);
                int i23 = 0;
                while (true) {
                    i10 = i12;
                    if (i23 < i12) {
                        int i24 = 0;
                        while (i24 < i15) {
                            if (i24 == 0) {
                                i11 = i23;
                            } else {
                                i11 = -i23;
                            }
                            int i25 = ((i22 + i11) + 60) % 60;
                            long j12 = 1 << i25;
                            if (i20 > 0) {
                                if ((j11 & j12) == 0 && (i18 % 2 != 0 || i25 % 2 != 0)) {
                                    j10 = j12 | j11;
                                    j11 = j10;
                                    z10 = true;
                                    break;
                                }
                                i24++;
                                i15 = 2;
                            } else if ((j11 & j12) == 0) {
                                i24++;
                                i15 = 2;
                            } else {
                                j10 = (~j12) & j11;
                                j11 = j10;
                                z10 = true;
                                break;
                            }
                        }
                        z10 = false;
                        if (z10) {
                            break;
                        }
                        i23++;
                        i12 = i10;
                        i15 = 2;
                    }
                }
                i21++;
                i12 = i10;
                i15 = 2;
            }
            jArr[i13] = j11;
            i13 = i14;
        }
        f50183s = jArr;
    }

    public i() {
        Choreographer choreographer = Choreographer.getInstance();
        this.f50184a = choreographer;
        this.f50185b = new LinkedHashSet();
        this.f50186c = new SparseArray();
        this.d = new re.b();
        this.e = new re.b();
        this.f50187f = new re.b();
        choreographer.postFrameCallback(this);
    }

    public static void c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Choreographer60FpsContent must be used on the main thread");
    }

    public static i d() {
        c();
        if (v == null) {
            v = new i();
        }
        return v;
    }

    public final void a(int i10, Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int max = Math.max(1, Math.min(i10, 60));
        f(runnable);
        e(max).f50178c.add(runnable);
    }

    public final void b(h hVar, int i10) {
        c();
        int max = Math.max(1, Math.min(i10, 60));
        g(hVar);
        e(max).f50177b.add(hVar);
    }

    @Override
    public final void doFrame(long j10) {
        long j11 = this.f50188n;
        if (j11 == 0) {
            this.f50188n = j10;
        } else {
            long j12 = (j10 - j11) + this.h;
            this.h = j12;
            this.f50188n = j10;
            if (j12 >= 16666666) {
                this.h = j12 % 16666666;
                long j13 = 1 << this.f50189r;
                int i10 = 0;
                while (true) {
                    SparseArray sparseArray = this.f50186c;
                    if (i10 >= sparseArray.size()) {
                        break;
                    }
                    g gVar = (g) sparseArray.valueAt(i10);
                    if ((gVar.f50176a & j13) != 0) {
                        re.b bVar = gVar.d;
                        if (bVar != null) {
                            gVar.d = null;
                            Iterator it = bVar.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                        }
                        Iterator it2 = gVar.f50177b.iterator();
                        while (it2.hasNext()) {
                            ((h) it2.next()).doFrame(j10);
                        }
                        Iterator it3 = gVar.f50178c.iterator();
                        while (it3.hasNext()) {
                            ((Runnable) it3.next()).run();
                        }
                    }
                    i10++;
                }
                LinkedHashSet<h> linkedHashSet = this.f50185b;
                for (h hVar : linkedHashSet) {
                    hVar.doFrame(j10);
                }
                re.b bVar2 = this.f50187f;
                Iterator it4 = bVar2.iterator();
                while (it4.hasNext()) {
                    ((View) it4.next()).invalidate();
                }
                re.b bVar3 = this.d;
                Iterator it5 = bVar3.iterator();
                while (it5.hasNext()) {
                    ((Drawable) it5.next()).invalidateSelf();
                }
                bVar2.clear();
                bVar3.clear();
                linkedHashSet.clear();
                if (this.f50189r % 2 == 0) {
                    re.b bVar4 = this.e;
                    Iterator it6 = bVar4.iterator();
                    while (it6.hasNext()) {
                        ((Drawable) it6.next()).invalidateSelf();
                    }
                    bVar4.clear();
                }
                int i11 = this.f50189r + 1;
                this.f50189r = i11;
                if (i11 == 60) {
                    this.f50189r = 0;
                }
            }
        }
        this.f50184a.postFrameCallback(this);
    }

    public final g e(int i10) {
        int max = Math.max(1, Math.min(i10, 60));
        SparseArray sparseArray = this.f50186c;
        g gVar = (g) sparseArray.get(max);
        if (gVar == null) {
            g gVar2 = new g(f50183s[max - 1]);
            sparseArray.put(max, gVar2);
            return gVar2;
        }
        return gVar;
    }

    public final void f(Runnable runnable) {
        c();
        if (runnable != null) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f50186c;
                if (i10 < sparseArray.size() && !((g) sparseArray.valueAt(i10)).f50178c.remove(runnable)) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void g(h hVar) {
        c();
        if (hVar != null) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f50186c;
                if (i10 < sparseArray.size() && !((g) sparseArray.valueAt(i10)).f50177b.remove(hVar)) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void h(Runnable runnable) {
        c();
        if (runnable != null) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f50186c;
                if (i10 < sparseArray.size()) {
                    re.b bVar = ((g) sparseArray.valueAt(i10)).d;
                    if (bVar == null || !bVar.remove(runnable)) {
                        i10++;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
