package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class qr extends org.telegram.ui.Components.yl0 {
    public final Context f39792c;
    public final gg.c2 h;
    public or f39795n;
    public boolean f39797s;
    public int v;
    public int f39798w;
    public int f39799x;
    public final rr f39800y;
    public ArrayList d = new ArrayList();
    public a0.i f39793e = new a0.i();
    public ArrayList f39794f = new ArrayList();
    public int f39796r = 0;

    public qr(rr rrVar, Context context) {
        this.f39800y = rrVar;
        this.f39792c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.h = c2Var;
        c2Var.f10531a = new pr(this);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f46523a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f46527f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        gg.c2 c2Var = this.h;
        int size = c2Var.f10536g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) c2Var.f10536g.get(i10 - 1);
            }
            i10 -= i11;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i12 = size2 + 1;
            if (i12 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) this.d.get(i10 - 1);
            }
            i10 -= i12;
        }
        int size3 = c2Var.f10534e.size();
        if (size3 == 0 || size3 + 1 <= i10 || i10 == 0) {
            return null;
        }
        return (TLObject) c2Var.f10534e.get(i10 - 1);
    }

    public final void F(String str) {
        boolean z10;
        long j3;
        if (this.f39795n != null) {
            Utilities.searchQueue.cancelRunnable(this.f39795n);
            this.f39795n = null;
        }
        this.d.clear();
        this.f39793e.b();
        this.f39794f.clear();
        this.h.f(null, null);
        gg.c2 c2Var = this.h;
        rr rrVar = this.f39800y;
        if (rrVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(rrVar.f40221r)) {
            j3 = this.f39800y.N;
        } else {
            j3 = 0;
        }
        c2Var.g(null, z10, false, true, false, j3, false, this.f39800y.O, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f39797s = true;
            this.f39800y.f40186b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            or orVar = new or(this, str, 0);
            this.f39795n = orVar;
            dispatchQueue.postRunnable(orVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f39796r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f39799x && i10 != this.v && i10 != this.f39798w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ai.w0 w0Var;
        this.f39796r = 0;
        gg.c2 c2Var = this.h;
        int size = c2Var.f10536g.size();
        if (size != 0) {
            this.v = 0;
            this.f39796r = size + 1 + this.f39796r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f39796r;
            this.f39798w = i10;
            this.f39796r = size2 + 1 + i10;
        } else {
            this.f39798w = -1;
        }
        int size3 = c2Var.f10534e.size();
        if (size3 != 0) {
            int i11 = this.f39796r;
            this.f39799x = i11;
            this.f39796r = size3 + 1 + i11;
        } else {
            this.f39799x = -1;
        }
        rr rrVar = this.f39800y;
        if (rrVar.f40216o1 && (w0Var = rrVar.f40189c) != null) {
            s4.h0 adapter = w0Var.getAdapter();
            qr qrVar = rrVar.f40194e;
            if (adapter != qrVar) {
                ai.w0 w0Var2 = rrVar.f40189c;
                w0Var2.Y1 = true;
                w0Var2.Z1 = 0;
                w0Var2.setAdapter(qrVar);
                rrVar.f40189c.setFastScrollVisible(false);
                rrVar.f40189c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qr.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View view;
        org.telegram.ui.ActionBar.d6 d6Var;
        rr rrVar = this.f39800y;
        if (i10 != 0) {
            d6Var = ((org.telegram.ui.ActionBar.n2) rrVar).resourceProvider;
            view = new org.telegram.ui.Cells.v3(this.f39792c, 26, d6Var);
            view.setBackground(null);
        } else {
            if (rrVar.f40196e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f39792c, null, z10);
            b5Var.G = true;
            b5Var.setDelegate(new pr(this));
            view = b5Var;
        }
        return new s4.c1(view);
    }
}
