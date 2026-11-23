package t1;

import android.text.Editable;
import androidx.emoji2.text.v;
public final class a extends Editable.Factory {
    public static final Object f57564a = new Object();
    public static volatile a f57565b;
    public static Class f57566c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f57566c;
        if (cls != null) {
            return new v(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
