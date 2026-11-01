package org.telegram.utils.twidget;

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
import m4.v0;
import org.json.JSONArray;
import org.json.JSONObject;
public abstract class x {
    public static void a(a0 a0Var, cc.f fVar, JSONArray jSONArray, int i10, JSONObject jSONObject, z zVar, float f7) {
        RenderEffect c10;
        JSONArray optJSONArray = jSONObject.optJSONArray("fl");
        if (optJSONArray == null) {
            c10 = null;
        } else {
            c10 = c(optJSONArray, f7, Shader.TileMode.CLAMP);
        }
        RenderEffect renderEffect = c10;
        Matrix matrix = new Matrix();
        if (renderEffect != null && ((Matrix) fVar.d).invert(matrix)) {
            RectF j10 = a0.j(jSONObject, "r", new RectF());
            if (!j10.isEmpty()) {
                RenderNode renderNode = new RenderNode("widget-backdrop");
                int floor = (int) Math.floor(j10.left * f7);
                int floor2 = (int) Math.floor(j10.top * f7);
                renderNode.setPosition(floor, floor2, (int) Math.ceil(j10.right * f7), (int) Math.ceil(j10.bottom * f7));
                RecordingCanvas beginRecording = renderNode.beginRecording();
                beginRecording.translate(-floor, -floor2);
                beginRecording.scale(f7, f7);
                beginRecording.concat(matrix);
                a0Var.e(beginRecording, jSONArray, i10, zVar, f7, false);
                renderNode.endRecording();
                renderNode.setRenderEffect(renderEffect);
                Canvas canvas = (Canvas) fVar.f4117c;
                canvas.save();
                Path path = a0Var.f44308f;
                a0Var.k(jSONObject, "r", path);
                canvas.clipPath(path);
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                float f10 = 1.0f / f7;
                canvas.scale(f10, f10);
                canvas.drawRenderNode(renderNode);
                canvas.restore();
            }
        }
    }

    public static Canvas b(y yVar, RectF rectF, JSONArray jSONArray, float f7) {
        Shader.TileMode tileMode;
        tileMode = Shader.TileMode.DECAL;
        RenderEffect c10 = c(jSONArray, f7, tileMode);
        if (c10 == null) {
            return null;
        }
        RenderNode renderNode = new RenderNode("widget-filter");
        yVar.d = ((int) Math.floor(rectF.left * f7)) - 1;
        int floor = ((int) Math.floor(rectF.top * f7)) - 1;
        yVar.e = floor;
        renderNode.setPosition(yVar.d, floor, ((int) Math.ceil(rectF.right * f7)) + 1, ((int) Math.ceil(rectF.bottom * f7)) + 1);
        renderNode.setRenderEffect(c10);
        yVar.f44486c = renderNode;
        RecordingCanvas beginRecording = renderNode.beginRecording();
        beginRecording.translate(-yVar.d, -yVar.e);
        beginRecording.scale(f7, f7);
        return beginRecording;
    }

    public static RenderEffect c(JSONArray jSONArray, float f7, Shader.TileMode tileMode) {
        float f10;
        float f11;
        BlendMode blendMode;
        Shader.TileMode tileMode2;
        RenderEffect renderEffect = null;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONArray optJSONArray = jSONArray.optJSONArray(i10);
            if (optJSONArray != null) {
                float optDouble = (float) optJSONArray.optDouble(1);
                int optInt = optJSONArray.optInt(0);
                if (optInt != 0) {
                    if (optInt != 1) {
                        if (optInt == 9) {
                            if (renderEffect == null) {
                                renderEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f);
                            }
                            RenderEffect createOffsetEffect = RenderEffect.createOffsetEffect(((float) optJSONArray.optDouble(2)) * f7, ((float) optJSONArray.optDouble(3)) * f7, RenderEffect.createColorFilterEffect(new PorterDuffColorFilter((int) optJSONArray.optLong(4), PorterDuff.Mode.SRC_IN), renderEffect));
                            float f12 = (optDouble / 2.0f) * f7;
                            if (f12 > 0.5f) {
                                f11 = (f12 - 0.5f) / 0.57735f;
                            } else {
                                f11 = 0.0f;
                            }
                            if (f11 > 0.0f) {
                                tileMode2 = Shader.TileMode.DECAL;
                                createOffsetEffect = RenderEffect.createBlurEffect(f11, f11, createOffsetEffect, tileMode2);
                            }
                            blendMode = BlendMode.SRC_OVER;
                            renderEffect = RenderEffect.createBlendModeEffect(createOffsetEffect, renderEffect, blendMode);
                        }
                    } else if (renderEffect == null) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setScale(optDouble, optDouble, optDouble, 1.0f);
                        renderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
                    } else {
                        ColorMatrix colorMatrix2 = new ColorMatrix();
                        colorMatrix2.setScale(optDouble, optDouble, optDouble, 1.0f);
                        renderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix2), renderEffect);
                    }
                } else {
                    float f13 = optDouble * f7;
                    if (f13 > 0.5f) {
                        f10 = (f13 - 0.5f) / 0.57735f;
                    } else {
                        f10 = 0.0f;
                    }
                    if (f10 > 0.0f) {
                        if (renderEffect == null) {
                            renderEffect = RenderEffect.createBlurEffect(f10, f10, tileMode);
                        } else {
                            renderEffect = RenderEffect.createBlurEffect(f10, f10, renderEffect, tileMode);
                        }
                    }
                }
            }
        }
        return renderEffect;
    }

    public static void d(y yVar, float f7) {
        RenderNode b10 = v0.b(yVar.f44486c);
        b10.endRecording();
        yVar.f44484a.save();
        float f10 = 1.0f / f7;
        yVar.f44484a.scale(f10, f10);
        yVar.f44484a.drawRenderNode(b10);
        yVar.f44484a.restore();
    }
}
