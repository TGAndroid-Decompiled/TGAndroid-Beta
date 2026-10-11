package yf;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;
public final class h implements Choreographer.FrameCallback {
    public static final long[] f52248s;
    public static h v;
    public final Choreographer f52249a;
    public final LinkedHashSet f52250b;
    public final SparseArray f52251c;
    public final qe.b d;
    public final qe.b f52252e;
    public final qe.b f52253f;
    public long h;
    public long f52254n;
    public int f52255r;

    static {
        int i10;
        boolean z10;
        int i11;
        long j3;
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
            long j10 = 0;
            for (int i19 = 0; i19 < i12; i19 += i18) {
                j10 |= 1 << i19;
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
                            long j11 = 1 << i25;
                            if (i20 > 0) {
                                if ((j10 & j11) == 0 && (i18 % 2 != 0 || i25 % 2 != 0)) {
                                    j3 = j11 | j10;
                                    j10 = j3;
                                    z10 = true;
                                    break;
                                }
                                i24++;
                                i15 = 2;
                            } else if ((j10 & j11) == 0) {
                                i24++;
                                i15 = 2;
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
                        i23++;
                        i12 = i10;
                        i15 = 2;
                    }
                }
                i21++;
                i12 = i10;
                i15 = 2;
            }
            jArr[i13] = j10;
            i13 = i14;
        }
        f52248s = jArr;
    }

    public h() {
        Choreographer choreographer = Choreographer.getInstance();
        this.f52249a = choreographer;
        this.f52250b = new LinkedHashSet();
        this.f52251c = new SparseArray();
        this.d = new qe.b();
        this.f52252e = new qe.b();
        this.f52253f = new qe.b();
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
        e(max).f52242c.add(runnable);
    }

    public final void b(g gVar, int i10) {
        c();
        int max = Math.max(1, Math.min(i10, 60));
        g(gVar);
        e(max).f52241b.add(gVar);
    }

    @Override
    public final void doFrame(long j3) {
        long j10 = this.f52254n;
        if (j10 == 0) {
            this.f52254n = j3;
        } else {
            long j11 = (j3 - j10) + this.h;
            this.h = j11;
            this.f52254n = j3;
            if (j11 >= 16666666) {
                this.h = j11 % 16666666;
                long j12 = 1 << this.f52255r;
                int i10 = 0;
                while (true) {
                    SparseArray sparseArray = this.f52251c;
                    if (i10 >= sparseArray.size()) {
                        break;
                    }
                    f fVar = (f) sparseArray.valueAt(i10);
                    if ((fVar.f52240a & j12) != 0) {
                        qe.b bVar = fVar.d;
                        if (bVar != null) {
                            fVar.d = null;
                            Iterator it = bVar.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                        }
                        Iterator it2 = fVar.f52241b.iterator();
                        while (it2.hasNext()) {
                            ((g) it2.next()).doFrame(j3);
                        }
                        Iterator it3 = fVar.f52242c.iterator();
                        while (it3.hasNext()) {
                            ((Runnable) it3.next()).run();
                        }
                    }
                    i10++;
                }
                LinkedHashSet<g> linkedHashSet = this.f52250b;
                for (g gVar : linkedHashSet) {
                    gVar.doFrame(j3);
                }
                qe.b bVar2 = this.f52253f;
                Iterator it4 = bVar2.iterator();
                while (it4.hasNext()) {
                    ((View) it4.next()).invalidate();
                }
                qe.b bVar3 = this.d;
                Iterator it5 = bVar3.iterator();
                while (it5.hasNext()) {
                    ((Drawable) it5.next()).invalidateSelf();
                }
                bVar2.clear();
                bVar3.clear();
                linkedHashSet.clear();
                if (this.f52255r % 2 == 0) {
                    qe.b bVar4 = this.f52252e;
                    Iterator it6 = bVar4.iterator();
                    while (it6.hasNext()) {
                        ((Drawable) it6.next()).invalidateSelf();
                    }
                    bVar4.clear();
                }
                int i11 = this.f52255r + 1;
                this.f52255r = i11;
                if (i11 == 60) {
                    this.f52255r = 0;
                }
            }
        }
        this.f52249a.postFrameCallback(this);
    }

    public final f e(int i10) {
        int max = Math.max(1, Math.min(i10, 60));
        SparseArray sparseArray = this.f52251c;
        f fVar = (f) sparseArray.get(max);
        if (fVar == null) {
            f fVar2 = new f(f52248s[max - 1]);
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
                SparseArray sparseArray = this.f52251c;
                if (i10 < sparseArray.size() && !((f) sparseArray.valueAt(i10)).f52242c.remove(runnable)) {
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
                SparseArray sparseArray = this.f52251c;
                if (i10 < sparseArray.size() && !((f) sparseArray.valueAt(i10)).f52241b.remove(gVar)) {
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
                SparseArray sparseArray = this.f52251c;
                if (i10 < sparseArray.size()) {
                    qe.b bVar = ((f) sparseArray.valueAt(i10)).d;
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
