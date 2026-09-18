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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.k9;
import org.telegram.ui.web.u0;
import w7.x5;
public final class q extends FrameLayout {
    public final k9 f41830a;
    public final TextView f41831b;
    public k f41832c;

    public q(Context context, int i10, f6 f6Var) {
        super(context);
        this.f41830a = new k9(i10, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.f41831b = textView;
        textView.setTextColor(j6.v0(j6.E8, f6Var));
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, x5.g());
    }

    public final f61 a(o2 o2Var, long j3, int i10, byte[] bArr, int i11, Utilities.Callback callback) {
        k kVar = this.f41832c;
        if (kVar != null) {
            return kVar;
        }
        p pVar = new p(o2Var.getCurrentAccount(), o2Var.getMessagesController().getInputPeer(j3), i10, bArr, new u0(this, 20), callback);
        AndroidUtilities.runOnUIThread(new u0(pVar, 21), 1000L);
        k kVar2 = new k(o2Var, new j(pVar, 0), i11);
        this.f41832c = kVar2;
        kVar2.Y2.f29854r = false;
        kVar2.j(new l(this, pVar));
        return this.f41832c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - AndroidUtilities.dp(11.0f);
        k9 k9Var = this.f41830a;
        k9Var.setBounds(width - ((int) k9Var.f25600c.d.f14001f.f14008a), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(12.0f));
        k9Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41830a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41830a.b();
    }

    public void setText(String str) {
        this.f41831b.setText(str);
    }
}
