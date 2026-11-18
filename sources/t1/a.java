package t1;

import android.text.Editable;
import androidx.emoji2.text.v;
public final class a extends Editable.Factory {
    public static final Object f57521a = new Object();
    public static volatile a f57522b;
    public static Class f57523c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f57523c;
        if (cls != null) {
            return new v(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
