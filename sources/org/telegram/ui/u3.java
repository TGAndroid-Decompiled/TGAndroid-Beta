package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;

public final class u3 {

    public TextPaint f43080a;

    public final SparseArray f43081b = new SparseArray();

    public final SparseArray f43082c = new SparseArray();
    public final SparseArray d = new SparseArray();

    public final SparseArray f43083e = new SparseArray();

    public final SparseArray f43084f = new SparseArray();

    public final SparseArray f43085g = new SparseArray();
    public final SparseArray h = new SparseArray();

    public final SparseArray f43086i = new SparseArray();

    public final SparseArray f43087j = new SparseArray();

    public final SparseArray f43088k = new SparseArray();

    public final SparseArray f43089l = new SparseArray();

    public final SparseArray f43090m = new SparseArray();

    public final SparseArray f43091n = new SparseArray();

    public final SparseArray f43092o = new SparseArray();

    public final SparseArray f43093p = new SparseArray();

    public final SparseArray f43094q = new SparseArray();

    public final SparseArray f43095r = new SparseArray();

    public final SparseArray f43096s = new SparseArray();

    public final SparseArray f43097t = new SparseArray();

    public final SparseArray f43098u = new SparseArray();
    public final SparseArray v = new SparseArray();

    public final SparseArray f43099w = new SparseArray();

    public final SparseArray f43100x = new SparseArray();

    public final SparseArray f43101y = new SparseArray();

    public final SparseArray f43102z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(m4 m4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((iKeyAt & 8) == 0 && (iKeyAt & 512) == 0) {
                    textPaint.setColor(m4Var.b());
                } else {
                    textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
                }
            }
        }
    }

    public static void b(int i10, TextPaint textPaint, Typeface typeface, Typeface typeface2, Typeface typeface3, Typeface typeface4) {
        int i11 = i10 & 1;
        if (i11 != 0 && (i10 & 2) != 0) {
            textPaint.setTypeface(typeface2);
            return;
        }
        if (i11 != 0) {
            textPaint.setTypeface(typeface3);
        } else if ((i10 & 2) != 0) {
            textPaint.setTypeface(typeface4);
        } else {
            if ((i10 & 4) != 0) {
                return;
            }
            textPaint.setTypeface(typeface);
        }
    }
}
