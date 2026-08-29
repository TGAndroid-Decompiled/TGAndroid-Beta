package xg;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.iq;
public abstract class a {
    public static final SparseArray f50152a = new SparseArray(6);

    public static SpannableStringBuilder a(int i10, CharSequence charSequence, boolean z10) {
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
        SparseArray sparseArray = f50152a;
        iq iqVar = (iq) sparseArray.get(i10);
        if (iqVar == null) {
            iqVar = new iq(i10, 0);
            iqVar.setColorKey(g6.il);
            sparseArray.put(i10, iqVar);
        }
        spannableStringBuilder.setSpan(iqVar, 0, 1, 33);
        if (z10) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
