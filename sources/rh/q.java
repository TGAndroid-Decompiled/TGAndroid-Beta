package rh;

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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.m9;
import org.telegram.ui.web.z1;
import w7.z5;
public final class q extends FrameLayout {
    public final m9 f45793a;
    public final TextView f45794b;
    public k f45795c;

    public q(Context context, int i10, d6 d6Var) {
        super(context);
        this.f45793a = new m9(i10, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.f45794b = textView;
        textView.setTextColor(h6.w0(h6.E8, d6Var));
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, z5.g());
    }

    public final c71 a(n2 n2Var, long j10, int i10, byte[] bArr, int i11, Utilities.Callback callback) {
        k kVar = this.f45795c;
        if (kVar != null) {
            return kVar;
        }
        p pVar = new p(n2Var.getCurrentAccount(), n2Var.getMessagesController().getInputPeer(j10), i10, bArr, new z1(this, 18), callback);
        AndroidUtilities.runOnUIThread(new z1(pVar, 19), 1000L);
        k kVar2 = new k(n2Var, new j(pVar, 0), i11);
        this.f45795c = kVar2;
        kVar2.W2.f30861r = false;
        kVar2.j(new l(this, pVar));
        return this.f45795c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - AndroidUtilities.dp(11.0f);
        m9 m9Var = this.f45793a;
        m9Var.setBounds(width - ((int) m9Var.f28452c.d.f17400f.f17407a), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(12.0f));
        m9Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45793a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45793a.b();
    }

    public void setText(String str) {
        this.f45794b.setText(str);
    }
}
