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
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.ms;
import org.telegram.ui.Components.nq;
public final class a extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f51671a;
    public final org.telegram.ui.ActionBar.f6 f51672b;
    public final TextView f51673c;
    public final d90 d;
    public zf.b f51674e;
    public final nq[] f51675f;

    public a(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, i10, zf.b.f51655a, f6Var);
    }

    public final void a() {
        zf.b bVar = this.f51674e;
        int i10 = this.f51671a;
        zf.a s10 = s5.x(i10, bVar).s();
        zf.b bVar2 = this.f51674e;
        zf.b bVar3 = zf.b.f51655a;
        TextView textView = this.f51673c;
        org.telegram.ui.ActionBar.f6 f6Var = this.f51672b;
        d90 d90Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(v7.X0(false, LocaleController.formatString(R.string.Gift2MessageStarsInfo, LocaleController.formatNumber(s10.a(), ',')), 0.6f, null));
            int i11 = org.telegram.ui.ActionBar.j6.Gi;
            d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            d90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new sg.p0(this, 23)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        } else if (bVar2 == zf.b.f51656b) {
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2MessageStarsInfoTON, s10.b()));
            nq[] nqVarArr = this.f51675f;
            textView.setText(v7.X0(true, replaceTags, 0.6f, nqVarArr));
            nqVarArr[0].setColorKey(org.telegram.ui.ActionBar.j6.Gi);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * s10.c() * 100.0d), "USD", 2));
            int i12 = org.telegram.ui.ActionBar.j6.Hi;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
            int i13 = org.telegram.ui.ActionBar.j6.Fi;
            d90Var.setTextColor(i0.a.d(0.33f, v02, org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
            d90Var.setLinkTextColor(i0.a.d(0.33f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
            d90Var.setText(sb2);
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
        int i10 = this.f51671a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f51671a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    public a(Context context, int i10, zf.b bVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f51675f = new nq[1];
        this.f51671a = i10;
        this.f51672b = f6Var;
        this.f51674e = bVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
        setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Fi, f6Var)));
        TextView textView = new TextView(context);
        this.f51673c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Hi, f6Var));
        textView.setGravity(17);
        addView(textView, w7.x5.p(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        d90 d90Var = new d90(context, f6Var);
        this.d = d90Var;
        d90Var.setTextSize(1, 12.0f);
        d90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new ms(context, f6Var)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        d90Var.setGravity(17);
        addView(d90Var, w7.x5.p(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
