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
public final class vr extends org.telegram.ui.Components.vm0 {
    public final Context f42833c;
    public final gg.b2 h;
    public tr f42836n;
    public boolean f42838s;
    public int v;
    public int f42839w;
    public int f42840x;
    public final wr f42841y;
    public ArrayList d = new ArrayList();
    public a0.i f42834e = new a0.i();
    public ArrayList f42835f = new ArrayList();
    public int f42837r = 0;

    public vr(wr wrVar, Context context) {
        this.f42841y = wrVar;
        this.f42833c = context;
        gg.b2 b2Var = new gg.b2(true);
        this.h = b2Var;
        b2Var.f10530a = new ur(this);
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47897a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47901f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        gg.b2 b2Var = this.h;
        int size = b2Var.f10535g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) b2Var.f10535g.get(i10 - 1);
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
        int size3 = b2Var.f10533e.size();
        if (size3 == 0 || size3 + 1 <= i10 || i10 == 0) {
            return null;
        }
        return (TLObject) b2Var.f10533e.get(i10 - 1);
    }

    public final void F(String str) {
        boolean z10;
        long j3;
        if (this.f42836n != null) {
            Utilities.searchQueue.cancelRunnable(this.f42836n);
            this.f42836n = null;
        }
        this.d.clear();
        this.f42834e.b();
        this.f42835f.clear();
        this.h.f(null, null);
        gg.b2 b2Var = this.h;
        wr wrVar = this.f42841y;
        if (wrVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(wrVar.f43651r)) {
            j3 = this.f42841y.N;
        } else {
            j3 = 0;
        }
        b2Var.g(null, z10, false, true, false, j3, false, this.f42841y.O, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f42838s = true;
            this.f42841y.f43616b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            tr trVar = new tr(this, str, 0);
            this.f42836n = trVar;
            dispatchQueue.postRunnable(trVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f42837r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f42840x && i10 != this.v && i10 != this.f42839w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ai.w0 w0Var;
        this.f42837r = 0;
        gg.b2 b2Var = this.h;
        int size = b2Var.f10535g.size();
        if (size != 0) {
            this.v = 0;
            this.f42837r = size + 1 + this.f42837r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f42837r;
            this.f42839w = i10;
            this.f42837r = size2 + 1 + i10;
        } else {
            this.f42839w = -1;
        }
        int size3 = b2Var.f10533e.size();
        if (size3 != 0) {
            int i11 = this.f42837r;
            this.f42840x = i11;
            this.f42837r = size3 + 1 + i11;
        } else {
            this.f42840x = -1;
        }
        wr wrVar = this.f42841y;
        if (wrVar.f43646o1 && (w0Var = wrVar.f43619c) != null) {
            s4.i0 adapter = w0Var.getAdapter();
            vr vrVar = wrVar.f43624e;
            if (adapter != vrVar) {
                ai.w0 w0Var2 = wrVar.f43619c;
                w0Var2.W1 = true;
                w0Var2.X1 = 0;
                w0Var2.setAdapter(vrVar);
                wrVar.f43619c.setFastScrollVisible(false);
                wrVar.f43619c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.d1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vr.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View view;
        org.telegram.ui.ActionBar.c6 c6Var;
        wr wrVar = this.f42841y;
        if (i10 != 0) {
            c6Var = ((org.telegram.ui.ActionBar.m2) wrVar).resourceProvider;
            view = new org.telegram.ui.Cells.v3(this.f42833c, 26, c6Var);
            view.setBackground(null);
        } else {
            if (wrVar.f43626e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f42833c, null, z10);
            b5Var.G = true;
            b5Var.setDelegate(new ur(this));
            view = b5Var;
        }
        return new s4.d1(view);
    }
}
