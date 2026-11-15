package t1;

import android.text.Editable;
import androidx.emoji2.text.v;
public final class a extends Editable.Factory {
    public static final Object f56945a = new Object();
    public static volatile a f56946b;
    public static Class f56947c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f56947c;
        if (cls != null) {
            return new v(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
