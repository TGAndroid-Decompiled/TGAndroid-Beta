package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.ts;
import org.telegram.ui.Components.uq;
public final class a extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f45207a;
    public final org.telegram.ui.ActionBar.f6 f45208b;
    public final TextView f45209c;
    public final m90 d;
    public yf.b e;
    public final uq[] f45210f;

    public a(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, i10, yf.b.f46928a, f6Var);
    }

    public final void a() {
        yf.b bVar = this.e;
        int i10 = this.f45207a;
        yf.a s10 = v5.x(i10, bVar).s();
        yf.b bVar2 = this.e;
        yf.b bVar3 = yf.b.f46928a;
        TextView textView = this.f45209c;
        org.telegram.ui.ActionBar.f6 f6Var = this.f45208b;
        m90 m90Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(z7.X0(false, LocaleController.formatString(R.string.Gift2MessageStarsInfo, LocaleController.formatNumber(s10.a(), ',')), 0.6f, null));
            int i11 = org.telegram.ui.ActionBar.j6.Gi;
            m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            m90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new qg.q0(this, 27)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        } else if (bVar2 == yf.b.f46929b) {
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2MessageStarsInfoTON, s10.b()));
            uq[] uqVarArr = this.f45210f;
            textView.setText(z7.X0(true, replaceTags, 0.6f, uqVarArr));
            uqVarArr[0].setColorKey(org.telegram.ui.ActionBar.j6.Gi);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * s10.c() * 100.0d), "USD", 2));
            int i12 = org.telegram.ui.ActionBar.j6.Hi;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
            int i13 = org.telegram.ui.ActionBar.j6.Fi;
            m90Var.setTextColor(i0.a.d(0.33f, v02, org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
            m90Var.setLinkTextColor(i0.a.d(0.33f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
            m90Var.setText(sb2);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        int i10 = this.f45207a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f45207a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    public a(Context context, int i10, yf.b bVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f45210f = new uq[1];
        this.f45207a = i10;
        this.f45208b = f6Var;
        this.e = bVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
        setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Fi, f6Var)));
        TextView textView = new TextView(context);
        this.f45209c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Hi, f6Var));
        textView.setGravity(17);
        addView(textView, w7.a6.p(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        m90 m90Var = new m90(context, f6Var);
        this.d = m90Var;
        m90Var.setTextSize(1, 12.0f);
        m90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new ts(context, f6Var)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        m90Var.setGravity(17);
        addView(m90Var, w7.a6.p(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
