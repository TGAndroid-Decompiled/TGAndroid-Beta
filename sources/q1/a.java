package q1;

import android.text.Editable;
import androidx.emoji2.text.t;
public final class a extends Editable.Factory {
    public static final Object f41351a = new Object();
    public static volatile a f41352b;
    public static Class f41353c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f41353c;
        if (cls != null) {
            return new t(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }
}
