package q1;

import android.widget.EditText;
import java.lang.ref.WeakReference;
public final class h extends androidx.emoji2.text.i {
    public final WeakReference f41410a;

    public h(EditText editText) {
        this.f41410a = new WeakReference(editText);
    }

    @Override
    public final void a() {
        i.a((EditText) this.f41410a.get(), 1);
    }
}
