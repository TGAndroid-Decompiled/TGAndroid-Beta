package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.voip.r2;
import w7.z5;
public final class q extends FrameLayout {
    public final p9 f44462a;
    public final TextView f44463b;
    public k f44464c;

    public q(Context context, int i10, c6 c6Var) {
        super(context);
        this.f44462a = new p9(i10, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.f44463b = textView;
        textView.setTextColor(g6.w0(g6.E8, c6Var));
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, z5.g());
    }

    public final i71 a(m2 m2Var, long j10, int i10, byte[] bArr, int i11, Utilities.Callback callback) {
        k kVar = this.f44464c;
        if (kVar != null) {
            return kVar;
        }
        p pVar = new p(m2Var.getCurrentAccount(), m2Var.getMessagesController().getInputPeer(j10), i10, bArr, new r2(this, 28), callback);
        AndroidUtilities.runOnUIThread(new r2(pVar, 29), 1000L);
        k kVar2 = new k(m2Var, new j(pVar, 0), i11);
        this.f44464c = kVar2;
        kVar2.W2.f23145r = false;
        kVar2.j(new l(this, pVar));
        return this.f44464c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - AndroidUtilities.dp(11.0f);
        p9 p9Var = this.f44462a;
        p9Var.setBounds(width - ((int) p9Var.f27931c.d.f16020f.f16027a), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(12.0f));
        p9Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44462a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44462a.b();
    }

    public void setText(String str) {
        this.f44463b.setText(str);
    }
}
