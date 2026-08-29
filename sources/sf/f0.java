package sf;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import nh.t4;
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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.i8;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.ya0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qe1;
import org.telegram.ui.th;
public final class f0 extends xa {
    public static final int f47799c0 = -1;
    public static final int f47800d0 = -2;
    public final TL_account.TL_connectedBot T;
    public final TLRPC.User U;
    public final w V;
    public final LinearLayout W;
    public final nh.d X;
    public final nh.d Y;
    public k51 Z;
    public boolean f47801a0;
    public Boolean f47802b0;

    public f0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, i8 i8Var, c6 c6Var) {
        super(activity, null, false, false, false, 2, c6Var);
        this.T = tL_connectedBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
        this.U = user;
        this.G = AndroidUtilities.dp(36.0f);
        this.v = 0.15f;
        w wVar = new w(activity, this.currentAccount, new org.telegram.ui.web.t1(this, 16), c6Var);
        this.V = wVar;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.f47801a0 = tL_businessBotRecipients.exclude_selected;
        wVar.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.W = linearLayout;
        linearLayout.setOrientation(1);
        e9 e9Var = new e9((c6) null);
        t9 t9Var = new t9(activity);
        t9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        e9Var.r(user);
        t9Var.e(user, e9Var);
        linearLayout.addView(t9Var, f6.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(getThemedColor(g6.G6));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(UserObject.getUserName(user));
        linearLayout.addView(textView, f6.r(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.f34660e.setTitle(UserObject.getUserName(user));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(g6.f23433y6));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.SessionBot));
        linearLayout.addView(textView2, f6.r(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String publicUsername = UserObject.getPublicUsername(user);
        if (!TextUtils.isEmpty(publicUsername)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(getThemedColor(g6.gc));
            textView3.setText("@" + publicUsername);
            textView3.setGravity(17);
            linearLayout.addView(textView3, f6.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i10 = g6.f23009a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        jl0 jl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(72.0f));
        this.d.p1();
        this.d.setOnItemClickListener(new bg.o(this, 22));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{g6.l1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        nh.d dVar = new nh.d(activity, c6Var, true);
        dVar.setRoundRadius(24);
        this.X = dVar;
        dVar.setColor(getThemedColor(g6.wj));
        dVar.setText(LocaleController.getString(R.string.TerminateSession));
        dVar.setOnClickListener(new ya0(this, tL_connectedBot, i8Var, 6));
        frameLayout.addView(dVar, f6.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        nh.d dVar2 = new nh.d(activity, c6Var, true);
        dVar2.setRoundRadius(24);
        this.Y = dVar2;
        dVar2.setText(LocaleController.getString(R.string.BusinessBotUpdate));
        dVar2.setOnClickListener(new org.telegram.ui.web.c(5, this, tL_connectedBot));
        frameLayout.addView(dVar2, f6.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        T(false);
        FrameLayout.LayoutParams e10 = f6.e(-1, -2, 80);
        int i12 = e10.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        e10.leftMargin = i12 + i13;
        e10.rightMargin += i13;
        this.containerView.addView(frameLayout, e10);
        f2.l lVar = new f2.l();
        lVar.f6463m = false;
        lVar.C = false;
        lVar.o(jr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        k51 k51Var = this.Z;
        if (k51Var != null) {
            k51Var.N(false);
        }
    }

    public static void P(f0 f0Var, TL_account.TL_connectedBot tL_connectedBot, TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        g.a(f0Var.currentAccount).b();
        f0Var.dismiss();
        tL_connectedBot.recipients = tL_businessBotRecipients;
        o2 U = LaunchActivity.U();
        if (U != null) {
            th.r(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(f0Var.U)}, tc.a0(U), R.raw.contact_check, 36);
        }
    }

    public static void Q(f0 f0Var, TL_account.TL_connectedBot tL_connectedBot) {
        w wVar = f0Var.V;
        nh.d dVar = f0Var.Y;
        if (dVar.J) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.bot = MessagesController.getInstance(f0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = wVar.b();
        ConnectionsManager.getInstance(f0Var.currentAccount).sendRequest(updateconnectedbot, new eg.z(f0Var, tL_connectedBot, wVar.c(), 26));
    }

    public static void R(f0 f0Var, i8 i8Var) {
        g.a(f0Var.currentAccount).b();
        i8Var.run();
        f0Var.dismiss();
    }

    public static void S(f0 f0Var, TL_account.TL_connectedBot tL_connectedBot, i8 i8Var) {
        nh.d dVar = f0Var.X;
        if (dVar.J) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.deleted = true;
        updateconnectedbot.bot = MessagesController.getInstance(f0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
        ConnectionsManager.getInstance(f0Var.currentAccount).sendRequest(updateconnectedbot, new qe1(10, f0Var, i8Var));
    }

    @Override
    public final void B(float f9) {
        h5 titleTextView = this.f34660e.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f9);
        }
    }

    public final void T(boolean z10) {
        final boolean z11;
        float f9;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float f14;
        float f15;
        float f16;
        int i11 = 0;
        w wVar = this.V;
        if (wVar != null && wVar.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f47802b0;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        this.f47802b0 = Boolean.valueOf(z11);
        float f17 = 0.0f;
        nh.d dVar = this.X;
        nh.d dVar2 = this.Y;
        float f18 = 0.8f;
        if (!z10) {
            if (z11) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            dVar2.setVisibility(i10);
            dVar2.animate().cancel();
            if (z11) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            dVar2.setAlpha(f13);
            if (z11) {
                f14 = 1.0f;
            } else {
                f14 = 0.8f;
            }
            dVar2.setScaleX(f14);
            if (z11) {
                f15 = 1.0f;
            } else {
                f15 = 0.8f;
            }
            dVar2.setScaleY(f15);
            if (z11) {
                i11 = 8;
            }
            dVar.setVisibility(i11);
            dVar.animate().cancel();
            if (!z11) {
                f17 = 1.0f;
            }
            dVar.setAlpha(f17);
            if (!z11) {
                f16 = 1.0f;
            } else {
                f16 = 0.8f;
            }
            dVar.setScaleX(f16);
            if (!z11) {
                f18 = 1.0f;
            }
            dVar.setScaleY(f18);
            return;
        }
        dVar2.setVisibility(0);
        ViewPropertyAnimator animate = dVar2.animate();
        if (z11) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f9);
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f10);
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ViewPropertyAnimator duration = scaleX.scaleY(f11).setDuration(320L);
        jr jrVar = jr.h;
        duration.setInterpolator(jrVar).withEndAction(new Runnable(this) {
            public final f0 f47784b;

            {
                this.f47784b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        f0 f0Var = this.f47784b;
                        if (!z12) {
                            f0Var.Y.setVisibility(8);
                            return;
                        } else {
                            f0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        f0 f0Var2 = this.f47784b;
                        if (z13) {
                            f0Var2.X.setVisibility(8);
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
        if (!z11) {
            f17 = 1.0f;
        }
        ViewPropertyAnimator alpha2 = animate2.alpha(f17);
        if (!z11) {
            f12 = 1.0f;
        } else {
            f12 = 0.8f;
        }
        ViewPropertyAnimator scaleX2 = alpha2.scaleX(f12);
        if (!z11) {
            f18 = 1.0f;
        }
        scaleX2.scaleY(f18).setDuration(320L).setInterpolator(jrVar).withEndAction(new Runnable(this) {
            public final f0 f47784b;

            {
                this.f47784b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        f0 f0Var = this.f47784b;
                        if (!z12) {
                            f0Var.Y.setVisibility(8);
                            return;
                        } else {
                            f0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        f0 f0Var2 = this.f47784b;
                        if (z13) {
                            f0Var2.X.setVisibility(8);
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
        w wVar = this.V;
        if (wVar != null) {
            wVar.g();
        }
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        w wVar = this.V;
        if (wVar != null && wVar.g()) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(jl0Var, getContext(), this.currentAccount, 0, true, new t4(this, 18), this.resourcesProvider);
        this.Z = k51Var;
        k51Var.f29939r = false;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
