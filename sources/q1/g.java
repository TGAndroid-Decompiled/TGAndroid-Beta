package q1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
import w7.n6;
public final class g extends n6 {
    public final f f42993a;

    public g(TextView textView) {
        this.f42993a = new f(textView);
    }

    @Override
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        boolean z10;
        if (l.f1494j != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return inputFilterArr;
        }
        return this.f42993a.a(inputFilterArr);
    }

    @Override
    public final void b(boolean z10) {
        boolean z11;
        if (l.f1494j != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return;
        }
        this.f42993a.b(z10);
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        f fVar = this.f42993a;
        if (l.f1494j != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            fVar.f42992c = z10;
        } else {
            fVar.c(z10);
        }
    }
}
