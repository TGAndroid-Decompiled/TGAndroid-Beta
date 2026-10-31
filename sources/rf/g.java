package rf;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.lang.reflect.Field;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.s5;
public final class g implements Choreographer.FrameCallback {
    public static final long[] f46532r;
    public static g f46533s;
    public final Choreographer f46534a;
    public final SparseArray f46535b;
    public final je.b f46536c;
    public final je.b d;
    public final je.b e;
    public long f46537f;
    public long h;
    public int f46538n;

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
        f46532r = jArr;
    }

    public g() {
        Choreographer choreographer = Choreographer.getInstance();
        this.f46534a = choreographer;
        this.f46535b = new SparseArray();
        this.f46536c = new je.b();
        this.d = new je.b();
        this.e = new je.b();
        choreographer.postFrameCallback(this);
    }

    public static void c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Choreographer60FpsContent must be used on the main thread");
    }

    public static g d() {
        c();
        if (f46533s == null) {
            f46533s = new g();
        }
        return f46533s;
    }

    public final void a(int i10, Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int max = Math.max(1, Math.min(i10, 60));
        f(runnable);
        e(max).f46531c.add(runnable);
    }

    public final void b(r5 r5Var, int i10) {
        c();
        int max = Math.max(1, Math.min(i10, 60));
        g(r5Var);
        e(max).f46530b.add(r5Var);
    }

    @Override
    public final void doFrame(long j10) {
        long j11 = this.h;
        long j12 = 0;
        if (j11 == 0) {
            this.h = j10;
        } else {
            long j13 = (j10 - j11) + this.f46537f;
            this.f46537f = j13;
            this.h = j10;
            if (j13 >= 16666666) {
                this.f46537f = j13 % 16666666;
                je.b bVar = this.d;
                je.b bVar2 = this.f46536c;
                je.b bVar3 = this.e;
                SparseArray sparseArray = this.f46535b;
                long j14 = 1 << this.f46538n;
                int i10 = 0;
                while (i10 < sparseArray.size()) {
                    f fVar = (f) sparseArray.valueAt(i10);
                    if ((fVar.f46529a & j14) != j12) {
                        je.b bVar4 = fVar.d;
                        if (bVar4 != null) {
                            fVar.d = null;
                            Iterator it = bVar4.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                        }
                        Iterator it2 = fVar.f46530b.iterator();
                        while (it2.hasNext()) {
                            r5 r5Var = (r5) it2.next();
                            int i11 = r5Var.f29833a;
                            Object obj = r5Var.f29834b;
                            switch (i11) {
                                case 0:
                                    s5 s5Var = (s5) obj;
                                    int i12 = s5Var.Q0 + 1;
                                    s5Var.Q0 = i12;
                                    if (i12 > 10) {
                                        s5Var.R0 = true;
                                    }
                                    s5Var.i();
                                    if (!s5Var.U0) {
                                        break;
                                    } else {
                                        s5Var.T0 = true;
                                        s5Var.t();
                                        break;
                                    }
                                case 1:
                                    Field field = EditTextBoldCursor.f23980y1;
                                    ((EditTextBoldCursor) obj).invalidate();
                                    break;
                                default:
                                    bi0.g((bi0) obj);
                                    break;
                            }
                        }
                        Iterator it3 = fVar.f46531c.iterator();
                        while (it3.hasNext()) {
                            ((Runnable) it3.next()).run();
                        }
                    }
                    i10++;
                    j12 = 0;
                }
                Iterator it4 = bVar3.iterator();
                while (it4.hasNext()) {
                    ((View) it4.next()).invalidate();
                }
                Iterator it5 = bVar2.iterator();
                while (it5.hasNext()) {
                    ((Drawable) it5.next()).invalidateSelf();
                }
                bVar3.clear();
                bVar2.clear();
                if (this.f46538n % 2 == 0) {
                    Iterator it6 = bVar.iterator();
                    while (it6.hasNext()) {
                        ((Drawable) it6.next()).invalidateSelf();
                    }
                    bVar.clear();
                }
                int i13 = this.f46538n + 1;
                this.f46538n = i13;
                if (i13 == 60) {
                    this.f46538n = 0;
                }
            }
        }
        this.f46534a.postFrameCallback(this);
    }

    public final f e(int i10) {
        int max = Math.max(1, Math.min(i10, 60));
        SparseArray sparseArray = this.f46535b;
        f fVar = (f) sparseArray.get(max);
        if (fVar == null) {
            f fVar2 = new f(f46532r[max - 1]);
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
                SparseArray sparseArray = this.f46535b;
                if (i10 < sparseArray.size() && !((f) sparseArray.valueAt(i10)).f46531c.remove(runnable)) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void g(r5 r5Var) {
        c();
        if (r5Var != null) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f46535b;
                if (i10 < sparseArray.size() && !((f) sparseArray.valueAt(i10)).f46530b.remove(r5Var)) {
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
                SparseArray sparseArray = this.f46535b;
                if (i10 < sparseArray.size()) {
                    je.b bVar = ((f) sparseArray.valueAt(i10)).d;
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
