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
public final class s10 extends org.telegram.ui.Components.ql0 {
    public final Context f38087c;
    public final u10 d;

    public s10(u10 u10Var, Context context) {
        this.d = u10Var;
        this.f38087c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override
    public final int h() {
        u10 u10Var = this.d;
        ArrayList arrayList = u10Var.f38646f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / u10Var.f38658s)) + (!u10Var.K ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        u10 u10Var = this.d;
        if (i10 < ((int) Math.ceil(u10Var.f38646f.size() / u10Var.f38658s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        u10 u10Var = this.d;
        m10 m10Var = u10Var.P;
        ArrayList arrayList = u10Var.f38646f;
        int i11 = l1Var.f5777f;
        View view = l1Var.f5774a;
        boolean z10 = true;
        if (i11 == 0) {
            org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
            r7Var.setItemsCount(u10Var.f38658s);
            if (i10 != 0) {
                z10 = false;
            }
            r7Var.setIsFirst(z10);
            int i12 = 0;
            while (true) {
                int i13 = u10Var.f38658s;
                if (i12 < i13) {
                    int i14 = (i13 * i10) + i12;
                    if (i14 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i14);
                        r7Var.c(i12, arrayList.indexOf(messageObject), messageObject);
                        if (u10Var.f38653l0.f()) {
                            int id2 = messageObject.getId();
                            m10Var.f35953a = messageObject.getDialogId();
                            m10Var.f35954b = id2;
                            r7Var.b(i12, u10Var.f38653l0.b(m10Var));
                        } else {
                            r7Var.b(i12, false);
                        }
                    } else {
                        r7Var.c(i12, i14, null);
                    }
                    i12++;
                } else {
                    r7Var.requestLayout();
                    return;
                }
            }
        } else if (i11 == 3) {
            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
            if (i10 != h() - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            q2Var.f21628p2 = z4;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
            z10 = (q2Var.getMessage() == null || q2Var.getMessage().getId() != messageObject2.getId()) ? false : false;
            q2Var.L = u10Var.m0;
            q2Var.W(messageObject2.getDialogId(), messageObject2, messageObject2.messageOwner.date, false, false);
            if (u10Var.f38653l0.f()) {
                int id3 = messageObject2.getId();
                m10Var.f35953a = messageObject2.getDialogId();
                m10Var.f35954b = id3;
                q2Var.V(u10Var.f38653l0.b(m10Var), z10);
                return;
            }
            q2Var.V(false, z10);
        } else if (i11 == 1) {
            int i15 = u10Var.f38658s;
            ((org.telegram.ui.Components.u00) view).v = i15 - ((((int) Math.ceil(arrayList.size() / u10Var.f38658s)) * i15) - arrayList.size());
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        i10 i10Var;
        i10 i10Var2;
        Context context = this.f38087c;
        if (i10 != 0) {
            if (i10 != 2) {
                i10Var2 = new i10(this, context, 1);
                i10Var2.setIsSingleCell(true);
                i10Var2.setViewType(2);
                return ai.n(i10Var2, i10Var2, -1, -2);
            }
            ?? t3Var = new org.telegram.ui.Cells.t3(context, null);
            t3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19899e7, false) & (-218103809));
            i10Var = t3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f21880n = paint;
            frameLayout.f21882s = UserConfig.selectedAccount;
            frameLayout.f21881r = 1;
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lh, false));
            frameLayout.f21877b = new MessageObject[6];
            frameLayout.f21876a = new org.telegram.ui.Cells.n7[6];
            frameLayout.f21878c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                frameLayout.f21876a[i11] = new org.telegram.ui.Cells.n7(frameLayout, context);
                frameLayout.addView(frameLayout.f21876a[i11]);
                frameLayout.f21876a[i11].setVisibility(4);
                frameLayout.f21876a[i11].setTag(Integer.valueOf(i11));
                frameLayout.f21876a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f21876a[i11].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        r7 r7Var = r7.this;
                        if (r7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            o7 o7Var = r7Var.d;
                            int i12 = r7Var.f21878c[intValue];
                            MessageObject messageObject = r7Var.f21877b[intValue];
                            org.telegram.ui.h hVar = (org.telegram.ui.h) o7Var;
                            u10 u10Var = ((s10) hVar.f34532b).d;
                            if (u10Var.f38653l0.f()) {
                                u10 u10Var2 = ((s10) hVar.f34532b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = u10.f38637p0;
                                u10Var2.f(i12, r7Var, messageObject, intValue);
                                return true;
                            }
                            u10.a(u10Var, messageObject, r7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new h(this, 17));
            i10Var = frameLayout;
        }
        i10Var2 = i10Var;
        return ai.n(i10Var2, i10Var2, -1, -2);
    }
}
