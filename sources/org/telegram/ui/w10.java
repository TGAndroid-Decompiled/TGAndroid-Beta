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
import org.telegram.ui.w10;
import org.telegram.ui.y10;
public final class w10 extends org.telegram.ui.Components.vm0 {
    public final Context f43024c;
    public final y10 d;

    public w10(y10 y10Var, Context context) {
        this.d = y10Var;
        this.f43024c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final int h() {
        y10 y10Var = this.d;
        ArrayList arrayList = y10Var.f44250f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / y10Var.f44265s)) + (!y10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        y10 y10Var = this.d;
        if (i10 < ((int) Math.ceil(y10Var.f44250f.size() / y10Var.f44265s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        y10 y10Var = this.d;
        q10 q10Var = y10Var.S;
        ArrayList arrayList = y10Var.f44250f;
        int i11 = d1Var.f47893f;
        View view = d1Var.f47889a;
        boolean z11 = true;
        if (i11 == 0) {
            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
            u7Var.setItemsCount(y10Var.f44265s);
            if (i10 != 0) {
                z11 = false;
            }
            u7Var.setIsFirst(z11);
            int i12 = 0;
            while (true) {
                int i13 = y10Var.f44265s;
                if (i12 < i13) {
                    int i14 = (i13 * i10) + i12;
                    if (i14 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i14);
                        u7Var.c(i12, arrayList.indexOf(messageObject), messageObject);
                        if (y10Var.f44260o0.g()) {
                            int id2 = messageObject.getId();
                            q10Var.f41138a = messageObject.getDialogId();
                            q10Var.f41139b = id2;
                            u7Var.b(i12, y10Var.f44260o0.c(q10Var));
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
            s2Var.f22620s2 = z10;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
            if (s2Var.getMessage() == null || s2Var.getMessage().getId() != messageObject2.getId()) {
                z11 = false;
            }
            s2Var.O = y10Var.f44261p0;
            s2Var.W(messageObject2.getDialogId(), messageObject2, messageObject2.messageOwner.date, false, false);
            if (y10Var.f44260o0.g()) {
                int id3 = messageObject2.getId();
                q10Var.f41138a = messageObject2.getDialogId();
                q10Var.f41139b = id3;
                s2Var.V(y10Var.f44260o0.c(q10Var), z11);
                return;
            }
            s2Var.V(false, z11);
        } else if (i11 == 1) {
            int i15 = y10Var.f44265s;
            ((org.telegram.ui.Components.m10) view).v = i15 - ((((int) Math.ceil(arrayList.size() / y10Var.f44265s)) * i15) - arrayList.size());
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        m10 m10Var;
        m10 m10Var2;
        Context context = this.f43024c;
        if (i10 != 0) {
            if (i10 != 2) {
                m10Var2 = new m10(this, context, 1);
                m10Var2.setIsSingleCell(true);
                m10Var2.setViewType(2);
                return com.google.android.gms.internal.vision.e2.k(m10Var2, m10Var2, -1, -2);
            }
            ?? v3Var = new org.telegram.ui.Cells.v3(context, null);
            v3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.e7, false) & (-218103809));
            m10Var = v3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f23287n = paint;
            frameLayout.f23289s = UserConfig.selectedAccount;
            frameLayout.f23288r = 1;
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Lh, false));
            frameLayout.f23283b = new MessageObject[6];
            frameLayout.f23282a = new org.telegram.ui.Cells.q7[6];
            frameLayout.f23284c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                frameLayout.f23282a[i11] = new org.telegram.ui.Cells.q7(frameLayout, context);
                frameLayout.addView(frameLayout.f23282a[i11]);
                frameLayout.f23282a[i11].setVisibility(4);
                frameLayout.f23282a[i11].setTag(Integer.valueOf(i11));
                frameLayout.f23282a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f23282a[i11].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        u7 u7Var = u7.this;
                        if (u7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            r7 r7Var = u7Var.d;
                            int i12 = u7Var.f23284c[intValue];
                            MessageObject messageObject = u7Var.f23283b[intValue];
                            org.telegram.ui.g gVar = (org.telegram.ui.g) r7Var;
                            y10 y10Var = ((w10) gVar.f37879b).d;
                            if (y10Var.f44260o0.g()) {
                                y10 y10Var2 = ((w10) gVar.f37879b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = y10.f44240s0;
                                y10Var2.f(i12, u7Var, messageObject, intValue);
                                return true;
                            }
                            y10.a(y10Var, messageObject, u7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new g(this, 17));
            m10Var = frameLayout;
        }
        m10Var2 = m10Var;
        return com.google.android.gms.internal.vision.e2.k(m10Var2, m10Var2, -1, -2);
    }
}
