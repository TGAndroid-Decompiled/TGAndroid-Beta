package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class t3 {
    public TextPaint f41400a;
    public final SparseArray f41401b = new SparseArray();
    public final SparseArray f41402c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray f41403e = new SparseArray();
    public final SparseArray f41404f = new SparseArray();
    public final SparseArray f41405g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f41406i = new SparseArray();
    public final SparseArray f41407j = new SparseArray();
    public final SparseArray f41408k = new SparseArray();
    public final SparseArray f41409l = new SparseArray();
    public final SparseArray f41410m = new SparseArray();
    public final SparseArray f41411n = new SparseArray();
    public final SparseArray f41412o = new SparseArray();
    public final SparseArray f41413p = new SparseArray();
    public final SparseArray f41414q = new SparseArray();
    public final SparseArray f41415r = new SparseArray();
    public final SparseArray f41416s = new SparseArray();
    public final SparseArray f41417t = new SparseArray();
    public final SparseArray f41418u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f41419w = new SparseArray();
    public final SparseArray f41420x = new SparseArray();
    public final SparseArray f41421y = new SparseArray();
    public final SparseArray f41422z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(l4 l4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(l4Var.b());
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.J6, false));
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
