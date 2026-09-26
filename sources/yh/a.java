package yh;

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
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.qq;
public final class a extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f47167a;
    public final org.telegram.ui.ActionBar.d6 f47168b;
    public final TextView f47169c;
    public final o90 d;
    public zf.b e;
    public final qq[] f47170f;

    public a(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, i10, zf.b.f49226a, d6Var);
    }

    public final void a() {
        zf.b bVar = this.e;
        int i10 = this.f47167a;
        zf.a s10 = s5.x(i10, bVar).s();
        zf.b bVar2 = this.e;
        zf.b bVar3 = zf.b.f49226a;
        TextView textView = this.f47169c;
        org.telegram.ui.ActionBar.d6 d6Var = this.f47168b;
        o90 o90Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(w7.X0(false, LocaleController.formatString(R.string.Gift2MessageStarsInfo, LocaleController.formatNumber(s10.a(), ',')), 0.6f, null));
            int i11 = org.telegram.ui.ActionBar.h6.Gi;
            o90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
            o90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
            o90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new rg.q1(this, 21)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        } else if (bVar2 == zf.b.f49227b) {
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2MessageStarsInfoTON, s10.b()));
            qq[] qqVarArr = this.f47170f;
            textView.setText(w7.X0(true, replaceTags, 0.6f, qqVarArr));
            qqVarArr[0].setColorKey(org.telegram.ui.ActionBar.h6.Gi);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * s10.c() * 100.0d), "USD", 2));
            int i12 = org.telegram.ui.ActionBar.h6.Hi;
            int v02 = org.telegram.ui.ActionBar.h6.v0(i12, d6Var);
            int i13 = org.telegram.ui.ActionBar.h6.Fi;
            o90Var.setTextColor(i0.a.d(0.33f, v02, org.telegram.ui.ActionBar.h6.v0(i13, d6Var)));
            o90Var.setLinkTextColor(i0.a.d(0.33f, org.telegram.ui.ActionBar.h6.v0(i12, d6Var), org.telegram.ui.ActionBar.h6.v0(i13, d6Var)));
            o90Var.setText(sb2);
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
        int i10 = this.f47167a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f47167a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    public a(Context context, int i10, zf.b bVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f47170f = new qq[1];
        this.f47167a = i10;
        this.f47168b = d6Var;
        this.e = bVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
        setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Fi, d6Var)));
        TextView textView = new TextView(context);
        this.f47169c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Hi, d6Var));
        textView.setGravity(17);
        addView(textView, w7.y5.p(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        o90 o90Var = new o90(context, d6Var);
        this.d = o90Var;
        o90Var.setTextSize(1, 12.0f);
        o90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new ps(context, d6Var)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        o90Var.setGravity(17);
        addView(o90Var, w7.y5.p(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
