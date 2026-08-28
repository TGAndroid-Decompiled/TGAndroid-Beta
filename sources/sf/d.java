package sf;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import gh.oa;
import j3.r0;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.ui.fe;
public final class d {
    public final long[] f47529a;
    public final CharSequence[] f47530b;
    public final CharSequence[] f47531c;
    public final StaticLayout[] d;
    public final StaticLayout[] f47532e;
    public int f47533f;
    public int f47534g;
    public DecimalFormat h;

    public d(long r25, long r27, boolean r29, float r30, int r31, android.text.TextPaint r32, android.text.TextPaint r33) {
        throw new UnsupportedOperationException("Method not decompiled: sf.d.<init>(long, long, boolean, float, int, android.text.TextPaint, android.text.TextPaint):void");
    }

    public final void a(Canvas canvas, int i9, int i10, float f10, float f11, TextPaint textPaint) {
        StaticLayout[] staticLayoutArr;
        CharSequence[] charSequenceArr;
        StaticLayout[] staticLayoutArr2 = this.f47532e;
        StaticLayout[] staticLayoutArr3 = this.d;
        if (i9 == 0) {
            staticLayoutArr = staticLayoutArr3;
        } else {
            staticLayoutArr = staticLayoutArr2;
        }
        StaticLayout staticLayout = staticLayoutArr[i10];
        if (staticLayout == null) {
            if (i9 == 0) {
                charSequenceArr = this.f47530b;
            } else {
                charSequenceArr = this.f47531c;
            }
            CharSequence charSequence = charSequenceArr[i10];
            if (i9 == 0) {
                staticLayoutArr2 = staticLayoutArr3;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            staticLayoutArr2[i10] = staticLayout2;
            staticLayout = staticLayout2;
        }
        canvas.save();
        canvas.translate(f10, textPaint.ascent() + f11);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    public final CharSequence b(int i9, TextPaint textPaint, long j10, int i10) {
        int i11 = 2;
        if (i10 == 1) {
            if (i9 == 1) {
                return "≈" + BillingController.getInstance().formatCurrency(j10, "USD");
            }
            if (this.h == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                this.h = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                this.h.setMaximumFractionDigits(6);
                this.h.setGroupingUsed(false);
            }
            DecimalFormat decimalFormat2 = this.h;
            if (j10 <= 1000000000) {
                i11 = 6;
            }
            decimalFormat2.setMaximumFractionDigits(i11);
            return fe.f0("TON " + this.h.format(j10 / 1.0E9d), textPaint, 0.8f, -AndroidUtilities.dp(0.66f), false);
        } else if (i10 == 2) {
            if (i9 == 1) {
                return "≈" + BillingController.getInstance().formatCurrency(j10, "USD");
            }
            return oa.X0(false, r0.n(j10, ' ', new StringBuilder("XTR ")), 0.65f, null);
        } else {
            return AndroidUtilities.formatWholeNumber((int) j10, 0);
        }
    }
}
