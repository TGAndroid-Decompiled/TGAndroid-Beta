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
public final class rr extends org.telegram.ui.Components.rm0 {
    public final Context f41491c;
    public final gg.b2 h;
    public pr f41494n;
    public boolean f41496s;
    public int v;
    public int f41497w;
    public int f41498x;
    public final sr f41499y;
    public ArrayList d = new ArrayList();
    public a0.i f41492e = new a0.i();
    public ArrayList f41493f = new ArrayList();
    public int f41495r = 0;

    public rr(sr srVar, Context context) {
        this.f41499y = srVar;
        this.f41491c = context;
        gg.b2 b2Var = new gg.b2(true);
        this.h = b2Var;
        b2Var.f10531a = new qr(this);
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47748a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47752f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        gg.b2 b2Var = this.h;
        int size = b2Var.f10536g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) b2Var.f10536g.get(i10 - 1);
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
        int size3 = b2Var.f10534e.size();
        if (size3 == 0 || size3 + 1 <= i10 || i10 == 0) {
            return null;
        }
        return (TLObject) b2Var.f10534e.get(i10 - 1);
    }

    public final void F(String str) {
        boolean z10;
        long j3;
        if (this.f41494n != null) {
            Utilities.searchQueue.cancelRunnable(this.f41494n);
            this.f41494n = null;
        }
        this.d.clear();
        this.f41492e.b();
        this.f41493f.clear();
        this.h.f(null, null);
        gg.b2 b2Var = this.h;
        sr srVar = this.f41499y;
        if (srVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(srVar.f41822r)) {
            j3 = this.f41499y.N;
        } else {
            j3 = 0;
        }
        b2Var.g(null, z10, false, true, false, j3, false, this.f41499y.O, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f41496s = true;
            this.f41499y.f41787b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            pr prVar = new pr(this, str, 0);
            this.f41494n = prVar;
            dispatchQueue.postRunnable(prVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f41495r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f41498x && i10 != this.v && i10 != this.f41497w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ai.w0 w0Var;
        this.f41495r = 0;
        gg.b2 b2Var = this.h;
        int size = b2Var.f10536g.size();
        if (size != 0) {
            this.v = 0;
            this.f41495r = size + 1 + this.f41495r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f41495r;
            this.f41497w = i10;
            this.f41495r = size2 + 1 + i10;
        } else {
            this.f41497w = -1;
        }
        int size3 = b2Var.f10534e.size();
        if (size3 != 0) {
            int i11 = this.f41495r;
            this.f41498x = i11;
            this.f41495r = size3 + 1 + i11;
        } else {
            this.f41498x = -1;
        }
        sr srVar = this.f41499y;
        if (srVar.f41817o1 && (w0Var = srVar.f41790c) != null) {
            s4.i0 adapter = w0Var.getAdapter();
            rr rrVar = srVar.f41795e;
            if (adapter != rrVar) {
                ai.w0 w0Var2 = srVar.f41790c;
                w0Var2.W1 = true;
                w0Var2.X1 = 0;
                w0Var2.setAdapter(rrVar);
                srVar.f41790c.setFastScrollVisible(false);
                srVar.f41790c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.d1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rr.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View view;
        org.telegram.ui.ActionBar.d6 d6Var;
        sr srVar = this.f41499y;
        if (i10 != 0) {
            d6Var = ((org.telegram.ui.ActionBar.m2) srVar).resourceProvider;
            view = new org.telegram.ui.Cells.v3(this.f41491c, 26, d6Var);
            view.setBackground(null);
        } else {
            if (srVar.f41797e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f41491c, null, z10);
            b5Var.G = true;
            b5Var.setDelegate(new qr(this));
            view = b5Var;
        }
        return new s4.d1(view);
    }
}
