package zh;

import android.content.Context;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cb;
import org.telegram.ui.mx;
public final class i4 extends org.telegram.ui.ActionBar.h3 {
    public static final int h = 0;
    public final qg.s0 f48496b;
    public boolean f48497c;
    public final int d;
    public mx e;
    public final xh.x f48498f;

    public i4(Context context, float f7, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        this.f48498f = new xh.x(this, 27);
        this.d = i10;
        h4 h4Var = new h4(this, getContext(), f7);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false)));
        imageView.setImageResource(R.drawable.large_stealth);
        h4Var.addView(imageView, w7.a6.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        h4Var.addView(linearLayout, w7.a6.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.k(20.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        textView.setText(LocaleController.getString(R.string.StealthModeTitle));
        linearLayout.addView(textView, w7.a6.q(-2, -2, 1));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
        l5Var.setTextSize(14);
        l5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        l5Var.setMaxLines(100);
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18306y6, f6Var));
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            l5Var.l(LocaleController.getString(R.string.StealthModeHint), false);
        } else {
            l5Var.l(LocaleController.getString(R.string.StealthModePremiumHint), false);
        }
        linearLayout.addView(l5Var, w7.a6.t(-2, -2, 1, 36, 10, 36, 0));
        bi.w7 w7Var = new bi.w7(this, getContext());
        ((ImageView) w7Var.d).setImageResource(R.drawable.msg_stealth_5min);
        ((TextView) w7Var.f3833b).setText(LocaleController.getString(R.string.HideRecentViews));
        ((TextView) w7Var.f3834c).setText(LocaleController.getString(R.string.HideRecentViewsDescription));
        linearLayout.addView(w7Var, w7.a6.t(-1, -2, 0, 0, 20, 0, 0));
        bi.w7 w7Var2 = new bi.w7(this, getContext());
        ((ImageView) w7Var2.d).setImageResource(R.drawable.msg_stealth_25min);
        ((TextView) w7Var2.f3833b).setText(LocaleController.getString(R.string.HideNextViews));
        ((TextView) w7Var2.f3834c).setText(LocaleController.getString(R.string.HideNextViewsDescription));
        linearLayout.addView(w7Var2, w7.a6.t(-1, -2, 0, 0, 10, 0, 0));
        qg.s0 s0Var = new qg.s0(AndroidUtilities.dp(8.0f), context, f6Var, true);
        this.f48496b = s0Var;
        s0Var.H = false;
        s0Var.e.getDrawable().f25444y = false;
        s0Var.setIcon(R.raw.unlock_icon);
        w7.c6.a(s0Var);
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (!currentUser.premium) {
            s0Var.setIcon(R.raw.unlock_icon);
            s0Var.a(LocaleController.getString(R.string.UnlockStealthMode), new org.telegram.ui.web.c(this, 26), false);
        } else {
            q(false);
        }
        linearLayout.addView(s0Var, w7.a6.t(-1, 48, 80, 14, 24, 14, 16));
        setCustomView(h4Var);
        s0Var.setOnClickListener(new cb(this, currentUser, i10, f6Var, 6));
    }

    public static void m(i4 i4Var, TLRPC.User user, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        if (!user.premium) {
            i4Var.dismiss();
            org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
            if (R != null) {
                R.showDialog(new qg.a1(R, 14, false));
            }
        } else if (i4Var.f48497c) {
            i4Var.dismiss();
            mx mxVar = i4Var.e;
            if (mxVar != null) {
                mxVar.a(false);
            }
        } else {
            i5 storiesController = MessagesController.getInstance(i4Var.currentAccount).getStoriesController();
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = storiesController.B;
            if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(i4Var.currentAccount).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                if (i4Var.f48497c) {
                    i4Var.dismiss();
                    mx mxVar2 = i4Var.e;
                    if (mxVar2 != null) {
                        mxVar2.a(false);
                        return;
                    }
                    return;
                }
                new wc(i4Var.container, f6Var).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.StealthModeCooldownHint)), null).k(true);
                return;
            }
            TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
            tL_stories_activateStealthMode.future = true;
            tL_stories_activateStealthMode.past = true;
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
            tL_storiesStealthMode2.flags |= 3;
            tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(i4Var.currentAccount).getCurrentTime() + MessagesController.getInstance(i4Var.currentAccount).stealthModeCooldown;
            tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(i4Var.currentAccount).getCurrentTime() + MessagesController.getInstance(i4Var.currentAccount).stealthModeFuture;
            storiesController.f0(tL_storiesStealthMode2);
            ConnectionsManager.getInstance(i4Var.currentAccount).sendRequest(tL_stories_activateStealthMode, new bi.g1(18));
            try {
                i4Var.containerView.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            i4Var.dismiss();
            if (i10 == 0) {
                p();
            }
            mx mxVar3 = i4Var.e;
            if (mxVar3 != null) {
                mxVar3.a(true);
            }
        }
    }

    public static void p() {
        wc X;
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R.getLastStoryViewer() != null) {
            X = new wc(R.getLastStoryViewer().f48958s, R.getLastStoryViewer().f48972y);
        } else {
            X = wc.X();
        }
        if (X != null) {
            int i10 = R.drawable.msg_stories_stealth2;
            String string = LocaleController.getString(R.string.StealthModeOn);
            String string2 = LocaleController.getString(R.string.StealthModeOnHint);
            lc lcVar = new lc(X.W(), X.f28749c);
            lcVar.f24933a.setImageResource(i10);
            lcVar.f24934b.setText(string);
            TextView textView = lcVar.f24935c;
            textView.setText(string2);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            X.b(lcVar, 5000).j();
        }
    }

    public final void q(boolean z10) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(this.currentAccount).getStoriesController().B;
        qg.s0 s0Var = this.f48496b;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.f48497c = true;
            s0Var.b(LocaleController.getString(R.string.StealthModeIsActive), true, z10);
            s0Var.e.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
            return;
        }
        if (tL_storiesStealthMode != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            int i10 = tL_storiesStealthMode.cooldown_until_date;
            if (currentTime <= i10) {
                long currentTime2 = i10 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                int i11 = (int) (currentTime2 % 60);
                long j3 = currentTime2 / 60;
                int i12 = (int) (j3 / 60);
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf(i12)));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf((int) (j3 % 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i11)));
                s0Var.b(LocaleController.formatString("AvailableIn", R.string.AvailableIn, sb2.toString()), true, z10);
                s0Var.e.setTextColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false), 125));
                xh.x xVar = this.f48498f;
                AndroidUtilities.cancelRunOnUIThread(xVar);
                AndroidUtilities.runOnUIThread(xVar, 1000L);
                return;
            }
        }
        int i13 = this.d;
        if (i13 == 0) {
            s0Var.b(LocaleController.getString(R.string.EnableStealthMode), true, z10);
        } else if (i13 == 1) {
            s0Var.b(LocaleController.getString(R.string.EnableStealthModeAndOpenStory), true, z10);
        }
        s0Var.e.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
    }
}
