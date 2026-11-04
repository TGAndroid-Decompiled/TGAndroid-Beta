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
import o4.v0;
import org.json.JSONArray;
import org.json.JSONObject;
public abstract class v {
    public static void a(y yVar, e0.e0 e0Var, JSONArray jSONArray, int i3, JSONObject jSONObject, x xVar, float f10) {
        RenderEffect c2;
        JSONArray optJSONArray = jSONObject.optJSONArray("fl");
        if (optJSONArray == null) {
            c2 = null;
        } else {
            c2 = c(optJSONArray, f10, Shader.TileMode.CLAMP);
        }
        RenderEffect renderEffect = c2;
        Matrix matrix = new Matrix();
        if (renderEffect != null && ((Matrix) e0Var.d).invert(matrix)) {
            RectF j10 = y.j(jSONObject, "r", new RectF());
            if (!j10.isEmpty()) {
                RenderNode renderNode = new RenderNode("widget-backdrop");
                int floor = (int) Math.floor(j10.left * f10);
                int floor2 = (int) Math.floor(j10.top * f10);
                renderNode.setPosition(floor, floor2, (int) Math.ceil(j10.right * f10), (int) Math.ceil(j10.bottom * f10));
                RecordingCanvas beginRecording = renderNode.beginRecording();
                beginRecording.translate(-floor, -floor2);
                beginRecording.scale(f10, f10);
                beginRecording.concat(matrix);
                yVar.e(beginRecording, jSONArray, i3, xVar, f10, false);
                renderNode.endRecording();
                renderNode.setRenderEffect(renderEffect);
                Canvas canvas = (Canvas) e0Var.f9226c;
                canvas.save();
                Path path = yVar.f52990f;
                yVar.k(jSONObject, "r", path);
                canvas.clipPath(path);
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                float f11 = 1.0f / f10;
                canvas.scale(f11, f11);
                canvas.drawRenderNode(renderNode);
                canvas.restore();
            }
        }
    }

    public static Canvas b(w wVar, RectF rectF, JSONArray jSONArray, float f10) {
        Shader.TileMode tileMode;
        tileMode = Shader.TileMode.DECAL;
        RenderEffect c2 = c(jSONArray, f10, tileMode);
        if (c2 == null) {
            return null;
        }
        RenderNode renderNode = new RenderNode("widget-filter");
        wVar.d = ((int) Math.floor(rectF.left * f10)) - 1;
        int floor = ((int) Math.floor(rectF.top * f10)) - 1;
        wVar.f52982e = floor;
        renderNode.setPosition(wVar.d, floor, ((int) Math.ceil(rectF.right * f10)) + 1, ((int) Math.ceil(rectF.bottom * f10)) + 1);
        renderNode.setRenderEffect(c2);
        wVar.f52981c = renderNode;
        RecordingCanvas beginRecording = renderNode.beginRecording();
        beginRecording.translate(-wVar.d, -wVar.f52982e);
        beginRecording.scale(f10, f10);
        return beginRecording;
    }

    public static RenderEffect c(JSONArray jSONArray, float f10, Shader.TileMode tileMode) {
        float f11;
        float f12;
        BlendMode blendMode;
        Shader.TileMode tileMode2;
        RenderEffect renderEffect = null;
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            JSONArray optJSONArray = jSONArray.optJSONArray(i3);
            if (optJSONArray != null) {
                float optDouble = (float) optJSONArray.optDouble(1);
                int optInt = optJSONArray.optInt(0);
                if (optInt != 0) {
                    if (optInt != 1) {
                        if (optInt == 9) {
                            if (renderEffect == null) {
                                renderEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f);
                            }
                            RenderEffect createOffsetEffect = RenderEffect.createOffsetEffect(((float) optJSONArray.optDouble(2)) * f10, ((float) optJSONArray.optDouble(3)) * f10, RenderEffect.createColorFilterEffect(new PorterDuffColorFilter((int) optJSONArray.optLong(4), PorterDuff.Mode.SRC_IN), renderEffect));
                            float f13 = (optDouble / 2.0f) * f10;
                            if (f13 > 0.5f) {
                                f12 = (f13 - 0.5f) / 0.57735f;
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
                        colorMatrix.setScale(optDouble, optDouble, optDouble, 1.0f);
                        renderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
                    } else {
                        ColorMatrix colorMatrix2 = new ColorMatrix();
                        colorMatrix2.setScale(optDouble, optDouble, optDouble, 1.0f);
                        renderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix2), renderEffect);
                    }
                } else {
                    float f14 = optDouble * f10;
                    if (f14 > 0.5f) {
                        f11 = (f14 - 0.5f) / 0.57735f;
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
            }
        }
        return renderEffect;
    }

    public static void d(w wVar, float f10) {
        RenderNode d = v0.d(wVar.f52981c);
        d.endRecording();
        wVar.f52979a.save();
        float f11 = 1.0f / f10;
        wVar.f52979a.scale(f11, f11);
        wVar.f52979a.drawRenderNode(d);
        wVar.f52979a.restore();
    }
}
