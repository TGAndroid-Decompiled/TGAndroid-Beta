package pf;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import kh.b8;
import mh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qd;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o71;
public final class g0 extends sa {
    public static final int f45636c0 = -1;
    public static final int f45637d0 = -2;
    public final TL_account.TL_connectedBot T;
    public final TLRPC.User U;
    public final x V;
    public final LinearLayout W;
    public final kh.d X;
    public final kh.d Y;
    public z41 Z;
    public boolean f45638a0;
    public Boolean f45639b0;

    public g0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, qd qdVar, b6 b6Var) {
        super(activity, null, false, false, false, 2, b6Var);
        this.T = tL_connectedBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
        this.U = user;
        this.G = AndroidUtilities.dp(36.0f);
        this.v = 0.15f;
        x xVar = new x(activity, this.currentAccount, new m2(this, 25), b6Var);
        this.V = xVar;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.f45638a0 = tL_businessBotRecipients.exclude_selected;
        xVar.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.W = linearLayout;
        linearLayout.setOrientation(1);
        z8 z8Var = new z8((b6) null);
        o9 o9Var = new o9(activity);
        o9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        z8Var.r(user);
        o9Var.e(user, z8Var);
        linearLayout.addView(o9Var, e6.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(getThemedColor(f6.G6));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(UserObject.getUserName(user));
        linearLayout.addView(textView, e6.r(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.f32408e.setTitle(UserObject.getUserName(user));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(f6.f23369y6));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.SessionBot));
        linearLayout.addView(textView2, e6.r(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String publicUsername = UserObject.getPublicUsername(user);
        if (!TextUtils.isEmpty(publicUsername)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(getThemedColor(f6.f23061gc));
            textView3.setText("@" + publicUsername);
            textView3.setGravity(17);
            linearLayout.addView(textView3, e6.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i9 = f6.f22947a7;
        setBackgroundColor(getThemedColor(i9));
        fixNavigationBar(getThemedColor(i9));
        wk0 wk0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(72.0f));
        this.d.p1();
        this.d.setOnItemClickListener(new eh.j(this, 18));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{f6.l1(0.0f, getThemedColor(i9)), getThemedColor(i9), getThemedColor(i9)}));
        kh.d dVar = new kh.d(activity, b6Var, true);
        dVar.setRoundRadius(24);
        this.X = dVar;
        dVar.setColor(getThemedColor(f6.wj));
        dVar.setText(LocaleController.getString(R.string.TerminateSession));
        dVar.setOnClickListener(new gd0(this, tL_connectedBot, qdVar, 5));
        frameLayout.addView(dVar, e6.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        kh.d dVar2 = new kh.d(activity, b6Var, true);
        dVar2.setRoundRadius(24);
        this.Y = dVar2;
        dVar2.setText(LocaleController.getString(R.string.BusinessBotUpdate));
        dVar2.setOnClickListener(new v(1, this, tL_connectedBot));
        frameLayout.addView(dVar2, e6.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        S(false);
        FrameLayout.LayoutParams e10 = e6.e(-1, -2, 80);
        int i11 = e10.leftMargin;
        int i12 = this.backgroundPaddingLeft;
        e10.leftMargin = i11 + i12;
        e10.rightMargin += i12;
        this.containerView.addView(frameLayout, e10);
        f2.n nVar = new f2.n();
        nVar.f5532m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.d.setItemAnimator(nVar);
        z41 z41Var = this.Z;
        if (z41Var != null) {
            z41Var.N(false);
        }
    }

    public static void O(g0 g0Var, TL_account.TL_connectedBot tL_connectedBot, TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        g.a(g0Var.currentAccount).b();
        g0Var.dismiss();
        tL_connectedBot.recipients = tL_businessBotRecipients;
        o2 U = LaunchActivity.U();
        if (U != null) {
            j2.q(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(g0Var.U)}, oc.a0(U), R.raw.contact_check, 36);
        }
    }

    public static void P(g0 g0Var, TL_account.TL_connectedBot tL_connectedBot) {
        x xVar = g0Var.V;
        kh.d dVar = g0Var.Y;
        if (dVar.J) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.bot = MessagesController.getInstance(g0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = xVar.b();
        ConnectionsManager.getInstance(g0Var.currentAccount).sendRequest(updateconnectedbot, new bg.b0(g0Var, tL_connectedBot, xVar.c(), 26));
    }

    public static void Q(g0 g0Var, qd qdVar) {
        g.a(g0Var.currentAccount).b();
        qdVar.run();
        g0Var.dismiss();
    }

    public static void R(g0 g0Var, TL_account.TL_connectedBot tL_connectedBot, qd qdVar) {
        kh.d dVar = g0Var.X;
        if (dVar.J) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.deleted = true;
        updateconnectedbot.bot = MessagesController.getInstance(g0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
        ConnectionsManager.getInstance(g0Var.currentAccount).sendRequest(updateconnectedbot, new o71(9, g0Var, qdVar));
    }

    @Override
    public final void A(float f10) {
        h5 titleTextView = this.f32408e.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
    }

    public final void S(boolean z10) {
        final boolean z11;
        float f10;
        float f11;
        float f12;
        float f13;
        int i9;
        float f14;
        float f15;
        float f16;
        float f17;
        int i10 = 0;
        x xVar = this.V;
        if (xVar != null && xVar.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f45639b0;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        this.f45639b0 = Boolean.valueOf(z11);
        float f18 = 0.0f;
        kh.d dVar = this.X;
        kh.d dVar2 = this.Y;
        float f19 = 0.8f;
        if (!z10) {
            if (z11) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            dVar2.setVisibility(i9);
            dVar2.animate().cancel();
            if (z11) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            dVar2.setAlpha(f14);
            if (z11) {
                f15 = 1.0f;
            } else {
                f15 = 0.8f;
            }
            dVar2.setScaleX(f15);
            if (z11) {
                f16 = 1.0f;
            } else {
                f16 = 0.8f;
            }
            dVar2.setScaleY(f16);
            if (z11) {
                i10 = 8;
            }
            dVar.setVisibility(i10);
            dVar.animate().cancel();
            if (!z11) {
                f18 = 1.0f;
            }
            dVar.setAlpha(f18);
            if (!z11) {
                f17 = 1.0f;
            } else {
                f17 = 0.8f;
            }
            dVar.setScaleX(f17);
            if (!z11) {
                f19 = 1.0f;
            }
            dVar.setScaleY(f19);
            return;
        }
        dVar2.setVisibility(0);
        ViewPropertyAnimator animate = dVar2.animate();
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f10);
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f11);
        if (z11) {
            f12 = 1.0f;
        } else {
            f12 = 0.8f;
        }
        ViewPropertyAnimator duration = scaleX.scaleY(f12).setDuration(320L);
        gr grVar = gr.h;
        duration.setInterpolator(grVar).withEndAction(new Runnable(this) {
            public final g0 f45626b;

            {
                this.f45626b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        g0 g0Var = this.f45626b;
                        if (!z12) {
                            g0Var.Y.setVisibility(8);
                            return;
                        } else {
                            g0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        g0 g0Var2 = this.f45626b;
                        if (z13) {
                            g0Var2.X.setVisibility(8);
                            return;
                        } else {
                            g0Var2.getClass();
                            return;
                        }
                }
            }
        }).start();
        dVar.setVisibility(0);
        ViewPropertyAnimator animate2 = dVar.animate();
        if (!z11) {
            f18 = 1.0f;
        }
        ViewPropertyAnimator alpha2 = animate2.alpha(f18);
        if (!z11) {
            f13 = 1.0f;
        } else {
            f13 = 0.8f;
        }
        ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
        if (!z11) {
            f19 = 1.0f;
        }
        scaleX2.scaleY(f19).setDuration(320L).setInterpolator(grVar).withEndAction(new Runnable(this) {
            public final g0 f45626b;

            {
                this.f45626b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        g0 g0Var = this.f45626b;
                        if (!z12) {
                            g0Var.Y.setVisibility(8);
                            return;
                        } else {
                            g0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        g0 g0Var2 = this.f45626b;
                        if (z13) {
                            g0Var2.X.setVisibility(8);
                            return;
                        } else {
                            g0Var2.getClass();
                            return;
                        }
                }
            }
        }).start();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        x xVar = this.V;
        if (xVar != null) {
            xVar.g();
        }
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        x xVar = this.V;
        if (xVar != null && xVar.g()) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(wk0Var, getContext(), this.currentAccount, 0, true, new b8(this, 17), this.resourcesProvider);
        this.Z = z41Var;
        z41Var.f35188r = false;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
