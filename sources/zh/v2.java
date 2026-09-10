package zh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.xr;
public final class v2 extends ds {
    public boolean f48980c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final u7 e;
    public final boolean f48981f;
    public final boolean f48982g;
    public final boolean h;
    public final Context f48983i;
    public final y2 f48984j;
    public final boolean[] f48985k;
    public final a3 f48986l;

    public v2(a3 a3Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.f6 f6Var2, u7 u7Var, boolean z10, boolean z11, boolean z12, Context context2, y2 y2Var, boolean[] zArr) {
        super(context, f6Var, true);
        this.f48986l = a3Var;
        this.d = f6Var2;
        this.e = u7Var;
        this.f48981f = z10;
        this.f48982g = z11;
        this.h = z12;
        this.f48983i = context2;
        this.f48984j = y2Var;
        this.f48985k = zArr;
    }

    @Override
    public final void b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout r32) {
        throw new UnsupportedOperationException("Method not decompiled: zh.v2.b(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
    }

    @Override
    public final void c() {
        if (!this.f48980c && !this.f48985k[0]) {
            AndroidUtilities.runOnUIThread(new p2(this, 0));
        }
        a3 a3Var = this.f48986l;
        a3Var.f48211t1 = null;
        a3Var.f48208s1 = null;
    }

    public final void d(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        z2 z2Var;
        boolean z11 = this.f48981f;
        a3 a3Var = this.f48986l;
        if (z11 && ((z2Var = a3Var.O1) == null || z2Var.f49130b == null)) {
            Context context = a3Var.getContext();
            eh0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
            final og.u0 u0Var = new og.u0(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, 27);
            ?? obj = new Object();
            org.telegram.ui.ActionBar.g1[] g1VarArr = new org.telegram.ui.ActionBar.g1[5];
            obj.f31764c = g1VarArr;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
            obj.f31762a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
            org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
            c10.setOnClickListener(new xr(swipeBack, 1));
            c10.c(-328966, -328966);
            c10.setSelectorColor(268435455);
            View l4Var = new bi.l4(context, 11);
            l4Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
            l4Var.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(l4Var);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) l4Var.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = AndroidUtilities.dp(8.0f);
            l4Var.setLayoutParams(layoutParams);
            org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(context, null);
            obj.f31763b = c1Var;
            c1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
            c1Var.setDrawShadow(false);
            c1Var.setBackgroundColor(-14540254);
            c1Var.setTextColor(-1);
            c1Var.setOnValueChange(new org.telegram.ui.b5(u0Var, 6));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.a(c1Var, w7.a6.n(-1, 44));
            View l4Var2 = new bi.l4(context, 12);
            l4Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
            l4Var2.setBackgroundColor(-15198184);
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(l4Var2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) l4Var2.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams2.gravity = 5;
            }
            layoutParams2.width = -1;
            layoutParams2.height = AndroidUtilities.dp(8.0f);
            l4Var2.setLayoutParams(layoutParams2);
            org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
            c11.c(-328966, -328966);
            c11.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            u0Var.q(true, true, 0.2f);
                            return;
                        case 1:
                            u0Var.q(true, true, 0.5f);
                            return;
                        case 2:
                            u0Var.q(true, true, 1.0f);
                            return;
                        case 3:
                            u0Var.q(true, true, 1.5f);
                            return;
                        default:
                            u0Var.q(true, true, 2.0f);
                            return;
                    }
                }
            });
            c11.setSelectorColor(268435455);
            g1VarArr[0] = c11;
            org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
            c12.c(-328966, -328966);
            c12.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            u0Var.q(true, true, 0.2f);
                            return;
                        case 1:
                            u0Var.q(true, true, 0.5f);
                            return;
                        case 2:
                            u0Var.q(true, true, 1.0f);
                            return;
                        case 3:
                            u0Var.q(true, true, 1.5f);
                            return;
                        default:
                            u0Var.q(true, true, 2.0f);
                            return;
                    }
                }
            });
            c12.setSelectorColor(268435455);
            g1VarArr[1] = c12;
            org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
            c13.c(-328966, -328966);
            c13.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            u0Var.q(true, true, 0.2f);
                            return;
                        case 1:
                            u0Var.q(true, true, 0.5f);
                            return;
                        case 2:
                            u0Var.q(true, true, 1.0f);
                            return;
                        case 3:
                            u0Var.q(true, true, 1.5f);
                            return;
                        default:
                            u0Var.q(true, true, 2.0f);
                            return;
                    }
                }
            });
            c13.setSelectorColor(268435455);
            g1VarArr[2] = c13;
            org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
            c14.c(-328966, -328966);
            c14.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            u0Var.q(true, true, 0.2f);
                            return;
                        case 1:
                            u0Var.q(true, true, 0.5f);
                            return;
                        case 2:
                            u0Var.q(true, true, 1.0f);
                            return;
                        case 3:
                            u0Var.q(true, true, 1.5f);
                            return;
                        default:
                            u0Var.q(true, true, 2.0f);
                            return;
                    }
                }
            });
            c14.setSelectorColor(268435455);
            g1VarArr[3] = c14;
            org.telegram.ui.ActionBar.g1 c15 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
            c15.c(-328966, -328966);
            c15.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            u0Var.q(true, true, 0.2f);
                            return;
                        case 1:
                            u0Var.q(true, true, 0.5f);
                            return;
                        case 2:
                            u0Var.q(true, true, 1.0f);
                            return;
                        case 3:
                            u0Var.q(true, true, 1.5f);
                            return;
                        default:
                            u0Var.q(true, true, 2.0f);
                            return;
                    }
                }
            });
            c15.setSelectorColor(268435455);
            g1VarArr[4] = c15;
            a3Var.C3 = obj;
            obj.a(u7.B1, true);
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, a3Var.getContext(), this.d, false, false);
            a3Var.D3 = g1Var;
            g1Var.g(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
            a3.a0(a3Var, true);
            a3Var.D3.setMinimumWidth(AndroidUtilities.dp(196.0f));
            a3Var.D3.setRightIcon(R.drawable.msg_arrowright);
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a3Var.D3);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) a3Var.D3.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams3.gravity = 5;
            }
            layoutParams3.width = -1;
            layoutParams3.height = AndroidUtilities.dp(48.0f);
            a3Var.D3.setLayoutParams(layoutParams3);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(a3Var.C3.f31762a);
            org.telegram.ui.ActionBar.g1 g1Var2 = a3Var.D3;
            g1Var2.G = new q2(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
            g1Var2.setOnClickListener(new m2(this, 11));
            actionBarPopupWindow$ActionBarPopupWindowLayout.f17520c = true;
            if (z10) {
                org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(a3Var.getContext(), org.telegram.ui.ActionBar.j6.H8, this.d);
                m1Var.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(m1Var, w7.a6.n(-1, 8));
                return;
            }
            return;
        }
        a3Var.C3 = null;
        a3Var.D3 = null;
    }

    public final void e(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        a3 a3Var = this.f48986l;
        if (a3Var.D1 && storyItem != null && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) && (chat = MessagesController.getInstance(a3Var.C2).getChat(Long.valueOf(-a3Var.B1))) != null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(a3Var.C2).getChatFull(chat.f17195id);
            if (chatFull == null) {
                chatFull = MessagesStorage.getInstance(a3Var.C2).loadChatInfo(chat.f17195id, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.can_view_stats) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.d).setOnClickListener(new di.o(this, storyItem, this.e, chat, 16));
            }
        }
    }
}
