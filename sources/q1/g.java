package q1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
import h7.n6;

public final class g extends n6 {

    public final f f46073a;

    public g(TextView textView) {
        this.f46073a = new f(textView);
    }

    @Override
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return !(l.f1358j != null) ? inputFilterArr : this.f46073a.a(inputFilterArr);
    }

    @Override
    public final void b(boolean z10) {
        if (l.f1358j != null) {
            this.f46073a.b(z10);
        }
    }

    @Override
    public final void c(boolean z10) {
        f fVar = this.f46073a;
        if (l.f1358j != null) {
            fVar.c(z10);
        } else {
            fVar.f46072c = z10;
        }
    }
}
