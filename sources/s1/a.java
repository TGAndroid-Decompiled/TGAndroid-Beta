package s1;

import android.text.Editable;
import androidx.emoji2.text.v;
public final class a extends Editable.Factory {
    public static final Object f54572a = new Object();
    public static volatile a f54573b;
    public static Class f54574c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f54574c;
        if (cls != null) {
            return new v(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
