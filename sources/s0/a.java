package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f42934a;
    public final d f42935b;
    public final int f42936c;

    public a(int i10, d dVar, int i11) {
        this.f42934a = i10;
        this.f42935b = dVar;
        this.f42936c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f42934a);
        this.f42935b.f42944a.performAction(this.f42936c, bundle);
    }
}
