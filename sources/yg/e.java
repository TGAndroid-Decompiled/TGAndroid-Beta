package yg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import k2.p1;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.Components.sj0;
import u4.d1;
import zg.c0;
import zg.d0;
import zg.r;
import zg.t;
public abstract class e extends sj0 {
    public final e6 f59443c;
    public boolean d;
    public d2 f59444e;
    public TLRPC.TL_payments_checkedGiftCode f59445f;
    public String h;
    public j2 f59446n;

    public e(e6 e6Var) {
        this.f59443c = e6Var;
    }

    @Override
    public final boolean D(d1 d1Var) {
        return false;
    }

    public abstract void E();

    public abstract void F(TLObject tLObject);

    @Override
    public final int b() {
        return 5;
    }

    @Override
    public final int d(int i3) {
        if (i3 != 0) {
            int i10 = 1;
            if (i3 != 1) {
                i10 = 2;
                if (i3 != 2) {
                    i10 = 3;
                    if (i3 != 3) {
                        i10 = 4;
                        if (i3 != 4) {
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
    public final void t(u4.d1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: yg.e.t(u4.d1, int):void");
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i3) {
        View tVar;
        Context context = viewGroup.getContext();
        e6 e6Var = this.f59443c;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            tVar = new r(context, e6Var);
                        } else {
                            tVar = new View(context);
                        }
                    } else {
                        tVar = new zg.a(context, e6Var);
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
        return p1.p(tVar, tVar, -1, -2);
    }
}
