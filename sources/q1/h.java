package q1;

import android.widget.EditText;
import java.lang.ref.WeakReference;
public final class h extends androidx.emoji2.text.i {
    public final WeakReference f46908a;

    public h(EditText editText) {
        this.f46908a = new WeakReference(editText);
    }

    @Override
    public final void a() {
        i.a((EditText) this.f46908a.get(), 1);
    }
}
