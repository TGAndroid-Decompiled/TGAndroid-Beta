package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class w10 extends org.telegram.ui.Components.im0 {
    public final Context f40831r;
    public final int f40832s;
    public final b20 v;

    public w10(b20 b20Var, Context context, int i10) {
        this.v = b20Var;
        this.f40831r = context;
        this.f40832s = i10;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.mm0 mm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        b20 b20Var = this.v;
        int i11 = 1;
        if (i10 >= b20Var.f34177n.size()) {
            return 1;
        }
        int size = ((ArrayList) b20Var.f34182r.get(b20Var.f34177n.get(i10))).size();
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
        if (i10 >= this.v.f34177n.size()) {
            return 2;
        }
        if (i10 != 0 && i11 == 0) {
            return 0;
        }
        int i12 = this.f40832s;
        if (i12 != 2 && i12 != 4) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int R() {
        b20 b20Var = this.v;
        int i10 = 0;
        if (b20Var.f34177n.isEmpty()) {
            return 0;
        }
        int size = b20Var.f34177n.size();
        if (!b20Var.f34177n.isEmpty() && !b20Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.f40831r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        b20 b20Var = this.v;
        if (i10 < b20Var.f34177n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) b20Var.f34182r.get((String) b20Var.f34177n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        if (i10 != 0 && i11 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void W(int i10, int i11, s4.b1 b1Var) {
        boolean z10;
        boolean z11;
        b20 b20Var = this.v;
        ArrayList arrayList = b20Var.f34177n;
        int i12 = b1Var.f44841f;
        View view = b1Var.f44838a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) b20Var.f34182r.get((String) arrayList.get(i10));
            int i13 = b1Var.f44841f;
            boolean z12 = false;
            if (i13 != 0) {
                boolean z13 = true;
                if (i13 != 1) {
                    if (i13 == 3) {
                        if (i10 != 0) {
                            i11--;
                        }
                        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                        MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                        if (i7Var.getMessage() != null && i7Var.getMessage().getId() == messageObject.getId()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && b20Var.M)) {
                            z12 = true;
                        }
                        i7Var.f(messageObject, z12);
                        i7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.nk(this, i7Var, messageObject, z11, 3));
                        return;
                    }
                    return;
                }
                if (i10 != 0) {
                    i11--;
                }
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i11);
                if (j7Var.getMessage() != null && j7Var.getMessage().getId() == messageObject2.getId()) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                if (i11 == arrayList2.size() - 1 && (i10 != arrayList.size() - 1 || !b20Var.M)) {
                    z13 = z10;
                }
                j7Var.c(messageObject2, z13);
                j7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.nk(this, j7Var, messageObject2, z12, 2));
                return;
            }
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.f40831r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    frameLayout2 = new v10(this, context);
                    return com.google.android.gms.internal.play_billing.k3.l(frameLayout2, frameLayout2, -1, -2);
                }
                org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null);
                int i11 = this.f40832s;
                if (i11 != 2 && i11 != 4) {
                    f10Var.setViewType(3);
                } else {
                    f10Var.setViewType(4);
                }
                f10Var.setIsSingleCell(true);
                frameLayout = f10Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.j7(context, 2, null);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.v3(context, null);
        }
        frameLayout2 = frameLayout;
        return com.google.android.gms.internal.play_billing.k3.l(frameLayout2, frameLayout2, -1, -2);
    }
}
