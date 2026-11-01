package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.messenger.dd;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.RadioButton;
import w7.b6;
import w7.g6;
public final class e1 extends FrameLayout {
    public final String f53760a;
    public final RadioButton f53761b;
    public final boolean f53762c;

    public e1(f1 f1Var, boolean z10, Context context) {
        super(context);
        this.f53760a = f1Var.f53775a;
        RadioButton radioButton = new RadioButton(context);
        this.f53761b = radioButton;
        radioButton.setSize(org.telegram.messenger.i0.L(20.0f));
        a7.P(radioButton, t6.D5, t6.E5, null);
        addView(radioButton, b6.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b10 = g6.b(context, 16.0f, t6.G6, true, null);
        b10.setText(f1Var.f53777c);
        addView(b10, b6.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = g6.b(context, 14.0f, t6.f21312y6, false, null);
        b11.setText(dd.a0(null, null, 2131752993, dd.a0(null, null, 2131742808, dd.T(f1Var.d / 1000), dd.D0().o0().format(new Date(f1Var.d / 1000)))));
        addView(b11, b6.t(-1, -2, 7, 62, 32, 8, 0));
        this.f53762c = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f53762c) {
            canvas.drawLine(org.telegram.messenger.i0.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, t6.f21053k0);
        }
    }
}
