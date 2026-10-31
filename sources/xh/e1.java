package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.messenger.cd;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.RadioButton;
import w7.b6;
import w7.g6;
public final class e1 extends FrameLayout {
    public final String f53742a;
    public final RadioButton f53743b;
    public final boolean f53744c;

    public e1(f1 f1Var, boolean z10, Context context) {
        super(context);
        this.f53742a = f1Var.f53757a;
        RadioButton radioButton = new RadioButton(context);
        this.f53743b = radioButton;
        radioButton.setSize(org.telegram.messenger.i0.L(20.0f));
        a7.P(radioButton, t6.D5, t6.E5, null);
        addView(radioButton, b6.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b10 = g6.b(context, 16.0f, t6.G6, true, null);
        b10.setText(f1Var.f53759c);
        addView(b10, b6.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = g6.b(context, 14.0f, t6.f21311y6, false, null);
        b11.setText(cd.a0(null, null, 2131752993, cd.a0(null, null, 2131742808, cd.T(f1Var.d / 1000), cd.D0().o0().format(new Date(f1Var.d / 1000)))));
        addView(b11, b6.t(-1, -2, 7, 62, 32, 8, 0));
        this.f53744c = z10;
        setWillNotDraw(!z10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f53744c) {
            canvas.drawLine(org.telegram.messenger.i0.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, t6.f21052k0);
        }
    }
}
