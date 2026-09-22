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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.v9;
import w7.y5;
import yh.w7;
public final class k extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final v9 f46269a;
    public final o6 f46270b;
    public final o6 f46271c;
    public final o6 d;
    public final oq[] e;
    public boolean f46272f;

    public k(Context context, f6 f6Var) {
        super(context);
        this.e = new oq[1];
        setOrientation(0);
        o6 o6Var = new o6(context, false, false, false);
        this.f46271c = o6Var;
        int i10 = j6.G6;
        o6Var.setTextColor(j6.v0(i10, f6Var));
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        o6Var.setEllipsizeByGradient(true);
        o6 o6Var2 = new o6(context, false, false, false);
        this.d = o6Var2;
        o6Var2.setTextColor(j6.v0(j6.f19492y6, f6Var));
        o6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        v9 v9Var = new v9(context);
        this.f46269a = v9Var;
        o6 o6Var3 = new o6(context, false, false, false);
        this.f46270b = o6Var3;
        o6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var3.setPadding(AndroidUtilities.dp(20.0f), 0, 0, 0);
        o6Var3.setTextColor(j6.v0(i10, f6Var));
        o6Var3.setTypeface(AndroidUtilities.bold());
        o6Var3.setGravity(17);
        addView(o6Var3, y5.o(66, -2, 0.0f, 16));
        addView(v9Var, y5.o(32, 32, 0.0f, 16));
        addView(o6Var, y5.o(0, -2, 1.0f, 16));
        addView(o6Var2, y5.p(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j3, boolean z10) {
        this.d.c(w7.X0(false, hg.k0.j((int) j3, ',', new StringBuilder("⭐️")), 0.78f, this.e), z10, true);
    }

    public final void b(int i10, boolean z10, boolean z11) {
        o6 o6Var = this.f46270b;
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
        g9 g9Var = new g9((f6) null);
        g9Var.r(user);
        v9 v9Var = this.f46269a;
        v9Var.e(user, g9Var);
        v9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        this.f46271c.setText(UserObject.getUserName(user));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        this.f46270b.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f46272f) {
            canvas.drawLine(AndroidUtilities.dp(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(16.0f), getMeasuredHeight(), j6.f19231k0);
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
