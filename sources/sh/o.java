package sh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.d6;
import c8.ma;
import org.telegram.messenger.g0;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.g9;
import org.telegram.ui.web.z0;
public final class o extends FrameLayout {
    public final g9 f57472a;
    public final TextView f57473b;
    public j f57474c;

    public o(int i7, Context context, i6 i6Var) {
        super(context);
        this.f57472a = new g9(i7, this, g0.L(24.0f), g0.L(10.0f), g0.N(1.0f));
        TextView textView = new TextView(context);
        this.f57473b = textView;
        u6.U(textView, n6.E8, i6Var);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(g0.L(16.0f), 0, g0.L(68.0f), 0);
        addView(textView, ma.g());
    }

    public final e51 a(h2 h2Var, long j3, int i7, byte[] bArr, int i10, x10 x10Var) {
        j jVar = this.f57474c;
        if (jVar != null) {
            return jVar;
        }
        n nVar = new n(h2Var.getCurrentAccount(), h2Var.getMessagesController().l1(j3), i7, bArr, new z0(this, 17), x10Var);
        g0.h3(new z0(nVar, 18), 1000L);
        j jVar2 = new j(h2Var, new i(nVar, 0), i10);
        this.f57474c = jVar2;
        jVar2.f34607g3.f42809r = false;
        jVar2.j(new d6(10, this, nVar));
        return this.f57474c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - g0.L(11.0f);
        g9 g9Var = this.f57472a;
        g9Var.setBounds(width - ((int) g9Var.f35426c.d.f57675f.f57683a), g0.L(12.0f), getWidth() - g0.L(11.0f), g0.L(24.0f) + g0.L(12.0f));
        g9Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f57472a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f57472a.b();
    }

    public void setText(String str) {
        this.f57473b.setText(str);
    }
}
