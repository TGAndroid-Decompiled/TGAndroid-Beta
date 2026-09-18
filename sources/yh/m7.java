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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.oq;
import org.telegram.ui.u00;
public final class m7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public long f47496a;
    public final int f47497b;
    public final u00 f47498c;
    public boolean d;
    public SpannableString e;
    public long f47499f;
    public final oq[] h;
    public final oq[] f47500n;
    public ValueAnimator f47501r;

    public m7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f47499f = -1L;
        this.h = new oq[1];
        this.f47500n = new oq[1];
        this.f47497b = i10;
        this.f47496a = UserConfig.getInstance(i10).getClientUserId();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        wl.n(i11, f6Var, textView, 1, 13.0f);
        textView.setText(LocaleController.getString(R.string.StarsBalance));
        textView.setGravity(5);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.x5.q(-2, -2, 5));
        u00 u00Var = new u00(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.f47498c = u00Var;
        u00Var.f26348n = true;
        u00Var.getDrawable().o(false, true, false);
        u00Var.setTypeface(AndroidUtilities.bold());
        u00Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        u00Var.setTextSize(AndroidUtilities.dp(13.0f));
        u00Var.setGravity(5);
        u00Var.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
        addView(u00Var, w7.x5.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
    }

    public final void a(boolean z10) {
        v5 v5Var;
        boolean z11;
        boolean z12;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10 = this.f47497b;
        v5 y3 = v5.y(i10, false);
        if (this.d) {
            v5Var = v5.y(i10, true);
        } else {
            v5Var = null;
        }
        long j3 = 0;
        zf.a i11 = zf.a.i(0L, zf.b.f48983b);
        u00 u00Var = this.f47498c;
        u00Var.a();
        if (this.f47496a == UserConfig.getInstance(i10).getClientUserId()) {
            z12 = !y3.e;
            j3 = y3.p().amount;
            if (v5Var != null) {
                z12 |= !v5Var.e;
                i11 = v5Var.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = o.g(i10).h(this.f47496a, false);
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
        long j10 = this.f47499f;
        if (j3 > j10 && j10 != -1) {
            ValueAnimator valueAnimator = this.f47501r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f47501r = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 25));
            this.f47501r.addListener(new qg.n0(this, 10));
            this.f47501r.setDuration(320L);
            this.f47501r.setInterpolator(new OvershootInterpolator());
            this.f47501r.start();
        }
        if (z12) {
            if (this.e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.e = spannableString;
                spannableString.setSpan(new h90(AndroidUtilities.dp(48.0f), u00Var), 0, this.e.length(), 33);
            }
            u00Var.c(this.e, z10, true);
            this.f47499f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i11.k()) {
                String str = "⭐️" + i11.d();
                oq[] oqVarArr = this.f47500n;
                spannableStringBuilder.append((CharSequence) y7.X0(true, str, 0.62f, oqVarArr));
                oq oqVar = oqVarArr[0];
                if (oqVar != null) {
                    oqVar.setColorKey(org.telegram.ui.ActionBar.j6.il);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) y7.X0(false, hg.k0.k(j3, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            u00Var.setText(spannableStringBuilder);
        } else {
            u00Var.setText(LocaleController.formatNumber(j3, ' '));
        }
        this.f47499f = j3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            a(true);
        } else if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f47496a) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i10 = this.f47497b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f47497b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j3) {
        if (this.f47496a != j3) {
            this.f47496a = j3;
            a(true);
        }
    }
}
