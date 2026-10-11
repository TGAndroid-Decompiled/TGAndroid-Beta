package q1;

import android.text.Editable;
import androidx.emoji2.text.t;
public final class a extends Editable.Factory {
    public static final Object f46009a = new Object();
    public static volatile a f46010b;
    public static Class f46011c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f46011c;
        if (cls != null) {
            return new t(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }
}
