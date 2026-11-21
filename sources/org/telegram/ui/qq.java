package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class qq extends org.telegram.ui.Components.dk0 {
    public final rq E;
    public final Context f51318c;
    public final jg.z1 h;
    public oq f51321n;
    public boolean f51323s;
    public int f51324w;
    public int f51325x;
    public int f51326y;
    public ArrayList d = new ArrayList();
    public a0.h f51319e = new a0.h();
    public ArrayList f51320f = new ArrayList();
    public int f51322r = 0;

    public qq(rq rqVar, Context context) {
        this.E = rqVar;
        this.f51318c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.h = z1Var;
        z1Var.f17752a = new pq(this);
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59161a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59165f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i7) {
        jg.z1 z1Var = this.h;
        int size = z1Var.f17757g.size();
        if (size != 0) {
            int i10 = size + 1;
            if (i10 > i7) {
                if (i7 == 0) {
                    return null;
                }
                return (TLObject) z1Var.f17757g.get(i7 - 1);
            }
            i7 -= i10;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i11 = size2 + 1;
            if (i11 > i7) {
                if (i7 == 0) {
                    return null;
                }
                return (TLObject) this.d.get(i7 - 1);
            }
            i7 -= i11;
        }
        int size3 = z1Var.f17755e.size();
        if (size3 == 0 || size3 + 1 <= i7 || i7 == 0) {
            return null;
        }
        return (TLObject) z1Var.f17755e.get(i7 - 1);
    }

    public final void F(String str) {
        boolean z10;
        long j3;
        if (this.f51321n != null) {
            Utilities.f22809g.a(this.f51321n);
            this.f51321n = null;
        }
        this.d.clear();
        this.f51319e.b();
        this.f51320f.clear();
        this.h.f(null, null);
        jg.z1 z1Var = this.h;
        rq rqVar = this.E;
        if (rqVar.O != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (org.telegram.messenger.v3.T(rqVar.f51720n)) {
            j3 = this.E.N;
        } else {
            j3 = 0;
        }
        z1Var.g(null, z10, false, true, false, j3, false, this.E.O, 0);
        f();
        if (!TextUtils.isEmpty(str)) {
            this.f51323s = true;
            this.E.f51694b.e(true, true);
            org.telegram.messenger.q5 q5Var = Utilities.f22809g;
            oq oqVar = new oq(this, str, 0);
            this.f51321n = oqVar;
            q5Var.d(oqVar, 300L);
        }
    }

    @Override
    public final int b() {
        return this.f51322r;
    }

    @Override
    public final int d(int i7) {
        if (i7 != this.f51326y && i7 != this.f51324w && i7 != this.f51325x) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void f() {
        di.b1 b1Var;
        this.f51322r = 0;
        jg.z1 z1Var = this.h;
        int size = z1Var.f17757g.size();
        if (size != 0) {
            this.f51324w = 0;
            this.f51322r = size + 1 + this.f51322r;
        } else {
            this.f51324w = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i7 = this.f51322r;
            this.f51325x = i7;
            this.f51322r = size2 + 1 + i7;
        } else {
            this.f51325x = -1;
        }
        int size3 = z1Var.f17755e.size();
        if (size3 != 0) {
            int i10 = this.f51322r;
            this.f51326y = i10;
            this.f51322r = size3 + 1 + i10;
        } else {
            this.f51326y = -1;
        }
        rq rqVar = this.E;
        if (rqVar.f51723o1 && (b1Var = rqVar.f51697c) != null) {
            v4.i0 adapter = b1Var.getAdapter();
            qq qqVar = rqVar.f51702e;
            if (adapter != qqVar) {
                di.b1 b1Var2 = rqVar.f51697c;
                b1Var2.X1 = true;
                b1Var2.Y1 = 0;
                b1Var2.setAdapter(qqVar);
                rqVar.f51697c.setFastScrollVisible(false);
                rqVar.f51697c.setVerticalScrollBarEnabled(true);
            }
        }
        super.f();
    }

    @Override
    public final void t(v4.f1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qq.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        boolean z10;
        View view;
        org.telegram.ui.ActionBar.h6 h6Var;
        rq rqVar = this.E;
        if (i7 != 0) {
            h6Var = ((org.telegram.ui.ActionBar.g2) rqVar).resourceProvider;
            view = new org.telegram.ui.Cells.y3(26, this.f51318c, h6Var);
            view.setBackground(null);
        } else {
            if (rqVar.f51704e1 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(this.f51318c, 2, 2, z10, null);
            b5Var.H = true;
            b5Var.setDelegate(new pq(this));
            view = b5Var;
        }
        return new v4.f1(view);
    }
}
