package th;

import ai.i4;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.g0;
import org.telegram.messenger.u10;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z8;
import r4.u;
public final class n extends FrameLayout {
    public final z8 f55437a;
    public final TextView f55438b;
    public i f55439c;

    public n(int i3, Context context, e6 e6Var) {
        super(context);
        this.f55437a = new z8(i3, this, g0.L(24.0f), g0.L(10.0f), g0.N(1.0f));
        TextView textView = new TextView(context);
        this.f55438b = textView;
        r6.V(textView, k6.E8, e6Var);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(g0.L(16.0f), 0, g0.L(68.0f), 0);
        addView(textView, mf.g());
    }

    public final l41 a(d2 d2Var, long j10, int i3, byte[] bArr, int i10, u10 u10Var) {
        i iVar = this.f55439c;
        if (iVar != null) {
            return iVar;
        }
        m mVar = new m(d2Var.getCurrentAccount(), d2Var.getMessagesController().j1(j10), i3, bArr, new u(this, 11), u10Var);
        g0.i3(new u(mVar, 12), 1000L);
        i iVar2 = new i(d2Var, new h(mVar, 0), i10);
        this.f55439c = iVar2;
        iVar2.f35594g3.f33698r = false;
        iVar2.j(new i4(10, this, mVar));
        return this.f55439c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - g0.L(11.0f);
        z8 z8Var = this.f55437a;
        z8Var.setBounds(width - ((int) z8Var.f40986c.d.f53858f.f53866a), g0.L(12.0f), getWidth() - g0.L(11.0f), g0.L(24.0f) + g0.L(12.0f));
        z8Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f55437a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f55437a.b();
    }

    public void setText(String str) {
        this.f55438b.setText(str);
    }
}
