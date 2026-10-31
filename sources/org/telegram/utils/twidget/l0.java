package org.telegram.utils.twidget;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.f8;
import org.telegram.messenger.tz;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gl0;
public abstract class l0 {
    public static final int[] f44392a = {t6.f21190ra, t6.Sc, t6.f20899be, t6.Uc, t6.Kd};
    public static final int[] f44393b = {t6.f21139ob, t6.Tc, t6.gc, t6.Vc, t6.Qb};
    public static final int[] f44394c = {t6.f21191rb, t6.f21209sb, t6.f21228tb};

    public static String a(p6 p6Var, boolean z10) {
        boolean q6;
        int[] iArr;
        int i10;
        Object obj;
        String str = "light";
        if (p6Var != null) {
            q6 = p6Var.a();
        } else {
            q6 = t6.I.q();
        }
        if (z10) {
            iArr = f44393b;
        } else {
            iArr = f44392a;
        }
        try {
            int b10 = b(p6Var, z10);
            if (q6) {
                i10 = -16777216;
            } else {
                i10 = -1;
            }
            int w9 = t6.w(i10, b10);
            int w02 = t6.w0(iArr[1], p6Var);
            int w03 = t6.w0(iArr[2], p6Var);
            int w04 = t6.w0(iArr[3], p6Var);
            int w05 = t6.w0(iArr[4], p6Var);
            int w06 = t6.w0(t6.Ci, p6Var);
            int w07 = t6.w0(t6.Gi, p6Var);
            int w10 = t6.w(w9, t6.r1(0.1f, w05));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bg_color", c(w9, w9));
            jSONObject.put("text_color", c(w02, w9));
            jSONObject.put("hint_color", c(w03, w9));
            jSONObject.put("link_color", c(w04, w9));
            jSONObject.put("button_color", c(w06, w9));
            jSONObject.put("button_text_color", c(w07, w06));
            jSONObject.put("secondary_bg_color", c(w10, w9));
            jSONObject.put("accent_text_color", c(w05, w9));
            jSONObject.put("subtitle_text_color", c(w03, w9));
            jSONObject.put("destructive_text_color", c(t6.w0(t6.f21153p7, p6Var), w9));
            jSONObject.put("section_bg_color", c(w9, w9));
            jSONObject.put("section_header_text_color", c(w05, w9));
            jSONObject.put("section_separator_color", c(t6.r1(0.12f, w02), w9));
            jSONObject.put("header_bg_color", c(w10, w9));
            jSONObject.put("bottom_bar_bg_color", c(w10, w9));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("text", c(w05, w9));
            JSONObject jSONObject3 = new JSONObject();
            if (!q6) {
                obj = "light";
            } else {
                obj = "dark";
            }
            jSONObject3.put("colorScheme", obj);
            jSONObject3.put("params", jSONObject);
            jSONObject3.put("button", jSONObject2);
            jSONObject3.put("text", f());
            return jSONObject3.toString();
        } catch (Exception e) {
            f8.g(e, true);
            StringBuilder sb2 = new StringBuilder("{\"colorScheme\":\"");
            if (q6) {
                str = "dark";
            }
            return a1.g.r(sb2, str, "\"}");
        }
    }

    public static int b(p6 p6Var, boolean z10) {
        int i10;
        int i11;
        int i12;
        if (z10) {
            i10 = f44393b[0];
        } else {
            i10 = f44392a[0];
        }
        int w02 = t6.w0(i10, p6Var);
        if (z10) {
            int[] iArr = f44394c;
            int i13 = iArr[0];
            if (p6Var != null) {
                i11 = p6Var.j(i13);
            } else {
                i11 = t6.im.get(i13);
            }
            if (i11 != 0) {
                int red = Color.red(w02);
                int green = Color.green(w02);
                int blue = Color.blue(w02);
                int i14 = 1;
                for (int i15 : iArr) {
                    if (p6Var != null) {
                        i12 = p6Var.j(i15);
                    } else {
                        i12 = t6.im.get(i15);
                    }
                    if (i12 != 0) {
                        int red2 = Color.red(i12) + red;
                        int green2 = Color.green(i12) + green;
                        i14++;
                        blue = Color.blue(i12) + blue;
                        green = green2;
                        red = red2;
                    }
                }
                return Color.argb(Color.alpha(w02), red / i14, green / i14, blue / i14);
            }
        }
        return w02;
    }

    public static String c(int i10, int i11) {
        int w9 = t6.w(i11, i10);
        return String.format(Locale.US, "#%02x%02x%02x", Integer.valueOf(Color.red(w9)), Integer.valueOf(Color.green(w9)), Integer.valueOf(Color.blue(w9)));
    }

    public static String d(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder("{\"colorScheme\":\"");
        if (z10) {
            str = "dark";
        } else {
            str = "light";
        }
        return a1.g.r(sb2, str, "\"}");
    }

    public static int e(p6 p6Var, boolean z10) {
        int i10;
        int[] iArr;
        int[] iArr2;
        int i11;
        int i12 = 0;
        if (p6Var == null ? t6.I.q() : p6Var.a()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (z10) {
            iArr = f44393b;
        } else {
            iArr = f44392a;
        }
        for (int i13 : iArr) {
            i10 = (i10 * 31) + t6.w0(i13, p6Var);
        }
        if (z10) {
            for (int i14 : f44394c) {
                int i15 = i10 * 31;
                if (p6Var != null) {
                    i11 = p6Var.j(i14);
                } else {
                    i11 = t6.im.get(i14);
                }
                i10 = i15 + i11;
            }
        }
        int w02 = (((t6.w0(t6.f21153p7, p6Var) + ((t6.w0(t6.Gi, p6Var) + ((t6.w0(t6.Ci, p6Var) + (i10 * 31)) * 31)) * 31)) * 31) + tz.W0) * 31;
        TextPaint textPaint = t6.f21130o2;
        if (textPaint != null) {
            i12 = Float.floatToIntBits(textPaint.getTextSize());
        }
        return gl0.i0() + ((w02 + i12) * 31);
    }

    public static JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fontSize", tz.W0);
        TextPaint textPaint = t6.f21130o2;
        if (textPaint != null && textPaint.getTextSize() > 0.0f) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            jSONObject.put("lineHeight", Math.round(Math.max(1.0f, Math.min(3.0f, ((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading) / textPaint.getTextSize())) * 100.0f) / 100.0d);
        }
        int round = Math.round(gl0.i0() / org.telegram.messenger.i0.f16025p);
        jSONObject.put("padding", "8px " + round + "px");
        return jSONObject;
    }
}
