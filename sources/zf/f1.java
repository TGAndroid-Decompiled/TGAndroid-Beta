package zf;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.f5;
import org.telegram.messenger.f8;
import org.telegram.messenger.we;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.zz;
public abstract class f1 extends tk0 {
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public String I;
    public int J;
    public Context f55502c;
    public ArrayList d;
    public ArrayList e;
    public m1 f55503f;
    public a0.h h;
    public Timer f55504n;
    public boolean f55505r;
    public boolean f55506s;
    public boolean f55507w;
    public boolean f55508x;
    public long f55509y;

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
        if (i10 != 0 && i10 != 2 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final Object E(int i10) {
        int size = this.d.size();
        int size2 = this.H.size();
        m1 m1Var = this.f55503f;
        int size3 = m1Var.e.size();
        int size4 = m1Var.f55599j.size();
        if (i10 >= 0 && i10 < size) {
            return this.d.get(i10);
        }
        int i11 = i10 - size;
        if (size2 > 0) {
            if (i11 == 0) {
                return null;
            }
            if (i11 > 0 && i11 <= size2) {
                return this.H.get(i11 - 1);
            }
            i11 -= size2 + 1;
        }
        if (i11 >= 0 && i11 < size4) {
            return m1Var.f55599j.get(i11);
        }
        int i12 = i11 - size4;
        if (i12 <= 0 || i12 > size3) {
            return null;
        }
        return m1Var.e.get(i12 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.f55504n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
        this.d.clear();
        this.H.clear();
        this.e.clear();
        if (this.f55505r) {
            this.f55503f.g(null, true, false, this.f55506s, this.f55507w, this.f55509y, this.f55508x, 0, 0);
        }
        f();
        if (!TextUtils.isEmpty(str)) {
            Timer timer2 = new Timer();
            this.f55504n = timer2;
            timer2.schedule(new we(3, this, str), 200L, 300L);
        }
    }

    @Override
    public final int b() {
        m1 m1Var = this.f55503f;
        this.J = -1;
        int size = this.d.size();
        if (!this.H.isEmpty()) {
            this.J = size;
            size += this.H.size() + 1;
        }
        int size2 = m1Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = m1Var.f55599j.size();
        if (size3 != 0) {
            return size + size3;
        }
        return size;
    }

    @Override
    public final int d(int i10) {
        Object E = E(i10);
        if (E == null) {
            return 1;
        }
        if (E instanceof String) {
            if ("section".equals((String) E)) {
                return 1;
            }
            return 2;
        } else if (E instanceof f5) {
            return 3;
        } else {
            return 0;
        }
    }

    @Override
    public final void t(s4.c1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: zf.f1.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        z3 z3Var;
        Context context = this.f55502c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            z3Var = new p8(16, context, false);
                        } else {
                            zz zzVar = new zz(context, null);
                            zzVar.setIsSingleCell(true);
                            zzVar.setViewType(29);
                            a7.i(t6.f20930d6, zzVar, null);
                            z3Var = zzVar;
                        }
                    } else {
                        View t0Var = new t0(context, 1);
                        t0Var.setId(9);
                        t0Var.setTag(-33024);
                        z3Var = t0Var;
                    }
                } else {
                    k6 k6Var = new k6(context, null);
                    k6Var.M0 = true;
                    k6Var.E0 = true;
                    z3Var = k6Var;
                }
            } else {
                z3 z3Var2 = new z3(26, context, null);
                z3Var2.setNoBackground(true);
                z3Var = z3Var2;
            }
        } else {
            k6 k6Var2 = new k6(context, null);
            k6Var2.M0 = true;
            k6Var2.E0 = true;
            z3Var = k6Var2;
        }
        return new s4.c1(z3Var);
    }
}
