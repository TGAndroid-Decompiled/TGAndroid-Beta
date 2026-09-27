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
import org.telegram.messenger.qk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.u90;
import org.telegram.ui.r00;
public final class j7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public long f47631a;
    public final int f47632b;
    public final r00 f47633c;
    public boolean d;
    public SpannableString e;
    public long f47634f;
    public final qq[] h;
    public final qq[] f47635n;
    public ValueAnimator f47636r;

    public j7(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f47634f = -1L;
        this.h = new qq[1];
        this.f47635n = new qq[1];
        this.f47632b = i10;
        this.f47631a = UserConfig.getInstance(i10).getClientUserId();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        qk.n(i11, e6Var, textView, 1, 13.0f);
        textView.setText(LocaleController.getString(R.string.StarsBalance));
        textView.setGravity(5);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.y5.q(-2, -2, 5));
        r00 r00Var = new r00(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.f47633c = r00Var;
        r00Var.f27291n = true;
        r00Var.getDrawable().o(false, true, false);
        r00Var.setTypeface(AndroidUtilities.bold());
        r00Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        r00Var.setTextSize(AndroidUtilities.dp(13.0f));
        r00Var.setGravity(5);
        r00Var.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
        addView(r00Var, w7.y5.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
    }

    public final void a(boolean z10) {
        s5 s5Var;
        boolean z11;
        boolean z12;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10 = this.f47632b;
        s5 y3 = s5.y(i10, false);
        if (this.d) {
            s5Var = s5.y(i10, true);
        } else {
            s5Var = null;
        }
        long j3 = 0;
        zf.a i11 = zf.a.i(0L, zf.b.f49271b);
        r00 r00Var = this.f47633c;
        r00Var.a();
        if (this.f47631a == UserConfig.getInstance(i10).getClientUserId()) {
            z12 = !y3.e;
            j3 = y3.p().amount;
            if (s5Var != null) {
                z12 |= !s5Var.e;
                i11 = s5Var.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = o.g(i10).h(this.f47631a, false);
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
        long j10 = this.f47634f;
        if (j3 > j10 && j10 != -1) {
            ValueAnimator valueAnimator = this.f47636r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f47636r = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 25));
            this.f47636r.addListener(new pg.d0(this, 11));
            this.f47636r.setDuration(320L);
            this.f47636r.setInterpolator(new OvershootInterpolator());
            this.f47636r.start();
        }
        if (z12) {
            if (this.e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.e = spannableString;
                spannableString.setSpan(new u90(AndroidUtilities.dp(48.0f), r00Var), 0, this.e.length(), 33);
            }
            r00Var.c(this.e, z10, true);
            this.f47634f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i11.k()) {
                String str = "⭐️" + i11.d();
                qq[] qqVarArr = this.f47635n;
                spannableStringBuilder.append((CharSequence) v7.X0(true, str, 0.62f, qqVarArr));
                qq qqVar = qqVarArr[0];
                if (qqVar != null) {
                    qqVar.setColorKey(org.telegram.ui.ActionBar.i6.il);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) v7.X0(false, hg.k0.j(j3, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            r00Var.setText(spannableStringBuilder);
        } else {
            r00Var.setText(LocaleController.formatNumber(j3, ' '));
        }
        this.f47634f = j3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            a(true);
        } else if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f47631a) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i10 = this.f47632b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f47632b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j3) {
        if (this.f47631a != j3) {
            this.f47631a = j3;
            a(true);
        }
    }
}
