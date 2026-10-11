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
import org.telegram.ui.t10;
import org.telegram.ui.v10;
public final class t10 extends org.telegram.ui.Components.qm0 {
    public final Context f42069c;
    public final v10 d;

    public t10(v10 v10Var, Context context) {
        this.d = v10Var;
        this.f42069c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final int h() {
        v10 v10Var = this.d;
        ArrayList arrayList = v10Var.f42871f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / v10Var.f42886s)) + (!v10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        v10 v10Var = this.d;
        if (i10 < ((int) Math.ceil(v10Var.f42871f.size() / v10Var.f42886s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        v10 v10Var = this.d;
        n10 n10Var = v10Var.S;
        ArrayList arrayList = v10Var.f42871f;
        int i11 = d1Var.f47786f;
        View view = d1Var.f47782a;
        boolean z11 = true;
        if (i11 == 0) {
            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
            u7Var.setItemsCount(v10Var.f42886s);
            if (i10 != 0) {
                z11 = false;
            }
            u7Var.setIsFirst(z11);
            int i12 = 0;
            while (true) {
                int i13 = v10Var.f42886s;
                if (i12 < i13) {
                    int i14 = (i13 * i10) + i12;
                    if (i14 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i14);
                        u7Var.c(i12, arrayList.indexOf(messageObject), messageObject);
                        if (v10Var.f42881o0.g()) {
                            int id2 = messageObject.getId();
                            n10Var.f40144a = messageObject.getDialogId();
                            n10Var.f40145b = id2;
                            u7Var.b(i12, v10Var.f42881o0.c(n10Var));
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
            s2Var.f22885s2 = z10;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
            if (s2Var.getMessage() == null || s2Var.getMessage().getId() != messageObject2.getId()) {
                z11 = false;
            }
            s2Var.O = v10Var.f42882p0;
            s2Var.W(messageObject2.getDialogId(), messageObject2, messageObject2.messageOwner.date, false, false);
            if (v10Var.f42881o0.g()) {
                int id3 = messageObject2.getId();
                n10Var.f40144a = messageObject2.getDialogId();
                n10Var.f40145b = id3;
                s2Var.V(v10Var.f42881o0.c(n10Var), z11);
                return;
            }
            s2Var.V(false, z11);
        } else if (i11 == 1) {
            int i15 = v10Var.f42886s;
            ((org.telegram.ui.Components.k10) view).v = i15 - ((((int) Math.ceil(arrayList.size() / v10Var.f42886s)) * i15) - arrayList.size());
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        j10 j10Var;
        j10 j10Var2;
        Context context = this.f42069c;
        if (i10 != 0) {
            if (i10 != 2) {
                j10Var2 = new j10(this, context, 1);
                j10Var2.setIsSingleCell(true);
                j10Var2.setViewType(2);
                return com.google.android.gms.internal.vision.e2.k(j10Var2, j10Var2, -1, -2);
            }
            ?? v3Var = new org.telegram.ui.Cells.v3(context, null);
            v3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.e7, false) & (-218103809));
            j10Var = v3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f23543n = paint;
            frameLayout.f23545s = UserConfig.selectedAccount;
            frameLayout.f23544r = 1;
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Lh, false));
            frameLayout.f23539b = new MessageObject[6];
            frameLayout.f23538a = new org.telegram.ui.Cells.q7[6];
            frameLayout.f23540c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                frameLayout.f23538a[i11] = new org.telegram.ui.Cells.q7(frameLayout, context);
                frameLayout.addView(frameLayout.f23538a[i11]);
                frameLayout.f23538a[i11].setVisibility(4);
                frameLayout.f23538a[i11].setTag(Integer.valueOf(i11));
                frameLayout.f23538a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f23538a[i11].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        u7 u7Var = u7.this;
                        if (u7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            r7 r7Var = u7Var.d;
                            int i12 = u7Var.f23540c[intValue];
                            MessageObject messageObject = u7Var.f23539b[intValue];
                            org.telegram.ui.g gVar = (org.telegram.ui.g) r7Var;
                            v10 v10Var = ((t10) gVar.f37850b).d;
                            if (v10Var.f42881o0.g()) {
                                v10 v10Var2 = ((t10) gVar.f37850b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = v10.f42861s0;
                                v10Var2.f(i12, u7Var, messageObject, intValue);
                                return true;
                            }
                            v10.a(v10Var, messageObject, u7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new g(this, 17));
            j10Var = frameLayout;
        }
        j10Var2 = j10Var;
        return com.google.android.gms.internal.vision.e2.k(j10Var2, j10Var2, -1, -2);
    }
}
