package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ji.o4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.yh;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g6;
import w7.a6;
public class c extends FrameLayout {
    public final c6 f48751a;
    public final ImageView f48752b;
    public final TextView f48753c;
    public Runnable d;
    public final f2 e;
    public final Paint f48754f;

    public c(Context context, c6 c6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        this.f48754f = new Paint(1);
        this.f48751a = c6Var;
        TextView textView = new TextView(context);
        this.f48753c = textView;
        yh.k(20.0f, 1, textView);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        int i11 = g6.f20007j5;
        textView.setTextColor(g6.w0(i11, c6Var));
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
        addView(textView, a6.a(-2.0f, f7, 0.0f, f10, 0.0f, -1, 23));
        ImageView imageView = new ImageView(context);
        this.f48752b = imageView;
        f2 f2Var = new f2(false);
        this.e = f2Var;
        imageView.setImageDrawable(f2Var);
        f2Var.a(g6.w0(i11, c6Var));
        f2Var.b(g6.w0(i11, c6Var));
        f2Var.f19781k = 220.0f;
        addView(imageView, a6.a(24.0f, 16.0f, 0.0f, 16.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 16));
        imageView.setOnClickListener(new o4(this, 15));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int w02 = g6.w0(g6.f19902d7, this.f48751a);
        Paint paint = this.f48754f;
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
        this.f48752b.setImageResource(i10);
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
        this.f48752b.setVisibility(i10);
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
        this.f48753c.setLayoutParams(a6.a(-2.0f, f7, 0.0f, f10, 0.0f, -1, 23));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.d = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.f48753c.setText(charSequence);
    }
}
