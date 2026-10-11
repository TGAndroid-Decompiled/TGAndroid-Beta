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
import org.telegram.messenger.ai;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.r00;
public final class d7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public long f52486a;
    public final int f52487b;
    public final r00 f52488c;
    public boolean d;
    public SpannableString f52489e;
    public long f52490f;
    public final er[] h;
    public final er[] f52491n;
    public ValueAnimator f52492r;

    public d7(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f52490f = -1L;
        this.h = new er[1];
        this.f52491n = new er[1];
        this.f52487b = i10;
        this.f52486a = UserConfig.getInstance(i10).getClientUserId();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        ai.o(i11, d6Var, textView, 1, 13.0f);
        textView.setText(LocaleController.getString(R.string.StarsBalance));
        textView.setGravity(5);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.x5.q(-2, -2, 5));
        r00 r00Var = new r00(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.f52488c = r00Var;
        r00Var.f30349n = true;
        r00Var.getDrawable().r(false, true);
        r00Var.setTypeface(AndroidUtilities.bold());
        r00Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        r00Var.setTextSize(AndroidUtilities.dp(13.0f));
        r00Var.setGravity(5);
        r00Var.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
        addView(r00Var, w7.x5.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
    }

    public final void a(boolean z10) {
        n5 n5Var;
        boolean z11;
        boolean z12;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10 = this.f52487b;
        n5 y3 = n5.y(i10, false);
        if (this.d) {
            n5Var = n5.y(i10, true);
        } else {
            n5Var = null;
        }
        long j3 = 0;
        zf.a i11 = zf.a.i(0L, zf.b.f54531b);
        r00 r00Var = this.f52488c;
        r00Var.a();
        if (this.f52486a == UserConfig.getInstance(i10).getClientUserId()) {
            z12 = !y3.f53000e;
            j3 = y3.p().amount;
            if (n5Var != null) {
                z12 |= !n5Var.f53000e;
                i11 = n5Var.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = o.g(i10).h(this.f52486a, false);
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
        long j10 = this.f52490f;
        if (j3 > j10 && j10 != -1) {
            ValueAnimator valueAnimator = this.f52492r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f52492r = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.s0(this, 25));
            this.f52492r.addListener(new org.telegram.ui.Wallet.z4(this, 19));
            this.f52492r.setDuration(320L);
            this.f52492r.setInterpolator(new OvershootInterpolator());
            this.f52492r.start();
        }
        if (z12) {
            if (this.f52489e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.f52489e = spannableString;
                spannableString.setSpan(new ka0(AndroidUtilities.dp(48.0f), r00Var), 0, this.f52489e.length(), 33);
            }
            r00Var.c(this.f52489e, z10, true);
            this.f52490f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i11.k()) {
                String str = "⭐️" + i11.d();
                er[] erVarArr = this.f52491n;
                spannableStringBuilder.append((CharSequence) p7.Y0(true, str, 0.62f, erVarArr));
                er erVar = erVarArr[0];
                if (erVar != null) {
                    erVar.setColorKey(org.telegram.ui.ActionBar.h6.il);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) p7.Y0(false, org.telegram.messenger.q.h(j3, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            r00Var.setText(spannableStringBuilder);
        } else {
            r00Var.setText(LocaleController.formatNumber(j3, ' '));
        }
        this.f52490f = j3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            a(true);
        } else if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f52486a) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i10 = this.f52487b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f52487b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j3) {
        if (this.f52486a != j3) {
            this.f52486a = j3;
            a(true);
        }
    }
}
