package s0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a extends ClickableSpan {
    public final int f45865a;
    public final c f45866b;
    public final int f45867c;

    public a(int i10, c cVar, int i11) {
        this.f45865a = i10;
        this.f45866b = cVar;
        this.f45867c = i11;
    }

    @Override
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f45865a);
        this.f45866b.f45874a.performAction(this.f45867c, bundle);
    }
}
