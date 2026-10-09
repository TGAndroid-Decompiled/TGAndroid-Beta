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
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.er;
public final class a extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f52232a;
    public final org.telegram.ui.ActionBar.e6 f52233b;
    public final TextView f52234c;
    public final ea0 d;
    public zf.b f52235e;
    public final er[] f52236f;

    public a(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, i10, zf.b.f54441a, e6Var);
    }

    public final void a() {
        zf.b bVar = this.f52235e;
        int i10 = this.f52232a;
        zf.a s10 = m5.x(i10, bVar).s();
        zf.b bVar2 = this.f52235e;
        zf.b bVar3 = zf.b.f54441a;
        TextView textView = this.f52234c;
        org.telegram.ui.ActionBar.e6 e6Var = this.f52233b;
        ea0 ea0Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(p7.Y0(false, LocaleController.formatString(R.string.Gift2MessageStarsInfo, LocaleController.formatNumber(s10.a(), ',')), 0.6f, null));
            int i11 = org.telegram.ui.ActionBar.i6.Gi;
            ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
            ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
            ea0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new rg.x1(this, 25)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        } else if (bVar2 == zf.b.f54442b) {
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2MessageStarsInfoTON, s10.b()));
            er[] erVarArr = this.f52236f;
            textView.setText(p7.Y0(true, replaceTags, 0.6f, erVarArr));
            erVarArr[0].setColorKey(org.telegram.ui.ActionBar.i6.Gi);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * s10.c() * 100.0d), "USD", 2));
            int i12 = org.telegram.ui.ActionBar.i6.Hi;
            int w02 = org.telegram.ui.ActionBar.i6.w0(i12, e6Var);
            int i13 = org.telegram.ui.ActionBar.i6.Fi;
            ea0Var.setTextColor(i0.a.d(0.33f, w02, org.telegram.ui.ActionBar.i6.w0(i13, e6Var)));
            ea0Var.setLinkTextColor(i0.a.d(0.33f, org.telegram.ui.ActionBar.i6.w0(i12, e6Var), org.telegram.ui.ActionBar.i6.w0(i13, e6Var)));
            ea0Var.setText(sb2);
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
        int i10 = this.f52232a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f52232a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    public a(Context context, int i10, zf.b bVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f52236f = new er[1];
        this.f52232a = i10;
        this.f52233b = e6Var;
        this.f52235e = bVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
        setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Fi, e6Var)));
        TextView textView = new TextView(context);
        this.f52234c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Hi, e6Var));
        textView.setGravity(17);
        addView(textView, w7.x5.p(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        ea0 ea0Var = new ea0(context, e6Var);
        this.d = ea0Var;
        ea0Var.setTextSize(1, 12.0f);
        ea0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new dt(context, 2, e6Var)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        ea0Var.setGravity(17);
        addView(ea0Var, w7.x5.p(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
