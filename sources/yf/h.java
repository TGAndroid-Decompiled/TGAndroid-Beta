package yf;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;
public final class h implements Choreographer.FrameCallback {
    public static final long[] f50997s;
    public static h v;
    public final Choreographer f50998a;
    public final LinkedHashSet f50999b;
    public final SparseArray f51000c;
    public final pe.b d;
    public final pe.b f51001e;
    public final pe.b f51002f;
    public long h;
    public long f51003n;
    public int f51004r;

    static {
        boolean z10;
        int i10;
        long j3;
        int i11 = 60;
        long[] jArr = new long[60];
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i12 + 1;
            int i14 = 2;
            int i15 = 1;
            for (int i16 = 2; i16 <= i11; i16++) {
                if (i11 % i16 == 0 && Math.abs(i16 - i13) < Math.abs(i15 - i13)) {
                    i15 = i16;
                }
            }
            int i17 = i11 / i15;
            long j10 = 0;
            for (int i18 = 0; i18 < i11; i18 += i17) {
                j10 |= 1 << i18;
            }
            int i19 = i13 - i15;
            int abs = Math.abs(i19);
            int i20 = 0;
            while (i20 < abs) {
                int i21 = (((i20 * 2) + 1) * 60) / (abs * 2);
                int i22 = 0;
                while (i22 < i11) {
                    int i23 = 0;
                    while (i23 < i14) {
                        if (i23 == 0) {
                            i10 = i22;
                        } else {
                            i10 = -i22;
                        }
                        int i24 = ((i21 + i10) + 60) % 60;
                        long j11 = 1 << i24;
                        if (i19 > 0) {
                            if ((j10 & j11) == 0 && (i17 % 2 != 0 || i24 % 2 != 0)) {
                                j3 = j11 | j10;
                                j10 = j3;
                                z10 = true;
                                break;
                            }
                            i23++;
                            i14 = 2;
                        } else if ((j10 & j11) == 0) {
                            i23++;
                            i14 = 2;
                        } else {
                            j3 = (~j11) & j10;
                            j10 = j3;
                            z10 = true;
                            break;
                        }
                    }
                    z10 = false;
                    if (z10) {
                        break;
                    }
                    i22++;
                    i11 = 60;
                    i14 = 2;
                }
                i20++;
                i11 = 60;
                i14 = 2;
            }
            jArr[i12] = j10;
            i12 = i13;
            i11 = 60;
        }
        f50997s = jArr;
    }

    public h() {
        Choreographer choreographer = Choreographer.getInstance();
        this.f50998a = choreographer;
        this.f50999b = new LinkedHashSet();
        this.f51000c = new SparseArray();
        this.d = new pe.b();
        this.f51001e = new pe.b();
        this.f51002f = new pe.b();
        choreographer.postFrameCallback(this);
    }

    public static void c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Choreographer60FpsContent must be used on the main thread");
    }

    public static h d() {
        c();
        if (v == null) {
            v = new h();
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
        e(max).f50992c.add(runnable);
    }

    public final void b(g gVar, int i10) {
        c();
        int max = Math.max(1, Math.min(i10, 60));
        g(gVar);
        e(max).f50991b.add(gVar);
    }

    @Override
    public final void doFrame(long j3) {
        long j10 = this.f51003n;
        if (j10 == 0) {
            this.f51003n = j3;
        } else {
            long j11 = (j3 - j10) + this.h;
            this.h = j11;
            this.f51003n = j3;
            if (j11 >= 16666666) {
                this.h = j11 % 16666666;
                long j12 = 1 << this.f51004r;
                int i10 = 0;
                while (true) {
                    SparseArray sparseArray = this.f51000c;
                    if (i10 >= sparseArray.size()) {
                        break;
                    }
                    f fVar = (f) sparseArray.valueAt(i10);
                    if ((fVar.f50990a & j12) != 0) {
                        pe.b bVar = fVar.d;
                        if (bVar != null) {
                            fVar.d = null;
                            Iterator it = bVar.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                        }
                        Iterator it2 = fVar.f50991b.iterator();
                        while (it2.hasNext()) {
                            ((g) it2.next()).doFrame(j3);
                        }
                        Iterator it3 = fVar.f50992c.iterator();
                        while (it3.hasNext()) {
                            ((Runnable) it3.next()).run();
                        }
                    }
                    i10++;
                }
                LinkedHashSet<g> linkedHashSet = this.f50999b;
                for (g gVar : linkedHashSet) {
                    gVar.doFrame(j3);
                }
                pe.b bVar2 = this.f51002f;
                Iterator it4 = bVar2.iterator();
                while (it4.hasNext()) {
                    ((View) it4.next()).invalidate();
                }
                pe.b bVar3 = this.d;
                Iterator it5 = bVar3.iterator();
                while (it5.hasNext()) {
                    ((Drawable) it5.next()).invalidateSelf();
                }
                bVar2.clear();
                bVar3.clear();
                linkedHashSet.clear();
                if (this.f51004r % 2 == 0) {
                    pe.b bVar4 = this.f51001e;
                    Iterator it6 = bVar4.iterator();
                    while (it6.hasNext()) {
                        ((Drawable) it6.next()).invalidateSelf();
                    }
                    bVar4.clear();
                }
                int i11 = this.f51004r + 1;
                this.f51004r = i11;
                if (i11 == 60) {
                    this.f51004r = 0;
                }
            }
        }
        this.f50998a.postFrameCallback(this);
    }

    public final f e(int i10) {
        int max = Math.max(1, Math.min(i10, 60));
        SparseArray sparseArray = this.f51000c;
        f fVar = (f) sparseArray.get(max);
        if (fVar == null) {
            f fVar2 = new f(f50997s[max - 1]);
            sparseArray.put(max, fVar2);
            return fVar2;
        }
        return fVar;
    }

    public final void f(Runnable runnable) {
        c();
        if (runnable != null) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f51000c;
                if (i10 < sparseArray.size() && !((f) sparseArray.valueAt(i10)).f50992c.remove(runnable)) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void g(g gVar) {
        c();
        if (gVar != null) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f51000c;
                if (i10 < sparseArray.size() && !((f) sparseArray.valueAt(i10)).f50991b.remove(gVar)) {
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
                SparseArray sparseArray = this.f51000c;
                if (i10 < sparseArray.size()) {
                    pe.b bVar = ((f) sparseArray.valueAt(i10)).d;
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
