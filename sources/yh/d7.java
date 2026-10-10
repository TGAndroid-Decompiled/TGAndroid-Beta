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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.s00;
public final class d7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public long f52443a;
    public final int f52444b;
    public final s00 f52445c;
    public boolean d;
    public SpannableString f52446e;
    public long f52447f;
    public final er[] h;
    public final er[] f52448n;
    public ValueAnimator f52449r;

    public d7(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f52447f = -1L;
        this.h = new er[1];
        this.f52448n = new er[1];
        this.f52444b = i10;
        this.f52443a = UserConfig.getInstance(i10).getClientUserId();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        bi.o(i11, e6Var, textView, 1, 13.0f);
        textView.setText(LocaleController.getString(R.string.StarsBalance));
        textView.setGravity(5);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.x5.q(-2, -2, 5));
        s00 s00Var = new s00(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.f52445c = s00Var;
        s00Var.f30399n = true;
        s00Var.getDrawable().r(false, true);
        s00Var.setTypeface(AndroidUtilities.bold());
        s00Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        s00Var.setTextSize(AndroidUtilities.dp(13.0f));
        s00Var.setGravity(5);
        s00Var.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
        addView(s00Var, w7.x5.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
    }

    public final void a(boolean z10) {
        m5 m5Var;
        boolean z11;
        boolean z12;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10 = this.f52444b;
        m5 y3 = m5.y(i10, false);
        if (this.d) {
            m5Var = m5.y(i10, true);
        } else {
            m5Var = null;
        }
        long j3 = 0;
        zf.a i11 = zf.a.i(0L, zf.b.f54488b);
        s00 s00Var = this.f52445c;
        s00Var.a();
        if (this.f52443a == UserConfig.getInstance(i10).getClientUserId()) {
            z12 = !y3.f52927e;
            j3 = y3.p().amount;
            if (m5Var != null) {
                z12 |= !m5Var.f52927e;
                i11 = m5Var.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = o.g(i10).h(this.f52443a, false);
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
        long j10 = this.f52447f;
        if (j3 > j10 && j10 != -1) {
            ValueAnimator valueAnimator = this.f52449r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f52449r = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 25));
            this.f52449r.addListener(new org.telegram.ui.Wallet.y4(this, 19));
            this.f52449r.setDuration(320L);
            this.f52449r.setInterpolator(new OvershootInterpolator());
            this.f52449r.start();
        }
        if (z12) {
            if (this.f52446e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.f52446e = spannableString;
                spannableString.setSpan(new ka0(AndroidUtilities.dp(48.0f), s00Var), 0, this.f52446e.length(), 33);
            }
            s00Var.c(this.f52446e, z10, true);
            this.f52447f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i11.k()) {
                String str = "⭐️" + i11.d();
                er[] erVarArr = this.f52448n;
                spannableStringBuilder.append((CharSequence) p7.Y0(true, str, 0.62f, erVarArr));
                er erVar = erVarArr[0];
                if (erVar != null) {
                    erVar.setColorKey(org.telegram.ui.ActionBar.i6.il);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) p7.Y0(false, org.telegram.messenger.q.h(j3, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            s00Var.setText(spannableStringBuilder);
        } else {
            s00Var.setText(LocaleController.formatNumber(j3, ' '));
        }
        this.f52447f = j3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            a(true);
        } else if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f52443a) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i10 = this.f52444b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f52444b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j3) {
        if (this.f52443a != j3) {
            this.f52443a = j3;
            a(true);
        }
    }
}
