package t1;

import android.widget.EditText;
import java.lang.ref.WeakReference;
public final class h extends androidx.emoji2.text.i {
    public final WeakReference f55274a;

    public h(EditText editText) {
        this.f55274a = new WeakReference(editText);
    }

    @Override
    public final void a() {
        i.a((EditText) this.f55274a.get(), 1);
    }
}
