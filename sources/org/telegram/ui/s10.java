package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class s10 extends org.telegram.ui.Components.ul0 {
    public final Context f37296r;
    public final int f37297s;
    public final x10 v;

    public s10(x10 x10Var, Context context, int i10) {
        this.v = x10Var;
        this.f37296r = context;
        this.f37297s = i10;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.yl0 yl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        x10 x10Var = this.v;
        int i11 = 1;
        if (i10 >= x10Var.f39332n.size()) {
            return 1;
        }
        int size = ((ArrayList) x10Var.f39337r.get(x10Var.f39332n.get(i10))).size();
        if (i10 == 0) {
            i11 = 0;
        }
        return size + i11;
    }

    @Override
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i10 >= this.v.f39332n.size()) {
            return 2;
        }
        if (i10 != 0 && i11 == 0) {
            return 0;
        }
        int i12 = this.f37297s;
        if (i12 != 2 && i12 != 4) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int R() {
        x10 x10Var = this.v;
        int i10 = 0;
        if (x10Var.f39332n.isEmpty()) {
            return 0;
        }
        int size = x10Var.f39332n.size();
        if (!x10Var.f39332n.isEmpty() && !x10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.w3(this.f37296r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        x10 x10Var = this.v;
        if (i10 < x10Var.f39332n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.w3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) x10Var.f39337r.get((String) x10Var.f39332n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i10 != 0 && i11 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        boolean z10;
        x10 x10Var = this.v;
        ArrayList arrayList = x10Var.f39332n;
        int i12 = c1Var.f42998f;
        View view = c1Var.f42995a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) x10Var.f39337r.get((String) arrayList.get(i10));
            int i13 = c1Var.f42998f;
            boolean z11 = false;
            if (i13 != 0) {
                boolean z12 = true;
                if (i13 != 1) {
                    if (i13 == 3) {
                        if (i10 != 0) {
                            i11--;
                        }
                        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                        MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                        if (k7Var.getMessage() != null && k7Var.getMessage().getId() == messageObject.getId()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && x10Var.M)) {
                            z11 = true;
                        }
                        k7Var.f(messageObject, z11);
                        k7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.mk(this, k7Var, messageObject, z10, 3));
                        return;
                    }
                    return;
                }
                if (i10 != 0) {
                    i11--;
                }
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i11);
                if (l7Var.getMessage() != null && l7Var.getMessage().getId() == messageObject2.getId()) {
                    z11 = true;
                }
                if (i11 == arrayList2.size() - 1 && (i10 != arrayList.size() - 1 || !x10Var.M)) {
                    z12 = false;
                }
                l7Var.c(messageObject2, z12);
                l7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.mk(this, l7Var, messageObject2, z11, 2));
                return;
            }
            ((org.telegram.ui.Cells.w3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.f37296r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    frameLayout2 = new r10(this, context);
                    return com.google.android.gms.internal.vision.e2.k(frameLayout2, frameLayout2, -1, -2);
                }
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
                int i11 = this.f37297s;
                if (i11 != 2 && i11 != 4) {
                    t00Var.setViewType(3);
                } else {
                    t00Var.setViewType(4);
                }
                t00Var.setIsSingleCell(true);
                frameLayout = t00Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.l7(context, 2, null);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.w3(context, null);
        }
        frameLayout2 = frameLayout;
        return com.google.android.gms.internal.vision.e2.k(frameLayout2, frameLayout2, -1, -2);
    }
}
