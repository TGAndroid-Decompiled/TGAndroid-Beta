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
import org.telegram.ui.r10;
import org.telegram.ui.t10;
public final class r10 extends org.telegram.ui.Components.yl0 {
    public final Context f37266c;
    public final t10 d;

    public r10(t10 t10Var, Context context) {
        this.d = t10Var;
        this.f37266c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        t10 t10Var = this.d;
        ArrayList arrayList = t10Var.f38035f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / t10Var.f38050s)) + (!t10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        t10 t10Var = this.d;
        if (i10 < ((int) Math.ceil(t10Var.f38035f.size() / t10Var.f38050s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        t10 t10Var = this.d;
        l10 l10Var = t10Var.S;
        ArrayList arrayList = t10Var.f38035f;
        int i11 = c1Var.f43071f;
        View view = c1Var.f43068a;
        boolean z11 = true;
        if (i11 == 0) {
            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
            u7Var.setItemsCount(t10Var.f38050s);
            if (i10 != 0) {
                z11 = false;
            }
            u7Var.setIsFirst(z11);
            int i12 = 0;
            while (true) {
                int i13 = t10Var.f38050s;
                if (i12 < i13) {
                    int i14 = (i13 * i10) + i12;
                    if (i14 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i14);
                        u7Var.c(i12, arrayList.indexOf(messageObject), messageObject);
                        if (t10Var.f38045o0.g()) {
                            int id2 = messageObject.getId();
                            l10Var.f35294a = messageObject.getDialogId();
                            l10Var.f35295b = id2;
                            u7Var.b(i12, t10Var.f38045o0.c(l10Var));
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
            s2Var.f21031s2 = z10;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
            z11 = (s2Var.getMessage() == null || s2Var.getMessage().getId() != messageObject2.getId()) ? false : false;
            s2Var.O = t10Var.f38046p0;
            s2Var.W(messageObject2.getDialogId(), messageObject2, messageObject2.messageOwner.date, false, false);
            if (t10Var.f38045o0.g()) {
                int id3 = messageObject2.getId();
                l10Var.f35294a = messageObject2.getDialogId();
                l10Var.f35295b = id3;
                s2Var.V(t10Var.f38045o0.c(l10Var), z11);
                return;
            }
            s2Var.V(false, z11);
        } else if (i11 == 1) {
            int i15 = t10Var.f38050s;
            ((org.telegram.ui.Components.w00) view).v = i15 - ((((int) Math.ceil(arrayList.size() / t10Var.f38050s)) * i15) - arrayList.size());
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        h10 h10Var;
        h10 h10Var2;
        Context context = this.f37266c;
        if (i10 != 0) {
            if (i10 != 2) {
                h10Var2 = new h10(this, context, 1);
                h10Var2.setIsSingleCell(true);
                h10Var2.setViewType(2);
                return com.google.android.gms.internal.vision.e2.k(h10Var2, h10Var2, -1, -2);
            }
            ?? v3Var = new org.telegram.ui.Cells.v3(context, null);
            v3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.e7, false) & (-218103809));
            h10Var = v3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f21682n = paint;
            frameLayout.f21684s = UserConfig.selectedAccount;
            frameLayout.f21683r = 1;
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Lh, false));
            frameLayout.f21679b = new MessageObject[6];
            frameLayout.f21678a = new org.telegram.ui.Cells.q7[6];
            frameLayout.f21680c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                frameLayout.f21678a[i11] = new org.telegram.ui.Cells.q7(frameLayout, context);
                frameLayout.addView(frameLayout.f21678a[i11]);
                frameLayout.f21678a[i11].setVisibility(4);
                frameLayout.f21678a[i11].setTag(Integer.valueOf(i11));
                frameLayout.f21678a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f21678a[i11].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        u7 u7Var = u7.this;
                        if (u7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            r7 r7Var = u7Var.d;
                            int i12 = u7Var.f21680c[intValue];
                            MessageObject messageObject = u7Var.f21679b[intValue];
                            org.telegram.ui.g gVar = (org.telegram.ui.g) r7Var;
                            t10 t10Var = ((r10) gVar.f33927b).d;
                            if (t10Var.f38045o0.g()) {
                                t10 t10Var2 = ((r10) gVar.f33927b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = t10.f38026s0;
                                t10Var2.f(i12, u7Var, messageObject, intValue);
                                return true;
                            }
                            t10.a(t10Var, messageObject, u7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new g(this, 17));
            h10Var = frameLayout;
        }
        h10Var2 = h10Var;
        return com.google.android.gms.internal.vision.e2.k(h10Var2, h10Var2, -1, -2);
    }
}
