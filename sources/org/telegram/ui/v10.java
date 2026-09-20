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
import org.telegram.ui.v10;
import org.telegram.ui.x10;
public final class v10 extends org.telegram.ui.Components.ul0 {
    public final Context f38379c;
    public final x10 d;

    public v10(x10 x10Var, Context context) {
        this.d = x10Var;
        this.f38379c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        x10 x10Var = this.d;
        ArrayList arrayList = x10Var.f39300f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / x10Var.f39315s)) + (!x10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        x10 x10Var = this.d;
        if (i10 < ((int) Math.ceil(x10Var.f39300f.size() / x10Var.f39315s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        x10 x10Var = this.d;
        p10 p10Var = x10Var.S;
        ArrayList arrayList = x10Var.f39300f;
        int i11 = c1Var.f42977f;
        View view = c1Var.f42974a;
        boolean z11 = true;
        if (i11 == 0) {
            org.telegram.ui.Cells.v7 v7Var = (org.telegram.ui.Cells.v7) view;
            v7Var.setItemsCount(x10Var.f39315s);
            if (i10 != 0) {
                z11 = false;
            }
            v7Var.setIsFirst(z11);
            int i12 = 0;
            while (true) {
                int i13 = x10Var.f39315s;
                if (i12 < i13) {
                    int i14 = (i13 * i10) + i12;
                    if (i14 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i14);
                        v7Var.c(i12, arrayList.indexOf(messageObject), messageObject);
                        if (x10Var.f39310o0.g()) {
                            int id2 = messageObject.getId();
                            p10Var.f36423a = messageObject.getDialogId();
                            p10Var.f36424b = id2;
                            v7Var.b(i12, x10Var.f39310o0.c(p10Var));
                        } else {
                            v7Var.b(i12, false);
                        }
                    } else {
                        v7Var.c(i12, i14, null);
                    }
                    i12++;
                } else {
                    v7Var.requestLayout();
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
            s2Var.f21015s2 = z10;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
            z11 = (s2Var.getMessage() == null || s2Var.getMessage().getId() != messageObject2.getId()) ? false : false;
            s2Var.O = x10Var.f39311p0;
            s2Var.W(messageObject2.getDialogId(), messageObject2, messageObject2.messageOwner.date, false, false);
            if (x10Var.f39310o0.g()) {
                int id3 = messageObject2.getId();
                p10Var.f36423a = messageObject2.getDialogId();
                p10Var.f36424b = id3;
                s2Var.V(x10Var.f39310o0.c(p10Var), z11);
                return;
            }
            s2Var.V(false, z11);
        } else if (i11 == 1) {
            int i15 = x10Var.f39315s;
            ((org.telegram.ui.Components.t00) view).v = i15 - ((((int) Math.ceil(arrayList.size() / x10Var.f39315s)) * i15) - arrayList.size());
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        l10 l10Var;
        l10 l10Var2;
        Context context = this.f38379c;
        if (i10 != 0) {
            if (i10 != 2) {
                l10Var2 = new l10(this, context, 1);
                l10Var2.setIsSingleCell(true);
                l10Var2.setViewType(2);
                return com.google.android.gms.internal.vision.e2.k(l10Var2, l10Var2, -1, -2);
            }
            ?? w3Var = new org.telegram.ui.Cells.w3(context, null);
            w3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.e7, false) & (-218103809));
            l10Var = w3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f21696n = paint;
            frameLayout.f21698s = UserConfig.selectedAccount;
            frameLayout.f21697r = 1;
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lh, false));
            frameLayout.f21693b = new MessageObject[6];
            frameLayout.f21692a = new org.telegram.ui.Cells.r7[6];
            frameLayout.f21694c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                frameLayout.f21692a[i11] = new org.telegram.ui.Cells.r7(frameLayout, context);
                frameLayout.addView(frameLayout.f21692a[i11]);
                frameLayout.f21692a[i11].setVisibility(4);
                frameLayout.f21692a[i11].setTag(Integer.valueOf(i11));
                frameLayout.f21692a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f21692a[i11].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        v7 v7Var = v7.this;
                        if (v7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            s7 s7Var = v7Var.d;
                            int i12 = v7Var.f21694c[intValue];
                            MessageObject messageObject = v7Var.f21693b[intValue];
                            org.telegram.ui.g gVar = (org.telegram.ui.g) s7Var;
                            x10 x10Var = ((v10) gVar.f33771b).d;
                            if (x10Var.f39310o0.g()) {
                                x10 x10Var2 = ((v10) gVar.f33771b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = x10.f39291s0;
                                x10Var2.f(i12, v7Var, messageObject, intValue);
                                return true;
                            }
                            x10.a(x10Var, messageObject, v7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new g(this, 17));
            l10Var = frameLayout;
        }
        l10Var2 = l10Var;
        return com.google.android.gms.internal.vision.e2.k(l10Var2, l10Var2, -1, -2);
    }
}
