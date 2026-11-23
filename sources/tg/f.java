package tg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextPaint;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.oq;
public class f extends EditTextBoldCursor {
    public final Canvas M1;
    public final TextPaint N1;
    public final Paint O1;
    public Bitmap P1;
    public boolean Q1;
    public int R1;
    public float S1;
    public int T1;
    public final oq U1;
    public RectF[] V1;
    public RectF W1;
    public boolean X1;
    public float Y1;
    public boolean Z1;
    public int[] f57889a2;
    public long f57890b2;
    public int f57891c2;
    public Paint d2;
    public final Path f57892e2;
    public final RectF f57893f2;
    public final RectF f57894g2;

    public f(Context context) {
        super(context);
        this.M1 = new Canvas();
        TextPaint textPaint = new TextPaint(1);
        this.N1 = textPaint;
        this.O1 = new Paint(1);
        this.U1 = new oq();
        this.f57891c2 = Integer.MIN_VALUE;
        this.f57892e2 = new Path();
        this.f57893f2 = new RectF();
        this.f57894g2 = new RectF();
        this.R1 = 0;
        setInputType(getInputType() | 655360);
        this.Q1 = true;
        this.X1 = true;
        setFrameRoundRadius(org.telegram.messenger.g0.L(16.0f));
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    private void setFrameRoundRadius(float f10) {
        if (Math.abs(this.Y1 - f10) > 0.1f) {
            this.Y1 = f10;
            this.O1.setPathEffect(new CornerPathEffect(f10));
        }
    }

    public final boolean A(long j3) {
        this.f57890b2 = j3;
        if (this.f57889a2 == null) {
            return false;
        }
        int B = B(j3);
        if (B < 0) {
            B = -1;
        } else if (j3 - this.f57889a2[(B * 4) + 2] < Math.max(220L, 240L)) {
            B = -2;
        }
        if (B == this.f57891c2 && B != -2) {
            return false;
        }
        this.f57891c2 = B;
        invalidate();
        return true;
    }

    public final int B(long j3) {
        int i7;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            int i12 = i11;
            i7 = i10;
            i10 = i12;
            int i13 = i10 * 4;
            int i14 = i13 + 3;
            int[] iArr = this.f57889a2;
            if (i14 >= iArr.length || iArr[i13 + 2] > j3) {
                break;
            }
            i11 = i10 + 1;
        }
        return i7;
    }

    public final boolean C(Layout layout, int i7, RectF rectF) {
        int[] iArr = this.f57889a2;
        int i10 = i7 * 4;
        int i11 = iArr[i10];
        int i12 = iArr[i10 + 1];
        if (i11 >= 0 && i11 < i12 && i12 <= layout.getText().length()) {
            Path path = this.f57892e2;
            path.rewind();
            layout.getSelectionPath(i11, i12, path);
            path.computeBounds(rectF, false);
            if (!rectF.isEmpty()) {
                Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
                float lineBaseline = layout.getLineBaseline(layout.getLineForOffset(i11));
                float textSize = getTextSize() * 0.14f;
                rectF.set(rectF.left - textSize, ((fontMetrics.ascent * 0.86f) + lineBaseline) - textSize, rectF.right + textSize, p5.c.e(fontMetrics.descent, 0.9f, lineBaseline, textSize));
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: tg.f.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        if (i7 != i11) {
            this.X1 = true;
            invalidate();
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 > 0 && i10 > 0) {
            this.Q1 = true;
            this.X1 = true;
            Bitmap bitmap = this.P1;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.P1 = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
            return;
        }
        this.P1 = null;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        this.Q1 = true;
        this.X1 = true;
    }

    public void setFrameColor(int i7) {
        int i10 = this.T1;
        if (i10 == 0 && i7 != 0) {
            setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(7.0f));
            setCursorColor(-1);
        } else if (i10 != 0 && i7 == 0) {
            setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
            setCursorColor(-1);
        }
        this.T1 = i7;
        if (i7 != 0) {
            float B = org.telegram.messenger.g0.B(i7);
            if (B == 0.0f) {
                B = Color.red(this.T1) / 255.0f;
            }
            if (B > 0.87d) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
            this.X1 = true;
        }
        this.Q1 = true;
        invalidate();
    }

    @Override
    public void setGravity(int i7) {
        super.setGravity(i7);
        this.Q1 = true;
        this.X1 = true;
        invalidate();
    }

    public void setSpokenWords(int[] iArr) {
        if (this.f57889a2 == iArr) {
            return;
        }
        this.f57889a2 = iArr;
        this.f57891c2 = Integer.MIN_VALUE;
        invalidate();
    }

    public void setStrokeColor(int i7) {
        this.R1 = i7;
        this.Q1 = true;
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.S1 = f10;
        this.Q1 = true;
        invalidate();
    }

    public void setTallFrame(boolean z10) {
        if (this.Z1 == z10) {
            return;
        }
        this.Z1 = z10;
        this.X1 = true;
        invalidate();
    }
}
