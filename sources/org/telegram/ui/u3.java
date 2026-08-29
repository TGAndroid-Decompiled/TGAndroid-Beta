package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class u3 {
    public TextPaint f43147a;
    public final SparseArray f43148b = new SparseArray();
    public final SparseArray f43149c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f43150e = new SparseArray();
    public final SparseArray f43151f = new SparseArray();
    public final SparseArray f43152g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f43153i = new SparseArray();
    public final SparseArray f43154j = new SparseArray();
    public final SparseArray f43155k = new SparseArray();
    public final SparseArray f43156l = new SparseArray();
    public final SparseArray f43157m = new SparseArray();
    public final SparseArray f43158n = new SparseArray();
    public final SparseArray f43159o = new SparseArray();
    public final SparseArray f43160p = new SparseArray();
    public final SparseArray f43161q = new SparseArray();
    public final SparseArray f43162r = new SparseArray();
    public final SparseArray f43163s = new SparseArray();
    public final SparseArray f43164t = new SparseArray();
    public final SparseArray f43165u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f43166w = new SparseArray();
    public final SparseArray f43167x = new SparseArray();
    public final SparseArray f43168y = new SparseArray();
    public final SparseArray f43169z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(m4 m4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(m4Var.b());
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
                }
            }
        }
    }

    public static void b(int i10, TextPaint textPaint, Typeface typeface, Typeface typeface2, Typeface typeface3, Typeface typeface4) {
        int i11 = i10 & 1;
        if (i11 != 0 && (i10 & 2) != 0) {
            textPaint.setTypeface(typeface2);
        } else if (i11 != 0) {
            textPaint.setTypeface(typeface3);
        } else if ((i10 & 2) != 0) {
            textPaint.setTypeface(typeface4);
        } else if ((i10 & 4) != 0) {
        } else {
            textPaint.setTypeface(typeface);
        }
    }
}
