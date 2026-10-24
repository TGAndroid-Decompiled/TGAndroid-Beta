package yh;

import ai.nd;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.vq;
import w7.z5;
public final class k extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final u9 f50789a;
    public final o6 f50790b;
    public final o6 f50791c;
    public final o6 d;
    public final vq[] e;
    public boolean f50792f;

    public k(Context context, g6 g6Var) {
        super(context);
        this.e = new vq[1];
        setOrientation(0);
        o6 o6Var = new o6(context, false, false, false);
        this.f50791c = o6Var;
        int i10 = k6.G6;
        r6.a0(o6Var, i10, g6Var);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        o6Var.setEllipsizeByGradient(true);
        o6 o6Var2 = new o6(context, false, false, false);
        this.d = o6Var2;
        r6.a0(o6Var2, k6.f21572y6, g6Var);
        o6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        u9 u9Var = new u9(context);
        this.f50789a = u9Var;
        o6 o6Var3 = new o6(context, false, false, false);
        this.f50790b = o6Var3;
        o6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var3.setPadding(AndroidUtilities.dp(20.0f), 0, 0, 0);
        r6.a0(o6Var3, i10, g6Var);
        o6Var3.setTypeface(AndroidUtilities.bold());
        o6Var3.setGravity(17);
        addView(o6Var3, z5.o(66, -2, 0.0f, 16));
        addView(u9Var, z5.o(32, 32, 0.0f, 16));
        addView(o6Var, z5.o(0, -2, 1.0f, 16));
        addView(o6Var2, z5.p(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j10, boolean z10) {
        this.d.c(nd.Y0(false, i2.o1.m((int) j10, ',', new StringBuilder("⭐️")), 0.78f, this.e), z10, true);
    }

    public final void b(int i10, boolean z10, boolean z11) {
        o6 o6Var = this.f50790b;
        if (z10 && i10 <= 3) {
            if (i10 == 1) {
                o6Var.c(Emoji.replaceWithRestrictedEmoji("🥇", o6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else if (i10 == 2) {
                o6Var.c(Emoji.replaceWithRestrictedEmoji("🥈", o6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else if (i10 == 3) {
                o6Var.c(Emoji.replaceWithRestrictedEmoji("🥉", o6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else {
                return;
            }
        }
        if (i10 >= 10000) {
            o6Var.setTextSize(AndroidUtilities.dp(12.0f));
        } else if (i10 >= 1000) {
            o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        } else {
            o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        }
        o6Var.c(Integer.toString(i10), z11, true);
    }

    public final void c(TLRPC.User user) {
        f9 f9Var = new f9((g6) null);
        f9Var.r(user);
        u9 u9Var = this.f50789a;
        u9Var.e(user, f9Var);
        u9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        this.f50791c.setText(UserObject.getUserName(user));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        this.f50790b.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f50792f) {
            canvas.drawLine(AndroidUtilities.dp(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(16.0f), getMeasuredHeight(), k6.f21305k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
