package q1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
import w7.q6;
public final class g extends q6 {
    public final f f44751a;

    public g(TextView textView) {
        this.f44751a = new f(textView);
    }

    @Override
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        boolean z10;
        if (l.f2525j != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return inputFilterArr;
        }
        return this.f44751a.a(inputFilterArr);
    }

    @Override
    public final void b(boolean z10) {
        boolean z11;
        if (l.f2525j != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return;
        }
        this.f44751a.b(z10);
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        f fVar = this.f44751a;
        if (l.f2525j != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            fVar.f44750c = z10;
        } else {
            fVar.c(z10);
        }
    }
}
