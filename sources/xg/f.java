package xg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.Components.oj0;
import v4.d1;
import yg.c0;
import yg.d0;
import yg.r;
import yg.t;
public abstract class f extends oj0 {
    public final f6 f58630c;
    public boolean d;
    public f2 f58631e;
    public TLRPC.TL_payments_checkedGiftCode f58632f;
    public String h;
    public l2 f58633n;

    public f(f6 f6Var) {
        this.f58630c = f6Var;
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
    public final void t(v4.d1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: xg.f.t(v4.d1, int):void");
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i7) {
        View tVar;
        Context context = viewGroup.getContext();
        f6 f6Var = this.f58630c;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            tVar = new r(context, f6Var);
                        } else {
                            tVar = new View(context);
                        }
                    } else {
                        tVar = new yg.a(context, f6Var);
                        tVar.setPadding(0, 0, 0, g0.L(14.0f));
                    }
                } else {
                    tVar = new d0(context, f6Var);
                }
            } else {
                tVar = new c0(context, f6Var);
            }
        } else {
            tVar = new t(context, f6Var);
        }
        return jg.g.r(tVar, tVar, -1, -2);
    }
}
