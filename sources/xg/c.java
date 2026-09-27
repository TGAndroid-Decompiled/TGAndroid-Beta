package xg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.qk;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.voip.o;
import w7.y5;
public class c extends FrameLayout {
    public final e6 f46080a;
    public final ImageView f46081b;
    public final TextView f46082c;
    public Runnable d;
    public final h2 e;
    public final Paint f46083f;

    public c(Context context, e6 e6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        this.f46083f = new Paint(1);
        this.f46080a = e6Var;
        TextView textView = new TextView(context);
        this.f46082c = textView;
        qk.k(20.0f, 1, textView);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        int i11 = i6.f19164j5;
        textView.setTextColor(i6.v0(i11, e6Var));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            f7 = 16.0f;
        } else {
            f7 = 53.0f;
        }
        if (z10) {
            f10 = 53.0f;
        } else {
            f10 = 16.0f;
        }
        addView(textView, y5.d(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f46081b = imageView;
        h2 h2Var = new h2(false);
        this.e = h2Var;
        imageView.setImageDrawable(h2Var);
        h2Var.a(i6.v0(i11, e6Var));
        h2Var.b(i6.v0(i11, e6Var));
        h2Var.f18941k = 220.0f;
        addView(imageView, y5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new o(this, 14));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int v02 = i6.v0(i6.f19058d7, this.f46080a);
        Paint paint = this.f46083f;
        paint.setColor(v02);
        canvas.drawRect(0.0f, getHeight() - AndroidUtilities.getShadowHeight(), getWidth(), getHeight(), paint);
    }

    public int getHeaderHeight() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeaderHeight(), 1073741824));
    }

    public void setBackImage(int i10) {
        this.f46081b.setImageResource(i10);
    }

    public void setCloseImageVisible(boolean z10) {
        int i10;
        float f7;
        float f10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f46081b.setVisibility(i10);
        boolean z11 = LocaleController.isRTL;
        if (!z11 && z10) {
            f7 = 53.0f;
        } else {
            f7 = 22.0f;
        }
        if (z11 && z10) {
            f10 = 53.0f;
        } else {
            f10 = 22.0f;
        }
        this.f46082c.setLayoutParams(y5.d(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.d = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.f46082c.setText(charSequence);
    }
}
