package s1;

import android.widget.EditText;
import java.lang.ref.WeakReference;
public final class h extends androidx.emoji2.text.i {
    public final WeakReference f54587a;

    public h(EditText editText) {
        this.f54587a = new WeakReference(editText);
    }

    @Override
    public final void a() {
        i.a((EditText) this.f54587a.get(), 1);
    }
}
