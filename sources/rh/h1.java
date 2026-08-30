package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import k7.b6;
import k7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.RadioButton;
public final class h1 extends FrameLayout {
    public final String f43548a;
    public final RadioButton f43549b;
    public final boolean f43550c;

    public h1(i1 i1Var, boolean z4, Context context) {
        super(context);
        this.f43548a = i1Var.f43559a;
        RadioButton radioButton = new RadioButton(context);
        this.f43549b = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(j6.w0(null, j6.D5, false), j6.w0(null, j6.E5, false));
        addView(radioButton, b6.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b10 = f6.b(context, 16.0f, j6.G6, true, null);
        b10.setText(i1Var.f43561c);
        addView(b10, b6.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = f6.b(context, 14.0f, j6.f20281y6, false, null);
        b11.setText(LocaleController.formatString(R.string.BotRestoreStorageCreatedAt, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.formatSmallDateChat(i1Var.d / 1000), LocaleController.getInstance().getFormatterDay().format(new Date(i1Var.d / 1000)))));
        addView(b11, b6.t(-1, -2, 7, 62, 32, 8, 0));
        this.f43550c = z4;
        setWillNotDraw(!z4);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43550c) {
            canvas.drawLine(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, j6.f20025k0);
        }
    }
}
