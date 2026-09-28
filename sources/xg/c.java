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
import org.telegram.messenger.ok;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.voip.o;
import w7.y5;
public class c extends FrameLayout {
    public final d6 f46034a;
    public final ImageView f46035b;
    public final TextView f46036c;
    public Runnable d;
    public final f2 e;
    public final Paint f46037f;

    public c(Context context, d6 d6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        this.f46037f = new Paint(1);
        this.f46034a = d6Var;
        TextView textView = new TextView(context);
        this.f46036c = textView;
        ok.k(20.0f, 1, textView);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        int i11 = h6.f19165j5;
        textView.setTextColor(h6.v0(i11, d6Var));
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
        this.f46035b = imageView;
        f2 f2Var = new f2(false);
        this.e = f2Var;
        imageView.setImageDrawable(f2Var);
        f2Var.a(h6.v0(i11, d6Var));
        f2Var.b(h6.v0(i11, d6Var));
        f2Var.f18875k = 220.0f;
        addView(imageView, y5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new o(this, 14));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int v02 = h6.v0(h6.f19060d7, this.f46034a);
        Paint paint = this.f46037f;
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
        this.f46035b.setImageResource(i10);
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
        this.f46035b.setVisibility(i10);
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
        this.f46036c.setLayoutParams(y5.d(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.d = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.f46036c.setText(charSequence);
    }
}
