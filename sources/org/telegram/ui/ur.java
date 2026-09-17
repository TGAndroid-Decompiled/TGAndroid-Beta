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
public final class ur extends org.telegram.ui.Components.kl0 {
    public final Context f41230c;
    public final hg.b2 h;
    public sr f41233n;
    public boolean f41235s;
    public int v;
    public int f41236w;
    public int f41237x;
    public final vr f41238y;
    public ArrayList d = new ArrayList();
    public a0.i f41231e = new a0.i();
    public ArrayList f41232f = new ArrayList();
    public int f41234r = 0;

    public ur(vr vrVar, Context context) {
        this.f41238y = vrVar;
        this.f41230c = context;
        hg.b2 b2Var = new hg.b2(true);
        this.h = b2Var;
        b2Var.f11005a = new tr(this);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f45767a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45771f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        hg.b2 b2Var = this.h;
        int size = b2Var.f11010g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) b2Var.f11010g.get(i10 - 1);
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
        int size3 = b2Var.f11008e.size();
        if (size3 == 0 || size3 + 1 <= i10 || i10 == 0) {
            return null;
        }
        return (TLObject) b2Var.f11008e.get(i10 - 1);
    }

    public final void F(String str) {
        boolean z10;
        long j3;
        if (this.f41233n != null) {
            Utilities.searchQueue.cancelRunnable(this.f41233n);
            this.f41233n = null;
        }
        this.d.clear();
        this.f41231e.b();
        this.f41232f.clear();
        this.h.f(null, null);
        hg.b2 b2Var = this.h;
        vr vrVar = this.f41238y;
        if (vrVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(vrVar.f41695r)) {
            j3 = this.f41238y.N;
        } else {
            j3 = 0;
        }
        b2Var.g(null, z10, false, true, false, j3, false, this.f41238y.O, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f41235s = true;
            this.f41238y.f41660b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            sr srVar = new sr(this, str, 0);
            this.f41233n = srVar;
            dispatchQueue.postRunnable(srVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f41234r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f41237x && i10 != this.v && i10 != this.f41236w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        bi.o0 o0Var;
        this.f41234r = 0;
        hg.b2 b2Var = this.h;
        int size = b2Var.f11010g.size();
        if (size != 0) {
            this.v = 0;
            this.f41234r = size + 1 + this.f41234r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f41234r;
            this.f41236w = i10;
            this.f41234r = size2 + 1 + i10;
        } else {
            this.f41236w = -1;
        }
        int size3 = b2Var.f11008e.size();
        if (size3 != 0) {
            int i11 = this.f41234r;
            this.f41237x = i11;
            this.f41234r = size3 + 1 + i11;
        } else {
            this.f41237x = -1;
        }
        vr vrVar = this.f41238y;
        if (vrVar.f41690o1 && (o0Var = vrVar.f41663c) != null) {
            s4.h0 adapter = o0Var.getAdapter();
            ur urVar = vrVar.f41668e;
            if (adapter != urVar) {
                bi.o0 o0Var2 = vrVar.f41663c;
                o0Var2.Y1 = true;
                o0Var2.Z1 = 0;
                o0Var2.setAdapter(urVar);
                vrVar.f41663c.setFastScrollVisible(false);
                vrVar.f41663c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ur.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        vr vrVar = this.f41238y;
        if (i10 != 0) {
            f6Var = ((org.telegram.ui.ActionBar.n2) vrVar).resourceProvider;
            view = new org.telegram.ui.Cells.u3(this.f41230c, 26, f6Var);
            view.setBackground(null);
        } else {
            if (vrVar.f41670e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(2, 2, this.f41230c, null, z10);
            a5Var.G = true;
            a5Var.setDelegate(new tr(this));
            view = a5Var;
        }
        return new s4.c1(view);
    }
}
