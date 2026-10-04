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
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.v90;
import org.telegram.ui.s00;
public final class l7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public long f51584a;
    public final int f51585b;
    public final s00 f51586c;
    public boolean d;
    public SpannableString f51587e;
    public long f51588f;
    public final rq[] h;
    public final rq[] f51589n;
    public ValueAnimator f51590r;

    public l7(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f51588f = -1L;
        this.h = new rq[1];
        this.f51589n = new rq[1];
        this.f51585b = i10;
        this.f51584a = UserConfig.getInstance(i10).getClientUserId();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        ok.n(i11, d6Var, textView, 1, 13.0f);
        textView.setText(LocaleController.getString(R.string.StarsBalance));
        textView.setGravity(5);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.z5.q(-2, -2, 5));
        s00 s00Var = new s00(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.f51586c = s00Var;
        s00Var.f29520n = true;
        s00Var.getDrawable().o(false, true, false);
        s00Var.setTypeface(AndroidUtilities.bold());
        s00Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        s00Var.setTextSize(AndroidUtilities.dp(13.0f));
        s00Var.setGravity(5);
        s00Var.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
        addView(s00Var, w7.z5.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
    }

    public final void a(boolean z10) {
        t5 t5Var;
        boolean z11;
        boolean z12;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10 = this.f51585b;
        t5 y3 = t5.y(i10, false);
        if (this.d) {
            t5Var = t5.y(i10, true);
        } else {
            t5Var = null;
        }
        long j3 = 0;
        zf.a i11 = zf.a.i(0L, zf.b.f53298b);
        s00 s00Var = this.f51586c;
        s00Var.a();
        if (this.f51584a == UserConfig.getInstance(i10).getClientUserId()) {
            z12 = !y3.f52014e;
            j3 = y3.p().amount;
            if (t5Var != null) {
                z12 |= !t5Var.f52014e;
                i11 = t5Var.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = o.g(i10).h(this.f51584a, false);
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
        long j10 = this.f51588f;
        if (j3 > j10 && j10 != -1) {
            ValueAnimator valueAnimator = this.f51590r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f51590r = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 25));
            this.f51590r.addListener(new pg.d0(this, 11));
            this.f51590r.setDuration(320L);
            this.f51590r.setInterpolator(new OvershootInterpolator());
            this.f51590r.start();
        }
        if (z12) {
            if (this.f51587e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.f51587e = spannableString;
                spannableString.setSpan(new v90(AndroidUtilities.dp(48.0f), s00Var), 0, this.f51587e.length(), 33);
            }
            s00Var.c(this.f51587e, z10, true);
            this.f51588f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i11.k()) {
                String str = "⭐️" + i11.d();
                rq[] rqVarArr = this.f51589n;
                spannableStringBuilder.append((CharSequence) x7.d1(true, str, 0.62f, rqVarArr));
                rq rqVar = rqVarArr[0];
                if (rqVar != null) {
                    rqVar.setColorKey(org.telegram.ui.ActionBar.i6.il);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) x7.d1(false, org.telegram.messenger.f0.h(j3, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            s00Var.setText(spannableStringBuilder);
        } else {
            s00Var.setText(LocaleController.formatNumber(j3, ' '));
        }
        this.f51588f = j3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            a(true);
        } else if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f51584a) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i10 = this.f51585b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f51585b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j3) {
        if (this.f51584a != j3) {
            this.f51584a = j3;
            a(true);
        }
    }
}
