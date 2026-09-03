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
public final class r10 extends org.telegram.ui.Components.rl0 {
    public final Context f40737c;
    public final t10 d;

    public r10(t10 t10Var, Context context) {
        this.d = t10Var;
        this.f40737c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override
    public final int h() {
        t10 t10Var = this.d;
        ArrayList arrayList = t10Var.f41364f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / t10Var.f41376s)) + (!t10Var.K ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        t10 t10Var = this.d;
        if (i10 < ((int) Math.ceil(t10Var.f41364f.size() / t10Var.f41376s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        t10 t10Var = this.d;
        l10 l10Var = t10Var.P;
        ArrayList arrayList = t10Var.f41364f;
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        boolean z10 = true;
        if (i11 == 0) {
            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
            s7Var.setItemsCount(t10Var.f41376s);
            if (i10 != 0) {
                z10 = false;
            }
            s7Var.setIsFirst(z10);
            int i12 = 0;
            while (true) {
                int i13 = t10Var.f41376s;
                if (i12 < i13) {
                    int i14 = (i13 * i10) + i12;
                    if (i14 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i14);
                        s7Var.c(i12, arrayList.indexOf(messageObject), messageObject);
                        if (t10Var.f41371l0.f()) {
                            int id2 = messageObject.getId();
                            l10Var.f38464a = messageObject.getDialogId();
                            l10Var.f38465b = id2;
                            s7Var.b(i12, t10Var.f41371l0.b(l10Var));
                        } else {
                            s7Var.b(i12, false);
                        }
                    } else {
                        s7Var.c(i12, i14, null);
                    }
                    i12++;
                } else {
                    s7Var.requestLayout();
                    return;
                }
            }
        } else if (i11 == 3) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            if (i10 != h() - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            r2Var.f23488p2 = z4;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
            z10 = (r2Var.getMessage() == null || r2Var.getMessage().getId() != messageObject2.getId()) ? false : false;
            r2Var.L = t10Var.m0;
            r2Var.W(messageObject2.getDialogId(), messageObject2, messageObject2.messageOwner.date, false, false);
            if (t10Var.f41371l0.f()) {
                int id3 = messageObject2.getId();
                l10Var.f38464a = messageObject2.getDialogId();
                l10Var.f38465b = id3;
                r2Var.V(t10Var.f41371l0.b(l10Var), z10);
                return;
            }
            r2Var.V(false, z10);
        } else if (i11 == 1) {
            int i15 = t10Var.f41376s;
            ((org.telegram.ui.Components.u00) view).v = i15 - ((((int) Math.ceil(arrayList.size() / t10Var.f41376s)) * i15) - arrayList.size());
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        h10 h10Var;
        h10 h10Var2;
        Context context = this.f40737c;
        if (i10 != 0) {
            if (i10 != 2) {
                h10Var2 = new h10(this, context, 1);
                h10Var2.setIsSingleCell(true);
                h10Var2.setViewType(2);
                return yh.o(h10Var2, h10Var2, -1, -2);
            }
            ?? u3Var = new org.telegram.ui.Cells.u3(context, null);
            u3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21680e7, false) & (-218103809));
            h10Var = u3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f23749n = paint;
            frameLayout.f23751s = UserConfig.selectedAccount;
            frameLayout.f23750r = 1;
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Lh, false));
            frameLayout.f23745b = new MessageObject[6];
            frameLayout.f23744a = new org.telegram.ui.Cells.o7[6];
            frameLayout.f23746c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                frameLayout.f23744a[i11] = new org.telegram.ui.Cells.o7(frameLayout, context);
                frameLayout.addView(frameLayout.f23744a[i11]);
                frameLayout.f23744a[i11].setVisibility(4);
                frameLayout.f23744a[i11].setTag(Integer.valueOf(i11));
                frameLayout.f23744a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f23744a[i11].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        s7 s7Var = s7.this;
                        if (s7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            p7 p7Var = s7Var.d;
                            int i12 = s7Var.f23746c[intValue];
                            MessageObject messageObject = s7Var.f23745b[intValue];
                            org.telegram.ui.h hVar = (org.telegram.ui.h) p7Var;
                            t10 t10Var = ((r10) hVar.f37188b).d;
                            if (t10Var.f41371l0.f()) {
                                t10 t10Var2 = ((r10) hVar.f37188b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = t10.f41354p0;
                                t10Var2.f(i12, s7Var, messageObject, intValue);
                                return true;
                            }
                            t10.a(t10Var, messageObject, s7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new h(this, 17));
            h10Var = frameLayout;
        }
        h10Var2 = h10Var;
        return yh.o(h10Var2, h10Var2, -1, -2);
    }
}
