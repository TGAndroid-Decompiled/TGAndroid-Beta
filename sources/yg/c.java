package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import hg.r0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.kk;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import w7.z5;
public class c extends FrameLayout {
    public final d6 f50135a;
    public final ImageView f50136b;
    public final TextView f50137c;
    public Runnable d;
    public final g2 e;
    public final Paint f50138f;

    public c(Context context, d6 d6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        this.f50138f = new Paint(1);
        this.f50135a = d6Var;
        TextView textView = new TextView(context);
        this.f50137c = textView;
        kk.k(20.0f, 1, textView);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        int i11 = h6.f21093j5;
        textView.setTextColor(h6.w0(i11, d6Var));
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
        addView(textView, z5.d(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f50136b = imageView;
        g2 g2Var = new g2(false);
        this.e = g2Var;
        imageView.setImageDrawable(g2Var);
        g2Var.a(h6.w0(i11, d6Var));
        g2Var.b(h6.w0(i11, d6Var));
        g2Var.f20865k = 220.0f;
        addView(imageView, z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new r0(this, 25));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int w02 = h6.w0(h6.f20988d7, this.f50135a);
        Paint paint = this.f50138f;
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
        this.f50136b.setImageResource(i10);
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
        this.f50136b.setVisibility(i10);
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
        this.f50137c.setLayoutParams(z5.d(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.d = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.f50137c.setText(charSequence);
    }
}
