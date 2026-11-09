package t1;

import android.widget.EditText;
import java.lang.ref.WeakReference;
public final class h extends androidx.emoji2.text.i {
    public final WeakReference f55379a;

    public h(EditText editText) {
        this.f55379a = new WeakReference(editText);
    }

    @Override
    public final void a() {
        i.a((EditText) this.f55379a.get(), 1);
    }
}
