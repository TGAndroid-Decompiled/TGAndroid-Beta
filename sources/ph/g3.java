package ph;

import android.view.View;
import android.widget.TextView;
public final class g3 implements View.OnLayoutChangeListener {
    public final int f41714a;
    public final Object f41715b;

    public g3(Object obj, int i10) {
        this.f41714a = i10;
        this.f41715b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f41714a) {
            case 0:
                ((i3) this.f41715b).d();
                return;
            default:
                xf.c cVar = (xf.c) this.f41715b;
                TextView textView = cVar.f47026c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f47025b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
        }
    }
}
