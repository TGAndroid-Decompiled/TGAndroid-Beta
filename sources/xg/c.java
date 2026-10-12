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
import org.telegram.messenger.am;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.voip.o;
import w7.w5;
public class c extends FrameLayout {
    public final c6 f51362a;
    public final ImageView f51363b;
    public final TextView f51364c;
    public Runnable d;
    public final f2 f51365e;
    public final Paint f51366f;

    public c(Context context, c6 c6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        this.f51366f = new Paint(1);
        this.f51362a = c6Var;
        TextView textView = new TextView(context);
        this.f51364c = textView;
        am.k(20.0f, 1, textView);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        int i11 = h6.f20668j5;
        textView.setTextColor(h6.w0(i11, c6Var));
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
        addView(textView, w5.a(-2.0f, f7, 0.0f, f10, 0.0f, -1, 23));
        ImageView imageView = new ImageView(context);
        this.f51363b = imageView;
        f2 f2Var = new f2(false);
        this.f51365e = f2Var;
        imageView.setImageDrawable(f2Var);
        f2Var.a(h6.w0(i11, c6Var));
        f2Var.b(h6.w0(i11, c6Var));
        f2Var.f20389k = 220.0f;
        addView(imageView, w5.a(24.0f, 16.0f, 0.0f, 16.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 16));
        imageView.setOnClickListener(new o(this, 14));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int w02 = h6.w0(h6.f20561d7, this.f51362a);
        Paint paint = this.f51366f;
        paint.setColor(w02);
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
        this.f51363b.setImageResource(i10);
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
        this.f51363b.setVisibility(i10);
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
        this.f51364c.setLayoutParams(w5.a(-2.0f, f7, 0.0f, f10, 0.0f, -1, 23));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.d = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.f51364c.setText(charSequence);
    }
}
