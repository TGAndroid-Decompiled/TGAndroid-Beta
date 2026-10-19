package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class s3 {
    public TextPaint f41330a;
    public final SparseArray f41331b = new SparseArray();
    public final SparseArray f41332c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f41333f = new SparseArray();
    public final SparseArray f41334g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f41335i = new SparseArray();
    public final SparseArray f41336j = new SparseArray();
    public final SparseArray f41337k = new SparseArray();
    public final SparseArray f41338l = new SparseArray();
    public final SparseArray f41339m = new SparseArray();
    public final SparseArray f41340n = new SparseArray();
    public final SparseArray f41341o = new SparseArray();
    public final SparseArray f41342p = new SparseArray();
    public final SparseArray f41343q = new SparseArray();
    public final SparseArray f41344r = new SparseArray();
    public final SparseArray f41345s = new SparseArray();
    public final SparseArray f41346t = new SparseArray();
    public final SparseArray f41347u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f41348w = new SparseArray();
    public final SparseArray f41349x = new SparseArray();
    public final SparseArray f41350y = new SparseArray();
    public final SparseArray f41351z = new SparseArray();
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
