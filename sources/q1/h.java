package q1;

import android.widget.EditText;
import java.lang.ref.WeakReference;
public final class h extends androidx.emoji2.text.i {
    public final WeakReference f42994a;

    public h(EditText editText) {
        this.f42994a = new WeakReference(editText);
    }

    @Override
    public final void a() {
        i.a((EditText) this.f42994a.get(), 1);
    }
}
