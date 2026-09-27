package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f42944a;
    public final d f42945b;
    public final int f42946c;

    public a(int i10, d dVar, int i11) {
        this.f42944a = i10;
        this.f42945b = dVar;
        this.f42946c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f42944a);
        this.f42945b.f42954a.performAction(this.f42946c, bundle);
    }
}
