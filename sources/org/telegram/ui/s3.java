package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class s3 {
    public TextPaint f40895a;
    public final SparseArray f40896b = new SparseArray();
    public final SparseArray f40897c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f40898f = new SparseArray();
    public final SparseArray f40899g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f40900i = new SparseArray();
    public final SparseArray f40901j = new SparseArray();
    public final SparseArray f40902k = new SparseArray();
    public final SparseArray f40903l = new SparseArray();
    public final SparseArray f40904m = new SparseArray();
    public final SparseArray f40905n = new SparseArray();
    public final SparseArray f40906o = new SparseArray();
    public final SparseArray f40907p = new SparseArray();
    public final SparseArray f40908q = new SparseArray();
    public final SparseArray f40909r = new SparseArray();
    public final SparseArray f40910s = new SparseArray();
    public final SparseArray f40911t = new SparseArray();
    public final SparseArray f40912u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f40913w = new SparseArray();
    public final SparseArray f40914x = new SparseArray();
    public final SparseArray f40915y = new SparseArray();
    public final SparseArray f40916z = new SparseArray();
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
