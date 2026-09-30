package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f42901a;
    public final d f42902b;
    public final int f42903c;

    public a(int i10, d dVar, int i11) {
        this.f42901a = i10;
        this.f42902b = dVar;
        this.f42903c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f42901a);
        this.f42902b.f42911a.performAction(this.f42903c, bundle);
    }
}
