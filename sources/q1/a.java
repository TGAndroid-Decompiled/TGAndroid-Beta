package q1;

import android.text.Editable;
import androidx.emoji2.text.u;
public final class a extends Editable.Factory {
    public static final Object f40454a = new Object();
    public static volatile a f40455b;
    public static Class f40456c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f40456c;
        if (cls != null) {
            return new u(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }
}
