package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.i2;
import org.telegram.ui.ActionBar.j6;
import w7.a6;
public class c extends FrameLayout {
    public final f6 f43985a;
    public final ImageView f43986b;
    public final TextView f43987c;
    public Runnable d;
    public final i2 e;
    public final Paint f43988f;

    public c(Context context, f6 f6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        this.f43988f = new Paint(1);
        this.f43985a = f6Var;
        TextView textView = new TextView(context);
        this.f43987c = textView;
        em.j(20.0f, 1, textView);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        int i11 = j6.f18034j5;
        textView.setTextColor(j6.v0(i11, f6Var));
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
        addView(textView, a6.d(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f43986b = imageView;
        i2 i2Var = new i2(false);
        this.e = i2Var;
        imageView.setImageDrawable(i2Var);
        i2Var.a(j6.v0(i11, f6Var));
        i2Var.b(j6.v0(i11, f6Var));
        i2Var.f17826k = 220.0f;
        addView(imageView, a6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new org.telegram.ui.web.c(this, 9));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int v02 = j6.v0(j6.f17929d7, this.f43985a);
        Paint paint = this.f43988f;
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
        this.f43986b.setImageResource(i10);
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
        this.f43986b.setVisibility(i10);
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
        this.f43987c.setLayoutParams(a6.d(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.d = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.f43987c.setText(charSequence);
    }
}
