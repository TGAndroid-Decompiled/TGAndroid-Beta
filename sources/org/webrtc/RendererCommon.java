package org.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
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

        public android.graphics.Point measure(boolean r8, int r9, int r10, int r11, int r12) {
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.RendererCommon.VideoLayoutMeasure.measure(boolean, int, int, int, int):android.graphics.Point");
        }

        public void setScalingType(ScalingType scalingType) {
            setScalingType(scalingType, scalingType);
        }

        public void setVisibleFraction(float f7, float f10) {
            this.visibleFractionMatchOrientation = f7;
            this.visibleFractionMismatchOrientation = f10;
        }

        public void setScalingType(ScalingType scalingType, ScalingType scalingType2) {
            this.visibleFractionMatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
            this.visibleFractionMismatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingType2);
        }
    }

    private static void adjustOrigin(float[] fArr) {
        float f7 = fArr[12] - ((fArr[0] + fArr[4]) * 0.5f);
        fArr[12] = f7;
        float f10 = fArr[13] - ((fArr[1] + fArr[5]) * 0.5f);
        fArr[13] = f10;
        fArr[12] = f7 + 0.5f;
        fArr[13] = f10 + 0.5f;
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
        int ordinal = scalingType.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return BALANCED_VISIBLE_FRACTION;
                }
                throw new IllegalArgumentException();
            }
            return 0.0f;
        }
        return 1.0f;
    }

    public static Point getDisplaySize(ScalingType scalingType, float f7, int i10, int i11) {
        return getDisplaySize(convertScalingTypeToVisibleFraction(scalingType), f7, i10, i11);
    }

    public static float[] getLayoutMatrix(boolean z10, float f7, float f10) {
        float f11;
        float f12;
        if (f10 > f7) {
            f12 = f7 / f10;
            f11 = 1.0f;
        } else {
            f11 = f10 / f7;
            f12 = 1.0f;
        }
        if (z10) {
            f11 *= -1.0f;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, f11, f12, 1.0f);
        adjustOrigin(fArr);
        return fArr;
    }

    public static Point getDisplaySize(float f7, float f10, int i10, int i11) {
        if (f7 != 0.0f && f10 != 0.0f) {
            return new Point(Math.min(i10, Math.round((i11 / f7) * f10)), Math.min(i11, Math.round((i10 / f7) / f10)));
        }
        return new Point(i10, i11);
    }
}
