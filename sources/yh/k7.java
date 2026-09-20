package yh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p90;
import org.telegram.ui.s00;
public final class k7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public long f47657a;
    public final int f47658b;
    public final s00 f47659c;
    public boolean d;
    public SpannableString e;
    public long f47660f;
    public final oq[] h;
    public final oq[] f47661n;
    public ValueAnimator f47662r;

    public k7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f47660f = -1L;
        this.h = new oq[1];
        this.f47661n = new oq[1];
        this.f47658b = i10;
        this.f47657a = UserConfig.getInstance(i10).getClientUserId();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        rk.n(i11, f6Var, textView, 1, 13.0f);
        textView.setText(LocaleController.getString(R.string.StarsBalance));
        textView.setGravity(5);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.y5.q(-2, -2, 5));
        s00 s00Var = new s00(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.f47659c = s00Var;
        s00Var.f26820n = true;
        s00Var.getDrawable().o(false, true, false);
        s00Var.setTypeface(AndroidUtilities.bold());
        s00Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        s00Var.setTextSize(AndroidUtilities.dp(13.0f));
        s00Var.setGravity(5);
        s00Var.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
        addView(s00Var, w7.y5.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
    }

    public final void a(boolean z10) {
        u5 u5Var;
        boolean z11;
        boolean z12;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10 = this.f47658b;
        u5 y3 = u5.y(i10, false);
        if (this.d) {
            u5Var = u5.y(i10, true);
        } else {
            u5Var = null;
        }
        long j3 = 0;
        zf.a i11 = zf.a.i(0L, zf.b.f49255b);
        s00 s00Var = this.f47659c;
        s00Var.a();
        if (this.f47657a == UserConfig.getInstance(i10).getClientUserId()) {
            z12 = !y3.e;
            j3 = y3.p().amount;
            if (u5Var != null) {
                z12 |= !u5Var.e;
                i11 = u5Var.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = o.g(i10).h(this.f47657a, false);
            if (h != null && h.status != null) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (h != null && (tL_starsRevenueStatus = h.status) != null) {
                j3 = tL_starsRevenueStatus.current_balance.amount;
            }
            z12 = z11;
        }
        long j10 = this.f47660f;
        if (j3 > j10 && j10 != -1) {
            ValueAnimator valueAnimator = this.f47662r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f47662r = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 25));
            this.f47662r.addListener(new pg.d0(this, 11));
            this.f47662r.setDuration(320L);
            this.f47662r.setInterpolator(new OvershootInterpolator());
            this.f47662r.start();
        }
        if (z12) {
            if (this.e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.e = spannableString;
                spannableString.setSpan(new p90(AndroidUtilities.dp(48.0f), s00Var), 0, this.e.length(), 33);
            }
            s00Var.c(this.e, z10, true);
            this.f47660f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i11.k()) {
                String str = "⭐️" + i11.d();
                oq[] oqVarArr = this.f47661n;
                spannableStringBuilder.append((CharSequence) w7.X0(true, str, 0.62f, oqVarArr));
                oq oqVar = oqVarArr[0];
                if (oqVar != null) {
                    oqVar.setColorKey(org.telegram.ui.ActionBar.j6.il);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) w7.X0(false, hg.k0.j(j3, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            s00Var.setText(spannableStringBuilder);
        } else {
            s00Var.setText(LocaleController.formatNumber(j3, ' '));
        }
        this.f47660f = j3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            a(true);
        } else if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f47657a) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i10 = this.f47658b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f47658b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j3) {
        if (this.f47657a != j3) {
            this.f47657a = j3;
            a(true);
        }
    }
}
