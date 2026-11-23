package sh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.j6;
import c8.na;
import org.telegram.messenger.g0;
import org.telegram.messenger.w10;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.g51;
import org.telegram.ui.web.z0;
public final class n extends FrameLayout {
    public final f9 f57591a;
    public final TextView f57592b;
    public i f57593c;

    public n(int i7, Context context, i6 i6Var) {
        super(context);
        this.f57591a = new f9(i7, this, g0.L(24.0f), g0.L(10.0f), g0.N(1.0f));
        TextView textView = new TextView(context);
        this.f57592b = textView;
        u6.U(textView, n6.E8, i6Var);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(g0.L(16.0f), 0, g0.L(68.0f), 0);
        addView(textView, na.g());
    }

    public final g51 a(g2 g2Var, long j3, int i7, byte[] bArr, int i10, w10 w10Var) {
        i iVar = this.f57593c;
        if (iVar != null) {
            return iVar;
        }
        m mVar = new m(g2Var.getCurrentAccount(), g2Var.getMessagesController().l1(j3), i7, bArr, new z0(this, 17), w10Var);
        g0.h3(new z0(mVar, 18), 1000L);
        i iVar2 = new i(g2Var, new h(mVar, 0), i10);
        this.f57593c = iVar2;
        iVar2.f35323g3.f33631r = false;
        iVar2.j(new j6(10, this, mVar));
        return this.f57593c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - g0.L(11.0f);
        f9 f9Var = this.f57591a;
        f9Var.setBounds(width - ((int) f9Var.f35058c.d.f57797f.f57805a), g0.L(12.0f), getWidth() - g0.L(11.0f), g0.L(24.0f) + g0.L(12.0f));
        f9Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f57591a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f57591a.b();
    }

    public void setText(String str) {
        this.f57592b.setText(str);
    }
}
