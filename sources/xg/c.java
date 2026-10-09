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
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.voip.o;
import w7.x5;
public class c extends FrameLayout {
    public final e6 f51124a;
    public final ImageView f51125b;
    public final TextView f51126c;
    public Runnable d;
    public final g2 f51127e;
    public final Paint f51128f;

    public c(Context context, e6 e6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        this.f51128f = new Paint(1);
        this.f51124a = e6Var;
        TextView textView = new TextView(context);
        this.f51126c = textView;
        bi.k(20.0f, 1, textView);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        int i11 = i6.f20905j5;
        textView.setTextColor(i6.w0(i11, e6Var));
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
        addView(textView, x5.a(-2.0f, f7, 0.0f, f10, 0.0f, -1, 23));
        ImageView imageView = new ImageView(context);
        this.f51125b = imageView;
        g2 g2Var = new g2(false);
        this.f51127e = g2Var;
        imageView.setImageDrawable(g2Var);
        g2Var.a(i6.w0(i11, e6Var));
        g2Var.b(i6.w0(i11, e6Var));
        g2Var.f20640k = 220.0f;
        addView(imageView, x5.a(24.0f, 16.0f, 0.0f, 16.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 16));
        imageView.setOnClickListener(new o(this, 14));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int w02 = i6.w0(i6.f20798d7, this.f51124a);
        Paint paint = this.f51128f;
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
        this.f51125b.setImageResource(i10);
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
        this.f51125b.setVisibility(i10);
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
        this.f51126c.setLayoutParams(x5.a(-2.0f, f7, 0.0f, f10, 0.0f, -1, 23));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.d = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.f51126c.setText(charSequence);
    }
}
