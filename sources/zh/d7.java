package zh;

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
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.fi1;
import org.telegram.ui.y00;
public final class d7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public long f50387a;
    public final int f50388b;
    public final y00 f50389c;
    public boolean d;
    public SpannableString e;
    public long f50390f;
    public final br[] h;
    public final br[] f50391n;
    public ValueAnimator f50392r;

    public d7(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f50390f = -1L;
        this.h = new br[1];
        this.f50391n = new br[1];
        this.f50388b = i10;
        this.f50387a = UserConfig.getInstance(i10).getClientUserId();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        yh.n(i11, c6Var, textView, 1, 13.0f);
        textView.setText(LocaleController.getString(R.string.StarsBalance));
        textView.setGravity(5);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.a6.q(-2, -2, 5));
        y00 y00Var = new y00(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.f50389c = y00Var;
        y00Var.f29047n = true;
        y00Var.getDrawable().r(false, true);
        y00Var.setTypeface(AndroidUtilities.bold());
        y00Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        y00Var.setTextSize(AndroidUtilities.dp(13.0f));
        y00Var.setGravity(5);
        y00Var.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
        addView(y00Var, w7.a6.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
    }

    public final void a(boolean z10) {
        n5 n5Var;
        boolean z11;
        boolean z12;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10 = this.f50388b;
        n5 y3 = n5.y(i10, false);
        if (this.d) {
            n5Var = n5.y(i10, true);
        } else {
            n5Var = null;
        }
        long j10 = 0;
        ag.a i11 = ag.a.i(0L, ag.b.f630b);
        y00 y00Var = this.f50389c;
        y00Var.a();
        if (this.f50387a == UserConfig.getInstance(i10).getClientUserId()) {
            z12 = !y3.e;
            j10 = y3.p().amount;
            if (n5Var != null) {
                z12 |= !n5Var.e;
                i11 = n5Var.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = p.g(i10).h(this.f50387a, false);
            if (h != null && h.status != null) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (h != null && (tL_starsRevenueStatus = h.status) != null) {
                j10 = tL_starsRevenueStatus.current_balance.amount;
            }
            z12 = z11;
        }
        long j11 = this.f50390f;
        if (j10 > j11 && j11 != -1) {
            ValueAnimator valueAnimator = this.f50392r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f50392r = ofFloat;
            ofFloat.addUpdateListener(new ki.a(this, 26));
            this.f50392r.addListener(new fi1(this, 22));
            this.f50392r.setDuration(320L);
            this.f50392r.setInterpolator(new OvershootInterpolator());
            this.f50392r.start();
        }
        if (z12) {
            if (this.e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.e = spannableString;
                spannableString.setSpan(new ia0(AndroidUtilities.dp(48.0f), y00Var), 0, this.e.length(), 33);
            }
            y00Var.c(this.e, z10, true);
            this.f50390f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i11.k()) {
                String str = "⭐️" + i11.d();
                br[] brVarArr = this.f50391n;
                spannableStringBuilder.append((CharSequence) p7.Y0(true, str, 0.62f, brVarArr));
                br brVar = brVarArr[0];
                if (brVar != null) {
                    brVar.setColorKey(org.telegram.ui.ActionBar.g6.il);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) p7.Y0(false, org.telegram.messenger.q.i(j10, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            y00Var.setText(spannableStringBuilder);
        } else {
            y00Var.setText(LocaleController.formatNumber(j10, ' '));
        }
        this.f50390f = j10;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            a(true);
        } else if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f50387a) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i10 = this.f50388b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f50388b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j10) {
        if (this.f50387a != j10) {
            this.f50387a = j10;
            a(true);
        }
    }
}
