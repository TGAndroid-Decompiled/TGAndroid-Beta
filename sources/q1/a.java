package q1;

import android.text.Editable;
import androidx.emoji2.text.t;
public final class a extends Editable.Factory {
    public static final Object f44729a = new Object();
    public static volatile a f44730b;
    public static Class f44731c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f44731c;
        if (cls != null) {
            return new t(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }
}
