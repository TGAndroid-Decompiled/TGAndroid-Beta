package t1;

import android.widget.EditText;
import java.lang.ref.WeakReference;
public final class h extends androidx.emoji2.text.i {
    public final WeakReference f55250a;

    public h(EditText editText) {
        this.f55250a = new WeakReference(editText);
    }

    @Override
    public final void a() {
        i.a((EditText) this.f55250a.get(), 1);
    }
}
