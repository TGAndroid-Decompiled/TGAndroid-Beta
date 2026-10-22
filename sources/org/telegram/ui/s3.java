package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class s3 {
    public TextPaint f41339a;
    public final SparseArray f41340b = new SparseArray();
    public final SparseArray f41341c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f41342f = new SparseArray();
    public final SparseArray f41343g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f41344i = new SparseArray();
    public final SparseArray f41345j = new SparseArray();
    public final SparseArray f41346k = new SparseArray();
    public final SparseArray f41347l = new SparseArray();
    public final SparseArray f41348m = new SparseArray();
    public final SparseArray f41349n = new SparseArray();
    public final SparseArray f41350o = new SparseArray();
    public final SparseArray f41351p = new SparseArray();
    public final SparseArray f41352q = new SparseArray();
    public final SparseArray f41353r = new SparseArray();
    public final SparseArray f41354s = new SparseArray();
    public final SparseArray f41355t = new SparseArray();
    public final SparseArray f41356u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f41357w = new SparseArray();
    public final SparseArray f41358x = new SparseArray();
    public final SparseArray f41359y = new SparseArray();
    public final SparseArray f41360z = new SparseArray();
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
