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
public final class tr extends org.telegram.ui.Components.kl0 {
    public final Context f37767c;
    public final gg.c2 h;
    public rr f37769n;
    public boolean f37771s;
    public int v;
    public int f37772w;
    public int f37773x;
    public final ur f37774y;
    public ArrayList d = new ArrayList();
    public a0.i e = new a0.i();
    public ArrayList f37768f = new ArrayList();
    public int f37770r = 0;

    public tr(ur urVar, Context context) {
        this.f37774y = urVar;
        this.f37767c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.h = c2Var;
        c2Var.f9685a = new sr(this);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f42675a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42678f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        gg.c2 c2Var = this.h;
        int size = c2Var.f9689g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) c2Var.f9689g.get(i10 - 1);
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
        if (this.f37769n != null) {
            Utilities.searchQueue.cancelRunnable(this.f37769n);
            this.f37769n = null;
        }
        this.d.clear();
        this.e.b();
        this.f37768f.clear();
        this.h.f(null, null);
        gg.c2 c2Var = this.h;
        ur urVar = this.f37774y;
        if (urVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(urVar.f38130r)) {
            j3 = this.f37774y.N;
        } else {
            j3 = 0;
        }
        c2Var.g(null, z10, false, true, false, j3, false, this.f37774y.O, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f37771s = true;
            this.f37774y.f38096b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            rr rrVar = new rr(this, str, 0);
            this.f37769n = rrVar;
            dispatchQueue.postRunnable(rrVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f37770r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f37773x && i10 != this.v && i10 != this.f37772w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ai.w0 w0Var;
        this.f37770r = 0;
        gg.c2 c2Var = this.h;
        int size = c2Var.f9689g.size();
        if (size != 0) {
            this.v = 0;
            this.f37770r = size + 1 + this.f37770r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f37770r;
            this.f37772w = i10;
            this.f37770r = size2 + 1 + i10;
        } else {
            this.f37772w = -1;
        }
        int size3 = c2Var.e.size();
        if (size3 != 0) {
            int i11 = this.f37770r;
            this.f37773x = i11;
            this.f37770r = size3 + 1 + i11;
        } else {
            this.f37773x = -1;
        }
        ur urVar = this.f37774y;
        if (urVar.f38125o1 && (w0Var = urVar.f38099c) != null) {
            s4.h0 adapter = w0Var.getAdapter();
            tr trVar = urVar.e;
            if (adapter != trVar) {
                ai.w0 w0Var2 = urVar.f38099c;
                w0Var2.Y1 = true;
                w0Var2.Z1 = 0;
                w0Var2.setAdapter(trVar);
                urVar.f38099c.setFastScrollVisible(false);
                urVar.f38099c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tr.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View view;
        org.telegram.ui.ActionBar.e6 e6Var;
        ur urVar = this.f37774y;
        if (i10 != 0) {
            e6Var = ((org.telegram.ui.ActionBar.n2) urVar).resourceProvider;
            view = new org.telegram.ui.Cells.u3(this.f37767c, 26, e6Var);
            view.setBackground(null);
        } else {
            if (urVar.f38105e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(2, 2, this.f37767c, null, z10);
            a5Var.G = true;
            a5Var.setDelegate(new sr(this));
            view = a5Var;
        }
        return new s4.c1(view);
    }
}
