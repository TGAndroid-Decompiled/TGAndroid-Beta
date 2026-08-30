package zg;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.mq;
public abstract class a {
    public static final SparseArray f47433a = new SparseArray(6);

    public static SpannableStringBuilder a(int i10, CharSequence charSequence, boolean z4) {
        SpannableStringBuilder spannableStringBuilder;
        if (charSequence instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        if (z4) {
            spannableStringBuilder.insert(0, (CharSequence) "* \u2068");
        } else {
            spannableStringBuilder.insert(0, (CharSequence) "* ");
        }
        SparseArray sparseArray = f47433a;
        mq mqVar = (mq) sparseArray.get(i10);
        if (mqVar == null) {
            mqVar = new mq(i10, 0);
            mqVar.setColorKey(j6.il);
            sparseArray.put(i10, mqVar);
        }
        spannableStringBuilder.setSpan(mqVar, 0, 1, 33);
        if (z4) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
