package xg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.tj0;
import v4.e1;
import yg.c0;
import yg.d0;
import yg.r;
import yg.t;
public abstract class f extends tj0 {
    public final e6 f59917c;
    public boolean d;
    public e2 f59918e;
    public TLRPC.TL_payments_checkedGiftCode f59919f;
    public String h;
    public k2 f59920n;

    public f(e6 e6Var) {
        this.f59917c = e6Var;
    }

    @Override
    public final boolean D(e1 e1Var) {
        return false;
    }

    public abstract void E();

    public abstract void F(TLObject tLObject);

    @Override
    public final int b() {
        return 5;
    }

    @Override
    public final int d(int i7) {
        if (i7 != 0) {
            int i10 = 1;
            if (i7 != 1) {
                i10 = 2;
                if (i7 != 2) {
                    i10 = 3;
                    if (i7 != 3) {
                        i10 = 4;
                        if (i7 != 4) {
                            return 5;
                        }
                    }
                }
            }
            return i10;
        }
        return 0;
    }

    @Override
    public final void t(v4.e1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: xg.f.t(v4.e1, int):void");
    }

    @Override
    public final e1 x(ViewGroup viewGroup, int i7) {
        View tVar;
        Context context = viewGroup.getContext();
        e6 e6Var = this.f59917c;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            tVar = new r(context, e6Var);
                        } else {
                            tVar = new View(context);
                        }
                    } else {
                        tVar = new yg.a(context, e6Var);
                        tVar.setPadding(0, 0, 0, g0.L(14.0f));
                    }
                } else {
                    tVar = new d0(context, e6Var);
                }
            } else {
                tVar = new c0(context, e6Var);
            }
        } else {
            tVar = new t(context, e6Var);
        }
        return i5.c.q(tVar, tVar, -1, -2);
    }
}
