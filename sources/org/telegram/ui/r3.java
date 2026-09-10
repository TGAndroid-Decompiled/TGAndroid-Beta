package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class r3 {
    public TextPaint f36180a;
    public final SparseArray f36181b = new SparseArray();
    public final SparseArray f36182c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f36183f = new SparseArray();
    public final SparseArray f36184g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f36185i = new SparseArray();
    public final SparseArray f36186j = new SparseArray();
    public final SparseArray f36187k = new SparseArray();
    public final SparseArray f36188l = new SparseArray();
    public final SparseArray f36189m = new SparseArray();
    public final SparseArray f36190n = new SparseArray();
    public final SparseArray f36191o = new SparseArray();
    public final SparseArray f36192p = new SparseArray();
    public final SparseArray f36193q = new SparseArray();
    public final SparseArray f36194r = new SparseArray();
    public final SparseArray f36195s = new SparseArray();
    public final SparseArray f36196t = new SparseArray();
    public final SparseArray f36197u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f36198w = new SparseArray();
    public final SparseArray f36199x = new SparseArray();
    public final SparseArray f36200y = new SparseArray();
    public final SparseArray f36201z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(j4 j4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(j4Var.b());
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
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
