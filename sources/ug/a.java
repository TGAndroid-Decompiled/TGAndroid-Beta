package ug;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.eq;
public abstract class a {
    public static final SparseArray f48229a = new SparseArray(6);

    public static SpannableStringBuilder a(int i9, CharSequence charSequence, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        if (charSequence instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        if (z10) {
            spannableStringBuilder.insert(0, (CharSequence) "* \u2068");
        } else {
            spannableStringBuilder.insert(0, (CharSequence) "* ");
        }
        SparseArray sparseArray = f48229a;
        eq eqVar = (eq) sparseArray.get(i9);
        if (eqVar == null) {
            eqVar = new eq(i9, 0);
            eqVar.setColorKey(f6.il);
            sparseArray.put(i9, eqVar);
        }
        spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
        if (z10) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
