package org.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import android.view.View;

public class RendererCommon {
    private static float BALANCED_VISIBLE_FRACTION = 0.5625f;

    public interface GlDrawer {
        void drawOes(int i10, int i11, int i12, int i13, int i14, float[] fArr, int i15, int i16, int i17, int i18, int i19, int i20, boolean z10);

        void drawRgb(int i10, int i11, int i12, int i13, int i14, float[] fArr, int i15, int i16, int i17, int i18, int i19, int i20, boolean z10);

        void drawYuv(int[] iArr, int i10, int i11, int i12, int i13, float[] fArr, int i14, int i15, int i16, int i17, int i18, int i19, boolean z10);

        void release();
    }

    public interface RendererEvents {
        void onFirstFrameRendered();

        void onFrameResolutionChanged(int i10, int i11, int i12);
    }

    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    public static class VideoLayoutMeasure {
        private float visibleFractionMatchOrientation;
        private float visibleFractionMismatchOrientation;

        public VideoLayoutMeasure() {
            ScalingType scalingType = ScalingType.SCALE_ASPECT_BALANCED;
            this.visibleFractionMatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
            this.visibleFractionMismatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
        }

        public Point measure(boolean z10, int i10, int i11, int i12, int i13) {
            int defaultSize = View.getDefaultSize(Integer.MAX_VALUE, i10);
            int defaultSize2 = View.getDefaultSize(Integer.MAX_VALUE, i11);
            if (i12 == 0 || i13 == 0 || defaultSize == 0 || defaultSize2 == 0) {
                return new Point(defaultSize, defaultSize2);
            }
            float f10 = i12 / i13;
            float f11 = defaultSize / defaultSize2;
            Point displaySize = RendererCommon.getDisplaySize(((f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1)) > 0) == ((f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1)) > 0) ? this.visibleFractionMatchOrientation : this.visibleFractionMismatchOrientation, f10, defaultSize, defaultSize2);
            if (!z10) {
                if (View.MeasureSpec.getMode(i10) == 1073741824) {
                    displaySize.x = defaultSize;
                }
                if (View.MeasureSpec.getMode(i11) == 1073741824) {
                    displaySize.y = defaultSize2;
                } else {
                    if ((f10 > 1.0f) == (f11 > 1.0f)) {
                        displaySize.y = defaultSize2;
                    }
                }
            }
            return displaySize;
        }

        public void setScalingType(ScalingType scalingType) {
            setScalingType(scalingType, scalingType);
        }

        public void setVisibleFraction(float f10, float f11) {
            this.visibleFractionMatchOrientation = f10;
            this.visibleFractionMismatchOrientation = f11;
        }

        public void setScalingType(ScalingType scalingType, ScalingType scalingType2) {
            this.visibleFractionMatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
            this.visibleFractionMismatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType2);
        }
    }

    private static void adjustOrigin(float[] fArr) {
        float f10 = fArr[12] - ((fArr[0] + fArr[4]) * 0.5f);
        fArr[12] = f10;
        float f11 = fArr[13] - ((fArr[1] + fArr[5]) * 0.5f);
        fArr[13] = f11;
        fArr[12] = f10 + 0.5f;
        fArr[13] = f11 + 0.5f;
    }

    public static float[] convertMatrixFromAndroidGraphicsMatrix(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
    }

    public static Matrix convertMatrixToAndroidGraphicsMatrix(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        Matrix matrix = new Matrix();
        matrix.setValues(fArr2);
        return matrix;
    }

    public static float convertScalingTypeToVisibleFraction(ScalingType scalingType) {
        int iOrdinal = scalingType.ordinal();
        if (iOrdinal == 0) {
            return 1.0f;
        }
        if (iOrdinal == 1) {
            return 0.0f;
        }
        if (iOrdinal == 2) {
            return BALANCED_VISIBLE_FRACTION;
        }
        throw new IllegalArgumentException();
    }

    public static Point getDisplaySize(ScalingType scalingType, float f10, int i10, int i11) {
        return getDisplaySize(convertScalingTypeToVisibleFraction(scalingType), f10, i10, i11);
    }

    public static float[] getLayoutMatrix(boolean z10, float f10, float f11) {
        float f12;
        float f13;
        if (f11 > f10) {
            f13 = f10 / f11;
            f12 = 1.0f;
        } else {
            f12 = f11 / f10;
            f13 = 1.0f;
        }
        if (z10) {
            f12 *= -1.0f;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, f12, f13, 1.0f);
        adjustOrigin(fArr);
        return fArr;
    }

    public static Point getDisplaySize(float f10, float f11, int i10, int i11) {
        return (f10 == 0.0f || f11 == 0.0f) ? new Point(i10, i11) : new Point(Math.min(i10, Math.round((i11 / f10) * f11)), Math.min(i11, Math.round((i10 / f10) / f11)));
    }
}
