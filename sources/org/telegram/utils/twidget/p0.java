package org.telegram.utils.twidget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
public final class p0 extends Layout {
    public final o0 f44440a;

    public p0(o0 o0Var) {
        super(o0Var.f44425a, q0.f44442b, Math.max(1, o0Var.d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f);
        this.f44440a = o0Var;
    }

    @Override
    public final void draw(Canvas canvas) {
    }

    @Override
    public final int getBottomPadding() {
        return 0;
    }

    @Override
    public final int getEllipsisCount(int i10) {
        return 0;
    }

    @Override
    public final int getEllipsisStart(int i10) {
        return 0;
    }

    @Override
    public final boolean getLineContainsTab(int i10) {
        return false;
    }

    @Override
    public final int getLineCount() {
        return this.f44440a.f44429g.length;
    }

    @Override
    public final int getLineDescent(int i10) {
        return 0;
    }

    @Override
    public final Layout.Directions getLineDirections(int i10) {
        return null;
    }

    @Override
    public final int getLineForOffset(int i10) {
        int i11 = 0;
        while (true) {
            o0 o0Var = this.f44440a;
            float[][] fArr = o0Var.f44429g;
            if (i11 < fArr.length) {
                int i12 = i11 + 1;
                if (i10 < o0Var.e[i12]) {
                    return i11;
                }
                i11 = i12;
            } else {
                return fArr.length - 1;
            }
        }
    }

    @Override
    public final float getLineLeft(int i10) {
        float[][] fArr = this.f44440a.f44429g;
        return fArr[Math.max(0, Math.min(i10, fArr.length - 1))][0];
    }

    @Override
    public final float getLineMax(int i10) {
        return getLineRight(i10);
    }

    @Override
    public final float getLineRight(int i10) {
        float[][] fArr = this.f44440a.f44429g;
        float[] fArr2 = fArr[Math.max(0, Math.min(i10, fArr.length - 1))];
        return fArr2[fArr2.length - 1];
    }

    @Override
    public final int getLineStart(int i10) {
        o0 o0Var = this.f44440a;
        return o0Var.e[Math.max(0, Math.min(i10, o0Var.f44429g.length))];
    }

    @Override
    public final int getLineTop(int i10) {
        o0 o0Var = this.f44440a;
        return o0Var.f44428f[Math.max(0, Math.min(i10, o0Var.f44429g.length))];
    }

    @Override
    public final float getLineWidth(int i10) {
        return getLineRight(i10) - getLineLeft(i10);
    }

    @Override
    public final int getOffsetForHorizontal(int i10, float f7) {
        o0 o0Var = this.f44440a;
        int max = Math.max(0, Math.min(i10, o0Var.f44429g.length - 1));
        float[] fArr = o0Var.f44429g[max];
        int[] iArr = o0Var.e;
        int i11 = iArr[max + 1] - iArr[max];
        int i12 = 0;
        for (int i13 = 0; i13 <= i11 && i13 < fArr.length; i13++) {
            if (i13 < i11) {
                int i14 = i13 + 1;
                if (f7 >= (fArr[i13] + fArr[i14]) / 2.0f) {
                    i12 = i14;
                }
            }
        }
        if (i12 == i11 && i11 > 0 && max < o0Var.f44429g.length - 1 && Character.isWhitespace(o0Var.f44425a.charAt((o0Var.e[max] + i11) - 1))) {
            i12--;
        }
        return o0Var.e[max] + i12;
    }

    @Override
    public final int getParagraphDirection(int i10) {
        return 1;
    }

    @Override
    public final float getPrimaryHorizontal(int i10) {
        int lineForOffset = getLineForOffset(i10);
        o0 o0Var = this.f44440a;
        float[] fArr = o0Var.f44429g[lineForOffset];
        return fArr[Math.max(0, Math.min(i10 - o0Var.e[lineForOffset], fArr.length - 1))];
    }

    @Override
    public final float getSecondaryHorizontal(int i10) {
        return getPrimaryHorizontal(i10);
    }

    @Override
    public final void getSelectionPath(int i10, int i11, Path path) {
        float lineLeft;
        float lineRight;
        Path path2;
        path.reset();
        if (i10 != i11) {
            if (i11 < i10) {
                i11 = i10;
                i10 = i11;
            }
            int lineForOffset = getLineForOffset(i10);
            int lineForOffset2 = getLineForOffset(i11);
            int i12 = lineForOffset;
            while (i12 <= lineForOffset2) {
                if (i12 == lineForOffset) {
                    lineLeft = getPrimaryHorizontal(i10);
                } else {
                    lineLeft = getLineLeft(i12);
                }
                float f7 = lineLeft;
                if (i12 == lineForOffset2) {
                    lineRight = getPrimaryHorizontal(i11);
                } else {
                    lineRight = getLineRight(i12);
                }
                float f10 = lineRight;
                if (f10 > f7) {
                    path2 = path;
                    path2.addRect(f7, getLineTop(i12), f10, getLineTop(i12 + 1), Path.Direction.CW);
                } else {
                    path2 = path;
                }
                i12++;
                path = path2;
            }
        }
    }

    @Override
    public final int getTopPadding() {
        return 0;
    }

    @Override
    public final boolean isRtlCharAt(int i10) {
        return false;
    }

    @Override
    public final void draw(Canvas canvas, Path path, Paint paint, int i10) {
    }
}
