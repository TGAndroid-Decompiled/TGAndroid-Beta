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
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ia0;
public final class a extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f52466a;
    public final org.telegram.ui.ActionBar.c6 f52467b;
    public final TextView f52468c;
    public final ia0 d;
    public zf.b f52469e;
    public final gr[] f52470f;

    public a(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, i10, zf.b.f54675a, c6Var);
    }

    public final void a() {
        zf.b bVar = this.f52469e;
        int i10 = this.f52466a;
        zf.a s10 = n5.x(i10, bVar).s();
        zf.b bVar2 = this.f52469e;
        zf.b bVar3 = zf.b.f54675a;
        TextView textView = this.f52468c;
        org.telegram.ui.ActionBar.c6 c6Var = this.f52467b;
        ia0 ia0Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(p7.Y0(false, LocaleController.formatString(R.string.Gift2MessageStarsInfo, LocaleController.formatNumber(s10.a(), ',')), 0.6f, null));
            int i11 = org.telegram.ui.ActionBar.h6.Gi;
            ia0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
            ia0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
            ia0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new rg.x1(this, 25)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        } else if (bVar2 == zf.b.f54676b) {
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2MessageStarsInfoTON, s10.b()));
            gr[] grVarArr = this.f52470f;
            textView.setText(p7.Y0(true, replaceTags, 0.6f, grVarArr));
            grVarArr[0].setColorKey(org.telegram.ui.ActionBar.h6.Gi);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * s10.c() * 100.0d), "USD", 2));
            int i12 = org.telegram.ui.ActionBar.h6.Hi;
            int w02 = org.telegram.ui.ActionBar.h6.w0(i12, c6Var);
            int i13 = org.telegram.ui.ActionBar.h6.Fi;
            ia0Var.setTextColor(i0.a.d(0.33f, w02, org.telegram.ui.ActionBar.h6.w0(i13, c6Var)));
            ia0Var.setLinkTextColor(i0.a.d(0.33f, org.telegram.ui.ActionBar.h6.w0(i12, c6Var), org.telegram.ui.ActionBar.h6.w0(i13, c6Var)));
            ia0Var.setText(sb2);
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
        int i10 = this.f52466a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f52466a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    public a(Context context, int i10, zf.b bVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f52470f = new gr[1];
        this.f52466a = i10;
        this.f52467b = c6Var;
        this.f52469e = bVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
        setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Fi, c6Var)));
        TextView textView = new TextView(context);
        this.f52468c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Hi, c6Var));
        textView.setGravity(17);
        addView(textView, w7.w5.p(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        ia0 ia0Var = new ia0(context, c6Var);
        this.d = ia0Var;
        ia0Var.setTextSize(1, 12.0f);
        ia0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new ft(context, 2, c6Var)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        ia0Var.setGravity(17);
        addView(ia0Var, w7.w5.p(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
