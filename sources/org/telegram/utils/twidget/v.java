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
import org.json.JSONArray;
import org.json.JSONObject;
public abstract class v {
    public static void a(y yVar, a4.k kVar, JSONArray jSONArray, int i7, JSONObject jSONObject, x xVar, float f10) {
        RenderEffect c10;
        JSONArray optJSONArray = jSONObject.optJSONArray("fl");
        if (optJSONArray == null) {
            c10 = null;
        } else {
            c10 = c(optJSONArray, f10, Shader.TileMode.CLAMP);
        }
        RenderEffect renderEffect = c10;
        Matrix matrix = new Matrix();
        if (renderEffect != null && ((Matrix) kVar.d).invert(matrix)) {
            RectF j3 = y.j(jSONObject, "r", new RectF());
            if (!j3.isEmpty()) {
                RenderNode renderNode = new RenderNode("widget-backdrop");
                int floor = (int) Math.floor(j3.left * f10);
                int floor2 = (int) Math.floor(j3.top * f10);
                renderNode.setPosition(floor, floor2, (int) Math.ceil(j3.right * f10), (int) Math.ceil(j3.bottom * f10));
                RecordingCanvas beginRecording = renderNode.beginRecording();
                beginRecording.translate(-floor, -floor2);
                beginRecording.scale(f10, f10);
                beginRecording.concat(matrix);
                yVar.e(beginRecording, jSONArray, i7, xVar, f10, false);
                renderNode.endRecording();
                renderNode.setRenderEffect(renderEffect);
                Canvas canvas = (Canvas) kVar.f192c;
                canvas.save();
                Path path = yVar.f52899f;
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
        RenderEffect c10 = c(jSONArray, f10, tileMode);
        if (c10 == null) {
            return null;
        }
        RenderNode renderNode = new RenderNode("widget-filter");
        wVar.d = ((int) Math.floor(rectF.left * f10)) - 1;
        int floor = ((int) Math.floor(rectF.top * f10)) - 1;
        wVar.f52891e = floor;
        renderNode.setPosition(wVar.d, floor, ((int) Math.ceil(rectF.right * f10)) + 1, ((int) Math.ceil(rectF.bottom * f10)) + 1);
        renderNode.setRenderEffect(c10);
        wVar.f52890c = renderNode;
        RecordingCanvas beginRecording = renderNode.beginRecording();
        beginRecording.translate(-wVar.d, -wVar.f52891e);
        beginRecording.scale(f10, f10);
        return beginRecording;
    }

    public static RenderEffect c(JSONArray jSONArray, float f10, Shader.TileMode tileMode) {
        float f11;
        float f12;
        BlendMode blendMode;
        Shader.TileMode tileMode2;
        RenderEffect renderEffect = null;
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            JSONArray optJSONArray = jSONArray.optJSONArray(i7);
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
        RenderNode e10 = ni.a.e(wVar.f52890c);
        e10.endRecording();
        wVar.f52888a.save();
        float f11 = 1.0f / f10;
        wVar.f52888a.scale(f11, f11);
        wVar.f52888a.drawRenderNode(e10);
        wVar.f52888a.restore();
    }
}
