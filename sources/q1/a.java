package q1;

import android.text.Editable;
import androidx.emoji2.text.t;
public final class a extends Editable.Factory {
    public static final Object f45898a = new Object();
    public static volatile a f45899b;
    public static Class f45900c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f45900c;
        if (cls != null) {
            return new t(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }
}
