package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class r10 extends org.telegram.ui.Components.ul0 {
    public final Context f36945r;
    public final int f36946s;
    public final w10 v;

    public r10(w10 w10Var, Context context, int i10) {
        this.v = w10Var;
        this.f36945r = context;
        this.f36946s = i10;
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
        w10 w10Var = this.v;
        int i11 = 1;
        if (i10 >= w10Var.f38771n.size()) {
            return 1;
        }
        int size = ((ArrayList) w10Var.f38776r.get(w10Var.f38771n.get(i10))).size();
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
        if (i10 >= this.v.f38771n.size()) {
            return 2;
        }
        if (i10 != 0 && i11 == 0) {
            return 0;
        }
        int i12 = this.f36946s;
        if (i12 != 2 && i12 != 4) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int R() {
        w10 w10Var = this.v;
        int i10 = 0;
        if (w10Var.f38771n.isEmpty()) {
            return 0;
        }
        int size = w10Var.f38771n.size();
        if (!w10Var.f38771n.isEmpty() && !w10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.f36945r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        w10 w10Var = this.v;
        if (i10 < w10Var.f38771n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) w10Var.f38776r.get((String) w10Var.f38771n.get(i10))).get(0)).messageOwner.date));
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
        w10 w10Var = this.v;
        ArrayList arrayList = w10Var.f38771n;
        int i12 = c1Var.f43008f;
        View view = c1Var.f43005a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) w10Var.f38776r.get((String) arrayList.get(i10));
            int i13 = c1Var.f43008f;
            boolean z11 = false;
            if (i13 != 0) {
                boolean z12 = true;
                if (i13 != 1) {
                    if (i13 == 3) {
                        if (i10 != 0) {
                            i11--;
                        }
                        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                        MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                        if (j7Var.getMessage() != null && j7Var.getMessage().getId() == messageObject.getId()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && w10Var.M)) {
                            z11 = true;
                        }
                        j7Var.f(messageObject, z11);
                        j7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.ok(this, j7Var, messageObject, z10, 3));
                        return;
                    }
                    return;
                }
                if (i10 != 0) {
                    i11--;
                }
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i11);
                if (k7Var.getMessage() != null && k7Var.getMessage().getId() == messageObject2.getId()) {
                    z11 = true;
                }
                if (i11 == arrayList2.size() - 1 && (i10 != arrayList.size() - 1 || !w10Var.M)) {
                    z12 = false;
                }
                k7Var.c(messageObject2, z12);
                k7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.ok(this, k7Var, messageObject2, z11, 2));
                return;
            }
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.f36945r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    frameLayout2 = new q10(this, context);
                    return com.google.android.gms.internal.vision.e2.k(frameLayout2, frameLayout2, -1, -2);
                }
                org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(context, null);
                int i11 = this.f36946s;
                if (i11 != 2 && i11 != 4) {
                    v00Var.setViewType(3);
                } else {
                    v00Var.setViewType(4);
                }
                v00Var.setIsSingleCell(true);
                frameLayout = v00Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.k7(context, 2, null);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.v3(context, null);
        }
        frameLayout2 = frameLayout;
        return com.google.android.gms.internal.vision.e2.k(frameLayout2, frameLayout2, -1, -2);
    }
}
