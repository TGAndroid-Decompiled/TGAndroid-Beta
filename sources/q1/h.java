package q1;

import android.widget.EditText;
import java.lang.ref.WeakReference;
public final class h extends androidx.emoji2.text.i {
    public final WeakReference f44759a;

    public h(EditText editText) {
        this.f44759a = new WeakReference(editText);
    }

    @Override
    public final void a() {
        i.a((EditText) this.f44759a.get(), 1);
    }
}
