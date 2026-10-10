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
public final class sr extends org.telegram.ui.Components.qm0 {
    public final Context f41795c;
    public final gg.b2 h;
    public qr f41798n;
    public boolean f41800s;
    public int v;
    public int f41801w;
    public int f41802x;
    public final tr f41803y;
    public ArrayList d = new ArrayList();
    public a0.i f41796e = new a0.i();
    public ArrayList f41797f = new ArrayList();
    public int f41799r = 0;

    public sr(tr trVar, Context context) {
        this.f41803y = trVar;
        this.f41795c = context;
        gg.b2 b2Var = new gg.b2(true);
        this.h = b2Var;
        b2Var.f10532a = new rr(this);
    }

    @Override
    public final void A(s4.d1 d1Var) {
        View view = d1Var.f47702a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47706f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        gg.b2 b2Var = this.h;
        int size = b2Var.f10537g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) b2Var.f10537g.get(i10 - 1);
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
        int size3 = b2Var.f10535e.size();
        if (size3 == 0 || size3 + 1 <= i10 || i10 == 0) {
            return null;
        }
        return (TLObject) b2Var.f10535e.get(i10 - 1);
    }

    public final void F(String str) {
        boolean z10;
        long j3;
        if (this.f41798n != null) {
            Utilities.searchQueue.cancelRunnable(this.f41798n);
            this.f41798n = null;
        }
        this.d.clear();
        this.f41796e.b();
        this.f41797f.clear();
        this.h.f(null, null);
        gg.b2 b2Var = this.h;
        tr trVar = this.f41803y;
        if (trVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ChatObject.isChannel(trVar.f42134r)) {
            j3 = this.f41803y.N;
        } else {
            j3 = 0;
        }
        b2Var.g(null, z10, false, true, false, j3, false, this.f41803y.O, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f41800s = true;
            this.f41803y.f42099b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            qr qrVar = new qr(this, str, 0);
            this.f41798n = qrVar;
            dispatchQueue.postRunnable(qrVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f41799r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f41802x && i10 != this.v && i10 != this.f41801w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        ai.w0 w0Var;
        this.f41799r = 0;
        gg.b2 b2Var = this.h;
        int size = b2Var.f10537g.size();
        if (size != 0) {
            this.v = 0;
            this.f41799r = size + 1 + this.f41799r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f41799r;
            this.f41801w = i10;
            this.f41799r = size2 + 1 + i10;
        } else {
            this.f41801w = -1;
        }
        int size3 = b2Var.f10535e.size();
        if (size3 != 0) {
            int i11 = this.f41799r;
            this.f41802x = i11;
            this.f41799r = size3 + 1 + i11;
        } else {
            this.f41802x = -1;
        }
        tr trVar = this.f41803y;
        if (trVar.f42129o1 && (w0Var = trVar.f42102c) != null) {
            s4.i0 adapter = w0Var.getAdapter();
            sr srVar = trVar.f42107e;
            if (adapter != srVar) {
                ai.w0 w0Var2 = trVar.f42102c;
                w0Var2.W1 = true;
                w0Var2.X1 = 0;
                w0Var2.setAdapter(srVar);
                trVar.f42102c.setFastScrollVisible(false);
                trVar.f42102c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.d1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sr.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        View view;
        org.telegram.ui.ActionBar.e6 e6Var;
        tr trVar = this.f41803y;
        if (i10 != 0) {
            e6Var = ((org.telegram.ui.ActionBar.n2) trVar).resourceProvider;
            view = new org.telegram.ui.Cells.v3(this.f41795c, 26, e6Var);
            view.setBackground(null);
        } else {
            if (trVar.f42109e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(2, 2, this.f41795c, null, z10);
            b5Var.G = true;
            b5Var.setDelegate(new rr(this));
            view = b5Var;
        }
        return new s4.d1(view);
    }
}
