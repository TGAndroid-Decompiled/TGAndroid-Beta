package th;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.cd;
import org.telegram.messenger.hs;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.yf0;
import org.telegram.ui.sr;
public final class u2 extends k.a {
    public boolean f49506c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final o7 e;
    public final boolean f49507f;
    public final boolean h;
    public final boolean f49508n;
    public final Context f49509r;
    public final x2 f49510s;
    public final boolean[] f49511w;
    public final z2 f49512x;

    public u2(z2 z2Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.ActionBar.p6 p6Var2, o7 o7Var, boolean z10, boolean z11, boolean z12, Context context2, x2 x2Var, boolean[] zArr) {
        super(context, p6Var, true);
        this.f49512x = z2Var;
        this.d = p6Var2;
        this.e = o7Var;
        this.f49507f = z10;
        this.h = z11;
        this.f49508n = z12;
        this.f49509r = context2;
        this.f49510s = x2Var;
        this.f49511w = zArr;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r40) {
        throw new UnsupportedOperationException("Method not decompiled: th.u2.j(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void k() {
        if (!this.f49506c && !this.f49511w[0]) {
            org.telegram.messenger.i0.g3(new o2(this, 0));
        }
        z2 z2Var = this.f49512x;
        z2Var.f49696c1 = null;
        z2Var.f49693b1 = null;
    }

    public final void s(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        y2 y2Var;
        boolean z11 = this.f49507f;
        z2 z2Var = this.f49512x;
        if (z11 && ((y2Var = z2Var.f49776x1) == null || y2Var.f49662b == null)) {
            Context context = z2Var.getContext();
            yf0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final m4.c cVar = new m4.c(29, this, actionBarPopupWindow$ActionBarPopupWindowLayout);
            li.k kVar = new li.k(19, false);
            org.telegram.ui.ActionBar.b1[] b1VarArr = new org.telegram.ui.ActionBar.b1[5];
            kVar.d = b1VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
            kVar.f12100b = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232056, cd.L0(2131753756, null), false, null);
            c10.setOnClickListener(new sr(swipeBack, 1));
            c10.d(-328966, -328966);
            c10.setSelectorColor(268435455);
            View a5Var = new org.telegram.ui.Cells.a5(context, 15);
            a5Var.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
            a5Var.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(a5Var);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a5Var.getLayoutParams();
            if (cd.X) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = org.telegram.messenger.i0.L(8.0f);
            a5Var.setLayoutParams(layoutParams);
            org.telegram.ui.ActionBar.x0 x0Var = new org.telegram.ui.ActionBar.x0(context, null);
            kVar.f12101c = x0Var;
            x0Var.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
            x0Var.setDrawShadow(false);
            x0Var.setBackgroundColor(-14540254);
            x0Var.setTextColor(-1);
            x0Var.setOnValueChange(new org.telegram.ui.z4(cVar, 6));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.a(x0Var, w7.b6.o(-1, 44));
            View a5Var2 = new org.telegram.ui.Cells.a5(context, 16);
            a5Var2.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
            a5Var2.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(a5Var2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) a5Var2.getLayoutParams();
            if (cd.X) {
                layoutParams2.gravity = 5;
            }
            layoutParams2.width = -1;
            layoutParams2.height = org.telegram.messenger.i0.L(8.0f);
            a5Var2.setLayoutParams(layoutParams2);
            org.telegram.ui.ActionBar.b1 c11 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232368, cd.L0(2131745281, null), false, null);
            c11.d(-328966, -328966);
            c11.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            cVar.X(true, true, 0.2f);
                            return;
                        case 1:
                            cVar.X(true, true, 0.5f);
                            return;
                        case 2:
                            cVar.X(true, true, 1.0f);
                            return;
                        case 3:
                            cVar.X(true, true, 1.5f);
                            return;
                        default:
                            cVar.X(true, true, 2.0f);
                            return;
                    }
                }
            });
            c11.setSelectorColor(268435455);
            b1VarArr[0] = c11;
            org.telegram.ui.ActionBar.b1 c12 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232372, cd.L0(2131745284, null), false, null);
            c12.d(-328966, -328966);
            c12.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            cVar.X(true, true, 0.2f);
                            return;
                        case 1:
                            cVar.X(true, true, 0.5f);
                            return;
                        case 2:
                            cVar.X(true, true, 1.0f);
                            return;
                        case 3:
                            cVar.X(true, true, 1.5f);
                            return;
                        default:
                            cVar.X(true, true, 2.0f);
                            return;
                    }
                }
            });
            c12.setSelectorColor(268435455);
            b1VarArr[1] = c12;
            org.telegram.ui.ActionBar.b1 c13 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232371, cd.L0(2131745285, null), false, null);
            c13.d(-328966, -328966);
            c13.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            cVar.X(true, true, 0.2f);
                            return;
                        case 1:
                            cVar.X(true, true, 0.5f);
                            return;
                        case 2:
                            cVar.X(true, true, 1.0f);
                            return;
                        case 3:
                            cVar.X(true, true, 1.5f);
                            return;
                        default:
                            cVar.X(true, true, 2.0f);
                            return;
                    }
                }
            });
            c13.setSelectorColor(268435455);
            b1VarArr[2] = c13;
            org.telegram.ui.ActionBar.b1 c14 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232369, cd.L0(2131745288, null), false, null);
            c14.d(-328966, -328966);
            c14.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            cVar.X(true, true, 0.2f);
                            return;
                        case 1:
                            cVar.X(true, true, 0.5f);
                            return;
                        case 2:
                            cVar.X(true, true, 1.0f);
                            return;
                        case 3:
                            cVar.X(true, true, 1.5f);
                            return;
                        default:
                            cVar.X(true, true, 2.0f);
                            return;
                    }
                }
            });
            c14.setSelectorColor(268435455);
            b1VarArr[3] = c14;
            org.telegram.ui.ActionBar.b1 c15 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232373, cd.L0(2131745282, null), false, null);
            c15.d(-328966, -328966);
            c15.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            cVar.X(true, true, 0.2f);
                            return;
                        case 1:
                            cVar.X(true, true, 0.5f);
                            return;
                        case 2:
                            cVar.X(true, true, 1.0f);
                            return;
                        case 3:
                            cVar.X(true, true, 1.5f);
                            return;
                        default:
                            cVar.X(true, true, 2.0f);
                            return;
                    }
                }
            });
            c15.setSelectorColor(268435455);
            b1VarArr[4] = c15;
            z2Var.f49731l3 = kVar;
            kVar.L(true, o7.B1);
            org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, z2Var.getContext(), this.d, false, false);
            z2Var.f49734m3 = b1Var;
            b1Var.j(cd.L0(2131745289, null), 2131232367, null);
            z2.Y(z2Var, true);
            z2Var.f49734m3.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
            z2Var.f49734m3.setRightIcon(2131232058);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z2Var.f49734m3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) z2Var.f49734m3.getLayoutParams();
            if (cd.X) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = org.telegram.messenger.i0.L(48.0f);
            z2Var.f49734m3.setLayoutParams(layoutParams3);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b((ActionBarPopupWindow$ActionBarPopupWindowLayout) z2Var.f49731l3.f12100b);
            org.telegram.ui.ActionBar.b1 b1Var2 = z2Var.f49734m3;
            b1Var2.P = new p2(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
            b1Var2.setOnClickListener(new l2(this, 11));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f20126c = true;
            if (z10) {
                org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(org.telegram.ui.ActionBar.t6.H8, z2Var.getContext(), this.d);
                h1Var.setTag(2131296437, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(h1Var, w7.b6.o(-1, 8));
                return;
            }
            return;
        }
        z2Var.f49731l3 = null;
        z2Var.f49734m3 = null;
    }

    public final void t(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat L0;
        z2 z2Var = this.f49512x;
        if (z2Var.f49732m1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (L0 = vp.r1(z2Var.f49730l2).L0(Long.valueOf(-z2Var.f49726k1))) != null) {
            TLRPC.ChatFull M0 = vp.r1(z2Var.f49730l2).M0(L0.f19793id);
            if (M0 == null) {
                M0 = hs.a0(z2Var.f49730l2).F0(L0.f19793id, true, new CountDownLatch(1), false, false, 0);
            }
            if (M0 != null && M0.can_view_stats) {
                org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232377, cd.L0(2131743568, null), false, this.d).setOnClickListener(new org.telegram.messenger.video.h(this, storyItem, this.e, L0, 13));
            }
        }
    }
}
