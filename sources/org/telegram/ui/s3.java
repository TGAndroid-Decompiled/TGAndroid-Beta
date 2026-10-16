package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class s3 {
    public TextPaint f39667a;
    public final SparseArray f39668b = new SparseArray();
    public final SparseArray f39669c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f39670f = new SparseArray();
    public final SparseArray f39671g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f39672i = new SparseArray();
    public final SparseArray f39673j = new SparseArray();
    public final SparseArray f39674k = new SparseArray();
    public final SparseArray f39675l = new SparseArray();
    public final SparseArray f39676m = new SparseArray();
    public final SparseArray f39677n = new SparseArray();
    public final SparseArray f39678o = new SparseArray();
    public final SparseArray f39679p = new SparseArray();
    public final SparseArray f39680q = new SparseArray();
    public final SparseArray f39681r = new SparseArray();
    public final SparseArray f39682s = new SparseArray();
    public final SparseArray f39683t = new SparseArray();
    public final SparseArray f39684u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f39685w = new SparseArray();
    public final SparseArray f39686x = new SparseArray();
    public final SparseArray f39687y = new SparseArray();
    public final SparseArray f39688z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(k4 k4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(k4Var.b());
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.J6, false));
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
