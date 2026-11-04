package ph;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.wp;
public abstract class a {
    public static final SparseArray f53522a = new SparseArray(6);

    public static SpannableStringBuilder a(int i3, CharSequence charSequence, boolean z10) {
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
        SparseArray sparseArray = f53522a;
        wp wpVar = (wp) sparseArray.get(i3);
        if (wpVar == null) {
            wpVar = new wp(i3, 0);
            wpVar.a(k6.Wl);
            sparseArray.put(i3, wpVar);
        }
        spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
        if (z10) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
