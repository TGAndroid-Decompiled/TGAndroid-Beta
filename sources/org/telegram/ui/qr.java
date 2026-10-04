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
    public final Context f39793c;
    public final gg.c2 h;
    public or f39796n;
    public boolean f39798s;
    public int v;
    public int f39799w;
    public int f39800x;
    public final rr f39801y;
    public ArrayList d = new ArrayList();
    public a0.i f39794e = new a0.i();
    public ArrayList f39795f = new ArrayList();
    public int f39797r = 0;

    public qr(rr rrVar, Context context) {
        this.f39801y = rrVar;
        this.f39793c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.h = c2Var;
        c2Var.f10531a = new pr(this);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f46524a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f46528f != 1) {
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
        if (this.f39796n != null) {
            Utilities.searchQueue.cancelRunnable(this.f39796n);
            this.f39796n = null;
        }
        this.d.clear();
        this.f39794e.b();
        this.f39795f.clear();
        this.h.f(null, null);
        gg.c2 c2Var = this.h;
        rr rrVar = this.f39801y;
        if (rrVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(rrVar.f40222r)) {
            j3 = this.f39801y.N;
        } else {
            j3 = 0;
        }
        c2Var.g(null, z10, false, true, false, j3, false, this.f39801y.O, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f39798s = true;
            this.f39801y.f40187b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            or orVar = new or(this, str, 0);
            this.f39796n = orVar;
            dispatchQueue.postRunnable(orVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f39797r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f39800x && i10 != this.v && i10 != this.f39799w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ai.w0 w0Var;
        this.f39797r = 0;
        gg.c2 c2Var = this.h;
        int size = c2Var.f10536g.size();
        if (size != 0) {
            this.v = 0;
            this.f39797r = size + 1 + this.f39797r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f39797r;
            this.f39799w = i10;
            this.f39797r = size2 + 1 + i10;
        } else {
            this.f39799w = -1;
        }
        int size3 = c2Var.f10534e.size();
        if (size3 != 0) {
            int i11 = this.f39797r;
            this.f39800x = i11;
            this.f39797r = size3 + 1 + i11;
        } else {
            this.f39800x = -1;
        }
        rr rrVar = this.f39801y;
        if (rrVar.f40217o1 && (w0Var = rrVar.f40190c) != null) {
            s4.h0 adapter = w0Var.getAdapter();
            qr qrVar = rrVar.f40195e;
            if (adapter != qrVar) {
                ai.w0 w0Var2 = rrVar.f40190c;
                w0Var2.Y1 = true;
                w0Var2.Z1 = 0;
                w0Var2.setAdapter(qrVar);
                rrVar.f40190c.setFastScrollVisible(false);
                rrVar.f40190c.setVerticalScrollBarEnabled(true);
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
        rr rrVar = this.f39801y;
        if (i10 != 0) {
            d6Var = ((org.telegram.ui.ActionBar.n2) rrVar).resourceProvider;
            view = new org.telegram.ui.Cells.v3(this.f39793c, 26, d6Var);
            view.setBackground(null);
        } else {
            if (rrVar.f40197e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f39793c, null, z10);
            b5Var.G = true;
            b5Var.setDelegate(new pr(this));
            view = b5Var;
        }
        return new s4.c1(view);
    }
}
