package t1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
import c8.mc;
public final class h extends mc {
    public final g f57657a;

    public h(TextView textView) {
        this.f57657a = new g(textView);
    }

    @Override
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        boolean z10;
        if (l.f2223j != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return inputFilterArr;
        }
        return this.f57657a.a(inputFilterArr);
    }

    @Override
    public final void b(boolean z10) {
        boolean z11;
        if (l.f2223j != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return;
        }
        this.f57657a.b(z10);
    }

    @Override
    public final void c(boolean z10) {
        boolean z11;
        g gVar = this.f57657a;
        if (l.f2223j != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            gVar.f57656c = z10;
        } else {
            gVar.c(z10);
        }
    }
}
