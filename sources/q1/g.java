package q1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
import w7.l6;
public final class g extends l6 {
    public final f f44116a;

    public g(TextView textView) {
        this.f44116a = new f(textView);
    }

    @Override
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        boolean z10;
        if (l.f1349j != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return inputFilterArr;
        }
        return this.f44116a.a(inputFilterArr);
    }

    @Override
    public final void b(boolean z10) {
        boolean z11;
        if (l.f1349j != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return;
        }
        this.f44116a.b(z10);
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        f fVar = this.f44116a;
        if (l.f1349j != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            fVar.f44115c = z10;
        } else {
            fVar.c(z10);
        }
    }
}
