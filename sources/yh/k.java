package yh;

import ai.md;
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
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yq;
import w7.z5;
public final class k extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final w9 f50334a;
    public final q6 f50335b;
    public final q6 f50336c;
    public final q6 d;
    public final yq[] e;
    public boolean f50337f;

    public k(Context context, d6 d6Var) {
        super(context);
        this.e = new yq[1];
        setOrientation(0);
        q6 q6Var = new q6(context, false, false, false);
        this.f50336c = q6Var;
        int i10 = h6.G6;
        q6Var.setTextColor(h6.w0(i10, d6Var));
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        q6Var.setEllipsizeByGradient(true);
        q6 q6Var2 = new q6(context, false, false, false);
        this.d = q6Var2;
        q6Var2.setTextColor(h6.w0(h6.f21378y6, d6Var));
        q6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        w9 w9Var = new w9(context);
        this.f50334a = w9Var;
        q6 q6Var3 = new q6(context, false, false, false);
        this.f50335b = q6Var3;
        q6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var3.setPadding(AndroidUtilities.dp(20.0f), 0, 0, 0);
        q6Var3.setTextColor(h6.w0(i10, d6Var));
        q6Var3.setTypeface(AndroidUtilities.bold());
        q6Var3.setGravity(17);
        addView(q6Var3, z5.o(66, -2, 0.0f, 16));
        addView(w9Var, z5.o(32, 32, 0.0f, 16));
        addView(q6Var, z5.o(0, -2, 1.0f, 16));
        addView(q6Var2, z5.p(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j10, boolean z10) {
        this.d.c(md.Y0(false, org.telegram.messenger.g0.h((int) j10, ',', new StringBuilder("⭐️")), 0.78f, this.e), z10, true);
    }

    public final void b(int i10, boolean z10, boolean z11) {
        q6 q6Var = this.f50335b;
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
        h9 h9Var = new h9((d6) null);
        h9Var.r(user);
        w9 w9Var = this.f50334a;
        w9Var.e(user, h9Var);
        w9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        this.f50336c.setText(UserObject.getUserName(user));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        this.f50335b.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f50337f) {
            canvas.drawLine(AndroidUtilities.dp(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(16.0f), getMeasuredHeight(), h6.f21111k0);
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
