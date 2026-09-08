package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.x9;
import w7.x5;
import zh.v7;
public final class k extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final x9 f50380a;
    public final q6 f50381b;
    public final q6 f50382c;
    public final q6 d;
    public final nq[] f50383e;
    public boolean f50384f;

    public k(Context context, f6 f6Var) {
        super(context);
        this.f50383e = new nq[1];
        setOrientation(0);
        q6 q6Var = new q6(context, false, false, false);
        this.f50382c = q6Var;
        int i10 = j6.G6;
        q6Var.setTextColor(j6.v0(i10, f6Var));
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        q6Var.setEllipsizeByGradient(true);
        q6 q6Var2 = new q6(context, false, false, false);
        this.d = q6Var2;
        q6Var2.setTextColor(j6.v0(j6.f21069y6, f6Var));
        q6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        x9 x9Var = new x9(context);
        this.f50380a = x9Var;
        q6 q6Var3 = new q6(context, false, false, false);
        this.f50381b = q6Var3;
        q6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var3.setPadding(AndroidUtilities.dp(20.0f), 0, 0, 0);
        q6Var3.setTextColor(j6.v0(i10, f6Var));
        q6Var3.setTypeface(AndroidUtilities.bold());
        q6Var3.setGravity(17);
        addView(q6Var3, x5.o(66, -2, 0.0f, 16));
        addView(x9Var, x5.o(32, 32, 0.0f, 16));
        addView(q6Var, x5.o(0, -2, 1.0f, 16));
        addView(q6Var2, x5.p(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j3, boolean z10) {
        this.d.c(v7.X0(false, i2.g.k((int) j3, ',', new StringBuilder("⭐️")), 0.78f, this.f50383e), z10, true);
    }

    public final void b(int i10, boolean z10, boolean z11) {
        q6 q6Var = this.f50381b;
        if (z10 && i10 <= 3) {
            if (i10 == 1) {
                q6Var.c(Emoji.replaceWithRestrictedEmoji("🥇", q6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else if (i10 == 2) {
                q6Var.c(Emoji.replaceWithRestrictedEmoji("🥈", q6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else if (i10 == 3) {
                q6Var.c(Emoji.replaceWithRestrictedEmoji("🥉", q6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else {
                return;
            }
        }
        if (i10 >= 10000) {
            q6Var.setTextSize(AndroidUtilities.dp(12.0f));
        } else if (i10 >= 1000) {
            q6Var.setTextSize(AndroidUtilities.dp(14.0f));
        } else {
            q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        }
        q6Var.c(Integer.toString(i10), z11, true);
    }

    public final void c(TLRPC.User user) {
        i9 i9Var = new i9((f6) null);
        i9Var.r(user);
        x9 x9Var = this.f50380a;
        x9Var.e(user, i9Var);
        x9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        this.f50382c.setText(UserObject.getUserName(user));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        this.f50381b.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f50384f) {
            canvas.drawLine(AndroidUtilities.dp(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(16.0f), getMeasuredHeight(), j6.f20812k0);
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
