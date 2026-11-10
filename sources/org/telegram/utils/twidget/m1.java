package org.telegram.utils.twidget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
public final class m1 extends Layout {
    public final l1 f52924a;

    public m1(l1 l1Var) {
        super(l1Var.f52908a, n1.f52939b, Math.max(1, l1Var.d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f);
        this.f52924a = l1Var;
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
        return this.f52924a.f52913g.length;
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
            l1 l1Var = this.f52924a;
            float[][] fArr = l1Var.f52913g;
            if (i10 < fArr.length) {
                int i11 = i10 + 1;
                if (i7 < l1Var.f52911e[i11]) {
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
        float[][] fArr = this.f52924a.f52913g;
        return fArr[Math.max(0, Math.min(i7, fArr.length - 1))][0];
    }

    @Override
    public final float getLineMax(int i7) {
        return getLineRight(i7);
    }

    @Override
    public final float getLineRight(int i7) {
        float[][] fArr = this.f52924a.f52913g;
        float[] fArr2 = fArr[Math.max(0, Math.min(i7, fArr.length - 1))];
        return fArr2[fArr2.length - 1];
    }

    @Override
    public final int getLineStart(int i7) {
        l1 l1Var = this.f52924a;
        return l1Var.f52911e[Math.max(0, Math.min(i7, l1Var.f52913g.length))];
    }

    @Override
    public final int getLineTop(int i7) {
        l1 l1Var = this.f52924a;
        return l1Var.f52912f[Math.max(0, Math.min(i7, l1Var.f52913g.length))];
    }

    @Override
    public final float getLineWidth(int i7) {
        return getLineRight(i7) - getLineLeft(i7);
    }

    @Override
    public final int getOffsetForHorizontal(int i7, float f10) {
        l1 l1Var = this.f52924a;
        int max = Math.max(0, Math.min(i7, l1Var.f52913g.length - 1));
        float[] fArr = l1Var.f52913g[max];
        int[] iArr = l1Var.f52911e;
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
        if (i11 == i10 && i10 > 0 && max < l1Var.f52913g.length - 1 && Character.isWhitespace(l1Var.f52908a.charAt((l1Var.f52911e[max] + i10) - 1))) {
            i11--;
        }
        return l1Var.f52911e[max] + i11;
    }

    @Override
    public final int getParagraphDirection(int i7) {
        return 1;
    }

    @Override
    public final float getPrimaryHorizontal(int i7) {
        int lineForOffset = getLineForOffset(i7);
        l1 l1Var = this.f52924a;
        float[] fArr = l1Var.f52913g[lineForOffset];
        return fArr[Math.max(0, Math.min(i7 - l1Var.f52911e[lineForOffset], fArr.length - 1))];
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
