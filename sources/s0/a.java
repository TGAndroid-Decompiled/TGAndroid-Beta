package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f47841a;
    public final c f47842b;
    public final int f47843c;

    public a(int i10, c cVar, int i11) {
        this.f47841a = i10;
        this.f47842b = cVar;
        this.f47843c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f47841a);
        this.f47842b.f47850a.performAction(this.f47843c, bundle);
    }
}
