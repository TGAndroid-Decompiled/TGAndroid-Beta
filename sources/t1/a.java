package t1;

import android.text.Editable;
import androidx.emoji2.text.u;
public final class a extends Editable.Factory {
    public static final Object f55235a = new Object();
    public static volatile a f55236b;
    public static Class f55237c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f55237c;
        if (cls != null) {
            return new u(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
