package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import bi.dd;
import c8.ha;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.wp;
public final class j extends LinearLayout implements ls {
    public final k9 f60406a;
    public final i6 f60407b;
    public final i6 f60408c;
    public final i6 d;
    public final wp[] f60409e;
    public boolean f60410f;

    public j(Context context, h6 h6Var) {
        super(context);
        this.f60409e = new wp[1];
        setOrientation(0);
        i6 i6Var = new i6(context, false, false, false);
        this.f60408c = i6Var;
        int i7 = m6.G6;
        t6.Y(i6Var, i7, h6Var);
        i6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        i6Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        i6Var.setEllipsizeByGradient(true);
        i6 i6Var2 = new i6(context, false, false, false);
        this.d = i6Var2;
        t6.Y(i6Var2, m6.f28282y6, h6Var);
        i6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        k9 k9Var = new k9(context);
        this.f60406a = k9Var;
        i6 i6Var3 = new i6(context, false, false, false);
        this.f60407b = i6Var3;
        i6Var3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        i6Var3.setPadding(org.telegram.messenger.g0.L(20.0f), 0, 0, 0);
        t6.Y(i6Var3, i7, h6Var);
        i6Var3.setTypeface(org.telegram.messenger.g0.o());
        i6Var3.setGravity(17);
        addView(i6Var3, ha.p(66, -2, 0.0f, 16));
        addView(k9Var, ha.p(32, 32, 0.0f, 16));
        addView(i6Var, ha.p(0, -2, 1.0f, 16));
        addView(i6Var2, ha.q(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j3, boolean z9) {
        this.d.c(dd.a1(false, jg.g.m((int) j3, ',', new StringBuilder("⭐️")), 0.78f, this.f60409e), z9, true);
    }

    public final void b(int i7, boolean z9, boolean z10) {
        i6 i6Var = this.f60407b;
        if (z9 && i7 <= 3) {
            if (i7 == 1) {
                i6Var.c(org.telegram.messenger.i6.o("🥇", i6Var.getPaint().getFontMetricsInt(), 20, null), z10, true);
                return;
            } else if (i7 == 2) {
                i6Var.c(org.telegram.messenger.i6.o("🥈", i6Var.getPaint().getFontMetricsInt(), 20, null), z10, true);
                return;
            } else if (i7 == 3) {
                i6Var.c(org.telegram.messenger.i6.o("🥉", i6Var.getPaint().getFontMetricsInt(), 20, null), z10, true);
                return;
            } else {
                return;
            }
        }
        if (i7 >= 10000) {
            i6Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        } else if (i7 >= 1000) {
            i6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        } else {
            i6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        }
        i6Var.c(Integer.toString(i7), z10, true);
    }

    public final void c(TLRPC.User user) {
        v8 v8Var = new v8((h6) null);
        v8Var.r(user);
        k9 k9Var = this.f60406a;
        k9Var.e(user, v8Var);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        this.f60408c.setText(t10.p(user));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        this.f60407b.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f60410f) {
            canvas.drawLine(org.telegram.messenger.g0.L(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f), getMeasuredHeight(), m6.f28013k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.e().c(this, qs.f25022i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.e().n(this, qs.f25022i4);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
    }
}
