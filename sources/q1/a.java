package q1;

import android.text.Editable;
import androidx.emoji2.text.t;
public final class a extends Editable.Factory {
    public static final Object f45895a = new Object();
    public static volatile a f45896b;
    public static Class f45897c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f45897c;
        if (cls != null) {
            return new t(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }
}
