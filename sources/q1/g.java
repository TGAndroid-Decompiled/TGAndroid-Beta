package q1;

import a8.nf;
import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
public final class g extends nf {
    public final f f46907a;

    public g(TextView textView) {
        this.f46907a = new f(textView);
    }

    @Override
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        boolean z10;
        if (l.f2555j != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return inputFilterArr;
        }
        return this.f46907a.a(inputFilterArr);
    }

    @Override
    public final void b(boolean z10) {
        boolean z11;
        if (l.f2555j != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return;
        }
        this.f46907a.b(z10);
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        f fVar = this.f46907a;
        if (l.f2555j != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            fVar.f46906c = z10;
        } else {
            fVar.c(z10);
        }
    }
}
