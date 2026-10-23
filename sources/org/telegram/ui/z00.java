package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class z00 extends org.telegram.ui.Components.fm0 {
    public final Context f43588r;
    public final int f43589s;
    public final e10 v;

    public z00(e10 e10Var, Context context, int i10) {
        this.v = e10Var;
        this.f43588r = context;
        this.f43589s = i10;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.jm0 jm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        e10 e10Var = this.v;
        int i11 = 1;
        if (i10 >= e10Var.f36512n.size()) {
            return 1;
        }
        int size = ((ArrayList) e10Var.f36517r.get(e10Var.f36512n.get(i10))).size();
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
        if (i10 >= this.v.f36512n.size()) {
            return 2;
        }
        if (i10 != 0 && i11 == 0) {
            return 0;
        }
        int i12 = this.f43589s;
        if (i12 != 2 && i12 != 4) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int R() {
        e10 e10Var = this.v;
        int i10 = 0;
        if (e10Var.f36512n.isEmpty()) {
            return 0;
        }
        int size = e10Var.f36512n.size();
        if (!e10Var.f36512n.isEmpty() && !e10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.f43588r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        e10 e10Var = this.v;
        if (i10 < e10Var.f36512n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) e10Var.f36517r.get((String) e10Var.f36512n.get(i10))).get(0)).messageOwner.date));
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
        e10 e10Var = this.v;
        ArrayList arrayList = e10Var.f36512n;
        int i12 = b1Var.f45924f;
        View view = b1Var.f45921a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) e10Var.f36517r.get((String) arrayList.get(i10));
            int i13 = b1Var.f45924f;
            boolean z12 = false;
            if (i13 != 0) {
                boolean z13 = true;
                if (i13 != 1) {
                    if (i13 == 3) {
                        if (i10 != 0) {
                            i11--;
                        }
                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                        MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                        if (h7Var.getMessage() != null && h7Var.getMessage().getId() == messageObject.getId()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && e10Var.M)) {
                            z12 = true;
                        }
                        h7Var.f(messageObject, z12);
                        h7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.lk(this, h7Var, messageObject, z11, 3));
                        return;
                    }
                    return;
                }
                if (i10 != 0) {
                    i11--;
                }
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i11);
                if (i7Var.getMessage() != null && i7Var.getMessage().getId() == messageObject2.getId()) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                if (i11 == arrayList2.size() - 1 && (i10 != arrayList.size() - 1 || !e10Var.M)) {
                    z13 = z10;
                }
                i7Var.c(messageObject2, z13);
                i7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.lk(this, i7Var, messageObject2, z12, 2));
                return;
            }
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.f43588r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    frameLayout2 = new y00(this, context);
                    return com.google.android.gms.internal.play_billing.k3.l(frameLayout2, frameLayout2, -1, -2);
                }
                org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
                int i11 = this.f43589s;
                if (i11 != 2 && i11 != 4) {
                    b10Var.setViewType(3);
                } else {
                    b10Var.setViewType(4);
                }
                b10Var.setIsSingleCell(true);
                frameLayout = b10Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.i7(context, 2, null);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.u3(context, null);
        }
        frameLayout2 = frameLayout;
        return com.google.android.gms.internal.play_billing.k3.l(frameLayout2, frameLayout2, -1, -2);
    }
}
