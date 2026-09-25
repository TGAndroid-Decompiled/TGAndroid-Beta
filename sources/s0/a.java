package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f42900a;
    public final d f42901b;
    public final int f42902c;

    public a(int i10, d dVar, int i11) {
        this.f42900a = i10;
        this.f42901b = dVar;
        this.f42902c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f42900a);
        this.f42901b.f42910a.performAction(this.f42902c, bundle);
    }
}
