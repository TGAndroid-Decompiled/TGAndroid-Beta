package t1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
import c8.lc;
public final class g extends lc {
    public final f f57578a;

    public g(TextView textView) {
        this.f57578a = new f(textView);
    }

    @Override
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        boolean z10;
        if (l.f2271j != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return inputFilterArr;
        }
        return this.f57578a.a(inputFilterArr);
    }

    @Override
    public final void b(boolean z10) {
        boolean z11;
        if (l.f2271j != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return;
        }
        this.f57578a.b(z10);
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        f fVar = this.f57578a;
        if (l.f2271j != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            fVar.f57577c = z10;
        } else {
            fVar.c(z10);
        }
    }
}
