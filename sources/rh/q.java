package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.m9;
import org.telegram.ui.web.a2;
import w7.z5;
public final class q extends FrameLayout {
    public final m9 f46218a;
    public final TextView f46219b;
    public k f46220c;

    public q(Context context, int i10, g6 g6Var) {
        super(context);
        this.f46218a = new m9(i10, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.f46219b = textView;
        r6.W(textView, k6.E8, g6Var);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, z5.g());
    }

    public final j71 a(o2 o2Var, long j10, int i10, byte[] bArr, int i11, Utilities.Callback callback) {
        k kVar = this.f46220c;
        if (kVar != null) {
            return kVar;
        }
        p pVar = new p(o2Var.getCurrentAccount(), o2Var.getMessagesController().getInputPeer(j10), i10, bArr, new a2(this, 18), callback);
        AndroidUtilities.runOnUIThread(new a2(pVar, 19), 1000L);
        k kVar2 = new k(o2Var, new j(pVar, 0), i11);
        this.f46220c = kVar2;
        kVar2.Z2.f24972r = false;
        kVar2.j(new l(this, pVar));
        return this.f46220c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = getWidth() - AndroidUtilities.dp(11.0f);
        m9 m9Var = this.f46218a;
        m9Var.setBounds(width - ((int) m9Var.f28606c.d.f17463f.f17470a), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(12.0f));
        m9Var.c(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46218a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46218a.b();
    }

    public void setText(String str) {
        this.f46219b.setText(str);
    }
}
