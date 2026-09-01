package qh;

import android.view.View;
import android.widget.TextView;
public final class g3 implements View.OnLayoutChangeListener {
    public final int f45356a;
    public final Object f45357b;

    public g3(Object obj, int i10) {
        this.f45356a = i10;
        this.f45357b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f45356a) {
            case 0:
                ((i3) this.f45357b).d();
                return;
            default:
                yf.c cVar = (yf.c) this.f45357b;
                TextView textView = cVar.f50900c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f50899b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
        }
    }
}
