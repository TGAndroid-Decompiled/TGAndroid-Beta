package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import bi.dd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zq;
public final class k extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final y9 f53075a;
    public final s6 f53076b;
    public final s6 f53077c;
    public final s6 d;
    public final zq[] e;
    public boolean f53078f;

    public k(Context context, u6 u6Var) {
        super(context);
        this.e = new zq[1];
        setOrientation(0);
        s6 s6Var = new s6(context, false, false, false);
        this.f53077c = s6Var;
        int i10 = y6.G6;
        f7.Z(s6Var, i10, u6Var);
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        s6Var.setEllipsizeByGradient(true);
        s6 s6Var2 = new s6(context, false, false, false);
        this.d = s6Var2;
        f7.Z(s6Var2, y6.f23746y6, u6Var);
        s6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        y9 y9Var = new y9(context);
        this.f53075a = y9Var;
        s6 s6Var3 = new s6(context, false, false, false);
        this.f53076b = s6Var3;
        s6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var3.setPadding(AndroidUtilities.dp(20.0f), 0, 0, 0);
        f7.Z(s6Var3, i10, u6Var);
        s6Var3.setTypeface(AndroidUtilities.bold());
        s6Var3.setGravity(17);
        addView(s6Var3, gb1.s(66, -2, 0.0f, 16));
        addView(y9Var, gb1.s(32, 32, 0.0f, 16));
        addView(s6Var, gb1.s(0, -2, 1.0f, 16));
        addView(s6Var2, gb1.t(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j10, boolean z10) {
        this.d.c(dd.W0(false, org.telegram.messenger.t.i((int) j10, ',', new StringBuilder("⭐️")), 0.78f, this.e), z10, true);
    }

    public final void b(int i10, boolean z10, boolean z11) {
        s6 s6Var = this.f53076b;
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
        j9 j9Var = new j9((u6) null);
        j9Var.r(user);
        y9 y9Var = this.f53075a;
        y9Var.f(user, j9Var);
        y9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        this.f53077c.setText(UserObject.getUserName(user));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        this.f53076b.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f53078f) {
            canvas.drawLine(AndroidUtilities.dp(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(16.0f), getMeasuredHeight(), y6.f23476k0);
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
