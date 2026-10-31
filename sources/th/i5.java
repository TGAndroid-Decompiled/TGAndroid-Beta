package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.bi0;
public final class i5 extends FrameLayout {
    public final ArrayList f49065a;
    public ValueAnimator f49066b;
    public int f49067c;
    public int d;
    public final sg.v e;

    public i5(Context context, c7 c7Var) {
        super(context);
        this.f49067c = -1;
        int i10 = 0;
        this.d = 0;
        this.e = new sg.v(this, 14);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(imageView, -1, -1);
        View view = new View(context);
        view.setBackgroundColor(1677721600);
        addView(view, -1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.i0.L(48.0f), 0, org.telegram.messenger.i0.L(48.0f));
        linearLayout.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(cd.L0(2131744781, null));
        textView.setTextSize(1, 20.0f);
        linearLayout.addView(textView, w7.b6.o(-2, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(-1761607681);
        textView2.setText(cd.L0(2131744778, null));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        linearLayout.addView(textView2, w7.b6.k(68.0f, 8.0f, 68.0f, 36.0f, -2, -2));
        ArrayList arrayList = new ArrayList(4);
        this.f49065a = arrayList;
        arrayList.add(new h5(context, 2131624230, cd.L0(2131744785, null), cd.L0(2131744784, null)));
        arrayList.add(new h5(context, 2131624232, cd.L0(2131744780, null), cd.L0(2131744779, null)));
        arrayList.add(new h5(context, 2131624229, cd.L0(2131744787, null), cd.L0(2131744786, null)));
        arrayList.add(new h5(context, 2131624231, cd.L0(2131744783, null), cd.L0(2131744782, null)));
        int measuredWidth = c7Var.getMeasuredWidth() - org.telegram.messenger.i0.L(100.0f);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            h5 h5Var = (h5) obj;
            TextPaint textPaint = h5Var.e;
            String str = h5Var.f49025a;
            int length = str.length();
            Rect rect = h5Var.f49030r;
            textPaint.getTextBounds(str, 0, length, rect);
            int width = rect.width();
            TextPaint textPaint2 = h5Var.f49028f;
            String str2 = h5Var.f49026b;
            textPaint2.getTextBounds(str2, 0, str2.length(), rect);
            int max = Math.max(width, rect.width()) + org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.L(88.0f);
            if (max > measuredWidth) {
                measuredWidth = max;
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(org.telegram.messenger.i0.L(8.0f) + measuredWidth > c7Var.getMeasuredWidth() ? c7Var.getMeasuredWidth() - org.telegram.messenger.i0.L(8.0f) : measuredWidth, org.telegram.messenger.i0.L(64.0f));
        layoutParams.setMargins(0, org.telegram.messenger.i0.L(5.0f), 0, org.telegram.messenger.i0.L(5.0f));
        ArrayList arrayList2 = this.f49065a;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            linearLayout.addView((h5) obj2, layoutParams);
        }
        TextView textView3 = new TextView(context);
        textView3.setTextColor(-1);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setText(cd.L0(2131744788, null));
        textView3.setTextSize(1, 14.0f);
        linearLayout.addView(textView3, w7.b6.k(0.0f, 73.0f, 0.0f, 0.0f, -2, -2));
        addView(linearLayout, w7.b6.e(-1, -2, 17));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), org.telegram.messenger.i0.j2(12.0f, 10, c7Var));
        bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-587202560, PorterDuff.Mode.DST_OVER));
        imageView.setImageDrawable(bitmapDrawable);
        getViewTreeObserver().addOnGlobalLayoutListener(new g5(this, textView3, c7Var, textView2));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.f49066b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f49066b = ofFloat;
        if (z10) {
            ofFloat.setStartDelay(50L);
        }
        this.f49066b.setDuration(350L);
        this.f49066b.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f49066b.getCurrentPlayTime();
        this.f49066b.addListener(new sg.r(this, 11));
        this.f49066b.addUpdateListener(new qh.e0(this, 21));
        this.f49066b.start();
        org.telegram.messenger.i0.h3(this.e, (((h5) this.f49065a.get(this.d)).f49027c.r() * 2) + 100);
    }

    public final void b() {
        org.telegram.messenger.i0.r(this.e);
        ValueAnimator valueAnimator = this.f49066b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f49066b = null;
        }
        int i10 = this.f49067c;
        ArrayList arrayList = this.f49065a;
        if (i10 != -1) {
            h5 h5Var = (h5) arrayList.get(i10);
            bi0 bi0Var = h5Var.f49027c;
            bi0Var.M(0);
            bi0Var.stop();
            h5Var.f49029n = 0.0f;
            h5Var.invalidate();
        }
        h5 h5Var2 = (h5) arrayList.get(this.d);
        bi0 bi0Var2 = h5Var2.f49027c;
        bi0Var2.M(0);
        bi0Var2.stop();
        h5Var2.f49029n = 0.0f;
        h5Var2.invalidate();
        c();
    }

    public final void c() {
        int i10 = this.d + 1;
        this.d = i10;
        ArrayList arrayList = this.f49065a;
        if (i10 >= arrayList.size()) {
            this.d = 0;
        }
        int i11 = this.f49067c + 1;
        this.f49067c = i11;
        if (i11 >= arrayList.size()) {
            this.f49067c = 0;
        }
    }
}
