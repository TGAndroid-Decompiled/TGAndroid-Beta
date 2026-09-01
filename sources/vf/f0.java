package vf;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.jm;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.li1;
import org.telegram.ui.yh;
import qh.d4;
import qh.r8;
import qh.v9;
public final class f0 extends sa {
    public static final int f49044d0 = -1;
    public static final int f49045e0 = -2;
    public final TL_account.TL_connectedBot U;
    public final TLRPC.User V;
    public final v W;
    public final LinearLayout X;
    public final qh.d Y;
    public final qh.d Z;
    public x51 f49046a0;
    public boolean f49047b0;
    public Boolean f49048c0;

    public f0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, jm jmVar, g6 g6Var) {
        super(activity, null, false, false, false, 2, g6Var);
        this.U = tL_connectedBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
        this.V = user;
        this.H = AndroidUtilities.dp(36.0f);
        this.v = 0.15f;
        v vVar = new v(activity, this.currentAccount, new v9(this, 20), g6Var);
        this.W = vVar;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.f49047b0 = tL_businessBotRecipients.exclude_selected;
        vVar.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.X = linearLayout;
        linearLayout.setOrientation(1);
        z8 z8Var = new z8((g6) null);
        p9 p9Var = new p9(activity);
        p9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        z8Var.r(user);
        p9Var.e(user, z8Var);
        linearLayout.addView(p9Var, c6.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(getThemedColor(k6.G6));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(UserObject.getUserName(user));
        linearLayout.addView(textView, c6.r(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.f31015e.setTitle(UserObject.getUserName(user));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(k6.f22036y6));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.SessionBot));
        linearLayout.addView(textView2, c6.r(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String publicUsername = UserObject.getPublicUsername(user);
        if (!TextUtils.isEmpty(publicUsername)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(getThemedColor(k6.f21720gc));
            textView3.setText("@" + publicUsername);
            textView3.setGravity(17);
            linearLayout.addView(textView3, c6.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i10 = k6.f21605a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        tl0 tl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(72.0f));
        this.d.p1();
        this.d.setOnItemClickListener(new ag.h(this, 23));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{k6.l1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        qh.d dVar = new qh.d(activity, g6Var, true);
        dVar.setRoundRadius(24);
        this.Y = dVar;
        dVar.setColor(getThemedColor(k6.wj));
        dVar.setText(LocaleController.getString(R.string.TerminateSession));
        dVar.setOnClickListener(new r31(this, tL_connectedBot, jmVar, 6));
        frameLayout.addView(dVar, c6.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        qh.d dVar2 = new qh.d(activity, g6Var, true);
        dVar2.setRoundRadius(24);
        this.Z = dVar2;
        dVar2.setText(LocaleController.getString(R.string.BusinessBotUpdate));
        dVar2.setOnClickListener(new r8(5, this, tL_connectedBot));
        frameLayout.addView(dVar2, c6.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        T(false);
        FrameLayout.LayoutParams e6 = c6.e(-1, -2, 80);
        int i12 = e6.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        e6.leftMargin = i12 + i13;
        e6.rightMargin += i13;
        this.containerView.addView(frameLayout, e6);
        f2.l lVar = new f2.l();
        lVar.f5910m = false;
        lVar.C = false;
        lVar.o(pr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        x51 x51Var = this.f49046a0;
        if (x51Var != null) {
            x51Var.N(false);
        }
    }

    public static void P(f0 f0Var, TL_account.TL_connectedBot tL_connectedBot, TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        f.a(f0Var.currentAccount).b();
        f0Var.dismiss();
        tL_connectedBot.recipients = tL_businessBotRecipients;
        p2 U = LaunchActivity.U();
        if (U != null) {
            yh.s(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(f0Var.V)}, qc.a0(U), R.raw.contact_check, 36);
        }
    }

    public static void Q(f0 f0Var, TL_account.TL_connectedBot tL_connectedBot) {
        v vVar = f0Var.W;
        qh.d dVar = f0Var.Z;
        if (dVar.K) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.bot = MessagesController.getInstance(f0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = vVar.b();
        ConnectionsManager.getInstance(f0Var.currentAccount).sendRequest(updateconnectedbot, new hg.y(f0Var, tL_connectedBot, vVar.c(), 26));
    }

    public static void R(f0 f0Var, jm jmVar) {
        f.a(f0Var.currentAccount).b();
        jmVar.run();
        f0Var.dismiss();
    }

    public static void S(f0 f0Var, TL_account.TL_connectedBot tL_connectedBot, jm jmVar) {
        qh.d dVar = f0Var.Y;
        if (dVar.K) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.deleted = true;
        updateconnectedbot.bot = MessagesController.getInstance(f0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
        ConnectionsManager.getInstance(f0Var.currentAccount).sendRequest(updateconnectedbot, new li1(10, f0Var, jmVar));
    }

    @Override
    public final void B(float f10) {
        l5 titleTextView = this.f31015e.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
    }

    public final void T(boolean z4) {
        final boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        float f14;
        float f15;
        float f16;
        float f17;
        int i11 = 0;
        v vVar = this.W;
        if (vVar != null && vVar.g()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f49048c0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        this.f49048c0 = Boolean.valueOf(z10);
        float f18 = 0.0f;
        qh.d dVar = this.Y;
        qh.d dVar2 = this.Z;
        float f19 = 0.8f;
        if (!z4) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            dVar2.setVisibility(i10);
            dVar2.animate().cancel();
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            dVar2.setAlpha(f14);
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.8f;
            }
            dVar2.setScaleX(f15);
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.8f;
            }
            dVar2.setScaleY(f16);
            if (z10) {
                i11 = 8;
            }
            dVar.setVisibility(i11);
            dVar.animate().cancel();
            if (!z10) {
                f18 = 1.0f;
            }
            dVar.setAlpha(f18);
            if (!z10) {
                f17 = 1.0f;
            } else {
                f17 = 0.8f;
            }
            dVar.setScaleX(f17);
            if (!z10) {
                f19 = 1.0f;
            }
            dVar.setScaleY(f19);
            return;
        }
        dVar2.setVisibility(0);
        ViewPropertyAnimator animate = dVar2.animate();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f10);
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f11);
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.8f;
        }
        ViewPropertyAnimator duration = scaleX.scaleY(f12).setDuration(320L);
        pr prVar = pr.h;
        duration.setInterpolator(prVar).withEndAction(new Runnable(this) {
            public final f0 f49034b;

            {
                this.f49034b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z11 = z10;
                        f0 f0Var = this.f49034b;
                        if (!z11) {
                            f0Var.Z.setVisibility(8);
                            return;
                        } else {
                            f0Var.getClass();
                            return;
                        }
                    default:
                        boolean z12 = z10;
                        f0 f0Var2 = this.f49034b;
                        if (z12) {
                            f0Var2.Y.setVisibility(8);
                            return;
                        } else {
                            f0Var2.getClass();
                            return;
                        }
                }
            }
        }).start();
        dVar.setVisibility(0);
        ViewPropertyAnimator animate2 = dVar.animate();
        if (!z10) {
            f18 = 1.0f;
        }
        ViewPropertyAnimator alpha2 = animate2.alpha(f18);
        if (!z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.8f;
        }
        ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
        if (!z10) {
            f19 = 1.0f;
        }
        scaleX2.scaleY(f19).setDuration(320L).setInterpolator(prVar).withEndAction(new Runnable(this) {
            public final f0 f49034b;

            {
                this.f49034b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z11 = z10;
                        f0 f0Var = this.f49034b;
                        if (!z11) {
                            f0Var.Z.setVisibility(8);
                            return;
                        } else {
                            f0Var.getClass();
                            return;
                        }
                    default:
                        boolean z12 = z10;
                        f0 f0Var2 = this.f49034b;
                        if (z12) {
                            f0Var2.Y.setVisibility(8);
                            return;
                        } else {
                            f0Var2.getClass();
                            return;
                        }
                }
            }
        }).start();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        v vVar = this.W;
        if (vVar != null) {
            vVar.g();
        }
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        v vVar = this.W;
        if (vVar != null && vVar.g()) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override
    public final sl0 v(tl0 tl0Var) {
        x51 x51Var = new x51(tl0Var, getContext(), this.currentAccount, 0, true, new d4(this, 18), this.resourcesProvider);
        this.f49046a0 = x51Var;
        x51Var.f32957r = false;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
