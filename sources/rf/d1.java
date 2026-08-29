package rf;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import f2.n1;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.ot;
public abstract class d1 extends il0 {
    public int A;
    public int B;
    public ArrayList C;
    public ArrayList D;
    public String E;
    public int F;
    public Context f47193c;
    public ArrayList d;
    public ArrayList f47194e;
    public k1 f47195f;
    public a0.h h;
    public Timer f47196n;
    public boolean f47197r;
    public boolean f47198s;
    public boolean v;
    public boolean f47199w;
    public long f47200x;
    public boolean f47201y;

    @Override
    public final boolean D(n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 0 && i10 != 2 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final Object E(int i10) {
        int size = this.d.size();
        int size2 = this.D.size();
        k1 k1Var = this.f47195f;
        int size3 = k1Var.f47280e.size();
        int size4 = k1Var.f47284j.size();
        if (i10 >= 0 && i10 < size) {
            return this.d.get(i10);
        }
        int i11 = i10 - size;
        if (size2 > 0) {
            if (i11 == 0) {
                return null;
            }
            if (i11 > 0 && i11 <= size2) {
                return this.D.get(i11 - 1);
            }
            i11 -= size2 + 1;
        }
        if (i11 >= 0 && i11 < size4) {
            return k1Var.f47284j.get(i11);
        }
        int i12 = i11 - size4;
        if (i12 <= 0 || i12 > size3) {
            return null;
        }
        return k1Var.f47280e.get(i12 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.f47196n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.d.clear();
        this.D.clear();
        this.f47194e.clear();
        if (this.f47197r) {
            this.f47195f.g(null, true, false, this.f47198s, this.v, this.f47200x, this.f47199w, 0, 0);
        }
        l();
        if (!TextUtils.isEmpty(str)) {
            Timer timer2 = new Timer();
            this.f47196n = timer2;
            timer2.schedule(new ot(this, str, 1), 200L, 300L);
        }
    }

    @Override
    public final int h() {
        k1 k1Var = this.f47195f;
        this.F = -1;
        int size = this.d.size();
        if (!this.D.isEmpty()) {
            this.F = size;
            size += this.D.size() + 1;
        }
        int size2 = k1Var.f47280e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = k1Var.f47284j.size();
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
    public final void v(f2.n1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: rf.d1.v(f2.n1, int):void");
    }

    @Override
    public final n1 x(ViewGroup viewGroup, int i10) {
        s3 s3Var;
        Context context = this.f47193c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            s3Var = new m8(16, context, false);
                        } else {
                            p00 p00Var = new p00(context, null);
                            p00Var.setIsSingleCell(true);
                            p00Var.setViewType(29);
                            p00Var.setBackgroundColor(g6.w0(null, g6.f23062d6, false));
                            s3Var = p00Var;
                        }
                    } else {
                        View r0Var = new r0(context, 1);
                        r0Var.setId(9);
                        r0Var.setTag(-33024);
                        s3Var = r0Var;
                    }
                } else {
                    f6 f6Var = new f6(context, null);
                    f6Var.I0 = true;
                    f6Var.A0 = true;
                    s3Var = f6Var;
                }
            } else {
                s3 s3Var2 = new s3(context, 26, null);
                s3Var2.setNoBackground(true);
                s3Var = s3Var2;
            }
        } else {
            f6 f6Var2 = new f6(context, null);
            f6Var2.I0 = true;
            f6Var2.A0 = true;
            s3Var = f6Var2;
        }
        return new n1(s3Var);
    }
}
