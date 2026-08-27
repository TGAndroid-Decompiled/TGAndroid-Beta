package q1;

import android.text.Editable;
import androidx.emoji2.text.t;

public final class a extends Editable.Factory {

    public static final Object f46059a = new Object();

    public static volatile a f46060b;

    public static Class f46061c;

    @Override
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f46061c;
        return cls != null ? new t(charSequence, cls) : super.newEditable(charSequence);
    }
}
