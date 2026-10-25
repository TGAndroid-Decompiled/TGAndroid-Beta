package zg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ig.d0;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.vh;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
public class c extends FrameLayout implements p6 {
    public int f52858a;
    public final u6 f52859b;
    public final ImageView f52860c;
    public final TextView d;
    public Runnable e;
    public final j2 f52861f;
    public final Paint h;

    public c(Context context, u6 u6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        this.h = new Paint(1);
        this.f52859b = u6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        vh.j(20.0f, 1, textView);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        int i11 = y6.f23462j5;
        f7.V(textView, i11, u6Var);
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
        addView(textView, gb1.h(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f52860c = imageView;
        j2 j2Var = new j2(false);
        this.f52861f = j2Var;
        imageView.setImageDrawable(j2Var);
        int w02 = y6.w0(i11, u6Var);
        this.f52858a = w02;
        j2Var.a(w02);
        j2Var.b(y6.w0(i11, u6Var));
        j2Var.f22736k = 220.0f;
        addView(imageView, gb1.h(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new d0(this, 26));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int w02 = y6.w0(y6.f23355d7, this.f52859b);
        Paint paint = this.h;
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
        this.f52860c.setImageResource(i10);
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
        this.f52860c.setVisibility(i10);
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
        this.d.setLayoutParams(gb1.h(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.e = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        j2 j2Var = this.f52861f;
        if (j2Var != null) {
            try {
                int w02 = y6.w0(y6.f23462j5, this.f52859b);
                if (w02 != this.f52858a) {
                    this.f52858a = w02;
                    j2Var.a(w02);
                    j2Var.b(w02);
                    ImageView imageView = this.f52860c;
                    if (imageView != null) {
                        imageView.invalidate();
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
