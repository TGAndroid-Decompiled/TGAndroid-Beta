package q1;

import android.text.Editable;
import androidx.emoji2.text.t;
public final class a extends Editable.Factory {
    public static final Object f44730a = new Object();
    public static volatile a f44731b;
    public static Class f44732c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f44732c;
        if (cls != null) {
            return new t(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }
}
