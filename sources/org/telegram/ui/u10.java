package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.u10;
import org.telegram.ui.w10;
public final class u10 extends org.telegram.ui.Components.xl0 {
    public final Context f38104c;
    public final w10 d;

    public u10(w10 w10Var, Context context) {
        this.d = w10Var;
        this.f38104c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        w10 w10Var = this.d;
        ArrayList arrayList = w10Var.f38763f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / w10Var.f38778s)) + (!w10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        w10 w10Var = this.d;
        if (i10 < ((int) Math.ceil(w10Var.f38763f.size() / w10Var.f38778s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        w10 w10Var = this.d;
        o10 o10Var = w10Var.S;
        ArrayList arrayList = w10Var.f38763f;
        int i11 = c1Var.f43008f;
        View view = c1Var.f43005a;
        boolean z11 = true;
        if (i11 == 0) {
            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
            u7Var.setItemsCount(w10Var.f38778s);
            if (i10 != 0) {
                z11 = false;
            }
            u7Var.setIsFirst(z11);
            int i12 = 0;
            while (true) {
                int i13 = w10Var.f38778s;
                if (i12 < i13) {
                    int i14 = (i13 * i10) + i12;
                    if (i14 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i14);
                        u7Var.c(i12, arrayList.indexOf(messageObject), messageObject);
                        if (w10Var.f38773o0.g()) {
                            int id2 = messageObject.getId();
                            o10Var.f36121a = messageObject.getDialogId();
                            o10Var.f36122b = id2;
                            u7Var.b(i12, w10Var.f38773o0.c(o10Var));
                        } else {
                            u7Var.b(i12, false);
                        }
                    } else {
                        u7Var.c(i12, i14, null);
                    }
                    i12++;
                } else {
                    u7Var.requestLayout();
                    return;
                }
            }
        } else if (i11 == 3) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            s2Var.f21014s2 = z10;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
            z11 = (s2Var.getMessage() == null || s2Var.getMessage().getId() != messageObject2.getId()) ? false : false;
            s2Var.O = w10Var.f38774p0;
            s2Var.W(messageObject2.getDialogId(), messageObject2, messageObject2.messageOwner.date, false, false);
            if (w10Var.f38773o0.g()) {
                int id3 = messageObject2.getId();
                o10Var.f36121a = messageObject2.getDialogId();
                o10Var.f36122b = id3;
                s2Var.V(w10Var.f38773o0.c(o10Var), z11);
                return;
            }
            s2Var.V(false, z11);
        } else if (i11 == 1) {
            int i15 = w10Var.f38778s;
            ((org.telegram.ui.Components.v00) view).v = i15 - ((((int) Math.ceil(arrayList.size() / w10Var.f38778s)) * i15) - arrayList.size());
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        k10 k10Var;
        k10 k10Var2;
        Context context = this.f38104c;
        if (i10 != 0) {
            if (i10 != 2) {
                k10Var2 = new k10(this, context, 1);
                k10Var2.setIsSingleCell(true);
                k10Var2.setViewType(2);
                return com.google.android.gms.internal.vision.e2.k(k10Var2, k10Var2, -1, -2);
            }
            ?? v3Var = new org.telegram.ui.Cells.v3(context, null);
            v3Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.e7, false) & (-218103809));
            k10Var = v3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f21663n = paint;
            frameLayout.f21665s = UserConfig.selectedAccount;
            frameLayout.f21664r = 1;
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Lh, false));
            frameLayout.f21660b = new MessageObject[6];
            frameLayout.f21659a = new org.telegram.ui.Cells.q7[6];
            frameLayout.f21661c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                frameLayout.f21659a[i11] = new org.telegram.ui.Cells.q7(frameLayout, context);
                frameLayout.addView(frameLayout.f21659a[i11]);
                frameLayout.f21659a[i11].setVisibility(4);
                frameLayout.f21659a[i11].setTag(Integer.valueOf(i11));
                frameLayout.f21659a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f21659a[i11].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        u7 u7Var = u7.this;
                        if (u7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            r7 r7Var = u7Var.d;
                            int i12 = u7Var.f21661c[intValue];
                            MessageObject messageObject = u7Var.f21660b[intValue];
                            org.telegram.ui.g gVar = (org.telegram.ui.g) r7Var;
                            w10 w10Var = ((u10) gVar.f33670b).d;
                            if (w10Var.f38773o0.g()) {
                                w10 w10Var2 = ((u10) gVar.f33670b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = w10.f38754s0;
                                w10Var2.f(i12, u7Var, messageObject, intValue);
                                return true;
                            }
                            w10.a(w10Var, messageObject, u7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new g(this, 17));
            k10Var = frameLayout;
        }
        k10Var2 = k10Var;
        return com.google.android.gms.internal.vision.e2.k(k10Var2, k10Var2, -1, -2);
    }
}
