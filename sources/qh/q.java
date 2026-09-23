package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.m9;
import org.telegram.ui.web.t0;
import w7.x5;
public final class q extends FrameLayout {
    public final m9 f41755a;
    public final TextView f41756b;
    public k f41757c;

    public q(Context context, int i10, d6 d6Var) {
        super(context);
        this.f41755a = new m9(i10, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.f41756b = textView;
        textView.setTextColor(h6.v0(h6.E8, d6Var));
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, x5.g());
    }

    public final d61 a(n2 n2Var, long j3, int i10, byte[] bArr, int i11, Utilities.Callback callback) {
        k kVar = this.f41757c;
        if (kVar != null) {
            return kVar;
        }
        p pVar = new p(n2Var.getCurrentAccount(), n2Var.getMessagesController().getInputPeer(j3), i10, bArr, new t0(this, 20), callback);
        AndroidUtilities.runOnUIThread(new t0(pVar, 21), 1000L);
        k kVar2 = new k(n2Var, new j(pVar, 0), i11);
        this.f41757c = kVar2;
        kVar2.Y2.f28662r = false;
        kVar2.j(new l(this, pVar));
        return this.f41757c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - AndroidUtilities.dp(11.0f);
        m9 m9Var = this.f41755a;
        m9Var.setBounds(width - ((int) m9Var.f26144c.d.f13979f.f13986a), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(12.0f));
        m9Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41755a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41755a.b();
    }

    public void setText(String str) {
        this.f41756b.setText(str);
    }
}
