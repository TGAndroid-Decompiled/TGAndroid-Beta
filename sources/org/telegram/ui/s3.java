package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class s3 {
    public TextPaint f41336a;
    public final SparseArray f41337b = new SparseArray();
    public final SparseArray f41338c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f41339f = new SparseArray();
    public final SparseArray f41340g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f41341i = new SparseArray();
    public final SparseArray f41342j = new SparseArray();
    public final SparseArray f41343k = new SparseArray();
    public final SparseArray f41344l = new SparseArray();
    public final SparseArray f41345m = new SparseArray();
    public final SparseArray f41346n = new SparseArray();
    public final SparseArray f41347o = new SparseArray();
    public final SparseArray f41348p = new SparseArray();
    public final SparseArray f41349q = new SparseArray();
    public final SparseArray f41350r = new SparseArray();
    public final SparseArray f41351s = new SparseArray();
    public final SparseArray f41352t = new SparseArray();
    public final SparseArray f41353u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f41354w = new SparseArray();
    public final SparseArray f41355x = new SparseArray();
    public final SparseArray f41356y = new SparseArray();
    public final SparseArray f41357z = new SparseArray();
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
