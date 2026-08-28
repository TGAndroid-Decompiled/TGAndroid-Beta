package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class t3 {
    public TextPaint f42822a;
    public final SparseArray f42823b = new SparseArray();
    public final SparseArray f42824c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f42825e = new SparseArray();
    public final SparseArray f42826f = new SparseArray();
    public final SparseArray f42827g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f42828i = new SparseArray();
    public final SparseArray f42829j = new SparseArray();
    public final SparseArray f42830k = new SparseArray();
    public final SparseArray f42831l = new SparseArray();
    public final SparseArray f42832m = new SparseArray();
    public final SparseArray f42833n = new SparseArray();
    public final SparseArray f42834o = new SparseArray();
    public final SparseArray f42835p = new SparseArray();
    public final SparseArray f42836q = new SparseArray();
    public final SparseArray f42837r = new SparseArray();
    public final SparseArray f42838s = new SparseArray();
    public final SparseArray f42839t = new SparseArray();
    public final SparseArray f42840u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f42841w = new SparseArray();
    public final SparseArray f42842x = new SparseArray();
    public final SparseArray f42843y = new SparseArray();
    public final SparseArray f42844z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(l4 l4Var, SparseArray sparseArray) {
        for (int i9 = 0; i9 < sparseArray.size(); i9++) {
            int keyAt = sparseArray.keyAt(i9);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i9);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(l4Var.b());
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J6, false));
                }
            }
        }
    }

    public static void b(int i9, TextPaint textPaint, Typeface typeface, Typeface typeface2, Typeface typeface3, Typeface typeface4) {
        int i10 = i9 & 1;
        if (i10 != 0 && (i9 & 2) != 0) {
            textPaint.setTypeface(typeface2);
        } else if (i10 != 0) {
            textPaint.setTypeface(typeface3);
        } else if ((i9 & 2) != 0) {
            textPaint.setTypeface(typeface4);
        } else if ((i9 & 4) != 0) {
        } else {
            textPaint.setTypeface(typeface);
        }
    }
}
