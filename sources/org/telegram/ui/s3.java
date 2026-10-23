package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class s3 {
    public TextPaint f41340a;
    public final SparseArray f41341b = new SparseArray();
    public final SparseArray f41342c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f41343f = new SparseArray();
    public final SparseArray f41344g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f41345i = new SparseArray();
    public final SparseArray f41346j = new SparseArray();
    public final SparseArray f41347k = new SparseArray();
    public final SparseArray f41348l = new SparseArray();
    public final SparseArray f41349m = new SparseArray();
    public final SparseArray f41350n = new SparseArray();
    public final SparseArray f41351o = new SparseArray();
    public final SparseArray f41352p = new SparseArray();
    public final SparseArray f41353q = new SparseArray();
    public final SparseArray f41354r = new SparseArray();
    public final SparseArray f41355s = new SparseArray();
    public final SparseArray f41356t = new SparseArray();
    public final SparseArray f41357u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f41358w = new SparseArray();
    public final SparseArray f41359x = new SparseArray();
    public final SparseArray f41360y = new SparseArray();
    public final SparseArray f41361z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(l4 l4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(l4Var.b());
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
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
