package q1;

import android.text.Editable;
import androidx.emoji2.text.t;
public final class a extends Editable.Factory {
    public static final Object f41364a = new Object();
    public static volatile a f41365b;
    public static Class f41366c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f41366c;
        if (cls != null) {
            return new t(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }
}
