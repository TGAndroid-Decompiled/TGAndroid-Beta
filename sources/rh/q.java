package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.n9;
import w7.x5;
public final class q extends FrameLayout {
    public final n9 f45658a;
    public final TextView f45659b;
    public k f45660c;

    public q(Context context, int i10, f6 f6Var) {
        super(context);
        this.f45658a = new n9(i10, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.f45659b = textView;
        textView.setTextColor(j6.v0(j6.E8, f6Var));
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, x5.g());
    }

    public final d61 a(n2 n2Var, long j3, int i10, byte[] bArr, int i11, Utilities.Callback callback) {
        k kVar = this.f45660c;
        if (kVar != null) {
            return kVar;
        }
        p pVar = new p(n2Var.getCurrentAccount(), n2Var.getMessagesController().getInputPeer(j3), i10, bArr, new org.telegram.ui.web.b(this, 25), callback);
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b(pVar, 26), 1000L);
        k kVar2 = new k(n2Var, new j(pVar, 0), i11);
        this.f45660c = kVar2;
        kVar2.Y2.f31135r = false;
        kVar2.j(new l(this, pVar));
        return this.f45660c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - AndroidUtilities.dp(11.0f);
        n9 n9Var = this.f45658a;
        n9Var.setBounds(width - ((int) n9Var.f28692c.d.f15388f.f15396a), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(12.0f));
        n9Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45658a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45658a.b();
    }

    public void setText(String str) {
        this.f45659b.setText(str);
    }
}
