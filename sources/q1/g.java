package q1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
import k7.l6;
public final class g extends l6 {
    public final f f44464a;

    public g(TextView textView) {
        this.f44464a = new f(textView);
    }

    @Override
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        boolean z4;
        if (l.f834j != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return inputFilterArr;
        }
        return this.f44464a.a(inputFilterArr);
    }

    @Override
    public final void b(boolean z4) {
        boolean z10;
        if (l.f834j != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        this.f44464a.b(z4);
    }

    @Override
    public final void c(boolean z4) {
        boolean z10;
        f fVar = this.f44464a;
        if (l.f834j != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            fVar.f44463c = z4;
        } else {
            fVar.c(z4);
        }
    }
}
