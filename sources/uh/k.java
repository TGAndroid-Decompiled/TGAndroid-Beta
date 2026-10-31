package uh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import w7.b6;
public final class k extends LinearLayout {
    public final TextView f50256a;
    public final TextView f50257b;
    public boolean f50258c;

    public k(Context context) {
        super(context);
        int i10;
        setPadding(i0.L(22.0f), 0, i0.L(22.0f), 0);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f50256a = textView;
        textView.setTextSize(1, 16.0f);
        a7.V(textView, t6.f21037j5, null);
        if (cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        addView(textView, b6.t(-1, -2, 51, 0, 7, 0, 0));
        TextView textView2 = new TextView(context);
        this.f50257b = textView2;
        textView2.setTextSize(1, 13.0f);
        a7.V(textView2, t6.f21169q5, null);
        textView2.setGravity(cd.X ? 5 : 3);
        addView(textView2, b6.t(-1, -2, 51, 0, 4, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f50258c) {
            canvas.drawRect(getPaddingLeft(), getHeight() - 1, getWidth(), getHeight(), t6.f21052k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(i0.L(56.0f), 1073741824));
    }
}
