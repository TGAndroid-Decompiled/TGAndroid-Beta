package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.w9;
import w7.y5;
import yh.w7;
public final class k extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final w9 f46228a;
    public final p6 f46229b;
    public final p6 f46230c;
    public final p6 d;
    public final pq[] e;
    public boolean f46231f;

    public k(Context context, d6 d6Var) {
        super(context);
        this.e = new pq[1];
        setOrientation(0);
        p6 p6Var = new p6(context, false, false, false);
        this.f46230c = p6Var;
        int i10 = h6.G6;
        p6Var.setTextColor(h6.v0(i10, d6Var));
        p6Var.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        p6Var.setEllipsizeByGradient(true);
        p6 p6Var2 = new p6(context, false, false, false);
        this.d = p6Var2;
        p6Var2.setTextColor(h6.v0(h6.f19442y6, d6Var));
        p6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        w9 w9Var = new w9(context);
        this.f46228a = w9Var;
        p6 p6Var3 = new p6(context, false, false, false);
        this.f46229b = p6Var3;
        p6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var3.setPadding(AndroidUtilities.dp(20.0f), 0, 0, 0);
        p6Var3.setTextColor(h6.v0(i10, d6Var));
        p6Var3.setTypeface(AndroidUtilities.bold());
        p6Var3.setGravity(17);
        addView(p6Var3, y5.o(66, -2, 0.0f, 16));
        addView(w9Var, y5.o(32, 32, 0.0f, 16));
        addView(p6Var, y5.o(0, -2, 1.0f, 16));
        addView(p6Var2, y5.p(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j3, boolean z10) {
        this.d.c(w7.X0(false, org.telegram.messenger.f0.h((int) j3, ',', new StringBuilder("⭐️")), 0.78f, this.e), z10, true);
    }

    public final void b(int i10, boolean z10, boolean z11) {
        p6 p6Var = this.f46229b;
        if (z10 && i10 <= 3) {
            if (i10 == 1) {
                p6Var.c(Emoji.replaceWithRestrictedEmoji("🥇", p6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else if (i10 == 2) {
                p6Var.c(Emoji.replaceWithRestrictedEmoji("🥈", p6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else if (i10 == 3) {
                p6Var.c(Emoji.replaceWithRestrictedEmoji("🥉", p6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else {
                return;
            }
        }
        if (i10 >= 10000) {
            p6Var.setTextSize(AndroidUtilities.dp(12.0f));
        } else if (i10 >= 1000) {
            p6Var.setTextSize(AndroidUtilities.dp(14.0f));
        } else {
            p6Var.setTextSize(AndroidUtilities.dp(15.0f));
        }
        p6Var.c(Integer.toString(i10), z11, true);
    }

    public final void c(TLRPC.User user) {
        h9 h9Var = new h9((d6) null);
        h9Var.r(user);
        w9 w9Var = this.f46228a;
        w9Var.e(user, h9Var);
        w9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        this.f46230c.setText(UserObject.getUserName(user));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        this.f46229b.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f46231f) {
            canvas.drawLine(AndroidUtilities.dp(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(16.0f), getMeasuredHeight(), h6.f19180k0);
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
