package org.telegram.utils.twidget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
public final class l0 extends Layout {
    public final k0 f52909a;

    public l0(k0 k0Var) {
        super(k0Var.f52901a, m0.f52933b, Math.max(1, k0Var.d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f);
        this.f52909a = k0Var;
    }

    @Override
    public final void draw(Canvas canvas) {
    }

    @Override
    public final int getBottomPadding() {
        return 0;
    }

    @Override
    public final int getEllipsisCount(int i3) {
        return 0;
    }

    @Override
    public final int getEllipsisStart(int i3) {
        return 0;
    }

    @Override
    public final boolean getLineContainsTab(int i3) {
        return false;
    }

    @Override
    public final int getLineCount() {
        return this.f52909a.f52906g.length;
    }

    @Override
    public final int getLineDescent(int i3) {
        return 0;
    }

    @Override
    public final Layout.Directions getLineDirections(int i3) {
        return null;
    }

    @Override
    public final int getLineForOffset(int i3) {
        int i10 = 0;
        while (true) {
            k0 k0Var = this.f52909a;
            float[][] fArr = k0Var.f52906g;
            if (i10 < fArr.length) {
                int i11 = i10 + 1;
                if (i3 < k0Var.f52904e[i11]) {
                    return i10;
                }
                i10 = i11;
            } else {
                return fArr.length - 1;
            }
        }
    }

    @Override
    public final float getLineLeft(int i3) {
        float[][] fArr = this.f52909a.f52906g;
        return fArr[Math.max(0, Math.min(i3, fArr.length - 1))][0];
    }

    @Override
    public final float getLineMax(int i3) {
        return getLineRight(i3);
    }

    @Override
    public final float getLineRight(int i3) {
        float[][] fArr = this.f52909a.f52906g;
        float[] fArr2 = fArr[Math.max(0, Math.min(i3, fArr.length - 1))];
        return fArr2[fArr2.length - 1];
    }

    @Override
    public final int getLineStart(int i3) {
        k0 k0Var = this.f52909a;
        return k0Var.f52904e[Math.max(0, Math.min(i3, k0Var.f52906g.length))];
    }

    @Override
    public final int getLineTop(int i3) {
        k0 k0Var = this.f52909a;
        return k0Var.f52905f[Math.max(0, Math.min(i3, k0Var.f52906g.length))];
    }

    @Override
    public final float getLineWidth(int i3) {
        return getLineRight(i3) - getLineLeft(i3);
    }

    @Override
    public final int getOffsetForHorizontal(int i3, float f10) {
        k0 k0Var = this.f52909a;
        int max = Math.max(0, Math.min(i3, k0Var.f52906g.length - 1));
        float[] fArr = k0Var.f52906g[max];
        int[] iArr = k0Var.f52904e;
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
        if (i11 == i10 && i10 > 0 && max < k0Var.f52906g.length - 1 && Character.isWhitespace(k0Var.f52901a.charAt((k0Var.f52904e[max] + i10) - 1))) {
            i11--;
        }
        return k0Var.f52904e[max] + i11;
    }

    @Override
    public final int getParagraphDirection(int i3) {
        return 1;
    }

    @Override
    public final float getPrimaryHorizontal(int i3) {
        int lineForOffset = getLineForOffset(i3);
        k0 k0Var = this.f52909a;
        float[] fArr = k0Var.f52906g[lineForOffset];
        return fArr[Math.max(0, Math.min(i3 - k0Var.f52904e[lineForOffset], fArr.length - 1))];
    }

    @Override
    public final float getSecondaryHorizontal(int i3) {
        return getPrimaryHorizontal(i3);
    }

    @Override
    public final void getSelectionPath(int i3, int i10, Path path) {
        float lineLeft;
        float lineRight;
        Path path2;
        path.reset();
        if (i3 != i10) {
            if (i10 < i3) {
                i10 = i3;
                i3 = i10;
            }
            int lineForOffset = getLineForOffset(i3);
            int lineForOffset2 = getLineForOffset(i10);
            int i11 = lineForOffset;
            while (i11 <= lineForOffset2) {
                if (i11 == lineForOffset) {
                    lineLeft = getPrimaryHorizontal(i3);
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
    public final boolean isRtlCharAt(int i3) {
        return false;
    }

    @Override
    public final void draw(Canvas canvas, Path path, Paint paint, int i3) {
    }
}
