package org.telegram.utils.twidget;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.gz;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.hk0;
public abstract class m1 {
    public static final int[] f54332a = {j6.f29112ra, j6.Vc, j6.f28875ee, j6.Xc, j6.Nd};
    public static final int[] f54333b = {j6.f29113rb, j6.Wc, j6.f28964jc, j6.Yc, j6.Tb};
    public static final int[] f54334c = {j6.f29170ub, j6.f29189vb, j6.f29208wb};

    public static String a(e6 e6Var, boolean z10) {
        boolean q10;
        int[] iArr;
        int i7;
        Object obj;
        String str = "light";
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = j6.I.q();
        }
        if (z10) {
            iArr = f54333b;
        } else {
            iArr = f54332a;
        }
        try {
            int b10 = b(e6Var, z10);
            if (q10) {
                i7 = -16777216;
            } else {
                i7 = -1;
            }
            int w10 = j6.w(i7, b10);
            int w02 = j6.w0(iArr[1], e6Var);
            int w03 = j6.w0(iArr[2], e6Var);
            int w04 = j6.w0(iArr[3], e6Var);
            int w05 = j6.w0(iArr[4], e6Var);
            int w06 = j6.w0(j6.Fi, e6Var);
            int w07 = j6.w0(j6.Ji, e6Var);
            int w11 = j6.w(w10, j6.r1(0.1f, w05));
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
            jSONObject.put("destructive_text_color", c(j6.w0(j6.f29070p7, e6Var), w10));
            jSONObject.put("section_bg_color", c(w10, w10));
            jSONObject.put("section_header_text_color", c(w05, w10));
            jSONObject.put("section_separator_color", c(j6.r1(0.12f, w02), w10));
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
            return a8.p0.s(sb2, str, "\"}");
        }
    }

    public static int b(e6 e6Var, boolean z10) {
        int i7;
        int i10;
        int i11;
        if (z10) {
            i7 = f54333b[0];
        } else {
            i7 = f54332a[0];
        }
        int w02 = j6.w0(i7, e6Var);
        if (z10) {
            int[] iArr = f54334c;
            int i12 = iArr[0];
            if (e6Var != null) {
                i10 = e6Var.j(i12);
            } else {
                i10 = j6.lm.get(i12);
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
                        i11 = j6.lm.get(i14);
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
        int w10 = j6.w(i10, i7);
        return String.format(Locale.US, "#%02x%02x%02x", Integer.valueOf(Color.red(w10)), Integer.valueOf(Color.green(w10)), Integer.valueOf(Color.blue(w10)));
    }

    public static int d(e6 e6Var, boolean z10) {
        int i7;
        int[] iArr;
        int[] iArr2;
        int i10;
        int i11 = 0;
        if (e6Var == null ? j6.I.q() : e6Var.a()) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (z10) {
            iArr = f54333b;
        } else {
            iArr = f54332a;
        }
        for (int i12 : iArr) {
            i7 = (i7 * 31) + j6.w0(i12, e6Var);
        }
        if (z10) {
            for (int i13 : f54334c) {
                int i14 = i7 * 31;
                if (e6Var != null) {
                    i10 = e6Var.j(i13);
                } else {
                    i10 = j6.lm.get(i13);
                }
                i7 = i14 + i10;
            }
        }
        int w02 = (((j6.w0(j6.f29070p7, e6Var) + ((j6.w0(j6.Ji, e6Var) + ((j6.w0(j6.Fi, e6Var) + (i7 * 31)) * 31)) * 31)) * 31) + gz.W0) * 31;
        TextPaint textPaint = j6.f29046o2;
        if (textPaint != null) {
            i11 = Float.floatToIntBits(textPaint.getTextSize());
        }
        return hk0.j0() + ((w02 + i11) * 31);
    }

    public static JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fontSize", gz.W0);
        TextPaint textPaint = j6.f29046o2;
        if (textPaint != null && textPaint.getTextSize() > 0.0f) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            jSONObject.put("lineHeight", Math.round(Math.max(1.0f, Math.min(3.0f, ((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading) / textPaint.getTextSize())) * 100.0f) / 100.0d);
        }
        int round = Math.round(hk0.j0() / org.telegram.messenger.g0.f23608p);
        jSONObject.put("padding", "8px " + round + "px");
        return jSONObject;
    }
}
