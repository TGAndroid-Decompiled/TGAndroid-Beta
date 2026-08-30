package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class t3 {
    public TextPaint f38505a;
    public final SparseArray f38506b = new SparseArray();
    public final SparseArray f38507c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f38508f = new SparseArray();
    public final SparseArray f38509g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f38510i = new SparseArray();
    public final SparseArray f38511j = new SparseArray();
    public final SparseArray f38512k = new SparseArray();
    public final SparseArray f38513l = new SparseArray();
    public final SparseArray f38514m = new SparseArray();
    public final SparseArray f38515n = new SparseArray();
    public final SparseArray f38516o = new SparseArray();
    public final SparseArray f38517p = new SparseArray();
    public final SparseArray f38518q = new SparseArray();
    public final SparseArray f38519r = new SparseArray();
    public final SparseArray f38520s = new SparseArray();
    public final SparseArray f38521t = new SparseArray();
    public final SparseArray f38522u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f38523w = new SparseArray();
    public final SparseArray f38524x = new SparseArray();
    public final SparseArray f38525y = new SparseArray();
    public final SparseArray f38526z = new SparseArray();
    public final SparseArray A = new SparseArray();

    public static void a(l4 l4Var, SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            TextPaint textPaint = (TextPaint) sparseArray.valueAt(i10);
            if (textPaint != null) {
                if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                    textPaint.setColor(l4Var.b());
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
