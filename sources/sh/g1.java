package sh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import k7.c6;
import k7.g6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.RadioButton;
public final class g1 extends FrameLayout {
    public final String f47475a;
    public final RadioButton f47476b;
    public final boolean f47477c;

    public g1(h1 h1Var, boolean z4, Context context) {
        super(context);
        this.f47475a = h1Var.f47487a;
        RadioButton radioButton = new RadioButton(context);
        this.f47476b = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(k6.w0(null, k6.D5, false), k6.w0(null, k6.E5, false));
        addView(radioButton, c6.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b10 = g6.b(context, 16.0f, k6.G6, true, null);
        b10.setText(h1Var.f47489c);
        addView(b10, c6.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = g6.b(context, 14.0f, k6.f22038y6, false, null);
        b11.setText(LocaleController.formatString(R.string.BotRestoreStorageCreatedAt, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.formatSmallDateChat(h1Var.d / 1000), LocaleController.getInstance().getFormatterDay().format(new Date(h1Var.d / 1000)))));
        addView(b11, c6.t(-1, -2, 7, 62, 32, 8, 0));
        this.f47477c = z4;
        setWillNotDraw(!z4);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f47477c) {
            canvas.drawLine(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, k6.f21781k0);
        }
    }
}
