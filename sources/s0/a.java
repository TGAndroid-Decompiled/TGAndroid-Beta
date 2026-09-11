package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f45675a;
    public final c f45676b;
    public final int f45677c;

    public a(int i10, c cVar, int i11) {
        this.f45675a = i10;
        this.f45676b = cVar;
        this.f45677c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f45675a);
        this.f45676b.f45685a.performAction(this.f45677c, bundle);
    }
}
