package org.telegram.utils.twidget;

import a8.r7;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
public abstract class w0 {
    public static void a(z0 z0Var, a4.k kVar, i iVar, int i7, r7 r7Var, RectF rectF, float[] fArr, y0 y0Var, float f10) {
        RenderEffect c10 = c(r7Var, f10, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        if (c10 != null && ((Matrix) kVar.d).invert(matrix) && !rectF.isEmpty()) {
            RenderNode renderNode = new RenderNode("widget-backdrop");
            int floor = (int) Math.floor(rectF.left * f10);
            int floor2 = (int) Math.floor(rectF.top * f10);
            renderNode.setPosition(floor, floor2, (int) Math.ceil(rectF.right * f10), (int) Math.ceil(rectF.bottom * f10));
            RecordingCanvas beginRecording = renderNode.beginRecording();
            beginRecording.translate(-floor, -floor2);
            beginRecording.scale(f10, f10);
            beginRecording.concat(matrix);
            z0Var.d(beginRecording, iVar, i7, y0Var, f10, false);
            renderNode.endRecording();
            renderNode.setRenderEffect(c10);
            Canvas canvas = (Canvas) kVar.f192c;
            canvas.save();
            Path path = z0Var.f53014f;
            path.rewind();
            if (fArr == null) {
                path.addRect(rectF, Path.Direction.CW);
            } else {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            canvas.clipPath(path);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f11 = 1.0f / f10;
            canvas.scale(f11, f11);
            canvas.drawRenderNode(renderNode);
            canvas.restore();
        }
    }

    public static Canvas b(x0 x0Var, RectF rectF, r7 r7Var, float f10) {
        Shader.TileMode tileMode;
        tileMode = Shader.TileMode.DECAL;
        RenderEffect c10 = c(r7Var, f10, tileMode);
        if (c10 == null) {
            return null;
        }
        RenderNode renderNode = new RenderNode("widget-filter");
        x0Var.d = ((int) Math.floor(rectF.left * f10)) - 1;
        int floor = ((int) Math.floor(rectF.top * f10)) - 1;
        x0Var.f53003e = floor;
        renderNode.setPosition(x0Var.d, floor, ((int) Math.ceil(rectF.right * f10)) + 1, ((int) Math.ceil(rectF.bottom * f10)) + 1);
        renderNode.setRenderEffect(c10);
        x0Var.f53002c = renderNode;
        RecordingCanvas beginRecording = renderNode.beginRecording();
        beginRecording.translate(-x0Var.d, -x0Var.f53003e);
        beginRecording.scale(f10, f10);
        return beginRecording;
    }

    public static RenderEffect c(r7 r7Var, float f10, Shader.TileMode tileMode) {
        float f11;
        float f12;
        BlendMode blendMode;
        Shader.TileMode tileMode2;
        RenderEffect renderEffect = null;
        int i7 = 0;
        while (true) {
            int[] iArr = (int[]) r7Var.f614b;
            if (i7 < iArr.length) {
                float f13 = ((float[]) r7Var.d)[i7];
                int i10 = iArr[i7];
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 9) {
                            if (renderEffect == null) {
                                renderEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f);
                            }
                            RenderEffect createOffsetEffect = RenderEffect.createOffsetEffect(((float[]) r7Var.f616e)[i7] * f10, ((float[]) r7Var.f617f)[i7] * f10, RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(((int[]) r7Var.f615c)[i7], PorterDuff.Mode.SRC_IN), renderEffect));
                            float f14 = (f13 / 2.0f) * f10;
                            if (f14 > 0.5f) {
                                f12 = (f14 - 0.5f) / 0.57735f;
                            } else {
                                f12 = 0.0f;
                            }
                            if (f12 > 0.0f) {
                                tileMode2 = Shader.TileMode.DECAL;
                                createOffsetEffect = RenderEffect.createBlurEffect(f12, f12, createOffsetEffect, tileMode2);
                            }
                            blendMode = BlendMode.SRC_OVER;
                            renderEffect = RenderEffect.createBlendModeEffect(createOffsetEffect, renderEffect, blendMode);
                        }
                    } else if (renderEffect == null) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setScale(f13, f13, f13, 1.0f);
                        renderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
                    } else {
                        ColorMatrix colorMatrix2 = new ColorMatrix();
                        colorMatrix2.setScale(f13, f13, f13, 1.0f);
                        renderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix2), renderEffect);
                    }
                } else {
                    float f15 = f13 * f10;
                    if (f15 > 0.5f) {
                        f11 = (f15 - 0.5f) / 0.57735f;
                    } else {
                        f11 = 0.0f;
                    }
                    if (f11 > 0.0f) {
                        if (renderEffect == null) {
                            renderEffect = RenderEffect.createBlurEffect(f11, f11, tileMode);
                        } else {
                            renderEffect = RenderEffect.createBlurEffect(f11, f11, renderEffect, tileMode);
                        }
                    }
                }
                i7++;
            } else {
                return renderEffect;
            }
        }
    }

    public static void d(x0 x0Var, float f10) {
        RenderNode e10 = ni.a.e(x0Var.f53002c);
        e10.endRecording();
        x0Var.f53000a.save();
        float f11 = 1.0f / f10;
        x0Var.f53000a.scale(f11, f11);
        x0Var.f53000a.drawRenderNode(e10);
        x0Var.f53000a.restore();
    }
}
