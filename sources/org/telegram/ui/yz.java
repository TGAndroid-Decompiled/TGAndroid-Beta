package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class yz extends org.telegram.ui.Components.kj0 {
    public final Context f52150r;
    public final xz f52151s = new xz(this);
    public final b00 f52152w;

    public yz(b00 b00Var, Context context) {
        this.f52152w = b00Var;
        this.f52150r = context;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.pj0 pj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        b00 b00Var = this.f52152w;
        int i10 = 1;
        if (i7 >= b00Var.f43877n.size()) {
            return 1;
        }
        int size = ((ArrayList) b00Var.f43882r.get(b00Var.f43877n.get(i7))).size();
        if (i7 == 0) {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final Object O(int i7, int i10) {
        return null;
    }

    @Override
    public final int P(int i7, int i10) {
        if (i7 < this.f52152w.f43877n.size()) {
            if (i7 != 0 && i10 == 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final int R() {
        b00 b00Var = this.f52152w;
        ArrayList arrayList = b00Var.f43877n;
        int i7 = 0;
        if (b00Var.f43869f.isEmpty() || (arrayList.isEmpty() && b00Var.M)) {
            return 0;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !b00Var.N) {
            i7 = 1;
        }
        return size + i7;
    }

    @Override
    public final View T(int i7, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.x3(this.f52150r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27910e7, false) & (-218103809));
        }
        if (i7 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        b00 b00Var = this.f52152w;
        if (i7 < b00Var.f43877n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.id.e0(((org.telegram.messenger.ij) ((ArrayList) b00Var.f43882r.get((String) b00Var.f43877n.get(i7))).get(0)).f23266k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        return true;
    }

    @Override
    public final void W(int i7, int i10, v4.d1 d1Var) {
        boolean z9;
        b00 b00Var = this.f52152w;
        ArrayList arrayList = b00Var.f43877n;
        int i11 = d1Var.f57056f;
        View view = d1Var.f57052a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) b00Var.f43882r.get((String) arrayList.get(i7));
            int i12 = d1Var.f57056f;
            boolean z10 = false;
            if (i12 != 0) {
                if (i12 == 1) {
                    if (i7 != 0) {
                        i10--;
                    }
                    org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList2.get(i10);
                    if (k7Var.getMessage() != null && k7Var.getMessage().e1() == ijVar.e1()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (i10 != arrayList2.size() - 1 || (i7 == arrayList.size() - 1 && b00Var.M)) {
                        z10 = true;
                    }
                    k7Var.D = z10;
                    k7Var.e();
                    k7Var.f29450b0 = ijVar;
                    k7Var.requestLayout();
                    k7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.sj(this, k7Var, ijVar, z9, 4));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.id.e0(((org.telegram.messenger.ij) arrayList2.get(0)).f23266k.date, false));
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x3 x3Var;
        Context context = this.f52150r;
        if (i7 != 0) {
            if (i7 != 1) {
                org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
                lzVar.setViewType(5);
                lzVar.setIsSingleCell(true);
                x3Var = lzVar;
            } else {
                org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(1, context, null);
                k7Var.setDelegate(this.f52151s);
                x3Var = k7Var;
            }
        } else {
            x3Var = new org.telegram.ui.Cells.x3(context, null);
        }
        return jg.g.r(x3Var, x3Var, -1, -2);
    }
}
