package org.telegram.ui.web;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.t5;
import org.telegram.ui.ok;
public final class x1 extends FrameLayout implements p6 {
    public final ImageView f44963a;
    public final TextView f44964b;
    public final ok f44965c;
    public t5 d;
    public String e;
    public boolean f44966f;
    public ShapeDrawable h;

    public x1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f44963a = imageView;
        addView(imageView, kb1.h(32, 32.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f44964b = textView;
        f7.V(textView, y6.G6, null);
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, kb1.h(-1, -2.0f, 55, 68.0f, 7.0f, 54.0f, 0.0f));
        ok okVar = new ok(this, context, 8);
        this.f44965c = okVar;
        f7.V(okVar, y6.f23749y6, null);
        okVar.setTextSize(1, 13.0f);
        okVar.setMaxLines(1);
        okVar.setEllipsize(truncateAt);
        okVar.setPivotX(0.0f);
        addView(okVar, kb1.h(-1, -2.0f, 55, 68.0f, 30.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        f7.t(imageView2, y6.A6, null, PorterDuff.Mode.SRC_IN);
        addView(imageView2, kb1.h(32, 32.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f44966f) {
            canvas.drawRect(AndroidUtilities.dp(64.0f), getHeight() - 1, getWidth(), getHeight(), y6.f23479k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.h;
            if (shapeDrawable != null) {
                y6.z1(y6.o1(0.1f, y6.x0(null, y6.G6, false)), shapeDrawable);
                ImageView imageView = this.f44963a;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
