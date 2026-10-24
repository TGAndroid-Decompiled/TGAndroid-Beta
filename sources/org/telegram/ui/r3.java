package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class r3 {
    public TextPaint f40998a;
    public final SparseArray f40999b = new SparseArray();
    public final SparseArray f41000c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f41001f = new SparseArray();
    public final SparseArray f41002g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f41003i = new SparseArray();
    public final SparseArray f41004j = new SparseArray();
    public final SparseArray f41005k = new SparseArray();
    public final SparseArray f41006l = new SparseArray();
    public final SparseArray f41007m = new SparseArray();
    public final SparseArray f41008n = new SparseArray();
    public final SparseArray f41009o = new SparseArray();
    public final SparseArray f41010p = new SparseArray();
    public final SparseArray f41011q = new SparseArray();
    public final SparseArray f41012r = new SparseArray();
    public final SparseArray f41013s = new SparseArray();
    public final SparseArray f41014t = new SparseArray();
    public final SparseArray f41015u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f41016w = new SparseArray();
    public final SparseArray f41017x = new SparseArray();
    public final SparseArray f41018y = new SparseArray();
    public final SparseArray f41019z = new SparseArray();
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
