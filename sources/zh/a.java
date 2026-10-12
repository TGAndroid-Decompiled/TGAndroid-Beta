package zh;

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
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.da0;
public final class a extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f50246a;
    public final org.telegram.ui.ActionBar.c6 f50247b;
    public final TextView f50248c;
    public final da0 d;
    public ag.b e;
    public final br[] f50249f;

    public a(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, i10, ag.b.f629a, c6Var);
    }

    public final void a() {
        ag.b bVar = this.e;
        int i10 = this.f50246a;
        ag.a s10 = n5.x(i10, bVar).s();
        ag.b bVar2 = this.e;
        ag.b bVar3 = ag.b.f629a;
        TextView textView = this.f50248c;
        org.telegram.ui.ActionBar.c6 c6Var = this.f50247b;
        da0 da0Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(p7.Y0(false, LocaleController.formatString(R.string.Gift2MessageStarsInfo, LocaleController.formatNumber(s10.a(), ',')), 0.6f, null));
            int i11 = org.telegram.ui.ActionBar.g6.Gi;
            da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
            da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
            da0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new zf.c(this, 2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        } else if (bVar2 == ag.b.f630b) {
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2MessageStarsInfoTON, s10.b()));
            br[] brVarArr = this.f50249f;
            textView.setText(p7.Y0(true, replaceTags, 0.6f, brVarArr));
            brVarArr[0].setColorKey(org.telegram.ui.ActionBar.g6.Gi);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * s10.c() * 100.0d), "USD", 2));
            int i12 = org.telegram.ui.ActionBar.g6.Hi;
            int w02 = org.telegram.ui.ActionBar.g6.w0(i12, c6Var);
            int i13 = org.telegram.ui.ActionBar.g6.Fi;
            da0Var.setTextColor(i0.a.d(0.33f, w02, org.telegram.ui.ActionBar.g6.w0(i13, c6Var)));
            da0Var.setLinkTextColor(i0.a.d(0.33f, org.telegram.ui.ActionBar.g6.w0(i12, c6Var), org.telegram.ui.ActionBar.g6.w0(i13, c6Var)));
            da0Var.setText(sb2);
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
        int i10 = this.f50246a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f50246a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    public a(Context context, int i10, ag.b bVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f50249f = new br[1];
        this.f50246a = i10;
        this.f50247b = c6Var;
        this.e = bVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
        setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Fi, c6Var)));
        TextView textView = new TextView(context);
        this.f50248c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Hi, c6Var));
        textView.setGravity(17);
        addView(textView, w7.a6.p(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        da0 da0Var = new da0(context, c6Var);
        this.d = da0Var;
        da0Var.setTextSize(1, 12.0f);
        da0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new at(context, 2, c6Var)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        da0Var.setGravity(17);
        addView(da0Var, w7.a6.p(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
