package yf;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import mh.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.ui.ke;
public final class d {
    public final long[] f50905a;
    public final CharSequence[] f50906b;
    public final CharSequence[] f50907c;
    public final StaticLayout[] d;
    public final StaticLayout[] f50908e;
    public int f50909f;
    public int f50910g;
    public DecimalFormat h;

    public d(long r25, long r27, boolean r29, float r30, int r31, android.text.TextPaint r32, android.text.TextPaint r33) {
        throw new UnsupportedOperationException("Method not decompiled: yf.d.<init>(long, long, boolean, float, int, android.text.TextPaint, android.text.TextPaint):void");
    }

    public final void a(Canvas canvas, int i10, int i11, float f10, float f11, TextPaint textPaint) {
        StaticLayout[] staticLayoutArr;
        CharSequence[] charSequenceArr;
        StaticLayout[] staticLayoutArr2 = this.f50908e;
        StaticLayout[] staticLayoutArr3 = this.d;
        if (i10 == 0) {
            staticLayoutArr = staticLayoutArr3;
        } else {
            staticLayoutArr = staticLayoutArr2;
        }
        StaticLayout staticLayout = staticLayoutArr[i11];
        if (staticLayout == null) {
            if (i10 == 0) {
                charSequenceArr = this.f50906b;
            } else {
                charSequenceArr = this.f50907c;
            }
            CharSequence charSequence = charSequenceArr[i11];
            if (i10 == 0) {
                staticLayoutArr2 = staticLayoutArr3;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            staticLayoutArr2[i11] = staticLayout2;
            staticLayout = staticLayout2;
        }
        canvas.save();
        canvas.translate(f10, textPaint.ascent() + f11);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    public final CharSequence b(int i10, TextPaint textPaint, long j10, int i11) {
        int i12 = 2;
        if (i11 == 1) {
            if (i10 == 1) {
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
                i12 = 6;
            }
            decimalFormat2.setMaximumFractionDigits(i12);
            return ke.f0("TON " + this.h.format(j10 / 1.0E9d), textPaint, 0.8f, -AndroidUtilities.dp(0.66f), false);
        } else if (i11 == 2) {
            if (i10 == 1) {
                return "≈" + BillingController.getInstance().formatCurrency(j10, "USD");
            }
            return ja.X0(false, l.d.l(j10, ' ', new StringBuilder("XTR ")), 0.65f, null);
        } else {
            return AndroidUtilities.formatWholeNumber((int) j10, 0);
        }
    }
}
