package rh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.u80;
import org.telegram.ui.ns0;
import org.telegram.ui.xz;
public final class w7 extends LinearLayout implements us {
    public long f47647a;
    public final int f47648b;
    public final xz f47649c;
    public boolean d;
    public SpannableString e;
    public long f47650f;
    public final dq[] h;
    public final dq[] f47651n;
    public ValueAnimator f47652r;

    public w7(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f47650f = -1L;
        this.h = new dq[1];
        this.f47651n = new dq[1];
        this.f47648b = i10;
        this.f47647a = d20.i(i10).e();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
        sc.e.u(textView, 1, 13.0f, null, 2131745173);
        textView.setGravity(5);
        textView.setTypeface(org.telegram.messenger.i0.o());
        addView(textView, w7.b6.r(-2, -2, 5));
        xz xzVar = new xz(this, context, context.getResources().getDrawable(2131232749).mutate());
        this.f47649c = xzVar;
        xzVar.f25986n = true;
        xzVar.getDrawable().r(false, true);
        xzVar.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.a7.Z(xzVar, i11, p6Var);
        xzVar.setTextSize(org.telegram.messenger.i0.L(13.0f));
        xzVar.setGravity(5);
        xzVar.setPadding(org.telegram.messenger.i0.L(19.0f), 0, 0, 0);
        addView(xzVar, w7.b6.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(4.0f));
    }

    public final void a(boolean z10) {
        e6 e6Var;
        boolean z11;
        boolean z12;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10 = this.f47648b;
        e6 y3 = e6.y(i10, false);
        if (this.d) {
            e6Var = e6.y(i10, true);
        } else {
            e6Var = null;
        }
        long j10 = 0;
        sf.a i11 = sf.a.i(0L, sf.b.f48257b);
        xz xzVar = this.f47649c;
        xzVar.a();
        if (this.f47647a == d20.i(i10).e()) {
            z12 = !y3.e;
            j10 = y3.p().amount;
            if (e6Var != null) {
                z12 |= !e6Var.e;
                i11 = e6Var.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = r.g(i10).h(this.f47647a, false);
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
        long j11 = this.f47650f;
        if (j10 > j11 && j11 != -1) {
            ValueAnimator valueAnimator = this.f47652r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f47652r = ofFloat;
            ofFloat.addUpdateListener(new qh.e0(this, 6));
            this.f47652r.addListener(new ns0(this, 27));
            this.f47652r.setDuration(320L);
            this.f47652r.setInterpolator(new OvershootInterpolator());
            this.f47652r.start();
        }
        if (z12) {
            if (this.e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.e = spannableString;
                spannableString.setSpan(new u80(org.telegram.messenger.i0.L(48.0f), xzVar), 0, this.e.length(), 33);
            }
            xzVar.c(this.e, z10, true);
            this.f47650f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i11.k()) {
                String str = "⭐️" + i11.d();
                dq[] dqVarArr = this.f47651n;
                spannableStringBuilder.append((CharSequence) h8.Z0(true, str, 0.62f, dqVarArr));
                dq dqVar = dqVarArr[0];
                if (dqVar != null) {
                    dqVar.a(org.telegram.ui.ActionBar.t6.Wl);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) h8.Z0(false, i0.a.k(j10, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            xzVar.setText(spannableStringBuilder);
        } else {
            xzVar.setText(cd.E(j10, ' '));
        }
        this.f47650f = j10;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.y3) {
            a(true);
        } else if (i10 == zs.C3 && ((Long) objArr[0]).longValue() == this.f47647a) {
            a(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i10 = this.f47648b;
        zs.f(i10).c(this, zs.y3);
        zs.f(i10).c(this, zs.C3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f47648b;
        zs.f(i10).n(this, zs.y3);
        zs.f(i10).n(this, zs.C3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 1073741824));
    }

    public void setDialogId(long j10) {
        if (this.f47647a != j10) {
            this.f47647a = j10;
            a(true);
        }
    }
}
