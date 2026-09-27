package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class r3 {
    public TextPaint f36964a;
    public final SparseArray f36965b = new SparseArray();
    public final SparseArray f36966c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f36967f = new SparseArray();
    public final SparseArray f36968g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f36969i = new SparseArray();
    public final SparseArray f36970j = new SparseArray();
    public final SparseArray f36971k = new SparseArray();
    public final SparseArray f36972l = new SparseArray();
    public final SparseArray f36973m = new SparseArray();
    public final SparseArray f36974n = new SparseArray();
    public final SparseArray f36975o = new SparseArray();
    public final SparseArray f36976p = new SparseArray();
    public final SparseArray f36977q = new SparseArray();
    public final SparseArray f36978r = new SparseArray();
    public final SparseArray f36979s = new SparseArray();
    public final SparseArray f36980t = new SparseArray();
    public final SparseArray f36981u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f36982w = new SparseArray();
    public final SparseArray f36983x = new SparseArray();
    public final SparseArray f36984y = new SparseArray();
    public final SparseArray f36985z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(j4 j4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(j4Var.b());
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J6, false));
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
