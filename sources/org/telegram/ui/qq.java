package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class qq extends org.telegram.ui.Components.oj0 {
    public final rq D;
    public final Context f49123c;
    public final jg.z1 h;
    public oq f49126n;
    public boolean f49128s;
    public int f49129w;
    public int f49130x;
    public int f49131y;
    public ArrayList d = new ArrayList();
    public a0.h f49124e = new a0.h();
    public ArrayList f49125f = new ArrayList();
    public int f49127r = 0;

    public qq(rq rqVar, Context context) {
        this.D = rqVar;
        this.f49123c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.h = z1Var;
        z1Var.f16992a = new pq(this);
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57052a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57056f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i7) {
        jg.z1 z1Var = this.h;
        int size = z1Var.f16997g.size();
        if (size != 0) {
            int i10 = size + 1;
            if (i10 > i7) {
                if (i7 == 0) {
                    return null;
                }
                return (TLObject) z1Var.f16997g.get(i7 - 1);
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
        int size3 = z1Var.f16995e.size();
        if (size3 == 0 || size3 + 1 <= i7 || i7 == 0) {
            return null;
        }
        return (TLObject) z1Var.f16995e.get(i7 - 1);
    }

    public final void F(String str) {
        boolean z9;
        long j3;
        if (this.f49126n != null) {
            Utilities.f21343g.a(this.f49126n);
            this.f49126n = null;
        }
        this.d.clear();
        this.f49124e.b();
        this.f49125f.clear();
        this.h.f(null, null);
        jg.z1 z1Var = this.h;
        rq rqVar = this.D;
        if (rqVar.N != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (org.telegram.messenger.t3.T(rqVar.f49525n)) {
            j3 = this.D.M;
        } else {
            j3 = 0;
        }
        z1Var.g(null, z9, false, true, false, j3, false, this.D.N, 0);
        f();
        if (!TextUtils.isEmpty(str)) {
            this.f49128s = true;
            this.D.f49499b.e(true, true);
            org.telegram.messenger.p5 p5Var = Utilities.f21343g;
            oq oqVar = new oq(this, str, 0);
            this.f49126n = oqVar;
            p5Var.d(oqVar, 300L);
        }
    }

    @Override
    public final int b() {
        return this.f49127r;
    }

    @Override
    public final int d(int i7) {
        if (i7 != this.f49131y && i7 != this.f49129w && i7 != this.f49130x) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void f() {
        bi.q1 q1Var;
        this.f49127r = 0;
        jg.z1 z1Var = this.h;
        int size = z1Var.f16997g.size();
        if (size != 0) {
            this.f49129w = 0;
            this.f49127r = size + 1 + this.f49127r;
        } else {
            this.f49129w = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i7 = this.f49127r;
            this.f49130x = i7;
            this.f49127r = size2 + 1 + i7;
        } else {
            this.f49130x = -1;
        }
        int size3 = z1Var.f16995e.size();
        if (size3 != 0) {
            int i10 = this.f49127r;
            this.f49131y = i10;
            this.f49127r = size3 + 1 + i10;
        } else {
            this.f49131y = -1;
        }
        rq rqVar = this.D;
        if (rqVar.n1 && (q1Var = rqVar.f49502c) != null) {
            v4.g0 adapter = q1Var.getAdapter();
            qq qqVar = rqVar.f49507e;
            if (adapter != qqVar) {
                bi.q1 q1Var2 = rqVar.f49502c;
                q1Var2.W1 = true;
                q1Var2.X1 = 0;
                q1Var2.setAdapter(qqVar);
                rqVar.f49502c.setFastScrollVisible(false);
                rqVar.f49502c.setVerticalScrollBarEnabled(true);
            }
        }
        super.f();
    }

    @Override
    public final void t(v4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qq.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        boolean z9;
        View view;
        org.telegram.ui.ActionBar.h6 h6Var;
        rq rqVar = this.D;
        if (i7 != 0) {
            h6Var = ((org.telegram.ui.ActionBar.f2) rqVar).resourceProvider;
            view = new org.telegram.ui.Cells.x3(26, this.f49123c, h6Var);
            view.setBackground(null);
        } else {
            if (rqVar.f49506d1 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f49123c, 2, 2, z9, null);
            a5Var.G = true;
            a5Var.setDelegate(new pq(this));
            view = a5Var;
        }
        return new v4.d1(view);
    }
}
