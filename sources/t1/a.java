package t1;

import android.text.Editable;
import androidx.emoji2.text.u;
public final class a extends Editable.Factory {
    public static final Object f55351a = new Object();
    public static volatile a f55352b;
    public static Class f55353c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f55353c;
        if (cls != null) {
            return new u(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
