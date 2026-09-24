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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.s90;
import org.telegram.ui.o00;
public final class k7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public long f47610a;
    public final int f47611b;
    public final o00 f47612c;
    public boolean d;
    public SpannableString e;
    public long f47613f;
    public final pq[] h;
    public final pq[] f47614n;
    public ValueAnimator f47615r;

    public k7(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f47613f = -1L;
        this.h = new pq[1];
        this.f47614n = new pq[1];
        this.f47611b = i10;
        this.f47610a = UserConfig.getInstance(i10).getClientUserId();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        ok.n(i11, d6Var, textView, 1, 13.0f);
        textView.setText(LocaleController.getString(R.string.StarsBalance));
        textView.setGravity(5);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.y5.q(-2, -2, 5));
        o00 o00Var = new o00(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.f47612c = o00Var;
        o00Var.f27262n = true;
        o00Var.getDrawable().o(false, true, false);
        o00Var.setTypeface(AndroidUtilities.bold());
        o00Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        o00Var.setTextSize(AndroidUtilities.dp(13.0f));
        o00Var.setGravity(5);
        o00Var.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
        addView(o00Var, w7.y5.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
    }

    public final void a(boolean z10) {
        t5 t5Var;
        boolean z11;
        boolean z12;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10 = this.f47611b;
        t5 y3 = t5.y(i10, false);
        if (this.d) {
            t5Var = t5.y(i10, true);
        } else {
            t5Var = null;
        }
        long j3 = 0;
        zf.a i11 = zf.a.i(0L, zf.b.f49217b);
        o00 o00Var = this.f47612c;
        o00Var.a();
        if (this.f47610a == UserConfig.getInstance(i10).getClientUserId()) {
            z12 = !y3.e;
            j3 = y3.p().amount;
            if (t5Var != null) {
                z12 |= !t5Var.e;
                i11 = t5Var.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = o.g(i10).h(this.f47610a, false);
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
        long j10 = this.f47613f;
        if (j3 > j10 && j10 != -1) {
            ValueAnimator valueAnimator = this.f47615r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f47615r = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 25));
            this.f47615r.addListener(new pg.d0(this, 11));
            this.f47615r.setDuration(320L);
            this.f47615r.setInterpolator(new OvershootInterpolator());
            this.f47615r.start();
        }
        if (z12) {
            if (this.e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.e = spannableString;
                spannableString.setSpan(new s90(AndroidUtilities.dp(48.0f), o00Var), 0, this.e.length(), 33);
            }
            o00Var.c(this.e, z10, true);
            this.f47613f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i11.k()) {
                String str = "⭐️" + i11.d();
                pq[] pqVarArr = this.f47614n;
                spannableStringBuilder.append((CharSequence) w7.X0(true, str, 0.62f, pqVarArr));
                pq pqVar = pqVarArr[0];
                if (pqVar != null) {
                    pqVar.setColorKey(org.telegram.ui.ActionBar.h6.il);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) w7.X0(false, org.telegram.messenger.f0.h(j3, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            o00Var.setText(spannableStringBuilder);
        } else {
            o00Var.setText(LocaleController.formatNumber(j3, ' '));
        }
        this.f47613f = j3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            a(true);
        } else if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f47610a) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i10 = this.f47611b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f47611b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j3) {
        if (this.f47610a != j3) {
            this.f47610a = j3;
            a(true);
        }
    }
}
