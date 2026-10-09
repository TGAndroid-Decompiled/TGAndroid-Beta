package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f47576a;
    public final d f47577b;
    public final int f47578c;

    public a(int i10, d dVar, int i11) {
        this.f47576a = i10;
        this.f47577b = dVar;
        this.f47578c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f47576a);
        this.f47577b.f47587a.performAction(this.f47578c, bundle);
    }
}
