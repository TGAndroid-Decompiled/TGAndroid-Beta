package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.voip.x;
import w7.a6;
public final class q extends FrameLayout {
    public final l9 f40446a;
    public final TextView f40447b;
    public k f40448c;

    public q(Context context, int i10, f6 f6Var) {
        super(context);
        this.f40446a = new l9(i10, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.f40447b = textView;
        textView.setTextColor(j6.v0(j6.E8, f6Var));
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, a6.g());
    }

    public final r61 a(p2 p2Var, long j3, int i10, byte[] bArr, int i11, Utilities.Callback callback) {
        k kVar = this.f40448c;
        if (kVar != null) {
            return kVar;
        }
        p pVar = new p(p2Var.getCurrentAccount(), p2Var.getMessagesController().getInputPeer(j3), i10, bArr, new x(this, 27), callback);
        AndroidUtilities.runOnUIThread(new x(pVar, 28), 1000L);
        k kVar2 = new k(p2Var, new j(pVar, 0), i11);
        this.f40448c = kVar2;
        kVar2.Y2.f24250r = false;
        kVar2.j(new l(this, pVar));
        return this.f40448c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - AndroidUtilities.dp(11.0f);
        l9 l9Var = this.f40446a;
        l9Var.setBounds(width - ((int) l9Var.f24907c.d.f12886f.f12893a), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(12.0f));
        l9Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40446a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40446a.b();
    }

    public void setText(String str) {
        this.f40447b.setText(str);
    }
}
