package org.telegram.ui.web;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.s5;
import org.telegram.ui.tk;
import w7.x5;
public final class y1 extends FrameLayout {
    public final ImageView f43594a;
    public final TextView f43595b;
    public final tk f43596c;
    public s5 d;
    public String f43597e;
    public boolean f43598f;

    public y1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f43594a = imageView;
        addView(imageView, x5.a(32.0f, 16.0f, 0.0f, 0.0f, 0.0f, 32, 19));
        TextView textView = new TextView(context);
        this.f43595b = textView;
        textView.setTextColor(i6.x0(null, i6.G6, false));
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, x5.a(-2.0f, 68.0f, 7.0f, 54.0f, 0.0f, -1, 55));
        tk tkVar = new tk(this, context, 7);
        this.f43596c = tkVar;
        tkVar.setTextColor(i6.x0(null, i6.f21185y6, false));
        tkVar.setTextSize(1, 13.0f);
        tkVar.setMaxLines(1);
        tkVar.setEllipsize(truncateAt);
        tkVar.setPivotX(0.0f);
        addView(tkVar, x5.a(-2.0f, 68.0f, 30.0f, 54.0f, 0.0f, -1, 55));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        imageView2.setColorFilter(new PorterDuffColorFilter(i6.x0(null, i6.A6, false), PorterDuff.Mode.SRC_IN));
        addView(imageView2, x5.a(32.0f, 0.0f, 0.0f, 18.0f, 0.0f, 32, 21));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f43598f) {
            canvas.drawRect(AndroidUtilities.dp(64.0f), getHeight() - 1, getWidth(), getHeight(), i6.f20923k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
