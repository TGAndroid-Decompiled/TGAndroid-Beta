package q1;

import android.text.Editable;
import androidx.emoji2.text.t;
public final class a extends Editable.Factory {
    public static final Object f41464a = new Object();
    public static volatile a f41465b;
    public static Class f41466c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f41466c;
        if (cls != null) {
            return new t(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }
}
