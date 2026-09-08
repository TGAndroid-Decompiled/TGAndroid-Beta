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
public final class v10 extends org.telegram.ui.Components.kl0 {
    public final Context f41409c;
    public final x10 d;

    public v10(x10 x10Var, Context context) {
        this.d = x10Var;
        this.f41409c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        x10 x10Var = this.d;
        ArrayList arrayList = x10Var.f42571f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / x10Var.f42586s)) + (!x10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        x10 x10Var = this.d;
        if (i10 < ((int) Math.ceil(x10Var.f42571f.size() / x10Var.f42586s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        x10 x10Var = this.d;
        p10 p10Var = x10Var.S;
        ArrayList arrayList = x10Var.f42571f;
        int i11 = c1Var.f45770f;
        View view = c1Var.f45766a;
        boolean z11 = true;
        if (i11 == 0) {
            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
            u7Var.setItemsCount(x10Var.f42586s);
            if (i10 != 0) {
                z11 = false;
            }
            u7Var.setIsFirst(z11);
            int i12 = 0;
            while (true) {
                int i13 = x10Var.f42586s;
                if (i12 < i13) {
                    int i14 = (i13 * i10) + i12;
                    if (i14 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i14);
                        u7Var.c(i12, arrayList.indexOf(messageObject), messageObject);
                        if (x10Var.f42581o0.g()) {
                            int id2 = messageObject.getId();
                            p10Var.f39408a = messageObject.getDialogId();
                            p10Var.f39409b = id2;
                            u7Var.b(i12, x10Var.f42581o0.b(p10Var));
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
            r2Var.f22652s2 = z10;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
            z11 = (r2Var.getMessage() == null || r2Var.getMessage().getId() != messageObject2.getId()) ? false : false;
            r2Var.O = x10Var.f42582p0;
            r2Var.W(messageObject2.getDialogId(), messageObject2, messageObject2.messageOwner.date, false, false);
            if (x10Var.f42581o0.g()) {
                int id3 = messageObject2.getId();
                p10Var.f39408a = messageObject2.getDialogId();
                p10Var.f39409b = id3;
                r2Var.V(x10Var.f42581o0.b(p10Var), z11);
                return;
            }
            r2Var.V(false, z11);
        } else if (i11 == 1) {
            int i15 = x10Var.f42586s;
            ((org.telegram.ui.Components.t00) view).v = i15 - ((((int) Math.ceil(arrayList.size() / x10Var.f42586s)) * i15) - arrayList.size());
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        l10 l10Var;
        l10 l10Var2;
        Context context = this.f41409c;
        if (i10 != 0) {
            if (i10 != 2) {
                l10Var2 = new l10(this, context, 1);
                l10Var2.setIsSingleCell(true);
                l10Var2.setViewType(2);
                return com.google.android.gms.internal.vision.e2.l(l10Var2, l10Var2, -1, -2);
            }
            ?? u3Var = new org.telegram.ui.Cells.u3(context, null);
            u3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.e7, false) & (-218103809));
            l10Var = u3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f23369n = paint;
            frameLayout.f23371s = UserConfig.selectedAccount;
            frameLayout.f23370r = 1;
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lh, false));
            frameLayout.f23365b = new MessageObject[6];
            frameLayout.f23364a = new org.telegram.ui.Cells.q7[6];
            frameLayout.f23366c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                frameLayout.f23364a[i11] = new org.telegram.ui.Cells.q7(frameLayout, context);
                frameLayout.addView(frameLayout.f23364a[i11]);
                frameLayout.f23364a[i11].setVisibility(4);
                frameLayout.f23364a[i11].setTag(Integer.valueOf(i11));
                frameLayout.f23364a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f23364a[i11].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        u7 u7Var = u7.this;
                        if (u7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            r7 r7Var = u7Var.d;
                            int i12 = u7Var.f23366c[intValue];
                            MessageObject messageObject = u7Var.f23365b[intValue];
                            org.telegram.ui.g gVar = (org.telegram.ui.g) r7Var;
                            x10 x10Var = ((v10) gVar.f36542b).d;
                            if (x10Var.f42581o0.g()) {
                                x10 x10Var2 = ((v10) gVar.f36542b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = x10.f42561s0;
                                x10Var2.f(i12, u7Var, messageObject, intValue);
                                return true;
                            }
                            x10.a(x10Var, messageObject, u7Var, intValue);
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
        return com.google.android.gms.internal.vision.e2.l(l10Var2, l10Var2, -1, -2);
    }
}
