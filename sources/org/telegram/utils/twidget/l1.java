package org.telegram.utils.twidget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
public final class l1 extends Layout {
    public final k1 f52900a;

    public l1(k1 k1Var) {
        super(k1Var.f52890a, m1.f52911b, Math.max(1, k1Var.d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f);
        this.f52900a = k1Var;
    }

    @Override
    public final void draw(Canvas canvas) {
    }

    @Override
    public final int getBottomPadding() {
        return 0;
    }

    @Override
    public final int getEllipsisCount(int i7) {
        return 0;
    }

    @Override
    public final int getEllipsisStart(int i7) {
        return 0;
    }

    @Override
    public final boolean getLineContainsTab(int i7) {
        return false;
    }

    @Override
    public final int getLineCount() {
        return this.f52900a.f52895g.length;
    }

    @Override
    public final int getLineDescent(int i7) {
        return 0;
    }

    @Override
    public final Layout.Directions getLineDirections(int i7) {
        return null;
    }

    @Override
    public final int getLineForOffset(int i7) {
        int i10 = 0;
        while (true) {
            k1 k1Var = this.f52900a;
            float[][] fArr = k1Var.f52895g;
            if (i10 < fArr.length) {
                int i11 = i10 + 1;
                if (i7 < k1Var.f52893e[i11]) {
                    return i10;
                }
                i10 = i11;
            } else {
                return fArr.length - 1;
            }
        }
    }

    @Override
    public final float getLineLeft(int i7) {
        float[][] fArr = this.f52900a.f52895g;
        return fArr[Math.max(0, Math.min(i7, fArr.length - 1))][0];
    }

    @Override
    public final float getLineMax(int i7) {
        return getLineRight(i7);
    }

    @Override
    public final float getLineRight(int i7) {
        float[][] fArr = this.f52900a.f52895g;
        float[] fArr2 = fArr[Math.max(0, Math.min(i7, fArr.length - 1))];
        return fArr2[fArr2.length - 1];
    }

    @Override
    public final int getLineStart(int i7) {
        k1 k1Var = this.f52900a;
        return k1Var.f52893e[Math.max(0, Math.min(i7, k1Var.f52895g.length))];
    }

    @Override
    public final int getLineTop(int i7) {
        k1 k1Var = this.f52900a;
        return k1Var.f52894f[Math.max(0, Math.min(i7, k1Var.f52895g.length))];
    }

    @Override
    public final float getLineWidth(int i7) {
        return getLineRight(i7) - getLineLeft(i7);
    }

    @Override
    public final int getOffsetForHorizontal(int i7, float f10) {
        k1 k1Var = this.f52900a;
        int max = Math.max(0, Math.min(i7, k1Var.f52895g.length - 1));
        float[] fArr = k1Var.f52895g[max];
        int[] iArr = k1Var.f52893e;
        int i10 = iArr[max + 1] - iArr[max];
        int i11 = 0;
        for (int i12 = 0; i12 <= i10 && i12 < fArr.length; i12++) {
            if (i12 < i10) {
                int i13 = i12 + 1;
                if (f10 >= (fArr[i12] + fArr[i13]) / 2.0f) {
                    i11 = i13;
                }
            }
        }
        if (i11 == i10 && i10 > 0 && max < k1Var.f52895g.length - 1 && Character.isWhitespace(k1Var.f52890a.charAt((k1Var.f52893e[max] + i10) - 1))) {
            i11--;
        }
        return k1Var.f52893e[max] + i11;
    }

    @Override
    public final int getParagraphDirection(int i7) {
        return 1;
    }

    @Override
    public final float getPrimaryHorizontal(int i7) {
        int lineForOffset = getLineForOffset(i7);
        k1 k1Var = this.f52900a;
        float[] fArr = k1Var.f52895g[lineForOffset];
        return fArr[Math.max(0, Math.min(i7 - k1Var.f52893e[lineForOffset], fArr.length - 1))];
    }

    @Override
    public final float getSecondaryHorizontal(int i7) {
        return getPrimaryHorizontal(i7);
    }

    @Override
    public final void getSelectionPath(int i7, int i10, Path path) {
        float lineLeft;
        float lineRight;
        Path path2;
        path.reset();
        if (i7 != i10) {
            if (i10 < i7) {
                i10 = i7;
                i7 = i10;
            }
            int lineForOffset = getLineForOffset(i7);
            int lineForOffset2 = getLineForOffset(i10);
            int i11 = lineForOffset;
            while (i11 <= lineForOffset2) {
                if (i11 == lineForOffset) {
                    lineLeft = getPrimaryHorizontal(i7);
                } else {
                    lineLeft = getLineLeft(i11);
                }
                float f10 = lineLeft;
                if (i11 == lineForOffset2) {
                    lineRight = getPrimaryHorizontal(i10);
                } else {
                    lineRight = getLineRight(i11);
                }
                float f11 = lineRight;
                if (f11 > f10) {
                    path2 = path;
                    path2.addRect(f10, getLineTop(i11), f11, getLineTop(i11 + 1), Path.Direction.CW);
                } else {
                    path2 = path;
                }
                i11++;
                path = path2;
            }
        }
    }

    @Override
    public final int getTopPadding() {
        return 0;
    }

    @Override
    public final boolean isRtlCharAt(int i7) {
        return false;
    }

    @Override
    public final void draw(Canvas canvas, Path path, Paint paint, int i7) {
    }
}
