package rf;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Components.t9;
public final class g extends z2 {
    public final l f47232f;

    public g(l lVar, Context context) {
        super(context);
        this.f47232f = lVar;
        this.f26034a = UserConfig.selectedAccount;
        setOrientation(1);
        setBackgroundColor(g6.w0(null, g6.f23009a7, false));
        bg.l0 l0Var = new bg.l0(context, 4);
        l0Var.f2382c = new Path();
        Paint paint = new Paint(1);
        l0Var.f2381b = paint;
        paint.setColor(g6.w0(null, g6.f23062d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        l0Var.setWillNotDraw(false);
        l0Var.setOrientation(1);
        l0Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        t9 t9Var = new t9(context);
        this.f26035b = t9Var;
        t9Var.setOnClickListener(new View.OnClickListener(this) {
            public final rf.g f25994b;

            {
                this.f25994b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f25994b.f26035b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f25994b.f47232f.K();
                        return;
                }
            }
        });
        a();
        l0Var.addView(t9Var, f6.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.f26036c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(g6.w0(null, g6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        l0Var.addView(textView, f6.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(g6.w0(null, g6.f23433y6, false));
        l0Var.addView(textView2, f6.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.f26037e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(w5.f(new float[]{8.0f}, g6.Oh));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(g6.w0(null, g6.Sh, false));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final rf.g f25994b;

            {
                this.f25994b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f25994b.f26035b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f25994b.f47232f.K();
                        return;
                }
            }
        });
        l0Var.addView(textView3, f6.t(-1, -2, 49, 0, 18, 0, 0));
        addView(l0Var, f6.n(-1, -2));
        set(null);
    }
}
