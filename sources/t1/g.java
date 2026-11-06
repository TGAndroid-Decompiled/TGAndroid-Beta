package t1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
import c8.gc;
public final class g extends gc {
    public final f f55273a;

    public g(TextView textView) {
        this.f55273a = new f(textView);
    }

    @Override
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        boolean z9;
        if (l.f2309j != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return inputFilterArr;
        }
        return this.f55273a.a(inputFilterArr);
    }

    @Override
    public final void b(boolean z9) {
        boolean z10;
        if (l.f2309j != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        this.f55273a.b(z9);
    }

    @Override
    public final void c(boolean z9) {
        boolean z10;
        f fVar = this.f55273a;
        if (l.f2309j != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            fVar.f55272c = z9;
        } else {
            fVar.c(z9);
        }
    }
}
