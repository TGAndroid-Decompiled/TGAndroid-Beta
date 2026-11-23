package t1;

import android.widget.EditText;
import java.lang.ref.WeakReference;
public final class h extends androidx.emoji2.text.i {
    public final WeakReference f57544a;

    public h(EditText editText) {
        this.f57544a = new WeakReference(editText);
    }

    @Override
    public final void a() {
        i.a((EditText) this.f57544a.get(), 1);
    }
}
