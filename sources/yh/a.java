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
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.ns;
import org.telegram.ui.Components.oq;
public final class a extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f47194a;
    public final org.telegram.ui.ActionBar.f6 f47195b;
    public final TextView f47196c;
    public final k90 d;
    public zf.b e;
    public final oq[] f47197f;

    public a(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, i10, zf.b.f49254a, f6Var);
    }

    public final void a() {
        zf.b bVar = this.e;
        int i10 = this.f47194a;
        zf.a s10 = u5.x(i10, bVar).s();
        zf.b bVar2 = this.e;
        zf.b bVar3 = zf.b.f49254a;
        TextView textView = this.f47196c;
        org.telegram.ui.ActionBar.f6 f6Var = this.f47195b;
        k90 k90Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(w7.X0(false, LocaleController.formatString(R.string.Gift2MessageStarsInfo, LocaleController.formatNumber(s10.a(), ',')), 0.6f, null));
            int i11 = org.telegram.ui.ActionBar.j6.Gi;
            k90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            k90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            k90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new rg.q1(this, 21)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        } else if (bVar2 == zf.b.f49255b) {
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2MessageStarsInfoTON, s10.b()));
            oq[] oqVarArr = this.f47197f;
            textView.setText(w7.X0(true, replaceTags, 0.6f, oqVarArr));
            oqVarArr[0].setColorKey(org.telegram.ui.ActionBar.j6.Gi);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * s10.c() * 100.0d), "USD", 2));
            int i12 = org.telegram.ui.ActionBar.j6.Hi;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
            int i13 = org.telegram.ui.ActionBar.j6.Fi;
            k90Var.setTextColor(i0.a.d(0.33f, v02, org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
            k90Var.setLinkTextColor(i0.a.d(0.33f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(i13, f6Var)));
            k90Var.setText(sb2);
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
        int i10 = this.f47194a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f47194a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    public a(Context context, int i10, zf.b bVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f47197f = new oq[1];
        this.f47194a = i10;
        this.f47195b = f6Var;
        this.e = bVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
        setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Fi, f6Var)));
        TextView textView = new TextView(context);
        this.f47196c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Hi, f6Var));
        textView.setGravity(17);
        addView(textView, w7.y5.p(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        k90 k90Var = new k90(context, f6Var);
        this.d = k90Var;
        k90Var.setTextSize(1, 12.0f);
        k90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new ns(context, f6Var)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        k90Var.setGravity(17);
        addView(k90Var, w7.y5.p(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
