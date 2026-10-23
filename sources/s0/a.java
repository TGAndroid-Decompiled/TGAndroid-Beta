package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f45869a;
    public final c f45870b;
    public final int f45871c;

    public a(int i10, c cVar, int i11) {
        this.f45869a = i10;
        this.f45870b = cVar;
        this.f45871c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f45869a);
        this.f45870b.f45878a.performAction(this.f45871c, bundle);
    }
}
