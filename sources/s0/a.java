package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f42899a;
    public final d f42900b;
    public final int f42901c;

    public a(int i10, d dVar, int i11) {
        this.f42899a = i10;
        this.f42900b = dVar;
        this.f42901c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f42899a);
        this.f42900b.f42909a.performAction(this.f42901c, bundle);
    }
}
