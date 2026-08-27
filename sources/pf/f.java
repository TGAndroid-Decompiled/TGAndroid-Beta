package pf;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import h7.z5;
import lh.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Components.n9;

public final class f extends z2 {

    public final k f45791f;

    public f(k kVar, Context context) {
        super(context);
        this.f45791f = kVar;
        this.f26018a = UserConfig.selectedAccount;
        final int i10 = 1;
        setOrientation(1);
        final int i11 = 0;
        setBackgroundColor(g6.w0(null, g6.f22999a7, false));
        m5 m5Var = new m5(context, 3);
        m5Var.f16384c = new Path();
        Paint paint = new Paint(1);
        m5Var.f16383b = paint;
        paint.setColor(g6.w0(null, g6.f23053d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        m5Var.setWillNotDraw(false);
        m5Var.setOrientation(1);
        m5Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        n9 n9Var = new n9(context);
        this.f26019b = n9Var;
        n9Var.setOnClickListener(new View.OnClickListener(this) {

            public final pf.f f25987b;

            {
                this.f25987b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f25987b.f26019b.getImageReceiver().startAnimation();
                        break;
                    default:
                        this.f25987b.f45791f.K();
                        break;
                }
            }
        });
        a();
        m5Var.addView(n9Var, z5.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.f26020c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(g6.w0(null, g6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        m5Var.addView(textView, z5.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(g6.w0(null, g6.f23423y6, false));
        m5Var.addView(textView2, z5.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.f26021e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(w5.f(new float[]{8.0f}, g6.Oh));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(g6.w0(null, g6.Sh, false));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {

            public final pf.f f25987b;

            {
                this.f25987b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f25987b.f26019b.getImageReceiver().startAnimation();
                        break;
                    default:
                        this.f25987b.f45791f.K();
                        break;
                }
            }
        });
        m5Var.addView(textView3, z5.t(-1, -2, 49, 0, 18, 0, 0));
        addView(m5Var, z5.n(-1, -2));
        set(null);
    }
}
