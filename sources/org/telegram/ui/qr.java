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
public final class qr extends org.telegram.ui.Components.ql0 {
    public final Context f37457c;
    public final tf.j1 h;
    public or f37459n;
    public boolean f37461s;
    public int v;
    public int f37462w;
    public int f37463x;
    public final rr f37464y;
    public ArrayList d = new ArrayList();
    public a0.h e = new a0.h();
    public ArrayList f37458f = new ArrayList();
    public int f37460r = 0;

    public qr(rr rrVar, Context context) {
        this.f37464y = rrVar;
        this.f37457c = context;
        tf.j1 j1Var = new tf.j1(true);
        this.h = j1Var;
        j1Var.f44819a = new pr(this);
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5774a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f != 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        tf.j1 j1Var = this.h;
        int size = j1Var.f44823g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) j1Var.f44823g.get(i10 - 1);
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
        int size3 = j1Var.e.size();
        if (size3 == 0 || size3 + 1 <= i10 || i10 == 0) {
            return null;
        }
        return (TLObject) j1Var.e.get(i10 - 1);
    }

    public final void F(String str) {
        boolean z4;
        long j10;
        if (this.f37459n != null) {
            Utilities.searchQueue.cancelRunnable(this.f37459n);
            this.f37459n = null;
        }
        this.d.clear();
        this.e.b();
        this.f37458f.clear();
        this.h.f(null, null);
        tf.j1 j1Var = this.h;
        rr rrVar = this.f37464y;
        if (rrVar.L != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (ChatObject.isChannel(rrVar.f37992r)) {
            j10 = this.f37464y.K;
        } else {
            j10 = 0;
        }
        j1Var.g(null, z4, false, true, false, j10, false, this.f37464y.L, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            this.f37461s = true;
            this.f37464y.f37958b.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            or orVar = new or(this, str, 0);
            this.f37459n = orVar;
            dispatchQueue.postRunnable(orVar, 300L);
        }
    }

    @Override
    public final int h() {
        return this.f37460r;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.f37463x && i10 != this.v && i10 != this.f37462w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void l() {
        lh.e1 e1Var;
        this.f37460r = 0;
        tf.j1 j1Var = this.h;
        int size = j1Var.f44823g.size();
        if (size != 0) {
            this.v = 0;
            this.f37460r = size + 1 + this.f37460r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f37460r;
            this.f37462w = i10;
            this.f37460r = size2 + 1 + i10;
        } else {
            this.f37462w = -1;
        }
        int size3 = j1Var.e.size();
        if (size3 != 0) {
            int i11 = this.f37460r;
            this.f37463x = i11;
            this.f37460r = size3 + 1 + i11;
        } else {
            this.f37463x = -1;
        }
        rr rrVar = this.f37464y;
        if (rrVar.l1 && (e1Var = rrVar.f37961c) != null) {
            f2.o0 adapter = e1Var.getAdapter();
            qr qrVar = rrVar.e;
            if (adapter != qrVar) {
                lh.e1 e1Var2 = rrVar.f37961c;
                e1Var2.V1 = true;
                e1Var2.W1 = 0;
                e1Var2.setAdapter(qrVar);
                rrVar.f37961c.setFastScrollVisible(false);
                rrVar.f37961c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    @Override
    public final void v(f2.l1 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qr.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        boolean z4;
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        rr rrVar = this.f37464y;
        if (i10 != 0) {
            f6Var = ((org.telegram.ui.ActionBar.p2) rrVar).resourceProvider;
            view = new org.telegram.ui.Cells.t3(this.f37457c, 26, f6Var);
            view.setBackground(null);
        } else {
            if (rrVar.f37960b1 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(2, 2, this.f37457c, null, z4);
            a5Var.D = true;
            a5Var.setDelegate(new pr(this));
            view = a5Var;
        }
        return new f2.l1(view);
    }
}
