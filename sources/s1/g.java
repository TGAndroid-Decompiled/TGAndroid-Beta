package s1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
import x7.p;
public final class g extends p {
    public final f f54586a;

    public g(TextView textView) {
        this.f54586a = new f(textView);
    }

    @Override
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        boolean z10;
        if (l.f1732j != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return inputFilterArr;
        }
        return this.f54586a.a(inputFilterArr);
    }

    @Override
    public final void b(boolean z10) {
        boolean z11;
        if (l.f1732j != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return;
        }
        this.f54586a.b(z10);
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        f fVar = this.f54586a;
        if (l.f1732j != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            fVar.f54585c = z10;
        } else {
            fVar.c(z10);
        }
    }
}
