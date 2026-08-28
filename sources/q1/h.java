package q1;

import android.widget.EditText;
import java.lang.ref.WeakReference;
public final class h extends androidx.emoji2.text.h {
    public final WeakReference f45910a;

    public h(EditText editText) {
        this.f45910a = new WeakReference(editText);
    }

    @Override
    public final void a() {
        i.a((EditText) this.f45910a.get(), 1);
    }
}
