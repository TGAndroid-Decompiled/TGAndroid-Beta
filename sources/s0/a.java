package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f47807a;
    public final d f47808b;
    public final int f47809c;

    public a(int i10, d dVar, int i11) {
        this.f47807a = i10;
        this.f47808b = dVar;
        this.f47809c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f47807a);
        this.f47808b.f47818a.performAction(this.f47809c, bundle);
    }
}
