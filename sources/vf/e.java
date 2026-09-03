package vf;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.z8;
import org.telegram.ui.xn;
public final class e extends FrameLayout {
    public final int f49058a;
    public final z8 f49059b;
    public final p9 f49060c;
    public final LinearLayout d;
    public final k6 f49061e;
    public final k6 f49062f;
    public final dq h;
    public final ImageView f49063n;
    public boolean f49064r;
    public long f49065s;
    public long v;
    public int f49066w;
    public String f49067x;
    public float f49068y;

    public e(Activity activity, g6 g6Var, xn xnVar) {
        super(activity);
        int i10;
        this.f49058a = xnVar.getCurrentAccount();
        this.f49064r = false;
        p9 p9Var = new p9(activity);
        this.f49060c = p9Var;
        TLRPC.User user = xnVar.getMessagesController().getUser(Long.valueOf(this.v));
        z8 z8Var = new z8((g6) null);
        this.f49059b = z8Var;
        z8Var.r(user);
        p9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        p9Var.e(user, z8Var);
        addView(p9Var, c6.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        k6 k6Var = new k6(activity, false, false, false);
        this.f49061e = k6Var;
        k6Var.f28285n = false;
        k6Var.getDrawable().o(true, false, false);
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setTextSize(AndroidUtilities.dp(14.0f));
        k6Var.setText(UserObject.getUserName(user));
        k6Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        k6Var.setEllipsizeByGradient(true);
        linearLayout.addView(k6Var, c6.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        k6 k6Var2 = new k6(activity, false, false, false);
        this.f49062f = k6Var2;
        k6Var2.f28285n = false;
        k6Var2.getDrawable().o(true, false, false);
        k6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        k6Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21724ge, g6Var));
        k6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(k6Var2, c6.n(-1, 17));
        addView(linearLayout, c6.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        dq dqVar = new dq(activity);
        this.h = dqVar;
        dqVar.getDrawable().o(true, true, false);
        dqVar.b(0.75f, 350L, pr.h);
        dqVar.setScaleProperty(0.6f);
        dqVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i11, g6Var);
        int v = org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.v0(i11, g6Var), org.telegram.ui.ActionBar.k6.l1(0.12f, -1));
        dqVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, v02, v, v));
        dqVar.setTextSize(AndroidUtilities.dp(14.0f));
        dqVar.setGravity(5);
        dqVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Sh, g6Var));
        dqVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        dqVar.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 23));
        dqVar.setOnWidthUpdatedListener(new d(this, 0));
        if (this.f49064r) {
            i10 = R.string.BizBotStart;
        } else {
            i10 = R.string.BizBotStop;
        }
        dqVar.setText(LocaleController.getString(i10));
        addView(dqVar, c6.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.f49063n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.M(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21752i6, g6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21669de, g6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new q31(this, xnVar, g6Var, 5));
        addView(imageView, c6.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f10 = this.f49068y;
        dq dqVar = this.h;
        float d = dqVar.getDrawable().d() + f10 + dqVar.getPaddingLeft() + dqVar.getPaddingRight() + AndroidUtilities.dp(12.0f);
        this.f49061e.setRightPadding(d);
        this.f49062f.setRightPadding(d);
    }

    public void setLeftMargin(float f10) {
        this.f49068y = f10;
        this.f49060c.setTranslationX(f10);
        this.d.setTranslationX(f10);
        a();
    }
}
