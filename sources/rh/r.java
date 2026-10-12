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
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p9;
import w7.a6;
public final class r extends FrameLayout {
    public final p9 f44705a;
    public final TextView f44706b;
    public l f44707c;

    public r(Context context, int i10, c6 c6Var) {
        super(context);
        this.f44705a = new p9(i10, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.f44706b = textView;
        textView.setTextColor(g6.w0(g6.E8, c6Var));
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, a6.g());
    }

    public final h71 a(m2 m2Var, long j10, int i10, byte[] bArr, int i11, Utilities.Callback callback) {
        l lVar = this.f44707c;
        if (lVar != null) {
            return lVar;
        }
        q qVar = new q(m2Var.getCurrentAccount(), m2Var.getMessagesController().getInputPeer(j10), i10, bArr, new org.telegram.ui.Components.voip.m2(this, 29), callback);
        AndroidUtilities.runOnUIThread(new j(qVar, 0), 1000L);
        l lVar2 = new l(m2Var, new k(qVar, 0), i11);
        this.f44707c = lVar2;
        lVar2.W2.f31780r = false;
        lVar2.j(new m(this, qVar));
        return this.f44707c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - AndroidUtilities.dp(11.0f);
        p9 p9Var = this.f44705a;
        p9Var.setBounds(width - ((int) p9Var.f28250c.d.f16309f.f16316a), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(12.0f));
        p9Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44705a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44705a.b();
    }

    public void setText(String str) {
        this.f44706b.setText(str);
    }
}
