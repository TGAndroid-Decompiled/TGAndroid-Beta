package uf;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.wt;
public abstract class c1 extends sl0 {
    public int B;
    public int C;
    public ArrayList D;
    public ArrayList E;
    public String F;
    public int G;
    public Context f48519c;
    public ArrayList d;
    public ArrayList f48520e;
    public k1 f48521f;
    public a0.h h;
    public Timer f48522n;
    public boolean f48523r;
    public boolean f48524s;
    public boolean v;
    public boolean f48525w;
    public long f48526x;
    public boolean f48527y;

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 0 && i10 != 2 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final Object E(int i10) {
        int size = this.d.size();
        int size2 = this.E.size();
        k1 k1Var = this.f48521f;
        int size3 = k1Var.f48621e.size();
        int size4 = k1Var.f48625j.size();
        if (i10 >= 0 && i10 < size) {
            return this.d.get(i10);
        }
        int i11 = i10 - size;
        if (size2 > 0) {
            if (i11 == 0) {
                return null;
            }
            if (i11 > 0 && i11 <= size2) {
                return this.E.get(i11 - 1);
            }
            i11 -= size2 + 1;
        }
        if (i11 >= 0 && i11 < size4) {
            return k1Var.f48625j.get(i11);
        }
        int i12 = i11 - size4;
        if (i12 <= 0 || i12 > size3) {
            return null;
        }
        return k1Var.f48621e.get(i12 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.f48522n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        this.d.clear();
        this.E.clear();
        this.f48520e.clear();
        if (this.f48523r) {
            this.f48521f.g(null, true, false, this.f48524s, this.v, this.f48526x, this.f48525w, 0, 0);
        }
        l();
        if (!TextUtils.isEmpty(str)) {
            Timer timer2 = new Timer();
            this.f48522n = timer2;
            timer2.schedule(new wt(this, str, 1), 200L, 300L);
        }
    }

    @Override
    public final int h() {
        k1 k1Var = this.f48521f;
        this.G = -1;
        int size = this.d.size();
        if (!this.E.isEmpty()) {
            this.G = size;
            size += this.E.size() + 1;
        }
        int size2 = k1Var.f48621e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = k1Var.f48625j.size();
        if (size3 != 0) {
            return size + size3;
        }
        return size;
    }

    @Override
    public final int j(int i10) {
        Object E = E(i10);
        if (E == null) {
            return 1;
        }
        if (E instanceof String) {
            if ("section".equals((String) E)) {
                return 1;
            }
            return 2;
        } else if (E instanceof ContactsController.Contact) {
            return 3;
        } else {
            return 0;
        }
    }

    @Override
    public final void v(f2.m1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: uf.c1.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        u3 u3Var;
        Context context = this.f48519c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            u3Var = new o8(16, context, false);
                        } else {
                            u00 u00Var = new u00(context, null);
                            u00Var.setIsSingleCell(true);
                            u00Var.setViewType(29);
                            u00Var.setBackgroundColor(k6.w0(null, k6.f21659d6, false));
                            u3Var = u00Var;
                        }
                    } else {
                        View q0Var = new q0(context, 1);
                        q0Var.setId(9);
                        q0Var.setTag(-33024);
                        u3Var = q0Var;
                    }
                } else {
                    h6 h6Var = new h6(context, null);
                    h6Var.J0 = true;
                    h6Var.B0 = true;
                    u3Var = h6Var;
                }
            } else {
                u3 u3Var2 = new u3(context, 26, null);
                u3Var2.setNoBackground(true);
                u3Var = u3Var2;
            }
        } else {
            h6 h6Var2 = new h6(context, null);
            h6Var2.J0 = true;
            h6Var2.B0 = true;
            u3Var = h6Var2;
        }
        return new f2.m1(u3Var);
    }
}
