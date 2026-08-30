package tf;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Components.p9;
public final class f extends b3 {
    public final k f44713f;

    public f(k kVar, Context context) {
        super(context);
        this.f44713f = kVar;
        this.f20862a = UserConfig.selectedAccount;
        setOrientation(1);
        setBackgroundColor(j6.w0(null, j6.f19852a7, false));
        dg.k0 k0Var = new dg.k0(context, 3);
        k0Var.f4615c = new Path();
        Paint paint = new Paint(1);
        k0Var.f4614b = paint;
        paint.setColor(j6.w0(null, j6.f19906d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        k0Var.setWillNotDraw(false);
        k0Var.setOrientation(1);
        k0Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        p9 p9Var = new p9(context);
        this.f20863b = p9Var;
        p9Var.setOnClickListener(new View.OnClickListener(this) {
            public final tf.f f20820b;

            {
                this.f20820b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f20820b.f20863b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f20820b.f44713f.K();
                        return;
                }
            }
        });
        a();
        k0Var.addView(p9Var, b6.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.f20864c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(j6.w0(null, j6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        k0Var.addView(textView, b6.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(j6.w0(null, j6.f20281y6, false));
        k0Var.addView(textView2, b6.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(z5.f(new float[]{8.0f}, j6.Oh));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(j6.w0(null, j6.Sh, false));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final tf.f f20820b;

            {
                this.f20820b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f20820b.f20863b.getImageReceiver().startAnimation();
                        return;
                    default:
                        this.f20820b.f44713f.K();
                        return;
                }
            }
        });
        k0Var.addView(textView3, b6.t(-1, -2, 49, 0, 18, 0, 0));
        addView(k0Var, b6.n(-1, -2));
        set(null);
    }
}
