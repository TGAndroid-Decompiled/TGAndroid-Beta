package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f42642a;
    public final c f42643b;
    public final int f42644c;

    public a(int i10, c cVar, int i11) {
        this.f42642a = i10;
        this.f42643b = cVar;
        this.f42644c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f42642a);
        this.f42643b.f42651a.performAction(this.f42644c, bundle);
    }
}
