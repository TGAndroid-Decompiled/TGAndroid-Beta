package sh;

import ai.o0;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.r41;
public final class o extends FrameLayout {
    public final a9 f55343a;
    public final TextView f55344b;
    public j f55345c;

    public o(int i7, Context context, h6 h6Var) {
        super(context);
        this.f55343a = new a9(i7, this, g0.L(24.0f), g0.L(10.0f), g0.N(1.0f));
        TextView textView = new TextView(context);
        this.f55344b = textView;
        t6.U(textView, m6.E8, h6Var);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(g0.L(16.0f), 0, g0.L(68.0f), 0);
        addView(textView, ha.g());
    }

    public final r41 a(f2 f2Var, long j3, int i7, byte[] bArr, int i10, c20 c20Var) {
        j jVar = this.f55345c;
        if (jVar != null) {
            return jVar;
        }
        n nVar = new n(f2Var.getCurrentAccount(), f2Var.getMessagesController().j1(j3), i7, bArr, new b(this, 2), c20Var);
        g0.i3(new b(nVar, 3), 1000L);
        j jVar2 = new j(f2Var, new i(nVar, 0), i10);
        this.f55345c = jVar2;
        jVar2.f37496f3.f35845r = false;
        jVar2.j(new o0(9, this, nVar));
        return this.f55345c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - g0.L(11.0f);
        a9 a9Var = this.f55343a;
        a9Var.setBounds(width - ((int) a9Var.f31797c.d.f55516f.f55524a), g0.L(12.0f), getWidth() - g0.L(11.0f), g0.L(24.0f) + g0.L(12.0f));
        a9Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f55343a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f55343a.b();
    }

    public void setText(String str) {
        this.f55344b.setText(str);
    }
}
