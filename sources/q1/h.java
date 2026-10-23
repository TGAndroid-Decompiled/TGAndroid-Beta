package q1;

import android.widget.EditText;
import java.lang.ref.WeakReference;
public final class h extends androidx.emoji2.text.i {
    public final WeakReference f44760a;

    public h(EditText editText) {
        this.f44760a = new WeakReference(editText);
    }

    @Override
    public final void a() {
        i.a((EditText) this.f44760a.get(), 1);
    }
}
