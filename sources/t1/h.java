package t1;

import android.widget.EditText;
import java.lang.ref.WeakReference;
public final class h extends androidx.emoji2.text.i {
    public final WeakReference f56960a;

    public h(EditText editText) {
        this.f56960a = new WeakReference(editText);
    }

    @Override
    public final void a() {
        i.a((EditText) this.f56960a.get(), 1);
    }
}
