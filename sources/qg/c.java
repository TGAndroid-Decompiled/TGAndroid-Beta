package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import w7.b6;
public class c extends FrameLayout implements k6 {
    public int f45536a;
    public final p6 f45537b;
    public final ImageView f45538c;
    public final TextView d;
    public Runnable e;
    public final c2 f45539f;
    public final Paint h;

    public c(Context context, p6 p6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        this.h = new Paint(1);
        this.f45537b = p6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        a30.n(textView, 1, 20.0f);
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        int i11 = t6.f21038j5;
        a7.V(textView, i11, p6Var);
        boolean z10 = dd.X;
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
        addView(textView, b6.d(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f45538c = imageView;
        c2 c2Var = new c2(false);
        this.f45539f = c2Var;
        imageView.setImageDrawable(c2Var);
        int w02 = t6.w0(i11, p6Var);
        this.f45536a = w02;
        c2Var.a(w02);
        c2Var.b(t6.w0(i11, p6Var));
        c2Var.f20203k = 220.0f;
        addView(imageView, b6.d(24, 24.0f, (dd.X ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new ag.g(this, 28));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int w02 = t6.w0(t6.f20931d7, this.f45537b);
        Paint paint = this.h;
        paint.setColor(w02);
        canvas.drawRect(0.0f, getHeight() - i0.f1(), getWidth(), getHeight(), paint);
    }

    public int getHeaderHeight() {
        return i0.L(56.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeaderHeight(), 1073741824));
    }

    public void setBackImage(int i10) {
        this.f45538c.setImageResource(i10);
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
        this.f45538c.setVisibility(i10);
        boolean z11 = dd.X;
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
        this.d.setLayoutParams(b6.d(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.e = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        c2 c2Var = this.f45539f;
        if (c2Var != null) {
            try {
                int w02 = t6.w0(t6.f21038j5, this.f45537b);
                if (w02 != this.f45536a) {
                    this.f45536a = w02;
                    c2Var.a(w02);
                    c2Var.b(w02);
                    ImageView imageView = this.f45538c;
                    if (imageView != null) {
                        imageView.invalidate();
                    }
                }
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
