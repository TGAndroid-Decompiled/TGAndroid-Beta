package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    public final int f47646a;

    public final c f47647b;

    public final int f47648c;

    public a(int i10, c cVar, int i11) {
        this.f47646a = i10;
        this.f47647b = cVar;
        this.f47648c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f47646a);
        this.f47647b.f47656a.performAction(this.f47648c, bundle);
    }
}
