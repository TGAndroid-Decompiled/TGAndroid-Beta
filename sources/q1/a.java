package q1;

import android.text.Editable;
import androidx.emoji2.text.u;
public final class a extends Editable.Factory {
    public static final Object f42708a = new Object();
    public static volatile a f42709b;
    public static Class f42710c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f42710c;
        if (cls != null) {
            return new u(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }
}
