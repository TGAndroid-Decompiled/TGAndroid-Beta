package org.telegram.utils.twidget;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.bz;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.rk0;
public abstract class q1 {
    public static final int[] f55039a = {n6.f29714ra, n6.Vc, n6.f29477ee, n6.Xc, n6.Nd};
    public static final int[] f55040b = {n6.f29715rb, n6.Wc, n6.f29566jc, n6.Yc, n6.Tb};
    public static final int[] f55041c = {n6.f29772ub, n6.f29791vb, n6.f29810wb};

    public static String a(i6 i6Var, boolean z10) {
        boolean q10;
        int[] iArr;
        int i7;
        Object obj;
        String str = "light";
        if (i6Var != null) {
            q10 = i6Var.b();
        } else {
            q10 = n6.I.q();
        }
        if (z10) {
            iArr = f55040b;
        } else {
            iArr = f55039a;
        }
        try {
            int b10 = b(i6Var, z10);
            if (q10) {
                i7 = -16777216;
            } else {
                i7 = -1;
            }
            int w10 = n6.w(i7, b10);
            int w02 = n6.w0(iArr[1], i6Var);
            int w03 = n6.w0(iArr[2], i6Var);
            int w04 = n6.w0(iArr[3], i6Var);
            int w05 = n6.w0(iArr[4], i6Var);
            int w06 = n6.w0(n6.Fi, i6Var);
            int w07 = n6.w0(n6.Ji, i6Var);
            int w11 = n6.w(w10, n6.r1(0.1f, w05));
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
            jSONObject.put("destructive_text_color", c(n6.w0(n6.f29672p7, i6Var), w10));
            jSONObject.put("section_bg_color", c(w10, w10));
            jSONObject.put("section_header_text_color", c(w05, w10));
            jSONObject.put("section_separator_color", c(n6.r1(0.12f, w02), w10));
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
            jSONObject3.put("text", f());
            return jSONObject3.toString();
        } catch (Exception e10) {
            a8.g(e10, true);
            StringBuilder sb2 = new StringBuilder("{\"colorScheme\":\"");
            if (q10) {
                str = "dark";
            }
            return a8.p0.s(sb2, str, "\"}");
        }
    }

    public static int b(i6 i6Var, boolean z10) {
        int i7;
        int i10;
        int i11;
        if (z10) {
            i7 = f55040b[0];
        } else {
            i7 = f55039a[0];
        }
        int w02 = n6.w0(i7, i6Var);
        if (z10) {
            int[] iArr = f55041c;
            int i12 = iArr[0];
            if (i6Var != null) {
                i10 = i6Var.k(i12);
            } else {
                i10 = n6.lm.get(i12);
            }
            if (i10 != 0) {
                int red = Color.red(w02);
                int green = Color.green(w02);
                int blue = Color.blue(w02);
                int i13 = 1;
                for (int i14 : iArr) {
                    if (i6Var != null) {
                        i11 = i6Var.k(i14);
                    } else {
                        i11 = n6.lm.get(i14);
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

    public static String c(int i7, int i10) {
        int w10 = n6.w(i10, i7);
        return String.format(Locale.US, "#%02x%02x%02x", Integer.valueOf(Color.red(w10)), Integer.valueOf(Color.green(w10)), Integer.valueOf(Color.blue(w10)));
    }

    public static String d(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder("{\"colorScheme\":\"");
        if (z10) {
            str = "dark";
        } else {
            str = "light";
        }
        return a8.p0.s(sb2, str, "\"}");
    }

    public static int e(i6 i6Var, boolean z10) {
        int i7;
        int[] iArr;
        int[] iArr2;
        int i10;
        int i11 = 0;
        if (i6Var == null ? n6.I.q() : i6Var.b()) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (z10) {
            iArr = f55040b;
        } else {
            iArr = f55039a;
        }
        for (int i12 : iArr) {
            i7 = (i7 * 31) + n6.w0(i12, i6Var);
        }
        if (z10) {
            for (int i13 : f55041c) {
                int i14 = i7 * 31;
                if (i6Var != null) {
                    i10 = i6Var.k(i13);
                } else {
                    i10 = n6.lm.get(i13);
                }
                i7 = i14 + i10;
            }
        }
        int w02 = (((n6.w0(n6.f29672p7, i6Var) + ((n6.w0(n6.Ji, i6Var) + ((n6.w0(n6.Fi, i6Var) + (i7 * 31)) * 31)) * 31)) * 31) + bz.W0) * 31;
        TextPaint textPaint = n6.f29648o2;
        if (textPaint != null) {
            i11 = Float.floatToIntBits(textPaint.getTextSize());
        }
        return rk0.j0() + ((w02 + i11) * 31);
    }

    public static JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fontSize", bz.W0);
        TextPaint textPaint = n6.f29648o2;
        if (textPaint != null && textPaint.getTextSize() > 0.0f) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            jSONObject.put("lineHeight", Math.round(Math.max(1.0f, Math.min(3.0f, ((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading) / textPaint.getTextSize())) * 100.0f) / 100.0d);
        }
        int round = Math.round(rk0.j0() / org.telegram.messenger.g0.f24225p);
        jSONObject.put("padding", "8px " + round + "px");
        return jSONObject;
    }
}
