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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.z9;
import w7.a6;
import zh.p7;
public final class l extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final z9 f48950a;
    public final s6 f48951b;
    public final s6 f48952c;
    public final s6 d;
    public final br[] e;
    public boolean f48953f;

    public l(Context context, c6 c6Var) {
        super(context);
        this.e = new br[1];
        setOrientation(0);
        s6 s6Var = new s6(context, false, false, false);
        this.f48952c = s6Var;
        int i10 = g6.G6;
        s6Var.setTextColor(g6.w0(i10, c6Var));
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        s6Var.setEllipsizeByGradient(true);
        s6 s6Var2 = new s6(context, false, false, false);
        this.d = s6Var2;
        s6Var2.setTextColor(g6.w0(g6.f20288y6, c6Var));
        s6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        z9 z9Var = new z9(context);
        this.f48950a = z9Var;
        s6 s6Var3 = new s6(context, false, false, false);
        this.f48951b = s6Var3;
        s6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var3.setPadding(AndroidUtilities.dp(20.0f), 0, 0, 0);
        s6Var3.setTextColor(g6.w0(i10, c6Var));
        s6Var3.setTypeface(AndroidUtilities.bold());
        s6Var3.setGravity(17);
        addView(s6Var3, a6.o(66, -2, 0.0f, 16));
        addView(z9Var, a6.o(32, 32, 0.0f, 16));
        addView(s6Var, a6.o(0, -2, 1.0f, 16));
        addView(s6Var2, a6.p(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j10, boolean z10) {
        this.d.c(p7.Y0(false, org.telegram.messenger.q.i((int) j10, ',', new StringBuilder("⭐️")), 0.78f, this.e), z10, true);
    }

    public final void b(int i10, boolean z10, boolean z11) {
        s6 s6Var = this.f48951b;
        if (z10 && i10 <= 3) {
            if (i10 == 1) {
                s6Var.c(Emoji.replaceWithRestrictedEmoji("🥇", s6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else if (i10 == 2) {
                s6Var.c(Emoji.replaceWithRestrictedEmoji("🥈", s6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else if (i10 == 3) {
                s6Var.c(Emoji.replaceWithRestrictedEmoji("🥉", s6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else {
                return;
            }
        }
        if (i10 >= 10000) {
            s6Var.setTextSize(AndroidUtilities.dp(12.0f));
        } else if (i10 >= 1000) {
            s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        } else {
            s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        }
        s6Var.c(Integer.toString(i10), z11, true);
    }

    public final void c(TLRPC.User user) {
        k9 k9Var = new k9((c6) null);
        k9Var.r(user);
        z9 z9Var = this.f48950a;
        z9Var.e(user, k9Var);
        z9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        this.f48952c.setText(UserObject.getUserName(user));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        this.f48951b.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f48953f) {
            canvas.drawLine(AndroidUtilities.dp(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(16.0f), getMeasuredHeight(), g6.f20022k0);
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
