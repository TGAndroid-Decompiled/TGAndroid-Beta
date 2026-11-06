package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import bi.dd;
import c8.ha;
import org.telegram.messenger.i6;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wp;
public final class k extends LinearLayout implements ls {
    public final l9 f60313a;
    public final j6 f60314b;
    public final j6 f60315c;
    public final j6 d;
    public final wp[] f60316e;
    public boolean f60317f;

    public k(Context context, f6 f6Var) {
        super(context);
        this.f60316e = new wp[1];
        setOrientation(0);
        j6 j6Var = new j6(context, false, false, false);
        this.f60315c = j6Var;
        int i7 = k6.G6;
        r6.Z(j6Var, i7, f6Var);
        j6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        j6Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        j6Var.setEllipsizeByGradient(true);
        j6 j6Var2 = new j6(context, false, false, false);
        this.d = j6Var2;
        r6.Z(j6Var2, k6.f28240y6, f6Var);
        j6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        l9 l9Var = new l9(context);
        this.f60313a = l9Var;
        j6 j6Var3 = new j6(context, false, false, false);
        this.f60314b = j6Var3;
        j6Var3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        j6Var3.setPadding(org.telegram.messenger.g0.L(20.0f), 0, 0, 0);
        r6.Z(j6Var3, i7, f6Var);
        j6Var3.setTypeface(org.telegram.messenger.g0.o());
        j6Var3.setGravity(17);
        addView(j6Var3, ha.p(66, -2, 0.0f, 16));
        addView(l9Var, ha.p(32, 32, 0.0f, 16));
        addView(j6Var, ha.p(0, -2, 1.0f, 16));
        addView(j6Var2, ha.q(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j3, boolean z9) {
        this.d.c(dd.a1(false, jg.g.m((int) j3, ',', new StringBuilder("⭐️")), 0.78f, this.f60316e), z9, true);
    }

    public final void b(int i7, boolean z9, boolean z10) {
        j6 j6Var = this.f60314b;
        if (z9 && i7 <= 3) {
            if (i7 == 1) {
                j6Var.c(i6.o("🥇", j6Var.getPaint().getFontMetricsInt(), 20, null), z10, true);
                return;
            } else if (i7 == 2) {
                j6Var.c(i6.o("🥈", j6Var.getPaint().getFontMetricsInt(), 20, null), z10, true);
                return;
            } else if (i7 == 3) {
                j6Var.c(i6.o("🥉", j6Var.getPaint().getFontMetricsInt(), 20, null), z10, true);
                return;
            } else {
                return;
            }
        }
        if (i7 >= 10000) {
            j6Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        } else if (i7 >= 1000) {
            j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        } else {
            j6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        }
        j6Var.c(Integer.toString(i7), z10, true);
    }

    public final void c(TLRPC.User user) {
        w8 w8Var = new w8((f6) null);
        w8Var.r(user);
        l9 l9Var = this.f60313a;
        l9Var.e(user, w8Var);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        this.f60315c.setText(t10.p(user));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        this.f60314b.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f60317f) {
            canvas.drawLine(org.telegram.messenger.g0.L(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f), getMeasuredHeight(), k6.f27971k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.e().c(this, qs.f25001i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.e().n(this, qs.f25001i4);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
    }
}
