package q1;

import android.text.Editable;
import androidx.emoji2.text.t;
public final class a extends Editable.Factory {
    public static final Object f45944a = new Object();
    public static volatile a f45945b;
    public static Class f45946c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f45946c;
        if (cls != null) {
            return new t(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }
}
