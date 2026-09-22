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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.u9;
import w7.x5;
import yh.x7;
public final class k extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final u9 f45940a;
    public final n6 f45941b;
    public final n6 f45942c;
    public final n6 d;
    public final oq[] e;
    public boolean f45943f;

    public k(Context context, e6 e6Var) {
        super(context);
        this.e = new oq[1];
        setOrientation(0);
        n6 n6Var = new n6(context, false, false, false);
        this.f45942c = n6Var;
        int i10 = i6.G6;
        n6Var.setTextColor(i6.v0(i10, e6Var));
        n6Var.setTextSize(AndroidUtilities.dp(15.0f));
        n6Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        n6Var.setEllipsizeByGradient(true);
        n6 n6Var2 = new n6(context, false, false, false);
        this.d = n6Var2;
        n6Var2.setTextColor(i6.v0(i6.f19215y6, e6Var));
        n6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        u9 u9Var = new u9(context);
        this.f45940a = u9Var;
        n6 n6Var3 = new n6(context, false, false, false);
        this.f45941b = n6Var3;
        n6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        n6Var3.setPadding(AndroidUtilities.dp(20.0f), 0, 0, 0);
        n6Var3.setTextColor(i6.v0(i10, e6Var));
        n6Var3.setTypeface(AndroidUtilities.bold());
        n6Var3.setGravity(17);
        addView(n6Var3, x5.o(66, -2, 0.0f, 16));
        addView(u9Var, x5.o(32, 32, 0.0f, 16));
        addView(n6Var, x5.o(0, -2, 1.0f, 16));
        addView(n6Var2, x5.p(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j3, boolean z10) {
        this.d.c(x7.X0(false, hg.c.k((int) j3, ',', new StringBuilder("⭐️")), 0.78f, this.e), z10, true);
    }

    public final void b(int i10, boolean z10, boolean z11) {
        n6 n6Var = this.f45941b;
        if (z10 && i10 <= 3) {
            if (i10 == 1) {
                n6Var.c(Emoji.replaceWithRestrictedEmoji("🥇", n6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else if (i10 == 2) {
                n6Var.c(Emoji.replaceWithRestrictedEmoji("🥈", n6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else if (i10 == 3) {
                n6Var.c(Emoji.replaceWithRestrictedEmoji("🥉", n6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else {
                return;
            }
        }
        if (i10 >= 10000) {
            n6Var.setTextSize(AndroidUtilities.dp(12.0f));
        } else if (i10 >= 1000) {
            n6Var.setTextSize(AndroidUtilities.dp(14.0f));
        } else {
            n6Var.setTextSize(AndroidUtilities.dp(15.0f));
        }
        n6Var.c(Integer.toString(i10), z11, true);
    }

    public final void c(TLRPC.User user) {
        f9 f9Var = new f9((e6) null);
        f9Var.r(user);
        u9 u9Var = this.f45940a;
        u9Var.e(user, f9Var);
        u9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        this.f45942c.setText(UserObject.getUserName(user));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        this.f45941b.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f45943f) {
            canvas.drawLine(AndroidUtilities.dp(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(16.0f), getMeasuredHeight(), i6.f18955k0);
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
