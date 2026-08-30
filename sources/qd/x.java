package qd;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ld.t0;
import ld.u0;
public class x {
    public static final AtomicIntegerFieldUpdater f43046b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size$volatile");
    private volatile int _size$volatile;
    public t0[] f43047a;

    public final void a(t0 t0Var) {
        t0Var.e((u0) this);
        t0[] t0VarArr = this.f43047a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f43046b;
        if (t0VarArr == null) {
            t0VarArr = new t0[4];
            this.f43047a = t0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= t0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(t0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
            t0VarArr = (t0[]) copyOf;
            this.f43047a = t0VarArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        t0VarArr[i10] = t0Var;
        t0Var.f11921b = i10;
        e(i10);
    }

    public final t0 b() {
        t0 t0Var;
        synchronized (this) {
            t0[] t0VarArr = this.f43047a;
            if (t0VarArr != null) {
                t0Var = t0VarArr[0];
            } else {
                t0Var = null;
            }
        }
        return t0Var;
    }

    public final void c(t0 t0Var) {
        synchronized (this) {
            if (t0Var.a() != null) {
                d(t0Var.f11921b);
            }
        }
    }

    public final ld.t0 d(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: qd.x.d(int):ld.t0");
    }

    public final void e(int i10) {
        while (i10 > 0) {
            t0[] t0VarArr = this.f43047a;
            kotlin.jvm.internal.j.b(t0VarArr);
            int i11 = (i10 - 1) / 2;
            t0 t0Var = t0VarArr[i11];
            kotlin.jvm.internal.j.b(t0Var);
            t0 t0Var2 = t0VarArr[i10];
            kotlin.jvm.internal.j.b(t0Var2);
            if (t0Var.compareTo(t0Var2) <= 0) {
                return;
            }
            f(i10, i11);
            i10 = i11;
        }
    }

    public final void f(int i10, int i11) {
        t0[] t0VarArr = this.f43047a;
        kotlin.jvm.internal.j.b(t0VarArr);
        t0 t0Var = t0VarArr[i11];
        kotlin.jvm.internal.j.b(t0Var);
        t0 t0Var2 = t0VarArr[i10];
        kotlin.jvm.internal.j.b(t0Var2);
        t0VarArr[i10] = t0Var;
        t0VarArr[i11] = t0Var2;
        t0Var.f11921b = i10;
        t0Var2.f11921b = i11;
    }
}
