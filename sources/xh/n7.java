package xh;

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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.uq;
import org.telegram.ui.mv0;
import org.telegram.ui.u00;
public final class n7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public long f45774a;
    public final int f45775b;
    public final u00 f45776c;
    public boolean d;
    public SpannableString e;
    public long f45777f;
    public final uq[] h;
    public final uq[] f45778n;
    public ValueAnimator f45779r;

    public n7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f45777f = -1L;
        this.h = new uq[1];
        this.f45778n = new uq[1];
        this.f45775b = i10;
        this.f45774a = UserConfig.getInstance(i10).getClientUserId();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        em.n(i11, f6Var, textView, 1, 13.0f);
        textView.setText(LocaleController.getString(R.string.StarsBalance));
        textView.setGravity(5);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.a6.q(-2, -2, 5));
        u00 u00Var = new u00(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.f45776c = u00Var;
        u00Var.f25682n = true;
        u00Var.getDrawable().o(false, true, false);
        u00Var.setTypeface(AndroidUtilities.bold());
        u00Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        u00Var.setTextSize(AndroidUtilities.dp(13.0f));
        u00Var.setGravity(5);
        u00Var.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
        addView(u00Var, w7.a6.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
    }

    public final void a(boolean z10) {
        v5 v5Var;
        boolean z11;
        boolean z12;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10 = this.f45775b;
        v5 y3 = v5.y(i10, false);
        if (this.d) {
            v5Var = v5.y(i10, true);
        } else {
            v5Var = null;
        }
        long j3 = 0;
        yf.a i11 = yf.a.i(0L, yf.b.f46929b);
        u00 u00Var = this.f45776c;
        u00Var.a();
        if (this.f45774a == UserConfig.getInstance(i10).getClientUserId()) {
            z12 = !y3.e;
            j3 = y3.p().amount;
            if (v5Var != null) {
                z12 |= !v5Var.e;
                i11 = v5Var.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = p.g(i10).h(this.f45774a, false);
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
        long j10 = this.f45777f;
        if (j3 > j10 && j10 != -1) {
            ValueAnimator valueAnimator = this.f45779r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f45779r = ofFloat;
            ofFloat.addUpdateListener(new qg.o(this, 11));
            this.f45779r.addListener(new mv0(this, 29));
            this.f45779r.setDuration(320L);
            this.f45779r.setInterpolator(new OvershootInterpolator());
            this.f45779r.start();
        }
        if (z12) {
            if (this.e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.e = spannableString;
                spannableString.setSpan(new r90(AndroidUtilities.dp(48.0f), u00Var), 0, this.e.length(), 33);
            }
            u00Var.c(this.e, z10, true);
            this.f45777f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i11.k()) {
                String str = "⭐️" + i11.d();
                uq[] uqVarArr = this.f45778n;
                spannableStringBuilder.append((CharSequence) z7.X0(true, str, 0.62f, uqVarArr));
                uq uqVar = uqVarArr[0];
                if (uqVar != null) {
                    uqVar.setColorKey(org.telegram.ui.ActionBar.j6.il);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) z7.X0(false, hc.b.l(j3, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            u00Var.setText(spannableStringBuilder);
        } else {
            u00Var.setText(LocaleController.formatNumber(j3, ' '));
        }
        this.f45777f = j3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            a(true);
        } else if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f45774a) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i10 = this.f45775b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f45775b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j3) {
        if (this.f45774a != j3) {
            this.f45774a = j3;
            a(true);
        }
    }
}
