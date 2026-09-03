package q1;

import android.text.Editable;
import androidx.emoji2.text.u;
public final class a extends Editable.Factory {
    public static final Object f44450a = new Object();
    public static volatile a f44451b;
    public static Class f44452c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f44452c;
        if (cls != null) {
            return new u(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }
}
