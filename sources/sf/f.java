package sf;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.ya0;
import org.telegram.ui.tn;
public final class f extends FrameLayout {
    public final int f47788a;
    public final e9 f47789b;
    public final t9 f47790c;
    public final LinearLayout d;
    public final o6 f47791e;
    public final o6 f47792f;
    public final xp h;
    public final ImageView f47793n;
    public boolean f47794r;
    public long f47795s;
    public long v;
    public int f47796w;
    public String f47797x;
    public float f47798y;

    public f(Activity activity, c6 c6Var, tn tnVar) {
        super(activity);
        int i10;
        this.f47788a = tnVar.getCurrentAccount();
        this.f47794r = false;
        t9 t9Var = new t9(activity);
        this.f47790c = t9Var;
        TLRPC.User user = tnVar.getMessagesController().getUser(Long.valueOf(this.v));
        e9 e9Var = new e9((c6) null);
        this.f47789b = e9Var;
        e9Var.r(user);
        t9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        t9Var.e(user, e9Var);
        addView(t9Var, f6.d(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        o6 o6Var = new o6(activity, false, false, false);
        this.f47791e = o6Var;
        o6Var.f31268n = false;
        o6Var.getDrawable().o(true, false, false);
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var.setText(UserObject.getUserName(user));
        o6Var.setTextColor(g6.v0(g6.G6, c6Var));
        o6Var.setEllipsizeByGradient(true);
        linearLayout.addView(o6Var, f6.k(0.0f, 0.0f, 0.0f, 1.0f, -1, 17));
        o6 o6Var2 = new o6(activity, false, false, false);
        this.f47792f = o6Var2;
        o6Var2.f31268n = false;
        o6Var2.getDrawable().o(true, false, false);
        o6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        o6Var2.setTextColor(g6.v0(g6.f23124ge, c6Var));
        o6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(o6Var2, f6.n(-1, 17));
        addView(linearLayout, f6.d(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        xp xpVar = new xp(activity);
        this.h = xpVar;
        xpVar.getDrawable().o(true, true, false);
        xpVar.b(0.75f, 350L, jr.h);
        xpVar.setScaleProperty(0.6f);
        xpVar.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(14.0f);
        int i11 = g6.Oh;
        int v02 = g6.v0(i11, c6Var);
        int v = g6.v(g6.v0(i11, c6Var), g6.l1(0.12f, -1));
        xpVar.setBackgroundDrawable(g6.i0(dp, dp, dp, dp, v02, v, v));
        xpVar.setTextSize(AndroidUtilities.dp(14.0f));
        xpVar.setGravity(5);
        xpVar.setTextColor(g6.v0(g6.Sh, c6Var));
        xpVar.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        xpVar.setOnClickListener(new mh.n(this, 23));
        xpVar.setOnWidthUpdatedListener(new e(this, 0));
        if (this.f47794r) {
            i10 = R.string.BizBotStart;
        } else {
            i10 = R.string.BizBotStop;
        }
        xpVar.setText(LocaleController.getString(i10));
        addView(xpVar, f6.d(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        this.f47793n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(g6.M(g6.v0(g6.f23152i6, c6Var), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.f23069de, c6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new ya0(this, tnVar, c6Var, 5));
        addView(imageView, f6.d(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public final void a() {
        float f9 = this.f47798y;
        xp xpVar = this.h;
        float d = xpVar.getDrawable().d() + f9 + xpVar.getPaddingLeft() + xpVar.getPaddingRight() + AndroidUtilities.dp(12.0f);
        this.f47791e.setRightPadding(d);
        this.f47792f.setRightPadding(d);
    }

    public void setLeftMargin(float f9) {
        this.f47798y = f9;
        this.f47790c.setTranslationX(f9);
        this.d.setTranslationX(f9);
        a();
    }
}
