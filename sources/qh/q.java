package qh;

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
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.s61;
import org.telegram.ui.web.r0;
import w7.y5;
public final class q extends FrameLayout {
    public final l9 f42102a;
    public final TextView f42103b;
    public k f42104c;

    public q(Context context, int i10, f6 f6Var) {
        super(context);
        this.f42102a = new l9(i10, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.f42103b = textView;
        textView.setTextColor(j6.v0(j6.E8, f6Var));
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, y5.g());
    }

    public final s61 a(n2 n2Var, long j3, int i10, byte[] bArr, int i11, Utilities.Callback callback) {
        k kVar = this.f42104c;
        if (kVar != null) {
            return kVar;
        }
        p pVar = new p(n2Var.getCurrentAccount(), n2Var.getMessagesController().getInputPeer(j3), i10, bArr, new r0(this, 21), callback);
        AndroidUtilities.runOnUIThread(new r0(pVar, 22), 1000L);
        k kVar2 = new k(n2Var, new j(pVar, 0), i11);
        this.f42104c = kVar2;
        kVar2.Y2.f25678r = false;
        kVar2.j(new l(this, pVar));
        return this.f42104c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - AndroidUtilities.dp(11.0f);
        l9 l9Var = this.f42102a;
        l9Var.setBounds(width - ((int) l9Var.f26059c.d.f14186f.f14193a), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(12.0f));
        l9Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42102a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42102a.b();
    }

    public void setText(String str) {
        this.f42103b.setText(str);
    }
}
