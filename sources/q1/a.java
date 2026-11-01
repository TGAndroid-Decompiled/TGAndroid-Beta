package q1;

import android.text.Editable;
import androidx.emoji2.text.u;
public final class a extends Editable.Factory {
    public static final Object f45402a = new Object();
    public static volatile a f45403b;
    public static Class f45404c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f45404c;
        if (cls != null) {
            return new u(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
