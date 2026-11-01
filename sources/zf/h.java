package zf;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.e20;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Components.g9;
import w7.b6;
public final class h extends f3 {
    public final m f55528f;

    public h(m mVar, Context context) {
        super(context);
        this.f55528f = mVar;
        this.f21892a = e20.f15506s0;
        setOrientation(1);
        a7.i(t6.f20873a7, this, null);
        jg.d0 d0Var = new jg.d0(context, 3);
        d0Var.f9918c = new Path();
        Paint paint = new Paint(1);
        d0Var.f9917b = paint;
        paint.setColor(t6.x0(null, t6.f20930d6, false));
        paint.setShadowLayer(org.telegram.messenger.i0.L(1.33f), 0.0f, org.telegram.messenger.i0.L(0.33f), 503316480);
        d0Var.setWillNotDraw(false);
        d0Var.setOrientation(1);
        d0Var.setPadding(org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(32.0f));
        g9 g9Var = new g9(context);
        this.f21893b = g9Var;
        g9Var.setOnClickListener(new View.OnClickListener(this) {
            public final zf.h f21848b;

            {
                this.f21848b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f21848b.f21893b.getImageReceiver().P0(false);
                        return;
                    default:
                        this.f21848b.f55528f.L();
                        return;
                }
            }
        });
        a();
        d0Var.addView(g9Var, b6.r(130, 130, 49));
        TextView textView = new TextView(context);
        this.f21894c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        a7.V(textView, t6.G6, null);
        textView.setTypeface(org.telegram.messenger.i0.o());
        d0Var.addView(textView, b6.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        a7.V(textView2, t6.f21312y6, null);
        d0Var.addView(textView2, b6.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(j6.f(t6.Ci, 8.0f));
        textView3.setTextSize(1, 14.0f);
        a7.V(textView3, t6.Gi, null);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final zf.h f21848b;

            {
                this.f21848b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f21848b.f21893b.getImageReceiver().P0(false);
                        return;
                    default:
                        this.f21848b.f55528f.L();
                        return;
                }
            }
        });
        d0Var.addView(textView3, b6.t(-1, -2, 49, 0, 18, 0, 0));
        addView(d0Var, b6.o(-1, -2));
        set(null);
    }
}
