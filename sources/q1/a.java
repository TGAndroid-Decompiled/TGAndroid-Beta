package q1;

import android.text.Editable;
import androidx.emoji2.text.u;
public final class a extends Editable.Factory {
    public static final Object f44129a = new Object();
    public static volatile a f44130b;
    public static Class f44131c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f44131c;
        if (cls != null) {
            return new u(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }
}
