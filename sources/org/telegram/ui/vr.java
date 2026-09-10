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
public final class vr extends org.telegram.ui.Components.ul0 {
    public final Context f37609c;
    public final fg.d2 h;
    public tr f37611n;
    public boolean f37613s;
    public int v;
    public int f37614w;
    public int f37615x;
    public final wr f37616y;
    public ArrayList d = new ArrayList();
    public a0.i e = new a0.i();
    public ArrayList f37610f = new ArrayList();
    public int f37612r = 0;

    public vr(wr wrVar, Context context) {
        this.f37616y = wrVar;
        this.f37609c = context;
        fg.d2 d2Var = new fg.d2(true);
        this.h = d2Var;
        d2Var.f7979a = new ur(this);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f41610a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        fg.d2 d2Var = this.h;
        int size = d2Var.f7983g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) d2Var.f7983g.get(i10 - 1);
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
        int size3 = d2Var.e.size();
        if (size3 == 0 || size3 + 1 <= i10 || i10 == 0) {
            return null;
        }
        return (TLObject) d2Var.e.get(i10 - 1);
    }

    public final void F(String str) {
        boolean z10;
        long j3;
        if (this.f37611n != null) {
            Utilities.searchQueue.cancelRunnable(this.f37611n);
            this.f37611n = null;
        }
        this.d.clear();
        this.e.b();
        this.f37610f.clear();
        this.h.f(null, null);
        fg.d2 d2Var = this.h;
        wr wrVar = this.f37616y;
        if (wrVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(wrVar.f38354r)) {
            j3 = this.f37616y.N;
        } else {
            j3 = 0;
        }
        d2Var.g(null, z10, false, true, false, j3, false, this.f37616y.O, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f37613s = true;
            this.f37616y.f38320b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            tr trVar = new tr(this, str, 0);
            this.f37611n = trVar;
            dispatchQueue.postRunnable(trVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f37612r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f37615x && i10 != this.v && i10 != this.f37614w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        bi.y1 y1Var;
        this.f37612r = 0;
        fg.d2 d2Var = this.h;
        int size = d2Var.f7983g.size();
        if (size != 0) {
            this.v = 0;
            this.f37612r = size + 1 + this.f37612r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f37612r;
            this.f37614w = i10;
            this.f37612r = size2 + 1 + i10;
        } else {
            this.f37614w = -1;
        }
        int size3 = d2Var.e.size();
        if (size3 != 0) {
            int i11 = this.f37612r;
            this.f37615x = i11;
            this.f37612r = size3 + 1 + i11;
        } else {
            this.f37615x = -1;
        }
        wr wrVar = this.f37616y;
        if (wrVar.f38349o1 && (y1Var = wrVar.f38323c) != null) {
            s4.h0 adapter = y1Var.getAdapter();
            vr vrVar = wrVar.e;
            if (adapter != vrVar) {
                bi.y1 y1Var2 = wrVar.f38323c;
                y1Var2.Y1 = true;
                y1Var2.Z1 = 0;
                y1Var2.setAdapter(vrVar);
                wrVar.f38323c.setFastScrollVisible(false);
                wrVar.f38323c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vr.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        wr wrVar = this.f37616y;
        if (i10 != 0) {
            f6Var = ((org.telegram.ui.ActionBar.p2) wrVar).resourceProvider;
            view = new org.telegram.ui.Cells.u3(this.f37609c, 26, f6Var);
            view.setBackground(null);
        } else {
            if (wrVar.f38329e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f37609c, null, z10);
            b5Var.G = true;
            b5Var.setDelegate(new ur(this));
            view = b5Var;
        }
        return new s4.c1(view);
    }
}
