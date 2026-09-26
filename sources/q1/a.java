package q1;

import android.text.Editable;
import androidx.emoji2.text.t;
public final class a extends Editable.Factory {
    public static final Object f41365a = new Object();
    public static volatile a f41366b;
    public static Class f41367c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f41367c;
        if (cls != null) {
            return new t(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }
}
