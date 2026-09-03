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
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.xt;
public abstract class c1 extends ql0 {
    public int B;
    public int C;
    public ArrayList D;
    public ArrayList E;
    public String F;
    public int G;
    public Context f44741c;
    public ArrayList d;
    public ArrayList e;
    public j1 f44742f;
    public a0.h h;
    public Timer f44743n;
    public boolean f44744r;
    public boolean f44745s;
    public boolean v;
    public boolean f44746w;
    public long f44747x;
    public boolean f44748y;

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 != 0 && i10 != 2 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final Object E(int i10) {
        int size = this.d.size();
        int size2 = this.E.size();
        j1 j1Var = this.f44742f;
        int size3 = j1Var.e.size();
        int size4 = j1Var.f44825j.size();
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
            return j1Var.f44825j.get(i11);
        }
        int i12 = i11 - size4;
        if (i12 <= 0 || i12 > size3) {
            return null;
        }
        return j1Var.e.get(i12 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.f44743n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.d.clear();
        this.E.clear();
        this.e.clear();
        if (this.f44744r) {
            this.f44742f.g(null, true, false, this.f44745s, this.v, this.f44747x, this.f44746w, 0, 0);
        }
        l();
        if (!TextUtils.isEmpty(str)) {
            Timer timer2 = new Timer();
            this.f44743n = timer2;
            timer2.schedule(new xt(this, str, 1), 200L, 300L);
        }
    }

    @Override
    public final int h() {
        j1 j1Var = this.f44742f;
        this.G = -1;
        int size = this.d.size();
        if (!this.E.isEmpty()) {
            this.G = size;
            size += this.E.size() + 1;
        }
        int size2 = j1Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = j1Var.f44825j.size();
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
        t3 t3Var;
        Context context = this.f44741c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            t3Var = new n8(16, context, false);
                        } else {
                            u00 u00Var = new u00(context, null);
                            u00Var.setIsSingleCell(true);
                            u00Var.setViewType(29);
                            u00Var.setBackgroundColor(j6.w0(null, j6.f19881d6, false));
                            t3Var = u00Var;
                        }
                    } else {
                        View q0Var = new q0(context, 1);
                        q0Var.setId(9);
                        q0Var.setTag(-33024);
                        t3Var = q0Var;
                    }
                } else {
                    g6 g6Var = new g6(context, null);
                    g6Var.J0 = true;
                    g6Var.B0 = true;
                    t3Var = g6Var;
                }
            } else {
                t3 t3Var2 = new t3(context, 26, null);
                t3Var2.setNoBackground(true);
                t3Var = t3Var2;
            }
        } else {
            g6 g6Var2 = new g6(context, null);
            g6Var2.J0 = true;
            g6Var2.B0 = true;
            t3Var = g6Var2;
        }
        return new f2.l1(t3Var);
    }
}
