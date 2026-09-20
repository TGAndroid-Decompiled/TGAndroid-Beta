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
public final class rr extends org.telegram.ui.Components.ul0 {
    public final Context f37212c;
    public final gg.c2 h;
    public pr f37214n;
    public boolean f37216s;
    public int v;
    public int f37217w;
    public int f37218x;
    public final sr f37219y;
    public ArrayList d = new ArrayList();
    public a0.i e = new a0.i();
    public ArrayList f37213f = new ArrayList();
    public int f37215r = 0;

    public rr(sr srVar, Context context) {
        this.f37219y = srVar;
        this.f37212c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.h = c2Var;
        c2Var.f9690a = new qr(this);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42974a;
        if (view instanceof org.telegram.ui.Cells.c5) {
            ((org.telegram.ui.Cells.c5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42977f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        gg.c2 c2Var = this.h;
        int size = c2Var.f9694g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) c2Var.f9694g.get(i10 - 1);
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
        int size3 = c2Var.e.size();
        if (size3 == 0 || size3 + 1 <= i10 || i10 == 0) {
            return null;
        }
        return (TLObject) c2Var.e.get(i10 - 1);
    }

    public final void F(String str) {
        boolean z10;
        long j3;
        if (this.f37214n != null) {
            Utilities.searchQueue.cancelRunnable(this.f37214n);
            this.f37214n = null;
        }
        this.d.clear();
        this.e.b();
        this.f37213f.clear();
        this.h.f(null, null);
        gg.c2 c2Var = this.h;
        sr srVar = this.f37219y;
        if (srVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(srVar.f37484r)) {
            j3 = this.f37219y.N;
        } else {
            j3 = 0;
        }
        c2Var.g(null, z10, false, true, false, j3, false, this.f37219y.O, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f37216s = true;
            this.f37219y.f37450b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            pr prVar = new pr(this, str, 0);
            this.f37214n = prVar;
            dispatchQueue.postRunnable(prVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f37215r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f37218x && i10 != this.v && i10 != this.f37217w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ai.w0 w0Var;
        this.f37215r = 0;
        gg.c2 c2Var = this.h;
        int size = c2Var.f9694g.size();
        if (size != 0) {
            this.v = 0;
            this.f37215r = size + 1 + this.f37215r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f37215r;
            this.f37217w = i10;
            this.f37215r = size2 + 1 + i10;
        } else {
            this.f37217w = -1;
        }
        int size3 = c2Var.e.size();
        if (size3 != 0) {
            int i11 = this.f37215r;
            this.f37218x = i11;
            this.f37215r = size3 + 1 + i11;
        } else {
            this.f37218x = -1;
        }
        sr srVar = this.f37219y;
        if (srVar.f37479o1 && (w0Var = srVar.f37453c) != null) {
            s4.h0 adapter = w0Var.getAdapter();
            rr rrVar = srVar.e;
            if (adapter != rrVar) {
                ai.w0 w0Var2 = srVar.f37453c;
                w0Var2.Y1 = true;
                w0Var2.Z1 = 0;
                w0Var2.setAdapter(rrVar);
                srVar.f37453c.setFastScrollVisible(false);
                srVar.f37453c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rr.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        sr srVar = this.f37219y;
        if (i10 != 0) {
            f6Var = ((org.telegram.ui.ActionBar.n2) srVar).resourceProvider;
            view = new org.telegram.ui.Cells.w3(this.f37212c, 26, f6Var);
            view.setBackground(null);
        } else {
            if (srVar.f37459e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.c5 c5Var = new org.telegram.ui.Cells.c5(2, 2, this.f37212c, null, z10);
            c5Var.G = true;
            c5Var.setDelegate(new qr(this));
            view = c5Var;
        }
        return new s4.c1(view);
    }
}
