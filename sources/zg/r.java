package zg;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.k51;

public final class r extends FrameLayout {

    public final d9 f50857a;

    public final TextView f50858b;

    public l f50859c;

    public r(Context context, int i10, c6 c6Var) {
        super(context);
        this.f50857a = new d9(i10, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.f50858b = textView;
        textView.setTextColor(g6.v0(g6.E8, c6Var));
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, z5.g());
    }

    public final k51 a(n2 n2Var, long j10, int i10, byte[] bArr, int i11, Utilities.Callback callback) {
        l lVar = this.f50859c;
        if (lVar != null) {
            return lVar;
        }
        q qVar = new q(n2Var.getCurrentAccount(), n2Var.getMessagesController().getInputPeer(j10), i10, bArr, new j(this, 0), callback);
        AndroidUtilities.runOnUIThread(new j(qVar, 1), 1000L);
        l lVar2 = new l(n2Var, new k(qVar, 0), i11);
        this.f50859c = lVar2;
        lVar2.U2.f26942r = false;
        lVar2.j(new m(this, qVar));
        return this.f50859c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - AndroidUtilities.dp(11.0f);
        d9 d9Var = this.f50857a;
        d9Var.setBounds(width - ((int) d9Var.f27675c.d.f48514f.f48522a), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(12.0f));
        d9Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50857a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50857a.b();
    }

    public void setText(String str) {
        this.f50858b.setText(str);
    }
}
