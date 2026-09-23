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
import org.telegram.ui.s10;
import org.telegram.ui.u10;
public final class s10 extends org.telegram.ui.Components.ll0 {
    public final Context f37098c;
    public final u10 d;

    public s10(u10 u10Var, Context context) {
        this.d = u10Var;
        this.f37098c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        u10 u10Var = this.d;
        ArrayList arrayList = u10Var.f37852f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / u10Var.f37867s)) + (!u10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        u10 u10Var = this.d;
        if (i10 < ((int) Math.ceil(u10Var.f37852f.size() / u10Var.f37867s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        u10 u10Var = this.d;
        m10 m10Var = u10Var.S;
        ArrayList arrayList = u10Var.f37852f;
        int i11 = c1Var.f42630f;
        View view = c1Var.f42627a;
        boolean z11 = true;
        if (i11 == 0) {
            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
            u7Var.setItemsCount(u10Var.f37867s);
            if (i10 != 0) {
                z11 = false;
            }
            u7Var.setIsFirst(z11);
            int i12 = 0;
            while (true) {
                int i13 = u10Var.f37867s;
                if (i12 < i13) {
                    int i14 = (i13 * i10) + i12;
                    if (i14 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i14);
                        u7Var.c(i12, arrayList.indexOf(messageObject), messageObject);
                        if (u10Var.f37862o0.g()) {
                            int id2 = messageObject.getId();
                            m10Var.f35122a = messageObject.getDialogId();
                            m10Var.f35123b = id2;
                            u7Var.b(i12, u10Var.f37862o0.c(m10Var));
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
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            r2Var.f20724s2 = z10;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
            z11 = (r2Var.getMessage() == null || r2Var.getMessage().getId() != messageObject2.getId()) ? false : false;
            r2Var.O = u10Var.f37863p0;
            r2Var.W(messageObject2.getDialogId(), messageObject2, messageObject2.messageOwner.date, false, false);
            if (u10Var.f37862o0.g()) {
                int id3 = messageObject2.getId();
                m10Var.f35122a = messageObject2.getDialogId();
                m10Var.f35123b = id3;
                r2Var.V(u10Var.f37862o0.c(m10Var), z11);
                return;
            }
            r2Var.V(false, z11);
        } else if (i11 == 1) {
            int i15 = u10Var.f37867s;
            ((org.telegram.ui.Components.u00) view).v = i15 - ((((int) Math.ceil(arrayList.size() / u10Var.f37867s)) * i15) - arrayList.size());
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        i10 i10Var;
        i10 i10Var2;
        Context context = this.f37098c;
        if (i10 != 0) {
            if (i10 != 2) {
                i10Var2 = new i10(this, context, 1);
                i10Var2.setIsSingleCell(true);
                i10Var2.setViewType(2);
                return com.google.android.gms.internal.vision.e2.k(i10Var2, i10Var2, -1, -2);
            }
            ?? v3Var = new org.telegram.ui.Cells.v3(context, null);
            v3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.e7, false) & (-218103809));
            i10Var = v3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f21423n = paint;
            frameLayout.f21425s = UserConfig.selectedAccount;
            frameLayout.f21424r = 1;
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Lh, false));
            frameLayout.f21420b = new MessageObject[6];
            frameLayout.f21419a = new org.telegram.ui.Cells.q7[6];
            frameLayout.f21421c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                frameLayout.f21419a[i11] = new org.telegram.ui.Cells.q7(frameLayout, context);
                frameLayout.addView(frameLayout.f21419a[i11]);
                frameLayout.f21419a[i11].setVisibility(4);
                frameLayout.f21419a[i11].setTag(Integer.valueOf(i11));
                frameLayout.f21419a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f21419a[i11].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        u7 u7Var = u7.this;
                        if (u7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            r7 r7Var = u7Var.d;
                            int i12 = u7Var.f21421c[intValue];
                            MessageObject messageObject = u7Var.f21420b[intValue];
                            org.telegram.ui.g gVar = (org.telegram.ui.g) r7Var;
                            u10 u10Var = ((s10) gVar.f33402b).d;
                            if (u10Var.f37862o0.g()) {
                                u10 u10Var2 = ((s10) gVar.f33402b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = u10.f37843s0;
                                u10Var2.f(i12, u7Var, messageObject, intValue);
                                return true;
                            }
                            u10.a(u10Var, messageObject, u7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new g(this, 17));
            i10Var = frameLayout;
        }
        i10Var2 = i10Var;
        return com.google.android.gms.internal.vision.e2.k(i10Var2, i10Var2, -1, -2);
    }
}
