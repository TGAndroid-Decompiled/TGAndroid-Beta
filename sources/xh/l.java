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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.y9;
import w7.x5;
import yh.p7;
public final class l extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final y9 f51414a;
    public final r6 f51415b;
    public final r6 f51416c;
    public final r6 d;
    public final er[] f51417e;
    public boolean f51418f;

    public l(Context context, d6 d6Var) {
        super(context);
        this.f51417e = new er[1];
        setOrientation(0);
        r6 r6Var = new r6(context, false, false, false);
        this.f51416c = r6Var;
        int i10 = h6.G6;
        r6Var.setTextColor(h6.w0(i10, d6Var));
        r6Var.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        r6Var.setEllipsizeByGradient(true);
        r6 r6Var2 = new r6(context, false, false, false);
        this.d = r6Var2;
        r6Var2.setTextColor(h6.w0(h6.f21171y6, d6Var));
        r6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        y9 y9Var = new y9(context);
        this.f51414a = y9Var;
        r6 r6Var3 = new r6(context, false, false, false);
        this.f51415b = r6Var3;
        r6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var3.setPadding(AndroidUtilities.dp(20.0f), 0, 0, 0);
        r6Var3.setTextColor(h6.w0(i10, d6Var));
        r6Var3.setTypeface(AndroidUtilities.bold());
        r6Var3.setGravity(17);
        addView(r6Var3, x5.o(66, -2, 0.0f, 16));
        addView(y9Var, x5.o(32, 32, 0.0f, 16));
        addView(r6Var, x5.o(0, -2, 1.0f, 16));
        addView(r6Var2, x5.p(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j3, boolean z10) {
        this.d.c(p7.Y0(false, org.telegram.messenger.q.h((int) j3, ',', new StringBuilder("⭐️")), 0.78f, this.f51417e), z10, true);
    }

    public final void b(int i10, boolean z10, boolean z11) {
        r6 r6Var = this.f51415b;
        if (z10 && i10 <= 3) {
            if (i10 == 1) {
                r6Var.c(Emoji.replaceWithRestrictedEmoji("🥇", r6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else if (i10 == 2) {
                r6Var.c(Emoji.replaceWithRestrictedEmoji("🥈", r6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else if (i10 == 3) {
                r6Var.c(Emoji.replaceWithRestrictedEmoji("🥉", r6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
                return;
            } else {
                return;
            }
        }
        if (i10 >= 10000) {
            r6Var.setTextSize(AndroidUtilities.dp(12.0f));
        } else if (i10 >= 1000) {
            r6Var.setTextSize(AndroidUtilities.dp(14.0f));
        } else {
            r6Var.setTextSize(AndroidUtilities.dp(15.0f));
        }
        r6Var.c(Integer.toString(i10), z11, true);
    }

    public final void c(TLRPC.User user) {
        j9 j9Var = new j9((d6) null);
        j9Var.r(user);
        y9 y9Var = this.f51414a;
        y9Var.e(user, j9Var);
        y9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        this.f51416c.setText(UserObject.getUserName(user));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        this.f51415b.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f51418f) {
            canvas.drawLine(AndroidUtilities.dp(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(16.0f), getMeasuredHeight(), h6.f20908k0);
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
