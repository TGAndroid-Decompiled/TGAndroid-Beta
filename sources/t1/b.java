package t1;

import android.text.Editable;
import androidx.emoji2.text.v;
public final class b extends Editable.Factory {
    public static final Object f57643a = new Object();
    public static volatile b f57644b;
    public static Class f57645c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f57645c;
        if (cls != null) {
            return new v(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
