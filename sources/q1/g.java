package q1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.k;
import g7.q6;
public final class g extends q6 {
    public final f f45909a;

    public g(TextView textView) {
        this.f45909a = new f(textView);
    }

    @Override
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        boolean z10;
        if (k.f856j != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return inputFilterArr;
        }
        return this.f45909a.a(inputFilterArr);
    }

    @Override
    public final void b(boolean z10) {
        boolean z11;
        if (k.f856j != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return;
        }
        this.f45909a.b(z10);
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        f fVar = this.f45909a;
        if (k.f856j != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            fVar.f45908c = z10;
        } else {
            fVar.c(z10);
        }
    }
}
