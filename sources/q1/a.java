package q1;

import android.text.Editable;
import androidx.emoji2.text.t;
public final class a extends Editable.Factory {
    public static final Object f41366a = new Object();
    public static volatile a f41367b;
    public static Class f41368c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f41368c;
        if (cls != null) {
            return new t(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }
}
