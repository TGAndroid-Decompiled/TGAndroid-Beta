package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.t61;
import org.telegram.ui.web.u0;
import w7.y5;
public final class q extends FrameLayout {
    public final m9 f42118a;
    public final TextView f42119b;
    public k f42120c;

    public q(Context context, int i10, e6 e6Var) {
        super(context);
        this.f42118a = new m9(i10, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.f42119b = textView;
        textView.setTextColor(i6.v0(i6.E8, e6Var));
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, y5.g());
    }

    public final t61 a(o2 o2Var, long j3, int i10, byte[] bArr, int i11, Utilities.Callback callback) {
        k kVar = this.f42120c;
        if (kVar != null) {
            return kVar;
        }
        p pVar = new p(o2Var.getCurrentAccount(), o2Var.getMessagesController().getInputPeer(j3), i10, bArr, new u0(this, 21), callback);
        AndroidUtilities.runOnUIThread(new u0(pVar, 22), 1000L);
        k kVar2 = new k(o2Var, new j(pVar, 0), i11);
        this.f42120c = kVar2;
        kVar2.Y2.f25959r = false;
        kVar2.j(new l(this, pVar));
        return this.f42120c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - AndroidUtilities.dp(11.0f);
        m9 m9Var = this.f42118a;
        m9Var.setBounds(width - ((int) m9Var.f26392c.d.f14219f.f14226a), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(12.0f));
        m9Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42118a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42118a.b();
    }

    public void setText(String str) {
        this.f42119b.setText(str);
    }
}
