package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.SparseArray;
public final class s3 {
    public TextPaint f40874a;
    public final SparseArray f40875b = new SparseArray();
    public final SparseArray f40876c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f40877f = new SparseArray();
    public final SparseArray f40878g = new SparseArray();
    public final SparseArray h = new SparseArray();
    public final SparseArray f40879i = new SparseArray();
    public final SparseArray f40880j = new SparseArray();
    public final SparseArray f40881k = new SparseArray();
    public final SparseArray f40882l = new SparseArray();
    public final SparseArray f40883m = new SparseArray();
    public final SparseArray f40884n = new SparseArray();
    public final SparseArray f40885o = new SparseArray();
    public final SparseArray f40886p = new SparseArray();
    public final SparseArray f40887q = new SparseArray();
    public final SparseArray f40888r = new SparseArray();
    public final SparseArray f40889s = new SparseArray();
    public final SparseArray f40890t = new SparseArray();
    public final SparseArray f40891u = new SparseArray();
    public final SparseArray v = new SparseArray();
    public final SparseArray f40892w = new SparseArray();
    public final SparseArray f40893x = new SparseArray();
    public final SparseArray f40894y = new SparseArray();
    public final SparseArray f40895z = new SparseArray();
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
