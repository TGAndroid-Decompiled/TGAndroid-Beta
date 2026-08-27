package qf;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import lh.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rc1;

public final class g0 extends qa {

    public static final int f46303c0 = -1;

    public static final int f46304d0 = -2;
    public final TL_account.TL_connectedBot T;
    public final TLRPC.User U;
    public final x V;
    public final LinearLayout W;
    public final lh.d X;
    public final lh.d Y;
    public b51 Z;

    public boolean f46305a0;

    public Boolean f46306b0;

    public g0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, xl xlVar, c6 c6Var) {
        super(activity, null, false, false, false, 2, c6Var);
        this.T = tL_connectedBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
        this.U = user;
        this.G = AndroidUtilities.dp(36.0f);
        this.v = 0.15f;
        x xVar = new x(activity, this.currentAccount, new b(this, 2), c6Var);
        this.V = xVar;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.f46305a0 = tL_businessBotRecipients.exclude_selected;
        xVar.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.W = linearLayout;
        linearLayout.setOrientation(1);
        y8 y8Var = new y8((c6) null);
        n9 n9Var = new n9(activity);
        n9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        y8Var.r(user);
        n9Var.e(user, y8Var);
        linearLayout.addView(n9Var, z5.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(getThemedColor(g6.G6));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(UserObject.getUserName(user));
        linearLayout.addView(textView, z5.r(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.f31853e.setTitle(UserObject.getUserName(user));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(g6.f23423y6));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.SessionBot));
        linearLayout.addView(textView2, z5.r(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String publicUsername = UserObject.getPublicUsername(user);
        if (!TextUtils.isEmpty(publicUsername)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(getThemedColor(g6.gc));
            textView3.setText("@" + publicUsername);
            textView3.setGravity(17);
            linearLayout.addView(textView3, z5.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i10 = g6.f22999a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        zk0 zk0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(72.0f));
        this.d.p1();
        this.d.setOnItemClickListener(new ag.p0(this, 20));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{g6.l1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        lh.d dVar = new lh.d(activity, c6Var, true);
        dVar.setRoundRadius(24);
        this.X = dVar;
        dVar.setColor(getThemedColor(g6.wj));
        dVar.setText(LocaleController.getString(R.string.TerminateSession));
        dVar.setOnClickListener(new ld0(this, tL_connectedBot, xlVar, 5));
        frameLayout.addView(dVar, z5.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        lh.d dVar2 = new lh.d(activity, c6Var, true);
        dVar2.setRoundRadius(24);
        this.Y = dVar2;
        dVar2.setText(LocaleController.getString(R.string.BusinessBotUpdate));
        dVar2.setOnClickListener(new org.telegram.ui.web.c(2, this, tL_connectedBot));
        frameLayout.addView(dVar2, z5.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        T(false);
        FrameLayout.LayoutParams layoutParamsE = z5.e(-1, -2, 80);
        int i12 = layoutParamsE.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        layoutParamsE.leftMargin = i12 + i13;
        layoutParamsE.rightMargin += i13;
        this.containerView.addView(frameLayout, layoutParamsE);
        f2.l lVar = new f2.l();
        lVar.f5819m = false;
        lVar.C = false;
        lVar.o(er.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        b51 b51Var = this.Z;
        if (b51Var != null) {
            b51Var.N(false);
        }
    }

    public static void P(g0 g0Var, TL_account.TL_connectedBot tL_connectedBot, TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        h.a(g0Var.currentAccount).b();
        g0Var.dismiss();
        tL_connectedBot.recipients = tL_businessBotRecipients;
        n2 n2VarU = LaunchActivity.U();
        if (n2VarU != null) {
            pa.r(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(g0Var.U)}, mc.a0(n2VarU), R.raw.contact_check, 36);
        }
    }

    public static void Q(g0 g0Var, TL_account.TL_connectedBot tL_connectedBot) {
        x xVar = g0Var.V;
        lh.d dVar = g0Var.Y;
        if (dVar.J) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.bot = MessagesController.getInstance(g0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = xVar.b();
        ConnectionsManager.getInstance(g0Var.currentAccount).sendRequest(updateconnectedbot, new cg.y(g0Var, tL_connectedBot, xVar.c(), 26));
    }

    public static void R(g0 g0Var, xl xlVar) {
        h.a(g0Var.currentAccount).b();
        xlVar.run();
        g0Var.dismiss();
    }

    public static void S(g0 g0Var, TL_account.TL_connectedBot tL_connectedBot, xl xlVar) {
        lh.d dVar = g0Var.X;
        if (dVar.J) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.deleted = true;
        updateconnectedbot.bot = MessagesController.getInstance(g0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
        ConnectionsManager.getInstance(g0Var.currentAccount).sendRequest(updateconnectedbot, new rc1(9, g0Var, xlVar));
    }

    @Override
    public final void C(float f10) {
        h5 titleTextView = this.f31853e.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
    }

    public final void T(boolean z10) {
        x xVar = this.V;
        final boolean z11 = xVar != null && xVar.g();
        Boolean bool = this.f46306b0;
        if (bool == null || bool.booleanValue() != z11) {
            this.f46306b0 = Boolean.valueOf(z11);
            lh.d dVar = this.X;
            lh.d dVar2 = this.Y;
            if (z10) {
                dVar2.setVisibility(0);
                ViewPropertyAnimator duration = dVar2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(320L);
                er erVar = er.h;
                final int i10 = 0;
                duration.setInterpolator(erVar).withEndAction(new Runnable(this) {

                    public final g0 f46288b;

                    {
                        this.f46288b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z12 = z11;
                                g0 g0Var = this.f46288b;
                                if (!z12) {
                                    g0Var.Y.setVisibility(8);
                                } else {
                                    g0Var.getClass();
                                }
                                break;
                            default:
                                boolean z13 = z11;
                                g0 g0Var2 = this.f46288b;
                                if (!z13) {
                                    g0Var2.getClass();
                                } else {
                                    g0Var2.X.setVisibility(8);
                                }
                                break;
                        }
                    }
                }).start();
                dVar.setVisibility(0);
                final int i11 = 1;
                dVar.animate().alpha(z11 ? 0.0f : 1.0f).scaleX(!z11 ? 1.0f : 0.8f).scaleY(z11 ? 0.8f : 1.0f).setDuration(320L).setInterpolator(erVar).withEndAction(new Runnable(this) {

                    public final g0 f46288b;

                    {
                        this.f46288b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z12 = z11;
                                g0 g0Var = this.f46288b;
                                if (!z12) {
                                    g0Var.Y.setVisibility(8);
                                } else {
                                    g0Var.getClass();
                                }
                                break;
                            default:
                                boolean z13 = z11;
                                g0 g0Var2 = this.f46288b;
                                if (!z13) {
                                    g0Var2.getClass();
                                } else {
                                    g0Var2.X.setVisibility(8);
                                }
                                break;
                        }
                    }
                }).start();
                return;
            }
            dVar2.setVisibility(z11 ? 0 : 8);
            dVar2.animate().cancel();
            dVar2.setAlpha(z11 ? 1.0f : 0.0f);
            dVar2.setScaleX(z11 ? 1.0f : 0.8f);
            dVar2.setScaleY(z11 ? 1.0f : 0.8f);
            dVar.setVisibility(z11 ? 8 : 0);
            dVar.animate().cancel();
            dVar.setAlpha(z11 ? 0.0f : 1.0f);
            dVar.setScaleX(!z11 ? 1.0f : 0.8f);
            dVar.setScaleY(z11 ? 0.8f : 1.0f);
        }
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
        if (xVar == null || !xVar.g()) {
            return super.canDismissWithTouchOutside();
        }
        return false;
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(zk0Var, getContext(), this.currentAccount, 0, true, new a8(this, 17), this.resourcesProvider);
        this.Z = b51Var;
        b51Var.f26942r = false;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        return null;
    }
}
