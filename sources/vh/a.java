package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.dd;
import org.telegram.messenger.ff;
import org.telegram.messenger.jc;
import org.telegram.ui.Components.eq;
public final class a extends View implements org.telegram.ui.ActionBar.k6 {
    public final ImageReceiver f50896a;
    public final String f50897b;
    public final String f50898c;
    public final TextPaint d;
    public StaticLayout e;
    public float f50899f;
    public float h;
    public final TextPaint f50900n;
    public StaticLayout f50901r;
    public float f50902s;
    public float f50903w;
    public final org.telegram.ui.ActionBar.p6 f50904x;

    public a(Context context, ff ffVar, String str, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        String str2;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f50896a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f50900n = textPaint2;
        this.f50904x = p6Var;
        setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        setBackground(org.telegram.ui.ActionBar.t6.N0(false));
        setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
        setLayoutParams(new LinearLayout.LayoutParams(-1, 48));
        int i11 = org.telegram.ui.ActionBar.t6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
        textPaint2.setColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        textPaint2.setAlpha(102);
        textPaint2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        String str3 = "";
        String str4 = "" + ((Object) str);
        this.f50897b = str4;
        this.f50898c = i0.a.i(i10, "");
        imageReceiver.J0(org.telegram.messenger.i0.L(4.0f));
        Drawable mutate = context.getResources().getDrawable(2131232219).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, PorterDuff.Mode.MULTIPLY));
        eq eqVar = new eq(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(6.0f), -13750737), mutate);
        eqVar.f25909x = false;
        int L = org.telegram.messenger.i0.L(18.0f);
        int L2 = org.telegram.messenger.i0.L(18.0f);
        eqVar.e = L;
        eqVar.f25904f = L2;
        if (ffVar != null && (str2 = ffVar.f14604c) != null) {
            imageReceiver.s0(jc.g(str2), "30.0_30.0", null, null, eqVar, null, 0);
        } else {
            if (ffVar != null) {
                int i12 = ffVar.C;
                String str5 = ffVar.I;
                if (str5 != null) {
                    if (ffVar.f14603b) {
                        imageReceiver.s0(jc.g("vthumb://" + i12 + ":" + str5), "30.0_30.0", null, null, eqVar, null, 0);
                    } else {
                        imageReceiver.s0(jc.g("thumb://" + i12 + ":" + str5), "30.0_30.0", null, null, eqVar, null, 0);
                    }
                }
            }
            imageReceiver.w0(eqVar);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) str4);
        if (i10 > 0) {
            str3 = " " + dd.H(',', "Media", i10);
        }
        sb2.append(str3);
        setContentDescription(sb2.toString());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float paddingLeft = getPaddingLeft();
        ImageReceiver imageReceiver = this.f50896a;
        imageReceiver.y0(paddingLeft, (getMeasuredHeight() - org.telegram.messenger.i0.L(30.0f)) / 2.0f, org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(30.0f));
        imageReceiver.h(canvas, null);
        float L = paddingLeft + org.telegram.messenger.i0.L(30.0f) + org.telegram.messenger.i0.L(12.0f);
        if (this.e != null) {
            canvas.save();
            canvas.translate(L - this.h, (getMeasuredHeight() - this.e.getHeight()) / 2.0f);
            this.e.draw(canvas);
            L = L + this.f50899f + org.telegram.messenger.i0.L(6.0f);
            canvas.restore();
        }
        if (this.f50901r != null) {
            canvas.save();
            canvas.translate(L - this.f50903w, org.telegram.messenger.i0.N(1.6f) + ((getMeasuredHeight() - this.f50901r.getHeight()) / 2.0f));
            this.f50901r.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50896a.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50896a.R();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        float f10;
        float f11;
        int size = (((View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(30.0f)) - org.telegram.messenger.i0.L(12.0f)) - getPaddingLeft()) - getPaddingRight();
        StaticLayout staticLayout = this.e;
        if (staticLayout == null || staticLayout.getWidth() != size) {
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            String str = this.f50897b;
            TextPaint textPaint = this.d;
            CharSequence ellipsize = TextUtils.ellipsize(str, textPaint, size, truncateAt);
            int max = Math.max(0, size);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout2 = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
            this.e = staticLayout2;
            int lineCount = staticLayout2.getLineCount();
            float f12 = 0.0f;
            if (lineCount > 0) {
                f7 = this.e.getLineLeft(0);
            } else {
                f7 = 0.0f;
            }
            this.h = f7;
            if (this.e.getLineCount() > 0) {
                f10 = this.e.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.f50899f = f10;
            int L = size - ((int) (f10 + org.telegram.messenger.i0.L(8.0f)));
            TextPaint textPaint2 = this.f50900n;
            StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(this.f50898c, textPaint2, L, truncateAt), textPaint2, Math.max(0, L), alignment, 1.0f, 0.0f, false);
            this.f50901r = staticLayout3;
            if (staticLayout3.getLineCount() > 0) {
                f11 = this.f50901r.getLineLeft(0);
            } else {
                f11 = 0.0f;
            }
            this.f50903w = f11;
            if (this.f50901r.getLineCount() > 0) {
                f12 = this.f50901r.getLineWidth(0);
            }
            this.f50902s = f12;
        }
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension((int) Math.min(org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.L(30.0f) + getPaddingLeft() + this.f50899f + org.telegram.messenger.i0.L(8.0f) + this.f50902s + getPaddingRight(), View.MeasureSpec.getSize(i10)), org.telegram.messenger.i0.L(48.0f));
        } else if (View.MeasureSpec.getMode(i10) == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(48.0f));
        }
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = this.f50900n;
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, this.f50904x);
            this.d.setColor(w02);
            textPaint.setColor(w02);
            textPaint.setAlpha(102);
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
