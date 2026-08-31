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
public final class w1 extends View {
    public final Paint f46215a;
    public final TextPaint f46216b;
    public final ArrayList f46217c;
    public float[] d;
    public w0 f46218e;
    public final y1 f46219f;

    public w1(y1 y1Var, Context context) {
        super(context);
        String str;
        String a2;
        int i10;
        int i11;
        this.f46219f = y1Var;
        Paint paint = new Paint(1);
        this.f46215a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f46216b = textPaint;
        paint.setColor(436207615);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        textPaint.setTextSize(AndroidUtilities.dpf2(21.3f));
        textPaint.setColor(-1);
        ArrayList arrayList = new ArrayList();
        this.f46217c = arrayList;
        setPadding(0, 0, 0, 0);
        if (y1Var.m0(4)) {
            u1 u1Var = new u1(this, 4, R.drawable.msg_limit_links, LocaleController.getString(R.string.StoryWidgetLink));
            i11 = ((org.telegram.ui.ActionBar.h3) y1Var).currentAccount;
            if (!UserConfig.getInstance(i11).isPremium()) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                u1Var.f46142j = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.l1(0.6f, -1), PorterDuff.Mode.SRC_IN));
                Paint paint2 = new Paint(1);
                u1Var.f46146n = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            arrayList.add(u1Var);
        }
        if (y1Var.m0(0)) {
            arrayList.add(new u1(this, 0, R.drawable.map_pin3, LocaleController.getString(R.string.StoryWidgetLocation)));
        }
        if (y1Var.m0(5)) {
            xa xaVar = ya.f46364b;
            u1[] u1VarArr = {null};
            StringBuilder sb = new StringBuilder();
            if (xaVar == null) {
                str = "🌤";
            } else {
                str = xaVar.f46310c;
            }
            sb.append(str);
            sb.append(" ");
            if (xaVar == null) {
                if (ya.b()) {
                    a2 = "24°C";
                } else {
                    a2 = "72°F";
                }
            } else {
                a2 = xaVar.a();
            }
            sb.append(a2);
            CharSequence replaceEmoji = Emoji.replaceEmoji(sb.toString(), textPaint.getFontMetricsInt(), false);
            i10 = ((org.telegram.ui.ActionBar.h3) y1Var).currentAccount;
            SpannableStringBuilder spannableStringBuilder = replaceEmoji;
            if (MessagesController.getInstance(i10).storyWeatherPreload) {
                spannableStringBuilder = replaceEmoji;
                spannableStringBuilder = replaceEmoji;
                if (ie0.f("android.permission.ACCESS_COARSE_LOCATION") && xaVar == null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("___");
                    spannableStringBuilder2.setSpan(new l90(AndroidUtilities.dp(68.0f), this), 0, spannableStringBuilder2.length(), 33);
                    u1VarArr[0] = new u1(this, spannableStringBuilder2);
                    ya.a(false, new org.telegram.ui.web.v1(2, this, u1VarArr));
                    spannableStringBuilder = spannableStringBuilder2;
                }
            }
            u1 u1Var2 = u1VarArr[0];
            arrayList.add(u1Var2 == null ? new u1(this, spannableStringBuilder) : u1Var2);
        }
        if (y1Var.m0(1)) {
            arrayList.add(new u1(this, 1, R.drawable.filled_widget_music, LocaleController.getString(R.string.StoryWidgetAudio)));
        }
        if (y1Var.m0(2)) {
            arrayList.add(new u1(this, 2, R.drawable.filled_premium_camera, LocaleController.getString(R.string.StoryWidgetPhoto)));
        }
        if (y1Var.m0(3)) {
            arrayList.add(new v1(this));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f46217c;
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
            t1 t1Var = (t1) obj;
            int i13 = t1Var.f46111e - 1;
            float[] fArr2 = this.d;
            float f10 = fArr2[i13];
            if (f10 > 0.0f) {
                fArr2[i13] = f10 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i13] = fArr3[i13] + t1Var.h.d(t1Var.f46109b, false);
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            t1 t1Var2 = (t1) obj2;
            t1Var2.a(canvas, e2.c.x((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), this.d[t1Var2.f46111e - 1], 2.0f, getPaddingLeft()) + t1Var2.d, org.telegram.messenger.y3.D(48.0f, t1Var2.f46111e - 1, AndroidUtilities.dp(12.0f)));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ArrayList arrayList = this.f46217c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((t1) obj).b(true);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.f46217c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((t1) obj).b(false);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        ArrayList arrayList = this.f46217c;
        int size2 = arrayList.size();
        int i12 = 0;
        int i13 = 1;
        float f10 = 0.0f;
        int i14 = 0;
        while (i14 < size2) {
            Object obj = arrayList.get(i14);
            i14++;
            t1 t1Var = (t1) obj;
            t1Var.d = f10;
            float dp = t1Var.f46109b + AndroidUtilities.dp(10.0f) + f10;
            if (dp > paddingLeft) {
                i13++;
                t1Var.d = 0.0f;
                f10 = t1Var.f46109b + AndroidUtilities.dp(10.0f) + 0.0f;
            } else {
                f10 = dp;
            }
            t1Var.f46111e = i13;
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
            t1 t1Var2 = (t1) obj2;
            int i15 = t1Var2.f46111e - 1;
            float[] fArr2 = this.d;
            float f11 = fArr2[i15];
            if (f11 > 0.0f) {
                fArr2[i15] = f11 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i15] = fArr3[i15] + t1Var2.f46109b;
        }
        setMeasuredDimension(size, org.telegram.messenger.y3.D(12.0f, i13 - 1, org.telegram.messenger.y3.D(36.0f, i13, AndroidUtilities.dp(24.0f))));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        t1 t1Var;
        w0 w0Var;
        boolean z4;
        ArrayList arrayList = this.f46217c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                t1Var = (t1) obj;
                if (t1Var.f46112f.contains(motionEvent.getX(), motionEvent.getY())) {
                    break;
                }
            } else {
                t1Var = null;
                break;
            }
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            t1 t1Var2 = (t1) obj2;
            if (t1Var2 != t1Var) {
                t1Var2.f46113g.c(false);
            }
        }
        if (t1Var != null) {
            rc rcVar = t1Var.f46113g;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                z4 = true;
            } else {
                z4 = false;
            }
            rcVar.c(z4);
        }
        if (motionEvent.getAction() == 1 && t1Var != null && (w0Var = this.f46218e) != null) {
            w0Var.run(Integer.valueOf(t1Var.f46108a));
        }
        if (t1Var == null) {
            return false;
        }
        return true;
    }
}
