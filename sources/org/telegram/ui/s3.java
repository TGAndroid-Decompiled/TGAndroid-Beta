package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class s3 {
    public TextPaint f40857a;
    public final SparseArray f40858b = new SparseArray();
    public final SparseArray f40859c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f40860f = new SparseArray();
    public final SparseArray f40861g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f40862i = new SparseArray();
    public final SparseArray f40863j = new SparseArray();
    public final SparseArray f40864k = new SparseArray();
    public final SparseArray f40865l = new SparseArray();
    public final SparseArray f40866m = new SparseArray();
    public final SparseArray f40867n = new SparseArray();
    public final SparseArray f40868o = new SparseArray();
    public final SparseArray f40869p = new SparseArray();
    public final SparseArray f40870q = new SparseArray();
    public final SparseArray f40871r = new SparseArray();
    public final SparseArray f40872s = new SparseArray();
    public final SparseArray f40873t = new SparseArray();
    public final SparseArray f40874u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f40875w = new SparseArray();
    public final SparseArray f40876x = new SparseArray();
    public final SparseArray f40877y = new SparseArray();
    public final SparseArray f40878z = new SparseArray();
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
