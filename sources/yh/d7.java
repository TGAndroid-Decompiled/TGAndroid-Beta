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
import org.telegram.messenger.am;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.na0;
import org.telegram.ui.u00;
public final class d7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public long f52629a;
    public final int f52630b;
    public final u00 f52631c;
    public boolean d;
    public SpannableString f52632e;
    public long f52633f;
    public final gr[] h;
    public final gr[] f52634n;
    public ValueAnimator f52635r;

    public d7(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f52633f = -1L;
        this.h = new gr[1];
        this.f52634n = new gr[1];
        this.f52630b = i10;
        this.f52629a = UserConfig.getInstance(i10).getClientUserId();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        am.o(i11, c6Var, textView, 1, 13.0f);
        textView.setText(LocaleController.getString(R.string.StarsBalance));
        textView.setGravity(5);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.w5.q(-2, -2, 5));
        u00 u00Var = new u00(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.f52631c = u00Var;
        u00Var.f30059n = true;
        u00Var.getDrawable().r(false, true);
        u00Var.setTypeface(AndroidUtilities.bold());
        u00Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        u00Var.setTextSize(AndroidUtilities.dp(13.0f));
        u00Var.setGravity(5);
        u00Var.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
        addView(u00Var, w7.w5.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
    }

    public final void a(boolean z10) {
        n5 n5Var;
        boolean z11;
        boolean z12;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10 = this.f52630b;
        n5 y3 = n5.y(i10, false);
        if (this.d) {
            n5Var = n5.y(i10, true);
        } else {
            n5Var = null;
        }
        long j3 = 0;
        zf.a i11 = zf.a.i(0L, zf.b.f54676b);
        u00 u00Var = this.f52631c;
        u00Var.a();
        if (this.f52629a == UserConfig.getInstance(i10).getClientUserId()) {
            z12 = !y3.f53149e;
            j3 = y3.p().amount;
            if (n5Var != null) {
                z12 |= !n5Var.f53149e;
                i11 = n5Var.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = o.g(i10).h(this.f52629a, false);
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
        long j10 = this.f52633f;
        if (j3 > j10 && j10 != -1) {
            ValueAnimator valueAnimator = this.f52635r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f52635r = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.s0(this, 25));
            this.f52635r.addListener(new org.telegram.ui.Wallet.z4(this, 19));
            this.f52635r.setDuration(320L);
            this.f52635r.setInterpolator(new OvershootInterpolator());
            this.f52635r.start();
        }
        if (z12) {
            if (this.f52632e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.f52632e = spannableString;
                spannableString.setSpan(new na0(AndroidUtilities.dp(48.0f), u00Var), 0, this.f52632e.length(), 33);
            }
            u00Var.c(this.f52632e, z10, true);
            this.f52633f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i11.k()) {
                String str = "⭐️" + i11.d();
                gr[] grVarArr = this.f52634n;
                spannableStringBuilder.append((CharSequence) p7.Y0(true, str, 0.62f, grVarArr));
                gr grVar = grVarArr[0];
                if (grVar != null) {
                    grVar.setColorKey(org.telegram.ui.ActionBar.h6.il);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) p7.Y0(false, hg.c.k(j3, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            u00Var.setText(spannableStringBuilder);
        } else {
            u00Var.setText(LocaleController.formatNumber(j3, ' '));
        }
        this.f52633f = j3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            a(true);
        } else if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f52629a) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i10 = this.f52630b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f52630b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j3) {
        if (this.f52629a != j3) {
            this.f52629a = j3;
            a(true);
        }
    }
}
