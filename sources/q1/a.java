package q1;

import android.text.Editable;
import androidx.emoji2.text.t;
public final class a extends Editable.Factory {
    public static final Object f41378a = new Object();
    public static volatile a f41379b;
    public static Class f41380c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f41380c;
        if (cls != null) {
            return new t(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }
}
