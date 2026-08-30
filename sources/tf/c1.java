package tf;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.vt;
public abstract class c1 extends rl0 {
    public int B;
    public int C;
    public ArrayList D;
    public ArrayList E;
    public String F;
    public int G;
    public Context f44679c;
    public ArrayList d;
    public ArrayList e;
    public k1 f44680f;
    public a0.h h;
    public Timer f44681n;
    public boolean f44682r;
    public boolean f44683s;
    public boolean v;
    public boolean f44684w;
    public long f44685x;
    public boolean f44686y;

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
        if (i10 != 0 && i10 != 2 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final Object E(int i10) {
        int size = this.d.size();
        int size2 = this.E.size();
        k1 k1Var = this.f44680f;
        int size3 = k1Var.e.size();
        int size4 = k1Var.f44775j.size();
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
            return k1Var.f44775j.get(i11);
        }
        int i12 = i11 - size4;
        if (i12 <= 0 || i12 > size3) {
            return null;
        }
        return k1Var.e.get(i12 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.f44681n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.d.clear();
        this.E.clear();
        this.e.clear();
        if (this.f44682r) {
            this.f44680f.g(null, true, false, this.f44683s, this.v, this.f44685x, this.f44684w, 0, 0);
        }
        l();
        if (!TextUtils.isEmpty(str)) {
            Timer timer2 = new Timer();
            this.f44681n = timer2;
            timer2.schedule(new vt(this, str, 1), 200L, 300L);
        }
    }

    @Override
    public final int h() {
        k1 k1Var = this.f44680f;
        this.G = -1;
        int size = this.d.size();
        if (!this.E.isEmpty()) {
            this.G = size;
            size += this.E.size() + 1;
        }
        int size2 = k1Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = k1Var.f44775j.size();
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
    public final void v(f2.l1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: tf.c1.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        u3 u3Var;
        Context context = this.f44679c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            u3Var = new o8(16, context, false);
                        } else {
                            t00 t00Var = new t00(context, null);
                            t00Var.setIsSingleCell(true);
                            t00Var.setViewType(29);
                            t00Var.setBackgroundColor(j6.w0(null, j6.f19906d6, false));
                            u3Var = t00Var;
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
        return new f2.l1(u3Var);
    }
}
