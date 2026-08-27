package q1;

import android.widget.EditText;
import java.lang.ref.WeakReference;

public final class h extends androidx.emoji2.text.i {

    public final WeakReference f46074a;

    public h(EditText editText) {
        this.f46074a = new WeakReference(editText);
    }

    @Override
    public final void a() {
        i.a((EditText) this.f46074a.get(), 1);
    }
}
