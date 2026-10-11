package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f47666a;
    public final d f47667b;
    public final int f47668c;

    public a(int i10, d dVar, int i11) {
        this.f47666a = i10;
        this.f47667b = dVar;
        this.f47668c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f47666a);
        this.f47667b.f47677a.performAction(this.f47668c, bundle);
    }
}
