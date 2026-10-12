package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.p71;
import org.telegram.ui.web.t0;
import w7.w5;
public final class q extends FrameLayout {
    public final o9 f46663a;
    public final TextView f46664b;
    public k f46665c;

    public q(Context context, int i10, c6 c6Var) {
        super(context);
        this.f46663a = new o9(i10, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.f46664b = textView;
        textView.setTextColor(h6.w0(h6.E8, c6Var));
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, w5.g());
    }

    public final p71 a(m2 m2Var, long j3, int i10, byte[] bArr, int i11, Utilities.Callback callback) {
        k kVar = this.f46665c;
        if (kVar != null) {
            return kVar;
        }
        p pVar = new p(m2Var.getCurrentAccount(), m2Var.getMessagesController().getInputPeer(j3), i10, bArr, new t0(this, 20), callback);
        AndroidUtilities.runOnUIThread(new t0(pVar, 21), 1000L);
        k kVar2 = new k(m2Var, new j(pVar, 0), i11);
        this.f46665c = kVar2;
        kVar2.W2.f26679r = false;
        kVar2.j(new l(this, pVar));
        return this.f46665c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - AndroidUtilities.dp(11.0f);
        o9 o9Var = this.f46663a;
        o9Var.setBounds(width - ((int) o9Var.f29104c.d.f16108f.f16116a), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(12.0f));
        o9Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46663a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46663a.b();
    }

    public void setText(String str) {
        this.f46664b.setText(str);
    }
}
