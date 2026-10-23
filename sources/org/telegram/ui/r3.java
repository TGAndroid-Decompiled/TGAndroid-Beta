package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class r3 {
    public TextPaint f40986a;
    public final SparseArray f40987b = new SparseArray();
    public final SparseArray f40988c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f40989f = new SparseArray();
    public final SparseArray f40990g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f40991i = new SparseArray();
    public final SparseArray f40992j = new SparseArray();
    public final SparseArray f40993k = new SparseArray();
    public final SparseArray f40994l = new SparseArray();
    public final SparseArray f40995m = new SparseArray();
    public final SparseArray f40996n = new SparseArray();
    public final SparseArray f40997o = new SparseArray();
    public final SparseArray f40998p = new SparseArray();
    public final SparseArray f40999q = new SparseArray();
    public final SparseArray f41000r = new SparseArray();
    public final SparseArray f41001s = new SparseArray();
    public final SparseArray f41002t = new SparseArray();
    public final SparseArray f41003u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f41004w = new SparseArray();
    public final SparseArray f41005x = new SparseArray();
    public final SparseArray f41006y = new SparseArray();
    public final SparseArray f41007z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(f70 f70Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(f70Var.b());
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
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
