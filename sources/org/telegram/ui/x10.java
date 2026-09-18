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
import org.telegram.ui.x10;
import org.telegram.ui.z10;
public final class x10 extends org.telegram.ui.Components.ll0 {
    public final Context f39352c;
    public final z10 d;

    public x10(z10 z10Var, Context context) {
        this.d = z10Var;
        this.f39352c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        z10 z10Var = this.d;
        ArrayList arrayList = z10Var.f40082f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / z10Var.f40097s)) + (!z10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        z10 z10Var = this.d;
        if (i10 < ((int) Math.ceil(z10Var.f40082f.size() / z10Var.f40097s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        z10 z10Var = this.d;
        r10 r10Var = z10Var.S;
        ArrayList arrayList = z10Var.f40082f;
        int i11 = c1Var.f42705f;
        View view = c1Var.f42702a;
        boolean z11 = true;
        if (i11 == 0) {
            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
            u7Var.setItemsCount(z10Var.f40097s);
            if (i10 != 0) {
                z11 = false;
            }
            u7Var.setIsFirst(z11);
            int i12 = 0;
            while (true) {
                int i13 = z10Var.f40097s;
                if (i12 < i13) {
                    int i14 = (i13 * i10) + i12;
                    if (i14 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i14);
                        u7Var.c(i12, arrayList.indexOf(messageObject), messageObject);
                        if (z10Var.f40092o0.g()) {
                            int id2 = messageObject.getId();
                            r10Var.f37067a = messageObject.getDialogId();
                            r10Var.f37068b = id2;
                            u7Var.b(i12, z10Var.f40092o0.c(r10Var));
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
            r2Var.f20761s2 = z10;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
            z11 = (r2Var.getMessage() == null || r2Var.getMessage().getId() != messageObject2.getId()) ? false : false;
            r2Var.O = z10Var.f40093p0;
            r2Var.W(messageObject2.getDialogId(), messageObject2, messageObject2.messageOwner.date, false, false);
            if (z10Var.f40092o0.g()) {
                int id3 = messageObject2.getId();
                r10Var.f37067a = messageObject2.getDialogId();
                r10Var.f37068b = id3;
                r2Var.V(z10Var.f40092o0.c(r10Var), z11);
                return;
            }
            r2Var.V(false, z11);
        } else if (i11 == 1) {
            int i15 = z10Var.f40097s;
            ((org.telegram.ui.Components.t00) view).v = i15 - ((((int) Math.ceil(arrayList.size() / z10Var.f40097s)) * i15) - arrayList.size());
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        n10 n10Var;
        n10 n10Var2;
        Context context = this.f39352c;
        if (i10 != 0) {
            if (i10 != 2) {
                n10Var2 = new n10(this, context, 1);
                n10Var2.setIsSingleCell(true);
                n10Var2.setViewType(2);
                return com.google.android.gms.internal.vision.e2.k(n10Var2, n10Var2, -1, -2);
            }
            ?? u3Var = new org.telegram.ui.Cells.u3(context, null);
            u3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.e7, false) & (-218103809));
            n10Var = u3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f21457n = paint;
            frameLayout.f21459s = UserConfig.selectedAccount;
            frameLayout.f21458r = 1;
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lh, false));
            frameLayout.f21454b = new MessageObject[6];
            frameLayout.f21453a = new org.telegram.ui.Cells.q7[6];
            frameLayout.f21455c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                frameLayout.f21453a[i11] = new org.telegram.ui.Cells.q7(frameLayout, context);
                frameLayout.addView(frameLayout.f21453a[i11]);
                frameLayout.f21453a[i11].setVisibility(4);
                frameLayout.f21453a[i11].setTag(Integer.valueOf(i11));
                frameLayout.f21453a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f21453a[i11].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        u7 u7Var = u7.this;
                        if (u7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            r7 r7Var = u7Var.d;
                            int i12 = u7Var.f21455c[intValue];
                            MessageObject messageObject = u7Var.f21454b[intValue];
                            org.telegram.ui.g gVar = (org.telegram.ui.g) r7Var;
                            z10 z10Var = ((x10) gVar.f33810b).d;
                            if (z10Var.f40092o0.g()) {
                                z10 z10Var2 = ((x10) gVar.f33810b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = z10.f40073s0;
                                z10Var2.f(i12, u7Var, messageObject, intValue);
                                return true;
                            }
                            z10.a(z10Var, messageObject, u7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new g(this, 17));
            n10Var = frameLayout;
        }
        n10Var2 = n10Var;
        return com.google.android.gms.internal.vision.e2.k(n10Var2, n10Var2, -1, -2);
    }
}
