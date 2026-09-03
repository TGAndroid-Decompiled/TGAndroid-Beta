package qh;

import android.view.View;
import android.widget.TextView;
public final class f3 implements View.OnLayoutChangeListener {
    public final int f45337a;
    public final Object f45338b;

    public f3(Object obj, int i10) {
        this.f45337a = i10;
        this.f45338b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f45337a) {
            case 0:
                ((h3) this.f45338b).d();
                return;
            default:
                yf.c cVar = (yf.c) this.f45338b;
                TextView textView = cVar.f50936c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f50935b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
        }
    }
}
