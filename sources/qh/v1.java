package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.rc;
public final class v1 extends View {
    public final Paint f46198a;
    public final TextPaint f46199b;
    public final ArrayList f46200c;
    public float[] d;
    public w0 f46201e;
    public final x1 f46202f;

    public v1(x1 x1Var, Context context) {
        super(context);
        String str;
        String a2;
        int i10;
        int i11;
        this.f46202f = x1Var;
        Paint paint = new Paint(1);
        this.f46198a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f46199b = textPaint;
        paint.setColor(436207615);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        textPaint.setTextSize(AndroidUtilities.dpf2(21.3f));
        textPaint.setColor(-1);
        ArrayList arrayList = new ArrayList();
        this.f46200c = arrayList;
        setPadding(0, 0, 0, 0);
        if (x1Var.m0(4)) {
            t1 t1Var = new t1(this, 4, R.drawable.msg_limit_links, LocaleController.getString(R.string.StoryWidgetLink));
            i11 = ((org.telegram.ui.ActionBar.h3) x1Var).currentAccount;
            if (!UserConfig.getInstance(i11).isPremium()) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                t1Var.f46122j = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.l1(0.6f, -1), PorterDuff.Mode.SRC_IN));
                Paint paint2 = new Paint(1);
                t1Var.f46126n = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            arrayList.add(t1Var);
        }
        if (x1Var.m0(0)) {
            arrayList.add(new t1(this, 0, R.drawable.map_pin3, LocaleController.getString(R.string.StoryWidgetLocation)));
        }
        if (x1Var.m0(5)) {
            wa waVar = xa.f46320b;
            t1[] t1VarArr = {null};
            StringBuilder sb = new StringBuilder();
            if (waVar == null) {
                str = "🌤";
            } else {
                str = waVar.f46283c;
            }
            sb.append(str);
            sb.append(" ");
            if (waVar == null) {
                if (xa.b()) {
                    a2 = "24°C";
                } else {
                    a2 = "72°F";
                }
            } else {
                a2 = waVar.a();
            }
            sb.append(a2);
            CharSequence replaceEmoji = Emoji.replaceEmoji(sb.toString(), textPaint.getFontMetricsInt(), false);
            i10 = ((org.telegram.ui.ActionBar.h3) x1Var).currentAccount;
            SpannableStringBuilder spannableStringBuilder = replaceEmoji;
            if (MessagesController.getInstance(i10).storyWeatherPreload) {
                spannableStringBuilder = replaceEmoji;
                spannableStringBuilder = replaceEmoji;
                if (ie0.f("android.permission.ACCESS_COARSE_LOCATION") && waVar == null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("___");
                    spannableStringBuilder2.setSpan(new l90(AndroidUtilities.dp(68.0f), this), 0, spannableStringBuilder2.length(), 33);
                    t1VarArr[0] = new t1(this, spannableStringBuilder2);
                    xa.a(false, new org.telegram.ui.web.a2(1, this, t1VarArr));
                    spannableStringBuilder = spannableStringBuilder2;
                }
            }
            t1 t1Var2 = t1VarArr[0];
            arrayList.add(t1Var2 == null ? new t1(this, spannableStringBuilder) : t1Var2);
        }
        if (x1Var.m0(1)) {
            arrayList.add(new t1(this, 1, R.drawable.filled_widget_music, LocaleController.getString(R.string.StoryWidgetAudio)));
        }
        if (x1Var.m0(2)) {
            arrayList.add(new t1(this, 2, R.drawable.filled_premium_camera, LocaleController.getString(R.string.StoryWidgetPhoto)));
        }
        if (x1Var.m0(3)) {
            arrayList.add(new u1(this));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f46200c;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                float[] fArr = this.d;
                if (i11 >= fArr.length) {
                    break;
                }
                fArr[i11] = 0.0f;
                i11++;
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            s1 s1Var = (s1) obj;
            int i13 = s1Var.f46091e - 1;
            float[] fArr2 = this.d;
            float f10 = fArr2[i13];
            if (f10 > 0.0f) {
                fArr2[i13] = f10 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i13] = fArr3[i13] + s1Var.h.d(s1Var.f46089b, false);
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            s1 s1Var2 = (s1) obj2;
            s1Var2.a(canvas, e2.c.x((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), this.d[s1Var2.f46091e - 1], 2.0f, getPaddingLeft()) + s1Var2.d, org.telegram.messenger.y3.D(48.0f, s1Var2.f46091e - 1, AndroidUtilities.dp(12.0f)));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ArrayList arrayList = this.f46200c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((s1) obj).b(true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.f46200c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((s1) obj).b(false);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        ArrayList arrayList = this.f46200c;
        int size2 = arrayList.size();
        int i12 = 0;
        int i13 = 1;
        float f10 = 0.0f;
        int i14 = 0;
        while (i14 < size2) {
            Object obj = arrayList.get(i14);
            i14++;
            s1 s1Var = (s1) obj;
            s1Var.d = f10;
            float dp = s1Var.f46089b + AndroidUtilities.dp(10.0f) + f10;
            if (dp > paddingLeft) {
                i13++;
                s1Var.d = 0.0f;
                f10 = s1Var.f46089b + AndroidUtilities.dp(10.0f) + 0.0f;
            } else {
                f10 = dp;
            }
            s1Var.f46091e = i13;
        }
        float[] fArr = this.d;
        if (fArr != null && fArr.length == i13) {
            Arrays.fill(fArr, 0.0f);
        } else {
            this.d = new float[i13];
        }
        int size3 = arrayList.size();
        while (i12 < size3) {
            Object obj2 = arrayList.get(i12);
            i12++;
            s1 s1Var2 = (s1) obj2;
            int i15 = s1Var2.f46091e - 1;
            float[] fArr2 = this.d;
            float f11 = fArr2[i15];
            if (f11 > 0.0f) {
                fArr2[i15] = f11 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i15] = fArr3[i15] + s1Var2.f46089b;
        }
        setMeasuredDimension(size, org.telegram.messenger.y3.D(12.0f, i13 - 1, org.telegram.messenger.y3.D(36.0f, i13, AndroidUtilities.dp(24.0f))));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s1 s1Var;
        w0 w0Var;
        boolean z4;
        ArrayList arrayList = this.f46200c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                s1Var = (s1) obj;
                if (s1Var.f46092f.contains(motionEvent.getX(), motionEvent.getY())) {
                    break;
                }
            } else {
                s1Var = null;
                break;
            }
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            s1 s1Var2 = (s1) obj2;
            if (s1Var2 != s1Var) {
                s1Var2.f46093g.c(false);
            }
        }
        if (s1Var != null) {
            rc rcVar = s1Var.f46093g;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                z4 = true;
            } else {
                z4 = false;
            }
            rcVar.c(z4);
        }
        if (motionEvent.getAction() == 1 && s1Var != null && (w0Var = this.f46201e) != null) {
            w0Var.run(Integer.valueOf(s1Var.f46088a));
        }
        if (s1Var == null) {
            return false;
        }
        return true;
    }
}
