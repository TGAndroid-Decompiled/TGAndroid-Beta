package sh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.r71;
import org.telegram.ui.web.h1;
public final class q extends FrameLayout {
    public final o9 f48666a;
    public final TextView f48667b;
    public k f48668c;

    public q(Context context, int i10, u6 u6Var) {
        super(context);
        this.f48666a = new o9(i10, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.f48667b = textView;
        f7.V(textView, y6.E8, u6Var);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, gb1.k());
    }

    public final r71 a(r2 r2Var, long j10, int i10, byte[] bArr, int i11, Utilities.Callback callback) {
        k kVar = this.f48668c;
        if (kVar != null) {
            return kVar;
        }
        p pVar = new p(r2Var.getCurrentAccount(), r2Var.getMessagesController().getInputPeer(j10), i10, bArr, new h1(this, 22), callback);
        AndroidUtilities.runOnUIThread(new h1(pVar, 23), 1000L);
        k kVar2 = new k(r2Var, new j(pVar, 0), i11);
        this.f48668c = kVar2;
        kVar2.f32150g3.f29505r = false;
        kVar2.j(new l(this, pVar));
        return this.f48668c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - AndroidUtilities.dp(11.0f);
        o9 o9Var = this.f48666a;
        o9Var.setBounds(width - ((int) o9Var.f31228c.d.f19344f.f19351a), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(12.0f));
        o9Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48666a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48666a.b();
    }

    public void setText(String str) {
        this.f48667b.setText(str);
    }
}
