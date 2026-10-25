package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f47638a;
    public final d f47639b;
    public final int f47640c;

    public a(int i10, d dVar, int i11) {
        this.f47638a = i10;
        this.f47639b = dVar;
        this.f47640c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f47638a);
        this.f47639b.f47650a.performAction(this.f47640c, bundle);
    }
}
