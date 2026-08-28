package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.i51;
import pf.o1;
public final class q extends FrameLayout {
    public final e9 f50259a;
    public final TextView f50260b;
    public k f50261c;

    public q(Context context, int i9, b6 b6Var) {
        super(context);
        this.f50259a = new e9(i9, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.f50260b = textView;
        textView.setTextColor(f6.v0(f6.E8, b6Var));
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, e6.g());
    }

    public final i51 a(o2 o2Var, long j10, int i9, byte[] bArr, int i10, Utilities.Callback callback) {
        k kVar = this.f50261c;
        if (kVar != null) {
            return kVar;
        }
        p pVar = new p(o2Var.getCurrentAccount(), o2Var.getMessagesController().getInputPeer(j10), i9, bArr, new o1(this, 23), callback);
        AndroidUtilities.runOnUIThread(new o1(pVar, 24), 1000L);
        k kVar2 = new k(o2Var, new j(pVar, 0), i10);
        this.f50261c = kVar2;
        kVar2.U2.f35188r = false;
        kVar2.j(new l(this, pVar));
        return this.f50261c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - AndroidUtilities.dp(11.0f);
        e9 e9Var = this.f50259a;
        e9Var.setBounds(width - ((int) e9Var.f27981c.d.f47792f.f47800a), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(12.0f));
        e9Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50259a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50259a.b();
    }

    public void setText(String str) {
        this.f50260b.setText(str);
    }
}
