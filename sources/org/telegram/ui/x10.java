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
public final class x10 extends org.telegram.ui.Components.ul0 {
    public final Context f38556c;
    public final z10 d;

    public x10(z10 z10Var, Context context) {
        this.d = z10Var;
        this.f38556c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        z10 z10Var = this.d;
        ArrayList arrayList = z10Var.f39168f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / z10Var.f39183s)) + (!z10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        z10 z10Var = this.d;
        if (i10 < ((int) Math.ceil(z10Var.f39168f.size() / z10Var.f39183s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        z10 z10Var = this.d;
        r10 r10Var = z10Var.S;
        ArrayList arrayList = z10Var.f39168f;
        int i11 = c1Var.f41613f;
        View view = c1Var.f41610a;
        boolean z11 = true;
        if (i11 == 0) {
            org.telegram.ui.Cells.v7 v7Var = (org.telegram.ui.Cells.v7) view;
            v7Var.setItemsCount(z10Var.f39183s);
            if (i10 != 0) {
                z11 = false;
            }
            v7Var.setIsFirst(z11);
            int i12 = 0;
            while (true) {
                int i13 = z10Var.f39183s;
                if (i12 < i13) {
                    int i14 = (i13 * i10) + i12;
                    if (i14 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i14);
                        v7Var.c(i12, arrayList.indexOf(messageObject), messageObject);
                        if (z10Var.f39178o0.f()) {
                            int id2 = messageObject.getId();
                            r10Var.f36168a = messageObject.getDialogId();
                            r10Var.f36169b = id2;
                            v7Var.b(i12, z10Var.f39178o0.b(r10Var));
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
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            r2Var.f19844s2 = z10;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
            z11 = (r2Var.getMessage() == null || r2Var.getMessage().getId() != messageObject2.getId()) ? false : false;
            r2Var.O = z10Var.f39179p0;
            r2Var.W(messageObject2.getDialogId(), messageObject2, messageObject2.messageOwner.date, false, false);
            if (z10Var.f39178o0.f()) {
                int id3 = messageObject2.getId();
                r10Var.f36168a = messageObject2.getDialogId();
                r10Var.f36169b = id3;
                r2Var.V(z10Var.f39178o0.b(r10Var), z11);
                return;
            }
            r2Var.V(false, z11);
        } else if (i11 == 1) {
            int i15 = z10Var.f39183s;
            ((org.telegram.ui.Components.a10) view).v = i15 - ((((int) Math.ceil(arrayList.size() / z10Var.f39183s)) * i15) - arrayList.size());
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        n10 n10Var;
        n10 n10Var2;
        Context context = this.f38556c;
        if (i10 != 0) {
            if (i10 != 2) {
                n10Var2 = new n10(this, context, 1);
                n10Var2.setIsSingleCell(true);
                n10Var2.setViewType(2);
                return com.google.android.gms.internal.vision.e2.j(n10Var2, n10Var2, -1, -2);
            }
            ?? u3Var = new org.telegram.ui.Cells.u3(context, null);
            u3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.e7, false) & (-218103809));
            n10Var = u3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f20563n = paint;
            frameLayout.f20565s = UserConfig.selectedAccount;
            frameLayout.f20564r = 1;
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lh, false));
            frameLayout.f20560b = new MessageObject[6];
            frameLayout.f20559a = new org.telegram.ui.Cells.r7[6];
            frameLayout.f20561c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                frameLayout.f20559a[i11] = new org.telegram.ui.Cells.r7(frameLayout, context);
                frameLayout.addView(frameLayout.f20559a[i11]);
                frameLayout.f20559a[i11].setVisibility(4);
                frameLayout.f20559a[i11].setTag(Integer.valueOf(i11));
                frameLayout.f20559a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f20559a[i11].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        v7 v7Var = v7.this;
                        if (v7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            s7 s7Var = v7Var.d;
                            int i12 = v7Var.f20561c[intValue];
                            MessageObject messageObject = v7Var.f20560b[intValue];
                            org.telegram.ui.g gVar = (org.telegram.ui.g) s7Var;
                            z10 z10Var = ((x10) gVar.f32950b).d;
                            if (z10Var.f39178o0.f()) {
                                z10 z10Var2 = ((x10) gVar.f32950b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = z10.f39159s0;
                                z10Var2.f(i12, v7Var, messageObject, intValue);
                                return true;
                            }
                            z10.a(z10Var, messageObject, v7Var, intValue);
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
        return com.google.android.gms.internal.vision.e2.j(n10Var2, n10Var2, -1, -2);
    }
}
