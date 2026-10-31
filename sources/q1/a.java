package q1;

import android.text.Editable;
import androidx.emoji2.text.u;
public final class a extends Editable.Factory {
    public static final Object f45391a = new Object();
    public static volatile a f45392b;
    public static Class f45393c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f45393c;
        if (cls != null) {
            return new u(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
