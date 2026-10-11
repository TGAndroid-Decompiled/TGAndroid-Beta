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
public final class rr extends org.telegram.ui.Components.qm0 {
    public final Context f41525c;
    public final gg.b2 h;
    public pr f41528n;
    public boolean f41530s;
    public int v;
    public int f41531w;
    public int f41532x;
    public final sr f41533y;
    public ArrayList d = new ArrayList();
    public a0.i f41526e = new a0.i();
    public ArrayList f41527f = new ArrayList();
    public int f41529r = 0;

    public rr(sr srVar, Context context) {
        this.f41533y = srVar;
        this.f41525c = context;
        gg.b2 b2Var = new gg.b2(true);
        this.h = b2Var;
        b2Var.f10531a = new qr(this);
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47782a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47786f != 1) {
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
        if (this.f41528n != null) {
            Utilities.searchQueue.cancelRunnable(this.f41528n);
            this.f41528n = null;
        }
        this.d.clear();
        this.f41526e.b();
        this.f41527f.clear();
        this.h.f(null, null);
        gg.b2 b2Var = this.h;
        sr srVar = this.f41533y;
        if (srVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(srVar.f41856r)) {
            j3 = this.f41533y.N;
        } else {
            j3 = 0;
        }
        b2Var.g(null, z10, false, true, false, j3, false, this.f41533y.O, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f41530s = true;
            this.f41533y.f41821b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            pr prVar = new pr(this, str, 0);
            this.f41528n = prVar;
            dispatchQueue.postRunnable(prVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f41529r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f41532x && i10 != this.v && i10 != this.f41531w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ai.w0 w0Var;
        this.f41529r = 0;
        gg.b2 b2Var = this.h;
        int size = b2Var.f10536g.size();
        if (size != 0) {
            this.v = 0;
            this.f41529r = size + 1 + this.f41529r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f41529r;
            this.f41531w = i10;
            this.f41529r = size2 + 1 + i10;
        } else {
            this.f41531w = -1;
        }
        int size3 = b2Var.f10534e.size();
        if (size3 != 0) {
            int i11 = this.f41529r;
            this.f41532x = i11;
            this.f41529r = size3 + 1 + i11;
        } else {
            this.f41532x = -1;
        }
        sr srVar = this.f41533y;
        if (srVar.f41851o1 && (w0Var = srVar.f41824c) != null) {
            s4.i0 adapter = w0Var.getAdapter();
            rr rrVar = srVar.f41829e;
            if (adapter != rrVar) {
                ai.w0 w0Var2 = srVar.f41824c;
                w0Var2.W1 = true;
                w0Var2.X1 = 0;
                w0Var2.setAdapter(rrVar);
                srVar.f41824c.setFastScrollVisible(false);
                srVar.f41824c.setVerticalScrollBarEnabled(true);
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
        sr srVar = this.f41533y;
        if (i10 != 0) {
            d6Var = ((org.telegram.ui.ActionBar.m2) srVar).resourceProvider;
            view = new org.telegram.ui.Cells.v3(this.f41525c, 26, d6Var);
            view.setBackground(null);
        } else {
            if (srVar.f41831e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f41525c, null, z10);
            b5Var.G = true;
            b5Var.setDelegate(new qr(this));
            view = b5Var;
        }
        return new s4.d1(view);
    }
}
