package q1;

import android.widget.EditText;
import java.lang.ref.WeakReference;
public final class h extends androidx.emoji2.text.i {
    public final WeakReference f44752a;

    public h(EditText editText) {
        this.f44752a = new WeakReference(editText);
    }

    @Override
    public final void a() {
        i.a((EditText) this.f44752a.get(), 1);
    }
}
