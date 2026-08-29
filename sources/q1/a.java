package q1;

import android.text.Editable;
import androidx.emoji2.text.t;
public final class a extends Editable.Factory {
    public static final Object f46196a = new Object();
    public static volatile a f46197b;
    public static Class f46198c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f46198c;
        if (cls != null) {
            return new t(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }
}
