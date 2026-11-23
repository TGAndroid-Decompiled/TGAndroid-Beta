package xg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.dk0;
import v4.f1;
import yg.c0;
import yg.d0;
import yg.r;
import yg.t;
public abstract class e extends dk0 {
    public final h6 f60530c;
    public boolean d;
    public g2 f60531e;
    public TLRPC.TL_payments_checkedGiftCode f60532f;
    public String h;
    public m2 f60533n;

    public e(h6 h6Var) {
        this.f60530c = h6Var;
    }

    @Override
    public final boolean D(f1 f1Var) {
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
    public final void t(v4.f1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: xg.e.t(v4.f1, int):void");
    }

    @Override
    public final f1 x(ViewGroup viewGroup, int i7) {
        View tVar;
        Context context = viewGroup.getContext();
        h6 h6Var = this.f60530c;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            tVar = new r(context, h6Var);
                        } else {
                            tVar = new View(context);
                        }
                    } else {
                        tVar = new yg.a(context, h6Var);
                        tVar.setPadding(0, 0, 0, g0.L(14.0f));
                    }
                } else {
                    tVar = new d0(context, h6Var);
                }
            } else {
                tVar = new c0(context, h6Var);
            }
        } else {
            tVar = new t(context, h6Var);
        }
        return i5.c.q(tVar, tVar, -1, -2);
    }
}
