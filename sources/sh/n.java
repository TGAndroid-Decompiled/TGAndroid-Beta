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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.q41;
import sg.t0;
public final class n extends FrameLayout {
    public final b9 f55239a;
    public final TextView f55240b;
    public i f55241c;

    public n(int i7, Context context, f6 f6Var) {
        super(context);
        this.f55239a = new b9(i7, this, g0.L(24.0f), g0.L(10.0f), g0.N(1.0f));
        TextView textView = new TextView(context);
        this.f55240b = textView;
        r6.V(textView, k6.E8, f6Var);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(g0.L(16.0f), 0, g0.L(68.0f), 0);
        addView(textView, ha.g());
    }

    public final q41 a(f2 f2Var, long j3, int i7, byte[] bArr, int i10, c20 c20Var) {
        i iVar = this.f55241c;
        if (iVar != null) {
            return iVar;
        }
        m mVar = new m(f2Var.getCurrentAccount(), f2Var.getMessagesController().j1(j3), i7, bArr, new t0(this, 4), c20Var);
        g0.i3(new t0(mVar, 5), 1000L);
        i iVar2 = new i(f2Var, new h(mVar, 0), i10);
        this.f55241c = iVar2;
        iVar2.f37160f3.f35510r = false;
        iVar2.j(new o0(9, this, mVar));
        return this.f55241c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - g0.L(11.0f);
        b9 b9Var = this.f55239a;
        b9Var.setBounds(width - ((int) b9Var.f32112c.d.f55412f.f55420a), g0.L(12.0f), getWidth() - g0.L(11.0f), g0.L(24.0f) + g0.L(12.0f));
        b9Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f55239a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f55239a.b();
    }

    public void setText(String str) {
        this.f55240b.setText(str);
    }
}
