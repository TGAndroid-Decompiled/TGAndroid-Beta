package sh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.g0;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.h51;
import org.telegram.ui.web.z0;
public final class n extends FrameLayout {
    public final g9 f57511a;
    public final TextView f57512b;
    public i f57513c;

    public n(int i7, Context context, h6 h6Var) {
        super(context);
        this.f57511a = new g9(i7, this, g0.L(24.0f), g0.L(10.0f), g0.N(1.0f));
        TextView textView = new TextView(context);
        this.f57512b = textView;
        t6.U(textView, m6.E8, h6Var);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(g0.L(16.0f), 0, g0.L(68.0f), 0);
        addView(textView, ma.g());
    }

    public final h51 a(g2 g2Var, long j3, int i7, byte[] bArr, int i10, x10 x10Var) {
        i iVar = this.f57513c;
        if (iVar != null) {
            return iVar;
        }
        m mVar = new m(g2Var.getCurrentAccount(), g2Var.getMessagesController().l1(j3), i7, bArr, new z0(this, 17), x10Var);
        g0.h3(new z0(mVar, 18), 1000L);
        i iVar2 = new i(g2Var, new h(mVar, 0), i10);
        this.f57513c = iVar2;
        iVar2.f35796g3.f34068r = false;
        iVar2.j(new bi.h6(10, this, mVar));
        return this.f57513c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - g0.L(11.0f);
        g9 g9Var = this.f57511a;
        g9Var.setBounds(width - ((int) g9Var.f35461c.d.f57714f.f57722a), g0.L(12.0f), getWidth() - g0.L(11.0f), g0.L(24.0f) + g0.L(12.0f));
        g9Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f57511a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f57511a.b();
    }

    public void setText(String str) {
        this.f57512b.setText(str);
    }
}
