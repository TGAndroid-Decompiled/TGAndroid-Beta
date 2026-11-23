package t1;

import android.widget.EditText;
import java.lang.ref.WeakReference;
public final class i extends androidx.emoji2.text.i {
    public final WeakReference f57658a;

    public i(EditText editText) {
        this.f57658a = new WeakReference(editText);
    }

    @Override
    public final void a() {
        j.a((EditText) this.f57658a.get(), 1);
    }
}
