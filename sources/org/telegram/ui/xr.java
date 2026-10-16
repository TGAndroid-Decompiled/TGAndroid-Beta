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
public final class xr extends org.telegram.ui.Components.lm0 {
    public final Context f41617c;
    public final hg.a2 h;
    public vr f41619n;
    public boolean f41621s;
    public int v;
    public int f41622w;
    public int f41623x;
    public final yr f41624y;
    public ArrayList d = new ArrayList();
    public a0.h e = new a0.h();
    public ArrayList f41618f = new ArrayList();
    public int f41620r = 0;

    public xr(yr yrVar, Context context) {
        this.f41624y = yrVar;
        this.f41617c = context;
        hg.a2 a2Var = new hg.a2(true);
        this.h = a2Var;
        a2Var.f10488a = new wr(this);
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f44838a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        hg.a2 a2Var = this.h;
        int size = a2Var.f10492g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) a2Var.f10492g.get(i10 - 1);
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
        int size3 = a2Var.e.size();
        if (size3 == 0 || size3 + 1 <= i10 || i10 == 0) {
            return null;
        }
        return (TLObject) a2Var.e.get(i10 - 1);
    }

    public final void F(String str) {
        boolean z10;
        long j10;
        if (this.f41619n != null) {
            Utilities.searchQueue.cancelRunnable(this.f41619n);
            this.f41619n = null;
        }
        this.d.clear();
        this.e.b();
        this.f41618f.clear();
        this.h.f(null, null);
        hg.a2 a2Var = this.h;
        yr yrVar = this.f41624y;
        if (yrVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(yrVar.f41926r)) {
            j10 = this.f41624y.N;
        } else {
            j10 = 0;
        }
        a2Var.g(null, z10, false, true, false, j10, false, this.f41624y.O, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f41621s = true;
            this.f41624y.f41892b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            vr vrVar = new vr(this, str, 0);
            this.f41619n = vrVar;
            dispatchQueue.postRunnable(vrVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f41620r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f41623x && i10 != this.v && i10 != this.f41622w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        bi.o0 o0Var;
        this.f41620r = 0;
        hg.a2 a2Var = this.h;
        int size = a2Var.f10492g.size();
        if (size != 0) {
            this.v = 0;
            this.f41620r = size + 1 + this.f41620r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f41620r;
            this.f41622w = i10;
            this.f41620r = size2 + 1 + i10;
        } else {
            this.f41622w = -1;
        }
        int size3 = a2Var.e.size();
        if (size3 != 0) {
            int i11 = this.f41620r;
            this.f41623x = i11;
            this.f41620r = size3 + 1 + i11;
        } else {
            this.f41623x = -1;
        }
        yr yrVar = this.f41624y;
        if (yrVar.f41921o1 && (o0Var = yrVar.f41895c) != null) {
            s4.g0 adapter = o0Var.getAdapter();
            xr xrVar = yrVar.e;
            if (adapter != xrVar) {
                bi.o0 o0Var2 = yrVar.f41895c;
                o0Var2.W1 = true;
                o0Var2.X1 = 0;
                o0Var2.setAdapter(xrVar);
                yrVar.f41895c.setFastScrollVisible(false);
                yrVar.f41895c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.b1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xr.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View view;
        org.telegram.ui.ActionBar.c6 c6Var;
        yr yrVar = this.f41624y;
        if (i10 != 0) {
            c6Var = ((org.telegram.ui.ActionBar.m2) yrVar).resourceProvider;
            view = new org.telegram.ui.Cells.v3(this.f41617c, 26, c6Var);
            view.setBackground(null);
        } else {
            if (yrVar.f41901e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f41617c, null, z10);
            b5Var.G = true;
            b5Var.setDelegate(new wr(this));
            view = b5Var;
        }
        return new s4.b1(view);
    }
}
