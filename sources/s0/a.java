package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f47620a;
    public final d f47621b;
    public final int f47622c;

    public a(int i10, d dVar, int i11) {
        this.f47620a = i10;
        this.f47621b = dVar;
        this.f47622c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f47620a);
        this.f47621b.f47631a.performAction(this.f47622c, bundle);
    }
}
