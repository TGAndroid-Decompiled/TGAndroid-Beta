package q1;

import android.text.Editable;
import androidx.emoji2.text.t;
public final class a extends Editable.Factory {
    public static final Object f41337a = new Object();
    public static volatile a f41338b;
    public static Class f41339c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f41339c;
        if (cls != null) {
            return new t(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }
}
