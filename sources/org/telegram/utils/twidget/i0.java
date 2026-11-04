package org.telegram.utils.twidget;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.gk0;
public abstract class i0 {
    public static final int[] f52890a = {k6.f28143ra, k6.Sc, k6.f27850be, k6.Uc, k6.Kd};
    public static final int[] f52891b = {k6.f28086ob, k6.Tc, k6.f27942gc, k6.Vc, k6.Qb};
    public static final int[] f52892c = {k6.f28144rb, k6.f28163sb, k6.f28182tb};

    public static String a(e6 e6Var, boolean z10) {
        boolean q10;
        int[] iArr;
        int i3;
        Object obj;
        String str = "light";
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = k6.I.q();
        }
        if (z10) {
            iArr = f52891b;
        } else {
            iArr = f52890a;
        }
        try {
            int b10 = b(e6Var, z10);
            if (q10) {
                i3 = -16777216;
            } else {
                i3 = -1;
            }
            int w10 = k6.w(i3, b10);
            int w02 = k6.w0(iArr[1], e6Var);
            int w03 = k6.w0(iArr[2], e6Var);
            int w04 = k6.w0(iArr[3], e6Var);
            int w05 = k6.w0(iArr[4], e6Var);
            int w06 = k6.w0(k6.Ci, e6Var);
            int w07 = k6.w0(k6.Gi, e6Var);
            int w11 = k6.w(w10, k6.r1(0.1f, w05));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bg_color", c(w10, w10));
            jSONObject.put("text_color", c(w02, w10));
            jSONObject.put("hint_color", c(w03, w10));
            jSONObject.put("link_color", c(w04, w10));
            jSONObject.put("button_color", c(w06, w10));
            jSONObject.put("button_text_color", c(w07, w06));
            jSONObject.put("secondary_bg_color", c(w11, w10));
            jSONObject.put("accent_text_color", c(w05, w10));
            jSONObject.put("subtitle_text_color", c(w03, w10));
            jSONObject.put("destructive_text_color", c(k6.w0(k6.f28102p7, e6Var), w10));
            jSONObject.put("section_bg_color", c(w10, w10));
            jSONObject.put("section_header_text_color", c(w05, w10));
            jSONObject.put("section_separator_color", c(k6.r1(0.12f, w02), w10));
            jSONObject.put("header_bg_color", c(w11, w10));
            jSONObject.put("bottom_bar_bg_color", c(w11, w10));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("text", c(w05, w10));
            JSONObject jSONObject3 = new JSONObject();
            if (!q10) {
                obj = "light";
            } else {
                obj = "dark";
            }
            jSONObject3.put("colorScheme", obj);
            jSONObject3.put("params", jSONObject);
            jSONObject3.put("button", jSONObject2);
            jSONObject3.put("text", e());
            return jSONObject3.toString();
        } catch (Exception e10) {
            a8.g(e10, true);
            StringBuilder sb2 = new StringBuilder("{\"colorScheme\":\"");
            if (q10) {
                str = "dark";
            }
            return a1.g.s(sb2, str, "\"}");
        }
    }

    public static int b(e6 e6Var, boolean z10) {
        int i3;
        int i10;
        int i11;
        if (z10) {
            i3 = f52891b[0];
        } else {
            i3 = f52890a[0];
        }
        int w02 = k6.w0(i3, e6Var);
        if (z10) {
            int[] iArr = f52892c;
            int i12 = iArr[0];
            if (e6Var != null) {
                i10 = e6Var.j(i12);
            } else {
                i10 = k6.im.get(i12);
            }
            if (i10 != 0) {
                int red = Color.red(w02);
                int green = Color.green(w02);
                int blue = Color.blue(w02);
                int i13 = 1;
                for (int i14 : iArr) {
                    if (e6Var != null) {
                        i11 = e6Var.j(i14);
                    } else {
                        i11 = k6.im.get(i14);
                    }
                    if (i11 != 0) {
                        int red2 = Color.red(i11) + red;
                        int green2 = Color.green(i11) + green;
                        i13++;
                        blue = Color.blue(i11) + blue;
                        green = green2;
                        red = red2;
                    }
                }
                return Color.argb(Color.alpha(w02), red / i13, green / i13, blue / i13);
            }
        }
        return w02;
    }

    public static String c(int i3, int i10) {
        int w10 = k6.w(i10, i3);
        return String.format(Locale.US, "#%02x%02x%02x", Integer.valueOf(Color.red(w10)), Integer.valueOf(Color.green(w10)), Integer.valueOf(Color.blue(w10)));
    }

    public static int d(e6 e6Var, boolean z10) {
        int i3;
        int[] iArr;
        int[] iArr2;
        int i10;
        int i11 = 0;
        if (e6Var == null ? k6.I.q() : e6Var.a()) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (z10) {
            iArr = f52891b;
        } else {
            iArr = f52890a;
        }
        for (int i12 : iArr) {
            i3 = (i3 * 31) + k6.w0(i12, e6Var);
        }
        if (z10) {
            for (int i13 : f52892c) {
                int i14 = i3 * 31;
                if (e6Var != null) {
                    i10 = e6Var.j(i13);
                } else {
                    i10 = k6.im.get(i13);
                }
                i3 = i14 + i10;
            }
        }
        int w02 = (((k6.w0(k6.f28102p7, e6Var) + ((k6.w0(k6.Gi, e6Var) + ((k6.w0(k6.Ci, e6Var) + (i3 * 31)) * 31)) * 31)) * 31) + az.W0) * 31;
        TextPaint textPaint = k6.f28077o2;
        if (textPaint != null) {
            i11 = Float.floatToIntBits(textPaint.getTextSize());
        }
        return gk0.j0() + ((w02 + i11) * 31);
    }

    public static JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fontSize", az.W0);
        TextPaint textPaint = k6.f28077o2;
        if (textPaint != null && textPaint.getTextSize() > 0.0f) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            jSONObject.put("lineHeight", Math.round(Math.max(1.0f, Math.min(3.0f, ((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading) / textPaint.getTextSize())) * 100.0f) / 100.0d);
        }
        int round = Math.round(gk0.j0() / org.telegram.messenger.g0.f22607p);
        jSONObject.put("padding", "8px " + round + "px");
        return jSONObject;
    }
}
